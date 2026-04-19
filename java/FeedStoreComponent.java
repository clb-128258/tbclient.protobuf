package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedStoreComponent extends Message {
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final List<FeedContentResource> DEFAULT_TEXT_INFO = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 2)
  public final FeedContentText price;
  
  @ProtoField(tag = 3)
  public final FeedContentText price_prefix;
  
  @ProtoField(tag = 4)
  public final FeedContentText recommend_tips;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<FeedContentResource> text_info;
  
  public FeedStoreComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedContentResource> list;
    if (paramBoolean == true) {
      String str = paramBuilder.img_url;
      if (str == null) {
        this.img_url = "";
      } else {
        this.img_url = str;
      } 
      this.price = paramBuilder.price;
      this.price_prefix = paramBuilder.price_prefix;
      this.recommend_tips = paramBuilder.recommend_tips;
      str = paramBuilder.scheme;
      if (str == null) {
        this.scheme = "";
      } else {
        this.scheme = str;
      } 
      list = paramBuilder.text_info;
      if (list == null) {
        this.text_info = DEFAULT_TEXT_INFO;
      } else {
        this.text_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.img_url = ((Builder)list).img_url;
      this.price = ((Builder)list).price;
      this.price_prefix = ((Builder)list).price_prefix;
      this.recommend_tips = ((Builder)list).recommend_tips;
      this.scheme = ((Builder)list).scheme;
      this.text_info = Message.immutableCopyOf(((Builder)list).text_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedStoreComponent> {
    public String img_url;
    
    public FeedContentText price;
    
    public FeedContentText price_prefix;
    
    public FeedContentText recommend_tips;
    
    public String scheme;
    
    public List<FeedContentResource> text_info;
    
    public Builder() {}
    
    public Builder(FeedStoreComponent param1FeedStoreComponent) {
      super(param1FeedStoreComponent);
      if (param1FeedStoreComponent == null)
        return; 
      this.img_url = param1FeedStoreComponent.img_url;
      this.price = param1FeedStoreComponent.price;
      this.price_prefix = param1FeedStoreComponent.price_prefix;
      this.recommend_tips = param1FeedStoreComponent.recommend_tips;
      this.scheme = param1FeedStoreComponent.scheme;
      this.text_info = Message.copyOf(param1FeedStoreComponent.text_info);
    }
    
    public FeedStoreComponent build(boolean param1Boolean) {
      return new FeedStoreComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
