package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ProsAndConsInfo extends Message {
  @ProtoField(tag = 2)
  public final PollOption cons;
  
  @ProtoField(tag = 1)
  public final PollOption pros;
  
  public ProsAndConsInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.pros = paramBuilder.pros;
      this.cons = paramBuilder.cons;
    } else {
      this.pros = paramBuilder.pros;
      this.cons = paramBuilder.cons;
    } 
  }
  
  public static final class Builder extends Message.Builder<ProsAndConsInfo> {
    public PollOption cons;
    
    public PollOption pros;
    
    public Builder() {}
    
    public Builder(ProsAndConsInfo param1ProsAndConsInfo) {
      super(param1ProsAndConsInfo);
      if (param1ProsAndConsInfo == null)
        return; 
      this.pros = param1ProsAndConsInfo.pros;
      this.cons = param1ProsAndConsInfo.cons;
    }
    
    public ProsAndConsInfo build(boolean param1Boolean) {
      return new ProsAndConsInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
