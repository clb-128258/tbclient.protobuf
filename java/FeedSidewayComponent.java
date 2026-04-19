package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedSidewayComponent extends Message {
  public static final List<FeedSidewayItem> DEFAULT_ITEMS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedSidewayItem> items;
  
  @ProtoField(tag = 2)
  public final FeedSidewayLoadMore load_more;
  
  public FeedSidewayComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<FeedSidewayItem> list = paramBuilder.items;
      if (list == null) {
        this.items = DEFAULT_ITEMS;
      } else {
        this.items = Message.immutableCopyOf(list);
      } 
      this.load_more = paramBuilder.load_more;
    } else {
      this.items = Message.immutableCopyOf(paramBuilder.items);
      this.load_more = paramBuilder.load_more;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedSidewayComponent> {
    public List<FeedSidewayItem> items;
    
    public FeedSidewayLoadMore load_more;
    
    public Builder() {}
    
    public Builder(FeedSidewayComponent param1FeedSidewayComponent) {
      super(param1FeedSidewayComponent);
      if (param1FeedSidewayComponent == null)
        return; 
      this.items = Message.copyOf(param1FeedSidewayComponent.items);
      this.load_more = param1FeedSidewayComponent.load_more;
    }
    
    public FeedSidewayComponent build(boolean param1Boolean) {
      return new FeedSidewayComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
