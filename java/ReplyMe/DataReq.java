package tbclient.ReplyMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_CALL_FROM = "";
  
  public static final String DEFAULT_IDS = "";
  
  public static final Integer DEFAULT_IS_FIRST;
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final Long DEFAULT_TID;
  
  public static final Long DEFAULT_TIME;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String call_from;
  
  @ProtoField(tag = 3)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String ids;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer is_first;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer q_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long time;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PN = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_Q_TYPE = integer;
    DEFAULT_IS_FIRST = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_TIME = long_;
    DEFAULT_TID = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Integer integer3 = paramBuilder.pn;
      if (integer3 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer3;
      } 
      String str2 = paramBuilder.ids;
      if (str2 == null) {
        this.ids = "";
      } else {
        this.ids = str2;
      } 
      this.common = paramBuilder.common;
      Integer integer2 = paramBuilder.scr_w;
      if (integer2 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer2;
      } 
      integer2 = paramBuilder.scr_h;
      if (integer2 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer2;
      } 
      Double double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
      Integer integer1 = paramBuilder.q_type;
      if (integer1 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer1;
      } 
      integer1 = paramBuilder.is_first;
      if (integer1 == null) {
        this.is_first = DEFAULT_IS_FIRST;
      } else {
        this.is_first = integer1;
      } 
      String str1 = paramBuilder.call_from;
      if (str1 == null) {
        this.call_from = "";
      } else {
        this.call_from = str1;
      } 
      Long long_1 = paramBuilder.time;
      if (long_1 == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = long_1;
      } 
      long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
    } else {
      this.pn = ((Builder)long_).pn;
      this.ids = ((Builder)long_).ids;
      this.common = ((Builder)long_).common;
      this.scr_w = ((Builder)long_).scr_w;
      this.scr_h = ((Builder)long_).scr_h;
      this.scr_dip = ((Builder)long_).scr_dip;
      this.q_type = ((Builder)long_).q_type;
      this.is_first = ((Builder)long_).is_first;
      this.call_from = ((Builder)long_).call_from;
      this.time = ((Builder)long_).time;
      this.tid = ((Builder)long_).tid;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public String call_from;
    
    public CommonReq common;
    
    public String ids;
    
    public Integer is_first;
    
    public Integer pn;
    
    public Integer q_type;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public Long tid;
    
    public Long time;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.pn = param1DataReq.pn;
      this.ids = param1DataReq.ids;
      this.common = param1DataReq.common;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.q_type = param1DataReq.q_type;
      this.is_first = param1DataReq.is_first;
      this.call_from = param1DataReq.call_from;
      this.time = param1DataReq.time;
      this.tid = param1DataReq.tid;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
