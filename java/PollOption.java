package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PollOption extends Message {
  public static final Integer DEFAULT_ID;
  
  public static final String DEFAULT_IMAGE = "";
  
  public static final Integer DEFAULT_IS_POLLED;
  
  public static final Long DEFAULT_NUM = Long.valueOf(0L);
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_polled;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long num;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String text;
  
  static {
    DEFAULT_IS_POLLED = integer;
  }
  
  public PollOption(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.id;
      if (integer1 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer1;
      } 
      Long long_ = paramBuilder.num;
      if (long_ == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = long_;
      } 
      String str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      str = paramBuilder.image;
      if (str == null) {
        this.image = "";
      } else {
        this.image = str;
      } 
      integer = paramBuilder.is_polled;
      if (integer == null) {
        this.is_polled = DEFAULT_IS_POLLED;
      } else {
        this.is_polled = integer;
      } 
    } else {
      this.id = ((Builder)integer).id;
      this.num = ((Builder)integer).num;
      this.text = ((Builder)integer).text;
      this.image = ((Builder)integer).image;
      this.is_polled = ((Builder)integer).is_polled;
    } 
  }
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ID = integer;
  }
  
  public static final class Builder extends Message.Builder<PollOption> {
    public Integer id;
    
    public String image;
    
    public Integer is_polled;
    
    public Long num;
    
    public String text;
    
    public Builder() {}
    
    public Builder(PollOption param1PollOption) {
      super(param1PollOption);
      if (param1PollOption == null)
        return; 
      this.id = param1PollOption.id;
      this.num = param1PollOption.num;
      this.text = param1PollOption.text;
      this.image = param1PollOption.image;
      this.is_polled = param1PollOption.is_polled;
    }
    
    public PollOption build(boolean param1Boolean) {
      return new PollOption(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
