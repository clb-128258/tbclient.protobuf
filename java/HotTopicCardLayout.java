package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class HotTopicCardLayout extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final List<ComponentFactory> DEFAULT_COMPONENTS = Collections.emptyList();
  
  public static final List<FeedKV> DEFAULT_LOG_INFO;
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final List<String> DEFAULT_PREFETCH_SCHEMA;
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 7)
  public final FeedContentIcon background;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedKV> business_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ComponentFactory> components;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<FeedKV> log_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedKV> log_param;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
  public final List<String> prefetch_schema;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  static {
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_PREFETCH_SCHEMA = Collections.emptyList();
    DEFAULT_LOG_INFO = Collections.emptyList();
  }
  
  public HotTopicCardLayout(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      List<ComponentFactory> list3 = paramBuilder.components;
      if (list3 == null) {
        this.components = DEFAULT_COMPONENTS;
      } else {
        this.components = Message.immutableCopyOf(list3);
      } 
      List<FeedKV> list2 = paramBuilder.business_info;
      if (list2 == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list2);
      } 
      list2 = paramBuilder.log_param;
      if (list2 == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list2);
      } 
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      List<String> list1 = paramBuilder.prefetch_schema;
      if (list1 == null) {
        this.prefetch_schema = DEFAULT_PREFETCH_SCHEMA;
      } else {
        this.prefetch_schema = Message.immutableCopyOf(list1);
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
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
      this.schema = ((Builder)list).schema;
      this.prefetch_schema = Message.immutableCopyOf(((Builder)list).prefetch_schema);
      this.background = ((Builder)list).background;
      this.log_info = Message.immutableCopyOf(((Builder)list).log_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<HotTopicCardLayout> {
    public FeedContentIcon background;
    
    public List<FeedKV> business_info;
    
    public List<ComponentFactory> components;
    
    public List<FeedKV> log_info;
    
    public List<FeedKV> log_param;
    
    public List<String> prefetch_schema;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(HotTopicCardLayout param1HotTopicCardLayout) {
      super(param1HotTopicCardLayout);
      if (param1HotTopicCardLayout == null)
        return; 
      this.components = Message.copyOf(param1HotTopicCardLayout.components);
      this.business_info = Message.copyOf(param1HotTopicCardLayout.business_info);
      this.log_param = Message.copyOf(param1HotTopicCardLayout.log_param);
      this.schema = param1HotTopicCardLayout.schema;
      this.prefetch_schema = Message.copyOf(param1HotTopicCardLayout.prefetch_schema);
      this.background = param1HotTopicCardLayout.background;
      this.log_info = Message.copyOf(param1HotTopicCardLayout.log_info);
    }
    
    public HotTopicCardLayout build(boolean param1Boolean) {
      return new HotTopicCardLayout(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
