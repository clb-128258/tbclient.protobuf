package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TaskInfo extends Message {
  public static final String DEFAULT_BGIMG = "";
  
  public static final Integer DEFAULT_CARD_TYPE;
  
  public static final Long DEFAULT_END_TIME;
  
  public static final String DEFAULT_FLOOR_GOD_REPLY = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_GOD_REPLY;
  
  public static final String DEFAULT_OBJ_ID = "";
  
  public static final Long DEFAULT_START_TIME;
  
  public static final Long DEFAULT_TASK_ID;
  
  public static final String DEFAULT_THEME_COLOR = "";
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final String DEFAULT_THREAD_IMG = "";
  
  public static final String DEFAULT_THREAD_IMG_SIZE = "";
  
  public static final String DEFAULT_TOP_BACKGROUND_IMG = "";
  
  public static final String DEFAULT_WEBVIEW_DATA = "";
  
  public static final String DEFAULT_WEBVIEW_URL = "";
  
  public static final String DEFAULT_WH_RATE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String bgimg;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer card_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long end_time;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String floor_god_reply;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer is_god_reply;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String obj_id;
  
  @ProtoField(tag = 12)
  public final RewardCard reward_card;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long start_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long task_id;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String theme_color;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long thread_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String thread_img;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String thread_img_size;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String top_background_img;
  
  @ProtoField(tag = 11)
  public final VoteSchema vote_schema;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String webview_data;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String webview_url;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String wh_rate;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TASK_ID = long_;
    DEFAULT_THREAD_ID = long_;
    DEFAULT_START_TIME = long_;
    DEFAULT_END_TIME = long_;
    DEFAULT_FORUM_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_GOD_REPLY = integer;
    DEFAULT_CARD_TYPE = integer;
  }
  
  public TaskInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.task_id;
      if (long_3 == null) {
        this.task_id = DEFAULT_TASK_ID;
      } else {
        this.task_id = long_3;
      } 
      long_3 = paramBuilder.thread_id;
      if (long_3 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_3;
      } 
      String str5 = paramBuilder.bgimg;
      if (str5 == null) {
        this.bgimg = "";
      } else {
        this.bgimg = str5;
      } 
      str5 = paramBuilder.thread_img;
      if (str5 == null) {
        this.thread_img = "";
      } else {
        this.thread_img = str5;
      } 
      Long long_2 = paramBuilder.start_time;
      if (long_2 == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = long_2;
      } 
      long_2 = paramBuilder.end_time;
      if (long_2 == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = long_2;
      } 
      String str4 = paramBuilder.thread_img_size;
      if (str4 == null) {
        this.thread_img_size = "";
      } else {
        this.thread_img_size = str4;
      } 
      Long long_1 = paramBuilder.forum_id;
      if (long_1 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_1;
      } 
      String str3 = paramBuilder.forum_name;
      if (str3 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str3;
      } 
      str3 = paramBuilder.obj_id;
      if (str3 == null) {
        this.obj_id = "";
      } else {
        this.obj_id = str3;
      } 
      this.vote_schema = paramBuilder.vote_schema;
      this.reward_card = paramBuilder.reward_card;
      Integer integer2 = paramBuilder.is_god_reply;
      if (integer2 == null) {
        this.is_god_reply = DEFAULT_IS_GOD_REPLY;
      } else {
        this.is_god_reply = integer2;
      } 
      String str2 = paramBuilder.floor_god_reply;
      if (str2 == null) {
        this.floor_god_reply = "";
      } else {
        this.floor_god_reply = str2;
      } 
      Integer integer1 = paramBuilder.card_type;
      if (integer1 == null) {
        this.card_type = DEFAULT_CARD_TYPE;
      } else {
        this.card_type = integer1;
      } 
      String str1 = paramBuilder.wh_rate;
      if (str1 == null) {
        this.wh_rate = "";
      } else {
        this.wh_rate = str1;
      } 
      str1 = paramBuilder.webview_url;
      if (str1 == null) {
        this.webview_url = "";
      } else {
        this.webview_url = str1;
      } 
      str1 = paramBuilder.top_background_img;
      if (str1 == null) {
        this.top_background_img = "";
      } else {
        this.top_background_img = str1;
      } 
      str1 = paramBuilder.theme_color;
      if (str1 == null) {
        this.theme_color = "";
      } else {
        this.theme_color = str1;
      } 
      str = paramBuilder.webview_data;
      if (str == null) {
        this.webview_data = "";
      } else {
        this.webview_data = str;
      } 
    } else {
      this.task_id = ((Builder)str).task_id;
      this.thread_id = ((Builder)str).thread_id;
      this.bgimg = ((Builder)str).bgimg;
      this.thread_img = ((Builder)str).thread_img;
      this.start_time = ((Builder)str).start_time;
      this.end_time = ((Builder)str).end_time;
      this.thread_img_size = ((Builder)str).thread_img_size;
      this.forum_id = ((Builder)str).forum_id;
      this.forum_name = ((Builder)str).forum_name;
      this.obj_id = ((Builder)str).obj_id;
      this.vote_schema = ((Builder)str).vote_schema;
      this.reward_card = ((Builder)str).reward_card;
      this.is_god_reply = ((Builder)str).is_god_reply;
      this.floor_god_reply = ((Builder)str).floor_god_reply;
      this.card_type = ((Builder)str).card_type;
      this.wh_rate = ((Builder)str).wh_rate;
      this.webview_url = ((Builder)str).webview_url;
      this.top_background_img = ((Builder)str).top_background_img;
      this.theme_color = ((Builder)str).theme_color;
      this.webview_data = ((Builder)str).webview_data;
    } 
  }
  
  public static final class Builder extends Message.Builder<TaskInfo> {
    public String bgimg;
    
    public Integer card_type;
    
    public Long end_time;
    
    public String floor_god_reply;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer is_god_reply;
    
    public String obj_id;
    
    public RewardCard reward_card;
    
    public Long start_time;
    
    public Long task_id;
    
    public String theme_color;
    
    public Long thread_id;
    
    public String thread_img;
    
    public String thread_img_size;
    
    public String top_background_img;
    
    public VoteSchema vote_schema;
    
    public String webview_data;
    
    public String webview_url;
    
    public String wh_rate;
    
    public Builder() {}
    
    public Builder(TaskInfo param1TaskInfo) {
      super(param1TaskInfo);
      if (param1TaskInfo == null)
        return; 
      this.task_id = param1TaskInfo.task_id;
      this.thread_id = param1TaskInfo.thread_id;
      this.bgimg = param1TaskInfo.bgimg;
      this.thread_img = param1TaskInfo.thread_img;
      this.start_time = param1TaskInfo.start_time;
      this.end_time = param1TaskInfo.end_time;
      this.thread_img_size = param1TaskInfo.thread_img_size;
      this.forum_id = param1TaskInfo.forum_id;
      this.forum_name = param1TaskInfo.forum_name;
      this.obj_id = param1TaskInfo.obj_id;
      this.vote_schema = param1TaskInfo.vote_schema;
      this.reward_card = param1TaskInfo.reward_card;
      this.is_god_reply = param1TaskInfo.is_god_reply;
      this.floor_god_reply = param1TaskInfo.floor_god_reply;
      this.card_type = param1TaskInfo.card_type;
      this.wh_rate = param1TaskInfo.wh_rate;
      this.webview_url = param1TaskInfo.webview_url;
      this.top_background_img = param1TaskInfo.top_background_img;
      this.theme_color = param1TaskInfo.theme_color;
      this.webview_data = param1TaskInfo.webview_data;
    }
    
    public TaskInfo build(boolean param1Boolean) {
      return new TaskInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
