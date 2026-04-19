package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedMixComponent extends Message {
  public static final List<FeedHeadSymbol> DEFAULT_DESC = Collections.emptyList();
  
  @ProtoField(tag = 5)
  public final FeedButton button;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedHeadSymbol> desc;
  
  @ProtoField(tag = 4)
  public final FeedFeedback feedback;
  
  @ProtoField(tag = 1)
  public final FeedHeadImg image_data;
  
  @ProtoField(tag = 2)
  public final FeedContentText title;
  
  public FeedMixComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.image_data = paramBuilder.image_data;
      this.title = paramBuilder.title;
      List<FeedHeadSymbol> list = paramBuilder.desc;
      if (list == null) {
        this.desc = DEFAULT_DESC;
      } else {
        this.desc = Message.immutableCopyOf(list);
      } 
      this.feedback = paramBuilder.feedback;
      this.button = paramBuilder.button;
    } else {
      this.image_data = paramBuilder.image_data;
      this.title = paramBuilder.title;
      this.desc = Message.immutableCopyOf(paramBuilder.desc);
      this.feedback = paramBuilder.feedback;
      this.button = paramBuilder.button;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedMixComponent> {
    public FeedButton button;
    
    public List<FeedHeadSymbol> desc;
    
    public FeedFeedback feedback;
    
    public FeedHeadImg image_data;
    
    public FeedContentText title;
    
    public Builder() {}
    
    public Builder(FeedMixComponent param1FeedMixComponent) {
      super(param1FeedMixComponent);
      if (param1FeedMixComponent == null)
        return; 
      this.image_data = param1FeedMixComponent.image_data;
      this.title = param1FeedMixComponent.title;
      this.desc = Message.copyOf(param1FeedMixComponent.desc);
      this.feedback = param1FeedMixComponent.feedback;
      this.button = param1FeedMixComponent.button;
    }
    
    public FeedMixComponent build(boolean param1Boolean) {
      return new FeedMixComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
