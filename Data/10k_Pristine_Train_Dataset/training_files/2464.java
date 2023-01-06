package jetbrains.mps.debug.api;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.debug.api.breakpoints.ILocationBreakpoint;
import com.intellij.openapi.project.Project;

public class BreakpointCreator extends MultiTuple._2<_FunctionTypes._return_P2_E0<? extends Boolean, ? super SAbstractConcept, ? super SNode>, _FunctionTypes._return_P2_E0<? extends ILocationBreakpoint, ? super SNode, ? super Project>> {
  public BreakpointCreator() {
    super();
  }
  public BreakpointCreator(_FunctionTypes._return_P2_E0<? extends Boolean, ? super SAbstractConcept, ? super SNode> canCreate, _FunctionTypes._return_P2_E0<? extends ILocationBreakpoint, ? super SNode, ? super Project> create) {
    super(canCreate, create);
  }
  public _FunctionTypes._return_P2_E0<? extends Boolean, ? super SAbstractConcept, ? super SNode> canCreate(_FunctionTypes._return_P2_E0<? extends Boolean, ? super SAbstractConcept, ? super SNode> value) {
    return super._0(value);
  }
  public _FunctionTypes._return_P2_E0<? extends ILocationBreakpoint, ? super SNode, ? super Project> create(_FunctionTypes._return_P2_E0<? extends ILocationBreakpoint, ? super SNode, ? super Project> value) {
    return super._1(value);
  }
  public _FunctionTypes._return_P2_E0<? extends Boolean, ? super SAbstractConcept, ? super SNode> canCreate() {
    return super._0();
  }
  public _FunctionTypes._return_P2_E0<? extends ILocationBreakpoint, ? super SNode, ? super Project> create() {
    return super._1();
  }
}
