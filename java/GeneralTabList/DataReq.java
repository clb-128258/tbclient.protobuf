package tbclient.GeneralTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_AD_BEAR_CONTEXT = "";
  
  public static final String DEFAULT_AD_BEAR_SID = "";
  
  public static final Double DEFAULT_AD_BEAR_SID_PRICE;
  
  public static final String DEFAULT_AD_EXTERNAL_INFO = "";
  
  public static final String DEFAULT_AD_EXT_PARAMS = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_FRS_COMMON_INFO = "";
  
  public static final String DEFAULT_FRS_TAB_TYPE_DEFAULT = "";
  
  public static final Integer DEFAULT_HAS_AD_BEAR;
  
  public static final Long DEFAULT_HOT_THREAD_ID;
  
  public static final Integer DEFAULT_IS_DEFAULT_NAVTAB;
  
  public static final Integer DEFAULT_IS_GENERAL_TAB;
  
  public static final Integer DEFAULT_IS_NEWFEED;
  
  public static final Integer DEFAULT_IS_NEWFRS;
  
  public static final Integer DEFAULT_IS_VIDEO_DOUBLEROW;
  
  public static final Long DEFAULT_LAST_THREAD_ID;
  
  public static final String DEFAULT_LOG_PARAM = "";
  
  public static final String DEFAULT_NID_SRC = "";
  
  public static final Integer DEFAULT_PARTITION_TYPE;
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_REQUEST_TIMES;
  
  public static final Integer DEFAULT_RN;
  
  public static final Integer DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final String DEFAULT_SIMPLIFY_FIELD = "";
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  public static final Integer DEFAULT_TAB_ID;
  
  public static final String DEFAULT_TAB_NAME = "";
  
  public static final Integer DEFAULT_TAB_TYPE;
  
  public static final Long DEFAULT_TID_SRC;
  
  public static final String DEFAULT_TOP_CARD_ID = "";
  
  public static final Integer DEFAULT_USER_READ_STYLE;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String ad_bear_context;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String ad_bear_sid;
  
  @ProtoField(tag = 19, type = Message.Datatype.DOUBLE)
  public final Double ad_bear_sid_price;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String ad_ext_params;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String ad_external_info;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String frs_common_info;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String frs_tab_type_default;
  
  @ProtoField(tag = 17, type = Message.Datatype.INT32)
  public final Integer has_ad_bear;
  
  @ProtoField(tag = 38, type = Message.Datatype.INT64)
  public final Long hot_thread_id;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer is_default_navtab;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer is_general_tab;
  
  @ProtoField(tag = 27, type = Message.Datatype.UINT32)
  public final Integer is_newfeed;
  
  @ProtoField(tag = 22, type = Message.Datatype.INT32)
  public final Integer is_newfrs;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer is_video_doublerow;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long last_thread_id;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String log_param;
  
  @ProtoField(tag = 32, type = Message.Datatype.STRING)
  public final String nid_src;
  
  @ProtoField(tag = 30, type = Message.Datatype.INT32)
  public final Integer partition_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 20, type = Message.Datatype.INT32)
  public final Integer request_times;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer rn;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer scr_dip;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 37, type = Message.Datatype.STRING)
  public final String simplify_field;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer sort_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer tab_id;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String tab_name;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer tab_type;
  
  @ProtoField(tag = 31, type = Message.Datatype.UINT64)
  public final Long tid_src;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String top_card_id;
  
  @ProtoField(tag = 36, type = Message.Datatype.INT32)
  public final Integer user_read_style;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TAB_ID = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_PN = integer;
    DEFAULT_RN = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = integer;
    DEFAULT_LAST_THREAD_ID = long_;
    DEFAULT_IS_DEFAULT_NAVTAB = integer;
    DEFAULT_IS_GENERAL_TAB = integer;
    DEFAULT_SORT_TYPE = integer;
    DEFAULT_TAB_TYPE = integer;
    DEFAULT_HAS_AD_BEAR = integer;
    DEFAULT_AD_BEAR_SID_PRICE = Double.valueOf(0.0D);
    DEFAULT_REQUEST_TIMES = integer;
    DEFAULT_IS_NEWFRS = integer;
    DEFAULT_IS_VIDEO_DOUBLEROW = integer;
    DEFAULT_IS_NEWFEED = integer;
    DEFAULT_PARTITION_TYPE = integer;
    DEFAULT_TID_SRC = long_;
    DEFAULT_USER_READ_STYLE = integer;
    DEFAULT_HOT_THREAD_ID = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer10 = paramBuilder.tab_id;
      if (integer10 == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = integer10;
      } 
      Long long_3 = paramBuilder.forum_id;
      if (long_3 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_3;
      } 
      Integer integer9 = paramBuilder.pn;
      if (integer9 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer9;
      } 
      integer9 = paramBuilder.rn;
      if (integer9 == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer9;
      } 
      integer9 = paramBuilder.scr_w;
      if (integer9 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer9;
      } 
      integer9 = paramBuilder.scr_h;
      if (integer9 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer9;
      } 
      integer9 = paramBuilder.scr_dip;
      if (integer9 == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = integer9;
      } 
      Long long_2 = paramBuilder.last_thread_id;
      if (long_2 == null) {
        this.last_thread_id = DEFAULT_LAST_THREAD_ID;
      } else {
        this.last_thread_id = long_2;
      } 
      Integer integer8 = paramBuilder.is_default_navtab;
      if (integer8 == null) {
        this.is_default_navtab = DEFAULT_IS_DEFAULT_NAVTAB;
      } else {
        this.is_default_navtab = integer8;
      } 
      String str8 = paramBuilder.tab_name;
      if (str8 == null) {
        this.tab_name = "";
      } else {
        this.tab_name = str8;
      } 
      Integer integer7 = paramBuilder.is_general_tab;
      if (integer7 == null) {
        this.is_general_tab = DEFAULT_IS_GENERAL_TAB;
      } else {
        this.is_general_tab = integer7;
      } 
      integer7 = paramBuilder.sort_type;
      if (integer7 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer7;
      } 
      integer7 = paramBuilder.tab_type;
      if (integer7 == null) {
        this.tab_type = DEFAULT_TAB_TYPE;
      } else {
        this.tab_type = integer7;
      } 
      String str7 = paramBuilder.ad_ext_params;
      if (str7 == null) {
        this.ad_ext_params = "";
      } else {
        this.ad_ext_params = str7;
      } 
      str7 = paramBuilder.ad_bear_context;
      if (str7 == null) {
        this.ad_bear_context = "";
      } else {
        this.ad_bear_context = str7;
      } 
      Integer integer6 = paramBuilder.has_ad_bear;
      if (integer6 == null) {
        this.has_ad_bear = DEFAULT_HAS_AD_BEAR;
      } else {
        this.has_ad_bear = integer6;
      } 
      String str6 = paramBuilder.ad_bear_sid;
      if (str6 == null) {
        this.ad_bear_sid = "";
      } else {
        this.ad_bear_sid = str6;
      } 
      Double double_ = paramBuilder.ad_bear_sid_price;
      if (double_ == null) {
        this.ad_bear_sid_price = DEFAULT_AD_BEAR_SID_PRICE;
      } else {
        this.ad_bear_sid_price = double_;
      } 
      Integer integer5 = paramBuilder.request_times;
      if (integer5 == null) {
        this.request_times = DEFAULT_REQUEST_TIMES;
      } else {
        this.request_times = integer5;
      } 
      String str5 = paramBuilder.frs_common_info;
      if (str5 == null) {
        this.frs_common_info = "";
      } else {
        this.frs_common_info = str5;
      } 
      Integer integer4 = paramBuilder.is_newfrs;
      if (integer4 == null) {
        this.is_newfrs = DEFAULT_IS_NEWFRS;
      } else {
        this.is_newfrs = integer4;
      } 
      integer4 = paramBuilder.is_video_doublerow;
      if (integer4 == null) {
        this.is_video_doublerow = DEFAULT_IS_VIDEO_DOUBLEROW;
      } else {
        this.is_video_doublerow = integer4;
      } 
      String str4 = paramBuilder.top_card_id;
      if (str4 == null) {
        this.top_card_id = "";
      } else {
        this.top_card_id = str4;
      } 
      str4 = paramBuilder.log_param;
      if (str4 == null) {
        this.log_param = "";
      } else {
        this.log_param = str4;
      } 
      Integer integer3 = paramBuilder.is_newfeed;
      if (integer3 == null) {
        this.is_newfeed = DEFAULT_IS_NEWFEED;
      } else {
        this.is_newfeed = integer3;
      } 
      String str3 = paramBuilder.frs_tab_type_default;
      if (str3 == null) {
        this.frs_tab_type_default = "";
      } else {
        this.frs_tab_type_default = str3;
      } 
      str3 = paramBuilder.forum_name;
      if (str3 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str3;
      } 
      Integer integer2 = paramBuilder.partition_type;
      if (integer2 == null) {
        this.partition_type = DEFAULT_PARTITION_TYPE;
      } else {
        this.partition_type = integer2;
      } 
      Long long_1 = paramBuilder.tid_src;
      if (long_1 == null) {
        this.tid_src = DEFAULT_TID_SRC;
      } else {
        this.tid_src = long_1;
      } 
      String str2 = paramBuilder.nid_src;
      if (str2 == null) {
        this.nid_src = "";
      } else {
        this.nid_src = str2;
      } 
      str2 = paramBuilder.ad_external_info;
      if (str2 == null) {
        this.ad_external_info = "";
      } else {
        this.ad_external_info = str2;
      } 
      Integer integer1 = paramBuilder.user_read_style;
      if (integer1 == null) {
        this.user_read_style = DEFAULT_USER_READ_STYLE;
      } else {
        this.user_read_style = integer1;
      } 
      String str1 = paramBuilder.simplify_field;
      if (str1 == null) {
        this.simplify_field = "";
      } else {
        this.simplify_field = str1;
      } 
      long_ = paramBuilder.hot_thread_id;
      if (long_ == null) {
        this.hot_thread_id = DEFAULT_HOT_THREAD_ID;
      } else {
        this.hot_thread_id = long_;
      } 
    } else {
      this.common = ((Builder)long_).common;
      this.tab_id = ((Builder)long_).tab_id;
      this.forum_id = ((Builder)long_).forum_id;
      this.pn = ((Builder)long_).pn;
      this.rn = ((Builder)long_).rn;
      this.scr_w = ((Builder)long_).scr_w;
      this.scr_h = ((Builder)long_).scr_h;
      this.scr_dip = ((Builder)long_).scr_dip;
      this.last_thread_id = ((Builder)long_).last_thread_id;
      this.is_default_navtab = ((Builder)long_).is_default_navtab;
      this.tab_name = ((Builder)long_).tab_name;
      this.is_general_tab = ((Builder)long_).is_general_tab;
      this.sort_type = ((Builder)long_).sort_type;
      this.tab_type = ((Builder)long_).tab_type;
      this.ad_ext_params = ((Builder)long_).ad_ext_params;
      this.ad_bear_context = ((Builder)long_).ad_bear_context;
      this.has_ad_bear = ((Builder)long_).has_ad_bear;
      this.ad_bear_sid = ((Builder)long_).ad_bear_sid;
      this.ad_bear_sid_price = ((Builder)long_).ad_bear_sid_price;
      this.request_times = ((Builder)long_).request_times;
      this.frs_common_info = ((Builder)long_).frs_common_info;
      this.is_newfrs = ((Builder)long_).is_newfrs;
      this.is_video_doublerow = ((Builder)long_).is_video_doublerow;
      this.top_card_id = ((Builder)long_).top_card_id;
      this.log_param = ((Builder)long_).log_param;
      this.is_newfeed = ((Builder)long_).is_newfeed;
      this.frs_tab_type_default = ((Builder)long_).frs_tab_type_default;
      this.forum_name = ((Builder)long_).forum_name;
      this.partition_type = ((Builder)long_).partition_type;
      this.tid_src = ((Builder)long_).tid_src;
      this.nid_src = ((Builder)long_).nid_src;
      this.ad_external_info = ((Builder)long_).ad_external_info;
      this.user_read_style = ((Builder)long_).user_read_style;
      this.simplify_field = ((Builder)long_).simplify_field;
      this.hot_thread_id = ((Builder)long_).hot_thread_id;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public String ad_bear_context;
    
    public String ad_bear_sid;
    
    public Double ad_bear_sid_price;
    
    public String ad_ext_params;
    
    public String ad_external_info;
    
    public CommonReq common;
    
    public Long forum_id;
    
    public String forum_name;
    
    public String frs_common_info;
    
    public String frs_tab_type_default;
    
    public Integer has_ad_bear;
    
    public Long hot_thread_id;
    
    public Integer is_default_navtab;
    
    public Integer is_general_tab;
    
    public Integer is_newfeed;
    
    public Integer is_newfrs;
    
    public Integer is_video_doublerow;
    
    public Long last_thread_id;
    
    public String log_param;
    
    public String nid_src;
    
    public Integer partition_type;
    
    public Integer pn;
    
    public Integer request_times;
    
    public Integer rn;
    
    public Integer scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public String simplify_field;
    
    public Integer sort_type;
    
    public Integer tab_id;
    
    public String tab_name;
    
    public Integer tab_type;
    
    public Long tid_src;
    
    public String top_card_id;
    
    public Integer user_read_style;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.tab_id = param1DataReq.tab_id;
      this.forum_id = param1DataReq.forum_id;
      this.pn = param1DataReq.pn;
      this.rn = param1DataReq.rn;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.last_thread_id = param1DataReq.last_thread_id;
      this.is_default_navtab = param1DataReq.is_default_navtab;
      this.tab_name = param1DataReq.tab_name;
      this.is_general_tab = param1DataReq.is_general_tab;
      this.sort_type = param1DataReq.sort_type;
      this.tab_type = param1DataReq.tab_type;
      this.ad_ext_params = param1DataReq.ad_ext_params;
      this.ad_bear_context = param1DataReq.ad_bear_context;
      this.has_ad_bear = param1DataReq.has_ad_bear;
      this.ad_bear_sid = param1DataReq.ad_bear_sid;
      this.ad_bear_sid_price = param1DataReq.ad_bear_sid_price;
      this.request_times = param1DataReq.request_times;
      this.frs_common_info = param1DataReq.frs_common_info;
      this.is_newfrs = param1DataReq.is_newfrs;
      this.is_video_doublerow = param1DataReq.is_video_doublerow;
      this.top_card_id = param1DataReq.top_card_id;
      this.log_param = param1DataReq.log_param;
      this.is_newfeed = param1DataReq.is_newfeed;
      this.frs_tab_type_default = param1DataReq.frs_tab_type_default;
      this.forum_name = param1DataReq.forum_name;
      this.partition_type = param1DataReq.partition_type;
      this.tid_src = param1DataReq.tid_src;
      this.nid_src = param1DataReq.nid_src;
      this.ad_external_info = param1DataReq.ad_external_info;
      this.user_read_style = param1DataReq.user_read_style;
      this.simplify_field = param1DataReq.simplify_field;
      this.hot_thread_id = param1DataReq.hot_thread_id;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
