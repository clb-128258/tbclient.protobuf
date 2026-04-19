package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumBotInfo extends Message {
  public static final String DEFAULT_BOT_BACKGROUND = "";
  
  public static final Integer DEFAULT_BOT_TYPE;
  
  public static final Long DEFAULT_BOT_UID;
  
  public static final String DEFAULT_BRIEF = "";
  
  public static final String DEFAULT_BUBBLE_BG_COLOR = "";
  
  public static final Long DEFAULT_CHAT_NUM;
  
  public static final Long DEFAULT_CREATE_UID;
  
  public static final String DEFAULT_CREATE_USERNAME = "";
  
  public static final Long DEFAULT_FID;
  
  public static final Long DEFAULT_FOLLOW_NUM;
  
  public static final String DEFAULT_FORUM_ICON = "";
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_GREETING = "";
  
  public static final Integer DEFAULT_IS_FOLLOW;
  
  public static final Integer DEFAULT_IS_FORUM_BOT;
  
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final Long DEFAULT_LIKE_NUM;
  
  public static final Long DEFAULT_PA;
  
  public static final String DEFAULT_THEME_COLOR = "";
  
  public static final String DEFAULT_UK = "";
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String bot_background;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer bot_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT64)
  public final Long bot_uid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String brief;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String bubble_bg_color;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT64)
  public final Long chat_num;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long create_uid;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String create_username;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long fid;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT64)
  public final Long follow_num;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String forum_icon;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String greeting;
  
  @ProtoField(tag = 20, type = Message.Datatype.UINT32)
  public final Integer is_follow;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_forum_bot;
  
  @ProtoField(tag = 17, type = Message.Datatype.UINT32)
  public final Integer is_like;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT64)
  public final Long like_num;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT64)
  public final Long pa;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String theme_color;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String uk;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_FORUM_BOT = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_FID = long_;
    DEFAULT_BOT_UID = long_;
    DEFAULT_CREATE_UID = long_;
    DEFAULT_PA = long_;
    DEFAULT_BOT_TYPE = integer;
    DEFAULT_CHAT_NUM = long_;
    DEFAULT_LIKE_NUM = long_;
    DEFAULT_FOLLOW_NUM = long_;
    DEFAULT_IS_LIKE = integer;
    DEFAULT_IS_FOLLOW = integer;
  }
  
  public ForumBotInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer3 = paramBuilder.is_forum_bot;
      if (integer3 == null) {
        this.is_forum_bot = DEFAULT_IS_FORUM_BOT;
      } else {
        this.is_forum_bot = integer3;
      } 
      String str5 = paramBuilder.brief;
      if (str5 == null) {
        this.brief = "";
      } else {
        this.brief = str5;
      } 
      str5 = paramBuilder.forum_name;
      if (str5 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str5;
      } 
      Long long_3 = paramBuilder.fid;
      if (long_3 == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_3;
      } 
      long_3 = paramBuilder.bot_uid;
      if (long_3 == null) {
        this.bot_uid = DEFAULT_BOT_UID;
      } else {
        this.bot_uid = long_3;
      } 
      long_3 = paramBuilder.create_uid;
      if (long_3 == null) {
        this.create_uid = DEFAULT_CREATE_UID;
      } else {
        this.create_uid = long_3;
      } 
      String str4 = paramBuilder.create_username;
      if (str4 == null) {
        this.create_username = "";
      } else {
        this.create_username = str4;
      } 
      str4 = paramBuilder.uk;
      if (str4 == null) {
        this.uk = "";
      } else {
        this.uk = str4;
      } 
      Long long_2 = paramBuilder.pa;
      if (long_2 == null) {
        this.pa = DEFAULT_PA;
      } else {
        this.pa = long_2;
      } 
      String str3 = paramBuilder.greeting;
      if (str3 == null) {
        this.greeting = "";
      } else {
        this.greeting = str3;
      } 
      str3 = paramBuilder.bot_background;
      if (str3 == null) {
        this.bot_background = "";
      } else {
        this.bot_background = str3;
      } 
      Integer integer2 = paramBuilder.bot_type;
      if (integer2 == null) {
        this.bot_type = DEFAULT_BOT_TYPE;
      } else {
        this.bot_type = integer2;
      } 
      Long long_1 = paramBuilder.chat_num;
      if (long_1 == null) {
        this.chat_num = DEFAULT_CHAT_NUM;
      } else {
        this.chat_num = long_1;
      } 
      long_1 = paramBuilder.like_num;
      if (long_1 == null) {
        this.like_num = DEFAULT_LIKE_NUM;
      } else {
        this.like_num = long_1;
      } 
      long_1 = paramBuilder.follow_num;
      if (long_1 == null) {
        this.follow_num = DEFAULT_FOLLOW_NUM;
      } else {
        this.follow_num = long_1;
      } 
      String str2 = paramBuilder.forum_icon;
      if (str2 == null) {
        this.forum_icon = "";
      } else {
        this.forum_icon = str2;
      } 
      Integer integer1 = paramBuilder.is_like;
      if (integer1 == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer1;
      } 
      String str1 = paramBuilder.theme_color;
      if (str1 == null) {
        this.theme_color = "";
      } else {
        this.theme_color = str1;
      } 
      str1 = paramBuilder.bubble_bg_color;
      if (str1 == null) {
        this.bubble_bg_color = "";
      } else {
        this.bubble_bg_color = str1;
      } 
      integer = paramBuilder.is_follow;
      if (integer == null) {
        this.is_follow = DEFAULT_IS_FOLLOW;
      } else {
        this.is_follow = integer;
      } 
    } else {
      this.is_forum_bot = ((Builder)integer).is_forum_bot;
      this.brief = ((Builder)integer).brief;
      this.forum_name = ((Builder)integer).forum_name;
      this.fid = ((Builder)integer).fid;
      this.bot_uid = ((Builder)integer).bot_uid;
      this.create_uid = ((Builder)integer).create_uid;
      this.create_username = ((Builder)integer).create_username;
      this.uk = ((Builder)integer).uk;
      this.pa = ((Builder)integer).pa;
      this.greeting = ((Builder)integer).greeting;
      this.bot_background = ((Builder)integer).bot_background;
      this.bot_type = ((Builder)integer).bot_type;
      this.chat_num = ((Builder)integer).chat_num;
      this.like_num = ((Builder)integer).like_num;
      this.follow_num = ((Builder)integer).follow_num;
      this.forum_icon = ((Builder)integer).forum_icon;
      this.is_like = ((Builder)integer).is_like;
      this.theme_color = ((Builder)integer).theme_color;
      this.bubble_bg_color = ((Builder)integer).bubble_bg_color;
      this.is_follow = ((Builder)integer).is_follow;
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumBotInfo> {
    public String bot_background;
    
    public Integer bot_type;
    
    public Long bot_uid;
    
    public String brief;
    
    public String bubble_bg_color;
    
    public Long chat_num;
    
    public Long create_uid;
    
    public String create_username;
    
    public Long fid;
    
    public Long follow_num;
    
    public String forum_icon;
    
    public String forum_name;
    
    public String greeting;
    
    public Integer is_follow;
    
    public Integer is_forum_bot;
    
    public Integer is_like;
    
    public Long like_num;
    
    public Long pa;
    
    public String theme_color;
    
    public String uk;
    
    public Builder() {}
    
    public Builder(ForumBotInfo param1ForumBotInfo) {
      super(param1ForumBotInfo);
      if (param1ForumBotInfo == null)
        return; 
      this.is_forum_bot = param1ForumBotInfo.is_forum_bot;
      this.brief = param1ForumBotInfo.brief;
      this.forum_name = param1ForumBotInfo.forum_name;
      this.fid = param1ForumBotInfo.fid;
      this.bot_uid = param1ForumBotInfo.bot_uid;
      this.create_uid = param1ForumBotInfo.create_uid;
      this.create_username = param1ForumBotInfo.create_username;
      this.uk = param1ForumBotInfo.uk;
      this.pa = param1ForumBotInfo.pa;
      this.greeting = param1ForumBotInfo.greeting;
      this.bot_background = param1ForumBotInfo.bot_background;
      this.bot_type = param1ForumBotInfo.bot_type;
      this.chat_num = param1ForumBotInfo.chat_num;
      this.like_num = param1ForumBotInfo.like_num;
      this.follow_num = param1ForumBotInfo.follow_num;
      this.forum_icon = param1ForumBotInfo.forum_icon;
      this.is_like = param1ForumBotInfo.is_like;
      this.theme_color = param1ForumBotInfo.theme_color;
      this.bubble_bg_color = param1ForumBotInfo.bubble_bg_color;
      this.is_follow = param1ForumBotInfo.is_follow;
    }
    
    public ForumBotInfo build(boolean param1Boolean) {
      return new ForumBotInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
