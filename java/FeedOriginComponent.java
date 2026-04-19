package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedOriginComponent extends Message {
  public static final List<FeedContentResource> DEFAULT_ABSTRACT = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedContentResource> _abstract;
  
  @ProtoField(tag = 5)
  public final FeedItem item;
  
  @ProtoField(tag = 2)
  public final FeedOriginPic pic_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 3)
  public final VideoField video;
  
  public FeedOriginComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<FeedContentResource> list = paramBuilder._abstract;
      if (list == null) {
        this._abstract = DEFAULT_ABSTRACT;
      } else {
        this._abstract = Message.immutableCopyOf(list);
      } 
      this.pic_info = paramBuilder.pic_info;
      this.video = paramBuilder.video;
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      this.item = paramBuilder.item;
    } else {
      this._abstract = Message.immutableCopyOf(paramBuilder._abstract);
      this.pic_info = paramBuilder.pic_info;
      this.video = paramBuilder.video;
      this.schema = paramBuilder.schema;
      this.item = paramBuilder.item;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedOriginComponent> {
    public List<FeedContentResource> _abstract;
    
    public FeedItem item;
    
    public FeedOriginPic pic_info;
    
    public String schema;
    
    public VideoField video;
    
    public Builder() {}
    
    public Builder(FeedOriginComponent param1FeedOriginComponent) {
      super(param1FeedOriginComponent);
      if (param1FeedOriginComponent == null)
        return; 
      this._abstract = Message.copyOf(param1FeedOriginComponent._abstract);
      this.pic_info = param1FeedOriginComponent.pic_info;
      this.video = param1FeedOriginComponent.video;
      this.schema = param1FeedOriginComponent.schema;
      this.item = param1FeedOriginComponent.item;
    }
    
    public FeedOriginComponent build(boolean param1Boolean) {
      return new FeedOriginComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
