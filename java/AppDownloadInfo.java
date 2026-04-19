package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AppDownloadInfo extends Message {
  public static final String DEFAULT_APP_NAME = "";
  
  public static final String DEFAULT_APP_VERSION = "";
  
  public static final String DEFAULT_AUTHORITY_URL = "";
  
  public static final String DEFAULT_DEVELOPER_NAME = "";
  
  public static final String DEFAULT_FUNC_URL = "";
  
  public static final String DEFAULT_PRIVACY_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String app_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String app_version;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String authority_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String developer_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String func_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String privacy_url;
  
  public AppDownloadInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.app_name;
      if (str1 == null) {
        this.app_name = "";
      } else {
        this.app_name = str1;
      } 
      str1 = paramBuilder.app_version;
      if (str1 == null) {
        this.app_version = "";
      } else {
        this.app_version = str1;
      } 
      str1 = paramBuilder.developer_name;
      if (str1 == null) {
        this.developer_name = "";
      } else {
        this.developer_name = str1;
      } 
      str1 = paramBuilder.authority_url;
      if (str1 == null) {
        this.authority_url = "";
      } else {
        this.authority_url = str1;
      } 
      str1 = paramBuilder.privacy_url;
      if (str1 == null) {
        this.privacy_url = "";
      } else {
        this.privacy_url = str1;
      } 
      str = paramBuilder.func_url;
      if (str == null) {
        this.func_url = "";
      } else {
        this.func_url = str;
      } 
    } else {
      this.app_name = ((Builder)str).app_name;
      this.app_version = ((Builder)str).app_version;
      this.developer_name = ((Builder)str).developer_name;
      this.authority_url = ((Builder)str).authority_url;
      this.privacy_url = ((Builder)str).privacy_url;
      this.func_url = ((Builder)str).func_url;
    } 
  }
  
  public static final class Builder extends Message.Builder<AppDownloadInfo> {
    public String app_name;
    
    public String app_version;
    
    public String authority_url;
    
    public String developer_name;
    
    public String func_url;
    
    public String privacy_url;
    
    public Builder() {}
    
    public Builder(AppDownloadInfo param1AppDownloadInfo) {
      super(param1AppDownloadInfo);
      if (param1AppDownloadInfo == null)
        return; 
      this.app_name = param1AppDownloadInfo.app_name;
      this.app_version = param1AppDownloadInfo.app_version;
      this.developer_name = param1AppDownloadInfo.developer_name;
      this.authority_url = param1AppDownloadInfo.authority_url;
      this.privacy_url = param1AppDownloadInfo.privacy_url;
      this.func_url = param1AppDownloadInfo.func_url;
    }
    
    public AppDownloadInfo build(boolean param1Boolean) {
      return new AppDownloadInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
