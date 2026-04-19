package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CardFreq extends Message {
  public static final Long DEFAULT_END_TIME;
  
  public static final Long DEFAULT_SHOW_TIMES;
  
  public static final Long DEFAULT_START_TIME;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long end_time;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long show_times;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long start_time;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_START_TIME = long_;
    DEFAULT_END_TIME = long_;
    DEFAULT_SHOW_TIMES = long_;
  }
  
  public CardFreq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.start_time;
      if (long_1 == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = long_1;
      } 
      long_1 = paramBuilder.end_time;
      if (long_1 == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = long_1;
      } 
      long_ = paramBuilder.show_times;
      if (long_ == null) {
        this.show_times = DEFAULT_SHOW_TIMES;
      } else {
        this.show_times = long_;
      } 
    } else {
      this.start_time = ((Builder)long_).start_time;
      this.end_time = ((Builder)long_).end_time;
      this.show_times = ((Builder)long_).show_times;
    } 
  }
  
  public static final class Builder extends Message.Builder<CardFreq> {
    public Long end_time;
    
    public Long show_times;
    
    public Long start_time;
    
    public Builder() {}
    
    public Builder(CardFreq param1CardFreq) {
      super(param1CardFreq);
      if (param1CardFreq == null)
        return; 
      this.start_time = param1CardFreq.start_time;
      this.end_time = param1CardFreq.end_time;
      this.show_times = param1CardFreq.show_times;
    }
    
    public CardFreq build(boolean param1Boolean) {
      return new CardFreq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
