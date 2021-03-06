/**
 * Generated from platform:/resource/hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.patterns/src/main/java/hu/bme/mit/inf/safetylogic/patterns/DerivedFeatures.vql
 */
package hu.bme.mit.inf.safetylogic.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.safetylogic.patterns.CurrentlyConnectedMatch;
import hu.bme.mit.inf.safetylogic.patterns.CurrentlyConnectedMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;

/**
 * A pattern-specific query specification that can instantiate CurrentlyConnectedMatcher in a type-safe way.
 * 
 * @see CurrentlyConnectedMatcher
 * @see CurrentlyConnectedMatch
 * 
 */
@SuppressWarnings("all")
public final class CurrentlyConnectedQuerySpecification extends BaseGeneratedEMFQuerySpecification<CurrentlyConnectedMatcher> {
  private CurrentlyConnectedQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static CurrentlyConnectedQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected CurrentlyConnectedMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return CurrentlyConnectedMatcher.on(engine);
  }
  
  @Override
  public CurrentlyConnectedMatcher instantiate() throws ViatraQueryException {
    return CurrentlyConnectedMatcher.create();
  }
  
  @Override
  public CurrentlyConnectedMatch newEmptyMatch() {
    return CurrentlyConnectedMatch.newEmptyMatch();
  }
  
  @Override
  public CurrentlyConnectedMatch newMatch(final Object... parameters) {
    return CurrentlyConnectedMatch.newMatch((hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.model.RailRoadModel.RailRoadElement) parameters[0], (hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.model.RailRoadModel.RailRoadElement) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.safetylogic.patterns.util.CurrentlyConnectedQuerySpecification (visibility: PUBLIC, simpleName: CurrentlyConnectedQuerySpecification, identifier: hu.bme.mit.inf.safetylogic.patterns.util.CurrentlyConnectedQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.safetylogic.patterns.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.safetylogic.patterns.util.CurrentlyConnectedQuerySpecification (visibility: PUBLIC, simpleName: CurrentlyConnectedQuerySpecification, identifier: hu.bme.mit.inf.safetylogic.patterns.util.CurrentlyConnectedQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.safetylogic.patterns.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static CurrentlyConnectedQuerySpecification INSTANCE = new CurrentlyConnectedQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CurrentlyConnectedQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pThis = new PParameter("This", "hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.model.RailRoadModel.RailRoadElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hu.bme.mit.inf.safetylogic.railroadmodel", "RailRoadElement")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pConnectedTo = new PParameter("connectedTo", "hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.model.RailRoadModel.RailRoadElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hu.bme.mit.inf.safetylogic.railroadmodel", "RailRoadElement")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pThis, parameter_pConnectedTo);
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.safetylogic.patterns.currentlyConnected";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("This","connectedTo");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      {
          PBody body = new PBody(this);
          PVariable var_This = body.getOrCreateVariableByName("This");
          PVariable var_connectedTo = body.getOrCreateVariableByName("connectedTo");
          new TypeConstraint(body, Tuples.flatTupleOf(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "RailRoadElement")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_connectedTo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "RailRoadElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_This, parameter_pThis),
             new ExportedParameter(body, var_connectedTo, parameter_pConnectedTo)
          ));
          // 	Segment(This)
          new TypeConstraint(body, Tuples.flatTupleOf(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Segment")));
          // 	Segment.connectedTo(This, connectedTo)
          new TypeConstraint(body, Tuples.flatTupleOf(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Segment")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_This, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Segment", "connectedTo")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "RailRoadElement")));
          new Equality(body, var__virtual_0_, var_connectedTo);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_This = body.getOrCreateVariableByName("This");
          PVariable var_connectedTo = body.getOrCreateVariableByName("connectedTo");
          new TypeConstraint(body, Tuples.flatTupleOf(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "RailRoadElement")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_connectedTo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "RailRoadElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_This, parameter_pThis),
             new ExportedParameter(body, var_connectedTo, parameter_pConnectedTo)
          ));
          //  	Turnout(This)
          new TypeConstraint(body, Tuples.flatTupleOf(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Turnout")));
          // 	Turnout.top(This, connectedTo)
          new TypeConstraint(body, Tuples.flatTupleOf(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Turnout")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_This, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Turnout", "top")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "RailRoadElement")));
          new Equality(body, var__virtual_0_, var_connectedTo);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_This = body.getOrCreateVariableByName("This");
          PVariable var_connectedTo = body.getOrCreateVariableByName("connectedTo");
          new TypeConstraint(body, Tuples.flatTupleOf(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "RailRoadElement")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_connectedTo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "RailRoadElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_This, parameter_pThis),
             new ExportedParameter(body, var_connectedTo, parameter_pConnectedTo)
          ));
          // 	Turnout(This)
          new TypeConstraint(body, Tuples.flatTupleOf(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Turnout")));
          // 	Turnout.currentlyDivergent(This, true)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, true);
          new TypeConstraint(body, Tuples.flatTupleOf(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Turnout")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_This, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Turnout", "currentlyDivergent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "Boolean")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          // 	Turnout.divergent(This, connectedTo)
          new TypeConstraint(body, Tuples.flatTupleOf(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Turnout")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_This, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Turnout", "divergent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "RailRoadElement")));
          new Equality(body, var__virtual_2_, var_connectedTo);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_This = body.getOrCreateVariableByName("This");
          PVariable var_connectedTo = body.getOrCreateVariableByName("connectedTo");
          new TypeConstraint(body, Tuples.flatTupleOf(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "RailRoadElement")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_connectedTo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "RailRoadElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_This, parameter_pThis),
             new ExportedParameter(body, var_connectedTo, parameter_pConnectedTo)
          ));
          // 	Turnout(This)
          new TypeConstraint(body, Tuples.flatTupleOf(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Turnout")));
          // 	Turnout.currentlyDivergent(This, false)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, false);
          new TypeConstraint(body, Tuples.flatTupleOf(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Turnout")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_This, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Turnout", "currentlyDivergent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2003/XMLType", "Boolean")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          // 	Turnout.straight(This, connectedTo)
          new TypeConstraint(body, Tuples.flatTupleOf(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Turnout")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_This, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Turnout", "straight")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "RailRoadElement")));
          new Equality(body, var__virtual_2_, var_connectedTo);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_3_1() {
    return true;
  }
  
  private static boolean evaluateExpression_4_1() {
    return false;
  }
}
