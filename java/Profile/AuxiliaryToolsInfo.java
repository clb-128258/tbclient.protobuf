package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThemeColorInfo;

public final class AuxiliaryToolsInfo extends Message {
  public static final String DEFAULT_CLASS = "";
  
  public static final String DEFAULT_DARK_ICON = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_IOS_SCHEMA = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_NEED_FILTER;
  
  public static final Long DEFAULT_RED_POINT_VERSION = Long.valueOf(0L);
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String _class;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String dark_icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String ios_schema;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer need_filter;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long red_point_version;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 7)
  public final ThemeColorInfo theme_color_info;
  
  static {
    DEFAULT_NEED_FILTER = Integer.valueOf(0);
  }
  
  public AuxiliaryToolsInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      str2 = paramBuilder.icon;
      if (str2 == null) {
        this.icon = "";
      } else {
        this.icon = str2;
      } 
      str2 = paramBuilder.schema;
      if (str2 == null) {
        this.schema = "";
      } else {
        this.schema = str2;
      } 
      str2 = paramBuilder._class;
      if (str2 == null) {
        this._class = "";
      } else {
        this._class = str2;
      } 
      Long long_ = paramBuilder.red_point_version;
      if (long_ == null) {
        this.red_point_version = DEFAULT_RED_POINT_VERSION;
      } else {
        this.red_point_version = long_;
      } 
      String str1 = paramBuilder.dark_icon;
      if (str1 == null) {
        this.dark_icon = "";
      } else {
        this.dark_icon = str1;
      } 
      this.theme_color_info = paramBuilder.theme_color_info;
      Integer integer = paramBuilder.need_filter;
      if (integer == null) {
        this.need_filter = DEFAULT_NEED_FILTER;
      } else {
        this.need_filter = integer;
      } 
      str = paramBuilder.ios_schema;
      if (str == null) {
        this.ios_schema = "";
      } else {
        this.ios_schema = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.icon = ((Builder)str).icon;
      this.schema = ((Builder)str).schema;
      this._class = ((Builder)str)._class;
      this.red_point_version = ((Builder)str).red_point_version;
      this.dark_icon = ((Builder)str).dark_icon;
      this.theme_color_info = ((Builder)str).theme_color_info;
      this.need_filter = ((Builder)str).need_filter;
      this.ios_schema = ((Builder)str).ios_schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<AuxiliaryToolsInfo> {
    public String _class;
    
    public String dark_icon;
    
    public String icon;
    
    public String ios_schema;
    
    public String name;
    
    public Integer need_filter;
    
    public Long red_point_version;
    
    public String schema;
    
    public ThemeColorInfo theme_color_info;
    
    public Builder() {}
    
    public Builder(AuxiliaryToolsInfo param1AuxiliaryToolsInfo) {
      super(param1AuxiliaryToolsInfo);
      if (param1AuxiliaryToolsInfo == null)
        return; 
      this.name = param1AuxiliaryToolsInfo.name;
      this.icon = param1AuxiliaryToolsInfo.icon;
      this.schema = param1AuxiliaryToolsInfo.schema;
      this._class = param1AuxiliaryToolsInfo._class;
      this.red_point_version = param1AuxiliaryToolsInfo.red_point_version;
      this.dark_icon = param1AuxiliaryToolsInfo.dark_icon;
      this.theme_color_info = param1AuxiliaryToolsInfo.theme_color_info;
      this.need_filter = param1AuxiliaryToolsInfo.need_filter;
      this.ios_schema = param1AuxiliaryToolsInfo.ios_schema;
    }
    
    public AuxiliaryToolsInfo build(boolean param1Boolean) {
      return new AuxiliaryToolsInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
