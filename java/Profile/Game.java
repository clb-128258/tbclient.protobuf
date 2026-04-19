package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Game extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_IOS_SCHEMA = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_NEED_FILTER;
  
  public static final Long DEFAULT_RED_POINT_VERSION = Long.valueOf(0L);
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final String DEFAULT_SLOGAN = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String ios_schema;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer need_filter;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long red_point_version;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String slogan;
  
  static {
    DEFAULT_NEED_FILTER = Integer.valueOf(0);
  }
  
  public Game(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str1 = paramBuilder.schema;
      if (str1 == null) {
        this.schema = "";
      } else {
        this.schema = str1;
      } 
      str1 = paramBuilder.slogan;
      if (str1 == null) {
        this.slogan = "";
      } else {
        this.slogan = str1;
      } 
      Long long_ = paramBuilder.red_point_version;
      if (long_ == null) {
        this.red_point_version = DEFAULT_RED_POINT_VERSION;
      } else {
        this.red_point_version = long_;
      } 
      Integer integer = paramBuilder.need_filter;
      if (integer == null) {
        this.need_filter = DEFAULT_NEED_FILTER;
      } else {
        this.need_filter = integer;
      } 
      str = paramBuilder.ios_schema;
      if (str == null) {
        this.ios_schema = "";
      } else {
        this.ios_schema = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.icon = ((Builder)str).icon;
      this.schema = ((Builder)str).schema;
      this.slogan = ((Builder)str).slogan;
      this.red_point_version = ((Builder)str).red_point_version;
      this.need_filter = ((Builder)str).need_filter;
      this.ios_schema = ((Builder)str).ios_schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<Game> {
    public String icon;
    
    public String ios_schema;
    
    public String name;
    
    public Integer need_filter;
    
    public Long red_point_version;
    
    public String schema;
    
    public String slogan;
    
    public Builder() {}
    
    public Builder(Game param1Game) {
      super(param1Game);
      if (param1Game == null)
        return; 
      this.name = param1Game.name;
      this.icon = param1Game.icon;
      this.schema = param1Game.schema;
      this.slogan = param1Game.slogan;
      this.red_point_version = param1Game.red_point_version;
      this.need_filter = param1Game.need_filter;
      this.ios_schema = param1Game.ios_schema;
    }
    
    public Game build(boolean param1Boolean) {
      return new Game(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
