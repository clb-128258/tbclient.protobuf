package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class SideWayFeedLayout extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final List<ComponentFactory> DEFAULT_COMPONENTS;
  
  public static final Integer DEFAULT_IS_FULL_SCREEN = Integer.valueOf(0);
  
  public static final List<FeedKV> DEFAULT_LOG_INFO;
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  @ProtoField(tag = 1)
  public final FeedContentColor bottom_bacground_color;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<FeedKV> business_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ComponentFactory> components;
  
  @ProtoField(tag = 8)
  public final FeedFeedback feedback;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer is_full_screen;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<FeedKV> log_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<FeedKV> log_param;
  
  static {
    DEFAULT_COMPONENTS = Collections.emptyList();
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_LOG_INFO = Collections.emptyList();
  }
  
  public SideWayFeedLayout(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.bottom_bacground_color = paramBuilder.bottom_bacground_color;
      Integer integer = paramBuilder.is_full_screen;
      if (integer == null) {
        this.is_full_screen = DEFAULT_IS_FULL_SCREEN;
      } else {
        this.is_full_screen = integer;
      } 
      List<ComponentFactory> list1 = paramBuilder.components;
      if (list1 == null) {
        this.components = DEFAULT_COMPONENTS;
      } else {
        this.components = Message.immutableCopyOf(list1);
      } 
      List<FeedKV> list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.log_info;
      if (list == null) {
        this.log_info = DEFAULT_LOG_INFO;
      } else {
        this.log_info = Message.immutableCopyOf(list);
      } 
      this.feedback = paramBuilder.feedback;
    } else {
      this.bottom_bacground_color = paramBuilder.bottom_bacground_color;
      this.is_full_screen = paramBuilder.is_full_screen;
      this.components = Message.immutableCopyOf(paramBuilder.components);
      this.business_info = Message.immutableCopyOf(paramBuilder.business_info);
      this.log_param = Message.immutableCopyOf(paramBuilder.log_param);
      this.log_info = Message.immutableCopyOf(paramBuilder.log_info);
      this.feedback = paramBuilder.feedback;
    } 
  }
  
  public static final class Builder extends Message.Builder<SideWayFeedLayout> {
    public FeedContentColor bottom_bacground_color;
    
    public List<FeedKV> business_info;
    
    public List<ComponentFactory> components;
    
    public FeedFeedback feedback;
    
    public Integer is_full_screen;
    
    public List<FeedKV> log_info;
    
    public List<FeedKV> log_param;
    
    public Builder() {}
    
    public Builder(SideWayFeedLayout param1SideWayFeedLayout) {
      super(param1SideWayFeedLayout);
      if (param1SideWayFeedLayout == null)
        return; 
      this.bottom_bacground_color = param1SideWayFeedLayout.bottom_bacground_color;
      this.is_full_screen = param1SideWayFeedLayout.is_full_screen;
      this.components = Message.copyOf(param1SideWayFeedLayout.components);
      this.business_info = Message.copyOf(param1SideWayFeedLayout.business_info);
      this.log_param = Message.copyOf(param1SideWayFeedLayout.log_param);
      this.log_info = Message.copyOf(param1SideWayFeedLayout.log_info);
      this.feedback = param1SideWayFeedLayout.feedback;
    }
    
    public SideWayFeedLayout build(boolean param1Boolean) {
      return new SideWayFeedLayout(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
