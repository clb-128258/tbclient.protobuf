package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedDiscussComponent extends Message {
  @ProtoField(tag = 4)
  public final FeedContentJumpInfo negative_info;
  
  @ProtoField(tag = 2)
  public final FeedContentText negative_text;
  
  @ProtoField(tag = 3)
  public final FeedContentJumpInfo positive_info;
  
  @ProtoField(tag = 1)
  public final FeedContentText positive_text;
  
  public FeedDiscussComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.positive_text = paramBuilder.positive_text;
      this.negative_text = paramBuilder.negative_text;
      this.positive_info = paramBuilder.positive_info;
      this.negative_info = paramBuilder.negative_info;
    } else {
      this.positive_text = paramBuilder.positive_text;
      this.negative_text = paramBuilder.negative_text;
      this.positive_info = paramBuilder.positive_info;
      this.negative_info = paramBuilder.negative_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedDiscussComponent> {
    public FeedContentJumpInfo negative_info;
    
    public FeedContentText negative_text;
    
    public FeedContentJumpInfo positive_info;
    
    public FeedContentText positive_text;
    
    public Builder() {}
    
    public Builder(FeedDiscussComponent param1FeedDiscussComponent) {
      super(param1FeedDiscussComponent);
      if (param1FeedDiscussComponent == null)
        return; 
      this.positive_text = param1FeedDiscussComponent.positive_text;
      this.negative_text = param1FeedDiscussComponent.negative_text;
      this.positive_info = param1FeedDiscussComponent.positive_info;
      this.negative_info = param1FeedDiscussComponent.negative_info;
    }
    
    public FeedDiscussComponent build(boolean param1Boolean) {
      return new FeedDiscussComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
