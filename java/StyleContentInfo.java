package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class StyleContentInfo extends Message {
  public static final String DEFAULT_CONTENT_COLOR = "";
  
  public static final String DEFAULT_CONTENT_ICON = "";
  
  public static final String DEFAULT_DYNAMIC_ICON = "";
  
  public static final String DEFAULT_ICON = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String content_color;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String content_icon;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String dynamic_icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  public StyleContentInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.content_color;
      if (str1 == null) {
        this.content_color = "";
      } else {
        this.content_color = str1;
      } 
      str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str1 = paramBuilder.content_icon;
      if (str1 == null) {
        this.content_icon = "";
      } else {
        this.content_icon = str1;
      } 
      str = paramBuilder.dynamic_icon;
      if (str == null) {
        this.dynamic_icon = "";
      } else {
        this.dynamic_icon = str;
      } 
    } else {
      this.content_color = ((Builder)str).content_color;
      this.icon = ((Builder)str).icon;
      this.content_icon = ((Builder)str).content_icon;
      this.dynamic_icon = ((Builder)str).dynamic_icon;
    } 
  }
  
  public static final class Builder extends Message.Builder<StyleContentInfo> {
    public String content_color;
    
    public String content_icon;
    
    public String dynamic_icon;
    
    public String icon;
    
    public Builder() {}
    
    public Builder(StyleContentInfo param1StyleContentInfo) {
      super(param1StyleContentInfo);
      if (param1StyleContentInfo == null)
        return; 
      this.content_color = param1StyleContentInfo.content_color;
      this.icon = param1StyleContentInfo.icon;
      this.content_icon = param1StyleContentInfo.content_icon;
      this.dynamic_icon = param1StyleContentInfo.dynamic_icon;
    }
    
    public StyleContentInfo build(boolean param1Boolean) {
      return new StyleContentInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
