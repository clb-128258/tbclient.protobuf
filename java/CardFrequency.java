package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CardFrequency extends Message {
  public static final Long DEFAULT_END_TIME;
  
  public static final Integer DEFAULT_IS_REMOVE_DUPLICATE;
  
  public static final String DEFAULT_KEY = "";
  
  public static final Integer DEFAULT_MAX_COUNT;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long end_time;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_remove_duplicate;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String key;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer max_count;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_MAX_COUNT = integer;
    DEFAULT_IS_REMOVE_DUPLICATE = integer;
    DEFAULT_END_TIME = Long.valueOf(0L);
  }
  
  public CardFrequency(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.key;
      if (str == null) {
        this.key = "";
      } else {
        this.key = str;
      } 
      Integer integer = paramBuilder.max_count;
      if (integer == null) {
        this.max_count = DEFAULT_MAX_COUNT;
      } else {
        this.max_count = integer;
      } 
      integer = paramBuilder.is_remove_duplicate;
      if (integer == null) {
        this.is_remove_duplicate = DEFAULT_IS_REMOVE_DUPLICATE;
      } else {
        this.is_remove_duplicate = integer;
      } 
      long_ = paramBuilder.end_time;
      if (long_ == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = long_;
      } 
    } else {
      this.key = ((Builder)long_).key;
      this.max_count = ((Builder)long_).max_count;
      this.is_remove_duplicate = ((Builder)long_).is_remove_duplicate;
      this.end_time = ((Builder)long_).end_time;
    } 
  }
  
  public static final class Builder extends Message.Builder<CardFrequency> {
    public Long end_time;
    
    public Integer is_remove_duplicate;
    
    public String key;
    
    public Integer max_count;
    
    public Builder() {}
    
    public Builder(CardFrequency param1CardFrequency) {
      super(param1CardFrequency);
      if (param1CardFrequency == null)
        return; 
      this.key = param1CardFrequency.key;
      this.max_count = param1CardFrequency.max_count;
      this.is_remove_duplicate = param1CardFrequency.is_remove_duplicate;
      this.end_time = param1CardFrequency.end_time;
    }
    
    public CardFrequency build(boolean param1Boolean) {
      return new CardFrequency(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
