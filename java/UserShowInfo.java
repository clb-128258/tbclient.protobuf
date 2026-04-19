package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserShowInfo extends Message {
  @ProtoField(tag = 1)
  public final FeedHeadComponent feed_head;
  
  public UserShowInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.feed_head = paramBuilder.feed_head;
    } else {
      this.feed_head = paramBuilder.feed_head;
    } 
  }
  
  public static final class Builder extends Message.Builder<UserShowInfo> {
    public FeedHeadComponent feed_head;
    
    public Builder() {}
    
    public Builder(UserShowInfo param1UserShowInfo) {
      super(param1UserShowInfo);
      if (param1UserShowInfo == null)
        return; 
      this.feed_head = param1UserShowInfo.feed_head;
    }
    
    public UserShowInfo build(boolean param1Boolean) {
      return new UserShowInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
