package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class KjsSkinSection extends Message {
  public static final List<KjsSkinPrimaryTab> DEFAULT_PRIMARY_TABS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<KjsSkinPrimaryTab> primary_tabs;
  
  public KjsSkinSection(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<KjsSkinPrimaryTab> list;
    if (paramBoolean == true) {
      list = paramBuilder.primary_tabs;
      if (list == null) {
        this.primary_tabs = DEFAULT_PRIMARY_TABS;
      } else {
        this.primary_tabs = Message.immutableCopyOf(list);
      } 
    } else {
      this.primary_tabs = Message.immutableCopyOf(((Builder)list).primary_tabs);
    } 
  }
  
  public static final class Builder extends Message.Builder<KjsSkinSection> {
    public List<KjsSkinPrimaryTab> primary_tabs;
    
    public Builder() {}
    
    public Builder(KjsSkinSection param1KjsSkinSection) {
      super(param1KjsSkinSection);
      if (param1KjsSkinSection == null)
        return; 
      this.primary_tabs = Message.copyOf(param1KjsSkinSection.primary_tabs);
    }
    
    public KjsSkinSection build(boolean param1Boolean) {
      return new KjsSkinSection(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
