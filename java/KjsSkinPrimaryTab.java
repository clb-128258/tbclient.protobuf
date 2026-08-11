package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class KjsSkinPrimaryTab extends Message {
  public static final Integer DEFAULT_ID;
  
  public static final String DEFAULT_NAME = "";
  
  public static final List<KjsSkinSecondaryTab> DEFAULT_SECONDARY_TABS = Collections.emptyList();
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<KjsSkinSecondaryTab> secondary_tabs;
  
  static {
    DEFAULT_ID = Integer.valueOf(0);
  }
  
  public KjsSkinPrimaryTab(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      List<KjsSkinSecondaryTab> list = paramBuilder.secondary_tabs;
      if (list == null) {
        this.secondary_tabs = DEFAULT_SECONDARY_TABS;
      } else {
        this.secondary_tabs = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
    } else {
      this.name = ((Builder)integer).name;
      this.secondary_tabs = Message.immutableCopyOf(((Builder)integer).secondary_tabs);
      this.id = ((Builder)integer).id;
    } 
  }
  
  public static final class Builder extends Message.Builder<KjsSkinPrimaryTab> {
    public Integer id;
    
    public String name;
    
    public List<KjsSkinSecondaryTab> secondary_tabs;
    
    public Builder() {}
    
    public Builder(KjsSkinPrimaryTab param1KjsSkinPrimaryTab) {
      super(param1KjsSkinPrimaryTab);
      if (param1KjsSkinPrimaryTab == null)
        return; 
      this.name = param1KjsSkinPrimaryTab.name;
      this.secondary_tabs = Message.copyOf(param1KjsSkinPrimaryTab.secondary_tabs);
      this.id = param1KjsSkinPrimaryTab.id;
    }
    
    public KjsSkinPrimaryTab build(boolean param1Boolean) {
      return new KjsSkinPrimaryTab(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
