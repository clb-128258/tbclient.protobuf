package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DiscussLayout extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final List<ComponentFactory> DEFAULT_COMPONENTS = Collections.emptyList();
  
  public static final List<FeedKV> DEFAULT_LOG_INFO;
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 5)
  public final FeedContentIcon background;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedKV> business_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ComponentFactory> components;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<FeedKV> log_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  static {
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
    DEFAULT_LOG_INFO = Collections.emptyList();
  }
  
  public DiscussLayout(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      List<ComponentFactory> list2 = paramBuilder.components;
      if (list2 == null) {
        this.components = DEFAULT_COMPONENTS;
      } else {
        this.components = Message.immutableCopyOf(list2);
      } 
      List<FeedKV> list1 = paramBuilder.log_param;
      if (list1 == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.business_info;
      if (list1 == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list1);
      } 
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      this.background = paramBuilder.background;
      list = paramBuilder.log_info;
      if (list == null) {
        this.log_info = DEFAULT_LOG_INFO;
      } else {
        this.log_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.components = Message.immutableCopyOf(((Builder)list).components);
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
      this.schema = ((Builder)list).schema;
      this.background = ((Builder)list).background;
      this.log_info = Message.immutableCopyOf(((Builder)list).log_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<DiscussLayout> {
    public FeedContentIcon background;
    
    public List<FeedKV> business_info;
    
    public List<ComponentFactory> components;
    
    public List<FeedKV> log_info;
    
    public List<FeedKV> log_param;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(DiscussLayout param1DiscussLayout) {
      super(param1DiscussLayout);
      if (param1DiscussLayout == null)
        return; 
      this.components = Message.copyOf(param1DiscussLayout.components);
      this.log_param = Message.copyOf(param1DiscussLayout.log_param);
      this.business_info = Message.copyOf(param1DiscussLayout.business_info);
      this.schema = param1DiscussLayout.schema;
      this.background = param1DiscussLayout.background;
      this.log_info = Message.copyOf(param1DiscussLayout.log_info);
    }
    
    public DiscussLayout build(boolean param1Boolean) {
      return new DiscussLayout(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
