package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserReadStyle extends Message {
  public static final Integer DEFAULT_CURRENT_STYLE;
  
  public static final Integer DEFAULT_IS_SLIDE;
  
  public static final String DEFAULT_STYLE_NAME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer current_style;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_slide;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String style_name;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_CURRENT_STYLE = integer;
    DEFAULT_IS_SLIDE = integer;
  }
  
  public UserReadStyle(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.style_name;
      if (str == null) {
        this.style_name = "";
      } else {
        this.style_name = str;
      } 
      Integer integer1 = paramBuilder.current_style;
      if (integer1 == null) {
        this.current_style = DEFAULT_CURRENT_STYLE;
      } else {
        this.current_style = integer1;
      } 
      integer = paramBuilder.is_slide;
      if (integer == null) {
        this.is_slide = DEFAULT_IS_SLIDE;
      } else {
        this.is_slide = integer;
      } 
    } else {
      this.style_name = ((Builder)integer).style_name;
      this.current_style = ((Builder)integer).current_style;
      this.is_slide = ((Builder)integer).is_slide;
    } 
  }
  
  public static final class Builder extends Message.Builder<UserReadStyle> {
    public Integer current_style;
    
    public Integer is_slide;
    
    public String style_name;
    
    public Builder() {}
    
    public Builder(UserReadStyle param1UserReadStyle) {
      super(param1UserReadStyle);
      if (param1UserReadStyle == null)
        return; 
      this.style_name = param1UserReadStyle.style_name;
      this.current_style = param1UserReadStyle.current_style;
      this.is_slide = param1UserReadStyle.is_slide;
    }
    
    public UserReadStyle build(boolean param1Boolean) {
      return new UserReadStyle(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
