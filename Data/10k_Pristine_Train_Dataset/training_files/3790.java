package jetbrains.mps.lang.editor.menus.testMetaLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_TransformationFeature_Optional;
  private ConceptPresentation props_TransformationFeature_Required;
  private ConceptPresentation props_TransformationFeature_Unavailable;
  private ConceptPresentation props_TransformationLocation_Test;
  private ConceptPresentation props_TransformationLocation_WithFeatures;
  private ConceptPresentation props_TransformationLocation_WithoutFeatures;
  private ConceptPresentation props_TransformationMenu_Test;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.TransformationFeature_Optional:
        if (props_TransformationFeature_Optional == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("optional feature");
          cpb.rawPresentation("optional");
          props_TransformationFeature_Optional = cpb.create();
        }
        return props_TransformationFeature_Optional;
      case LanguageConceptSwitch.TransformationFeature_Required:
        if (props_TransformationFeature_Required == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("required feature");
          cpb.rawPresentation("required");
          props_TransformationFeature_Required = cpb.create();
        }
        return props_TransformationFeature_Required;
      case LanguageConceptSwitch.TransformationFeature_Unavailable:
        if (props_TransformationFeature_Unavailable == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("unavailable feature");
          cpb.rawPresentation("unavailable");
          props_TransformationFeature_Unavailable = cpb.create();
        }
        return props_TransformationFeature_Unavailable;
      case LanguageConceptSwitch.TransformationLocation_Test:
        if (props_TransformationLocation_Test == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("location for use in tests");
          cpb.rawPresentation("test location");
          props_TransformationLocation_Test = cpb.create();
        }
        return props_TransformationLocation_Test;
      case LanguageConceptSwitch.TransformationLocation_WithFeatures:
        if (props_TransformationLocation_WithFeatures == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("location with a required and an optional feature");
          props_TransformationLocation_WithFeatures = cpb.create();
        }
        return props_TransformationLocation_WithFeatures;
      case LanguageConceptSwitch.TransformationLocation_WithoutFeatures:
        if (props_TransformationLocation_WithoutFeatures == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("location with no available features");
          props_TransformationLocation_WithoutFeatures = cpb.create();
        }
        return props_TransformationLocation_WithoutFeatures;
      case LanguageConceptSwitch.TransformationMenu_Test:
        if (props_TransformationMenu_Test == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder(0x69068b7cba1f47fbL, 0xa4864981f42606e9L, 0x259f3121f598017fL);
          cpb.presentationByName();
          props_TransformationMenu_Test = cpb.create();
        }
        return props_TransformationMenu_Test;
    }
    return null;
  }
}