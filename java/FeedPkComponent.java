package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedPkComponent extends Message {
  @ProtoField(tag = 1)
  public final PollInfo poll_info;
  
  public FeedPkComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.poll_info = paramBuilder.poll_info;
    } else {
      this.poll_info = paramBuilder.poll_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedPkComponent> {
    public PollInfo poll_info;
    
    public Builder() {}
    
    public Builder(FeedPkComponent param1FeedPkComponent) {
      super(param1FeedPkComponent);
      if (param1FeedPkComponent == null)
        return; 
      this.poll_info = param1FeedPkComponent.poll_info;
    }
    
    public FeedPkComponent build(boolean param1Boolean) {
      return new FeedPkComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
