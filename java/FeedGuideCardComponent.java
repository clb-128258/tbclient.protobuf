package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedGuideCardComponent extends Message {
  public static final List<FeedContentResource> DEFAULT_SUB_TITLE;
  
  public static final List<FeedContentResource> DEFAULT_TITLE = Collections.emptyList();
  
  @ProtoField(tag = 5)
  public final FeedContentIcon background_url;
  
  @ProtoField(tag = 4)
  public final FeedButton button;
  
  @ProtoField(tag = 1)
  public final FeedHeadImg img;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedContentResource> sub_title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedContentResource> title;
  
  static {
    DEFAULT_SUB_TITLE = Collections.emptyList();
  }
  
  public FeedGuideCardComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.img = paramBuilder.img;
      List<FeedContentResource> list = paramBuilder.title;
      if (list == null) {
        this.title = DEFAULT_TITLE;
      } else {
        this.title = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.sub_title;
      if (list == null) {
        this.sub_title = DEFAULT_SUB_TITLE;
      } else {
        this.sub_title = Message.immutableCopyOf(list);
      } 
      this.button = paramBuilder.button;
      this.background_url = paramBuilder.background_url;
    } else {
      this.img = paramBuilder.img;
      this.title = Message.immutableCopyOf(paramBuilder.title);
      this.sub_title = Message.immutableCopyOf(paramBuilder.sub_title);
      this.button = paramBuilder.button;
      this.background_url = paramBuilder.background_url;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedGuideCardComponent> {
    public FeedContentIcon background_url;
    
    public FeedButton button;
    
    public FeedHeadImg img;
    
    public List<FeedContentResource> sub_title;
    
    public List<FeedContentResource> title;
    
    public Builder() {}
    
    public Builder(FeedGuideCardComponent param1FeedGuideCardComponent) {
      super(param1FeedGuideCardComponent);
      if (param1FeedGuideCardComponent == null)
        return; 
      this.img = param1FeedGuideCardComponent.img;
      this.title = Message.copyOf(param1FeedGuideCardComponent.title);
      this.sub_title = Message.copyOf(param1FeedGuideCardComponent.sub_title);
      this.button = param1FeedGuideCardComponent.button;
      this.background_url = param1FeedGuideCardComponent.background_url;
    }
    
    public FeedGuideCardComponent build(boolean param1Boolean) {
      return new FeedGuideCardComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
