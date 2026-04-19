package tbclient.GetFeedAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetFeedAdResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetFeedAdResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public static final class Builder extends Message.Builder<GetFeedAdResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetFeedAdResIdl param1GetFeedAdResIdl) {
      super(param1GetFeedAdResIdl);
      if (param1GetFeedAdResIdl == null)
        return; 
      this.error = param1GetFeedAdResIdl.error;
      this.data = param1GetFeedAdResIdl.data;
    }
    
    public GetFeedAdResIdl build(boolean param1Boolean) {
      return new GetFeedAdResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
