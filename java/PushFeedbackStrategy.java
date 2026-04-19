package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PushFeedbackStrategy extends Message {
  public static final Integer DEFAULT_INTERVAL;
  
  public static final Integer DEFAULT_START_TIME;
  
  public static final Integer DEFAULT_TIMES;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer interval;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer start_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer times;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TIMES = integer;
    DEFAULT_INTERVAL = integer;
    DEFAULT_START_TIME = integer;
  }
  
  public PushFeedbackStrategy(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.times;
      if (integer1 == null) {
        this.times = DEFAULT_TIMES;
      } else {
        this.times = integer1;
      } 
      integer1 = paramBuilder.interval;
      if (integer1 == null) {
        this.interval = DEFAULT_INTERVAL;
      } else {
        this.interval = integer1;
      } 
      integer = paramBuilder.start_time;
      if (integer == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = integer;
      } 
    } else {
      this.times = ((Builder)integer).times;
      this.interval = ((Builder)integer).interval;
      this.start_time = ((Builder)integer).start_time;
    } 
  }
  
  public static final class Builder extends Message.Builder<PushFeedbackStrategy> {
    public Integer interval;
    
    public Integer start_time;
    
    public Integer times;
    
    public Builder() {}
    
    public Builder(PushFeedbackStrategy param1PushFeedbackStrategy) {
      super(param1PushFeedbackStrategy);
      if (param1PushFeedbackStrategy == null)
        return; 
      this.times = param1PushFeedbackStrategy.times;
      this.interval = param1PushFeedbackStrategy.interval;
      this.start_time = param1PushFeedbackStrategy.start_time;
    }
    
    public PushFeedbackStrategy build(boolean param1Boolean) {
      return new PushFeedbackStrategy(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
