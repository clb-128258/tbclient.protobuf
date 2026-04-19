package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ToastContent extends Message {
  public static final Integer DEFAULT_HAS_COLOR = Integer.valueOf(0);
  
  public static final String DEFAULT_TEXT = "";
  
  public static final String DEFAULT_TEXT_COLOR = "";
  
  public static final String DEFAULT_TEXT_COLOR_DARK = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer has_color;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String text_color;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String text_color_dark;
  
  public ToastContent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.text;
      if (str2 == null) {
        this.text = "";
      } else {
        this.text = str2;
      } 
      Integer integer = paramBuilder.has_color;
      if (integer == null) {
        this.has_color = DEFAULT_HAS_COLOR;
      } else {
        this.has_color = integer;
      } 
      String str1 = paramBuilder.text_color;
      if (str1 == null) {
        this.text_color = "";
      } else {
        this.text_color = str1;
      } 
      str = paramBuilder.text_color_dark;
      if (str == null) {
        this.text_color_dark = "";
      } else {
        this.text_color_dark = str;
      } 
    } else {
      this.text = ((Builder)str).text;
      this.has_color = ((Builder)str).has_color;
      this.text_color = ((Builder)str).text_color;
      this.text_color_dark = ((Builder)str).text_color_dark;
    } 
  }
  
  public static final class Builder extends Message.Builder<ToastContent> {
    public Integer has_color;
    
    public String text;
    
    public String text_color;
    
    public String text_color_dark;
    
    public Builder() {}
    
    public Builder(ToastContent param1ToastContent) {
      super(param1ToastContent);
      if (param1ToastContent == null)
        return; 
      this.text = param1ToastContent.text;
      this.has_color = param1ToastContent.has_color;
      this.text_color = param1ToastContent.text_color;
      this.text_color_dark = param1ToastContent.text_color_dark;
    }
    
    public ToastContent build(boolean param1Boolean) {
      return new ToastContent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
