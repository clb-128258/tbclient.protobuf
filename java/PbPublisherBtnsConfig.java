package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PbPublisherBtnsConfig extends Message {
  public static final String DEFAULT_SCHEMA = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  public PbPublisherBtnsConfig(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<PbPublisherBtnsConfig> {
    public String schema;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(PbPublisherBtnsConfig param1PbPublisherBtnsConfig) {
      super(param1PbPublisherBtnsConfig);
      if (param1PbPublisherBtnsConfig == null)
        return; 
      this.type = param1PbPublisherBtnsConfig.type;
      this.schema = param1PbPublisherBtnsConfig.schema;
    }
    
    public PbPublisherBtnsConfig build(boolean param1Boolean) {
      return new PbPublisherBtnsConfig(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
