package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedToutiao extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedKV> business_info;
  
  public FeedToutiao(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedToutiao> {
    public List<FeedKV> business_info;
    
    public Builder() {}
    
    public Builder(FeedToutiao param1FeedToutiao) {
      super(param1FeedToutiao);
      if (param1FeedToutiao == null)
        return; 
      this.business_info = Message.copyOf(param1FeedToutiao.business_info);
    }
    
    public FeedToutiao build(boolean param1Boolean) {
      return new FeedToutiao(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
