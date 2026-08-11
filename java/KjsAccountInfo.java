package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class KjsAccountInfo extends Message {
  @ProtoField(tag = 2)
  public final KjsAccountDetail account_info;
  
  @ProtoField(tag = 1)
  public final KjsTradeFlow trade_flow;
  
  public KjsAccountInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.trade_flow = paramBuilder.trade_flow;
      this.account_info = paramBuilder.account_info;
    } else {
      this.trade_flow = paramBuilder.trade_flow;
      this.account_info = paramBuilder.account_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<KjsAccountInfo> {
    public KjsAccountDetail account_info;
    
    public KjsTradeFlow trade_flow;
    
    public Builder() {}
    
    public Builder(KjsAccountInfo param1KjsAccountInfo) {
      super(param1KjsAccountInfo);
      if (param1KjsAccountInfo == null)
        return; 
      this.trade_flow = param1KjsAccountInfo.trade_flow;
      this.account_info = param1KjsAccountInfo.account_info;
    }
    
    public KjsAccountInfo build(boolean param1Boolean) {
      return new KjsAccountInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
