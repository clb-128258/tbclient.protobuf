package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class TailRecommendInfo extends Message {
  public static final List<LayoutFactory> DEFAULT_FEED_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<LayoutFactory> feed_list;
  
  public TailRecommendInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<LayoutFactory> list;
    if (paramBoolean == true) {
      list = paramBuilder.feed_list;
      if (list == null) {
        this.feed_list = DEFAULT_FEED_LIST;
      } else {
        this.feed_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.feed_list = Message.immutableCopyOf(((Builder)list).feed_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<TailRecommendInfo> {
    public List<LayoutFactory> feed_list;
    
    public Builder() {}
    
    public Builder(TailRecommendInfo param1TailRecommendInfo) {
      super(param1TailRecommendInfo);
      if (param1TailRecommendInfo == null)
        return; 
      this.feed_list = Message.copyOf(param1TailRecommendInfo.feed_list);
    }
    
    public TailRecommendInfo build(boolean param1Boolean) {
      return new TailRecommendInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
