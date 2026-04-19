package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RecomTopicList extends Message {
  public static final String DEFAULT_AUTHOR = "";
  
  public static final Long DEFAULT_BROWSE_NUM;
  
  public static final Integer DEFAULT_COME_FROM;
  
  public static final Integer DEFAULT_CONTENT_SOURCE;
  
  public static final Long DEFAULT_DISCUSS_NUM;
  
  public static final String DEFAULT_HEAD_COLOR = "";
  
  public static final Integer DEFAULT_IDX_NUM;
  
  public static final Long DEFAULT_INTERACTION_NUM_PAGE;
  
  public static final Integer DEFAULT_IS_PORN;
  
  public static final Integer DEFAULT_IS_VIDEO_TOPIC;
  
  public static final String DEFAULT_KEY_WORD = "";
  
  public static final List<Media> DEFAULT_MEDIA;
  
  public static final Long DEFAULT_PUBLISHER_NUM;
  
  public static final String DEFAULT_SHARE_TITLE = "";
  
  public static final Integer DEFAULT_TAG;
  
  public static final String DEFAULT_TOPIC_DESC = "";
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  public static final String DEFAULT_TOPIC_PIC = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final Long DEFAULT_UPDATE_TIME;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String author;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT64)
  public final Long browse_num;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer come_from;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer content_source;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long discuss_num;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String head_color;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT32)
  public final Integer idx_num;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT64)
  public final Long interaction_num_page;
  
  @ProtoField(tag = 17, type = Message.Datatype.INT32)
  public final Integer is_porn;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer is_video_topic;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String key_word;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 10)
  public final List<Media> media;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT64)
  public final Long publisher_num;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String share_title;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer tag;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String topic_desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long topic_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String topic_name;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String topic_pic;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT64)
  public final Long update_time;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOPIC_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_DISCUSS_NUM = long_;
    DEFAULT_TAG = integer;
    DEFAULT_UPDATE_TIME = long_;
    DEFAULT_MEDIA = Collections.emptyList();
    DEFAULT_IS_VIDEO_TOPIC = integer;
    DEFAULT_INTERACTION_NUM_PAGE = long_;
    DEFAULT_PUBLISHER_NUM = long_;
    DEFAULT_BROWSE_NUM = long_;
    DEFAULT_COME_FROM = integer;
    DEFAULT_CONTENT_SOURCE = integer;
    DEFAULT_IS_PORN = integer;
    DEFAULT_IDX_NUM = integer;
  }
  
  public RecomTopicList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_4 = paramBuilder.topic_id;
      if (long_4 == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_4;
      } 
      String str5 = paramBuilder.topic_name;
      if (str5 == null) {
        this.topic_name = "";
      } else {
        this.topic_name = str5;
      } 
      Integer integer5 = paramBuilder.type;
      if (integer5 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer5;
      } 
      Long long_3 = paramBuilder.discuss_num;
      if (long_3 == null) {
        this.discuss_num = DEFAULT_DISCUSS_NUM;
      } else {
        this.discuss_num = long_3;
      } 
      Integer integer4 = paramBuilder.tag;
      if (integer4 == null) {
        this.tag = DEFAULT_TAG;
      } else {
        this.tag = integer4;
      } 
      String str4 = paramBuilder.topic_desc;
      if (str4 == null) {
        this.topic_desc = "";
      } else {
        this.topic_desc = str4;
      } 
      str4 = paramBuilder.topic_pic;
      if (str4 == null) {
        this.topic_pic = "";
      } else {
        this.topic_pic = str4;
      } 
      Long long_2 = paramBuilder.update_time;
      if (long_2 == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = long_2;
      } 
      String str3 = paramBuilder.author;
      if (str3 == null) {
        this.author = "";
      } else {
        this.author = str3;
      } 
      List<Media> list = paramBuilder.media;
      if (list == null) {
        this.media = DEFAULT_MEDIA;
      } else {
        this.media = Message.immutableCopyOf(list);
      } 
      Integer integer3 = paramBuilder.is_video_topic;
      if (integer3 == null) {
        this.is_video_topic = DEFAULT_IS_VIDEO_TOPIC;
      } else {
        this.is_video_topic = integer3;
      } 
      Long long_1 = paramBuilder.interaction_num_page;
      if (long_1 == null) {
        this.interaction_num_page = DEFAULT_INTERACTION_NUM_PAGE;
      } else {
        this.interaction_num_page = long_1;
      } 
      long_1 = paramBuilder.publisher_num;
      if (long_1 == null) {
        this.publisher_num = DEFAULT_PUBLISHER_NUM;
      } else {
        this.publisher_num = long_1;
      } 
      long_1 = paramBuilder.browse_num;
      if (long_1 == null) {
        this.browse_num = DEFAULT_BROWSE_NUM;
      } else {
        this.browse_num = long_1;
      } 
      Integer integer2 = paramBuilder.come_from;
      if (integer2 == null) {
        this.come_from = DEFAULT_COME_FROM;
      } else {
        this.come_from = integer2;
      } 
      integer2 = paramBuilder.content_source;
      if (integer2 == null) {
        this.content_source = DEFAULT_CONTENT_SOURCE;
      } else {
        this.content_source = integer2;
      } 
      integer2 = paramBuilder.is_porn;
      if (integer2 == null) {
        this.is_porn = DEFAULT_IS_PORN;
      } else {
        this.is_porn = integer2;
      } 
      String str2 = paramBuilder.head_color;
      if (str2 == null) {
        this.head_color = "";
      } else {
        this.head_color = str2;
      } 
      Integer integer1 = paramBuilder.idx_num;
      if (integer1 == null) {
        this.idx_num = DEFAULT_IDX_NUM;
      } else {
        this.idx_num = integer1;
      } 
      String str1 = paramBuilder.share_title;
      if (str1 == null) {
        this.share_title = "";
      } else {
        this.share_title = str1;
      } 
      str = paramBuilder.key_word;
      if (str == null) {
        this.key_word = "";
      } else {
        this.key_word = str;
      } 
    } else {
      this.topic_id = ((Builder)str).topic_id;
      this.topic_name = ((Builder)str).topic_name;
      this.type = ((Builder)str).type;
      this.discuss_num = ((Builder)str).discuss_num;
      this.tag = ((Builder)str).tag;
      this.topic_desc = ((Builder)str).topic_desc;
      this.topic_pic = ((Builder)str).topic_pic;
      this.update_time = ((Builder)str).update_time;
      this.author = ((Builder)str).author;
      this.media = Message.immutableCopyOf(((Builder)str).media);
      this.is_video_topic = ((Builder)str).is_video_topic;
      this.interaction_num_page = ((Builder)str).interaction_num_page;
      this.publisher_num = ((Builder)str).publisher_num;
      this.browse_num = ((Builder)str).browse_num;
      this.come_from = ((Builder)str).come_from;
      this.content_source = ((Builder)str).content_source;
      this.is_porn = ((Builder)str).is_porn;
      this.head_color = ((Builder)str).head_color;
      this.idx_num = ((Builder)str).idx_num;
      this.share_title = ((Builder)str).share_title;
      this.key_word = ((Builder)str).key_word;
    } 
  }
  
  public static final class Builder extends Message.Builder<RecomTopicList> {
    public String author;
    
    public Long browse_num;
    
    public Integer come_from;
    
    public Integer content_source;
    
    public Long discuss_num;
    
    public String head_color;
    
    public Integer idx_num;
    
    public Long interaction_num_page;
    
    public Integer is_porn;
    
    public Integer is_video_topic;
    
    public String key_word;
    
    public List<Media> media;
    
    public Long publisher_num;
    
    public String share_title;
    
    public Integer tag;
    
    public String topic_desc;
    
    public Long topic_id;
    
    public String topic_name;
    
    public String topic_pic;
    
    public Integer type;
    
    public Long update_time;
    
    public Builder() {}
    
    public Builder(RecomTopicList param1RecomTopicList) {
      super(param1RecomTopicList);
      if (param1RecomTopicList == null)
        return; 
      this.topic_id = param1RecomTopicList.topic_id;
      this.topic_name = param1RecomTopicList.topic_name;
      this.type = param1RecomTopicList.type;
      this.discuss_num = param1RecomTopicList.discuss_num;
      this.tag = param1RecomTopicList.tag;
      this.topic_desc = param1RecomTopicList.topic_desc;
      this.topic_pic = param1RecomTopicList.topic_pic;
      this.update_time = param1RecomTopicList.update_time;
      this.author = param1RecomTopicList.author;
      this.media = Message.copyOf(param1RecomTopicList.media);
      this.is_video_topic = param1RecomTopicList.is_video_topic;
      this.interaction_num_page = param1RecomTopicList.interaction_num_page;
      this.publisher_num = param1RecomTopicList.publisher_num;
      this.browse_num = param1RecomTopicList.browse_num;
      this.come_from = param1RecomTopicList.come_from;
      this.content_source = param1RecomTopicList.content_source;
      this.is_porn = param1RecomTopicList.is_porn;
      this.head_color = param1RecomTopicList.head_color;
      this.idx_num = param1RecomTopicList.idx_num;
      this.share_title = param1RecomTopicList.share_title;
      this.key_word = param1RecomTopicList.key_word;
    }
    
    public RecomTopicList build(boolean param1Boolean) {
      return new RecomTopicList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
