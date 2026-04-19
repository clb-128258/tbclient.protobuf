package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedShareShowFullImage extends Message {
  public static final List<FeedShareShowFullImageData> DEFAULT_DATA;
  
  public static final Long DEFAULT_TID = Long.valueOf(0L);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedShareShowFullImageData> data;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long tid;
  
  static {
    DEFAULT_DATA = Collections.emptyList();
  }
  
  public FeedShareShowFullImage(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedShareShowFullImageData> list;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
      list = paramBuilder.data;
      if (list == null) {
        this.data = DEFAULT_DATA;
      } else {
        this.data = Message.immutableCopyOf(list);
      } 
    } else {
      this.tid = ((Builder)list).tid;
      this.data = Message.immutableCopyOf(((Builder)list).data);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedShareShowFullImage> {
    public List<FeedShareShowFullImageData> data;
    
    public Long tid;
    
    public Builder() {}
    
    public Builder(FeedShareShowFullImage param1FeedShareShowFullImage) {
      super(param1FeedShareShowFullImage);
      if (param1FeedShareShowFullImage == null)
        return; 
      this.tid = param1FeedShareShowFullImage.tid;
      this.data = Message.copyOf(param1FeedShareShowFullImage.data);
    }
    
    public FeedShareShowFullImage build(boolean param1Boolean) {
      return new FeedShareShowFullImage(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
