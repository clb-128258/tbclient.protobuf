package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_FRIEND_UID;
  
  public static final String DEFAULT_FRIEND_UID_PORTRAIT = "";
  
  public static final String DEFAULT_FROM_PAGE = "";
  
  public static final Integer DEFAULT_HAS_PLIST;
  
  public static final String DEFAULT_HISTORY_FORUM_IDS = "";
  
  public static final String DEFAULT_HISTORY_FORUM_NAMES = "";
  
  public static final Integer DEFAULT_IS_ENABLE_NAWS;
  
  public static final Integer DEFAULT_IS_FROM_USERCENTER;
  
  public static final Integer DEFAULT_IS_GUEST;
  
  public static final Integer DEFAULT_NEED_POST_COUNT;
  
  public static final Integer DEFAULT_NEED_USERGROWTH_TASK;
  
  public static final Integer DEFAULT_PAGE;
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Integer DEFAULT_REQUEST_TIME;
  
  public static final Integer DEFAULT_RN;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final String DEFAULT_ST_TYPE = "";
  
  public static final Long DEFAULT_UID;
  
  @ProtoField(tag = 9)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long friend_uid;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String friend_uid_portrait;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String from_page;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer has_plist;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String history_forum_ids;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String history_forum_names;
  
  @ProtoField(tag = 20, type = Message.Datatype.INT32)
  public final Integer is_enable_naws;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer is_from_usercenter;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer is_guest;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer need_post_count;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT32)
  public final Integer need_usergrowth_task;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer page;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer pn;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer q_type;
  
  @ProtoField(tag = 21, type = Message.Datatype.INT32)
  public final Integer request_time;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer rn;
  
  @ProtoField(tag = 13, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String st_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long uid;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_UID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_NEED_POST_COUNT = integer;
    DEFAULT_FRIEND_UID = long_;
    DEFAULT_IS_GUEST = integer;
    DEFAULT_PN = integer;
    DEFAULT_RN = integer;
    DEFAULT_HAS_PLIST = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_Q_TYPE = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_IS_FROM_USERCENTER = integer;
    DEFAULT_PAGE = integer;
    DEFAULT_NEED_USERGROWTH_TASK = integer;
    DEFAULT_IS_ENABLE_NAWS = integer;
    DEFAULT_REQUEST_TIME = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.uid;
      if (long_2 == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_2;
      } 
      Integer integer5 = paramBuilder.need_post_count;
      if (integer5 == null) {
        this.need_post_count = DEFAULT_NEED_POST_COUNT;
      } else {
        this.need_post_count = integer5;
      } 
      Long long_1 = paramBuilder.friend_uid;
      if (long_1 == null) {
        this.friend_uid = DEFAULT_FRIEND_UID;
      } else {
        this.friend_uid = long_1;
      } 
      Integer integer4 = paramBuilder.is_guest;
      if (integer4 == null) {
        this.is_guest = DEFAULT_IS_GUEST;
      } else {
        this.is_guest = integer4;
      } 
      String str2 = paramBuilder.st_type;
      if (str2 == null) {
        this.st_type = "";
      } else {
        this.st_type = str2;
      } 
      Integer integer3 = paramBuilder.pn;
      if (integer3 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer3;
      } 
      integer3 = paramBuilder.rn;
      if (integer3 == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer3;
      } 
      integer3 = paramBuilder.has_plist;
      if (integer3 == null) {
        this.has_plist = DEFAULT_HAS_PLIST;
      } else {
        this.has_plist = integer3;
      } 
      this.common = paramBuilder.common;
      integer3 = paramBuilder.scr_w;
      if (integer3 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer3;
      } 
      integer3 = paramBuilder.scr_h;
      if (integer3 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer3;
      } 
      integer3 = paramBuilder.q_type;
      if (integer3 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer3;
      } 
      Double double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
      Integer integer2 = paramBuilder.is_from_usercenter;
      if (integer2 == null) {
        this.is_from_usercenter = DEFAULT_IS_FROM_USERCENTER;
      } else {
        this.is_from_usercenter = integer2;
      } 
      integer2 = paramBuilder.page;
      if (integer2 == null) {
        this.page = DEFAULT_PAGE;
      } else {
        this.page = integer2;
      } 
      String str1 = paramBuilder.friend_uid_portrait;
      if (str1 == null) {
        this.friend_uid_portrait = "";
      } else {
        this.friend_uid_portrait = str1;
      } 
      str1 = paramBuilder.history_forum_ids;
      if (str1 == null) {
        this.history_forum_ids = "";
      } else {
        this.history_forum_ids = str1;
      } 
      str1 = paramBuilder.history_forum_names;
      if (str1 == null) {
        this.history_forum_names = "";
      } else {
        this.history_forum_names = str1;
      } 
      Integer integer1 = paramBuilder.need_usergrowth_task;
      if (integer1 == null) {
        this.need_usergrowth_task = DEFAULT_NEED_USERGROWTH_TASK;
      } else {
        this.need_usergrowth_task = integer1;
      } 
      integer1 = paramBuilder.is_enable_naws;
      if (integer1 == null) {
        this.is_enable_naws = DEFAULT_IS_ENABLE_NAWS;
      } else {
        this.is_enable_naws = integer1;
      } 
      integer1 = paramBuilder.request_time;
      if (integer1 == null) {
        this.request_time = DEFAULT_REQUEST_TIME;
      } else {
        this.request_time = integer1;
      } 
      str = paramBuilder.from_page;
      if (str == null) {
        this.from_page = "";
      } else {
        this.from_page = str;
      } 
    } else {
      this.uid = ((Builder)str).uid;
      this.need_post_count = ((Builder)str).need_post_count;
      this.friend_uid = ((Builder)str).friend_uid;
      this.is_guest = ((Builder)str).is_guest;
      this.st_type = ((Builder)str).st_type;
      this.pn = ((Builder)str).pn;
      this.rn = ((Builder)str).rn;
      this.has_plist = ((Builder)str).has_plist;
      this.common = ((Builder)str).common;
      this.scr_w = ((Builder)str).scr_w;
      this.scr_h = ((Builder)str).scr_h;
      this.q_type = ((Builder)str).q_type;
      this.scr_dip = ((Builder)str).scr_dip;
      this.is_from_usercenter = ((Builder)str).is_from_usercenter;
      this.page = ((Builder)str).page;
      this.friend_uid_portrait = ((Builder)str).friend_uid_portrait;
      this.history_forum_ids = ((Builder)str).history_forum_ids;
      this.history_forum_names = ((Builder)str).history_forum_names;
      this.need_usergrowth_task = ((Builder)str).need_usergrowth_task;
      this.is_enable_naws = ((Builder)str).is_enable_naws;
      this.request_time = ((Builder)str).request_time;
      this.from_page = ((Builder)str).from_page;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Long friend_uid;
    
    public String friend_uid_portrait;
    
    public String from_page;
    
    public Integer has_plist;
    
    public String history_forum_ids;
    
    public String history_forum_names;
    
    public Integer is_enable_naws;
    
    public Integer is_from_usercenter;
    
    public Integer is_guest;
    
    public Integer need_post_count;
    
    public Integer need_usergrowth_task;
    
    public Integer page;
    
    public Integer pn;
    
    public Integer q_type;
    
    public Integer request_time;
    
    public Integer rn;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public String st_type;
    
    public Long uid;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.uid = param1DataReq.uid;
      this.need_post_count = param1DataReq.need_post_count;
      this.friend_uid = param1DataReq.friend_uid;
      this.is_guest = param1DataReq.is_guest;
      this.st_type = param1DataReq.st_type;
      this.pn = param1DataReq.pn;
      this.rn = param1DataReq.rn;
      this.has_plist = param1DataReq.has_plist;
      this.common = param1DataReq.common;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.q_type = param1DataReq.q_type;
      this.scr_dip = param1DataReq.scr_dip;
      this.is_from_usercenter = param1DataReq.is_from_usercenter;
      this.page = param1DataReq.page;
      this.friend_uid_portrait = param1DataReq.friend_uid_portrait;
      this.history_forum_ids = param1DataReq.history_forum_ids;
      this.history_forum_names = param1DataReq.history_forum_names;
      this.need_usergrowth_task = param1DataReq.need_usergrowth_task;
      this.is_enable_naws = param1DataReq.is_enable_naws;
      this.request_time = param1DataReq.request_time;
      this.from_page = param1DataReq.from_page;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
