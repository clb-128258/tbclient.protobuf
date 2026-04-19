package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TiebaPlusInfo extends Message {
  public static final String DEFAULT_APP_COMPANY = "";
  
  public static final String DEFAULT_APP_EFFECT = "";
  
  public static final String DEFAULT_APP_ICON = "";
  
  public static final String DEFAULT_APP_ID = "";
  
  public static final String DEFAULT_APP_PACKAGE = "";
  
  public static final String DEFAULT_APP_POWER = "";
  
  public static final String DEFAULT_APP_PRIVACY = "";
  
  public static final String DEFAULT_APP_VERSION = "";
  
  public static final String DEFAULT_BUTTON_DESC = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_DOWNLOAD_URL = "";
  
  public static final String DEFAULT_EXTRA_PARAM = "";
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_H5_JUMP_NUMBER = "";
  
  public static final String DEFAULT_H5_JUMP_PARAM = "";
  
  public static final Integer DEFAULT_H5_JUMP_TYPE;
  
  public static final Integer DEFAULT_IS_APPOINT;
  
  public static final String DEFAULT_ITEM_ID = "";
  
  public static final Integer DEFAULT_JUMP_SETTING;
  
  public static final Integer DEFAULT_JUMP_TYPE;
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final Integer DEFAULT_PLUGIN_ID;
  
  public static final Integer DEFAULT_TARGET_TYPE;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TOKEN = "";
  
  public static final String DEFAULT_WX_THUMBNAIL = "";
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String app_company;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String app_effect;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String app_icon;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String app_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String app_package;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String app_power;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String app_privacy;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String app_version;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String button_desc;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String download_url;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String extra_param;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String h5_jump_number;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String h5_jump_param;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer h5_jump_type;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer is_appoint;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String item_id;
  
  @ProtoField(tag = 21, type = Message.Datatype.INT32)
  public final Integer jump_setting;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer jump_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT32)
  public final Integer plugin_id;
  
  @ProtoField(tag = 19)
  public final PluginUser plugin_user;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer target_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String token;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String wx_thumbnail;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TARGET_TYPE = integer;
    DEFAULT_H5_JUMP_TYPE = integer;
    DEFAULT_JUMP_TYPE = integer;
    DEFAULT_IS_APPOINT = integer;
    DEFAULT_JUMP_SETTING = integer;
    DEFAULT_PLUGIN_ID = integer;
  }
  
  public TiebaPlusInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str6 = paramBuilder.title;
      if (str6 == null) {
        this.title = "";
      } else {
        this.title = str6;
      } 
      str6 = paramBuilder.desc;
      if (str6 == null) {
        this.desc = "";
      } else {
        this.desc = str6;
      } 
      str6 = paramBuilder.jump_url;
      if (str6 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str6;
      } 
      str6 = paramBuilder.download_url;
      if (str6 == null) {
        this.download_url = "";
      } else {
        this.download_url = str6;
      } 
      str6 = paramBuilder.app_id;
      if (str6 == null) {
        this.app_id = "";
      } else {
        this.app_id = str6;
      } 
      str6 = paramBuilder.app_icon;
      if (str6 == null) {
        this.app_icon = "";
      } else {
        this.app_icon = str6;
      } 
      str6 = paramBuilder.app_package;
      if (str6 == null) {
        this.app_package = "";
      } else {
        this.app_package = str6;
      } 
      str6 = paramBuilder.app_version;
      if (str6 == null) {
        this.app_version = "";
      } else {
        this.app_version = str6;
      } 
      str6 = paramBuilder.app_privacy;
      if (str6 == null) {
        this.app_privacy = "";
      } else {
        this.app_privacy = str6;
      } 
      str6 = paramBuilder.app_power;
      if (str6 == null) {
        this.app_power = "";
      } else {
        this.app_power = str6;
      } 
      str6 = paramBuilder.app_company;
      if (str6 == null) {
        this.app_company = "";
      } else {
        this.app_company = str6;
      } 
      Integer integer5 = paramBuilder.target_type;
      if (integer5 == null) {
        this.target_type = DEFAULT_TARGET_TYPE;
      } else {
        this.target_type = integer5;
      } 
      integer5 = paramBuilder.h5_jump_type;
      if (integer5 == null) {
        this.h5_jump_type = DEFAULT_H5_JUMP_TYPE;
      } else {
        this.h5_jump_type = integer5;
      } 
      String str5 = paramBuilder.h5_jump_number;
      if (str5 == null) {
        this.h5_jump_number = "";
      } else {
        this.h5_jump_number = str5;
      } 
      str5 = paramBuilder.h5_jump_param;
      if (str5 == null) {
        this.h5_jump_param = "";
      } else {
        this.h5_jump_param = str5;
      } 
      Integer integer4 = paramBuilder.jump_type;
      if (integer4 == null) {
        this.jump_type = DEFAULT_JUMP_TYPE;
      } else {
        this.jump_type = integer4;
      } 
      String str4 = paramBuilder.item_id;
      if (str4 == null) {
        this.item_id = "";
      } else {
        this.item_id = str4;
      } 
      Integer integer3 = paramBuilder.is_appoint;
      if (integer3 == null) {
        this.is_appoint = DEFAULT_IS_APPOINT;
      } else {
        this.is_appoint = integer3;
      } 
      this.plugin_user = paramBuilder.plugin_user;
      String str3 = paramBuilder.forum_name;
      if (str3 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str3;
      } 
      Integer integer2 = paramBuilder.jump_setting;
      if (integer2 == null) {
        this.jump_setting = DEFAULT_JUMP_SETTING;
      } else {
        this.jump_setting = integer2;
      } 
      String str2 = paramBuilder.wx_thumbnail;
      if (str2 == null) {
        this.wx_thumbnail = "";
      } else {
        this.wx_thumbnail = str2;
      } 
      str2 = paramBuilder.button_desc;
      if (str2 == null) {
        this.button_desc = "";
      } else {
        this.button_desc = str2;
      } 
      str2 = paramBuilder.app_effect;
      if (str2 == null) {
        this.app_effect = "";
      } else {
        this.app_effect = str2;
      } 
      Integer integer1 = paramBuilder.plugin_id;
      if (integer1 == null) {
        this.plugin_id = DEFAULT_PLUGIN_ID;
      } else {
        this.plugin_id = integer1;
      } 
      String str1 = paramBuilder.token;
      if (str1 == null) {
        this.token = "";
      } else {
        this.token = str1;
      } 
      str = paramBuilder.extra_param;
      if (str == null) {
        this.extra_param = "";
      } else {
        this.extra_param = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.desc = ((Builder)str).desc;
      this.jump_url = ((Builder)str).jump_url;
      this.download_url = ((Builder)str).download_url;
      this.app_id = ((Builder)str).app_id;
      this.app_icon = ((Builder)str).app_icon;
      this.app_package = ((Builder)str).app_package;
      this.app_version = ((Builder)str).app_version;
      this.app_privacy = ((Builder)str).app_privacy;
      this.app_power = ((Builder)str).app_power;
      this.app_company = ((Builder)str).app_company;
      this.target_type = ((Builder)str).target_type;
      this.h5_jump_type = ((Builder)str).h5_jump_type;
      this.h5_jump_number = ((Builder)str).h5_jump_number;
      this.h5_jump_param = ((Builder)str).h5_jump_param;
      this.jump_type = ((Builder)str).jump_type;
      this.item_id = ((Builder)str).item_id;
      this.is_appoint = ((Builder)str).is_appoint;
      this.plugin_user = ((Builder)str).plugin_user;
      this.forum_name = ((Builder)str).forum_name;
      this.jump_setting = ((Builder)str).jump_setting;
      this.wx_thumbnail = ((Builder)str).wx_thumbnail;
      this.button_desc = ((Builder)str).button_desc;
      this.app_effect = ((Builder)str).app_effect;
      this.plugin_id = ((Builder)str).plugin_id;
      this.token = ((Builder)str).token;
      this.extra_param = ((Builder)str).extra_param;
    } 
  }
  
  public static final class Builder extends Message.Builder<TiebaPlusInfo> {
    public String app_company;
    
    public String app_effect;
    
    public String app_icon;
    
    public String app_id;
    
    public String app_package;
    
    public String app_power;
    
    public String app_privacy;
    
    public String app_version;
    
    public String button_desc;
    
    public String desc;
    
    public String download_url;
    
    public String extra_param;
    
    public String forum_name;
    
    public String h5_jump_number;
    
    public String h5_jump_param;
    
    public Integer h5_jump_type;
    
    public Integer is_appoint;
    
    public String item_id;
    
    public Integer jump_setting;
    
    public Integer jump_type;
    
    public String jump_url;
    
    public Integer plugin_id;
    
    public PluginUser plugin_user;
    
    public Integer target_type;
    
    public String title;
    
    public String token;
    
    public String wx_thumbnail;
    
    public Builder() {}
    
    public Builder(TiebaPlusInfo param1TiebaPlusInfo) {
      super(param1TiebaPlusInfo);
      if (param1TiebaPlusInfo == null)
        return; 
      this.title = param1TiebaPlusInfo.title;
      this.desc = param1TiebaPlusInfo.desc;
      this.jump_url = param1TiebaPlusInfo.jump_url;
      this.download_url = param1TiebaPlusInfo.download_url;
      this.app_id = param1TiebaPlusInfo.app_id;
      this.app_icon = param1TiebaPlusInfo.app_icon;
      this.app_package = param1TiebaPlusInfo.app_package;
      this.app_version = param1TiebaPlusInfo.app_version;
      this.app_privacy = param1TiebaPlusInfo.app_privacy;
      this.app_power = param1TiebaPlusInfo.app_power;
      this.app_company = param1TiebaPlusInfo.app_company;
      this.target_type = param1TiebaPlusInfo.target_type;
      this.h5_jump_type = param1TiebaPlusInfo.h5_jump_type;
      this.h5_jump_number = param1TiebaPlusInfo.h5_jump_number;
      this.h5_jump_param = param1TiebaPlusInfo.h5_jump_param;
      this.jump_type = param1TiebaPlusInfo.jump_type;
      this.item_id = param1TiebaPlusInfo.item_id;
      this.is_appoint = param1TiebaPlusInfo.is_appoint;
      this.plugin_user = param1TiebaPlusInfo.plugin_user;
      this.forum_name = param1TiebaPlusInfo.forum_name;
      this.jump_setting = param1TiebaPlusInfo.jump_setting;
      this.wx_thumbnail = param1TiebaPlusInfo.wx_thumbnail;
      this.button_desc = param1TiebaPlusInfo.button_desc;
      this.app_effect = param1TiebaPlusInfo.app_effect;
      this.plugin_id = param1TiebaPlusInfo.plugin_id;
      this.token = param1TiebaPlusInfo.token;
      this.extra_param = param1TiebaPlusInfo.extra_param;
    }
    
    public TiebaPlusInfo build(boolean param1Boolean) {
      return new TiebaPlusInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
