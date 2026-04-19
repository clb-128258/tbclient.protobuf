package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PushInfo extends Message {
  public static final String DEFAULT_EXT = "";
  
  public static final Integer DEFAULT_PUSH_TIME = Integer.valueOf(0);
  
  public static final String DEFAULT_SERVICE_ID = "";
  
  public static final String DEFAULT_TARGET_URL = "";
  
  public static final String DEFAULT_TASK_ID = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String ext;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer push_time;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String service_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String target_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String task_id;
  
  public PushInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.task_id;
      if (str1 == null) {
        this.task_id = "";
      } else {
        this.task_id = str1;
      } 
      str1 = paramBuilder.service_id;
      if (str1 == null) {
        this.service_id = "";
      } else {
        this.service_id = str1;
      } 
      str1 = paramBuilder.target_url;
      if (str1 == null) {
        this.target_url = "";
      } else {
        this.target_url = str1;
      } 
      Integer integer = paramBuilder.push_time;
      if (integer == null) {
        this.push_time = DEFAULT_PUSH_TIME;
      } else {
        this.push_time = integer;
      } 
      str = paramBuilder.ext;
      if (str == null) {
        this.ext = "";
      } else {
        this.ext = str;
      } 
    } else {
      this.task_id = ((Builder)str).task_id;
      this.service_id = ((Builder)str).service_id;
      this.target_url = ((Builder)str).target_url;
      this.push_time = ((Builder)str).push_time;
      this.ext = ((Builder)str).ext;
    } 
  }
  
  public static final class Builder extends Message.Builder<PushInfo> {
    public String ext;
    
    public Integer push_time;
    
    public String service_id;
    
    public String target_url;
    
    public String task_id;
    
    public Builder() {}
    
    public Builder(PushInfo param1PushInfo) {
      super(param1PushInfo);
      if (param1PushInfo == null)
        return; 
      this.task_id = param1PushInfo.task_id;
      this.service_id = param1PushInfo.service_id;
      this.target_url = param1PushInfo.target_url;
      this.push_time = param1PushInfo.push_time;
      this.ext = param1PushInfo.ext;
    }
    
    public PushInfo build(boolean param1Boolean) {
      return new PushInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
