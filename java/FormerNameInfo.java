package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FormerNameInfo extends Message {
  public static final String DEFAULT_FORMER_NAME = "";
  
  public static final Long DEFAULT_SOURCE;
  
  public static final Long DEFAULT_UPDATE_TIME;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String former_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long source;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long update_time;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_UPDATE_TIME = long_;
    DEFAULT_SOURCE = long_;
  }
  
  public FormerNameInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.former_name;
      if (str == null) {
        this.former_name = "";
      } else {
        this.former_name = str;
      } 
      Long long_1 = paramBuilder.update_time;
      if (long_1 == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = long_1;
      } 
      long_ = paramBuilder.source;
      if (long_ == null) {
        this.source = DEFAULT_SOURCE;
      } else {
        this.source = long_;
      } 
    } else {
      this.former_name = ((Builder)long_).former_name;
      this.update_time = ((Builder)long_).update_time;
      this.source = ((Builder)long_).source;
    } 
  }
  
  public static final class Builder extends Message.Builder<FormerNameInfo> {
    public String former_name;
    
    public Long source;
    
    public Long update_time;
    
    public Builder() {}
    
    public Builder(FormerNameInfo param1FormerNameInfo) {
      super(param1FormerNameInfo);
      if (param1FormerNameInfo == null)
        return; 
      this.former_name = param1FormerNameInfo.former_name;
      this.update_time = param1FormerNameInfo.update_time;
      this.source = param1FormerNameInfo.source;
    }
    
    public FormerNameInfo build(boolean param1Boolean) {
      return new FormerNameInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
