package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FrsBottomActivityTime extends Message {
  public static final Long DEFAULT_END_TIME;
  
  public static final Long DEFAULT_START_TIME;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long end_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long start_time;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_START_TIME = long_;
    DEFAULT_END_TIME = long_;
  }
  
  public FrsBottomActivityTime(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.start_time;
      if (long_1 == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = long_1;
      } 
      long_ = paramBuilder.end_time;
      if (long_ == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = long_;
      } 
    } else {
      this.start_time = ((Builder)long_).start_time;
      this.end_time = ((Builder)long_).end_time;
    } 
  }
  
  public static final class Builder extends Message.Builder<FrsBottomActivityTime> {
    public Long end_time;
    
    public Long start_time;
    
    public Builder() {}
    
    public Builder(FrsBottomActivityTime param1FrsBottomActivityTime) {
      super(param1FrsBottomActivityTime);
      if (param1FrsBottomActivityTime == null)
        return; 
      this.start_time = param1FrsBottomActivityTime.start_time;
      this.end_time = param1FrsBottomActivityTime.end_time;
    }
    
    public FrsBottomActivityTime build(boolean param1Boolean) {
      return new FrsBottomActivityTime(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
