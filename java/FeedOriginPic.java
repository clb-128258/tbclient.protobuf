package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedOriginPic extends Message {
  public static final List<PicInfo> DEFAULT_PICS = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<PicInfo> pics;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String schema;
  
  public FeedOriginPic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<PicInfo> list = paramBuilder.pics;
      if (list == null) {
        this.pics = DEFAULT_PICS;
      } else {
        this.pics = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.pics = Message.immutableCopyOf(((Builder)str).pics);
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedOriginPic> {
    public List<PicInfo> pics;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FeedOriginPic param1FeedOriginPic) {
      super(param1FeedOriginPic);
      if (param1FeedOriginPic == null)
        return; 
      this.pics = Message.copyOf(param1FeedOriginPic.pics);
      this.schema = param1FeedOriginPic.schema;
    }
    
    public FeedOriginPic build(boolean param1Boolean) {
      return new FeedOriginPic(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
