package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ServiceArea extends Message {
  public static final String DEFAULT_PICURL = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final String DEFAULT_SERVICENAME = "";
  
  public static final String DEFAULT_SERVICEURL = "";
  
  public static final String DEFAULT_SERVICE_TYPE = "";
  
  public static final String DEFAULT_TAG = "";
  
  public static final List<String> DEFAULT_THIRD_STATISTICS_URL = Collections.emptyList();
  
  public static final String DEFAULT_VERSION = "";
  
  @ProtoField(tag = 6)
  public final SmartApp area_smart_app;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String picurl;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String service_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String servicename;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String serviceurl;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String tag;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
  public final List<String> third_statistics_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String version;
  
  public ServiceArea(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.servicename;
      if (str1 == null) {
        this.servicename = "";
      } else {
        this.servicename = str1;
      } 
      str1 = paramBuilder.picurl;
      if (str1 == null) {
        this.picurl = "";
      } else {
        this.picurl = str1;
      } 
      str1 = paramBuilder.serviceurl;
      if (str1 == null) {
        this.serviceurl = "";
      } else {
        this.serviceurl = str1;
      } 
      str1 = paramBuilder.version;
      if (str1 == null) {
        this.version = "";
      } else {
        this.version = str1;
      } 
      str1 = paramBuilder.service_type;
      if (str1 == null) {
        this.service_type = "";
      } else {
        this.service_type = str1;
      } 
      this.area_smart_app = paramBuilder.area_smart_app;
      str1 = paramBuilder.schema;
      if (str1 == null) {
        this.schema = "";
      } else {
        this.schema = str1;
      } 
      List<String> list = paramBuilder.third_statistics_url;
      if (list == null) {
        this.third_statistics_url = DEFAULT_THIRD_STATISTICS_URL;
      } else {
        this.third_statistics_url = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.tag;
      if (str == null) {
        this.tag = "";
      } else {
        this.tag = str;
      } 
    } else {
      this.servicename = ((Builder)str).servicename;
      this.picurl = ((Builder)str).picurl;
      this.serviceurl = ((Builder)str).serviceurl;
      this.version = ((Builder)str).version;
      this.service_type = ((Builder)str).service_type;
      this.area_smart_app = ((Builder)str).area_smart_app;
      this.schema = ((Builder)str).schema;
      this.third_statistics_url = Message.immutableCopyOf(((Builder)str).third_statistics_url);
      this.tag = ((Builder)str).tag;
    } 
  }
  
  public static final class Builder extends Message.Builder<ServiceArea> {
    public SmartApp area_smart_app;
    
    public String picurl;
    
    public String schema;
    
    public String service_type;
    
    public String servicename;
    
    public String serviceurl;
    
    public String tag;
    
    public List<String> third_statistics_url;
    
    public String version;
    
    public Builder() {}
    
    public Builder(ServiceArea param1ServiceArea) {
      super(param1ServiceArea);
      if (param1ServiceArea == null)
        return; 
      this.servicename = param1ServiceArea.servicename;
      this.picurl = param1ServiceArea.picurl;
      this.serviceurl = param1ServiceArea.serviceurl;
      this.version = param1ServiceArea.version;
      this.service_type = param1ServiceArea.service_type;
      this.area_smart_app = param1ServiceArea.area_smart_app;
      this.schema = param1ServiceArea.schema;
      this.third_statistics_url = Message.copyOf(param1ServiceArea.third_statistics_url);
      this.tag = param1ServiceArea.tag;
    }
    
    public ServiceArea build(boolean param1Boolean) {
      return new ServiceArea(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
