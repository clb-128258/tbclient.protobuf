package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedCountdown extends Message {
  public static final Long DEFAULT_ENDTIME = Long.valueOf(0L);
  
  public static final String DEFAULT_ENDTIME_TAIL = "";
  
  public static final String DEFAULT_ENDTIME_TYPE = "";
  
  @ProtoField(tag = 1)
  public final ThemeColorInfo color;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long endtime;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String endtime_tail;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String endtime_type;
  
  public FeedCountdown(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.color = paramBuilder.color;
      Long long_ = paramBuilder.endtime;
      if (long_ == null) {
        this.endtime = DEFAULT_ENDTIME;
      } else {
        this.endtime = long_;
      } 
      String str1 = paramBuilder.endtime_type;
      if (str1 == null) {
        this.endtime_type = "";
      } else {
        this.endtime_type = str1;
      } 
      str = paramBuilder.endtime_tail;
      if (str == null) {
        this.endtime_tail = "";
      } else {
        this.endtime_tail = str;
      } 
    } else {
      this.color = ((Builder)str).color;
      this.endtime = ((Builder)str).endtime;
      this.endtime_type = ((Builder)str).endtime_type;
      this.endtime_tail = ((Builder)str).endtime_tail;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedCountdown> {
    public ThemeColorInfo color;
    
    public Long endtime;
    
    public String endtime_tail;
    
    public String endtime_type;
    
    public Builder() {}
    
    public Builder(FeedCountdown param1FeedCountdown) {
      super(param1FeedCountdown);
      if (param1FeedCountdown == null)
        return; 
      this.color = param1FeedCountdown.color;
      this.endtime = param1FeedCountdown.endtime;
      this.endtime_type = param1FeedCountdown.endtime_type;
      this.endtime_tail = param1FeedCountdown.endtime_tail;
    }
    
    public FeedCountdown build(boolean param1Boolean) {
      return new FeedCountdown(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
