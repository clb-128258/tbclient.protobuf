package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class PlaceholderLayout extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedKV> business_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedKV> log_param;
  
  static {
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
  }
  
  public PlaceholderLayout(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      List<FeedKV> list1 = paramBuilder.log_param;
      if (list1 == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<PlaceholderLayout> {
    public List<FeedKV> business_info;
    
    public List<FeedKV> log_param;
    
    public Builder() {}
    
    public Builder(PlaceholderLayout param1PlaceholderLayout) {
      super(param1PlaceholderLayout);
      if (param1PlaceholderLayout == null)
        return; 
      this.log_param = Message.copyOf(param1PlaceholderLayout.log_param);
      this.business_info = Message.copyOf(param1PlaceholderLayout.business_info);
    }
    
    public PlaceholderLayout build(boolean param1Boolean) {
      return new PlaceholderLayout(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
