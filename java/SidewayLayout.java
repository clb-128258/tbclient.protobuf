package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class SidewayLayout extends Message {
  public static final List<FeedKV> DEFAULT_APPENDIX;
  
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final List<ComponentFactory> DEFAULT_COMPONENTS = Collections.emptyList();
  
  public static final List<FeedKV> DEFAULT_LOG_INFO;
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final List<String> DEFAULT_PREFETCH_SCHEMA;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<FeedKV> appendix;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<FeedKV> business_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ComponentFactory> components;
  
  @ProtoField(tag = 4)
  public final FeedFeedback feedback;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 10)
  public final List<FeedKV> log_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<FeedKV> log_param;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
  public final List<String> prefetch_schema;
  
  @ProtoField(tag = 3)
  public final ComponentFactory title;
  
  static {
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
    DEFAULT_APPENDIX = Collections.emptyList();
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_PREFETCH_SCHEMA = Collections.emptyList();
    DEFAULT_LOG_INFO = Collections.emptyList();
  }
  
  public SidewayLayout(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      List<ComponentFactory> list3 = paramBuilder.components;
      if (list3 == null) {
        this.components = DEFAULT_COMPONENTS;
      } else {
        this.components = Message.immutableCopyOf(list3);
      } 
      this.title = paramBuilder.title;
      this.feedback = paramBuilder.feedback;
      List<FeedKV> list2 = paramBuilder.business_info;
      if (list2 == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list2);
      } 
      list2 = paramBuilder.appendix;
      if (list2 == null) {
        this.appendix = DEFAULT_APPENDIX;
      } else {
        this.appendix = Message.immutableCopyOf(list2);
      } 
      list2 = paramBuilder.log_param;
      if (list2 == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list2);
      } 
      List<String> list1 = paramBuilder.prefetch_schema;
      if (list1 == null) {
        this.prefetch_schema = DEFAULT_PREFETCH_SCHEMA;
      } else {
        this.prefetch_schema = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.log_info;
      if (list == null) {
        this.log_info = DEFAULT_LOG_INFO;
      } else {
        this.log_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.components = Message.immutableCopyOf(((Builder)list).components);
      this.title = ((Builder)list).title;
      this.feedback = ((Builder)list).feedback;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
      this.appendix = Message.immutableCopyOf(((Builder)list).appendix);
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
      this.prefetch_schema = Message.immutableCopyOf(((Builder)list).prefetch_schema);
      this.log_info = Message.immutableCopyOf(((Builder)list).log_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<SidewayLayout> {
    public List<FeedKV> appendix;
    
    public List<FeedKV> business_info;
    
    public List<ComponentFactory> components;
    
    public FeedFeedback feedback;
    
    public List<FeedKV> log_info;
    
    public List<FeedKV> log_param;
    
    public List<String> prefetch_schema;
    
    public ComponentFactory title;
    
    public Builder() {}
    
    public Builder(SidewayLayout param1SidewayLayout) {
      super(param1SidewayLayout);
      if (param1SidewayLayout == null)
        return; 
      this.components = Message.copyOf(param1SidewayLayout.components);
      this.title = param1SidewayLayout.title;
      this.feedback = param1SidewayLayout.feedback;
      this.business_info = Message.copyOf(param1SidewayLayout.business_info);
      this.appendix = Message.copyOf(param1SidewayLayout.appendix);
      this.log_param = Message.copyOf(param1SidewayLayout.log_param);
      this.prefetch_schema = Message.copyOf(param1SidewayLayout.prefetch_schema);
      this.log_info = Message.copyOf(param1SidewayLayout.log_info);
    }
    
    public SidewayLayout build(boolean param1Boolean) {
      return new SidewayLayout(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
