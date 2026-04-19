package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumShowInfo extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final Long DEFAULT_SHOW_TYPE = Long.valueOf(0L);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long show_type;
  
  @ProtoField(tag = 2)
  public final ForumShowInfoTag tag;
  
  public ForumShowInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
      this.tag = paramBuilder.tag;
      long_ = paramBuilder.show_type;
      if (long_ == null) {
        this.show_type = DEFAULT_SHOW_TYPE;
      } else {
        this.show_type = long_;
      } 
    } else {
      this.content = ((Builder)long_).content;
      this.tag = ((Builder)long_).tag;
      this.show_type = ((Builder)long_).show_type;
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumShowInfo> {
    public String content;
    
    public Long show_type;
    
    public ForumShowInfoTag tag;
    
    public Builder() {}
    
    public Builder(ForumShowInfo param1ForumShowInfo) {
      super(param1ForumShowInfo);
      if (param1ForumShowInfo == null)
        return; 
      this.content = param1ForumShowInfo.content;
      this.tag = param1ForumShowInfo.tag;
      this.show_type = param1ForumShowInfo.show_type;
    }
    
    public ForumShowInfo build(boolean param1Boolean) {
      return new ForumShowInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
