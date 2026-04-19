package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_BFROM = "";
  
  public static final Integer DEFAULT_CALL_FROM;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FRS_COMMON_INFO = "";
  
  public static final Integer DEFAULT_IS_NEWFEED;
  
  public static final Integer DEFAULT_IS_NEWFRS;
  
  public static final Long DEFAULT_POST_ID;
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final String DEFAULT_TAB_NAME = "";
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final Long DEFAULT_VIDEO_ID;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String bfrom;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer call_from;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String frs_common_info;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer is_newfeed;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer is_newfrs;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer q_type;
  
  @ProtoField(tag = 7, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String tab_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT64)
  public final Long video_id;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_THREAD_ID = long_;
    DEFAULT_POST_ID = long_;
    DEFAULT_FORUM_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_Q_TYPE = integer;
    DEFAULT_CALL_FROM = integer;
    DEFAULT_IS_NEWFRS = integer;
    DEFAULT_IS_NEWFEED = integer;
    DEFAULT_VIDEO_ID = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_1 = paramBuilder.thread_id;
      if (long_1 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_1;
      } 
      long_1 = paramBuilder.post_id;
      if (long_1 == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_1;
      } 
      long_1 = paramBuilder.forum_id;
      if (long_1 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_1;
      } 
      Integer integer4 = paramBuilder.scr_w;
      if (integer4 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer4;
      } 
      integer4 = paramBuilder.scr_h;
      if (integer4 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer4;
      } 
      Double double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
      Integer integer3 = paramBuilder.q_type;
      if (integer3 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer3;
      } 
      String str3 = paramBuilder.bfrom;
      if (str3 == null) {
        this.bfrom = "";
      } else {
        this.bfrom = str3;
      } 
      Integer integer2 = paramBuilder.call_from;
      if (integer2 == null) {
        this.call_from = DEFAULT_CALL_FROM;
      } else {
        this.call_from = integer2;
      } 
      String str2 = paramBuilder.frs_common_info;
      if (str2 == null) {
        this.frs_common_info = "";
      } else {
        this.frs_common_info = str2;
      } 
      Integer integer1 = paramBuilder.is_newfrs;
      if (integer1 == null) {
        this.is_newfrs = DEFAULT_IS_NEWFRS;
      } else {
        this.is_newfrs = integer1;
      } 
      integer1 = paramBuilder.is_newfeed;
      if (integer1 == null) {
        this.is_newfeed = DEFAULT_IS_NEWFEED;
      } else {
        this.is_newfeed = integer1;
      } 
      String str1 = paramBuilder.tab_name;
      if (str1 == null) {
        this.tab_name = "";
      } else {
        this.tab_name = str1;
      } 
      long_ = paramBuilder.video_id;
      if (long_ == null) {
        this.video_id = DEFAULT_VIDEO_ID;
      } else {
        this.video_id = long_;
      } 
    } else {
      this.common = ((Builder)long_).common;
      this.thread_id = ((Builder)long_).thread_id;
      this.post_id = ((Builder)long_).post_id;
      this.forum_id = ((Builder)long_).forum_id;
      this.scr_w = ((Builder)long_).scr_w;
      this.scr_h = ((Builder)long_).scr_h;
      this.scr_dip = ((Builder)long_).scr_dip;
      this.q_type = ((Builder)long_).q_type;
      this.bfrom = ((Builder)long_).bfrom;
      this.call_from = ((Builder)long_).call_from;
      this.frs_common_info = ((Builder)long_).frs_common_info;
      this.is_newfrs = ((Builder)long_).is_newfrs;
      this.is_newfeed = ((Builder)long_).is_newfeed;
      this.tab_name = ((Builder)long_).tab_name;
      this.video_id = ((Builder)long_).video_id;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public String bfrom;
    
    public Integer call_from;
    
    public CommonReq common;
    
    public Long forum_id;
    
    public String frs_common_info;
    
    public Integer is_newfeed;
    
    public Integer is_newfrs;
    
    public Long post_id;
    
    public Integer q_type;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public String tab_name;
    
    public Long thread_id;
    
    public Long video_id;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.thread_id = param1DataReq.thread_id;
      this.post_id = param1DataReq.post_id;
      this.forum_id = param1DataReq.forum_id;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.q_type = param1DataReq.q_type;
      this.bfrom = param1DataReq.bfrom;
      this.call_from = param1DataReq.call_from;
      this.frs_common_info = param1DataReq.frs_common_info;
      this.is_newfrs = param1DataReq.is_newfrs;
      this.is_newfeed = param1DataReq.is_newfeed;
      this.tab_name = param1DataReq.tab_name;
      this.video_id = param1DataReq.video_id;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
