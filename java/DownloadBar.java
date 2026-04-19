package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DownloadBar extends Message {
  public static final String DEFAULT_BUTTON_TEXT = "";
  
  public static final String DEFAULT_GUIDE_TEXT = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final String DEFAULT_TYPE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String button_text;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String guide_text;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String type;
  
  public DownloadBar(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.type;
      if (str1 == null) {
        this.type = "";
      } else {
        this.type = str1;
      } 
      str1 = paramBuilder.button_text;
      if (str1 == null) {
        this.button_text = "";
      } else {
        this.button_text = str1;
      } 
      str1 = paramBuilder.schema;
      if (str1 == null) {
        this.schema = "";
      } else {
        this.schema = str1;
      } 
      str1 = paramBuilder.guide_text;
      if (str1 == null) {
        this.guide_text = "";
      } else {
        this.guide_text = str1;
      } 
      str = paramBuilder.icon;
      if (str == null) {
        this.icon = "";
      } else {
        this.icon = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.button_text = ((Builder)str).button_text;
      this.schema = ((Builder)str).schema;
      this.guide_text = ((Builder)str).guide_text;
      this.icon = ((Builder)str).icon;
    } 
  }
  
  public static final class Builder extends Message.Builder<DownloadBar> {
    public String button_text;
    
    public String guide_text;
    
    public String icon;
    
    public String schema;
    
    public String type;
    
    public Builder() {}
    
    public Builder(DownloadBar param1DownloadBar) {
      super(param1DownloadBar);
      if (param1DownloadBar == null)
        return; 
      this.type = param1DownloadBar.type;
      this.button_text = param1DownloadBar.button_text;
      this.schema = param1DownloadBar.schema;
      this.guide_text = param1DownloadBar.guide_text;
      this.icon = param1DownloadBar.icon;
    }
    
    public DownloadBar build(boolean param1Boolean) {
      return new DownloadBar(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
