package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedSidewayLoadMore extends Message {
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 2)
  public final FeedContentIcon icon;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 1)
  public final FeedContentText text;
  
  public FeedSidewayLoadMore(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.text = paramBuilder.text;
      this.icon = paramBuilder.icon;
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.text = ((Builder)str).text;
      this.icon = ((Builder)str).icon;
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedSidewayLoadMore> {
    public FeedContentIcon icon;
    
    public String schema;
    
    public FeedContentText text;
    
    public Builder() {}
    
    public Builder(FeedSidewayLoadMore param1FeedSidewayLoadMore) {
      super(param1FeedSidewayLoadMore);
      if (param1FeedSidewayLoadMore == null)
        return; 
      this.text = param1FeedSidewayLoadMore.text;
      this.icon = param1FeedSidewayLoadMore.icon;
      this.schema = param1FeedSidewayLoadMore.schema;
    }
    
    public FeedSidewayLoadMore build(boolean param1Boolean) {
      return new FeedSidewayLoadMore(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
