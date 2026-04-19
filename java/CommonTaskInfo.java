package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CommonTaskInfo extends Message {
  public static final String DEFAULT_ACTIVATE_TOKEN = "";
  
  public static final String DEFAULT_ACT_TYPE = "";
  
  public static final String DEFAULT_BRIEF = "";
  
  public static final Integer DEFAULT_CLIENT_TYPE;
  
  public static final String DEFAULT_COMMENT = "";
  
  public static final Integer DEFAULT_COMPLETE_TIME;
  
  public static final Integer DEFAULT_CREATE_TIME;
  
  public static final Integer DEFAULT_DOTASK_STATUS;
  
  public static final String DEFAULT_EXT = "";
  
  public static final Integer DEFAULT_ID;
  
  public static final Integer DEFAULT_IS_CONTINUOUS;
  
  public static final Integer DEFAULT_IS_NEED_ACTIVE;
  
  public static final Integer DEFAULT_IS_PLAT_TASK;
  
  public static final Integer DEFAULT_MONTH;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_PLAT_ACT_ID;
  
  public static final String DEFAULT_PLAT_ACT_TOKEN = "";
  
  public static final Integer DEFAULT_PLAT_PLATFORM_TYPE_ID;
  
  public static final Integer DEFAULT_PLAT_TASK_ID;
  
  public static final String DEFAULT_PLAT_TASK_TOKEN = "";
  
  public static final String DEFAULT_SCENE_CALLBACK = "";
  
  public static final Integer DEFAULT_SCENE_ID;
  
  public static final String DEFAULT_SCENE_SWITCH = "";
  
  public static final String DEFAULT_SCENE_TASK_KEY = "";
  
  public static final Integer DEFAULT_START_TIME;
  
  public static final Integer DEFAULT_STATUS;
  
  public static final Integer DEFAULT_TARGET_NUM;
  
  public static final String DEFAULT_TASK_ICON_URL = "";
  
  public static final Integer DEFAULT_TASK_TYPE;
  
  public static final Integer DEFAULT_TIME_INTERVAL;
  
  public static final Integer DEFAULT_UPDATE_TIME;
  
  public static final Integer DEFAULT_WEEK;
  
  public static final Integer DEFAULT_WEIGHT;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String act_type;
  
  @ProtoField(tag = 30, type = Message.Datatype.STRING)
  public final String activate_token;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String brief;
  
  @ProtoField(tag = 22, type = Message.Datatype.INT32)
  public final Integer client_type;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String comment;
  
  @ProtoField(tag = 33, type = Message.Datatype.INT32)
  public final Integer complete_time;
  
  @ProtoField(tag = 28, type = Message.Datatype.INT32)
  public final Integer create_time;
  
  @ProtoField(tag = 31, type = Message.Datatype.INT32)
  public final Integer dotask_status;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String ext;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer is_continuous;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer is_need_active;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer is_plat_task;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT32)
  public final Integer month;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer plat_act_id;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String plat_act_token;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer plat_platform_type_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer plat_task_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String plat_task_token;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String scene_callback;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer scene_id;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String scene_switch;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String scene_task_key;
  
  @ProtoField(tag = 32, type = Message.Datatype.INT32)
  public final Integer start_time;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 17, type = Message.Datatype.INT32)
  public final Integer target_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String task_icon_url;
  
  @ProtoField(tag = 34)
  public final TaskProgress task_progress;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer task_type;
  
  @ProtoField(tag = 21, type = Message.Datatype.INT32)
  public final Integer time_interval;
  
  @ProtoField(tag = 29, type = Message.Datatype.INT32)
  public final Integer update_time;
  
  @ProtoField(tag = 20, type = Message.Datatype.INT32)
  public final Integer week;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer weight;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ID = integer;
    DEFAULT_PLAT_ACT_ID = integer;
    DEFAULT_PLAT_TASK_ID = integer;
    DEFAULT_PLAT_PLATFORM_TYPE_ID = integer;
    DEFAULT_TASK_TYPE = integer;
    DEFAULT_STATUS = integer;
    DEFAULT_WEIGHT = integer;
    DEFAULT_IS_NEED_ACTIVE = integer;
    DEFAULT_IS_PLAT_TASK = integer;
    DEFAULT_TARGET_NUM = integer;
    DEFAULT_IS_CONTINUOUS = integer;
    DEFAULT_MONTH = integer;
    DEFAULT_WEEK = integer;
    DEFAULT_TIME_INTERVAL = integer;
    DEFAULT_CLIENT_TYPE = integer;
    DEFAULT_SCENE_ID = integer;
    DEFAULT_CREATE_TIME = integer;
    DEFAULT_UPDATE_TIME = integer;
    DEFAULT_DOTASK_STATUS = integer;
    DEFAULT_START_TIME = integer;
    DEFAULT_COMPLETE_TIME = integer;
  }
  
  public CommonTaskInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Integer integer7 = paramBuilder.id;
      if (integer7 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer7;
      } 
      String str6 = paramBuilder.name;
      if (str6 == null) {
        this.name = "";
      } else {
        this.name = str6;
      } 
      str6 = paramBuilder.task_icon_url;
      if (str6 == null) {
        this.task_icon_url = "";
      } else {
        this.task_icon_url = str6;
      } 
      str6 = paramBuilder.brief;
      if (str6 == null) {
        this.brief = "";
      } else {
        this.brief = str6;
      } 
      Integer integer6 = paramBuilder.plat_act_id;
      if (integer6 == null) {
        this.plat_act_id = DEFAULT_PLAT_ACT_ID;
      } else {
        this.plat_act_id = integer6;
      } 
      integer6 = paramBuilder.plat_task_id;
      if (integer6 == null) {
        this.plat_task_id = DEFAULT_PLAT_TASK_ID;
      } else {
        this.plat_task_id = integer6;
      } 
      String str5 = paramBuilder.plat_task_token;
      if (str5 == null) {
        this.plat_task_token = "";
      } else {
        this.plat_task_token = str5;
      } 
      Integer integer5 = paramBuilder.plat_platform_type_id;
      if (integer5 == null) {
        this.plat_platform_type_id = DEFAULT_PLAT_PLATFORM_TYPE_ID;
      } else {
        this.plat_platform_type_id = integer5;
      } 
      String str4 = paramBuilder.plat_act_token;
      if (str4 == null) {
        this.plat_act_token = "";
      } else {
        this.plat_act_token = str4;
      } 
      str4 = paramBuilder.scene_task_key;
      if (str4 == null) {
        this.scene_task_key = "";
      } else {
        this.scene_task_key = str4;
      } 
      Integer integer4 = paramBuilder.task_type;
      if (integer4 == null) {
        this.task_type = DEFAULT_TASK_TYPE;
      } else {
        this.task_type = integer4;
      } 
      integer4 = paramBuilder.status;
      if (integer4 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer4;
      } 
      integer4 = paramBuilder.weight;
      if (integer4 == null) {
        this.weight = DEFAULT_WEIGHT;
      } else {
        this.weight = integer4;
      } 
      String str3 = paramBuilder.act_type;
      if (str3 == null) {
        this.act_type = "";
      } else {
        this.act_type = str3;
      } 
      Integer integer3 = paramBuilder.is_need_active;
      if (integer3 == null) {
        this.is_need_active = DEFAULT_IS_NEED_ACTIVE;
      } else {
        this.is_need_active = integer3;
      } 
      integer3 = paramBuilder.is_plat_task;
      if (integer3 == null) {
        this.is_plat_task = DEFAULT_IS_PLAT_TASK;
      } else {
        this.is_plat_task = integer3;
      } 
      integer3 = paramBuilder.target_num;
      if (integer3 == null) {
        this.target_num = DEFAULT_TARGET_NUM;
      } else {
        this.target_num = integer3;
      } 
      integer3 = paramBuilder.is_continuous;
      if (integer3 == null) {
        this.is_continuous = DEFAULT_IS_CONTINUOUS;
      } else {
        this.is_continuous = integer3;
      } 
      integer3 = paramBuilder.month;
      if (integer3 == null) {
        this.month = DEFAULT_MONTH;
      } else {
        this.month = integer3;
      } 
      integer3 = paramBuilder.week;
      if (integer3 == null) {
        this.week = DEFAULT_WEEK;
      } else {
        this.week = integer3;
      } 
      integer3 = paramBuilder.time_interval;
      if (integer3 == null) {
        this.time_interval = DEFAULT_TIME_INTERVAL;
      } else {
        this.time_interval = integer3;
      } 
      integer3 = paramBuilder.client_type;
      if (integer3 == null) {
        this.client_type = DEFAULT_CLIENT_TYPE;
      } else {
        this.client_type = integer3;
      } 
      integer3 = paramBuilder.scene_id;
      if (integer3 == null) {
        this.scene_id = DEFAULT_SCENE_ID;
      } else {
        this.scene_id = integer3;
      } 
      String str2 = paramBuilder.scene_switch;
      if (str2 == null) {
        this.scene_switch = "";
      } else {
        this.scene_switch = str2;
      } 
      str2 = paramBuilder.scene_callback;
      if (str2 == null) {
        this.scene_callback = "";
      } else {
        this.scene_callback = str2;
      } 
      str2 = paramBuilder.comment;
      if (str2 == null) {
        this.comment = "";
      } else {
        this.comment = str2;
      } 
      str2 = paramBuilder.ext;
      if (str2 == null) {
        this.ext = "";
      } else {
        this.ext = str2;
      } 
      Integer integer2 = paramBuilder.create_time;
      if (integer2 == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = integer2;
      } 
      integer2 = paramBuilder.update_time;
      if (integer2 == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = integer2;
      } 
      String str1 = paramBuilder.activate_token;
      if (str1 == null) {
        this.activate_token = "";
      } else {
        this.activate_token = str1;
      } 
      Integer integer1 = paramBuilder.dotask_status;
      if (integer1 == null) {
        this.dotask_status = DEFAULT_DOTASK_STATUS;
      } else {
        this.dotask_status = integer1;
      } 
      integer1 = paramBuilder.start_time;
      if (integer1 == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = integer1;
      } 
      integer1 = paramBuilder.complete_time;
      if (integer1 == null) {
        this.complete_time = DEFAULT_COMPLETE_TIME;
      } else {
        this.complete_time = integer1;
      } 
      this.task_progress = paramBuilder.task_progress;
    } else {
      this.id = paramBuilder.id;
      this.name = paramBuilder.name;
      this.task_icon_url = paramBuilder.task_icon_url;
      this.brief = paramBuilder.brief;
      this.plat_act_id = paramBuilder.plat_act_id;
      this.plat_task_id = paramBuilder.plat_task_id;
      this.plat_task_token = paramBuilder.plat_task_token;
      this.plat_platform_type_id = paramBuilder.plat_platform_type_id;
      this.plat_act_token = paramBuilder.plat_act_token;
      this.scene_task_key = paramBuilder.scene_task_key;
      this.task_type = paramBuilder.task_type;
      this.status = paramBuilder.status;
      this.weight = paramBuilder.weight;
      this.act_type = paramBuilder.act_type;
      this.is_need_active = paramBuilder.is_need_active;
      this.is_plat_task = paramBuilder.is_plat_task;
      this.target_num = paramBuilder.target_num;
      this.is_continuous = paramBuilder.is_continuous;
      this.month = paramBuilder.month;
      this.week = paramBuilder.week;
      this.time_interval = paramBuilder.time_interval;
      this.client_type = paramBuilder.client_type;
      this.scene_id = paramBuilder.scene_id;
      this.scene_switch = paramBuilder.scene_switch;
      this.scene_callback = paramBuilder.scene_callback;
      this.comment = paramBuilder.comment;
      this.ext = paramBuilder.ext;
      this.create_time = paramBuilder.create_time;
      this.update_time = paramBuilder.update_time;
      this.activate_token = paramBuilder.activate_token;
      this.dotask_status = paramBuilder.dotask_status;
      this.start_time = paramBuilder.start_time;
      this.complete_time = paramBuilder.complete_time;
      this.task_progress = paramBuilder.task_progress;
    } 
  }
  
  public static final class Builder extends Message.Builder<CommonTaskInfo> {
    public String act_type;
    
    public String activate_token;
    
    public String brief;
    
    public Integer client_type;
    
    public String comment;
    
    public Integer complete_time;
    
    public Integer create_time;
    
    public Integer dotask_status;
    
    public String ext;
    
    public Integer id;
    
    public Integer is_continuous;
    
    public Integer is_need_active;
    
    public Integer is_plat_task;
    
    public Integer month;
    
    public String name;
    
    public Integer plat_act_id;
    
    public String plat_act_token;
    
    public Integer plat_platform_type_id;
    
    public Integer plat_task_id;
    
    public String plat_task_token;
    
    public String scene_callback;
    
    public Integer scene_id;
    
    public String scene_switch;
    
    public String scene_task_key;
    
    public Integer start_time;
    
    public Integer status;
    
    public Integer target_num;
    
    public String task_icon_url;
    
    public TaskProgress task_progress;
    
    public Integer task_type;
    
    public Integer time_interval;
    
    public Integer update_time;
    
    public Integer week;
    
    public Integer weight;
    
    public Builder() {}
    
    public Builder(CommonTaskInfo param1CommonTaskInfo) {
      super(param1CommonTaskInfo);
      if (param1CommonTaskInfo == null)
        return; 
      this.id = param1CommonTaskInfo.id;
      this.name = param1CommonTaskInfo.name;
      this.task_icon_url = param1CommonTaskInfo.task_icon_url;
      this.brief = param1CommonTaskInfo.brief;
      this.plat_act_id = param1CommonTaskInfo.plat_act_id;
      this.plat_task_id = param1CommonTaskInfo.plat_task_id;
      this.plat_task_token = param1CommonTaskInfo.plat_task_token;
      this.plat_platform_type_id = param1CommonTaskInfo.plat_platform_type_id;
      this.plat_act_token = param1CommonTaskInfo.plat_act_token;
      this.scene_task_key = param1CommonTaskInfo.scene_task_key;
      this.task_type = param1CommonTaskInfo.task_type;
      this.status = param1CommonTaskInfo.status;
      this.weight = param1CommonTaskInfo.weight;
      this.act_type = param1CommonTaskInfo.act_type;
      this.is_need_active = param1CommonTaskInfo.is_need_active;
      this.is_plat_task = param1CommonTaskInfo.is_plat_task;
      this.target_num = param1CommonTaskInfo.target_num;
      this.is_continuous = param1CommonTaskInfo.is_continuous;
      this.month = param1CommonTaskInfo.month;
      this.week = param1CommonTaskInfo.week;
      this.time_interval = param1CommonTaskInfo.time_interval;
      this.client_type = param1CommonTaskInfo.client_type;
      this.scene_id = param1CommonTaskInfo.scene_id;
      this.scene_switch = param1CommonTaskInfo.scene_switch;
      this.scene_callback = param1CommonTaskInfo.scene_callback;
      this.comment = param1CommonTaskInfo.comment;
      this.ext = param1CommonTaskInfo.ext;
      this.create_time = param1CommonTaskInfo.create_time;
      this.update_time = param1CommonTaskInfo.update_time;
      this.activate_token = param1CommonTaskInfo.activate_token;
      this.dotask_status = param1CommonTaskInfo.dotask_status;
      this.start_time = param1CommonTaskInfo.start_time;
      this.complete_time = param1CommonTaskInfo.complete_time;
      this.task_progress = param1CommonTaskInfo.task_progress;
    }
    
    public CommonTaskInfo build(boolean param1Boolean) {
      return new CommonTaskInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
