package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedVideoAdComponent extends Message {
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 4)
  public final DownloadBar download_bar;
  
  @ProtoField(tag = 3)
  public final FeedMaskLayer mask_layer;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 1)
  public final VideoField video_info;
  
  public FeedVideoAdComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.video_info = paramBuilder.video_info;
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      this.mask_layer = paramBuilder.mask_layer;
      this.download_bar = paramBuilder.download_bar;
    } else {
      this.video_info = paramBuilder.video_info;
      this.schema = paramBuilder.schema;
      this.mask_layer = paramBuilder.mask_layer;
      this.download_bar = paramBuilder.download_bar;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedVideoAdComponent> {
    public DownloadBar download_bar;
    
    public FeedMaskLayer mask_layer;
    
    public String schema;
    
    public VideoField video_info;
    
    public Builder() {}
    
    public Builder(FeedVideoAdComponent param1FeedVideoAdComponent) {
      super(param1FeedVideoAdComponent);
      if (param1FeedVideoAdComponent == null)
        return; 
      this.video_info = param1FeedVideoAdComponent.video_info;
      this.schema = param1FeedVideoAdComponent.schema;
      this.mask_layer = param1FeedVideoAdComponent.mask_layer;
      this.download_bar = param1FeedVideoAdComponent.download_bar;
    }
    
    public FeedVideoAdComponent build(boolean param1Boolean) {
      return new FeedVideoAdComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
