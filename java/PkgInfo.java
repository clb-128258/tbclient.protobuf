package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PkgInfo extends Message {
  public static final String DEFAULT_ABILITY = "";
  
  public static final String DEFAULT_COMPANY = "";
  
  public static final String DEFAULT_PKG_NAME = "";
  
  public static final Integer DEFAULT_PKG_SOURCE = Integer.valueOf(0);
  
  public static final String DEFAULT_POWER = "";
  
  public static final String DEFAULT_PRIVACY = "";
  
  public static final String DEFAULT_SIZE = "";
  
  public static final String DEFAULT_URL = "";
  
  public static final String DEFAULT_VERSION = "";
  
  public static final String DEFAULT_VERSION_CODE = "";
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String ability;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String company;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String pkg_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer pkg_source;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String power;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String privacy;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String size;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String version;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String version_code;
  
  public PkgInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.url;
      if (str2 == null) {
        this.url = "";
      } else {
        this.url = str2;
      } 
      str2 = paramBuilder.version;
      if (str2 == null) {
        this.version = "";
      } else {
        this.version = str2;
      } 
      str2 = paramBuilder.size;
      if (str2 == null) {
        this.size = "";
      } else {
        this.size = str2;
      } 
      str2 = paramBuilder.version_code;
      if (str2 == null) {
        this.version_code = "";
      } else {
        this.version_code = str2;
      } 
      str2 = paramBuilder.pkg_name;
      if (str2 == null) {
        this.pkg_name = "";
      } else {
        this.pkg_name = str2;
      } 
      Integer integer = paramBuilder.pkg_source;
      if (integer == null) {
        this.pkg_source = DEFAULT_PKG_SOURCE;
      } else {
        this.pkg_source = integer;
      } 
      String str1 = paramBuilder.privacy;
      if (str1 == null) {
        this.privacy = "";
      } else {
        this.privacy = str1;
      } 
      str1 = paramBuilder.power;
      if (str1 == null) {
        this.power = "";
      } else {
        this.power = str1;
      } 
      str1 = paramBuilder.company;
      if (str1 == null) {
        this.company = "";
      } else {
        this.company = str1;
      } 
      str = paramBuilder.ability;
      if (str == null) {
        this.ability = "";
      } else {
        this.ability = str;
      } 
    } else {
      this.url = ((Builder)str).url;
      this.version = ((Builder)str).version;
      this.size = ((Builder)str).size;
      this.version_code = ((Builder)str).version_code;
      this.pkg_name = ((Builder)str).pkg_name;
      this.pkg_source = ((Builder)str).pkg_source;
      this.privacy = ((Builder)str).privacy;
      this.power = ((Builder)str).power;
      this.company = ((Builder)str).company;
      this.ability = ((Builder)str).ability;
    } 
  }
  
  public static final class Builder extends Message.Builder<PkgInfo> {
    public String ability;
    
    public String company;
    
    public String pkg_name;
    
    public Integer pkg_source;
    
    public String power;
    
    public String privacy;
    
    public String size;
    
    public String url;
    
    public String version;
    
    public String version_code;
    
    public Builder() {}
    
    public Builder(PkgInfo param1PkgInfo) {
      super(param1PkgInfo);
      if (param1PkgInfo == null)
        return; 
      this.url = param1PkgInfo.url;
      this.version = param1PkgInfo.version;
      this.size = param1PkgInfo.size;
      this.version_code = param1PkgInfo.version_code;
      this.pkg_name = param1PkgInfo.pkg_name;
      this.pkg_source = param1PkgInfo.pkg_source;
      this.privacy = param1PkgInfo.privacy;
      this.power = param1PkgInfo.power;
      this.company = param1PkgInfo.company;
      this.ability = param1PkgInfo.ability;
    }
    
    public PkgInfo build(boolean param1Boolean) {
      return new PkgInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
