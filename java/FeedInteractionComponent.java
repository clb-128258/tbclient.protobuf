package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedInteractionComponent extends Message {
  @ProtoField(tag = 1)
  public final FeedInteractionLeft left;
  
  @ProtoField(tag = 2)
  public final FeedInteractionRight right;
  
  public FeedInteractionComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.left = paramBuilder.left;
      this.right = paramBuilder.right;
    } else {
      this.left = paramBuilder.left;
      this.right = paramBuilder.right;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedInteractionComponent> {
    public FeedInteractionLeft left;
    
    public FeedInteractionRight right;
    
    public Builder() {}
    
    public Builder(FeedInteractionComponent param1FeedInteractionComponent) {
      super(param1FeedInteractionComponent);
      if (param1FeedInteractionComponent == null)
        return; 
      this.left = param1FeedInteractionComponent.left;
      this.right = param1FeedInteractionComponent.right;
    }
    
    public FeedInteractionComponent build(boolean param1Boolean) {
      return new FeedInteractionComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
