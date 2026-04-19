package tbclient.AdBid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AdBidReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public AdBidReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public static final class Builder extends Message.Builder<AdBidReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(AdBidReqIdl param1AdBidReqIdl) {
      super(param1AdBidReqIdl);
      if (param1AdBidReqIdl == null)
        return; 
      this.data = param1AdBidReqIdl.data;
    }
    
    public AdBidReqIdl build(boolean param1Boolean) {
      return new AdBidReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
