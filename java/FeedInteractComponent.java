package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedInteractComponent extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
  
  @ProtoField(tag = 4)
  public final AgreeData agree;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 2)
  public final InteractItem collect;
  
  @ProtoField(tag = 3)
  public final InteractItem comment;
  
  @ProtoField(tag = 1)
  public final InteractItem repost;
  
  public FeedInteractComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      this.repost = paramBuilder.repost;
      this.collect = paramBuilder.collect;
      this.comment = paramBuilder.comment;
      this.agree = paramBuilder.agree;
      list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.repost = ((Builder)list).repost;
      this.collect = ((Builder)list).collect;
      this.comment = ((Builder)list).comment;
      this.agree = ((Builder)list).agree;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedInteractComponent> {
    public AgreeData agree;
    
    public List<FeedKV> business_info;
    
    public InteractItem collect;
    
    public InteractItem comment;
    
    public InteractItem repost;
    
    public Builder() {}
    
    public Builder(FeedInteractComponent param1FeedInteractComponent) {
      super(param1FeedInteractComponent);
      if (param1FeedInteractComponent == null)
        return; 
      this.repost = param1FeedInteractComponent.repost;
      this.collect = param1FeedInteractComponent.collect;
      this.comment = param1FeedInteractComponent.comment;
      this.agree = param1FeedInteractComponent.agree;
      this.business_info = Message.copyOf(param1FeedInteractComponent.business_info);
    }
    
    public FeedInteractComponent build(boolean param1Boolean) {
      return new FeedInteractComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
