package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedLinkStoreComponent extends Message {
  public static final List<FeedContentResource> DEFAULT_DESC;
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final Integer DEFAULT_SORT;
  
  public static final List<FeedContentResource> DEFAULT_TITLE = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<FeedContentResource> desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer sort;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<FeedContentResource> title;
  
  static {
    DEFAULT_DESC = Collections.emptyList();
    DEFAULT_SORT = Integer.valueOf(0);
  }
  
  public FeedLinkStoreComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.img_url;
      if (str2 == null) {
        this.img_url = "";
      } else {
        this.img_url = str2;
      } 
      List<FeedContentResource> list2 = paramBuilder.title;
      if (list2 == null) {
        this.title = DEFAULT_TITLE;
      } else {
        this.title = Message.immutableCopyOf(list2);
      } 
      String str1 = paramBuilder.schema;
      if (str1 == null) {
        this.schema = "";
      } else {
        this.schema = str1;
      } 
      List<FeedContentResource> list1 = paramBuilder.desc;
      if (list1 == null) {
        this.desc = DEFAULT_DESC;
      } else {
        this.desc = Message.immutableCopyOf(list1);
      } 
      integer = paramBuilder.sort;
      if (integer == null) {
        this.sort = DEFAULT_SORT;
      } else {
        this.sort = integer;
      } 
    } else {
      this.img_url = ((Builder)integer).img_url;
      this.title = Message.immutableCopyOf(((Builder)integer).title);
      this.schema = ((Builder)integer).schema;
      this.desc = Message.immutableCopyOf(((Builder)integer).desc);
      this.sort = ((Builder)integer).sort;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedLinkStoreComponent> {
    public List<FeedContentResource> desc;
    
    public String img_url;
    
    public String schema;
    
    public Integer sort;
    
    public List<FeedContentResource> title;
    
    public Builder() {}
    
    public Builder(FeedLinkStoreComponent param1FeedLinkStoreComponent) {
      super(param1FeedLinkStoreComponent);
      if (param1FeedLinkStoreComponent == null)
        return; 
      this.img_url = param1FeedLinkStoreComponent.img_url;
      this.title = Message.copyOf(param1FeedLinkStoreComponent.title);
      this.schema = param1FeedLinkStoreComponent.schema;
      this.desc = Message.copyOf(param1FeedLinkStoreComponent.desc);
      this.sort = param1FeedLinkStoreComponent.sort;
    }
    
    public FeedLinkStoreComponent build(boolean param1Boolean) {
      return new FeedLinkStoreComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
