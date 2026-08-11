package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedLandmineGoodsComponent extends Message {
  public static final String DEFAULT_IMAGE_URL = "";
  
  public static final String DEFAULT_PRICE = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final List<FeedContentResource> DEFAULT_TITLE = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String image_url;
  
  @ProtoField(tag = 4)
  public final PollInfo poll_info;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String price;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedContentResource> title;
  
  public FeedLandmineGoodsComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.image_url;
      if (str1 == null) {
        this.image_url = "";
      } else {
        this.image_url = str1;
      } 
      str1 = paramBuilder.price;
      if (str1 == null) {
        this.price = "";
      } else {
        this.price = str1;
      } 
      List<FeedContentResource> list = paramBuilder.title;
      if (list == null) {
        this.title = DEFAULT_TITLE;
      } else {
        this.title = Message.immutableCopyOf(list);
      } 
      this.poll_info = paramBuilder.poll_info;
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.image_url = ((Builder)str).image_url;
      this.price = ((Builder)str).price;
      this.title = Message.immutableCopyOf(((Builder)str).title);
      this.poll_info = ((Builder)str).poll_info;
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedLandmineGoodsComponent> {
    public String image_url;
    
    public PollInfo poll_info;
    
    public String price;
    
    public String schema;
    
    public List<FeedContentResource> title;
    
    public Builder() {}
    
    public Builder(FeedLandmineGoodsComponent param1FeedLandmineGoodsComponent) {
      super(param1FeedLandmineGoodsComponent);
      if (param1FeedLandmineGoodsComponent == null)
        return; 
      this.image_url = param1FeedLandmineGoodsComponent.image_url;
      this.price = param1FeedLandmineGoodsComponent.price;
      this.title = Message.copyOf(param1FeedLandmineGoodsComponent.title);
      this.poll_info = param1FeedLandmineGoodsComponent.poll_info;
      this.schema = param1FeedLandmineGoodsComponent.schema;
    }
    
    public FeedLandmineGoodsComponent build(boolean param1Boolean) {
      return new FeedLandmineGoodsComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
