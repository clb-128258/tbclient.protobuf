package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class VideoDoubleRowLayout extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final List<ComponentFactory> DEFAULT_COMPONENTS = Collections.emptyList();
  
  public static final List<FeedKV> DEFAULT_LOG_INFO;
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final List<String> DEFAULT_PREFETCH_SCHEMA;
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedKV> business_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ComponentFactory> components;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<FeedKV> log_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<FeedKV> log_param;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.STRING)
  public final List<String> prefetch_schema;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String schema;
  
  static {
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
    DEFAULT_LOG_INFO = Collections.emptyList();
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_PREFETCH_SCHEMA = Collections.emptyList();
  }
  
  public VideoDoubleRowLayout(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      List<ComponentFactory> list2 = paramBuilder.components;
      if (list2 == null) {
        this.components = DEFAULT_COMPONENTS;
      } else {
        this.components = Message.immutableCopyOf(list2);
      } 
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      List<FeedKV> list1 = paramBuilder.business_info;
      if (list1 == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.log_info;
      if (list1 == null) {
        this.log_info = DEFAULT_LOG_INFO;
      } else {
        this.log_info = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.log_param;
      if (list1 == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.prefetch_schema;
      if (list == null) {
        this.prefetch_schema = DEFAULT_PREFETCH_SCHEMA;
      } else {
        this.prefetch_schema = Message.immutableCopyOf(list);
      } 
    } else {
      this.components = Message.immutableCopyOf(((Builder)list).components);
      this.schema = ((Builder)list).schema;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
      this.log_info = Message.immutableCopyOf(((Builder)list).log_info);
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
      this.prefetch_schema = Message.immutableCopyOf(((Builder)list).prefetch_schema);
    } 
  }
  
  public static final class Builder extends Message.Builder<VideoDoubleRowLayout> {
    public List<FeedKV> business_info;
    
    public List<ComponentFactory> components;
    
    public List<FeedKV> log_info;
    
    public List<FeedKV> log_param;
    
    public List<String> prefetch_schema;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(VideoDoubleRowLayout param1VideoDoubleRowLayout) {
      super(param1VideoDoubleRowLayout);
      if (param1VideoDoubleRowLayout == null)
        return; 
      this.components = Message.copyOf(param1VideoDoubleRowLayout.components);
      this.schema = param1VideoDoubleRowLayout.schema;
      this.business_info = Message.copyOf(param1VideoDoubleRowLayout.business_info);
      this.log_info = Message.copyOf(param1VideoDoubleRowLayout.log_info);
      this.log_param = Message.copyOf(param1VideoDoubleRowLayout.log_param);
      this.prefetch_schema = Message.copyOf(param1VideoDoubleRowLayout.prefetch_schema);
    }
    
    public VideoDoubleRowLayout build(boolean param1Boolean) {
      return new VideoDoubleRowLayout(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
