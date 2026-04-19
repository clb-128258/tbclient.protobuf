package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class BotUser extends Message {
  public static final String DEFAULT_BOT_AVATAR = "";
  
  public static final Integer DEFAULT_DIALOGUE_USER_NUM;
  
  public static final Integer DEFAULT_ONLINE_STATUS;
  
  public static final Integer DEFAULT_PA_TYPE;
  
  public static final Double DEFAULT_RATE;
  
  public static final Integer DEFAULT_ROBOT_VERSION;
  
  public static final String DEFAULT_ROLE_TYPE = "";
  
  public static final List<BotTags> DEFAULT_TAGS;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String bot_avatar;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer dialogue_user_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer online_status;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer pa_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.DOUBLE)
  public final Double rate;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer robot_version;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String role_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<BotTags> tags;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ONLINE_STATUS = integer;
    DEFAULT_PA_TYPE = integer;
    DEFAULT_DIALOGUE_USER_NUM = integer;
    DEFAULT_RATE = Double.valueOf(0.0D);
    DEFAULT_TAGS = Collections.emptyList();
    DEFAULT_ROBOT_VERSION = integer;
  }
  
  public BotUser(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.online_status;
      if (integer2 == null) {
        this.online_status = DEFAULT_ONLINE_STATUS;
      } else {
        this.online_status = integer2;
      } 
      String str2 = paramBuilder.bot_avatar;
      if (str2 == null) {
        this.bot_avatar = "";
      } else {
        this.bot_avatar = str2;
      } 
      Integer integer1 = paramBuilder.pa_type;
      if (integer1 == null) {
        this.pa_type = DEFAULT_PA_TYPE;
      } else {
        this.pa_type = integer1;
      } 
      integer1 = paramBuilder.dialogue_user_num;
      if (integer1 == null) {
        this.dialogue_user_num = DEFAULT_DIALOGUE_USER_NUM;
      } else {
        this.dialogue_user_num = integer1;
      } 
      Double double_ = paramBuilder.rate;
      if (double_ == null) {
        this.rate = DEFAULT_RATE;
      } else {
        this.rate = double_;
      } 
      String str1 = paramBuilder.role_type;
      if (str1 == null) {
        this.role_type = "";
      } else {
        this.role_type = str1;
      } 
      List<BotTags> list = paramBuilder.tags;
      if (list == null) {
        this.tags = DEFAULT_TAGS;
      } else {
        this.tags = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.robot_version;
      if (integer == null) {
        this.robot_version = DEFAULT_ROBOT_VERSION;
      } else {
        this.robot_version = integer;
      } 
    } else {
      this.online_status = ((Builder)integer).online_status;
      this.bot_avatar = ((Builder)integer).bot_avatar;
      this.pa_type = ((Builder)integer).pa_type;
      this.dialogue_user_num = ((Builder)integer).dialogue_user_num;
      this.rate = ((Builder)integer).rate;
      this.role_type = ((Builder)integer).role_type;
      this.tags = Message.immutableCopyOf(((Builder)integer).tags);
      this.robot_version = ((Builder)integer).robot_version;
    } 
  }
  
  public static final class Builder extends Message.Builder<BotUser> {
    public String bot_avatar;
    
    public Integer dialogue_user_num;
    
    public Integer online_status;
    
    public Integer pa_type;
    
    public Double rate;
    
    public Integer robot_version;
    
    public String role_type;
    
    public List<BotTags> tags;
    
    public Builder() {}
    
    public Builder(BotUser param1BotUser) {
      super(param1BotUser);
      if (param1BotUser == null)
        return; 
      this.online_status = param1BotUser.online_status;
      this.bot_avatar = param1BotUser.bot_avatar;
      this.pa_type = param1BotUser.pa_type;
      this.dialogue_user_num = param1BotUser.dialogue_user_num;
      this.rate = param1BotUser.rate;
      this.role_type = param1BotUser.role_type;
      this.tags = Message.copyOf(param1BotUser.tags);
      this.robot_version = param1BotUser.robot_version;
    }
    
    public BotUser build(boolean param1Boolean) {
      return new BotUser(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
