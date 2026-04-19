package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedPicComponent extends Message {
  public static final Integer DEFAULT_IS_SLIDE;
  
  public static final List<PicInfo> DEFAULT_PICS = Collections.emptyList();
  
  public static final Integer DEFAULT_PRELOAD;
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_slide;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<PicInfo> pics;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer preload;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String schema;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PRELOAD = integer;
    DEFAULT_IS_SLIDE = integer;
  }
  
  public FeedPicComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<PicInfo> list = paramBuilder.pics;
      if (list == null) {
        this.pics = DEFAULT_PICS;
      } else {
        this.pics = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      Integer integer1 = paramBuilder.preload;
      if (integer1 == null) {
        this.preload = DEFAULT_PRELOAD;
      } else {
        this.preload = integer1;
      } 
      integer = paramBuilder.is_slide;
      if (integer == null) {
        this.is_slide = DEFAULT_IS_SLIDE;
      } else {
        this.is_slide = integer;
      } 
    } else {
      this.pics = Message.immutableCopyOf(((Builder)integer).pics);
      this.schema = ((Builder)integer).schema;
      this.preload = ((Builder)integer).preload;
      this.is_slide = ((Builder)integer).is_slide;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedPicComponent> {
    public Integer is_slide;
    
    public List<PicInfo> pics;
    
    public Integer preload;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FeedPicComponent param1FeedPicComponent) {
      super(param1FeedPicComponent);
      if (param1FeedPicComponent == null)
        return; 
      this.pics = Message.copyOf(param1FeedPicComponent.pics);
      this.schema = param1FeedPicComponent.schema;
      this.preload = param1FeedPicComponent.preload;
      this.is_slide = param1FeedPicComponent.is_slide;
    }
    
    public FeedPicComponent build(boolean param1Boolean) {
      return new FeedPicComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
