package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PrefetchInfo extends Message {
  public static final String DEFAULT_PREFETCH_SCHEMA = "";
  
  public static final Long DEFAULT_THREAD_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String prefetch_schema;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  public PrefetchInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.thread_id;
      if (long_ == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_;
      } 
      str = paramBuilder.prefetch_schema;
      if (str == null) {
        this.prefetch_schema = "";
      } else {
        this.prefetch_schema = str;
      } 
    } else {
      this.thread_id = ((Builder)str).thread_id;
      this.prefetch_schema = ((Builder)str).prefetch_schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<PrefetchInfo> {
    public String prefetch_schema;
    
    public Long thread_id;
    
    public Builder() {}
    
    public Builder(PrefetchInfo param1PrefetchInfo) {
      super(param1PrefetchInfo);
      if (param1PrefetchInfo == null)
        return; 
      this.thread_id = param1PrefetchInfo.thread_id;
      this.prefetch_schema = param1PrefetchInfo.prefetch_schema;
    }
    
    public PrefetchInfo build(boolean param1Boolean) {
      return new PrefetchInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
