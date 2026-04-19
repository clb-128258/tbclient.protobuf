package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FrsOfficialRecomLayout extends Message {
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
  
  @ProtoField(tag = 7)
  public final FeedFeedback feedback;
  
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
  
  public FrsOfficialRecomLayout(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<ComponentFactory> list = paramBuilder.components;
      if (list == null) {
        this.components = DEFAULT_COMPONENTS;
      } else {
        this.components = Message.immutableCopyOf(list);
      } 
      List<FeedKV> list2 = paramBuilder.log_param;
      if (list2 == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list2);
      } 
      list2 = paramBuilder.business_info;
      if (list2 == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list2);
      } 
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      this.background = paramBuilder.background;
      List<FeedKV> list1 = paramBuilder.log_info;
      if (list1 == null) {
        this.log_info = DEFAULT_LOG_INFO;
      } else {
        this.log_info = Message.immutableCopyOf(list1);
      } 
      this.feedback = paramBuilder.feedback;
    } else {
      this.components = Message.immutableCopyOf(paramBuilder.components);
      this.log_param = Message.immutableCopyOf(paramBuilder.log_param);
      this.business_info = Message.immutableCopyOf(paramBuilder.business_info);
      this.schema = paramBuilder.schema;
      this.background = paramBuilder.background;
      this.log_info = Message.immutableCopyOf(paramBuilder.log_info);
      this.feedback = paramBuilder.feedback;
    } 
  }
  
  public static final class Builder extends Message.Builder<FrsOfficialRecomLayout> {
    public FeedContentIcon background;
    
    public List<FeedKV> business_info;
    
    public List<ComponentFactory> components;
    
    public FeedFeedback feedback;
    
    public List<FeedKV> log_info;
    
    public List<FeedKV> log_param;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FrsOfficialRecomLayout param1FrsOfficialRecomLayout) {
      super(param1FrsOfficialRecomLayout);
      if (param1FrsOfficialRecomLayout == null)
        return; 
      this.components = Message.copyOf(param1FrsOfficialRecomLayout.components);
      this.log_param = Message.copyOf(param1FrsOfficialRecomLayout.log_param);
      this.business_info = Message.copyOf(param1FrsOfficialRecomLayout.business_info);
      this.schema = param1FrsOfficialRecomLayout.schema;
      this.background = param1FrsOfficialRecomLayout.background;
      this.log_info = Message.copyOf(param1FrsOfficialRecomLayout.log_info);
      this.feedback = param1FrsOfficialRecomLayout.feedback;
    }
    
    public FrsOfficialRecomLayout build(boolean param1Boolean) {
      return new FrsOfficialRecomLayout(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
