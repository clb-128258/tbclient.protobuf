package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class KjsTradeFlow extends Message {
  public static final List<KjsTradeFlowStep> DEFAULT_STEPS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<KjsTradeFlowStep> steps;
  
  public KjsTradeFlow(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<KjsTradeFlowStep> list;
    if (paramBoolean == true) {
      list = paramBuilder.steps;
      if (list == null) {
        this.steps = DEFAULT_STEPS;
      } else {
        this.steps = Message.immutableCopyOf(list);
      } 
    } else {
      this.steps = Message.immutableCopyOf(((Builder)list).steps);
    } 
  }
  
  public static final class Builder extends Message.Builder<KjsTradeFlow> {
    public List<KjsTradeFlowStep> steps;
    
    public Builder() {}
    
    public Builder(KjsTradeFlow param1KjsTradeFlow) {
      super(param1KjsTradeFlow);
      if (param1KjsTradeFlow == null)
        return; 
      this.steps = Message.copyOf(param1KjsTradeFlow.steps);
    }
    
    public KjsTradeFlow build(boolean param1Boolean) {
      return new KjsTradeFlow(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
