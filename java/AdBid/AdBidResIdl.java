package tbclient.AdBid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class AdBidResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public AdBidResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public static final class Builder extends Message.Builder<AdBidResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(AdBidResIdl param1AdBidResIdl) {
      super(param1AdBidResIdl);
      if (param1AdBidResIdl == null)
        return; 
      this.error = param1AdBidResIdl.error;
      this.data = param1AdBidResIdl.data;
    }
    
    public AdBidResIdl build(boolean param1Boolean) {
      return new AdBidResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
