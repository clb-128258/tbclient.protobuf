package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedContentResource extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final List<FeedKV> DEFAULT_LOG_INFO;
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 11)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 10)
  public final FeedContentEmoji emoji_info;
  
  @ProtoField(tag = 9)
  public final FeedContentIcon icon_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 12)
  public final List<FeedKV> log_info;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 8)
  public final FeedContentText text_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
    DEFAULT_LOG_INFO = Collections.emptyList();
  }
  
  public FeedContentResource(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      this.text_info = paramBuilder.text_info;
      this.icon_info = paramBuilder.icon_info;
      this.emoji_info = paramBuilder.emoji_info;
      List<FeedKV> list1 = paramBuilder.business_info;
      if (list1 == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.log_info;
      if (list == null) {
        this.log_info = DEFAULT_LOG_INFO;
      } else {
        this.log_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.type = ((Builder)list).type;
      this.schema = ((Builder)list).schema;
      this.text_info = ((Builder)list).text_info;
      this.icon_info = ((Builder)list).icon_info;
      this.emoji_info = ((Builder)list).emoji_info;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
      this.log_info = Message.immutableCopyOf(((Builder)list).log_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedContentResource> {
    public List<FeedKV> business_info;
    
    public FeedContentEmoji emoji_info;
    
    public FeedContentIcon icon_info;
    
    public List<FeedKV> log_info;
    
    public String schema;
    
    public FeedContentText text_info;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(FeedContentResource param1FeedContentResource) {
      super(param1FeedContentResource);
      if (param1FeedContentResource == null)
        return; 
      this.type = param1FeedContentResource.type;
      this.schema = param1FeedContentResource.schema;
      this.text_info = param1FeedContentResource.text_info;
      this.icon_info = param1FeedContentResource.icon_info;
      this.emoji_info = param1FeedContentResource.emoji_info;
      this.business_info = Message.copyOf(param1FeedContentResource.business_info);
      this.log_info = Message.copyOf(param1FeedContentResource.log_info);
    }
    
    public FeedContentResource build(boolean param1Boolean) {
      return new FeedContentResource(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
