package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ShortUserInfo extends Message {
  public static final Integer DEFAULT_GENDER;
  
  public static final String DEFAULT_INTRO = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer gender;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 6)
  public final NewGodInfo new_god_data;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    DEFAULT_GENDER = Integer.valueOf(0);
  }
  
  public ShortUserInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      str2 = paramBuilder.user_name;
      if (str2 == null) {
        this.user_name = "";
      } else {
        this.user_name = str2;
      } 
      Integer integer = paramBuilder.gender;
      if (integer == null) {
        this.gender = DEFAULT_GENDER;
      } else {
        this.gender = integer;
      } 
      String str1 = paramBuilder.intro;
      if (str1 == null) {
        this.intro = "";
      } else {
        this.intro = str1;
      } 
      this.new_god_data = paramBuilder.new_god_data;
    } else {
      this.user_id = paramBuilder.user_id;
      this.portrait = paramBuilder.portrait;
      this.user_name = paramBuilder.user_name;
      this.gender = paramBuilder.gender;
      this.intro = paramBuilder.intro;
      this.new_god_data = paramBuilder.new_god_data;
    } 
  }
  
  public static final class Builder extends Message.Builder<ShortUserInfo> {
    public Integer gender;
    
    public String intro;
    
    public NewGodInfo new_god_data;
    
    public String portrait;
    
    public Long user_id;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(ShortUserInfo param1ShortUserInfo) {
      super(param1ShortUserInfo);
      if (param1ShortUserInfo == null)
        return; 
      this.user_id = param1ShortUserInfo.user_id;
      this.portrait = param1ShortUserInfo.portrait;
      this.user_name = param1ShortUserInfo.user_name;
      this.gender = param1ShortUserInfo.gender;
      this.intro = param1ShortUserInfo.intro;
      this.new_god_data = param1ShortUserInfo.new_god_data;
    }
    
    public ShortUserInfo build(boolean param1Boolean) {
      return new ShortUserInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
