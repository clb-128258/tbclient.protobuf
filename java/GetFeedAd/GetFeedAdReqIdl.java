package tbclient.GetFeedAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetFeedAdReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetFeedAdReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public static final class Builder extends Message.Builder<GetFeedAdReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetFeedAdReqIdl param1GetFeedAdReqIdl) {
      super(param1GetFeedAdReqIdl);
      if (param1GetFeedAdReqIdl == null)
        return; 
      this.data = param1GetFeedAdReqIdl.data;
    }
    
    public GetFeedAdReqIdl build(boolean param1Boolean) {
      return new GetFeedAdReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
