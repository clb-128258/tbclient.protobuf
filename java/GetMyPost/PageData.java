package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.LayoutFactory;

public final class PageData extends Message {
  @ProtoField(tag = 1)
  public final LayoutFactory feed;
  
  public PageData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.feed = paramBuilder.feed;
    } else {
      this.feed = paramBuilder.feed;
    } 
  }
  
  public static final class Builder extends Message.Builder<PageData> {
    public LayoutFactory feed;
    
    public Builder() {}
    
    public Builder(PageData param1PageData) {
      super(param1PageData);
      if (param1PageData == null)
        return; 
      this.feed = param1PageData.feed;
    }
    
    public PageData build(boolean param1Boolean) {
      return new PageData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
