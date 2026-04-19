package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedShareShowCardItem extends Message {
  public static final String DEFAULT_IMAGE = "";
  
  public static final String DEFAULT_IMAGE_SIZE = "";
  
  public static final Long DEFAULT_POST_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String image_size;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String text;
  
  public FeedShareShowCardItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.post_id;
      if (long_ == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_;
      } 
      String str1 = paramBuilder.image;
      if (str1 == null) {
        this.image = "";
      } else {
        this.image = str1;
      } 
      str1 = paramBuilder.image_size;
      if (str1 == null) {
        this.image_size = "";
      } else {
        this.image_size = str1;
      } 
      str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
    } else {
      this.post_id = ((Builder)str).post_id;
      this.image = ((Builder)str).image;
      this.image_size = ((Builder)str).image_size;
      this.text = ((Builder)str).text;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedShareShowCardItem> {
    public String image;
    
    public String image_size;
    
    public Long post_id;
    
    public String text;
    
    public Builder() {}
    
    public Builder(FeedShareShowCardItem param1FeedShareShowCardItem) {
      super(param1FeedShareShowCardItem);
      if (param1FeedShareShowCardItem == null)
        return; 
      this.post_id = param1FeedShareShowCardItem.post_id;
      this.image = param1FeedShareShowCardItem.image;
      this.image_size = param1FeedShareShowCardItem.image_size;
      this.text = param1FeedShareShowCardItem.text;
    }
    
    public FeedShareShowCardItem build(boolean param1Boolean) {
      return new FeedShareShowCardItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
