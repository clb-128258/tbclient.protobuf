package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedVideoComponent extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
  
  public static final Integer DEFAULT_PRELOAD = Integer.valueOf(0);
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer preload;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 1)
  public final VideoField video_info;
  
  public FeedVideoComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.video_info = paramBuilder.video_info;
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      List<FeedKV> list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.preload;
      if (integer == null) {
        this.preload = DEFAULT_PRELOAD;
      } else {
        this.preload = integer;
      } 
    } else {
      this.video_info = ((Builder)integer).video_info;
      this.schema = ((Builder)integer).schema;
      this.business_info = Message.immutableCopyOf(((Builder)integer).business_info);
      this.preload = ((Builder)integer).preload;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedVideoComponent> {
    public List<FeedKV> business_info;
    
    public Integer preload;
    
    public String schema;
    
    public VideoField video_info;
    
    public Builder() {}
    
    public Builder(FeedVideoComponent param1FeedVideoComponent) {
      super(param1FeedVideoComponent);
      if (param1FeedVideoComponent == null)
        return; 
      this.video_info = param1FeedVideoComponent.video_info;
      this.schema = param1FeedVideoComponent.schema;
      this.business_info = Message.copyOf(param1FeedVideoComponent.business_info);
      this.preload = param1FeedVideoComponent.preload;
    }
    
    public FeedVideoComponent build(boolean param1Boolean) {
      return new FeedVideoComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
