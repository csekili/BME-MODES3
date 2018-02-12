package hu.bme.mit.inf.modes3.components.scheduler.main;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.model.RailRoadModel.Path;
import hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.model.RailRoadModel.RailRoadElement;
import hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.model.RailRoadModel.RailRoadModel;
import hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.model.RailRoadModel.RailRoadModelFactory;
import hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.model.RailRoadModel.RailRoadModelPackage;
import hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.model.RailRoadModel.Segment;
import hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Schedule;
import hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Scheduler;
import hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.SchedulerFactory;
import hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Station;
import hu.bme.mit.inf.safetylogic.patterns.ThreeConnectedRailRoadPartsMatcher;

public class Main {
	public static void main(String[] args) throws IOException, ViatraQueryException {
		// Magic is here
		RailRoadModelPackage.eINSTANCE.getClass();
		// SchedulerPackage.eINSTANCE.getClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("railroadmodel",
				new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("schedulermodel",
				new XMIResourceFactoryImpl());

		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(URI.createURI("model/instance.railroadmodel"), true);

		List<Path> paths = createAllPaths(resource);
		System.out.println(paths.size());

		RailRoadModel railroadModel = (RailRoadModel) resource.getContents().get(0);
		Scheduler scheduler = SchedulerFactory.eINSTANCE.createScheduler();
		Station station1 = SchedulerFactory.eINSTANCE.createStation();
		Segment segment = null;
		for (RailRoadElement element : railroadModel.getSections()) {
			if (element instanceof Segment) {
				segment = (Segment) element;
				break;
			}
		}
		station1.setPlace(segment);
		station1.setName(String.valueOf(segment.getId()));
		scheduler.getStations().add(station1);

		Schedule schedule = SchedulerFactory.eINSTANCE.createSchedule();
		scheduler.setSchedule(schedule);

		Resource resource2 = rs.createResource(URI.createURI("model/verygood.schedulermodel"));
		resource2.getContents().add(scheduler);
		//resource2.getContents().add(railroadModel);
		resource2.save(null);
		System.out.println("done :)");

		// RailRoadModel railroadModel2 = (RailRoadModel) resource.getContents().get(0);
		// Model2GML m2g = new Model2GML();
		// String text = m2g.transform(railroadModel2);

		// PrintWriter writer = new PrintWriter("model/visualisation.gml", "UTF-8");
		// writer.println(text);
		// writer.close();
	}

	private static List<Path> createAllPaths(Resource modelResource) throws ViatraQueryException {

		ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(modelResource));
		ThreeConnectedRailRoadPartsMatcher matcher = ThreeConnectedRailRoadPartsMatcher.on(engine);

		List<Path> paths = ((RailRoadModel) modelResource.getContents().get(0)).getPaths();

		matcher.getAllMatches().stream().forEach(it -> {
			Path path = RailRoadModelFactory.eINSTANCE.createPath();
			path.setVia(it.getMiddle());
			path.setFrom(it.getOne());
			path.setTo(it.getOther());
			paths.add(path);
		});

		return paths;
	}
}
