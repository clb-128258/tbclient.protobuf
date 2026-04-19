package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedFlipPage extends Message {
  public static final List<ComponentFactory> DEFAULT_FEED_PAGE_CONTENT;
  
  public static final Integer DEFAULT_SHOW_NUM_PER_PAGE = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ComponentFactory> feed_page_content;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer show_num_per_page;
  
  static {
    DEFAULT_FEED_PAGE_CONTENT = Collections.emptyList();
  }
  
  public FeedFlipPage(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ComponentFactory> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.show_num_per_page;
      if (integer == null) {
        this.show_num_per_page = DEFAULT_SHOW_NUM_PER_PAGE;
      } else {
        this.show_num_per_page = integer;
      } 
      list = paramBuilder.feed_page_content;
      if (list == null) {
        this.feed_page_content = DEFAULT_FEED_PAGE_CONTENT;
      } else {
        this.feed_page_content = Message.immutableCopyOf(list);
      } 
    } else {
      this.show_num_per_page = ((Builder)list).show_num_per_page;
      this.feed_page_content = Message.immutableCopyOf(((Builder)list).feed_page_content);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedFlipPage> {
    public List<ComponentFactory> feed_page_content;
    
    public Integer show_num_per_page;
    
    public Builder() {}
    
    public Builder(FeedFlipPage param1FeedFlipPage) {
      super(param1FeedFlipPage);
      if (param1FeedFlipPage == null)
        return; 
      this.show_num_per_page = param1FeedFlipPage.show_num_per_page;
      this.feed_page_content = Message.copyOf(param1FeedFlipPage.feed_page_content);
    }
    
    public FeedFlipPage build(boolean param1Boolean) {
      return new FeedFlipPage(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
