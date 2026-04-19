package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AppTransmitData extends Message {
  public static final Integer DEFAULT_CARRIER;
  
  public static final String DEFAULT_CARRIER_NAME = "";
  
  public static final String DEFAULT_COUNTRY_CODE = "";
  
  public static final String DEFAULT_DEVICE_TYPE = "";
  
  public static final String DEFAULT_DISK_TOTAL = "";
  
  public static final String DEFAULT_IDFV = "";
  
  public static final String DEFAULT_ISMI = "";
  
  public static final String DEFAULT_LOCAL_TZ_NAME = "";
  
  public static final String DEFAULT_MB_TIME = "";
  
  public static final String DEFAULT_MEM_TOTAL = "";
  
  public static final Integer DEFAULT_ORIENTATION;
  
  public static final String DEFAULT_SHA1 = "";
  
  public static final String DEFAULT_STARTUP_TIME = "";
  
  public static final String DEFAULT_WISE_SAMPLE_ID = "";
  
  public static final String DEFAULT_YY_HDID = "";
  
  public static final String DEFAULT_YY_VERSION = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer carrier;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String carrier_name;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String country_code;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String device_type;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String disk_total;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String idfv;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String ismi;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String local_tz_name;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String mb_time;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String mem_total;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer orientation;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String sha1;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String startup_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String wise_sample_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String yy_hdid;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String yy_version;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ORIENTATION = integer;
    DEFAULT_CARRIER = integer;
  }
  
  public AppTransmitData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.wise_sample_id;
      if (str2 == null) {
        this.wise_sample_id = "";
      } else {
        this.wise_sample_id = str2;
      } 
      str2 = paramBuilder.yy_hdid;
      if (str2 == null) {
        this.yy_hdid = "";
      } else {
        this.yy_hdid = str2;
      } 
      str2 = paramBuilder.yy_version;
      if (str2 == null) {
        this.yy_version = "";
      } else {
        this.yy_version = str2;
      } 
      str2 = paramBuilder.ismi;
      if (str2 == null) {
        this.ismi = "";
      } else {
        this.ismi = str2;
      } 
      Integer integer = paramBuilder.orientation;
      if (integer == null) {
        this.orientation = DEFAULT_ORIENTATION;
      } else {
        this.orientation = integer;
      } 
      integer = paramBuilder.carrier;
      if (integer == null) {
        this.carrier = DEFAULT_CARRIER;
      } else {
        this.carrier = integer;
      } 
      String str1 = paramBuilder.carrier_name;
      if (str1 == null) {
        this.carrier_name = "";
      } else {
        this.carrier_name = str1;
      } 
      str1 = paramBuilder.idfv;
      if (str1 == null) {
        this.idfv = "";
      } else {
        this.idfv = str1;
      } 
      str1 = paramBuilder.startup_time;
      if (str1 == null) {
        this.startup_time = "";
      } else {
        this.startup_time = str1;
      } 
      str1 = paramBuilder.country_code;
      if (str1 == null) {
        this.country_code = "";
      } else {
        this.country_code = str1;
      } 
      str1 = paramBuilder.mb_time;
      if (str1 == null) {
        this.mb_time = "";
      } else {
        this.mb_time = str1;
      } 
      str1 = paramBuilder.disk_total;
      if (str1 == null) {
        this.disk_total = "";
      } else {
        this.disk_total = str1;
      } 
      str1 = paramBuilder.mem_total;
      if (str1 == null) {
        this.mem_total = "";
      } else {
        this.mem_total = str1;
      } 
      str1 = paramBuilder.device_type;
      if (str1 == null) {
        this.device_type = "";
      } else {
        this.device_type = str1;
      } 
      str1 = paramBuilder.local_tz_name;
      if (str1 == null) {
        this.local_tz_name = "";
      } else {
        this.local_tz_name = str1;
      } 
      str = paramBuilder.sha1;
      if (str == null) {
        this.sha1 = "";
      } else {
        this.sha1 = str;
      } 
    } else {
      this.wise_sample_id = ((Builder)str).wise_sample_id;
      this.yy_hdid = ((Builder)str).yy_hdid;
      this.yy_version = ((Builder)str).yy_version;
      this.ismi = ((Builder)str).ismi;
      this.orientation = ((Builder)str).orientation;
      this.carrier = ((Builder)str).carrier;
      this.carrier_name = ((Builder)str).carrier_name;
      this.idfv = ((Builder)str).idfv;
      this.startup_time = ((Builder)str).startup_time;
      this.country_code = ((Builder)str).country_code;
      this.mb_time = ((Builder)str).mb_time;
      this.disk_total = ((Builder)str).disk_total;
      this.mem_total = ((Builder)str).mem_total;
      this.device_type = ((Builder)str).device_type;
      this.local_tz_name = ((Builder)str).local_tz_name;
      this.sha1 = ((Builder)str).sha1;
    } 
  }
  
  public static final class Builder extends Message.Builder<AppTransmitData> {
    public Integer carrier;
    
    public String carrier_name;
    
    public String country_code;
    
    public String device_type;
    
    public String disk_total;
    
    public String idfv;
    
    public String ismi;
    
    public String local_tz_name;
    
    public String mb_time;
    
    public String mem_total;
    
    public Integer orientation;
    
    public String sha1;
    
    public String startup_time;
    
    public String wise_sample_id;
    
    public String yy_hdid;
    
    public String yy_version;
    
    public Builder() {}
    
    public Builder(AppTransmitData param1AppTransmitData) {
      super(param1AppTransmitData);
      if (param1AppTransmitData == null)
        return; 
      this.wise_sample_id = param1AppTransmitData.wise_sample_id;
      this.yy_hdid = param1AppTransmitData.yy_hdid;
      this.yy_version = param1AppTransmitData.yy_version;
      this.ismi = param1AppTransmitData.ismi;
      this.orientation = param1AppTransmitData.orientation;
      this.carrier = param1AppTransmitData.carrier;
      this.carrier_name = param1AppTransmitData.carrier_name;
      this.idfv = param1AppTransmitData.idfv;
      this.startup_time = param1AppTransmitData.startup_time;
      this.country_code = param1AppTransmitData.country_code;
      this.mb_time = param1AppTransmitData.mb_time;
      this.disk_total = param1AppTransmitData.disk_total;
      this.mem_total = param1AppTransmitData.mem_total;
      this.device_type = param1AppTransmitData.device_type;
      this.local_tz_name = param1AppTransmitData.local_tz_name;
      this.sha1 = param1AppTransmitData.sha1;
    }
    
    public AppTransmitData build(boolean param1Boolean) {
      return new AppTransmitData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
