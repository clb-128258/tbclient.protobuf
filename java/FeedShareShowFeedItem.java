package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedShareShowFeedItem extends Message {
  public static final List<PbContent> DEFAULT_CONTENT;
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final Long DEFAULT_POST_ID = Long.valueOf(0L);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<PbContent> content;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  static {
    DEFAULT_CONTENT = Collections.emptyList();
  }
  
  public FeedShareShowFeedItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.post_id;
      if (long_ == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_;
      } 
      List<PbContent> list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.name_show;
      if (str == null) {
        this.name_show = "";
      } else {
        this.name_show = str;
      } 
    } else {
      this.post_id = ((Builder)str).post_id;
      this.content = Message.immutableCopyOf(((Builder)str).content);
      this.name_show = ((Builder)str).name_show;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedShareShowFeedItem> {
    public List<PbContent> content;
    
    public String name_show;
    
    public Long post_id;
    
    public Builder() {}
    
    public Builder(FeedShareShowFeedItem param1FeedShareShowFeedItem) {
      super(param1FeedShareShowFeedItem);
      if (param1FeedShareShowFeedItem == null)
        return; 
      this.post_id = param1FeedShareShowFeedItem.post_id;
      this.content = Message.copyOf(param1FeedShareShowFeedItem.content);
      this.name_show = param1FeedShareShowFeedItem.name_show;
    }
    
    public FeedShareShowFeedItem build(boolean param1Boolean) {
      return new FeedShareShowFeedItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
