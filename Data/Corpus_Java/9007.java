package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import jetbrains.mps.scope.Scope;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.behavior.SNodeOperation__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.core.behavior.ScopeProvider__BehaviorDescriptor;
import jetbrains.mps.lang.scopes.runtime.SimpleScope;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration__BehaviorDescriptor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class SelectInEditorOperation__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x329d4406465c63a0L, "jetbrains.mps.lang.editor.structure.SelectInEditorOperation");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Boolean> applicableToNode_id1653mnvAgrs = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("applicableToNode").modifiers(SModifiersImpl.create(9, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1653mnvAgrs").registry(REGISTRY).build();
  public static final SMethod<Boolean> applicableToLink_id1653mnvAgvK = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("applicableToLink").modifiers(SModifiersImpl.create(9, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1653mnvAgvK").registry(REGISTRY).build();
  public static final SMethod<Scope> getScope_id52_Geb4QDV$ = new SMethodBuilder<Scope>(new SJavaCompoundTypeImpl(Scope.class)).name("getScope").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("52_Geb4QDV$").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SAbstractConcept>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));
  /*package*/ static final SMethod<Scope> getPropertyDeclarationScope_id3K0abI6bsqm = new SMethodBuilder<Scope>(new SJavaCompoundTypeImpl(Scope.class)).name("getPropertyDeclarationScope").modifiers(SModifiersImpl.create(0, AccessPrivileges.PRIVATE)).concept(CONCEPT).id("3K0abI6bsqm").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));
  public static final SMethod<Scope> getEditorCellIdScope_id3K0abI6bXeJ = new SMethodBuilder<Scope>(new SJavaCompoundTypeImpl(Scope.class)).name("getEditorCellIdScope").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("3K0abI6bXeJ").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(applicableToNode_id1653mnvAgrs, applicableToLink_id1653mnvAgvK, getScope_id52_Geb4QDV$, getPropertyDeclarationScope_id3K0abI6bsqm, getEditorCellIdScope_id3K0abI6bXeJ);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static boolean applicableToNode_id1653mnvAgrs(@NotNull SAbstractConcept __thisConcept__) {
    return true;
  }
  /*package*/ static boolean applicableToLink_id1653mnvAgvK(@NotNull SAbstractConcept __thisConcept__) {
    return true;
  }
  /*package*/ static Scope getScope_id52_Geb4QDV$(@NotNull SNode __thisNode__, SAbstractConcept kind, SNode child) {
    if (SConceptOperations.isExactly(SNodeOperations.asSConcept(kind), MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086bL, "jetbrains.mps.lang.structure.structure.PropertyDeclaration")) || SConceptOperations.isExactly(SNodeOperations.asSConcept(kind), MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x3c0028bb846a5817L, "jetbrains.mps.lang.editor.structure.EditorCellId"))) {
      {
        IMatchingPattern pattern_wbtxu4_a0a0c = HUtil.createMatchingPatternByConcept(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, "jetbrains.mps.lang.smodel.structure.SNodeType"));
        SNode coercedNode_wbtxu4_a0a0c = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(SNodeOperation__BehaviorDescriptor.getLeftExpression_idhEwJdGu.invoke(__thisNode__)), pattern_wbtxu4_a0a0c);
        if (coercedNode_wbtxu4_a0a0c != null) {
          if (SConceptOperations.isExactly(SNodeOperations.asSConcept(kind), MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086bL, "jetbrains.mps.lang.structure.structure.PropertyDeclaration"))) {
            return SelectInEditorOperation__BehaviorDescriptor.getPropertyDeclarationScope_id3K0abI6bsqm.invoke(__thisNode__, SLinkOperations.getTarget(coercedNode_wbtxu4_a0a0c, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, 0x1090e46ca51L, "concept")));
          }
          if (SConceptOperations.isExactly(SNodeOperations.asSConcept(kind), MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x3c0028bb846a5817L, "jetbrains.mps.lang.editor.structure.EditorCellId"))) {
            return SelectInEditorOperation__BehaviorDescriptor.getEditorCellIdScope_id3K0abI6bXeJ.invoke(__thisNode__, SLinkOperations.getTarget(coercedNode_wbtxu4_a0a0c, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f968b3caL, 0x1090e46ca51L, "concept")));
          }
        } else {
        }
      }
    }
    return ((Scope) ScopeProvider__BehaviorDescriptor.getScope_id52_Geb4QDV$.invoke0(__thisNode__, MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x33d23ee961a0cbf3L, "jetbrains.mps.lang.core.structure.ScopeProvider"), kind, child));
  }
  /*package*/ static Scope getPropertyDeclarationScope_id3K0abI6bsqm(@NotNull SNode __thisNode__, SNode concept) {
    return new SimpleScope(AbstractConceptDeclaration__BehaviorDescriptor.getPropertyDeclarations_idhEwILLM.invoke(concept)) {
      @Nullable
      public String getReferenceText(@NotNull SNode target) {
        return SPropertyOperations.getString(((SNode) target), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
      }
    };
  }
  /*package*/ static Scope getEditorCellIdScope_id3K0abI6bXeJ(@NotNull SNode __thisNode__, SNode concept) {
    return new EditorCellIdScope(SNodeOperations.getModel(__thisNode__), concept);
  }

  /*package*/ SelectInEditorOperation__BehaviorDescriptor() {
    super(REGISTRY);
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 2:
        return (T) ((Scope) getScope_id52_Geb4QDV$(node, (SAbstractConcept) parameters[0], (SNode) parameters[1]));
      case 3:
        return (T) ((Scope) getPropertyDeclarationScope_id3K0abI6bsqm(node, (SNode) parameters[0]));
      case 4:
        return (T) ((Scope) getEditorCellIdScope_id3K0abI6bXeJ(node, (SNode) parameters[0]));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        return (T) ((Boolean) applicableToNode_id1653mnvAgrs(concept));
      case 1:
        return (T) ((Boolean) applicableToLink_id1653mnvAgvK(concept));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }
}
