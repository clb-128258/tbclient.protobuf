package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeedKV;

public final class CommonFuncInfo extends Message {
  public static final List<CommonFunc> DEFAULT_COMMON_FUNC_NORAML = Collections.emptyList();
  
  public static final List<CommonFunc> DEFAULT_COMMON_FUNC_OTHER = Collections.emptyList();
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<CommonFunc> common_func_noraml;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<CommonFunc> common_func_other;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedKV> log_param;
  
  public CommonFuncInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      List<CommonFunc> list1 = paramBuilder.common_func_noraml;
      if (list1 == null) {
        this.common_func_noraml = DEFAULT_COMMON_FUNC_NORAML;
      } else {
        this.common_func_noraml = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.common_func_other;
      if (list1 == null) {
        this.common_func_other = DEFAULT_COMMON_FUNC_OTHER;
      } else {
        this.common_func_other = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
    } else {
      this.common_func_noraml = Message.immutableCopyOf(((Builder)list).common_func_noraml);
      this.common_func_other = Message.immutableCopyOf(((Builder)list).common_func_other);
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
    } 
  }
  
  public static final class Builder extends Message.Builder<CommonFuncInfo> {
    public List<CommonFunc> common_func_noraml;
    
    public List<CommonFunc> common_func_other;
    
    public List<FeedKV> log_param;
    
    public Builder() {}
    
    public Builder(CommonFuncInfo param1CommonFuncInfo) {
      super(param1CommonFuncInfo);
      if (param1CommonFuncInfo == null)
        return; 
      this.common_func_noraml = Message.copyOf(param1CommonFuncInfo.common_func_noraml);
      this.common_func_other = Message.copyOf(param1CommonFuncInfo.common_func_other);
      this.log_param = Message.copyOf(param1CommonFuncInfo.log_param);
    }
    
    public CommonFuncInfo build(boolean param1Boolean) {
      return new CommonFuncInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
