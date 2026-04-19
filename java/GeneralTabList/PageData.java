package tbclient.GeneralTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.LayoutFactory;

public final class PageData extends Message {
  public static final List<LayoutFactory> DEFAULT_FEED_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<LayoutFactory> feed_list;
  
  public PageData(Builder paramBuilder, boolean paramBoolean) {
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
  
  public static final class Builder extends Message.Builder<PageData> {
    public List<LayoutFactory> feed_list;
    
    public Builder() {}
    
    public Builder(PageData param1PageData) {
      super(param1PageData);
      if (param1PageData == null)
        return; 
      this.feed_list = Message.copyOf(param1PageData.feed_list);
    }
    
    public PageData build(boolean param1Boolean) {
      return new PageData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
