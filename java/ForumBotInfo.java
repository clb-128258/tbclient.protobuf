package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumBotInfo extends Message {
  public static final Long DEFAULT_BOT_UID;
  
  public static final String DEFAULT_BRIEF = "";
  
  public static final Long DEFAULT_CREATE_UID;
  
  public static final String DEFAULT_CREATE_USERNAME = "";
  
  public static final Integer DEFAULT_FID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_GREETING = "";
  
  public static final Integer DEFAULT_IS_FORUM_BOT;
  
  public static final Long DEFAULT_PA;
  
  public static final String DEFAULT_UK = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long bot_uid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String brief;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long create_uid;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String create_username;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer fid;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String greeting;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_forum_bot;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long pa;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String uk;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_FORUM_BOT = integer;
    DEFAULT_FID = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_BOT_UID = long_;
    DEFAULT_CREATE_UID = long_;
    DEFAULT_PA = long_;
  }
  
  public ForumBotInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.is_forum_bot;
      if (integer2 == null) {
        this.is_forum_bot = DEFAULT_IS_FORUM_BOT;
      } else {
        this.is_forum_bot = integer2;
      } 
      String str2 = paramBuilder.brief;
      if (str2 == null) {
        this.brief = "";
      } else {
        this.brief = str2;
      } 
      str2 = paramBuilder.forum_name;
      if (str2 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str2;
      } 
      Integer integer1 = paramBuilder.fid;
      if (integer1 == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = integer1;
      } 
      Long long_2 = paramBuilder.bot_uid;
      if (long_2 == null) {
        this.bot_uid = DEFAULT_BOT_UID;
      } else {
        this.bot_uid = long_2;
      } 
      long_2 = paramBuilder.create_uid;
      if (long_2 == null) {
        this.create_uid = DEFAULT_CREATE_UID;
      } else {
        this.create_uid = long_2;
      } 
      String str1 = paramBuilder.create_username;
      if (str1 == null) {
        this.create_username = "";
      } else {
        this.create_username = str1;
      } 
      str1 = paramBuilder.uk;
      if (str1 == null) {
        this.uk = "";
      } else {
        this.uk = str1;
      } 
      Long long_1 = paramBuilder.pa;
      if (long_1 == null) {
        this.pa = DEFAULT_PA;
      } else {
        this.pa = long_1;
      } 
      str = paramBuilder.greeting;
      if (str == null) {
        this.greeting = "";
      } else {
        this.greeting = str;
      } 
    } else {
      this.is_forum_bot = ((Builder)str).is_forum_bot;
      this.brief = ((Builder)str).brief;
      this.forum_name = ((Builder)str).forum_name;
      this.fid = ((Builder)str).fid;
      this.bot_uid = ((Builder)str).bot_uid;
      this.create_uid = ((Builder)str).create_uid;
      this.create_username = ((Builder)str).create_username;
      this.uk = ((Builder)str).uk;
      this.pa = ((Builder)str).pa;
      this.greeting = ((Builder)str).greeting;
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumBotInfo> {
    public Long bot_uid;
    
    public String brief;
    
    public Long create_uid;
    
    public String create_username;
    
    public Integer fid;
    
    public String forum_name;
    
    public String greeting;
    
    public Integer is_forum_bot;
    
    public Long pa;
    
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
    }
    
    public ForumBotInfo build(boolean param1Boolean) {
      return new ForumBotInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
