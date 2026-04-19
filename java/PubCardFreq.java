package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PubCardFreq extends Message {
  public static final String DEFAULT_CLOSE_DAY = "";
  
  public static final Integer DEFAULT_CONTINUE_NO_CLICK_EXIT;
  
  public static final Integer DEFAULT_CONTINUOUS_NOT_CLICK_TIMES;
  
  public static final Long DEFAULT_END_TIME;
  
  public static final String DEFAULT_NOT_SHOW_TIMES = "";
  
  public static final Integer DEFAULT_SHOW_INTERVAL;
  
  public static final Long DEFAULT_SHOW_TIMES;
  
  public static final Long DEFAULT_START_TIME;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String close_day;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer continue_no_click_exit;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer continuous_not_click_times;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long end_time;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String not_show_times;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer show_interval;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long show_times;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long start_time;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_START_TIME = long_;
    DEFAULT_END_TIME = long_;
    DEFAULT_SHOW_TIMES = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_SHOW_INTERVAL = integer;
    DEFAULT_CONTINUE_NO_CLICK_EXIT = integer;
    DEFAULT_CONTINUOUS_NOT_CLICK_TIMES = integer;
  }
  
  public PubCardFreq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.start_time;
      if (long_ == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = long_;
      } 
      long_ = paramBuilder.end_time;
      if (long_ == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = long_;
      } 
      long_ = paramBuilder.show_times;
      if (long_ == null) {
        this.show_times = DEFAULT_SHOW_TIMES;
      } else {
        this.show_times = long_;
      } 
      Integer integer2 = paramBuilder.show_interval;
      if (integer2 == null) {
        this.show_interval = DEFAULT_SHOW_INTERVAL;
      } else {
        this.show_interval = integer2;
      } 
      integer2 = paramBuilder.continue_no_click_exit;
      if (integer2 == null) {
        this.continue_no_click_exit = DEFAULT_CONTINUE_NO_CLICK_EXIT;
      } else {
        this.continue_no_click_exit = integer2;
      } 
      String str1 = paramBuilder.not_show_times;
      if (str1 == null) {
        this.not_show_times = "";
      } else {
        this.not_show_times = str1;
      } 
      Integer integer1 = paramBuilder.continuous_not_click_times;
      if (integer1 == null) {
        this.continuous_not_click_times = DEFAULT_CONTINUOUS_NOT_CLICK_TIMES;
      } else {
        this.continuous_not_click_times = integer1;
      } 
      str = paramBuilder.close_day;
      if (str == null) {
        this.close_day = "";
      } else {
        this.close_day = str;
      } 
    } else {
      this.start_time = ((Builder)str).start_time;
      this.end_time = ((Builder)str).end_time;
      this.show_times = ((Builder)str).show_times;
      this.show_interval = ((Builder)str).show_interval;
      this.continue_no_click_exit = ((Builder)str).continue_no_click_exit;
      this.not_show_times = ((Builder)str).not_show_times;
      this.continuous_not_click_times = ((Builder)str).continuous_not_click_times;
      this.close_day = ((Builder)str).close_day;
    } 
  }
  
  public static final class Builder extends Message.Builder<PubCardFreq> {
    public String close_day;
    
    public Integer continue_no_click_exit;
    
    public Integer continuous_not_click_times;
    
    public Long end_time;
    
    public String not_show_times;
    
    public Integer show_interval;
    
    public Long show_times;
    
    public Long start_time;
    
    public Builder() {}
    
    public Builder(PubCardFreq param1PubCardFreq) {
      super(param1PubCardFreq);
      if (param1PubCardFreq == null)
        return; 
      this.start_time = param1PubCardFreq.start_time;
      this.end_time = param1PubCardFreq.end_time;
      this.show_times = param1PubCardFreq.show_times;
      this.show_interval = param1PubCardFreq.show_interval;
      this.continue_no_click_exit = param1PubCardFreq.continue_no_click_exit;
      this.not_show_times = param1PubCardFreq.not_show_times;
      this.continuous_not_click_times = param1PubCardFreq.continuous_not_click_times;
      this.close_day = param1PubCardFreq.close_day;
    }
    
    public PubCardFreq build(boolean param1Boolean) {
      return new PubCardFreq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
