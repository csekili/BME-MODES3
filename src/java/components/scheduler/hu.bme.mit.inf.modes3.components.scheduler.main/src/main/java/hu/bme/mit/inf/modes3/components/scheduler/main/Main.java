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
		Station station2 = SchedulerFactory.eINSTANCE.createStation();
		Station station3 = SchedulerFactory.eINSTANCE.createStation();
		Station station4 = SchedulerFactory.eINSTANCE.createStation();
		Station station5 = SchedulerFactory.eINSTANCE.createStation();
		Station station6 = SchedulerFactory.eINSTANCE.createStation();
		
		Segment segment1 = null;
		Segment segment2 = null;
		Segment segment3 = null;
		Segment segment4 = null;
		Segment segment5 = null;
		Segment segment6 = null;
		
		for (RailRoadElement element : railroadModel.getSections()) {
			if (element instanceof Segment) {
				if(element.getId()==25) segment1 = (Segment) element;
				if(element.getId()==22) segment2 = (Segment) element;
				if(element.getId()==13) segment3 = (Segment) element;
				if(element.getId()==07) segment4 = (Segment) element;
				if(element.getId()==18) segment5 = (Segment) element;
				if(element.getId()==19) segment6 = (Segment) element;
			}
		}
		station1.setPlace(segment1);
		station1.setName(String.valueOf(segment1.getId()));
		scheduler.getStations().add(station1);
		
		station2.setPlace(segment2);
		station2.setName(String.valueOf(segment2.getId()));
		scheduler.getStations().add(station2);
		
		station3.setPlace(segment3);
		station3.setName(String.valueOf(segment3.getId()));
		scheduler.getStations().add(station3);
		
		station4.setPlace(segment4);
		station4.setName(String.valueOf(segment4.getId()));
		scheduler.getStations().add(station4);
		
		station5.setPlace(segment5);
		station5.setName(String.valueOf(segment5.getId()));
		scheduler.getStations().add(station5);
		
		station6.setPlace(segment6);
		station6.setName(String.valueOf(segment6.getId()));
		scheduler.getStations().add(station6);
		

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
