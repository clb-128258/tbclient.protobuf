package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeedKV;

public final class AuxiliaryFunc extends Message {
  public static final List<AuxiliaryAllTools> DEFAULT_ALL_TOOLS;
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final List<AuxiliaryToolsInfo> DEFAULT_OUTSIDE_TOOLS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<AuxiliaryAllTools> all_tools;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedKV> log_param;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<AuxiliaryToolsInfo> outside_tools;
  
  static {
    DEFAULT_ALL_TOOLS = Collections.emptyList();
    DEFAULT_LOG_PARAM = Collections.emptyList();
  }
  
  public AuxiliaryFunc(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      List<AuxiliaryToolsInfo> list2 = paramBuilder.outside_tools;
      if (list2 == null) {
        this.outside_tools = DEFAULT_OUTSIDE_TOOLS;
      } else {
        this.outside_tools = Message.immutableCopyOf(list2);
      } 
      List<AuxiliaryAllTools> list1 = paramBuilder.all_tools;
      if (list1 == null) {
        this.all_tools = DEFAULT_ALL_TOOLS;
      } else {
        this.all_tools = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
    } else {
      this.outside_tools = Message.immutableCopyOf(((Builder)list).outside_tools);
      this.all_tools = Message.immutableCopyOf(((Builder)list).all_tools);
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
    } 
  }
  
  public static final class Builder extends Message.Builder<AuxiliaryFunc> {
    public List<AuxiliaryAllTools> all_tools;
    
    public List<FeedKV> log_param;
    
    public List<AuxiliaryToolsInfo> outside_tools;
    
    public Builder() {}
    
    public Builder(AuxiliaryFunc param1AuxiliaryFunc) {
      super(param1AuxiliaryFunc);
      if (param1AuxiliaryFunc == null)
        return; 
      this.outside_tools = Message.copyOf(param1AuxiliaryFunc.outside_tools);
      this.all_tools = Message.copyOf(param1AuxiliaryFunc.all_tools);
      this.log_param = Message.copyOf(param1AuxiliaryFunc.log_param);
    }
    
    public AuxiliaryFunc build(boolean param1Boolean) {
      return new AuxiliaryFunc(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
