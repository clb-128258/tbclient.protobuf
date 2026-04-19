package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeedKV;

public final class CommerceInfo extends Message {
  public static final List<Commerce> DEFAULT_COMMERCE = Collections.emptyList();
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<Commerce> commerce;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedKV> log_param;
  
  public CommerceInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      List<Commerce> list1 = paramBuilder.commerce;
      if (list1 == null) {
        this.commerce = DEFAULT_COMMERCE;
      } else {
        this.commerce = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
    } else {
      this.commerce = Message.immutableCopyOf(((Builder)list).commerce);
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
    } 
  }
  
  public static final class Builder extends Message.Builder<CommerceInfo> {
    public List<Commerce> commerce;
    
    public List<FeedKV> log_param;
    
    public Builder() {}
    
    public Builder(CommerceInfo param1CommerceInfo) {
      super(param1CommerceInfo);
      if (param1CommerceInfo == null)
        return; 
      this.commerce = Message.copyOf(param1CommerceInfo.commerce);
      this.log_param = Message.copyOf(param1CommerceInfo.log_param);
    }
    
    public CommerceInfo build(boolean param1Boolean) {
      return new CommerceInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
