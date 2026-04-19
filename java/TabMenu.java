package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TabMenu extends Message {
  public static final Integer DEFAULT_CLASS_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_CLASS_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer class_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String class_name;
  
  public TabMenu(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.class_id;
      if (integer == null) {
        this.class_id = DEFAULT_CLASS_ID;
      } else {
        this.class_id = integer;
      } 
      str = paramBuilder.class_name;
      if (str == null) {
        this.class_name = "";
      } else {
        this.class_name = str;
      } 
    } else {
      this.class_id = ((Builder)str).class_id;
      this.class_name = ((Builder)str).class_name;
    } 
  }
  
  public static final class Builder extends Message.Builder<TabMenu> {
    public Integer class_id;
    
    public String class_name;
    
    public Builder() {}
    
    public Builder(TabMenu param1TabMenu) {
      super(param1TabMenu);
      if (param1TabMenu == null)
        return; 
      this.class_id = param1TabMenu.class_id;
      this.class_name = param1TabMenu.class_name;
    }
    
    public TabMenu build(boolean param1Boolean) {
      return new TabMenu(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
