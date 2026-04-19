package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AiGameInfo extends Message {
  public static final String DEFAULT_ANSWER = "";
  
  public static final Long DEFAULT_ANSWER_FILTER_TIME;
  
  public static final Long DEFAULT_CREATOR_ID;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_GAME_ID = "";
  
  public static final String DEFAULT_GAME_TYPE = "";
  
  public static final String DEFAULT_H_IMAGE_URL = "";
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_IMAGE_URL = "";
  
  public static final Integer DEFAULT_INVITE_LIMIT;
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_LONG_DESC = "";
  
  public static final Integer DEFAULT_ORIENTATION;
  
  public static final String DEFAULT_ORIGIN_GAME_ID = "";
  
  public static final String DEFAULT_RECOM_ICON = "";
  
  public static final String DEFAULT_RECOM_TEXT = "";
  
  public static final String DEFAULT_SHORT_DESC = "";
  
  public static final Integer DEFAULT_STATUS;
  
  public static final String DEFAULT_SUMMARY = "";
  
  public static final Integer DEFAULT_TAG_OPTION;
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String answer;
  
  @ProtoField(tag = 22, type = Message.Datatype.INT64)
  public final Long answer_filter_time;
  
  @ProtoField(tag = 17, type = Message.Datatype.UINT64)
  public final Long creator_id;
  
  @ProtoField(tag = 20, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String game_id;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String game_type;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String h_image_url;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String image_url;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer invite_limit;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String long_desc;
  
  @ProtoField(tag = 16, type = Message.Datatype.UINT32)
  public final Integer orientation;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String origin_game_id;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String recom_icon;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String recom_text;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String short_desc;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer status;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String summary;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer tag_option;
  
  @ProtoField(tag = 21, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_STATUS = integer;
    DEFAULT_TAG_OPTION = integer;
    DEFAULT_INVITE_LIMIT = integer;
    DEFAULT_ORIENTATION = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_CREATOR_ID = long_;
    DEFAULT_FORUM_ID = long_;
    DEFAULT_THREAD_ID = long_;
    DEFAULT_ANSWER_FILTER_TIME = long_;
  }
  
  public AiGameInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str4 = paramBuilder.game_id;
      if (str4 == null) {
        this.game_id = "";
      } else {
        this.game_id = str4;
      } 
      str4 = paramBuilder.origin_game_id;
      if (str4 == null) {
        this.origin_game_id = "";
      } else {
        this.origin_game_id = str4;
      } 
      Integer integer3 = paramBuilder.status;
      if (integer3 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer3;
      } 
      String str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      str3 = paramBuilder.summary;
      if (str3 == null) {
        this.summary = "";
      } else {
        this.summary = str3;
      } 
      str3 = paramBuilder.short_desc;
      if (str3 == null) {
        this.short_desc = "";
      } else {
        this.short_desc = str3;
      } 
      str3 = paramBuilder.long_desc;
      if (str3 == null) {
        this.long_desc = "";
      } else {
        this.long_desc = str3;
      } 
      Integer integer2 = paramBuilder.tag_option;
      if (integer2 == null) {
        this.tag_option = DEFAULT_TAG_OPTION;
      } else {
        this.tag_option = integer2;
      } 
      integer2 = paramBuilder.invite_limit;
      if (integer2 == null) {
        this.invite_limit = DEFAULT_INVITE_LIMIT;
      } else {
        this.invite_limit = integer2;
      } 
      String str2 = paramBuilder.recom_text;
      if (str2 == null) {
        this.recom_text = "";
      } else {
        this.recom_text = str2;
      } 
      str2 = paramBuilder.recom_icon;
      if (str2 == null) {
        this.recom_icon = "";
      } else {
        this.recom_icon = str2;
      } 
      str2 = paramBuilder.image_url;
      if (str2 == null) {
        this.image_url = "";
      } else {
        this.image_url = str2;
      } 
      str2 = paramBuilder.icon_url;
      if (str2 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str2;
      } 
      str2 = paramBuilder.game_type;
      if (str2 == null) {
        this.game_type = "";
      } else {
        this.game_type = str2;
      } 
      str2 = paramBuilder.jump_url;
      if (str2 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str2;
      } 
      Integer integer1 = paramBuilder.orientation;
      if (integer1 == null) {
        this.orientation = DEFAULT_ORIENTATION;
      } else {
        this.orientation = integer1;
      } 
      Long long_2 = paramBuilder.creator_id;
      if (long_2 == null) {
        this.creator_id = DEFAULT_CREATOR_ID;
      } else {
        this.creator_id = long_2;
      } 
      String str1 = paramBuilder.h_image_url;
      if (str1 == null) {
        this.h_image_url = "";
      } else {
        this.h_image_url = str1;
      } 
      str1 = paramBuilder.answer;
      if (str1 == null) {
        this.answer = "";
      } else {
        this.answer = str1;
      } 
      Long long_1 = paramBuilder.forum_id;
      if (long_1 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_1;
      } 
      long_1 = paramBuilder.thread_id;
      if (long_1 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_1;
      } 
      long_ = paramBuilder.answer_filter_time;
      if (long_ == null) {
        this.answer_filter_time = DEFAULT_ANSWER_FILTER_TIME;
      } else {
        this.answer_filter_time = long_;
      } 
    } else {
      this.game_id = ((Builder)long_).game_id;
      this.origin_game_id = ((Builder)long_).origin_game_id;
      this.status = ((Builder)long_).status;
      this.title = ((Builder)long_).title;
      this.summary = ((Builder)long_).summary;
      this.short_desc = ((Builder)long_).short_desc;
      this.long_desc = ((Builder)long_).long_desc;
      this.tag_option = ((Builder)long_).tag_option;
      this.invite_limit = ((Builder)long_).invite_limit;
      this.recom_text = ((Builder)long_).recom_text;
      this.recom_icon = ((Builder)long_).recom_icon;
      this.image_url = ((Builder)long_).image_url;
      this.icon_url = ((Builder)long_).icon_url;
      this.game_type = ((Builder)long_).game_type;
      this.jump_url = ((Builder)long_).jump_url;
      this.orientation = ((Builder)long_).orientation;
      this.creator_id = ((Builder)long_).creator_id;
      this.h_image_url = ((Builder)long_).h_image_url;
      this.answer = ((Builder)long_).answer;
      this.forum_id = ((Builder)long_).forum_id;
      this.thread_id = ((Builder)long_).thread_id;
      this.answer_filter_time = ((Builder)long_).answer_filter_time;
    } 
  }
  
  public static final class Builder extends Message.Builder<AiGameInfo> {
    public String answer;
    
    public Long answer_filter_time;
    
    public Long creator_id;
    
    public Long forum_id;
    
    public String game_id;
    
    public String game_type;
    
    public String h_image_url;
    
    public String icon_url;
    
    public String image_url;
    
    public Integer invite_limit;
    
    public String jump_url;
    
    public String long_desc;
    
    public Integer orientation;
    
    public String origin_game_id;
    
    public String recom_icon;
    
    public String recom_text;
    
    public String short_desc;
    
    public Integer status;
    
    public String summary;
    
    public Integer tag_option;
    
    public Long thread_id;
    
    public String title;
    
    public Builder() {}
    
    public Builder(AiGameInfo param1AiGameInfo) {
      super(param1AiGameInfo);
      if (param1AiGameInfo == null)
        return; 
      this.game_id = param1AiGameInfo.game_id;
      this.origin_game_id = param1AiGameInfo.origin_game_id;
      this.status = param1AiGameInfo.status;
      this.title = param1AiGameInfo.title;
      this.summary = param1AiGameInfo.summary;
      this.short_desc = param1AiGameInfo.short_desc;
      this.long_desc = param1AiGameInfo.long_desc;
      this.tag_option = param1AiGameInfo.tag_option;
      this.invite_limit = param1AiGameInfo.invite_limit;
      this.recom_text = param1AiGameInfo.recom_text;
      this.recom_icon = param1AiGameInfo.recom_icon;
      this.image_url = param1AiGameInfo.image_url;
      this.icon_url = param1AiGameInfo.icon_url;
      this.game_type = param1AiGameInfo.game_type;
      this.jump_url = param1AiGameInfo.jump_url;
      this.orientation = param1AiGameInfo.orientation;
      this.creator_id = param1AiGameInfo.creator_id;
      this.h_image_url = param1AiGameInfo.h_image_url;
      this.answer = param1AiGameInfo.answer;
      this.forum_id = param1AiGameInfo.forum_id;
      this.thread_id = param1AiGameInfo.thread_id;
      this.answer_filter_time = param1AiGameInfo.answer_filter_time;
    }
    
    public AiGameInfo build(boolean param1Boolean) {
      return new AiGameInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
