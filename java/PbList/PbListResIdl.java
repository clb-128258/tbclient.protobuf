package tbclient.PbList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class PbListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public PbListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public static final class Builder extends Message.Builder<PbListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(PbListResIdl param1PbListResIdl) {
      super(param1PbListResIdl);
      if (param1PbListResIdl == null)
        return; 
      this.error = param1PbListResIdl.error;
      this.data = param1PbListResIdl.data;
    }
    
    public PbListResIdl build(boolean param1Boolean) {
      return new PbListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
