package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CommonReq extends Message {
  public static final Long DEFAULT_ACTIVE_TIMESTAMP;
  
  public static final String DEFAULT_AFDI = "";
  
  public static final String DEFAULT_ANDROID_ID = "";
  
  public static final String DEFAULT_APID = "";
  
  public static final String DEFAULT_APPLIST = "";
  
  public static final String DEFAULT_BDUSS = "";
  
  public static final String DEFAULT_BRAND = "";
  
  public static final String DEFAULT_BRAND_TYPE = "";
  
  public static final String DEFAULT_C3_AID = "";
  
  public static final String DEFAULT_CAM = "";
  
  public static final Integer DEFAULT_CMODE;
  
  public static final String DEFAULT_CUID = "";
  
  public static final String DEFAULT_CUID_GALAXY2 = "";
  
  public static final String DEFAULT_CUID_GID = "";
  
  public static final String DEFAULT_DEVICE_SCORE = "";
  
  public static final String DEFAULT_DIAC = "";
  
  public static final String DEFAULT_DIAO = "";
  
  public static final String DEFAULT_DI_DIORDNA = "";
  
  public static final String DEFAULT_DNARB = "";
  
  public static final String DEFAULT_EPYT_DNARB = "";
  
  public static final String DEFAULT_EVENT_DAY = "";
  
  public static final String DEFAULT_EXTRA = "";
  
  public static final Long DEFAULT_FIRST_INSTALL_TIME;
  
  public static final String DEFAULT_FRAMEWORK_VER = "";
  
  public static final String DEFAULT_FROM = "";
  
  public static final String DEFAULT_HM_ACUID = "";
  
  public static final String DEFAULT_HM_NEEDMP = "";
  
  public static final String DEFAULT_HM_OID = "";
  
  public static final String DEFAULT_H_RCS = "";
  
  public static final String DEFAULT_IDFA = "";
  
  public static final String DEFAULT_IDFV = "";
  
  public static final String DEFAULT_IEMI = "";
  
  public static final String DEFAULT_IEMIWEN = "";
  
  public static final Integer DEFAULT_IS_TEENAGER;
  
  public static final String DEFAULT_KA = "";
  
  public static final Long DEFAULT_LAST_UPDATE_TIME;
  
  public static final String DEFAULT_LEDOM = "";
  
  public static final String DEFAULT_LEGO_LIB_VERSION = "";
  
  public static final String DEFAULT_MAC = "";
  
  public static final String DEFAULT_MODEL = "";
  
  public static final String DEFAULT_M_API = "";
  
  public static final String DEFAULT_M_COST = "";
  
  public static final String DEFAULT_M_LOGID = "";
  
  public static final String DEFAULT_M_RESULT = "";
  
  public static final String DEFAULT_M_SIZE_D = "";
  
  public static final String DEFAULT_M_SIZE_U = "";
  
  public static final String DEFAULT_NAWS_GAME_VER = "";
  
  public static final Integer DEFAULT_NEED_CAM_DECRYPT;
  
  public static final Integer DEFAULT_NEED_DECRYPT;
  
  public static final Integer DEFAULT_NET_TYPE;
  
  public static final String DEFAULT_NOISREV_SO = "";
  
  public static final String DEFAULT_OAID = "";
  
  public static final String DEFAULT_PACKAGE_VERSION = "";
  
  public static final Integer DEFAULT_PERSONALIZED_REC_SWITCH;
  
  public static final String DEFAULT_PID_RCS = "";
  
  public static final Integer DEFAULT_PURE_MODE;
  
  public static final String DEFAULT_PVERSION = "";
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final String DEFAULT_SAMPLE_ID = "";
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final String DEFAULT_SDK_VER = "";
  
  public static final String DEFAULT_SHOUBAI_CUID = "";
  
  public static final String DEFAULT_SHOUBAI_VERSION = "";
  
  public static final String DEFAULT_SIGN = "";
  
  public static final String DEFAULT_SMALLFLOW = "";
  
  public static final String DEFAULT_START_SCHEME = "";
  
  public static final Integer DEFAULT_START_TYPE;
  
  public static final String DEFAULT_STOKEN = "";
  
  public static final String DEFAULT_SUBAPP_TYPE = "";
  
  public static final String DEFAULT_SUPPORT_IMAGE = "";
  
  public static final String DEFAULT_TBS = "";
  
  public static final String DEFAULT_USER_AGENT = "";
  
  public static final String DEFAULT_VFDI = "";
  
  public static final String DEFAULT_W_RCS = "";
  
  public static final Integer DEFAULT_XCX_MODE;
  
  public static final String DEFAULT_Z_ID = "";
  
  public static final String DEFAULT__CLIENT_ID = "";
  
  public static final Integer DEFAULT__CLIENT_TYPE;
  
  public static final String DEFAULT__CLIENT_VERSION = "";
  
  public static final String DEFAULT__OS_VERSION = "";
  
  public static final String DEFAULT__PHONE_IMEI = "";
  
  public static final String DEFAULT__PHONE_NEWIMEI = "";
  
  public static final Long DEFAULT__TIMESTAMP;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String BDUSS;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String _client_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer _client_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String _client_version;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String _os_version;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String _phone_imei;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String _phone_newimei;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT64)
  public final Long _timestamp;
  
  @ProtoField(tag = 49, type = Message.Datatype.INT64)
  public final Long active_timestamp;
  
  @ProtoField(tag = 67, type = Message.Datatype.STRING)
  public final String afdi;
  
  @ProtoField(tag = 54, type = Message.Datatype.STRING)
  public final String android_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String apid;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String applist;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String brand;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String brand_type;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String c3_aid;
  
  @ProtoField(tag = 66, type = Message.Datatype.STRING)
  public final String cam;
  
  @ProtoField(tag = 55, type = Message.Datatype.INT32)
  public final Integer cmode;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String cuid;
  
  @ProtoField(tag = 32, type = Message.Datatype.STRING)
  public final String cuid_galaxy2;
  
  @ProtoField(tag = 33, type = Message.Datatype.STRING)
  public final String cuid_gid;
  
  @ProtoField(tag = 70, type = Message.Datatype.STRING)
  public final String device_score;
  
  @ProtoField(tag = 68, type = Message.Datatype.STRING)
  public final String di_diordna;
  
  @ProtoField(tag = 46, type = Message.Datatype.STRING)
  public final String diac;
  
  @ProtoField(tag = 74, type = Message.Datatype.STRING)
  public final String diao;
  
  @ProtoField(tag = 76, type = Message.Datatype.STRING)
  public final String dnarb;
  
  @ProtoField(tag = 77, type = Message.Datatype.STRING)
  public final String epyt_dnarb;
  
  @ProtoField(tag = 53, type = Message.Datatype.STRING)
  public final String event_day;
  
  @ProtoField(tag = 61, type = Message.Datatype.STRING)
  public final String extra;
  
  @ProtoField(tag = 50, type = Message.Datatype.INT64)
  public final Long first_install_time;
  
  @ProtoField(tag = 43, type = Message.Datatype.STRING)
  public final String framework_ver;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String from;
  
  @ProtoField(tag = 79, type = Message.Datatype.STRING)
  public final String h_rcs;
  
  @ProtoField(tag = 84, type = Message.Datatype.STRING)
  public final String hm_acuid;
  
  @ProtoField(tag = 86, type = Message.Datatype.STRING)
  public final String hm_needmp;
  
  @ProtoField(tag = 85, type = Message.Datatype.STRING)
  public final String hm_oid;
  
  @ProtoField(tag = 45, type = Message.Datatype.STRING)
  public final String idfa;
  
  @ProtoField(tag = 60, type = Message.Datatype.STRING)
  public final String idfv;
  
  @ProtoField(tag = 64, type = Message.Datatype.STRING)
  public final String iemi;
  
  @ProtoField(tag = 65, type = Message.Datatype.STRING)
  public final String iemiwen;
  
  @ProtoField(tag = 41, type = Message.Datatype.INT32)
  public final Integer is_teenager;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String ka;
  
  @ProtoField(tag = 51, type = Message.Datatype.INT64)
  public final Long last_update_time;
  
  @ProtoField(tag = 73, type = Message.Datatype.STRING)
  public final String ledom;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String lego_lib_version;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String m_api;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String m_cost;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String m_logid;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String m_result;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String m_size_d;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String m_size_u;
  
  @ProtoField(tag = 59, type = Message.Datatype.STRING)
  public final String mac;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String model;
  
  @ProtoField(tag = 44, type = Message.Datatype.STRING)
  public final String naws_game_ver;
  
  @ProtoField(tag = 82, type = Message.Datatype.INT32)
  public final Integer need_cam_decrypt;
  
  @ProtoField(tag = 81, type = Message.Datatype.INT32)
  public final Integer need_decrypt;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer net_type;
  
  @ProtoField(tag = 75, type = Message.Datatype.STRING)
  public final String noisrev_so;
  
  @ProtoField(tag = 34, type = Message.Datatype.STRING)
  public final String oaid;
  
  @ProtoField(tag = 88, type = Message.Datatype.STRING)
  public final String package_version;
  
  @ProtoField(tag = 63, type = Message.Datatype.INT32)
  public final Integer personalized_rec_switch;
  
  @ProtoField(tag = 80, type = Message.Datatype.STRING)
  public final String pid_rcs;
  
  @ProtoField(tag = 71, type = Message.Datatype.INT32)
  public final Integer pure_mode;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String pversion;
  
  @ProtoField(tag = 40, type = Message.Datatype.INT32)
  public final Integer q_type;
  
  @ProtoField(tag = 36, type = Message.Datatype.STRING)
  public final String sample_id;
  
  @ProtoField(tag = 39, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 38, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 37, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 42, type = Message.Datatype.STRING)
  public final String sdk_ver;
  
  @ProtoField(tag = 58, type = Message.Datatype.STRING)
  public final String shoubai_cuid;
  
  @ProtoField(tag = 83, type = Message.Datatype.STRING)
  public final String shoubai_version;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String sign;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String smallflow;
  
  @ProtoField(tag = 56, type = Message.Datatype.STRING)
  public final String start_scheme;
  
  @ProtoField(tag = 57, type = Message.Datatype.INT32)
  public final Integer start_type;
  
  @ProtoField(tag = 30, type = Message.Datatype.STRING)
  public final String stoken;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String subapp_type;
  
  @ProtoField(tag = 87, type = Message.Datatype.STRING)
  public final String support_image;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String tbs;
  
  @ProtoField(tag = 62, type = Message.Datatype.STRING)
  public final String user_agent;
  
  @ProtoField(tag = 69, type = Message.Datatype.STRING)
  public final String vfdi;
  
  @ProtoField(tag = 78, type = Message.Datatype.STRING)
  public final String w_rcs;
  
  @ProtoField(tag = 72, type = Message.Datatype.INT32)
  public final Integer xcx_mode;
  
  @ProtoField(tag = 31, type = Message.Datatype.STRING)
  public final String z_id;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT__CLIENT_TYPE = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT__TIMESTAMP = long_;
    DEFAULT_NET_TYPE = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_Q_TYPE = integer;
    DEFAULT_IS_TEENAGER = integer;
    DEFAULT_ACTIVE_TIMESTAMP = long_;
    DEFAULT_FIRST_INSTALL_TIME = long_;
    DEFAULT_LAST_UPDATE_TIME = long_;
    DEFAULT_CMODE = integer;
    DEFAULT_START_TYPE = integer;
    DEFAULT_PERSONALIZED_REC_SWITCH = integer;
    DEFAULT_PURE_MODE = integer;
    DEFAULT_XCX_MODE = integer;
    DEFAULT_NEED_DECRYPT = integer;
    DEFAULT_NEED_CAM_DECRYPT = integer;
  }
  
  public CommonReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer9 = paramBuilder._client_type;
      if (integer9 == null) {
        this._client_type = DEFAULT__CLIENT_TYPE;
      } else {
        this._client_type = integer9;
      } 
      String str10 = paramBuilder._client_version;
      if (str10 == null) {
        this._client_version = "";
      } else {
        this._client_version = str10;
      } 
      str10 = paramBuilder._client_id;
      if (str10 == null) {
        this._client_id = "";
      } else {
        this._client_id = str10;
      } 
      str10 = paramBuilder.apid;
      if (str10 == null) {
        this.apid = "";
      } else {
        this.apid = str10;
      } 
      str10 = paramBuilder._phone_imei;
      if (str10 == null) {
        this._phone_imei = "";
      } else {
        this._phone_imei = str10;
      } 
      str10 = paramBuilder.from;
      if (str10 == null) {
        this.from = "";
      } else {
        this.from = str10;
      } 
      str10 = paramBuilder.cuid;
      if (str10 == null) {
        this.cuid = "";
      } else {
        this.cuid = str10;
      } 
      Long long_2 = paramBuilder._timestamp;
      if (long_2 == null) {
        this._timestamp = DEFAULT__TIMESTAMP;
      } else {
        this._timestamp = long_2;
      } 
      String str9 = paramBuilder.model;
      if (str9 == null) {
        this.model = "";
      } else {
        this.model = str9;
      } 
      str9 = paramBuilder.BDUSS;
      if (str9 == null) {
        this.BDUSS = "";
      } else {
        this.BDUSS = str9;
      } 
      str9 = paramBuilder.tbs;
      if (str9 == null) {
        this.tbs = "";
      } else {
        this.tbs = str9;
      } 
      Integer integer8 = paramBuilder.net_type;
      if (integer8 == null) {
        this.net_type = DEFAULT_NET_TYPE;
      } else {
        this.net_type = integer8;
      } 
      String str8 = paramBuilder.subapp_type;
      if (str8 == null) {
        this.subapp_type = "";
      } else {
        this.subapp_type = str8;
      } 
      str8 = paramBuilder._phone_newimei;
      if (str8 == null) {
        this._phone_newimei = "";
      } else {
        this._phone_newimei = str8;
      } 
      str8 = paramBuilder.ka;
      if (str8 == null) {
        this.ka = "";
      } else {
        this.ka = str8;
      } 
      str8 = paramBuilder.m_api;
      if (str8 == null) {
        this.m_api = "";
      } else {
        this.m_api = str8;
      } 
      str8 = paramBuilder.m_logid;
      if (str8 == null) {
        this.m_logid = "";
      } else {
        this.m_logid = str8;
      } 
      str8 = paramBuilder.m_cost;
      if (str8 == null) {
        this.m_cost = "";
      } else {
        this.m_cost = str8;
      } 
      str8 = paramBuilder.m_result;
      if (str8 == null) {
        this.m_result = "";
      } else {
        this.m_result = str8;
      } 
      str8 = paramBuilder.m_size_u;
      if (str8 == null) {
        this.m_size_u = "";
      } else {
        this.m_size_u = str8;
      } 
      str8 = paramBuilder.m_size_d;
      if (str8 == null) {
        this.m_size_d = "";
      } else {
        this.m_size_d = str8;
      } 
      str8 = paramBuilder.smallflow;
      if (str8 == null) {
        this.smallflow = "";
      } else {
        this.smallflow = str8;
      } 
      str8 = paramBuilder.sign;
      if (str8 == null) {
        this.sign = "";
      } else {
        this.sign = str8;
      } 
      str8 = paramBuilder.pversion;
      if (str8 == null) {
        this.pversion = "";
      } else {
        this.pversion = str8;
      } 
      str8 = paramBuilder._os_version;
      if (str8 == null) {
        this._os_version = "";
      } else {
        this._os_version = str8;
      } 
      str8 = paramBuilder.brand;
      if (str8 == null) {
        this.brand = "";
      } else {
        this.brand = str8;
      } 
      str8 = paramBuilder.brand_type;
      if (str8 == null) {
        this.brand_type = "";
      } else {
        this.brand_type = str8;
      } 
      str8 = paramBuilder.lego_lib_version;
      if (str8 == null) {
        this.lego_lib_version = "";
      } else {
        this.lego_lib_version = str8;
      } 
      str8 = paramBuilder.applist;
      if (str8 == null) {
        this.applist = "";
      } else {
        this.applist = str8;
      } 
      str8 = paramBuilder.stoken;
      if (str8 == null) {
        this.stoken = "";
      } else {
        this.stoken = str8;
      } 
      str8 = paramBuilder.z_id;
      if (str8 == null) {
        this.z_id = "";
      } else {
        this.z_id = str8;
      } 
      str8 = paramBuilder.cuid_galaxy2;
      if (str8 == null) {
        this.cuid_galaxy2 = "";
      } else {
        this.cuid_galaxy2 = str8;
      } 
      str8 = paramBuilder.cuid_gid;
      if (str8 == null) {
        this.cuid_gid = "";
      } else {
        this.cuid_gid = str8;
      } 
      str8 = paramBuilder.oaid;
      if (str8 == null) {
        this.oaid = "";
      } else {
        this.oaid = str8;
      } 
      str8 = paramBuilder.c3_aid;
      if (str8 == null) {
        this.c3_aid = "";
      } else {
        this.c3_aid = str8;
      } 
      str8 = paramBuilder.sample_id;
      if (str8 == null) {
        this.sample_id = "";
      } else {
        this.sample_id = str8;
      } 
      Integer integer7 = paramBuilder.scr_w;
      if (integer7 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer7;
      } 
      integer7 = paramBuilder.scr_h;
      if (integer7 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer7;
      } 
      Double double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
      Integer integer6 = paramBuilder.q_type;
      if (integer6 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer6;
      } 
      integer6 = paramBuilder.is_teenager;
      if (integer6 == null) {
        this.is_teenager = DEFAULT_IS_TEENAGER;
      } else {
        this.is_teenager = integer6;
      } 
      String str7 = paramBuilder.sdk_ver;
      if (str7 == null) {
        this.sdk_ver = "";
      } else {
        this.sdk_ver = str7;
      } 
      str7 = paramBuilder.framework_ver;
      if (str7 == null) {
        this.framework_ver = "";
      } else {
        this.framework_ver = str7;
      } 
      str7 = paramBuilder.naws_game_ver;
      if (str7 == null) {
        this.naws_game_ver = "";
      } else {
        this.naws_game_ver = str7;
      } 
      str7 = paramBuilder.idfa;
      if (str7 == null) {
        this.idfa = "";
      } else {
        this.idfa = str7;
      } 
      str7 = paramBuilder.diac;
      if (str7 == null) {
        this.diac = "";
      } else {
        this.diac = str7;
      } 
      Long long_1 = paramBuilder.active_timestamp;
      if (long_1 == null) {
        this.active_timestamp = DEFAULT_ACTIVE_TIMESTAMP;
      } else {
        this.active_timestamp = long_1;
      } 
      long_1 = paramBuilder.first_install_time;
      if (long_1 == null) {
        this.first_install_time = DEFAULT_FIRST_INSTALL_TIME;
      } else {
        this.first_install_time = long_1;
      } 
      long_1 = paramBuilder.last_update_time;
      if (long_1 == null) {
        this.last_update_time = DEFAULT_LAST_UPDATE_TIME;
      } else {
        this.last_update_time = long_1;
      } 
      String str6 = paramBuilder.event_day;
      if (str6 == null) {
        this.event_day = "";
      } else {
        this.event_day = str6;
      } 
      str6 = paramBuilder.android_id;
      if (str6 == null) {
        this.android_id = "";
      } else {
        this.android_id = str6;
      } 
      Integer integer5 = paramBuilder.cmode;
      if (integer5 == null) {
        this.cmode = DEFAULT_CMODE;
      } else {
        this.cmode = integer5;
      } 
      String str5 = paramBuilder.start_scheme;
      if (str5 == null) {
        this.start_scheme = "";
      } else {
        this.start_scheme = str5;
      } 
      Integer integer4 = paramBuilder.start_type;
      if (integer4 == null) {
        this.start_type = DEFAULT_START_TYPE;
      } else {
        this.start_type = integer4;
      } 
      String str4 = paramBuilder.shoubai_cuid;
      if (str4 == null) {
        this.shoubai_cuid = "";
      } else {
        this.shoubai_cuid = str4;
      } 
      str4 = paramBuilder.mac;
      if (str4 == null) {
        this.mac = "";
      } else {
        this.mac = str4;
      } 
      str4 = paramBuilder.idfv;
      if (str4 == null) {
        this.idfv = "";
      } else {
        this.idfv = str4;
      } 
      str4 = paramBuilder.extra;
      if (str4 == null) {
        this.extra = "";
      } else {
        this.extra = str4;
      } 
      str4 = paramBuilder.user_agent;
      if (str4 == null) {
        this.user_agent = "";
      } else {
        this.user_agent = str4;
      } 
      Integer integer3 = paramBuilder.personalized_rec_switch;
      if (integer3 == null) {
        this.personalized_rec_switch = DEFAULT_PERSONALIZED_REC_SWITCH;
      } else {
        this.personalized_rec_switch = integer3;
      } 
      String str3 = paramBuilder.iemi;
      if (str3 == null) {
        this.iemi = "";
      } else {
        this.iemi = str3;
      } 
      str3 = paramBuilder.iemiwen;
      if (str3 == null) {
        this.iemiwen = "";
      } else {
        this.iemiwen = str3;
      } 
      str3 = paramBuilder.cam;
      if (str3 == null) {
        this.cam = "";
      } else {
        this.cam = str3;
      } 
      str3 = paramBuilder.afdi;
      if (str3 == null) {
        this.afdi = "";
      } else {
        this.afdi = str3;
      } 
      str3 = paramBuilder.di_diordna;
      if (str3 == null) {
        this.di_diordna = "";
      } else {
        this.di_diordna = str3;
      } 
      str3 = paramBuilder.vfdi;
      if (str3 == null) {
        this.vfdi = "";
      } else {
        this.vfdi = str3;
      } 
      str3 = paramBuilder.device_score;
      if (str3 == null) {
        this.device_score = "";
      } else {
        this.device_score = str3;
      } 
      Integer integer2 = paramBuilder.pure_mode;
      if (integer2 == null) {
        this.pure_mode = DEFAULT_PURE_MODE;
      } else {
        this.pure_mode = integer2;
      } 
      integer2 = paramBuilder.xcx_mode;
      if (integer2 == null) {
        this.xcx_mode = DEFAULT_XCX_MODE;
      } else {
        this.xcx_mode = integer2;
      } 
      String str2 = paramBuilder.ledom;
      if (str2 == null) {
        this.ledom = "";
      } else {
        this.ledom = str2;
      } 
      str2 = paramBuilder.diao;
      if (str2 == null) {
        this.diao = "";
      } else {
        this.diao = str2;
      } 
      str2 = paramBuilder.noisrev_so;
      if (str2 == null) {
        this.noisrev_so = "";
      } else {
        this.noisrev_so = str2;
      } 
      str2 = paramBuilder.dnarb;
      if (str2 == null) {
        this.dnarb = "";
      } else {
        this.dnarb = str2;
      } 
      str2 = paramBuilder.epyt_dnarb;
      if (str2 == null) {
        this.epyt_dnarb = "";
      } else {
        this.epyt_dnarb = str2;
      } 
      str2 = paramBuilder.w_rcs;
      if (str2 == null) {
        this.w_rcs = "";
      } else {
        this.w_rcs = str2;
      } 
      str2 = paramBuilder.h_rcs;
      if (str2 == null) {
        this.h_rcs = "";
      } else {
        this.h_rcs = str2;
      } 
      str2 = paramBuilder.pid_rcs;
      if (str2 == null) {
        this.pid_rcs = "";
      } else {
        this.pid_rcs = str2;
      } 
      Integer integer1 = paramBuilder.need_decrypt;
      if (integer1 == null) {
        this.need_decrypt = DEFAULT_NEED_DECRYPT;
      } else {
        this.need_decrypt = integer1;
      } 
      integer1 = paramBuilder.need_cam_decrypt;
      if (integer1 == null) {
        this.need_cam_decrypt = DEFAULT_NEED_CAM_DECRYPT;
      } else {
        this.need_cam_decrypt = integer1;
      } 
      String str1 = paramBuilder.shoubai_version;
      if (str1 == null) {
        this.shoubai_version = "";
      } else {
        this.shoubai_version = str1;
      } 
      str1 = paramBuilder.hm_acuid;
      if (str1 == null) {
        this.hm_acuid = "";
      } else {
        this.hm_acuid = str1;
      } 
      str1 = paramBuilder.hm_oid;
      if (str1 == null) {
        this.hm_oid = "";
      } else {
        this.hm_oid = str1;
      } 
      str1 = paramBuilder.hm_needmp;
      if (str1 == null) {
        this.hm_needmp = "";
      } else {
        this.hm_needmp = str1;
      } 
      str1 = paramBuilder.support_image;
      if (str1 == null) {
        this.support_image = "";
      } else {
        this.support_image = str1;
      } 
      str = paramBuilder.package_version;
      if (str == null) {
        this.package_version = "";
      } else {
        this.package_version = str;
      } 
    } else {
      this._client_type = ((Builder)str)._client_type;
      this._client_version = ((Builder)str)._client_version;
      this._client_id = ((Builder)str)._client_id;
      this.apid = ((Builder)str).apid;
      this._phone_imei = ((Builder)str)._phone_imei;
      this.from = ((Builder)str).from;
      this.cuid = ((Builder)str).cuid;
      this._timestamp = ((Builder)str)._timestamp;
      this.model = ((Builder)str).model;
      this.BDUSS = ((Builder)str).BDUSS;
      this.tbs = ((Builder)str).tbs;
      this.net_type = ((Builder)str).net_type;
      this.subapp_type = ((Builder)str).subapp_type;
      this._phone_newimei = ((Builder)str)._phone_newimei;
      this.ka = ((Builder)str).ka;
      this.m_api = ((Builder)str).m_api;
      this.m_logid = ((Builder)str).m_logid;
      this.m_cost = ((Builder)str).m_cost;
      this.m_result = ((Builder)str).m_result;
      this.m_size_u = ((Builder)str).m_size_u;
      this.m_size_d = ((Builder)str).m_size_d;
      this.smallflow = ((Builder)str).smallflow;
      this.sign = ((Builder)str).sign;
      this.pversion = ((Builder)str).pversion;
      this._os_version = ((Builder)str)._os_version;
      this.brand = ((Builder)str).brand;
      this.brand_type = ((Builder)str).brand_type;
      this.lego_lib_version = ((Builder)str).lego_lib_version;
      this.applist = ((Builder)str).applist;
      this.stoken = ((Builder)str).stoken;
      this.z_id = ((Builder)str).z_id;
      this.cuid_galaxy2 = ((Builder)str).cuid_galaxy2;
      this.cuid_gid = ((Builder)str).cuid_gid;
      this.oaid = ((Builder)str).oaid;
      this.c3_aid = ((Builder)str).c3_aid;
      this.sample_id = ((Builder)str).sample_id;
      this.scr_w = ((Builder)str).scr_w;
      this.scr_h = ((Builder)str).scr_h;
      this.scr_dip = ((Builder)str).scr_dip;
      this.q_type = ((Builder)str).q_type;
      this.is_teenager = ((Builder)str).is_teenager;
      this.sdk_ver = ((Builder)str).sdk_ver;
      this.framework_ver = ((Builder)str).framework_ver;
      this.naws_game_ver = ((Builder)str).naws_game_ver;
      this.idfa = ((Builder)str).idfa;
      this.diac = ((Builder)str).diac;
      this.active_timestamp = ((Builder)str).active_timestamp;
      this.first_install_time = ((Builder)str).first_install_time;
      this.last_update_time = ((Builder)str).last_update_time;
      this.event_day = ((Builder)str).event_day;
      this.android_id = ((Builder)str).android_id;
      this.cmode = ((Builder)str).cmode;
      this.start_scheme = ((Builder)str).start_scheme;
      this.start_type = ((Builder)str).start_type;
      this.shoubai_cuid = ((Builder)str).shoubai_cuid;
      this.mac = ((Builder)str).mac;
      this.idfv = ((Builder)str).idfv;
      this.extra = ((Builder)str).extra;
      this.user_agent = ((Builder)str).user_agent;
      this.personalized_rec_switch = ((Builder)str).personalized_rec_switch;
      this.iemi = ((Builder)str).iemi;
      this.iemiwen = ((Builder)str).iemiwen;
      this.cam = ((Builder)str).cam;
      this.afdi = ((Builder)str).afdi;
      this.di_diordna = ((Builder)str).di_diordna;
      this.vfdi = ((Builder)str).vfdi;
      this.device_score = ((Builder)str).device_score;
      this.pure_mode = ((Builder)str).pure_mode;
      this.xcx_mode = ((Builder)str).xcx_mode;
      this.ledom = ((Builder)str).ledom;
      this.diao = ((Builder)str).diao;
      this.noisrev_so = ((Builder)str).noisrev_so;
      this.dnarb = ((Builder)str).dnarb;
      this.epyt_dnarb = ((Builder)str).epyt_dnarb;
      this.w_rcs = ((Builder)str).w_rcs;
      this.h_rcs = ((Builder)str).h_rcs;
      this.pid_rcs = ((Builder)str).pid_rcs;
      this.need_decrypt = ((Builder)str).need_decrypt;
      this.need_cam_decrypt = ((Builder)str).need_cam_decrypt;
      this.shoubai_version = ((Builder)str).shoubai_version;
      this.hm_acuid = ((Builder)str).hm_acuid;
      this.hm_oid = ((Builder)str).hm_oid;
      this.hm_needmp = ((Builder)str).hm_needmp;
      this.support_image = ((Builder)str).support_image;
      this.package_version = ((Builder)str).package_version;
    } 
  }
  
  public static final class Builder extends Message.Builder<CommonReq> {
    public String BDUSS;
    
    public String _client_id;
    
    public Integer _client_type;
    
    public String _client_version;
    
    public String _os_version;
    
    public String _phone_imei;
    
    public String _phone_newimei;
    
    public Long _timestamp;
    
    public Long active_timestamp;
    
    public String afdi;
    
    public String android_id;
    
    public String apid;
    
    public String applist;
    
    public String brand;
    
    public String brand_type;
    
    public String c3_aid;
    
    public String cam;
    
    public Integer cmode;
    
    public String cuid;
    
    public String cuid_galaxy2;
    
    public String cuid_gid;
    
    public String device_score;
    
    public String di_diordna;
    
    public String diac;
    
    public String diao;
    
    public String dnarb;
    
    public String epyt_dnarb;
    
    public String event_day;
    
    public String extra;
    
    public Long first_install_time;
    
    public String framework_ver;
    
    public String from;
    
    public String h_rcs;
    
    public String hm_acuid;
    
    public String hm_needmp;
    
    public String hm_oid;
    
    public String idfa;
    
    public String idfv;
    
    public String iemi;
    
    public String iemiwen;
    
    public Integer is_teenager;
    
    public String ka;
    
    public Long last_update_time;
    
    public String ledom;
    
    public String lego_lib_version;
    
    public String m_api;
    
    public String m_cost;
    
    public String m_logid;
    
    public String m_result;
    
    public String m_size_d;
    
    public String m_size_u;
    
    public String mac;
    
    public String model;
    
    public String naws_game_ver;
    
    public Integer need_cam_decrypt;
    
    public Integer need_decrypt;
    
    public Integer net_type;
    
    public String noisrev_so;
    
    public String oaid;
    
    public String package_version;
    
    public Integer personalized_rec_switch;
    
    public String pid_rcs;
    
    public Integer pure_mode;
    
    public String pversion;
    
    public Integer q_type;
    
    public String sample_id;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public String sdk_ver;
    
    public String shoubai_cuid;
    
    public String shoubai_version;
    
    public String sign;
    
    public String smallflow;
    
    public String start_scheme;
    
    public Integer start_type;
    
    public String stoken;
    
    public String subapp_type;
    
    public String support_image;
    
    public String tbs;
    
    public String user_agent;
    
    public String vfdi;
    
    public String w_rcs;
    
    public Integer xcx_mode;
    
    public String z_id;
    
    public Builder() {}
    
    public Builder(CommonReq param1CommonReq) {
      super(param1CommonReq);
      if (param1CommonReq == null)
        return; 
      this._client_type = param1CommonReq._client_type;
      this._client_version = param1CommonReq._client_version;
      this._client_id = param1CommonReq._client_id;
      this.apid = param1CommonReq.apid;
      this._phone_imei = param1CommonReq._phone_imei;
      this.from = param1CommonReq.from;
      this.cuid = param1CommonReq.cuid;
      this._timestamp = param1CommonReq._timestamp;
      this.model = param1CommonReq.model;
      this.BDUSS = param1CommonReq.BDUSS;
      this.tbs = param1CommonReq.tbs;
      this.net_type = param1CommonReq.net_type;
      this.subapp_type = param1CommonReq.subapp_type;
      this._phone_newimei = param1CommonReq._phone_newimei;
      this.ka = param1CommonReq.ka;
      this.m_api = param1CommonReq.m_api;
      this.m_logid = param1CommonReq.m_logid;
      this.m_cost = param1CommonReq.m_cost;
      this.m_result = param1CommonReq.m_result;
      this.m_size_u = param1CommonReq.m_size_u;
      this.m_size_d = param1CommonReq.m_size_d;
      this.smallflow = param1CommonReq.smallflow;
      this.sign = param1CommonReq.sign;
      this.pversion = param1CommonReq.pversion;
      this._os_version = param1CommonReq._os_version;
      this.brand = param1CommonReq.brand;
      this.brand_type = param1CommonReq.brand_type;
      this.lego_lib_version = param1CommonReq.lego_lib_version;
      this.applist = param1CommonReq.applist;
      this.stoken = param1CommonReq.stoken;
      this.z_id = param1CommonReq.z_id;
      this.cuid_galaxy2 = param1CommonReq.cuid_galaxy2;
      this.cuid_gid = param1CommonReq.cuid_gid;
      this.oaid = param1CommonReq.oaid;
      this.c3_aid = param1CommonReq.c3_aid;
      this.sample_id = param1CommonReq.sample_id;
      this.scr_w = param1CommonReq.scr_w;
      this.scr_h = param1CommonReq.scr_h;
      this.scr_dip = param1CommonReq.scr_dip;
      this.q_type = param1CommonReq.q_type;
      this.is_teenager = param1CommonReq.is_teenager;
      this.sdk_ver = param1CommonReq.sdk_ver;
      this.framework_ver = param1CommonReq.framework_ver;
      this.naws_game_ver = param1CommonReq.naws_game_ver;
      this.idfa = param1CommonReq.idfa;
      this.diac = param1CommonReq.diac;
      this.active_timestamp = param1CommonReq.active_timestamp;
      this.first_install_time = param1CommonReq.first_install_time;
      this.last_update_time = param1CommonReq.last_update_time;
      this.event_day = param1CommonReq.event_day;
      this.android_id = param1CommonReq.android_id;
      this.cmode = param1CommonReq.cmode;
      this.start_scheme = param1CommonReq.start_scheme;
      this.start_type = param1CommonReq.start_type;
      this.shoubai_cuid = param1CommonReq.shoubai_cuid;
      this.mac = param1CommonReq.mac;
      this.idfv = param1CommonReq.idfv;
      this.extra = param1CommonReq.extra;
      this.user_agent = param1CommonReq.user_agent;
      this.personalized_rec_switch = param1CommonReq.personalized_rec_switch;
      this.iemi = param1CommonReq.iemi;
      this.iemiwen = param1CommonReq.iemiwen;
      this.cam = param1CommonReq.cam;
      this.afdi = param1CommonReq.afdi;
      this.di_diordna = param1CommonReq.di_diordna;
      this.vfdi = param1CommonReq.vfdi;
      this.device_score = param1CommonReq.device_score;
      this.pure_mode = param1CommonReq.pure_mode;
      this.xcx_mode = param1CommonReq.xcx_mode;
      this.ledom = param1CommonReq.ledom;
      this.diao = param1CommonReq.diao;
      this.noisrev_so = param1CommonReq.noisrev_so;
      this.dnarb = param1CommonReq.dnarb;
      this.epyt_dnarb = param1CommonReq.epyt_dnarb;
      this.w_rcs = param1CommonReq.w_rcs;
      this.h_rcs = param1CommonReq.h_rcs;
      this.pid_rcs = param1CommonReq.pid_rcs;
      this.need_decrypt = param1CommonReq.need_decrypt;
      this.need_cam_decrypt = param1CommonReq.need_cam_decrypt;
      this.shoubai_version = param1CommonReq.shoubai_version;
      this.hm_acuid = param1CommonReq.hm_acuid;
      this.hm_oid = param1CommonReq.hm_oid;
      this.hm_needmp = param1CommonReq.hm_needmp;
      this.support_image = param1CommonReq.support_image;
      this.package_version = param1CommonReq.package_version;
    }
    
    public CommonReq build(boolean param1Boolean) {
      return new CommonReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
