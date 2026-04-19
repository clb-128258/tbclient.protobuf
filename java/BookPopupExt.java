package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BookPopupExt extends Message {
  public static final String DEFAULT_APK_NAME = "";
  
  public static final String DEFAULT_APK_URL = "";
  
  public static final String DEFAULT_APP_ICON = "";
  
  public static final String DEFAULT_APP_NAME = "";
  
  public static final String DEFAULT_AUTHORITY_URL = "";
  
  public static final String DEFAULT_DEVELOPER = "";
  
  public static final String DEFAULT_GAME_ID = "";
  
  public static final String DEFAULT_IOS_LINK = "";
  
  public static final String DEFAULT_ITEM_ID = "";
  
  public static final String DEFAULT_PACKAGE_SIZE = "";
  
  public static final String DEFAULT_PACKAGE_VERSION = "";
  
  public static final String DEFAULT_PACKAGE_VERSION_CODE = "";
  
  public static final String DEFAULT_PKG_SOURCE = "";
  
  public static final String DEFAULT_PRIVATE_URL = "";
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String apk_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String apk_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String app_icon;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String app_name;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String authority_url;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String developer;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String game_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String ios_link;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String item_id;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String package_size;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String package_version;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String package_version_code;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String pkg_source;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String private_url;
  
  public BookPopupExt(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.game_id;
      if (str1 == null) {
        this.game_id = "";
      } else {
        this.game_id = str1;
      } 
      str1 = paramBuilder.item_id;
      if (str1 == null) {
        this.item_id = "";
      } else {
        this.item_id = str1;
      } 
      str1 = paramBuilder.app_name;
      if (str1 == null) {
        this.app_name = "";
      } else {
        this.app_name = str1;
      } 
      str1 = paramBuilder.app_icon;
      if (str1 == null) {
        this.app_icon = "";
      } else {
        this.app_icon = str1;
      } 
      str1 = paramBuilder.ios_link;
      if (str1 == null) {
        this.ios_link = "";
      } else {
        this.ios_link = str1;
      } 
      str1 = paramBuilder.apk_url;
      if (str1 == null) {
        this.apk_url = "";
      } else {
        this.apk_url = str1;
      } 
      str1 = paramBuilder.apk_name;
      if (str1 == null) {
        this.apk_name = "";
      } else {
        this.apk_name = str1;
      } 
      str1 = paramBuilder.pkg_source;
      if (str1 == null) {
        this.pkg_source = "";
      } else {
        this.pkg_source = str1;
      } 
      str1 = paramBuilder.developer;
      if (str1 == null) {
        this.developer = "";
      } else {
        this.developer = str1;
      } 
      str1 = paramBuilder.package_version;
      if (str1 == null) {
        this.package_version = "";
      } else {
        this.package_version = str1;
      } 
      str1 = paramBuilder.authority_url;
      if (str1 == null) {
        this.authority_url = "";
      } else {
        this.authority_url = str1;
      } 
      str1 = paramBuilder.private_url;
      if (str1 == null) {
        this.private_url = "";
      } else {
        this.private_url = str1;
      } 
      str1 = paramBuilder.package_size;
      if (str1 == null) {
        this.package_size = "";
      } else {
        this.package_size = str1;
      } 
      str = paramBuilder.package_version_code;
      if (str == null) {
        this.package_version_code = "";
      } else {
        this.package_version_code = str;
      } 
    } else {
      this.game_id = ((Builder)str).game_id;
      this.item_id = ((Builder)str).item_id;
      this.app_name = ((Builder)str).app_name;
      this.app_icon = ((Builder)str).app_icon;
      this.ios_link = ((Builder)str).ios_link;
      this.apk_url = ((Builder)str).apk_url;
      this.apk_name = ((Builder)str).apk_name;
      this.pkg_source = ((Builder)str).pkg_source;
      this.developer = ((Builder)str).developer;
      this.package_version = ((Builder)str).package_version;
      this.authority_url = ((Builder)str).authority_url;
      this.private_url = ((Builder)str).private_url;
      this.package_size = ((Builder)str).package_size;
      this.package_version_code = ((Builder)str).package_version_code;
    } 
  }
  
  public static final class Builder extends Message.Builder<BookPopupExt> {
    public String apk_name;
    
    public String apk_url;
    
    public String app_icon;
    
    public String app_name;
    
    public String authority_url;
    
    public String developer;
    
    public String game_id;
    
    public String ios_link;
    
    public String item_id;
    
    public String package_size;
    
    public String package_version;
    
    public String package_version_code;
    
    public String pkg_source;
    
    public String private_url;
    
    public Builder() {}
    
    public Builder(BookPopupExt param1BookPopupExt) {
      super(param1BookPopupExt);
      if (param1BookPopupExt == null)
        return; 
      this.game_id = param1BookPopupExt.game_id;
      this.item_id = param1BookPopupExt.item_id;
      this.app_name = param1BookPopupExt.app_name;
      this.app_icon = param1BookPopupExt.app_icon;
      this.ios_link = param1BookPopupExt.ios_link;
      this.apk_url = param1BookPopupExt.apk_url;
      this.apk_name = param1BookPopupExt.apk_name;
      this.pkg_source = param1BookPopupExt.pkg_source;
      this.developer = param1BookPopupExt.developer;
      this.package_version = param1BookPopupExt.package_version;
      this.authority_url = param1BookPopupExt.authority_url;
      this.private_url = param1BookPopupExt.private_url;
      this.package_size = param1BookPopupExt.package_size;
      this.package_version_code = param1BookPopupExt.package_version_code;
    }
    
    public BookPopupExt build(boolean param1Boolean) {
      return new BookPopupExt(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
