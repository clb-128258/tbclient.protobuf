package tbclient.PbList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.IconUrlInfo;
import tbclient.ThemeElement;

public final class SettingInfoIcon extends Message {
  public static final String DEFAULT_ID = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final String DEFAULT_SCHEMA_TOGGLE = "";
  
  @ProtoField(tag = 4)
  public final IconUrlInfo icon;
  
  @ProtoField(tag = 5)
  public final IconUrlInfo icon_toggle;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String id;
  
  @ProtoField(tag = 2)
  public final ThemeElement name;
  
  @ProtoField(tag = 3)
  public final ThemeElement name_toggle;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String schema_toggle;
  
  public SettingInfoIcon(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.id;
      if (str1 == null) {
        this.id = "";
      } else {
        this.id = str1;
      } 
      this.name = paramBuilder.name;
      this.name_toggle = paramBuilder.name_toggle;
      this.icon = paramBuilder.icon;
      this.icon_toggle = paramBuilder.icon_toggle;
      str1 = paramBuilder.schema;
      if (str1 == null) {
        this.schema = "";
      } else {
        this.schema = str1;
      } 
      str = paramBuilder.schema_toggle;
      if (str == null) {
        this.schema_toggle = "";
      } else {
        this.schema_toggle = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.name = ((Builder)str).name;
      this.name_toggle = ((Builder)str).name_toggle;
      this.icon = ((Builder)str).icon;
      this.icon_toggle = ((Builder)str).icon_toggle;
      this.schema = ((Builder)str).schema;
      this.schema_toggle = ((Builder)str).schema_toggle;
    } 
  }
  
  public static final class Builder extends Message.Builder<SettingInfoIcon> {
    public IconUrlInfo icon;
    
    public IconUrlInfo icon_toggle;
    
    public String id;
    
    public ThemeElement name;
    
    public ThemeElement name_toggle;
    
    public String schema;
    
    public String schema_toggle;
    
    public Builder() {}
    
    public Builder(SettingInfoIcon param1SettingInfoIcon) {
      super(param1SettingInfoIcon);
      if (param1SettingInfoIcon == null)
        return; 
      this.id = param1SettingInfoIcon.id;
      this.name = param1SettingInfoIcon.name;
      this.name_toggle = param1SettingInfoIcon.name_toggle;
      this.icon = param1SettingInfoIcon.icon;
      this.icon_toggle = param1SettingInfoIcon.icon_toggle;
      this.schema = param1SettingInfoIcon.schema;
      this.schema_toggle = param1SettingInfoIcon.schema_toggle;
    }
    
    public SettingInfoIcon build(boolean param1Boolean) {
      return new SettingInfoIcon(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
