package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedContentJumpInfo extends Message {
  public static final Long DEFAULT_ID;
  
  public static final Long DEFAULT_NUM;
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long num;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String text;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    DEFAULT_NUM = long_;
  }
  
  public FeedContentJumpInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      long_ = paramBuilder.num;
      if (long_ == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = long_;
      } 
      str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.num = ((Builder)str).num;
      this.text = ((Builder)str).text;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedContentJumpInfo> {
    public Long id;
    
    public Long num;
    
    public String text;
    
    public Builder() {}
    
    public Builder(FeedContentJumpInfo param1FeedContentJumpInfo) {
      super(param1FeedContentJumpInfo);
      if (param1FeedContentJumpInfo == null)
        return; 
      this.id = param1FeedContentJumpInfo.id;
      this.num = param1FeedContentJumpInfo.num;
      this.text = param1FeedContentJumpInfo.text;
    }
    
    public FeedContentJumpInfo build(boolean param1Boolean) {
      return new FeedContentJumpInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
