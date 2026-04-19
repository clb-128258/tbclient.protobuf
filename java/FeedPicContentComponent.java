package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedPicContentComponent extends Message {
  @ProtoField(tag = 2)
  public final AbstractComponent _abstract;
  
  @ProtoField(tag = 3)
  public final FeedPicComponent pic;
  
  @ProtoField(tag = 4)
  public final ThreadExtShowComponent thread_ext_show;
  
  @ProtoField(tag = 1)
  public final TitleComponent title;
  
  public FeedPicContentComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.title = paramBuilder.title;
      this._abstract = paramBuilder._abstract;
      this.pic = paramBuilder.pic;
      this.thread_ext_show = paramBuilder.thread_ext_show;
    } else {
      this.title = paramBuilder.title;
      this._abstract = paramBuilder._abstract;
      this.pic = paramBuilder.pic;
      this.thread_ext_show = paramBuilder.thread_ext_show;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedPicContentComponent> {
    public AbstractComponent _abstract;
    
    public FeedPicComponent pic;
    
    public ThreadExtShowComponent thread_ext_show;
    
    public TitleComponent title;
    
    public Builder() {}
    
    public Builder(FeedPicContentComponent param1FeedPicContentComponent) {
      super(param1FeedPicContentComponent);
      if (param1FeedPicContentComponent == null)
        return; 
      this.title = param1FeedPicContentComponent.title;
      this._abstract = param1FeedPicContentComponent._abstract;
      this.pic = param1FeedPicContentComponent.pic;
      this.thread_ext_show = param1FeedPicContentComponent.thread_ext_show;
    }
    
    public FeedPicContentComponent build(boolean param1Boolean) {
      return new FeedPicContentComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
