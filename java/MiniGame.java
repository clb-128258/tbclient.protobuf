package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class MiniGame extends Message {
  public static final Long DEFAULT_APP_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_APP_NAME = "";
  
  public static final Integer DEFAULT_APP_TYPE;
  
  public static final String DEFAULT_ICON = "";
  
  public static final Integer DEFAULT_IS_RECOMMEND;
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final String DEFAULT_RESOURCE_KEY = "";
  
  public static final String DEFAULT_SHOW_TAG = "";
  
  public static final Integer DEFAULT_SOURCE;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long app_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String app_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer app_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_recommend;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 11)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String resource_key;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String show_tag;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer source;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_APP_TYPE = integer;
    DEFAULT_SOURCE = integer;
    DEFAULT_IS_RECOMMEND = integer;
    DEFAULT_LOG_PARAM = Collections.emptyList();
  }
  
  public MiniGame(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.app_id;
      if (long_ == null) {
        this.app_id = DEFAULT_APP_ID;
      } else {
        this.app_id = long_;
      } 
      String str3 = paramBuilder.app_name;
      if (str3 == null) {
        this.app_name = "";
      } else {
        this.app_name = str3;
      } 
      Integer integer2 = paramBuilder.app_type;
      if (integer2 == null) {
        this.app_type = DEFAULT_APP_TYPE;
      } else {
        this.app_type = integer2;
      } 
      String str2 = paramBuilder.icon;
      if (str2 == null) {
        this.icon = "";
      } else {
        this.icon = str2;
      } 
      str2 = paramBuilder.resource_key;
      if (str2 == null) {
        this.resource_key = "";
      } else {
        this.resource_key = str2;
      } 
      Integer integer1 = paramBuilder.source;
      if (integer1 == null) {
        this.source = DEFAULT_SOURCE;
      } else {
        this.source = integer1;
      } 
      integer1 = paramBuilder.is_recommend;
      if (integer1 == null) {
        this.is_recommend = DEFAULT_IS_RECOMMEND;
      } else {
        this.is_recommend = integer1;
      } 
      String str1 = paramBuilder.show_tag;
      if (str1 == null) {
        this.show_tag = "";
      } else {
        this.show_tag = str1;
      } 
      str1 = paramBuilder.jump_url;
      if (str1 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str1;
      } 
      list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
    } else {
      this.app_id = ((Builder)list).app_id;
      this.app_name = ((Builder)list).app_name;
      this.app_type = ((Builder)list).app_type;
      this.icon = ((Builder)list).icon;
      this.resource_key = ((Builder)list).resource_key;
      this.source = ((Builder)list).source;
      this.is_recommend = ((Builder)list).is_recommend;
      this.show_tag = ((Builder)list).show_tag;
      this.jump_url = ((Builder)list).jump_url;
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
    } 
  }
  
  public static final class Builder extends Message.Builder<MiniGame> {
    public Long app_id;
    
    public String app_name;
    
    public Integer app_type;
    
    public String icon;
    
    public Integer is_recommend;
    
    public String jump_url;
    
    public List<FeedKV> log_param;
    
    public String resource_key;
    
    public String show_tag;
    
    public Integer source;
    
    public Builder() {}
    
    public Builder(MiniGame param1MiniGame) {
      super(param1MiniGame);
      if (param1MiniGame == null)
        return; 
      this.app_id = param1MiniGame.app_id;
      this.app_name = param1MiniGame.app_name;
      this.app_type = param1MiniGame.app_type;
      this.icon = param1MiniGame.icon;
      this.resource_key = param1MiniGame.resource_key;
      this.source = param1MiniGame.source;
      this.is_recommend = param1MiniGame.is_recommend;
      this.show_tag = param1MiniGame.show_tag;
      this.jump_url = param1MiniGame.jump_url;
      this.log_param = Message.copyOf(param1MiniGame.log_param);
    }
    
    public MiniGame build(boolean param1Boolean) {
      return new MiniGame(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
