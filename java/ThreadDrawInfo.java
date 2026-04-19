package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ThreadDrawInfo extends Message {
  public static final Integer DEFAULT_AUDIT_STATUS;
  
  public static final Long DEFAULT_DRAW_ID;
  
  public static final List<ThreadDrawPrize> DEFAULT_DRAW_PRIZE = Collections.emptyList();
  
  public static final Integer DEFAULT_JOIN_STATUS;
  
  public static final Integer DEFAULT_LOTTERY_TYPE;
  
  public static final Integer DEFAULT_OPEN_STATUS;
  
  public static final Long DEFAULT_OPEN_TIME;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer audit_status;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long draw_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadDrawPrize> draw_prize;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer join_status;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer lottery_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer open_status;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long open_time;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_AUDIT_STATUS = integer;
    DEFAULT_JOIN_STATUS = integer;
    DEFAULT_OPEN_STATUS = integer;
    DEFAULT_OPEN_TIME = long_;
    DEFAULT_LOTTERY_TYPE = integer;
  }
  
  public ThreadDrawInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.draw_id;
      if (long_2 == null) {
        this.draw_id = DEFAULT_DRAW_ID;
      } else {
        this.draw_id = long_2;
      } 
      List<ThreadDrawPrize> list = paramBuilder.draw_prize;
      if (list == null) {
        this.draw_prize = DEFAULT_DRAW_PRIZE;
      } else {
        this.draw_prize = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.audit_status;
      if (integer1 == null) {
        this.audit_status = DEFAULT_AUDIT_STATUS;
      } else {
        this.audit_status = integer1;
      } 
      integer1 = paramBuilder.join_status;
      if (integer1 == null) {
        this.join_status = DEFAULT_JOIN_STATUS;
      } else {
        this.join_status = integer1;
      } 
      integer1 = paramBuilder.open_status;
      if (integer1 == null) {
        this.open_status = DEFAULT_OPEN_STATUS;
      } else {
        this.open_status = integer1;
      } 
      Long long_1 = paramBuilder.open_time;
      if (long_1 == null) {
        this.open_time = DEFAULT_OPEN_TIME;
      } else {
        this.open_time = long_1;
      } 
      integer = paramBuilder.lottery_type;
      if (integer == null) {
        this.lottery_type = DEFAULT_LOTTERY_TYPE;
      } else {
        this.lottery_type = integer;
      } 
    } else {
      this.draw_id = ((Builder)integer).draw_id;
      this.draw_prize = Message.immutableCopyOf(((Builder)integer).draw_prize);
      this.audit_status = ((Builder)integer).audit_status;
      this.join_status = ((Builder)integer).join_status;
      this.open_status = ((Builder)integer).open_status;
      this.open_time = ((Builder)integer).open_time;
      this.lottery_type = ((Builder)integer).lottery_type;
    } 
  }
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_DRAW_ID = long_;
  }
  
  public static final class Builder extends Message.Builder<ThreadDrawInfo> {
    public Integer audit_status;
    
    public Long draw_id;
    
    public List<ThreadDrawPrize> draw_prize;
    
    public Integer join_status;
    
    public Integer lottery_type;
    
    public Integer open_status;
    
    public Long open_time;
    
    public Builder() {}
    
    public Builder(ThreadDrawInfo param1ThreadDrawInfo) {
      super(param1ThreadDrawInfo);
      if (param1ThreadDrawInfo == null)
        return; 
      this.draw_id = param1ThreadDrawInfo.draw_id;
      this.draw_prize = Message.copyOf(param1ThreadDrawInfo.draw_prize);
      this.audit_status = param1ThreadDrawInfo.audit_status;
      this.join_status = param1ThreadDrawInfo.join_status;
      this.open_status = param1ThreadDrawInfo.open_status;
      this.open_time = param1ThreadDrawInfo.open_time;
      this.lottery_type = param1ThreadDrawInfo.lottery_type;
    }
    
    public ThreadDrawInfo build(boolean param1Boolean) {
      return new ThreadDrawInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
