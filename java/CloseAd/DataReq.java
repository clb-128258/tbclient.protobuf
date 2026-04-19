package tbclient.CloseAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_LIVE_CLOSE;
  
  public static final Integer DEFAULT_VIP_CLOSE;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer live_close;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer vip_close;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_VIP_CLOSE = integer;
    DEFAULT_LIVE_CLOSE = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer1 = paramBuilder.vip_close;
      if (integer1 == null) {
        this.vip_close = DEFAULT_VIP_CLOSE;
      } else {
        this.vip_close = integer1;
      } 
      integer = paramBuilder.live_close;
      if (integer == null) {
        this.live_close = DEFAULT_LIVE_CLOSE;
      } else {
        this.live_close = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.vip_close = ((Builder)integer).vip_close;
      this.live_close = ((Builder)integer).live_close;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Integer live_close;
    
    public Integer vip_close;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.vip_close = param1DataReq.vip_close;
      this.live_close = param1DataReq.live_close;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
