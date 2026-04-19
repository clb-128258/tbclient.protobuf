package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedReplyComponent extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final List<FeedContentResource> DEFAULT_REPLY_CONTENT = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 2)
  public final AgreeData agree_data;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<FeedKV> business_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedContentResource> reply_content;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String schema;
  
  static {
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
  }
  
  public FeedReplyComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      List<FeedContentResource> list1 = paramBuilder.reply_content;
      if (list1 == null) {
        this.reply_content = DEFAULT_REPLY_CONTENT;
      } else {
        this.reply_content = Message.immutableCopyOf(list1);
      } 
      this.agree_data = paramBuilder.agree_data;
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.reply_content = Message.immutableCopyOf(((Builder)list).reply_content);
      this.agree_data = ((Builder)list).agree_data;
      this.schema = ((Builder)list).schema;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedReplyComponent> {
    public AgreeData agree_data;
    
    public List<FeedKV> business_info;
    
    public List<FeedContentResource> reply_content;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FeedReplyComponent param1FeedReplyComponent) {
      super(param1FeedReplyComponent);
      if (param1FeedReplyComponent == null)
        return; 
      this.reply_content = Message.copyOf(param1FeedReplyComponent.reply_content);
      this.agree_data = param1FeedReplyComponent.agree_data;
      this.schema = param1FeedReplyComponent.schema;
      this.business_info = Message.copyOf(param1FeedReplyComponent.business_info);
    }
    
    public FeedReplyComponent build(boolean param1Boolean) {
      return new FeedReplyComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
