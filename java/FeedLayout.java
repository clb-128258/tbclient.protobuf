package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedLayout extends Message {
  public static final List<FeedKV> DEFAULT_APPENDIX;
  
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final List<ComponentFactory> DEFAULT_COMPONENTS = Collections.emptyList();
  
  public static final List<ComponentFactory> DEFAULT_COMPONENTS_NEW_STYLE;
  
  public static final List<FeedKV> DEFAULT_LOG_INFO = Collections.emptyList();
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final List<String> DEFAULT_PREFETCH_SCHEMA;
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<FeedKV> appendix;
  
  @ProtoField(tag = 9)
  public final FeedContentIcon background;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<FeedKV> business_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ComponentFactory> components;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 11)
  public final List<ComponentFactory> components_new_style;
  
  @ProtoField(tag = 4)
  public final FeedFeedback feedback;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedKV> log_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<FeedKV> log_param;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
  public final List<String> prefetch_schema;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String schema;
  
  static {
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
    DEFAULT_APPENDIX = Collections.emptyList();
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_PREFETCH_SCHEMA = Collections.emptyList();
    DEFAULT_COMPONENTS_NEW_STYLE = Collections.emptyList();
  }
  
  public FeedLayout(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ComponentFactory> list;
    if (paramBoolean == true) {
      List<ComponentFactory> list3 = paramBuilder.components;
      if (list3 == null) {
        this.components = DEFAULT_COMPONENTS;
      } else {
        this.components = Message.immutableCopyOf(list3);
      } 
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      List<FeedKV> list2 = paramBuilder.log_info;
      if (list2 == null) {
        this.log_info = DEFAULT_LOG_INFO;
      } else {
        this.log_info = Message.immutableCopyOf(list2);
      } 
      this.feedback = paramBuilder.feedback;
      list2 = paramBuilder.business_info;
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
      this.background = paramBuilder.background;
      list = paramBuilder.components_new_style;
      if (list == null) {
        this.components_new_style = DEFAULT_COMPONENTS_NEW_STYLE;
      } else {
        this.components_new_style = Message.immutableCopyOf(list);
      } 
    } else {
      this.components = Message.immutableCopyOf(((Builder)list).components);
      this.schema = ((Builder)list).schema;
      this.log_info = Message.immutableCopyOf(((Builder)list).log_info);
      this.feedback = ((Builder)list).feedback;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
      this.appendix = Message.immutableCopyOf(((Builder)list).appendix);
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
      this.prefetch_schema = Message.immutableCopyOf(((Builder)list).prefetch_schema);
      this.background = ((Builder)list).background;
      this.components_new_style = Message.immutableCopyOf(((Builder)list).components_new_style);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedLayout> {
    public List<FeedKV> appendix;
    
    public FeedContentIcon background;
    
    public List<FeedKV> business_info;
    
    public List<ComponentFactory> components;
    
    public List<ComponentFactory> components_new_style;
    
    public FeedFeedback feedback;
    
    public List<FeedKV> log_info;
    
    public List<FeedKV> log_param;
    
    public List<String> prefetch_schema;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FeedLayout param1FeedLayout) {
      super(param1FeedLayout);
      if (param1FeedLayout == null)
        return; 
      this.components = Message.copyOf(param1FeedLayout.components);
      this.schema = param1FeedLayout.schema;
      this.log_info = Message.copyOf(param1FeedLayout.log_info);
      this.feedback = param1FeedLayout.feedback;
      this.business_info = Message.copyOf(param1FeedLayout.business_info);
      this.appendix = Message.copyOf(param1FeedLayout.appendix);
      this.log_param = Message.copyOf(param1FeedLayout.log_param);
      this.prefetch_schema = Message.copyOf(param1FeedLayout.prefetch_schema);
      this.background = param1FeedLayout.background;
      this.components_new_style = Message.copyOf(param1FeedLayout.components_new_style);
    }
    
    public FeedLayout build(boolean param1Boolean) {
      return new FeedLayout(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
