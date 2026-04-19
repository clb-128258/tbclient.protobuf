package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedShareShowData extends Message {
  public static final String DEFAULT_SHARE_TYPE = "";
  
  @ProtoField(tag = 2)
  public final FeedShareShowFullImage full_image;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String share_type;
  
  public FeedShareShowData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.share_type;
      if (str == null) {
        this.share_type = "";
      } else {
        this.share_type = str;
      } 
      this.full_image = paramBuilder.full_image;
    } else {
      this.share_type = paramBuilder.share_type;
      this.full_image = paramBuilder.full_image;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedShareShowData> {
    public FeedShareShowFullImage full_image;
    
    public String share_type;
    
    public Builder() {}
    
    public Builder(FeedShareShowData param1FeedShareShowData) {
      super(param1FeedShareShowData);
      if (param1FeedShareShowData == null)
        return; 
      this.share_type = param1FeedShareShowData.share_type;
      this.full_image = param1FeedShareShowData.full_image;
    }
    
    public FeedShareShowData build(boolean param1Boolean) {
      return new FeedShareShowData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
