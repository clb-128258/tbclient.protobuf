package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CommonFunc extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_IOS_SCHEMA = "";
  
  public static final Long DEFAULT_LEVEL_ID;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_NEED_FILTER;
  
  public static final Long DEFAULT_RED_POINT_VERSION;
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final Long DEFAULT_SCORE;
  
  public static final String DEFAULT_SLOGAN = "";
  
  public static final Long DEFAULT_TARGET_SCORE;
  
  public static final Integer DEFAULT_TASK_PAGE_SIGN_STATUS;
  
  public static final Long DEFAULT_TMONEY;
  
  public static final String DEFAULT_TYPE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String ios_schema;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long level_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer need_filter;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long red_point_version;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long score;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String slogan;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long target_score;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer task_page_sign_status;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long tmoney;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String type;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_LEVEL_ID = long_;
    DEFAULT_SCORE = long_;
    DEFAULT_TARGET_SCORE = long_;
    DEFAULT_TMONEY = long_;
    DEFAULT_RED_POINT_VERSION = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_NEED_FILTER = integer;
    DEFAULT_TASK_PAGE_SIGN_STATUS = integer;
  }
  
  public CommonFunc(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str3 = paramBuilder.type;
      if (str3 == null) {
        this.type = "";
      } else {
        this.type = str3;
      } 
      str3 = paramBuilder.name;
      if (str3 == null) {
        this.name = "";
      } else {
        this.name = str3;
      } 
      str3 = paramBuilder.icon;
      if (str3 == null) {
        this.icon = "";
      } else {
        this.icon = str3;
      } 
      str3 = paramBuilder.schema;
      if (str3 == null) {
        this.schema = "";
      } else {
        this.schema = str3;
      } 
      Long long_2 = paramBuilder.level_id;
      if (long_2 == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = long_2;
      } 
      long_2 = paramBuilder.score;
      if (long_2 == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = long_2;
      } 
      long_2 = paramBuilder.target_score;
      if (long_2 == null) {
        this.target_score = DEFAULT_TARGET_SCORE;
      } else {
        this.target_score = long_2;
      } 
      String str2 = paramBuilder.slogan;
      if (str2 == null) {
        this.slogan = "";
      } else {
        this.slogan = str2;
      } 
      Long long_1 = paramBuilder.tmoney;
      if (long_1 == null) {
        this.tmoney = DEFAULT_TMONEY;
      } else {
        this.tmoney = long_1;
      } 
      long_1 = paramBuilder.red_point_version;
      if (long_1 == null) {
        this.red_point_version = DEFAULT_RED_POINT_VERSION;
      } else {
        this.red_point_version = long_1;
      } 
      Integer integer1 = paramBuilder.need_filter;
      if (integer1 == null) {
        this.need_filter = DEFAULT_NEED_FILTER;
      } else {
        this.need_filter = integer1;
      } 
      String str1 = paramBuilder.ios_schema;
      if (str1 == null) {
        this.ios_schema = "";
      } else {
        this.ios_schema = str1;
      } 
      integer = paramBuilder.task_page_sign_status;
      if (integer == null) {
        this.task_page_sign_status = DEFAULT_TASK_PAGE_SIGN_STATUS;
      } else {
        this.task_page_sign_status = integer;
      } 
    } else {
      this.type = ((Builder)integer).type;
      this.name = ((Builder)integer).name;
      this.icon = ((Builder)integer).icon;
      this.schema = ((Builder)integer).schema;
      this.level_id = ((Builder)integer).level_id;
      this.score = ((Builder)integer).score;
      this.target_score = ((Builder)integer).target_score;
      this.slogan = ((Builder)integer).slogan;
      this.tmoney = ((Builder)integer).tmoney;
      this.red_point_version = ((Builder)integer).red_point_version;
      this.need_filter = ((Builder)integer).need_filter;
      this.ios_schema = ((Builder)integer).ios_schema;
      this.task_page_sign_status = ((Builder)integer).task_page_sign_status;
    } 
  }
  
  public static final class Builder extends Message.Builder<CommonFunc> {
    public String icon;
    
    public String ios_schema;
    
    public Long level_id;
    
    public String name;
    
    public Integer need_filter;
    
    public Long red_point_version;
    
    public String schema;
    
    public Long score;
    
    public String slogan;
    
    public Long target_score;
    
    public Integer task_page_sign_status;
    
    public Long tmoney;
    
    public String type;
    
    public Builder() {}
    
    public Builder(CommonFunc param1CommonFunc) {
      super(param1CommonFunc);
      if (param1CommonFunc == null)
        return; 
      this.type = param1CommonFunc.type;
      this.name = param1CommonFunc.name;
      this.icon = param1CommonFunc.icon;
      this.schema = param1CommonFunc.schema;
      this.level_id = param1CommonFunc.level_id;
      this.score = param1CommonFunc.score;
      this.target_score = param1CommonFunc.target_score;
      this.slogan = param1CommonFunc.slogan;
      this.tmoney = param1CommonFunc.tmoney;
      this.red_point_version = param1CommonFunc.red_point_version;
      this.need_filter = param1CommonFunc.need_filter;
      this.ios_schema = param1CommonFunc.ios_schema;
      this.task_page_sign_status = param1CommonFunc.task_page_sign_status;
    }
    
    public CommonFunc build(boolean param1Boolean) {
      return new CommonFunc(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
