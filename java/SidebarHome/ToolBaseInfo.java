package tbclient.SidebarHome;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ToolBaseInfo extends Message {
  public static final String DEFAULT_ACTION_TYPE = "";
  
  public static final String DEFAULT_ACTION_URI = "";
  
  public static final String DEFAULT_CLASS_NAME = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_TIPS = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String action_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String action_uri;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String class_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String tips;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public ToolBaseInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.action_uri;
      if (str1 == null) {
        this.action_uri = "";
      } else {
        this.action_uri = str1;
      } 
      str1 = paramBuilder.action_type;
      if (str1 == null) {
        this.action_type = "";
      } else {
        this.action_type = str1;
      } 
      str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str1 = paramBuilder.class_name;
      if (str1 == null) {
        this.class_name = "";
      } else {
        this.class_name = str1;
      } 
      str = paramBuilder.tips;
      if (str == null) {
        this.tips = "";
      } else {
        this.tips = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.action_uri = ((Builder)str).action_uri;
      this.action_type = ((Builder)str).action_type;
      this.icon = ((Builder)str).icon;
      this.class_name = ((Builder)str).class_name;
      this.tips = ((Builder)str).tips;
    } 
  }
  
  public static final class Builder extends Message.Builder<ToolBaseInfo> {
    public String action_type;
    
    public String action_uri;
    
    public String class_name;
    
    public String icon;
    
    public String tips;
    
    public String title;
    
    public Builder() {}
    
    public Builder(ToolBaseInfo param1ToolBaseInfo) {
      super(param1ToolBaseInfo);
      if (param1ToolBaseInfo == null)
        return; 
      this.title = param1ToolBaseInfo.title;
      this.action_uri = param1ToolBaseInfo.action_uri;
      this.action_type = param1ToolBaseInfo.action_type;
      this.icon = param1ToolBaseInfo.icon;
      this.class_name = param1ToolBaseInfo.class_name;
      this.tips = param1ToolBaseInfo.tips;
    }
    
    public ToolBaseInfo build(boolean param1Boolean) {
      return new ToolBaseInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
