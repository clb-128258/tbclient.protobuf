package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedLeftPost extends Message {
  public static final Integer DEFAULT_COMMENT_NUM = Integer.valueOf(0);
  
  public static final String DEFAULT_SCHEME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer comment_num;
  
  @ProtoField(tag = 3)
  public final IconUrlInfo icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String scheme;
  
  public FeedLeftPost(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.comment_num;
      if (integer == null) {
        this.comment_num = DEFAULT_COMMENT_NUM;
      } else {
        this.comment_num = integer;
      } 
      String str = paramBuilder.scheme;
      if (str == null) {
        this.scheme = "";
      } else {
        this.scheme = str;
      } 
      this.icon = paramBuilder.icon;
    } else {
      this.comment_num = paramBuilder.comment_num;
      this.scheme = paramBuilder.scheme;
      this.icon = paramBuilder.icon;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedLeftPost> {
    public Integer comment_num;
    
    public IconUrlInfo icon;
    
    public String scheme;
    
    public Builder() {}
    
    public Builder(FeedLeftPost param1FeedLeftPost) {
      super(param1FeedLeftPost);
      if (param1FeedLeftPost == null)
        return; 
      this.comment_num = param1FeedLeftPost.comment_num;
      this.scheme = param1FeedLeftPost.scheme;
      this.icon = param1FeedLeftPost.icon;
    }
    
    public FeedLeftPost build(boolean param1Boolean) {
      return new FeedLeftPost(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
