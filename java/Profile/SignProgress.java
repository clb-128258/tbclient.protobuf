package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SignProgress extends Message {
  public static final Integer DEFAULT_CHECKIN_DAY;
  
  public static final Integer DEFAULT_EXTRA_REWARD;
  
  public static final Integer DEFAULT_INTERRUPT_REMAIN_DAYS;
  
  public static final String DEFAULT_INTERRUPT_TIPS = "";
  
  public static final Integer DEFAULT_IS_INTERRUPTED;
  
  public static final Integer DEFAULT_REWARD_EXPIRE_DAYS;
  
  public static final Long DEFAULT_REWARD_GUIDE_START_TIME;
  
  public static final String DEFAULT_REWARD_GUIDE_TEXT = "";
  
  public static final String DEFAULT_REWARD_IMAGE = "";
  
  public static final Integer DEFAULT_REWARD_QUALIFY;
  
  public static final String DEFAULT_REWARD_TIPS = "";
  
  public static final Integer DEFAULT_TODAY_COMPLETE;
  
  public static final Integer DEFAULT_TODAY_DONE;
  
  public static final Integer DEFAULT_TODAY_TOTAL;
  
  public static final Integer DEFAULT_TOTAL_DAYS;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer checkin_day;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer extra_reward;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer interrupt_remain_days;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String interrupt_tips;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_interrupted;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer reward_expire_days;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT64)
  public final Long reward_guide_start_time;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String reward_guide_text;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String reward_image;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer reward_qualify;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String reward_tips;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer today_complete;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer today_done;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer today_total;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer total_days;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_CHECKIN_DAY = integer;
    DEFAULT_TOTAL_DAYS = integer;
    DEFAULT_TODAY_DONE = integer;
    DEFAULT_TODAY_TOTAL = integer;
    DEFAULT_TODAY_COMPLETE = integer;
    DEFAULT_EXTRA_REWARD = integer;
    DEFAULT_IS_INTERRUPTED = integer;
    DEFAULT_INTERRUPT_REMAIN_DAYS = integer;
    DEFAULT_REWARD_QUALIFY = integer;
    DEFAULT_REWARD_EXPIRE_DAYS = integer;
    DEFAULT_REWARD_GUIDE_START_TIME = Long.valueOf(0L);
  }
  
  public SignProgress(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.checkin_day;
      if (integer2 == null) {
        this.checkin_day = DEFAULT_CHECKIN_DAY;
      } else {
        this.checkin_day = integer2;
      } 
      integer2 = paramBuilder.total_days;
      if (integer2 == null) {
        this.total_days = DEFAULT_TOTAL_DAYS;
      } else {
        this.total_days = integer2;
      } 
      integer2 = paramBuilder.today_done;
      if (integer2 == null) {
        this.today_done = DEFAULT_TODAY_DONE;
      } else {
        this.today_done = integer2;
      } 
      integer2 = paramBuilder.today_total;
      if (integer2 == null) {
        this.today_total = DEFAULT_TODAY_TOTAL;
      } else {
        this.today_total = integer2;
      } 
      integer2 = paramBuilder.today_complete;
      if (integer2 == null) {
        this.today_complete = DEFAULT_TODAY_COMPLETE;
      } else {
        this.today_complete = integer2;
      } 
      integer2 = paramBuilder.extra_reward;
      if (integer2 == null) {
        this.extra_reward = DEFAULT_EXTRA_REWARD;
      } else {
        this.extra_reward = integer2;
      } 
      integer2 = paramBuilder.is_interrupted;
      if (integer2 == null) {
        this.is_interrupted = DEFAULT_IS_INTERRUPTED;
      } else {
        this.is_interrupted = integer2;
      } 
      integer2 = paramBuilder.interrupt_remain_days;
      if (integer2 == null) {
        this.interrupt_remain_days = DEFAULT_INTERRUPT_REMAIN_DAYS;
      } else {
        this.interrupt_remain_days = integer2;
      } 
      String str2 = paramBuilder.interrupt_tips;
      if (str2 == null) {
        this.interrupt_tips = "";
      } else {
        this.interrupt_tips = str2;
      } 
      Integer integer1 = paramBuilder.reward_qualify;
      if (integer1 == null) {
        this.reward_qualify = DEFAULT_REWARD_QUALIFY;
      } else {
        this.reward_qualify = integer1;
      } 
      integer1 = paramBuilder.reward_expire_days;
      if (integer1 == null) {
        this.reward_expire_days = DEFAULT_REWARD_EXPIRE_DAYS;
      } else {
        this.reward_expire_days = integer1;
      } 
      String str1 = paramBuilder.reward_tips;
      if (str1 == null) {
        this.reward_tips = "";
      } else {
        this.reward_tips = str1;
      } 
      str1 = paramBuilder.reward_guide_text;
      if (str1 == null) {
        this.reward_guide_text = "";
      } else {
        this.reward_guide_text = str1;
      } 
      Long long_ = paramBuilder.reward_guide_start_time;
      if (long_ == null) {
        this.reward_guide_start_time = DEFAULT_REWARD_GUIDE_START_TIME;
      } else {
        this.reward_guide_start_time = long_;
      } 
      str = paramBuilder.reward_image;
      if (str == null) {
        this.reward_image = "";
      } else {
        this.reward_image = str;
      } 
    } else {
      this.checkin_day = ((Builder)str).checkin_day;
      this.total_days = ((Builder)str).total_days;
      this.today_done = ((Builder)str).today_done;
      this.today_total = ((Builder)str).today_total;
      this.today_complete = ((Builder)str).today_complete;
      this.extra_reward = ((Builder)str).extra_reward;
      this.is_interrupted = ((Builder)str).is_interrupted;
      this.interrupt_remain_days = ((Builder)str).interrupt_remain_days;
      this.interrupt_tips = ((Builder)str).interrupt_tips;
      this.reward_qualify = ((Builder)str).reward_qualify;
      this.reward_expire_days = ((Builder)str).reward_expire_days;
      this.reward_tips = ((Builder)str).reward_tips;
      this.reward_guide_text = ((Builder)str).reward_guide_text;
      this.reward_guide_start_time = ((Builder)str).reward_guide_start_time;
      this.reward_image = ((Builder)str).reward_image;
    } 
  }
  
  public static final class Builder extends Message.Builder<SignProgress> {
    public Integer checkin_day;
    
    public Integer extra_reward;
    
    public Integer interrupt_remain_days;
    
    public String interrupt_tips;
    
    public Integer is_interrupted;
    
    public Integer reward_expire_days;
    
    public Long reward_guide_start_time;
    
    public String reward_guide_text;
    
    public String reward_image;
    
    public Integer reward_qualify;
    
    public String reward_tips;
    
    public Integer today_complete;
    
    public Integer today_done;
    
    public Integer today_total;
    
    public Integer total_days;
    
    public Builder() {}
    
    public Builder(SignProgress param1SignProgress) {
      super(param1SignProgress);
      if (param1SignProgress == null)
        return; 
      this.checkin_day = param1SignProgress.checkin_day;
      this.total_days = param1SignProgress.total_days;
      this.today_done = param1SignProgress.today_done;
      this.today_total = param1SignProgress.today_total;
      this.today_complete = param1SignProgress.today_complete;
      this.extra_reward = param1SignProgress.extra_reward;
      this.is_interrupted = param1SignProgress.is_interrupted;
      this.interrupt_remain_days = param1SignProgress.interrupt_remain_days;
      this.interrupt_tips = param1SignProgress.interrupt_tips;
      this.reward_qualify = param1SignProgress.reward_qualify;
      this.reward_expire_days = param1SignProgress.reward_expire_days;
      this.reward_tips = param1SignProgress.reward_tips;
      this.reward_guide_text = param1SignProgress.reward_guide_text;
      this.reward_guide_start_time = param1SignProgress.reward_guide_start_time;
      this.reward_image = param1SignProgress.reward_image;
    }
    
    public SignProgress build(boolean param1Boolean) {
      return new SignProgress(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
