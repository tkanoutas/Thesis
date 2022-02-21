package jetbrains.mps.lang.editor.menus.contextAssistant.testExtendingLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.transformation.TransformationMenuBase;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.editor.menus.transformation.MenuLocations;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuItem;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuContext;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.editor.menus.MenuPart;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.editor.menus.SingleItemMenuPart;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.openapi.editor.menus.transformation.ActionItemBase;
import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;

public class Child_MoreNamedActions extends TransformationMenuBase {
  public Child_MoreNamedActions() {
    super(true);
  }
  private final Set<String> myLocations = SetSequence.fromSetAndArray(new HashSet<String>(), MenuLocations.CONTEXT_ASSISTANT);
  @Override
  public boolean isApplicableToLocation(@NotNull String location) {
    return SetSequence.fromSet(myLocations).contains(location);
  }

  @NotNull
  @Override
  public List<TransformationMenuItem> createMenuItems(@NotNull TransformationMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("contribution to the " + "named transformation menu " + "NamedMenu", new SNodePointer("r:1ed8add9-1a05-4a2d-a8ee-1a24e378c5f6(jetbrains.mps.lang.editor.menus.contextAssistant.testExtendingLanguage.editor)", "6497392201642278145")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }

  @Override
  @NotNull
  protected List<MenuPart<TransformationMenuItem, TransformationMenuContext>> getParts(TransformationMenuContext _context) {
    List<MenuPart<TransformationMenuItem, TransformationMenuContext>> result = new ArrayList<MenuPart<TransformationMenuItem, TransformationMenuContext>>();
    if (ListSequence.fromListAndArray(new ArrayList<String>(), MenuLocations.CONTEXT_ASSISTANT).contains(_context.getMenuLocation())) {
      result.add(new Child_MoreNamedActions.TMP_Action_9jyvr2_a0());
    }
    return result;
  }

  private class TMP_Action_9jyvr2_a0 extends SingleItemMenuPart<TransformationMenuItem, TransformationMenuContext> {
    @Nullable
    protected TransformationMenuItem createItem(TransformationMenuContext context) {
      return new Child_MoreNamedActions.TMP_Action_9jyvr2_a0.Item(context);
    }

    private class Item extends ActionItemBase {
      private final TransformationMenuContext _context;
      private final EditorMenuTraceInfo myEditorMenuTraceInfo;
      private Item(TransformationMenuContext context) {
        _context = context;
        _context.getEditorMenuTrace().pushTraceInfo();
        _context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("single item: " + getLabelText(""), new SNodePointer("r:1ed8add9-1a05-4a2d-a8ee-1a24e378c5f6(jetbrains.mps.lang.editor.menus.contextAssistant.testExtendingLanguage.editor)", "7050984401975122242")));
        myEditorMenuTraceInfo = _context.getEditorMenuTrace().getTraceInfo();
        context.getEditorMenuTrace().popTraceInfo();
      }

      @Nullable
      @Override
      public String getLabelText(String pattern) {
        return "contributed from extending language";
      }

      @Override
      public void execute(@NotNull String pattern) {
      }




      @Override
      public EditorMenuTraceInfo getTraceInfo() {
        return myEditorMenuTraceInfo;
      }
    }

  }
}
