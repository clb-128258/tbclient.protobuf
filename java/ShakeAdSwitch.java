package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ShakeAdSwitch extends Message {
  public static final String DEFAULT_DESC = "";
  
  public static final Integer DEFAULT_IS_SHOW = Integer.valueOf(0);
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_show;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public ShakeAdSwitch(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_show;
      if (integer == null) {
        this.is_show = DEFAULT_IS_SHOW;
      } else {
        this.is_show = integer;
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str = paramBuilder.desc;
      if (str == null) {
        this.desc = "";
      } else {
        this.desc = str;
      } 
    } else {
      this.is_show = ((Builder)str).is_show;
      this.title = ((Builder)str).title;
      this.desc = ((Builder)str).desc;
    } 
  }
  
  public static final class Builder extends Message.Builder<ShakeAdSwitch> {
    public String desc;
    
    public Integer is_show;
    
    public String title;
    
    public Builder() {}
    
    public Builder(ShakeAdSwitch param1ShakeAdSwitch) {
      super(param1ShakeAdSwitch);
      if (param1ShakeAdSwitch == null)
        return; 
      this.is_show = param1ShakeAdSwitch.is_show;
      this.title = param1ShakeAdSwitch.title;
      this.desc = param1ShakeAdSwitch.desc;
    }
    
    public ShakeAdSwitch build(boolean param1Boolean) {
      return new ShakeAdSwitch(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
