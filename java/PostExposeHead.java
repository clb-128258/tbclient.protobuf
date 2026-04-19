package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PostExposeHead extends Message {
  public static final String DEFAULT_CORNER_URL = "";
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String corner_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String schema;
  
  public PostExposeHead(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.img_url;
      if (str1 == null) {
        this.img_url = "";
      } else {
        this.img_url = str1;
      } 
      str1 = paramBuilder.corner_url;
      if (str1 == null) {
        this.corner_url = "";
      } else {
        this.corner_url = str1;
      } 
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.img_url = ((Builder)str).img_url;
      this.corner_url = ((Builder)str).corner_url;
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<PostExposeHead> {
    public String corner_url;
    
    public String img_url;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(PostExposeHead param1PostExposeHead) {
      super(param1PostExposeHead);
      if (param1PostExposeHead == null)
        return; 
      this.img_url = param1PostExposeHead.img_url;
      this.corner_url = param1PostExposeHead.corner_url;
      this.schema = param1PostExposeHead.schema;
    }
    
    public PostExposeHead build(boolean param1Boolean) {
      return new PostExposeHead(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
