package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ThreadRecommendInfo extends Message {
  public static final String DEFAULT_BUSINESS_ID = "";
  
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final Integer DEFAULT_BUSINESS_TYPE;
  
  public static final String DEFAULT_BUTTON_LINK = "";
  
  public static final String DEFAULT_BUTTON_LINK2 = "";
  
  public static final String DEFAULT_BUTTON_TEXT = "";
  
  public static final String DEFAULT_BUTTON_TEXT2 = "";
  
  public static final String DEFAULT_FORUM_AVATAR = "";
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_JUMP_ICON = "";
  
  public static final String DEFAULT_JUMP_LINK = "";
  
  public static final String DEFAULT_JUMP_TEXT = "";
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final String DEFAULT_PRICE = "";
  
  public static final String DEFAULT_PRICE2 = "";
  
  public static final String DEFAULT_RECOMMEND_ICON = "";
  
  public static final String DEFAULT_RECOMMEND_ICON_BACKGROUND = "";
  
  public static final String DEFAULT_RECOMMEND_REASON = "";
  
  public static final String DEFAULT_RECOMMEND_TAIL = "";
  
  public static final String DEFAULT_RECOMMEND_TYPE = "";
  
  public static final Integer DEFAULT_SHOW_NUM;
  
  public static final String DEFAULT_SHOW_TYPE = "";
  
  public static final Integer DEFAULT_STYLE_TYPE;
  
  public static final Long DEFAULT_TOPIC_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_TOPIC_TAG = "";
  
  @ProtoField(tag = 13)
  public final ThemeColorInfo background_color;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String business_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 25)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer business_type;
  
  @ProtoField(tag = 29)
  public final ThemeColorInfo button_color;
  
  @ProtoField(tag = 30, type = Message.Datatype.STRING)
  public final String button_link;
  
  @ProtoField(tag = 37, type = Message.Datatype.STRING)
  public final String button_link2;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String button_text;
  
  @ProtoField(tag = 36, type = Message.Datatype.STRING)
  public final String button_text2;
  
  @ProtoField(tag = 28)
  public final ThemeColorInfo button_text_color;
  
  @ProtoField(tag = 24)
  public final FeedCountdown countdown;
  
  @ProtoField(tag = 20)
  public final ThemeColorInfo dot_color;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String forum_avatar;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 34)
  public final ThemeColorInfo icon_info;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String jump_icon;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String jump_link;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String jump_text;
  
  @ProtoField(tag = 19)
  public final ThemeColorInfo jump_text_color;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 31)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 33, type = Message.Datatype.STRING)
  public final String price;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String price2;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String recommend_icon;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String recommend_icon_background;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String recommend_reason;
  
  @ProtoField(tag = 11)
  public final ThemeColorInfo recommend_reason_color;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String recommend_tail;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String recommend_type;
  
  @ProtoField(tag = 10)
  public final ThemeColorInfo recommend_type_color;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer show_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String show_type;
  
  @ProtoField(tag = 12)
  public final ThemeColorInfo strip_color;
  
  @ProtoField(tag = 22, type = Message.Datatype.INT32)
  public final Integer style_type;
  
  @ProtoField(tag = 21)
  public final ThemeColorInfo tail_color;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long topic_id;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String topic_tag;
  
  static {
    DEFAULT_BUSINESS_TYPE = integer;
    DEFAULT_STYLE_TYPE = integer;
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
    DEFAULT_LOG_PARAM = Collections.emptyList();
  }
  
  public ThreadRecommendInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str7 = paramBuilder.forum_avatar;
      if (str7 == null) {
        this.forum_avatar = "";
      } else {
        this.forum_avatar = str7;
      } 
      str7 = paramBuilder.forum_name;
      if (str7 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str7;
      } 
      Integer integer3 = paramBuilder.show_num;
      if (integer3 == null) {
        this.show_num = DEFAULT_SHOW_NUM;
      } else {
        this.show_num = integer3;
      } 
      String str6 = paramBuilder.show_type;
      if (str6 == null) {
        this.show_type = "";
      } else {
        this.show_type = str6;
      } 
      str6 = paramBuilder.recommend_reason;
      if (str6 == null) {
        this.recommend_reason = "";
      } else {
        this.recommend_reason = str6;
      } 
      Long long_ = paramBuilder.topic_id;
      if (long_ == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_;
      } 
      String str5 = paramBuilder.recommend_type;
      if (str5 == null) {
        this.recommend_type = "";
      } else {
        this.recommend_type = str5;
      } 
      str5 = paramBuilder.recommend_tail;
      if (str5 == null) {
        this.recommend_tail = "";
      } else {
        this.recommend_tail = str5;
      } 
      str5 = paramBuilder.recommend_icon;
      if (str5 == null) {
        this.recommend_icon = "";
      } else {
        this.recommend_icon = str5;
      } 
      this.recommend_type_color = paramBuilder.recommend_type_color;
      this.recommend_reason_color = paramBuilder.recommend_reason_color;
      this.strip_color = paramBuilder.strip_color;
      this.background_color = paramBuilder.background_color;
      str5 = paramBuilder.jump_link;
      if (str5 == null) {
        this.jump_link = "";
      } else {
        this.jump_link = str5;
      } 
      Integer integer2 = paramBuilder.business_type;
      if (integer2 == null) {
        this.business_type = DEFAULT_BUSINESS_TYPE;
      } else {
        this.business_type = integer2;
      } 
      String str4 = paramBuilder.business_id;
      if (str4 == null) {
        this.business_id = "";
      } else {
        this.business_id = str4;
      } 
      str4 = paramBuilder.jump_icon;
      if (str4 == null) {
        this.jump_icon = "";
      } else {
        this.jump_icon = str4;
      } 
      str4 = paramBuilder.jump_text;
      if (str4 == null) {
        this.jump_text = "";
      } else {
        this.jump_text = str4;
      } 
      this.jump_text_color = paramBuilder.jump_text_color;
      this.dot_color = paramBuilder.dot_color;
      this.tail_color = paramBuilder.tail_color;
      Integer integer1 = paramBuilder.style_type;
      if (integer1 == null) {
        this.style_type = DEFAULT_STYLE_TYPE;
      } else {
        this.style_type = integer1;
      } 
      String str3 = paramBuilder.topic_tag;
      if (str3 == null) {
        this.topic_tag = "";
      } else {
        this.topic_tag = str3;
      } 
      this.countdown = paramBuilder.countdown;
      List<FeedKV> list2 = paramBuilder.business_info;
      if (list2 == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list2);
      } 
      String str2 = paramBuilder.recommend_icon_background;
      if (str2 == null) {
        this.recommend_icon_background = "";
      } else {
        this.recommend_icon_background = str2;
      } 
      str2 = paramBuilder.button_text;
      if (str2 == null) {
        this.button_text = "";
      } else {
        this.button_text = str2;
      } 
      this.button_text_color = paramBuilder.button_text_color;
      this.button_color = paramBuilder.button_color;
      str2 = paramBuilder.button_link;
      if (str2 == null) {
        this.button_link = "";
      } else {
        this.button_link = str2;
      } 
      List<FeedKV> list1 = paramBuilder.log_param;
      if (list1 == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list1);
      } 
      String str1 = paramBuilder.price;
      if (str1 == null) {
        this.price = "";
      } else {
        this.price = str1;
      } 
      this.icon_info = paramBuilder.icon_info;
      str1 = paramBuilder.price2;
      if (str1 == null) {
        this.price2 = "";
      } else {
        this.price2 = str1;
      } 
      str1 = paramBuilder.button_text2;
      if (str1 == null) {
        this.button_text2 = "";
      } else {
        this.button_text2 = str1;
      } 
      str = paramBuilder.button_link2;
      if (str == null) {
        this.button_link2 = "";
      } else {
        this.button_link2 = str;
      } 
    } else {
      this.forum_avatar = ((Builder)str).forum_avatar;
      this.forum_name = ((Builder)str).forum_name;
      this.show_num = ((Builder)str).show_num;
      this.show_type = ((Builder)str).show_type;
      this.recommend_reason = ((Builder)str).recommend_reason;
      this.topic_id = ((Builder)str).topic_id;
      this.recommend_type = ((Builder)str).recommend_type;
      this.recommend_tail = ((Builder)str).recommend_tail;
      this.recommend_icon = ((Builder)str).recommend_icon;
      this.recommend_type_color = ((Builder)str).recommend_type_color;
      this.recommend_reason_color = ((Builder)str).recommend_reason_color;
      this.strip_color = ((Builder)str).strip_color;
      this.background_color = ((Builder)str).background_color;
      this.jump_link = ((Builder)str).jump_link;
      this.business_type = ((Builder)str).business_type;
      this.business_id = ((Builder)str).business_id;
      this.jump_icon = ((Builder)str).jump_icon;
      this.jump_text = ((Builder)str).jump_text;
      this.jump_text_color = ((Builder)str).jump_text_color;
      this.dot_color = ((Builder)str).dot_color;
      this.tail_color = ((Builder)str).tail_color;
      this.style_type = ((Builder)str).style_type;
      this.topic_tag = ((Builder)str).topic_tag;
      this.countdown = ((Builder)str).countdown;
      this.business_info = Message.immutableCopyOf(((Builder)str).business_info);
      this.recommend_icon_background = ((Builder)str).recommend_icon_background;
      this.button_text = ((Builder)str).button_text;
      this.button_text_color = ((Builder)str).button_text_color;
      this.button_color = ((Builder)str).button_color;
      this.button_link = ((Builder)str).button_link;
      this.log_param = Message.immutableCopyOf(((Builder)str).log_param);
      this.price = ((Builder)str).price;
      this.icon_info = ((Builder)str).icon_info;
      this.price2 = ((Builder)str).price2;
      this.button_text2 = ((Builder)str).button_text2;
      this.button_link2 = ((Builder)str).button_link2;
    } 
  }
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SHOW_NUM = integer;
  }
  
  public static final class Builder extends Message.Builder<ThreadRecommendInfo> {
    public ThemeColorInfo background_color;
    
    public String business_id;
    
    public List<FeedKV> business_info;
    
    public Integer business_type;
    
    public ThemeColorInfo button_color;
    
    public String button_link;
    
    public String button_link2;
    
    public String button_text;
    
    public String button_text2;
    
    public ThemeColorInfo button_text_color;
    
    public FeedCountdown countdown;
    
    public ThemeColorInfo dot_color;
    
    public String forum_avatar;
    
    public String forum_name;
    
    public ThemeColorInfo icon_info;
    
    public String jump_icon;
    
    public String jump_link;
    
    public String jump_text;
    
    public ThemeColorInfo jump_text_color;
    
    public List<FeedKV> log_param;
    
    public String price;
    
    public String price2;
    
    public String recommend_icon;
    
    public String recommend_icon_background;
    
    public String recommend_reason;
    
    public ThemeColorInfo recommend_reason_color;
    
    public String recommend_tail;
    
    public String recommend_type;
    
    public ThemeColorInfo recommend_type_color;
    
    public Integer show_num;
    
    public String show_type;
    
    public ThemeColorInfo strip_color;
    
    public Integer style_type;
    
    public ThemeColorInfo tail_color;
    
    public Long topic_id;
    
    public String topic_tag;
    
    public Builder() {}
    
    public Builder(ThreadRecommendInfo param1ThreadRecommendInfo) {
      super(param1ThreadRecommendInfo);
      if (param1ThreadRecommendInfo == null)
        return; 
      this.forum_avatar = param1ThreadRecommendInfo.forum_avatar;
      this.forum_name = param1ThreadRecommendInfo.forum_name;
      this.show_num = param1ThreadRecommendInfo.show_num;
      this.show_type = param1ThreadRecommendInfo.show_type;
      this.recommend_reason = param1ThreadRecommendInfo.recommend_reason;
      this.topic_id = param1ThreadRecommendInfo.topic_id;
      this.recommend_type = param1ThreadRecommendInfo.recommend_type;
      this.recommend_tail = param1ThreadRecommendInfo.recommend_tail;
      this.recommend_icon = param1ThreadRecommendInfo.recommend_icon;
      this.recommend_type_color = param1ThreadRecommendInfo.recommend_type_color;
      this.recommend_reason_color = param1ThreadRecommendInfo.recommend_reason_color;
      this.strip_color = param1ThreadRecommendInfo.strip_color;
      this.background_color = param1ThreadRecommendInfo.background_color;
      this.jump_link = param1ThreadRecommendInfo.jump_link;
      this.business_type = param1ThreadRecommendInfo.business_type;
      this.business_id = param1ThreadRecommendInfo.business_id;
      this.jump_icon = param1ThreadRecommendInfo.jump_icon;
      this.jump_text = param1ThreadRecommendInfo.jump_text;
      this.jump_text_color = param1ThreadRecommendInfo.jump_text_color;
      this.dot_color = param1ThreadRecommendInfo.dot_color;
      this.tail_color = param1ThreadRecommendInfo.tail_color;
      this.style_type = param1ThreadRecommendInfo.style_type;
      this.topic_tag = param1ThreadRecommendInfo.topic_tag;
      this.countdown = param1ThreadRecommendInfo.countdown;
      this.business_info = Message.copyOf(param1ThreadRecommendInfo.business_info);
      this.recommend_icon_background = param1ThreadRecommendInfo.recommend_icon_background;
      this.button_text = param1ThreadRecommendInfo.button_text;
      this.button_text_color = param1ThreadRecommendInfo.button_text_color;
      this.button_color = param1ThreadRecommendInfo.button_color;
      this.button_link = param1ThreadRecommendInfo.button_link;
      this.log_param = Message.copyOf(param1ThreadRecommendInfo.log_param);
      this.price = param1ThreadRecommendInfo.price;
      this.icon_info = param1ThreadRecommendInfo.icon_info;
      this.price2 = param1ThreadRecommendInfo.price2;
      this.button_text2 = param1ThreadRecommendInfo.button_text2;
      this.button_link2 = param1ThreadRecommendInfo.button_link2;
    }
    
    public ThreadRecommendInfo build(boolean param1Boolean) {
      return new ThreadRecommendInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
