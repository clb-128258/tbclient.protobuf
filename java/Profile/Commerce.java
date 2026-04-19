package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Commerce extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_IOS_SCHEMA = "";
  
  public static final Boolean DEFAULT_IS_NUM_SMART;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_NEED_FILTER;
  
  public static final Long DEFAULT_RED_POINT_VERSION = Long.valueOf(0L);
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final String DEFAULT_SLOGAN = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String ios_schema;
  
  @ProtoField(tag = 7, type = Message.Datatype.BOOL)
  public final Boolean is_num_smart;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer need_filter;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long red_point_version;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String slogan;
  
  static {
    DEFAULT_IS_NUM_SMART = Boolean.FALSE;
    DEFAULT_NEED_FILTER = Integer.valueOf(0);
  }
  
  public Commerce(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.content;
      if (str2 == null) {
        this.content = "";
      } else {
        this.content = str2;
      } 
      str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      str2 = paramBuilder.icon;
      if (str2 == null) {
        this.icon = "";
      } else {
        this.icon = str2;
      } 
      str2 = paramBuilder.schema;
      if (str2 == null) {
        this.schema = "";
      } else {
        this.schema = str2;
      } 
      str2 = paramBuilder.slogan;
      if (str2 == null) {
        this.slogan = "";
      } else {
        this.slogan = str2;
      } 
      Long long_ = paramBuilder.red_point_version;
      if (long_ == null) {
        this.red_point_version = DEFAULT_RED_POINT_VERSION;
      } else {
        this.red_point_version = long_;
      } 
      Boolean bool = paramBuilder.is_num_smart;
      if (bool == null) {
        this.is_num_smart = DEFAULT_IS_NUM_SMART;
      } else {
        this.is_num_smart = bool;
      } 
      Integer integer = paramBuilder.need_filter;
      if (integer == null) {
        this.need_filter = DEFAULT_NEED_FILTER;
      } else {
        this.need_filter = integer;
      } 
      String str1 = paramBuilder.ios_schema;
      if (str1 == null) {
        this.ios_schema = "";
      } else {
        this.ios_schema = str1;
      } 
      str = paramBuilder.icon_url;
      if (str == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str;
      } 
    } else {
      this.content = ((Builder)str).content;
      this.name = ((Builder)str).name;
      this.icon = ((Builder)str).icon;
      this.schema = ((Builder)str).schema;
      this.slogan = ((Builder)str).slogan;
      this.red_point_version = ((Builder)str).red_point_version;
      this.is_num_smart = ((Builder)str).is_num_smart;
      this.need_filter = ((Builder)str).need_filter;
      this.ios_schema = ((Builder)str).ios_schema;
      this.icon_url = ((Builder)str).icon_url;
    } 
  }
  
  public static final class Builder extends Message.Builder<Commerce> {
    public String content;
    
    public String icon;
    
    public String icon_url;
    
    public String ios_schema;
    
    public Boolean is_num_smart;
    
    public String name;
    
    public Integer need_filter;
    
    public Long red_point_version;
    
    public String schema;
    
    public String slogan;
    
    public Builder() {}
    
    public Builder(Commerce param1Commerce) {
      super(param1Commerce);
      if (param1Commerce == null)
        return; 
      this.content = param1Commerce.content;
      this.name = param1Commerce.name;
      this.icon = param1Commerce.icon;
      this.schema = param1Commerce.schema;
      this.slogan = param1Commerce.slogan;
      this.red_point_version = param1Commerce.red_point_version;
      this.is_num_smart = param1Commerce.is_num_smart;
      this.need_filter = param1Commerce.need_filter;
      this.ios_schema = param1Commerce.ios_schema;
      this.icon_url = param1Commerce.icon_url;
    }
    
    public Commerce build(boolean param1Boolean) {
      return new Commerce(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
