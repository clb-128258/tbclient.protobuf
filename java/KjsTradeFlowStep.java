package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class KjsTradeFlowStep extends Message {
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_STEP = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer step;
  
  public KjsTradeFlowStep(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.step;
      if (integer == null) {
        this.step = DEFAULT_STEP;
      } else {
        this.step = integer;
      } 
      str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
    } else {
      this.step = ((Builder)str).step;
      this.name = ((Builder)str).name;
    } 
  }
  
  public static final class Builder extends Message.Builder<KjsTradeFlowStep> {
    public String name;
    
    public Integer step;
    
    public Builder() {}
    
    public Builder(KjsTradeFlowStep param1KjsTradeFlowStep) {
      super(param1KjsTradeFlowStep);
      if (param1KjsTradeFlowStep == null)
        return; 
      this.step = param1KjsTradeFlowStep.step;
      this.name = param1KjsTradeFlowStep.name;
    }
    
    public KjsTradeFlowStep build(boolean param1Boolean) {
      return new KjsTradeFlowStep(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
