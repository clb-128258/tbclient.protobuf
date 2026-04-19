package tbclient.GetSugTopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TopicList extends Message {
  public static final Long DEFAULT_DISCUSS_NUM;
  
  public static final Integer DEFAULT_IS_VIDEO_TOPIC;
  
  public static final String DEFAULT_SLOGAN = "";
  
  public static final Integer DEFAULT_TAG;
  
  public static final String DEFAULT_TOPIC_DESC = "";
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  public static final String DEFAULT_TOPIC_PIC = "";
  
  public static final Long DEFAULT_VIEW_NUM;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long discuss_num;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_video_topic;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String slogan;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer tag;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String topic_desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long topic_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String topic_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String topic_pic;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT64)
  public final Long view_num;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOPIC_ID = long_;
    DEFAULT_DISCUSS_NUM = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TAG = integer;
    DEFAULT_IS_VIDEO_TOPIC = integer;
    DEFAULT_VIEW_NUM = long_;
  }
  
  public TopicList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.topic_id;
      if (long_2 == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_2;
      } 
      String str3 = paramBuilder.topic_name;
      if (str3 == null) {
        this.topic_name = "";
      } else {
        this.topic_name = str3;
      } 
      Long long_1 = paramBuilder.discuss_num;
      if (long_1 == null) {
        this.discuss_num = DEFAULT_DISCUSS_NUM;
      } else {
        this.discuss_num = long_1;
      } 
      Integer integer2 = paramBuilder.tag;
      if (integer2 == null) {
        this.tag = DEFAULT_TAG;
      } else {
        this.tag = integer2;
      } 
      String str2 = paramBuilder.topic_desc;
      if (str2 == null) {
        this.topic_desc = "";
      } else {
        this.topic_desc = str2;
      } 
      str2 = paramBuilder.topic_pic;
      if (str2 == null) {
        this.topic_pic = "";
      } else {
        this.topic_pic = str2;
      } 
      Integer integer1 = paramBuilder.is_video_topic;
      if (integer1 == null) {
        this.is_video_topic = DEFAULT_IS_VIDEO_TOPIC;
      } else {
        this.is_video_topic = integer1;
      } 
      String str1 = paramBuilder.slogan;
      if (str1 == null) {
        this.slogan = "";
      } else {
        this.slogan = str1;
      } 
      long_ = paramBuilder.view_num;
      if (long_ == null) {
        this.view_num = DEFAULT_VIEW_NUM;
      } else {
        this.view_num = long_;
      } 
    } else {
      this.topic_id = ((Builder)long_).topic_id;
      this.topic_name = ((Builder)long_).topic_name;
      this.discuss_num = ((Builder)long_).discuss_num;
      this.tag = ((Builder)long_).tag;
      this.topic_desc = ((Builder)long_).topic_desc;
      this.topic_pic = ((Builder)long_).topic_pic;
      this.is_video_topic = ((Builder)long_).is_video_topic;
      this.slogan = ((Builder)long_).slogan;
      this.view_num = ((Builder)long_).view_num;
    } 
  }
  
  public static final class Builder extends Message.Builder<TopicList> {
    public Long discuss_num;
    
    public Integer is_video_topic;
    
    public String slogan;
    
    public Integer tag;
    
    public String topic_desc;
    
    public Long topic_id;
    
    public String topic_name;
    
    public String topic_pic;
    
    public Long view_num;
    
    public Builder() {}
    
    public Builder(TopicList param1TopicList) {
      super(param1TopicList);
      if (param1TopicList == null)
        return; 
      this.topic_id = param1TopicList.topic_id;
      this.topic_name = param1TopicList.topic_name;
      this.discuss_num = param1TopicList.discuss_num;
      this.tag = param1TopicList.tag;
      this.topic_desc = param1TopicList.topic_desc;
      this.topic_pic = param1TopicList.topic_pic;
      this.is_video_topic = param1TopicList.is_video_topic;
      this.slogan = param1TopicList.slogan;
      this.view_num = param1TopicList.view_num;
    }
    
    public TopicList build(boolean param1Boolean) {
      return new TopicList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
