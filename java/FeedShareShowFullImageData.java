package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedShareShowFullImageData extends Message {
  public static final String DEFAULT_TYPE = "";
  
  @ProtoField(tag = 2)
  public final FeedShareShowCardItem card;
  
  @ProtoField(tag = 3)
  public final FeedShareShowFeedItem feed;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String type;
  
  public FeedShareShowFullImageData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.type;
      if (str == null) {
        this.type = "";
      } else {
        this.type = str;
      } 
      this.card = paramBuilder.card;
      this.feed = paramBuilder.feed;
    } else {
      this.type = paramBuilder.type;
      this.card = paramBuilder.card;
      this.feed = paramBuilder.feed;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedShareShowFullImageData> {
    public FeedShareShowCardItem card;
    
    public FeedShareShowFeedItem feed;
    
    public String type;
    
    public Builder() {}
    
    public Builder(FeedShareShowFullImageData param1FeedShareShowFullImageData) {
      super(param1FeedShareShowFullImageData);
      if (param1FeedShareShowFullImageData == null)
        return; 
      this.type = param1FeedShareShowFullImageData.type;
      this.card = param1FeedShareShowFullImageData.card;
      this.feed = param1FeedShareShowFullImageData.feed;
    }
    
    public FeedShareShowFullImageData build(boolean param1Boolean) {
      return new FeedShareShowFullImageData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
