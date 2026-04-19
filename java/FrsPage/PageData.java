package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeedLayout;
import tbclient.LayoutFactory;

public final class PageData extends Message {
  public static final List<LayoutFactory> DEFAULT_FEED_LIST;
  
  public static final List<FeedLayout> DEFAULT_TEST_DROP = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<LayoutFactory> feed_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedLayout> test_drop;
  
  static {
    DEFAULT_FEED_LIST = Collections.emptyList();
  }
  
  public PageData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<LayoutFactory> list;
    if (paramBoolean == true) {
      List<FeedLayout> list1 = paramBuilder.test_drop;
      if (list1 == null) {
        this.test_drop = DEFAULT_TEST_DROP;
      } else {
        this.test_drop = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.feed_list;
      if (list == null) {
        this.feed_list = DEFAULT_FEED_LIST;
      } else {
        this.feed_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.test_drop = Message.immutableCopyOf(((Builder)list).test_drop);
      this.feed_list = Message.immutableCopyOf(((Builder)list).feed_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<PageData> {
    public List<LayoutFactory> feed_list;
    
    public List<FeedLayout> test_drop;
    
    public Builder() {}
    
    public Builder(PageData param1PageData) {
      super(param1PageData);
      if (param1PageData == null)
        return; 
      this.test_drop = Message.copyOf(param1PageData.test_drop);
      this.feed_list = Message.copyOf(param1PageData.feed_list);
    }
    
    public PageData build(boolean param1Boolean) {
      return new PageData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
