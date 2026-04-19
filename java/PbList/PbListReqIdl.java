package tbclient.PbList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PbListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public PbListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public static final class Builder extends Message.Builder<PbListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(PbListReqIdl param1PbListReqIdl) {
      super(param1PbListReqIdl);
      if (param1PbListReqIdl == null)
        return; 
      this.data = param1PbListReqIdl.data;
    }
    
    public PbListReqIdl build(boolean param1Boolean) {
      return new PbListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
