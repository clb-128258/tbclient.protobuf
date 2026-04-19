package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppPosInfo;
import tbclient.AppTransmitData;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_AD_BEAR_CONTEXT = "";
  
  public static final String DEFAULT_AD_BEAR_SID = "";
  
  public static final Double DEFAULT_AD_BEAR_SID_PRICE;
  
  public static final String DEFAULT_AD_CONTEXT_LIST = "";
  
  public static final String DEFAULT_AD_EXTERNAL_INFO = "";
  
  public static final String DEFAULT_AD_EXT_PARAMS = "";
  
  public static final Integer DEFAULT_CALL_FROM;
  
  public static final String DEFAULT_CALL_URL = "";
  
  public static final Integer DEFAULT_CATEGORY_ID;
  
  public static final String DEFAULT_CHATROOM_NEW_MSG = "";
  
  public static final Boolean DEFAULT_CHECK_LOGIN;
  
  public static final Integer DEFAULT_CID;
  
  public static final Integer DEFAULT_CLASS_ID;
  
  public static final String DEFAULT_CLICK_ID = "";
  
  public static final String DEFAULT_COOKIE = "";
  
  public static final Integer DEFAULT_CTIME;
  
  public static final Integer DEFAULT_DATA_SIZE;
  
  public static final String DEFAULT_DA_IDFA = "";
  
  public static final Boolean DEFAULT_DEBUG;
  
  public static final Integer DEFAULT_DEFAULT_SORT_TYPE;
  
  public static final String DEFAULT_EMAIL = "";
  
  public static final String DEFAULT_FEED_PAGE_SOURCE = "";
  
  public static final Integer DEFAULT_FIRST_GET_LESS_DATA;
  
  public static final Integer DEFAULT_FIRST_GET_NORMAL_DATA;
  
  public static final Integer DEFAULT_FIRST_REQUEST;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_FRS_COMMON_INFO = "";
  
  public static final Integer DEFAULT_FRS_RN;
  
  public static final String DEFAULT_FRS_TAB_TYPE_DEFAULT = "";
  
  public static final Integer DEFAULT_HAS_AD_BEAR;
  
  public static final Long DEFAULT_HOT_THREAD_ID;
  
  public static final Integer DEFAULT_IP_INT;
  
  public static final String DEFAULT_IP_STR = "";
  
  public static final Integer DEFAULT_ISSDK;
  
  public static final Integer DEFAULT_IS_DEFAULT_NAVTAB;
  
  public static final Integer DEFAULT_IS_GENERAL_TAB;
  
  public static final Integer DEFAULT_IS_GOOD;
  
  public static final Integer DEFAULT_IS_GOODTAB;
  
  public static final Integer DEFAULT_IS_NEWFEED;
  
  public static final Integer DEFAULT_IS_NEWFRS;
  
  public static final Integer DEFAULT_IS_SELECTION;
  
  public static final Integer DEFAULT_IS_VIDEO_DOUBLEROW;
  
  public static final String DEFAULT_KW = "";
  
  public static final String DEFAULT_LASTIDS = "";
  
  public static final Long DEFAULT_LAST_CLICK_TID;
  
  public static final Long DEFAULT_LAST_THREAD_ID;
  
  public static final Integer DEFAULT_LOAD_TYPE;
  
  public static final Boolean DEFAULT_LOGIN;
  
  public static final String DEFAULT_LOG_PARAM = "";
  
  public static final String DEFAULT_MOBILE = "";
  
  public static final String DEFAULT_MODULE_NAME = "";
  
  public static final Integer DEFAULT_NEED_ABSTRACT;
  
  public static final Integer DEFAULT_NEED_BADGE;
  
  public static final Integer DEFAULT_NET_ERROR;
  
  public static final String DEFAULT_NID_SRC = "";
  
  public static final String DEFAULT_NID_TB_SRC = "";
  
  public static final Integer DEFAULT_NOVAL;
  
  public static final Integer DEFAULT_NO_UN;
  
  public static final String DEFAULT_OBJ_LOCATE = "";
  
  public static final String DEFAULT_OBJ_SOURCE = "";
  
  public static final Integer DEFAULT_PARTITION_TYPE;
  
  public static final String DEFAULT_PLATFORM = "";
  
  public static final Integer DEFAULT_PN;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_PUSH_TID;
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Integer DEFAULT_REQUEST_TIMES;
  
  public static final Integer DEFAULT_RESULT_NUM;
  
  public static final Integer DEFAULT_RN;
  
  public static final Integer DEFAULT_RN_NEED;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final String DEFAULT_SHOUBAI_CUID = "";
  
  public static final String DEFAULT_SIMPLIFY_FIELD = "";
  
  public static final Integer DEFAULT_SMILE_GRADE;
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  public static final Integer DEFAULT_ST_PARAM;
  
  public static final String DEFAULT_ST_TYPE = "";
  
  public static final Boolean DEFAULT_SUPPORT_NOUN;
  
  public static final Integer DEFAULT_TAB_ID;
  
  public static final String DEFAULT_TAB_NAME = "";
  
  public static final Integer DEFAULT_TAB_TYPE;
  
  public static final String DEFAULT_THREAD_IDS = "";
  
  public static final Long DEFAULT_TID_SRC;
  
  public static final String DEFAULT_TOP_CARD_ID = "";
  
  public static final String DEFAULT_UP_SCHEMA = "";
  
  public static final Long DEFAULT_USER_ID;
  
  public static final String DEFAULT_USER_NAME = "";
  
  public static final Integer DEFAULT_USER_READ_STYLE;
  
  public static final Integer DEFAULT_WITHCAL;
  
  public static final Integer DEFAULT_WITH_GROUP;
  
  public static final String DEFAULT_YUELAOU_LOCATE = "";
  
  public static final String DEFAULT_YUELAOU_PARAMS = "";
  
  @ProtoField(tag = 65, type = Message.Datatype.STRING)
  public final String ad_bear_context;
  
  @ProtoField(tag = 67, type = Message.Datatype.STRING)
  public final String ad_bear_sid;
  
  @ProtoField(tag = 68, type = Message.Datatype.DOUBLE)
  public final Double ad_bear_sid_price;
  
  @ProtoField(tag = 60, type = Message.Datatype.STRING)
  public final String ad_context_list;
  
  @ProtoField(tag = 62, type = Message.Datatype.STRING)
  public final String ad_ext_params;
  
  @ProtoField(tag = 78, type = Message.Datatype.STRING)
  public final String ad_external_info;
  
  @ProtoField(tag = 51)
  public final AdParam ad_param;
  
  @ProtoField(tag = 50)
  public final AppPosInfo app_pos;
  
  @ProtoField(tag = 64)
  public final AppTransmitData app_transmit_data;
  
  @ProtoField(tag = 56, type = Message.Datatype.INT32)
  public final Integer call_from;
  
  @ProtoField(tag = 54, type = Message.Datatype.STRING)
  public final String call_url;
  
  @ProtoField(tag = 44, type = Message.Datatype.INT32)
  public final Integer category_id;
  
  @ProtoField(tag = 72, type = Message.Datatype.STRING)
  public final String chatroom_new_msg;
  
  @ProtoField(tag = 20, type = Message.Datatype.BOOL)
  public final Boolean check_login;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer cid;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer class_id;
  
  @ProtoField(tag = 96, type = Message.Datatype.STRING)
  public final String click_id;
  
  @ProtoField(tag = 39)
  public final CommonReq common;
  
  @ProtoField(tag = 38, type = Message.Datatype.STRING)
  public final String cookie;
  
  @ProtoField(tag = 17, type = Message.Datatype.INT32)
  public final Integer ctime;
  
  @ProtoField(tag = 42, type = Message.Datatype.STRING)
  public final String da_idfa;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer data_size;
  
  @ProtoField(tag = 37, type = Message.Datatype.BOOL)
  public final Boolean debug;
  
  @ProtoField(tag = 63, type = Message.Datatype.INT32)
  public final Integer default_sort_type;
  
  @ProtoField(tag = 36, type = Message.Datatype.STRING)
  public final String email;
  
  @ProtoField(tag = 95, type = Message.Datatype.STRING)
  public final String feed_page_source;
  
  @ProtoField(tag = 91, type = Message.Datatype.INT32)
  public final Integer first_get_less_data;
  
  @ProtoField(tag = 92, type = Message.Datatype.INT32)
  public final Integer first_get_normal_data;
  
  @ProtoField(tag = 97, type = Message.Datatype.INT32)
  public final Integer first_request;
  
  @ProtoField(tag = 80, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 82, type = Message.Datatype.STRING)
  public final String frs_common_info;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer frs_rn;
  
  @ProtoField(tag = 75, type = Message.Datatype.STRING)
  public final String frs_tab_type_default;
  
  @ProtoField(tag = 66, type = Message.Datatype.INT32)
  public final Integer has_ad_bear;
  
  @ProtoField(tag = 58, type = Message.Datatype.INT64)
  public final Long hot_thread_id;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT32)
  public final Integer ip_int;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String ip_str;
  
  @ProtoField(tag = 59, type = Message.Datatype.INT32)
  public final Integer is_default_navtab;
  
  @ProtoField(tag = 87, type = Message.Datatype.INT32)
  public final Integer is_general_tab;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_good;
  
  @ProtoField(tag = 83, type = Message.Datatype.INT32)
  public final Integer is_goodtab;
  
  @ProtoField(tag = 71, type = Message.Datatype.INT32)
  public final Integer is_newfeed;
  
  @ProtoField(tag = 73, type = Message.Datatype.INT32)
  public final Integer is_newfrs;
  
  @ProtoField(tag = 55, type = Message.Datatype.INT32)
  public final Integer is_selection;
  
  @ProtoField(tag = 89, type = Message.Datatype.INT32)
  public final Integer is_video_doublerow;
  
  @ProtoField(tag = 41, type = Message.Datatype.INT32)
  public final Integer issdk;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String kw;
  
  @ProtoField(tag = 48, type = Message.Datatype.UINT64)
  public final Long last_click_tid;
  
  @ProtoField(tag = 85, type = Message.Datatype.INT64)
  public final Long last_thread_id;
  
  @ProtoField(tag = 40, type = Message.Datatype.STRING)
  public final String lastids;
  
  @ProtoField(tag = 49, type = Message.Datatype.INT32)
  public final Integer load_type;
  
  @ProtoField(tag = 76, type = Message.Datatype.STRING)
  public final String log_param;
  
  @ProtoField(tag = 30, type = Message.Datatype.BOOL)
  public final Boolean login;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String mobile;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String module_name;
  
  @ProtoField(tag = 81, type = Message.Datatype.UINT32)
  public final Integer need_abstract;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer need_badge;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT32)
  public final Integer net_error;
  
  @ProtoField(tag = 94, type = Message.Datatype.STRING)
  public final String nid_src;
  
  @ProtoField(tag = 98, type = Message.Datatype.STRING)
  public final String nid_tb_src;
  
  @ProtoField(tag = 33, type = Message.Datatype.INT32)
  public final Integer no_un;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer noval;
  
  @ProtoField(tag = 52, type = Message.Datatype.STRING)
  public final String obj_locate;
  
  @ProtoField(tag = 53, type = Message.Datatype.STRING)
  public final String obj_source;
  
  @ProtoField(tag = 90, type = Message.Datatype.INT32)
  public final Integer partition_type;
  
  @ProtoField(tag = 43, type = Message.Datatype.STRING)
  public final String platform;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 34, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 70, type = Message.Datatype.INT64)
  public final Long push_tid;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer q_type;
  
  @ProtoField(tag = 69, type = Message.Datatype.INT32)
  public final Integer request_times;
  
  @ProtoField(tag = 22, type = Message.Datatype.INT32)
  public final Integer result_num;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer rn;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer rn_need;
  
  @ProtoField(tag = 13, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 57, type = Message.Datatype.STRING)
  public final String shoubai_cuid;
  
  @ProtoField(tag = 77, type = Message.Datatype.STRING)
  public final String simplify_field;
  
  @ProtoField(tag = 28, type = Message.Datatype.INT32)
  public final Integer smile_grade;
  
  @ProtoField(tag = 47, type = Message.Datatype.INT32)
  public final Integer sort_type;
  
  @ProtoField(tag = 27, type = Message.Datatype.INT32)
  public final Integer st_param;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String st_type;
  
  @ProtoField(tag = 29, type = Message.Datatype.BOOL)
  public final Boolean support_noun;
  
  @ProtoField(tag = 84, type = Message.Datatype.INT32)
  public final Integer tab_id;
  
  @ProtoField(tag = 86, type = Message.Datatype.STRING)
  public final String tab_name;
  
  @ProtoField(tag = 88, type = Message.Datatype.INT32)
  public final Integer tab_type;
  
  @ProtoField(tag = 79, type = Message.Datatype.STRING)
  public final String thread_ids;
  
  @ProtoField(tag = 93, type = Message.Datatype.UINT64)
  public final Long tid_src;
  
  @ProtoField(tag = 74, type = Message.Datatype.STRING)
  public final String top_card_id;
  
  @ProtoField(tag = 61, type = Message.Datatype.STRING)
  public final String up_schema;
  
  @ProtoField(tag = 31, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 32, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 99, type = Message.Datatype.INT32)
  public final Integer user_read_style;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer with_group;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer withcal;
  
  @ProtoField(tag = 45, type = Message.Datatype.STRING)
  public final String yuelaou_locate;
  
  @ProtoField(tag = 46, type = Message.Datatype.STRING)
  public final String yuelaou_params;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_RN = integer;
    DEFAULT_RN_NEED = integer;
    DEFAULT_IS_GOOD = integer;
    DEFAULT_CID = integer;
    DEFAULT_WITHCAL = integer;
    DEFAULT_NOVAL = integer;
    DEFAULT_WITH_GROUP = integer;
    DEFAULT_NEED_BADGE = integer;
    DEFAULT_FRS_RN = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    Double double_ = Double.valueOf(0.0D);
    DEFAULT_SCR_DIP = double_;
    DEFAULT_Q_TYPE = integer;
    DEFAULT_PN = integer;
    DEFAULT_CTIME = integer;
    DEFAULT_DATA_SIZE = integer;
    DEFAULT_NET_ERROR = integer;
    DEFAULT_CHECK_LOGIN = Boolean.FALSE;
    DEFAULT_RESULT_NUM = integer;
    DEFAULT_CLASS_ID = integer;
    DEFAULT_IP_INT = integer;
    DEFAULT_ST_PARAM = integer;
    DEFAULT_SMILE_GRADE = integer;
    Boolean bool = Boolean.FALSE;
    DEFAULT_SUPPORT_NOUN = bool;
    DEFAULT_LOGIN = bool;
    Long long_ = Long.valueOf(0L);
    DEFAULT_USER_ID = long_;
    DEFAULT_NO_UN = integer;
    DEFAULT_DEBUG = Boolean.FALSE;
    DEFAULT_ISSDK = integer;
    DEFAULT_CATEGORY_ID = integer;
    DEFAULT_SORT_TYPE = integer;
    DEFAULT_LAST_CLICK_TID = long_;
    DEFAULT_LOAD_TYPE = integer;
    DEFAULT_IS_SELECTION = integer;
    DEFAULT_CALL_FROM = integer;
    DEFAULT_HOT_THREAD_ID = long_;
    DEFAULT_IS_DEFAULT_NAVTAB = integer;
    DEFAULT_DEFAULT_SORT_TYPE = integer;
    DEFAULT_HAS_AD_BEAR = integer;
    DEFAULT_AD_BEAR_SID_PRICE = double_;
    DEFAULT_REQUEST_TIMES = integer;
    DEFAULT_PUSH_TID = long_;
    DEFAULT_IS_NEWFEED = integer;
    DEFAULT_IS_NEWFRS = integer;
    DEFAULT_FORUM_ID = long_;
    DEFAULT_NEED_ABSTRACT = integer;
    DEFAULT_IS_GOODTAB = integer;
    DEFAULT_TAB_ID = integer;
    DEFAULT_LAST_THREAD_ID = long_;
    DEFAULT_IS_GENERAL_TAB = integer;
    DEFAULT_TAB_TYPE = integer;
    DEFAULT_IS_VIDEO_DOUBLEROW = integer;
    DEFAULT_PARTITION_TYPE = integer;
    DEFAULT_FIRST_GET_LESS_DATA = integer;
    DEFAULT_FIRST_GET_NORMAL_DATA = integer;
    DEFAULT_TID_SRC = long_;
    DEFAULT_FIRST_REQUEST = integer;
    DEFAULT_USER_READ_STYLE = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str21 = paramBuilder.kw;
      if (str21 == null) {
        this.kw = "";
      } else {
        this.kw = str21;
      } 
      Integer integer22 = paramBuilder.rn;
      if (integer22 == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer22;
      } 
      integer22 = paramBuilder.rn_need;
      if (integer22 == null) {
        this.rn_need = DEFAULT_RN_NEED;
      } else {
        this.rn_need = integer22;
      } 
      integer22 = paramBuilder.is_good;
      if (integer22 == null) {
        this.is_good = DEFAULT_IS_GOOD;
      } else {
        this.is_good = integer22;
      } 
      integer22 = paramBuilder.cid;
      if (integer22 == null) {
        this.cid = DEFAULT_CID;
      } else {
        this.cid = integer22;
      } 
      integer22 = paramBuilder.withcal;
      if (integer22 == null) {
        this.withcal = DEFAULT_WITHCAL;
      } else {
        this.withcal = integer22;
      } 
      integer22 = paramBuilder.noval;
      if (integer22 == null) {
        this.noval = DEFAULT_NOVAL;
      } else {
        this.noval = integer22;
      } 
      integer22 = paramBuilder.with_group;
      if (integer22 == null) {
        this.with_group = DEFAULT_WITH_GROUP;
      } else {
        this.with_group = integer22;
      } 
      integer22 = paramBuilder.need_badge;
      if (integer22 == null) {
        this.need_badge = DEFAULT_NEED_BADGE;
      } else {
        this.need_badge = integer22;
      } 
      integer22 = paramBuilder.frs_rn;
      if (integer22 == null) {
        this.frs_rn = DEFAULT_FRS_RN;
      } else {
        this.frs_rn = integer22;
      } 
      integer22 = paramBuilder.scr_w;
      if (integer22 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer22;
      } 
      integer22 = paramBuilder.scr_h;
      if (integer22 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer22;
      } 
      Double double_2 = paramBuilder.scr_dip;
      if (double_2 == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_2;
      } 
      Integer integer21 = paramBuilder.q_type;
      if (integer21 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer21;
      } 
      integer21 = paramBuilder.pn;
      if (integer21 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer21;
      } 
      String str20 = paramBuilder.st_type;
      if (str20 == null) {
        this.st_type = "";
      } else {
        this.st_type = str20;
      } 
      Integer integer20 = paramBuilder.ctime;
      if (integer20 == null) {
        this.ctime = DEFAULT_CTIME;
      } else {
        this.ctime = integer20;
      } 
      integer20 = paramBuilder.data_size;
      if (integer20 == null) {
        this.data_size = DEFAULT_DATA_SIZE;
      } else {
        this.data_size = integer20;
      } 
      integer20 = paramBuilder.net_error;
      if (integer20 == null) {
        this.net_error = DEFAULT_NET_ERROR;
      } else {
        this.net_error = integer20;
      } 
      Boolean bool3 = paramBuilder.check_login;
      if (bool3 == null) {
        this.check_login = DEFAULT_CHECK_LOGIN;
      } else {
        this.check_login = bool3;
      } 
      String str19 = paramBuilder.forum_name;
      if (str19 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str19;
      } 
      Integer integer19 = paramBuilder.result_num;
      if (integer19 == null) {
        this.result_num = DEFAULT_RESULT_NUM;
      } else {
        this.result_num = integer19;
      } 
      integer19 = paramBuilder.class_id;
      if (integer19 == null) {
        this.class_id = DEFAULT_CLASS_ID;
      } else {
        this.class_id = integer19;
      } 
      String str18 = paramBuilder.ip_str;
      if (str18 == null) {
        this.ip_str = "";
      } else {
        this.ip_str = str18;
      } 
      Integer integer18 = paramBuilder.ip_int;
      if (integer18 == null) {
        this.ip_int = DEFAULT_IP_INT;
      } else {
        this.ip_int = integer18;
      } 
      String str17 = paramBuilder.module_name;
      if (str17 == null) {
        this.module_name = "";
      } else {
        this.module_name = str17;
      } 
      Integer integer17 = paramBuilder.st_param;
      if (integer17 == null) {
        this.st_param = DEFAULT_ST_PARAM;
      } else {
        this.st_param = integer17;
      } 
      integer17 = paramBuilder.smile_grade;
      if (integer17 == null) {
        this.smile_grade = DEFAULT_SMILE_GRADE;
      } else {
        this.smile_grade = integer17;
      } 
      Boolean bool2 = paramBuilder.support_noun;
      if (bool2 == null) {
        this.support_noun = DEFAULT_SUPPORT_NOUN;
      } else {
        this.support_noun = bool2;
      } 
      bool2 = paramBuilder.login;
      if (bool2 == null) {
        this.login = DEFAULT_LOGIN;
      } else {
        this.login = bool2;
      } 
      Long long_7 = paramBuilder.user_id;
      if (long_7 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_7;
      } 
      String str16 = paramBuilder.user_name;
      if (str16 == null) {
        this.user_name = "";
      } else {
        this.user_name = str16;
      } 
      Integer integer16 = paramBuilder.no_un;
      if (integer16 == null) {
        this.no_un = DEFAULT_NO_UN;
      } else {
        this.no_un = integer16;
      } 
      String str15 = paramBuilder.portrait;
      if (str15 == null) {
        this.portrait = "";
      } else {
        this.portrait = str15;
      } 
      str15 = paramBuilder.mobile;
      if (str15 == null) {
        this.mobile = "";
      } else {
        this.mobile = str15;
      } 
      str15 = paramBuilder.email;
      if (str15 == null) {
        this.email = "";
      } else {
        this.email = str15;
      } 
      Boolean bool1 = paramBuilder.debug;
      if (bool1 == null) {
        this.debug = DEFAULT_DEBUG;
      } else {
        this.debug = bool1;
      } 
      String str14 = paramBuilder.cookie;
      if (str14 == null) {
        this.cookie = "";
      } else {
        this.cookie = str14;
      } 
      this.common = paramBuilder.common;
      str14 = paramBuilder.lastids;
      if (str14 == null) {
        this.lastids = "";
      } else {
        this.lastids = str14;
      } 
      Integer integer15 = paramBuilder.issdk;
      if (integer15 == null) {
        this.issdk = DEFAULT_ISSDK;
      } else {
        this.issdk = integer15;
      } 
      String str13 = paramBuilder.da_idfa;
      if (str13 == null) {
        this.da_idfa = "";
      } else {
        this.da_idfa = str13;
      } 
      str13 = paramBuilder.platform;
      if (str13 == null) {
        this.platform = "";
      } else {
        this.platform = str13;
      } 
      Integer integer14 = paramBuilder.category_id;
      if (integer14 == null) {
        this.category_id = DEFAULT_CATEGORY_ID;
      } else {
        this.category_id = integer14;
      } 
      String str12 = paramBuilder.yuelaou_locate;
      if (str12 == null) {
        this.yuelaou_locate = "";
      } else {
        this.yuelaou_locate = str12;
      } 
      str12 = paramBuilder.yuelaou_params;
      if (str12 == null) {
        this.yuelaou_params = "";
      } else {
        this.yuelaou_params = str12;
      } 
      Integer integer13 = paramBuilder.sort_type;
      if (integer13 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer13;
      } 
      Long long_6 = paramBuilder.last_click_tid;
      if (long_6 == null) {
        this.last_click_tid = DEFAULT_LAST_CLICK_TID;
      } else {
        this.last_click_tid = long_6;
      } 
      Integer integer12 = paramBuilder.load_type;
      if (integer12 == null) {
        this.load_type = DEFAULT_LOAD_TYPE;
      } else {
        this.load_type = integer12;
      } 
      this.app_pos = paramBuilder.app_pos;
      this.ad_param = paramBuilder.ad_param;
      String str11 = paramBuilder.obj_locate;
      if (str11 == null) {
        this.obj_locate = "";
      } else {
        this.obj_locate = str11;
      } 
      str11 = paramBuilder.obj_source;
      if (str11 == null) {
        this.obj_source = "";
      } else {
        this.obj_source = str11;
      } 
      str11 = paramBuilder.call_url;
      if (str11 == null) {
        this.call_url = "";
      } else {
        this.call_url = str11;
      } 
      Integer integer11 = paramBuilder.is_selection;
      if (integer11 == null) {
        this.is_selection = DEFAULT_IS_SELECTION;
      } else {
        this.is_selection = integer11;
      } 
      integer11 = paramBuilder.call_from;
      if (integer11 == null) {
        this.call_from = DEFAULT_CALL_FROM;
      } else {
        this.call_from = integer11;
      } 
      String str10 = paramBuilder.shoubai_cuid;
      if (str10 == null) {
        this.shoubai_cuid = "";
      } else {
        this.shoubai_cuid = str10;
      } 
      Long long_5 = paramBuilder.hot_thread_id;
      if (long_5 == null) {
        this.hot_thread_id = DEFAULT_HOT_THREAD_ID;
      } else {
        this.hot_thread_id = long_5;
      } 
      Integer integer10 = paramBuilder.is_default_navtab;
      if (integer10 == null) {
        this.is_default_navtab = DEFAULT_IS_DEFAULT_NAVTAB;
      } else {
        this.is_default_navtab = integer10;
      } 
      String str9 = paramBuilder.ad_context_list;
      if (str9 == null) {
        this.ad_context_list = "";
      } else {
        this.ad_context_list = str9;
      } 
      str9 = paramBuilder.up_schema;
      if (str9 == null) {
        this.up_schema = "";
      } else {
        this.up_schema = str9;
      } 
      str9 = paramBuilder.ad_ext_params;
      if (str9 == null) {
        this.ad_ext_params = "";
      } else {
        this.ad_ext_params = str9;
      } 
      Integer integer9 = paramBuilder.default_sort_type;
      if (integer9 == null) {
        this.default_sort_type = DEFAULT_DEFAULT_SORT_TYPE;
      } else {
        this.default_sort_type = integer9;
      } 
      this.app_transmit_data = paramBuilder.app_transmit_data;
      String str8 = paramBuilder.ad_bear_context;
      if (str8 == null) {
        this.ad_bear_context = "";
      } else {
        this.ad_bear_context = str8;
      } 
      Integer integer8 = paramBuilder.has_ad_bear;
      if (integer8 == null) {
        this.has_ad_bear = DEFAULT_HAS_AD_BEAR;
      } else {
        this.has_ad_bear = integer8;
      } 
      String str7 = paramBuilder.ad_bear_sid;
      if (str7 == null) {
        this.ad_bear_sid = "";
      } else {
        this.ad_bear_sid = str7;
      } 
      Double double_1 = paramBuilder.ad_bear_sid_price;
      if (double_1 == null) {
        this.ad_bear_sid_price = DEFAULT_AD_BEAR_SID_PRICE;
      } else {
        this.ad_bear_sid_price = double_1;
      } 
      Integer integer7 = paramBuilder.request_times;
      if (integer7 == null) {
        this.request_times = DEFAULT_REQUEST_TIMES;
      } else {
        this.request_times = integer7;
      } 
      Long long_4 = paramBuilder.push_tid;
      if (long_4 == null) {
        this.push_tid = DEFAULT_PUSH_TID;
      } else {
        this.push_tid = long_4;
      } 
      Integer integer6 = paramBuilder.is_newfeed;
      if (integer6 == null) {
        this.is_newfeed = DEFAULT_IS_NEWFEED;
      } else {
        this.is_newfeed = integer6;
      } 
      String str6 = paramBuilder.chatroom_new_msg;
      if (str6 == null) {
        this.chatroom_new_msg = "";
      } else {
        this.chatroom_new_msg = str6;
      } 
      Integer integer5 = paramBuilder.is_newfrs;
      if (integer5 == null) {
        this.is_newfrs = DEFAULT_IS_NEWFRS;
      } else {
        this.is_newfrs = integer5;
      } 
      String str5 = paramBuilder.top_card_id;
      if (str5 == null) {
        this.top_card_id = "";
      } else {
        this.top_card_id = str5;
      } 
      str5 = paramBuilder.frs_tab_type_default;
      if (str5 == null) {
        this.frs_tab_type_default = "";
      } else {
        this.frs_tab_type_default = str5;
      } 
      str5 = paramBuilder.log_param;
      if (str5 == null) {
        this.log_param = "";
      } else {
        this.log_param = str5;
      } 
      str5 = paramBuilder.simplify_field;
      if (str5 == null) {
        this.simplify_field = "";
      } else {
        this.simplify_field = str5;
      } 
      str5 = paramBuilder.ad_external_info;
      if (str5 == null) {
        this.ad_external_info = "";
      } else {
        this.ad_external_info = str5;
      } 
      str5 = paramBuilder.thread_ids;
      if (str5 == null) {
        this.thread_ids = "";
      } else {
        this.thread_ids = str5;
      } 
      Long long_3 = paramBuilder.forum_id;
      if (long_3 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_3;
      } 
      Integer integer4 = paramBuilder.need_abstract;
      if (integer4 == null) {
        this.need_abstract = DEFAULT_NEED_ABSTRACT;
      } else {
        this.need_abstract = integer4;
      } 
      String str4 = paramBuilder.frs_common_info;
      if (str4 == null) {
        this.frs_common_info = "";
      } else {
        this.frs_common_info = str4;
      } 
      Integer integer3 = paramBuilder.is_goodtab;
      if (integer3 == null) {
        this.is_goodtab = DEFAULT_IS_GOODTAB;
      } else {
        this.is_goodtab = integer3;
      } 
      integer3 = paramBuilder.tab_id;
      if (integer3 == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = integer3;
      } 
      Long long_2 = paramBuilder.last_thread_id;
      if (long_2 == null) {
        this.last_thread_id = DEFAULT_LAST_THREAD_ID;
      } else {
        this.last_thread_id = long_2;
      } 
      String str3 = paramBuilder.tab_name;
      if (str3 == null) {
        this.tab_name = "";
      } else {
        this.tab_name = str3;
      } 
      Integer integer2 = paramBuilder.is_general_tab;
      if (integer2 == null) {
        this.is_general_tab = DEFAULT_IS_GENERAL_TAB;
      } else {
        this.is_general_tab = integer2;
      } 
      integer2 = paramBuilder.tab_type;
      if (integer2 == null) {
        this.tab_type = DEFAULT_TAB_TYPE;
      } else {
        this.tab_type = integer2;
      } 
      integer2 = paramBuilder.is_video_doublerow;
      if (integer2 == null) {
        this.is_video_doublerow = DEFAULT_IS_VIDEO_DOUBLEROW;
      } else {
        this.is_video_doublerow = integer2;
      } 
      integer2 = paramBuilder.partition_type;
      if (integer2 == null) {
        this.partition_type = DEFAULT_PARTITION_TYPE;
      } else {
        this.partition_type = integer2;
      } 
      integer2 = paramBuilder.first_get_less_data;
      if (integer2 == null) {
        this.first_get_less_data = DEFAULT_FIRST_GET_LESS_DATA;
      } else {
        this.first_get_less_data = integer2;
      } 
      integer2 = paramBuilder.first_get_normal_data;
      if (integer2 == null) {
        this.first_get_normal_data = DEFAULT_FIRST_GET_NORMAL_DATA;
      } else {
        this.first_get_normal_data = integer2;
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
      str2 = paramBuilder.feed_page_source;
      if (str2 == null) {
        this.feed_page_source = "";
      } else {
        this.feed_page_source = str2;
      } 
      str2 = paramBuilder.click_id;
      if (str2 == null) {
        this.click_id = "";
      } else {
        this.click_id = str2;
      } 
      Integer integer1 = paramBuilder.first_request;
      if (integer1 == null) {
        this.first_request = DEFAULT_FIRST_REQUEST;
      } else {
        this.first_request = integer1;
      } 
      String str1 = paramBuilder.nid_tb_src;
      if (str1 == null) {
        this.nid_tb_src = "";
      } else {
        this.nid_tb_src = str1;
      } 
      integer = paramBuilder.user_read_style;
      if (integer == null) {
        this.user_read_style = DEFAULT_USER_READ_STYLE;
      } else {
        this.user_read_style = integer;
      } 
    } else {
      this.kw = ((Builder)integer).kw;
      this.rn = ((Builder)integer).rn;
      this.rn_need = ((Builder)integer).rn_need;
      this.is_good = ((Builder)integer).is_good;
      this.cid = ((Builder)integer).cid;
      this.withcal = ((Builder)integer).withcal;
      this.noval = ((Builder)integer).noval;
      this.with_group = ((Builder)integer).with_group;
      this.need_badge = ((Builder)integer).need_badge;
      this.frs_rn = ((Builder)integer).frs_rn;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.scr_dip = ((Builder)integer).scr_dip;
      this.q_type = ((Builder)integer).q_type;
      this.pn = ((Builder)integer).pn;
      this.st_type = ((Builder)integer).st_type;
      this.ctime = ((Builder)integer).ctime;
      this.data_size = ((Builder)integer).data_size;
      this.net_error = ((Builder)integer).net_error;
      this.check_login = ((Builder)integer).check_login;
      this.forum_name = ((Builder)integer).forum_name;
      this.result_num = ((Builder)integer).result_num;
      this.class_id = ((Builder)integer).class_id;
      this.ip_str = ((Builder)integer).ip_str;
      this.ip_int = ((Builder)integer).ip_int;
      this.module_name = ((Builder)integer).module_name;
      this.st_param = ((Builder)integer).st_param;
      this.smile_grade = ((Builder)integer).smile_grade;
      this.support_noun = ((Builder)integer).support_noun;
      this.login = ((Builder)integer).login;
      this.user_id = ((Builder)integer).user_id;
      this.user_name = ((Builder)integer).user_name;
      this.no_un = ((Builder)integer).no_un;
      this.portrait = ((Builder)integer).portrait;
      this.mobile = ((Builder)integer).mobile;
      this.email = ((Builder)integer).email;
      this.debug = ((Builder)integer).debug;
      this.cookie = ((Builder)integer).cookie;
      this.common = ((Builder)integer).common;
      this.lastids = ((Builder)integer).lastids;
      this.issdk = ((Builder)integer).issdk;
      this.da_idfa = ((Builder)integer).da_idfa;
      this.platform = ((Builder)integer).platform;
      this.category_id = ((Builder)integer).category_id;
      this.yuelaou_locate = ((Builder)integer).yuelaou_locate;
      this.yuelaou_params = ((Builder)integer).yuelaou_params;
      this.sort_type = ((Builder)integer).sort_type;
      this.last_click_tid = ((Builder)integer).last_click_tid;
      this.load_type = ((Builder)integer).load_type;
      this.app_pos = ((Builder)integer).app_pos;
      this.ad_param = ((Builder)integer).ad_param;
      this.obj_locate = ((Builder)integer).obj_locate;
      this.obj_source = ((Builder)integer).obj_source;
      this.call_url = ((Builder)integer).call_url;
      this.is_selection = ((Builder)integer).is_selection;
      this.call_from = ((Builder)integer).call_from;
      this.shoubai_cuid = ((Builder)integer).shoubai_cuid;
      this.hot_thread_id = ((Builder)integer).hot_thread_id;
      this.is_default_navtab = ((Builder)integer).is_default_navtab;
      this.ad_context_list = ((Builder)integer).ad_context_list;
      this.up_schema = ((Builder)integer).up_schema;
      this.ad_ext_params = ((Builder)integer).ad_ext_params;
      this.default_sort_type = ((Builder)integer).default_sort_type;
      this.app_transmit_data = ((Builder)integer).app_transmit_data;
      this.ad_bear_context = ((Builder)integer).ad_bear_context;
      this.has_ad_bear = ((Builder)integer).has_ad_bear;
      this.ad_bear_sid = ((Builder)integer).ad_bear_sid;
      this.ad_bear_sid_price = ((Builder)integer).ad_bear_sid_price;
      this.request_times = ((Builder)integer).request_times;
      this.push_tid = ((Builder)integer).push_tid;
      this.is_newfeed = ((Builder)integer).is_newfeed;
      this.chatroom_new_msg = ((Builder)integer).chatroom_new_msg;
      this.is_newfrs = ((Builder)integer).is_newfrs;
      this.top_card_id = ((Builder)integer).top_card_id;
      this.frs_tab_type_default = ((Builder)integer).frs_tab_type_default;
      this.log_param = ((Builder)integer).log_param;
      this.simplify_field = ((Builder)integer).simplify_field;
      this.ad_external_info = ((Builder)integer).ad_external_info;
      this.thread_ids = ((Builder)integer).thread_ids;
      this.forum_id = ((Builder)integer).forum_id;
      this.need_abstract = ((Builder)integer).need_abstract;
      this.frs_common_info = ((Builder)integer).frs_common_info;
      this.is_goodtab = ((Builder)integer).is_goodtab;
      this.tab_id = ((Builder)integer).tab_id;
      this.last_thread_id = ((Builder)integer).last_thread_id;
      this.tab_name = ((Builder)integer).tab_name;
      this.is_general_tab = ((Builder)integer).is_general_tab;
      this.tab_type = ((Builder)integer).tab_type;
      this.is_video_doublerow = ((Builder)integer).is_video_doublerow;
      this.partition_type = ((Builder)integer).partition_type;
      this.first_get_less_data = ((Builder)integer).first_get_less_data;
      this.first_get_normal_data = ((Builder)integer).first_get_normal_data;
      this.tid_src = ((Builder)integer).tid_src;
      this.nid_src = ((Builder)integer).nid_src;
      this.feed_page_source = ((Builder)integer).feed_page_source;
      this.click_id = ((Builder)integer).click_id;
      this.first_request = ((Builder)integer).first_request;
      this.nid_tb_src = ((Builder)integer).nid_tb_src;
      this.user_read_style = ((Builder)integer).user_read_style;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public String ad_bear_context;
    
    public String ad_bear_sid;
    
    public Double ad_bear_sid_price;
    
    public String ad_context_list;
    
    public String ad_ext_params;
    
    public String ad_external_info;
    
    public AdParam ad_param;
    
    public AppPosInfo app_pos;
    
    public AppTransmitData app_transmit_data;
    
    public Integer call_from;
    
    public String call_url;
    
    public Integer category_id;
    
    public String chatroom_new_msg;
    
    public Boolean check_login;
    
    public Integer cid;
    
    public Integer class_id;
    
    public String click_id;
    
    public CommonReq common;
    
    public String cookie;
    
    public Integer ctime;
    
    public String da_idfa;
    
    public Integer data_size;
    
    public Boolean debug;
    
    public Integer default_sort_type;
    
    public String email;
    
    public String feed_page_source;
    
    public Integer first_get_less_data;
    
    public Integer first_get_normal_data;
    
    public Integer first_request;
    
    public Long forum_id;
    
    public String forum_name;
    
    public String frs_common_info;
    
    public Integer frs_rn;
    
    public String frs_tab_type_default;
    
    public Integer has_ad_bear;
    
    public Long hot_thread_id;
    
    public Integer ip_int;
    
    public String ip_str;
    
    public Integer is_default_navtab;
    
    public Integer is_general_tab;
    
    public Integer is_good;
    
    public Integer is_goodtab;
    
    public Integer is_newfeed;
    
    public Integer is_newfrs;
    
    public Integer is_selection;
    
    public Integer is_video_doublerow;
    
    public Integer issdk;
    
    public String kw;
    
    public Long last_click_tid;
    
    public Long last_thread_id;
    
    public String lastids;
    
    public Integer load_type;
    
    public String log_param;
    
    public Boolean login;
    
    public String mobile;
    
    public String module_name;
    
    public Integer need_abstract;
    
    public Integer need_badge;
    
    public Integer net_error;
    
    public String nid_src;
    
    public String nid_tb_src;
    
    public Integer no_un;
    
    public Integer noval;
    
    public String obj_locate;
    
    public String obj_source;
    
    public Integer partition_type;
    
    public String platform;
    
    public Integer pn;
    
    public String portrait;
    
    public Long push_tid;
    
    public Integer q_type;
    
    public Integer request_times;
    
    public Integer result_num;
    
    public Integer rn;
    
    public Integer rn_need;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public String shoubai_cuid;
    
    public String simplify_field;
    
    public Integer smile_grade;
    
    public Integer sort_type;
    
    public Integer st_param;
    
    public String st_type;
    
    public Boolean support_noun;
    
    public Integer tab_id;
    
    public String tab_name;
    
    public Integer tab_type;
    
    public String thread_ids;
    
    public Long tid_src;
    
    public String top_card_id;
    
    public String up_schema;
    
    public Long user_id;
    
    public String user_name;
    
    public Integer user_read_style;
    
    public Integer with_group;
    
    public Integer withcal;
    
    public String yuelaou_locate;
    
    public String yuelaou_params;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.kw = param1DataReq.kw;
      this.rn = param1DataReq.rn;
      this.rn_need = param1DataReq.rn_need;
      this.is_good = param1DataReq.is_good;
      this.cid = param1DataReq.cid;
      this.withcal = param1DataReq.withcal;
      this.noval = param1DataReq.noval;
      this.with_group = param1DataReq.with_group;
      this.need_badge = param1DataReq.need_badge;
      this.frs_rn = param1DataReq.frs_rn;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.q_type = param1DataReq.q_type;
      this.pn = param1DataReq.pn;
      this.st_type = param1DataReq.st_type;
      this.ctime = param1DataReq.ctime;
      this.data_size = param1DataReq.data_size;
      this.net_error = param1DataReq.net_error;
      this.check_login = param1DataReq.check_login;
      this.forum_name = param1DataReq.forum_name;
      this.result_num = param1DataReq.result_num;
      this.class_id = param1DataReq.class_id;
      this.ip_str = param1DataReq.ip_str;
      this.ip_int = param1DataReq.ip_int;
      this.module_name = param1DataReq.module_name;
      this.st_param = param1DataReq.st_param;
      this.smile_grade = param1DataReq.smile_grade;
      this.support_noun = param1DataReq.support_noun;
      this.login = param1DataReq.login;
      this.user_id = param1DataReq.user_id;
      this.user_name = param1DataReq.user_name;
      this.no_un = param1DataReq.no_un;
      this.portrait = param1DataReq.portrait;
      this.mobile = param1DataReq.mobile;
      this.email = param1DataReq.email;
      this.debug = param1DataReq.debug;
      this.cookie = param1DataReq.cookie;
      this.common = param1DataReq.common;
      this.lastids = param1DataReq.lastids;
      this.issdk = param1DataReq.issdk;
      this.da_idfa = param1DataReq.da_idfa;
      this.platform = param1DataReq.platform;
      this.category_id = param1DataReq.category_id;
      this.yuelaou_locate = param1DataReq.yuelaou_locate;
      this.yuelaou_params = param1DataReq.yuelaou_params;
      this.sort_type = param1DataReq.sort_type;
      this.last_click_tid = param1DataReq.last_click_tid;
      this.load_type = param1DataReq.load_type;
      this.app_pos = param1DataReq.app_pos;
      this.ad_param = param1DataReq.ad_param;
      this.obj_locate = param1DataReq.obj_locate;
      this.obj_source = param1DataReq.obj_source;
      this.call_url = param1DataReq.call_url;
      this.is_selection = param1DataReq.is_selection;
      this.call_from = param1DataReq.call_from;
      this.shoubai_cuid = param1DataReq.shoubai_cuid;
      this.hot_thread_id = param1DataReq.hot_thread_id;
      this.is_default_navtab = param1DataReq.is_default_navtab;
      this.ad_context_list = param1DataReq.ad_context_list;
      this.up_schema = param1DataReq.up_schema;
      this.ad_ext_params = param1DataReq.ad_ext_params;
      this.default_sort_type = param1DataReq.default_sort_type;
      this.app_transmit_data = param1DataReq.app_transmit_data;
      this.ad_bear_context = param1DataReq.ad_bear_context;
      this.has_ad_bear = param1DataReq.has_ad_bear;
      this.ad_bear_sid = param1DataReq.ad_bear_sid;
      this.ad_bear_sid_price = param1DataReq.ad_bear_sid_price;
      this.request_times = param1DataReq.request_times;
      this.push_tid = param1DataReq.push_tid;
      this.is_newfeed = param1DataReq.is_newfeed;
      this.chatroom_new_msg = param1DataReq.chatroom_new_msg;
      this.is_newfrs = param1DataReq.is_newfrs;
      this.top_card_id = param1DataReq.top_card_id;
      this.frs_tab_type_default = param1DataReq.frs_tab_type_default;
      this.log_param = param1DataReq.log_param;
      this.simplify_field = param1DataReq.simplify_field;
      this.ad_external_info = param1DataReq.ad_external_info;
      this.thread_ids = param1DataReq.thread_ids;
      this.forum_id = param1DataReq.forum_id;
      this.need_abstract = param1DataReq.need_abstract;
      this.frs_common_info = param1DataReq.frs_common_info;
      this.is_goodtab = param1DataReq.is_goodtab;
      this.tab_id = param1DataReq.tab_id;
      this.last_thread_id = param1DataReq.last_thread_id;
      this.tab_name = param1DataReq.tab_name;
      this.is_general_tab = param1DataReq.is_general_tab;
      this.tab_type = param1DataReq.tab_type;
      this.is_video_doublerow = param1DataReq.is_video_doublerow;
      this.partition_type = param1DataReq.partition_type;
      this.first_get_less_data = param1DataReq.first_get_less_data;
      this.first_get_normal_data = param1DataReq.first_get_normal_data;
      this.tid_src = param1DataReq.tid_src;
      this.nid_src = param1DataReq.nid_src;
      this.feed_page_source = param1DataReq.feed_page_source;
      this.click_id = param1DataReq.click_id;
      this.first_request = param1DataReq.first_request;
      this.nid_tb_src = param1DataReq.nid_tb_src;
      this.user_read_style = param1DataReq.user_read_style;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
