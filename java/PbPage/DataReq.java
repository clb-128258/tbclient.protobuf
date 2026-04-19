package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppPosInfo;
import tbclient.AppTransmitData;
import tbclient.CommonReq;
import tbclient.PushInfo;

public final class DataReq extends Message {
  public static final String DEFAULT_AD_BEAR_PB_BANNER = "";
  
  public static final String DEFAULT_AD_BEAR_PB_COMMENT = "";
  
  public static final String DEFAULT_AD_CONTEXT_LIST = "";
  
  public static final String DEFAULT_AD_EXTERNAL_BANNER_INFO = "";
  
  public static final String DEFAULT_AD_EXTERNAL_INFO = "";
  
  public static final String DEFAULT_AD_EXT_PARAMS = "";
  
  public static final Integer DEFAULT_AFTER_AD_THREAD_COUNT;
  
  public static final Long DEFAULT_ALADDIN_SRC_ID;
  
  public static final Integer DEFAULT_ARROUND;
  
  public static final Integer DEFAULT_BACK;
  
  public static final Integer DEFAULT_BANNER;
  
  public static final Integer DEFAULT_BIZ_TYPE;
  
  public static final Long DEFAULT_BROADCAST_ID;
  
  public static final String DEFAULT_CALL_URL = "";
  
  public static final String DEFAULT_CID = "";
  
  public static final String DEFAULT_COME_FROM = "";
  
  public static final String DEFAULT_DA_IDFA = "";
  
  public static final String DEFAULT_EQID = "";
  
  public static final String DEFAULT_FEED_NID = "";
  
  public static final Long DEFAULT_FID;
  
  public static final Integer DEFAULT_FLOOR_RN;
  
  public static final Integer DEFAULT_FLOOR_SORT_TYPE;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_FROM_FORUM_ID;
  
  public static final Integer DEFAULT_FROM_PUSH;
  
  public static final Integer DEFAULT_FROM_SMART_FRS;
  
  public static final String DEFAULT_GAME_FID = "";
  
  public static final String DEFAULT_GAME_FNAME = "";
  
  public static final String DEFAULT_GAME_ID = "";
  
  public static final Integer DEFAULT_IMMERSION_VIDEO_COMMENT_SOURCE;
  
  public static final Integer DEFAULT_ISSDK;
  
  public static final Integer DEFAULT_IS_COMM_REVERSE;
  
  public static final Integer DEFAULT_IS_EDIT_COMMENT_REQ;
  
  public static final Integer DEFAULT_IS_FOLD_COMMENT_REQ;
  
  public static final Integer DEFAULT_IS_JUMPFLOOR;
  
  public static final Integer DEFAULT_IS_NOTE;
  
  public static final String DEFAULT_JFROM = "";
  
  public static final Long DEFAULT_JID;
  
  public static final Integer DEFAULT_JUMPFLOOR_NUM;
  
  public static final Long DEFAULT_KZ;
  
  public static final Integer DEFAULT_LAST;
  
  public static final String DEFAULT_LASTIDS = "";
  
  public static final Long DEFAULT_LAST_PID;
  
  public static final String DEFAULT_LOG_PARAM = "";
  
  public static final Integer DEFAULT_LZ;
  
  public static final Integer DEFAULT_MARK;
  
  public static final Integer DEFAULT_MESSAGE_ID;
  
  public static final String DEFAULT_MOUNT_BOT_UK = "";
  
  public static final String DEFAULT_MSG_CLICK = "";
  
  public static final Integer DEFAULT_NEED_DATA_TYPE;
  
  public static final Integer DEFAULT_NEED_LOG;
  
  public static final Integer DEFAULT_NEED_REPOST_RECOMMEND_FORUM;
  
  public static final String DEFAULT_OBJ_LOCATE = "";
  
  public static final String DEFAULT_OBJ_PARAM1 = "";
  
  public static final String DEFAULT_OBJ_SOURCE = "";
  
  public static final String DEFAULT_OFFSET = "";
  
  public static final String DEFAULT_ORI_UGC_NID = "";
  
  public static final String DEFAULT_ORI_UGC_TID = "";
  
  public static final Integer DEFAULT_ORI_UGC_TYPE;
  
  public static final String DEFAULT_ORI_UGC_VID = "";
  
  public static final Integer DEFAULT_PAGE_FROM;
  
  public static final Integer DEFAULT_PB_RN;
  
  public static final String DEFAULT_PB_TEST_INFO = "";
  
  public static final Long DEFAULT_PID;
  
  public static final String DEFAULT_PLATFORM = "";
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_POSITION;
  
  public static final String DEFAULT_QUERY_WORD = "";
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Integer DEFAULT_R;
  
  public static final Integer DEFAULT_REQUEST_TIMES;
  
  public static final Integer DEFAULT_RN;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final String DEFAULT_SEARCH_QUERY = "";
  
  public static final Integer DEFAULT_SESSION_REQUEST_TIMES;
  
  public static final String DEFAULT_SHOUBAI_CUID = "";
  
  public static final Integer DEFAULT_SIMILAR_FROM;
  
  public static final Integer DEFAULT_SOURCE_TYPE;
  
  public static final String DEFAULT_ST_FROM = "";
  
  public static final String DEFAULT_ST_LINK = "";
  
  public static final Integer DEFAULT_ST_STAT;
  
  public static final Long DEFAULT_ST_TASK;
  
  public static final String DEFAULT_ST_TYPE = "";
  
  public static final Integer DEFAULT_S_MODEL;
  
  public static final Long DEFAULT_TAB_ID;
  
  public static final String DEFAULT_TAB_TYPE = "";
  
  public static final Integer DEFAULT_THREAD_TYPE;
  
  public static final Long DEFAULT_TOPIC_FID;
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final Long DEFAULT_TOP_PID;
  
  public static final String DEFAULT_UP_SCHEMA = "";
  
  public static final Integer DEFAULT_WEIPOST;
  
  public static final Integer DEFAULT_WITH_FLOOR;
  
  public static final String DEFAULT_YUELAOU_LOCATE = "";
  
  public static final String DEFAULT_YUELAOU_PARAMS = "";
  
  @ProtoField(tag = 95, type = Message.Datatype.STRING)
  public final String ad_bear_pb_banner;
  
  @ProtoField(tag = 96, type = Message.Datatype.STRING)
  public final String ad_bear_pb_comment;
  
  @ProtoField(tag = 68, type = Message.Datatype.STRING)
  public final String ad_context_list;
  
  @ProtoField(tag = 72, type = Message.Datatype.STRING)
  public final String ad_ext_params;
  
  @ProtoField(tag = 103, type = Message.Datatype.STRING)
  public final String ad_external_banner_info;
  
  @ProtoField(tag = 104, type = Message.Datatype.STRING)
  public final String ad_external_info;
  
  @ProtoField(tag = 58)
  public final AdParam ad_param;
  
  @ProtoField(tag = 67, type = Message.Datatype.INT32)
  public final Integer after_ad_thread_count;
  
  @ProtoField(tag = 101, type = Message.Datatype.INT64)
  public final Long aladdin_src_id;
  
  @ProtoField(tag = 53)
  public final AppPosInfo app_pos;
  
  @ProtoField(tag = 77)
  public final AppTransmitData app_transmit_data;
  
  @ProtoField(tag = 22, type = Message.Datatype.INT32)
  public final Integer arround;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer back;
  
  @ProtoField(tag = 21, type = Message.Datatype.INT32)
  public final Integer banner;
  
  @ProtoField(tag = 109, type = Message.Datatype.INT32)
  public final Integer biz_type;
  
  @ProtoField(tag = 73, type = Message.Datatype.INT64)
  public final Long broadcast_id;
  
  @ProtoField(tag = 60, type = Message.Datatype.STRING)
  public final String call_url;
  
  @ProtoField(tag = 90, type = Message.Datatype.STRING)
  public final String cid;
  
  @ProtoField(tag = 83, type = Message.Datatype.STRING)
  public final String come_from;
  
  @ProtoField(tag = 25)
  public final CommonReq common;
  
  @ProtoField(tag = 42, type = Message.Datatype.STRING)
  public final String da_idfa;
  
  @ProtoField(tag = 99, type = Message.Datatype.STRING)
  public final String eqid;
  
  @ProtoField(tag = 55, type = Message.Datatype.STRING)
  public final String feed_nid;
  
  @ProtoField(tag = 45, type = Message.Datatype.UINT64)
  public final Long fid;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer floor_rn;
  
  @ProtoField(tag = 74, type = Message.Datatype.INT32)
  public final Integer floor_sort_type;
  
  @ProtoField(tag = 56, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 111, type = Message.Datatype.UINT32)
  public final Integer from_forum_id;
  
  @ProtoField(tag = 71, type = Message.Datatype.INT32)
  public final Integer from_push;
  
  @ProtoField(tag = 54, type = Message.Datatype.UINT32)
  public final Integer from_smart_frs;
  
  @ProtoField(tag = 93, type = Message.Datatype.STRING)
  public final String game_fid;
  
  @ProtoField(tag = 94, type = Message.Datatype.STRING)
  public final String game_fname;
  
  @ProtoField(tag = 89, type = Message.Datatype.STRING)
  public final String game_id;
  
  @ProtoField(tag = 76, type = Message.Datatype.INT32)
  public final Integer immersion_video_comment_source;
  
  @ProtoField(tag = 33, type = Message.Datatype.INT32)
  public final Integer is_comm_reverse;
  
  @ProtoField(tag = 79, type = Message.Datatype.INT32)
  public final Integer is_edit_comment_req;
  
  @ProtoField(tag = 78, type = Message.Datatype.INT32)
  public final Integer is_fold_comment_req;
  
  @ProtoField(tag = 34, type = Message.Datatype.INT32)
  public final Integer is_jumpfloor;
  
  @ProtoField(tag = 100, type = Message.Datatype.INT32)
  public final Integer is_note;
  
  @ProtoField(tag = 31, type = Message.Datatype.INT32)
  public final Integer issdk;
  
  @ProtoField(tag = 46, type = Message.Datatype.STRING)
  public final String jfrom;
  
  @ProtoField(tag = 44, type = Message.Datatype.UINT64)
  public final Long jid;
  
  @ProtoField(tag = 35, type = Message.Datatype.INT32)
  public final Integer jumpfloor_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long kz;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer last;
  
  @ProtoField(tag = 81, type = Message.Datatype.INT64)
  public final Long last_pid;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String lastids;
  
  @ProtoField(tag = 88, type = Message.Datatype.STRING)
  public final String log_param;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer lz;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer mark;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer message_id;
  
  @ProtoField(tag = 87, type = Message.Datatype.STRING)
  public final String mount_bot_uk;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String msg_click;
  
  @ProtoField(tag = 107, type = Message.Datatype.INT32)
  public final Integer need_data_type;
  
  @ProtoField(tag = 59, type = Message.Datatype.INT32)
  public final Integer need_log;
  
  @ProtoField(tag = 57, type = Message.Datatype.INT32)
  public final Integer need_repost_recommend_forum;
  
  @ProtoField(tag = 51, type = Message.Datatype.STRING)
  public final String obj_locate;
  
  @ProtoField(tag = 52, type = Message.Datatype.STRING)
  public final String obj_param1;
  
  @ProtoField(tag = 50, type = Message.Datatype.STRING)
  public final String obj_source;
  
  @ProtoField(tag = 110, type = Message.Datatype.STRING)
  public final String offset;
  
  @ProtoField(tag = 62, type = Message.Datatype.STRING)
  public final String ori_ugc_nid;
  
  @ProtoField(tag = 63, type = Message.Datatype.STRING)
  public final String ori_ugc_tid;
  
  @ProtoField(tag = 65, type = Message.Datatype.INT32)
  public final Integer ori_ugc_type;
  
  @ProtoField(tag = 66, type = Message.Datatype.STRING)
  public final String ori_ugc_vid;
  
  @ProtoField(tag = 91, type = Message.Datatype.INT32)
  public final Integer page_from;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer pb_rn;
  
  @ProtoField(tag = 70, type = Message.Datatype.STRING)
  public final String pb_test_info;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long pid;
  
  @ProtoField(tag = 43, type = Message.Datatype.STRING)
  public final String platform;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 92, type = Message.Datatype.INT32)
  public final Integer position;
  
  @ProtoField(tag = 86)
  public final PushInfo push_info;
  
  @ProtoField(tag = 17, type = Message.Datatype.INT32)
  public final Integer q_type;
  
  @ProtoField(tag = 32, type = Message.Datatype.STRING)
  public final String query_word;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer r;
  
  @ProtoField(tag = 80, type = Message.Datatype.INT32)
  public final Integer request_times;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer rn;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer s_model;
  
  @ProtoField(tag = 16, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 84, type = Message.Datatype.STRING)
  public final String search_query;
  
  @ProtoField(tag = 108, type = Message.Datatype.INT32)
  public final Integer session_request_times;
  
  @ProtoField(tag = 61, type = Message.Datatype.STRING)
  public final String shoubai_cuid;
  
  @ProtoField(tag = 82, type = Message.Datatype.INT32)
  public final Integer similar_from;
  
  @ProtoField(tag = 75, type = Message.Datatype.INT32)
  public final Integer source_type;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String st_from;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String st_link;
  
  @ProtoField(tag = 29, type = Message.Datatype.INT32)
  public final Integer st_stat;
  
  @ProtoField(tag = 30, type = Message.Datatype.INT64)
  public final Long st_task;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String st_type;
  
  @ProtoField(tag = 98, type = Message.Datatype.UINT64)
  public final Long tab_id;
  
  @ProtoField(tag = 97, type = Message.Datatype.STRING)
  public final String tab_type;
  
  @ProtoField(tag = 20, type = Message.Datatype.INT32)
  public final Integer thread_type;
  
  @ProtoField(tag = 102, type = Message.Datatype.INT64)
  public final Long top_pid;
  
  @ProtoField(tag = 106, type = Message.Datatype.INT64)
  public final Long topic_fid;
  
  @ProtoField(tag = 105, type = Message.Datatype.INT64)
  public final Long topic_id;
  
  @ProtoField(tag = 69, type = Message.Datatype.STRING)
  public final String up_schema;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer weipost;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer with_floor;
  
  @ProtoField(tag = 47, type = Message.Datatype.STRING)
  public final String yuelaou_locate;
  
  @ProtoField(tag = 48, type = Message.Datatype.STRING)
  public final String yuelaou_params;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PB_RN = integer;
    DEFAULT_MARK = integer;
    DEFAULT_BACK = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_KZ = long_;
    DEFAULT_LZ = integer;
    DEFAULT_R = integer;
    DEFAULT_PID = long_;
    DEFAULT_WITH_FLOOR = integer;
    DEFAULT_FLOOR_RN = integer;
    DEFAULT_WEIPOST = integer;
    DEFAULT_MESSAGE_ID = integer;
    DEFAULT_S_MODEL = integer;
    DEFAULT_RN = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_Q_TYPE = integer;
    DEFAULT_PN = integer;
    DEFAULT_THREAD_TYPE = integer;
    DEFAULT_BANNER = integer;
    DEFAULT_ARROUND = integer;
    DEFAULT_LAST = integer;
    DEFAULT_ST_STAT = integer;
    DEFAULT_ST_TASK = long_;
    DEFAULT_ISSDK = integer;
    DEFAULT_IS_COMM_REVERSE = integer;
    DEFAULT_IS_JUMPFLOOR = integer;
    DEFAULT_JUMPFLOOR_NUM = integer;
    DEFAULT_JID = long_;
    DEFAULT_FID = long_;
    DEFAULT_FROM_SMART_FRS = integer;
    DEFAULT_FORUM_ID = long_;
    DEFAULT_NEED_REPOST_RECOMMEND_FORUM = integer;
    DEFAULT_NEED_LOG = integer;
    DEFAULT_ORI_UGC_TYPE = integer;
    DEFAULT_AFTER_AD_THREAD_COUNT = integer;
    DEFAULT_FROM_PUSH = integer;
    DEFAULT_BROADCAST_ID = long_;
    DEFAULT_FLOOR_SORT_TYPE = integer;
    DEFAULT_SOURCE_TYPE = integer;
    DEFAULT_IMMERSION_VIDEO_COMMENT_SOURCE = integer;
    DEFAULT_IS_FOLD_COMMENT_REQ = integer;
    DEFAULT_IS_EDIT_COMMENT_REQ = integer;
    DEFAULT_REQUEST_TIMES = integer;
    DEFAULT_LAST_PID = long_;
    DEFAULT_SIMILAR_FROM = integer;
    DEFAULT_PAGE_FROM = integer;
    DEFAULT_POSITION = integer;
    DEFAULT_TAB_ID = long_;
    DEFAULT_IS_NOTE = integer;
    DEFAULT_ALADDIN_SRC_ID = long_;
    DEFAULT_TOP_PID = long_;
    DEFAULT_TOPIC_ID = long_;
    DEFAULT_TOPIC_FID = long_;
    DEFAULT_NEED_DATA_TYPE = integer;
    DEFAULT_SESSION_REQUEST_TIMES = integer;
    DEFAULT_BIZ_TYPE = integer;
    DEFAULT_FROM_FORUM_ID = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer18 = paramBuilder.pb_rn;
      if (integer18 == null) {
        this.pb_rn = DEFAULT_PB_RN;
      } else {
        this.pb_rn = integer18;
      } 
      integer18 = paramBuilder.mark;
      if (integer18 == null) {
        this.mark = DEFAULT_MARK;
      } else {
        this.mark = integer18;
      } 
      integer18 = paramBuilder.back;
      if (integer18 == null) {
        this.back = DEFAULT_BACK;
      } else {
        this.back = integer18;
      } 
      Long long_10 = paramBuilder.kz;
      if (long_10 == null) {
        this.kz = DEFAULT_KZ;
      } else {
        this.kz = long_10;
      } 
      Integer integer17 = paramBuilder.lz;
      if (integer17 == null) {
        this.lz = DEFAULT_LZ;
      } else {
        this.lz = integer17;
      } 
      integer17 = paramBuilder.r;
      if (integer17 == null) {
        this.r = DEFAULT_R;
      } else {
        this.r = integer17;
      } 
      Long long_9 = paramBuilder.pid;
      if (long_9 == null) {
        this.pid = DEFAULT_PID;
      } else {
        this.pid = long_9;
      } 
      Integer integer16 = paramBuilder.with_floor;
      if (integer16 == null) {
        this.with_floor = DEFAULT_WITH_FLOOR;
      } else {
        this.with_floor = integer16;
      } 
      integer16 = paramBuilder.floor_rn;
      if (integer16 == null) {
        this.floor_rn = DEFAULT_FLOOR_RN;
      } else {
        this.floor_rn = integer16;
      } 
      integer16 = paramBuilder.weipost;
      if (integer16 == null) {
        this.weipost = DEFAULT_WEIPOST;
      } else {
        this.weipost = integer16;
      } 
      integer16 = paramBuilder.message_id;
      if (integer16 == null) {
        this.message_id = DEFAULT_MESSAGE_ID;
      } else {
        this.message_id = integer16;
      } 
      integer16 = paramBuilder.s_model;
      if (integer16 == null) {
        this.s_model = DEFAULT_S_MODEL;
      } else {
        this.s_model = integer16;
      } 
      integer16 = paramBuilder.rn;
      if (integer16 == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer16;
      } 
      integer16 = paramBuilder.scr_w;
      if (integer16 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer16;
      } 
      integer16 = paramBuilder.scr_h;
      if (integer16 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer16;
      } 
      Double double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
      Integer integer15 = paramBuilder.q_type;
      if (integer15 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer15;
      } 
      integer15 = paramBuilder.pn;
      if (integer15 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer15;
      } 
      String str15 = paramBuilder.st_type;
      if (str15 == null) {
        this.st_type = "";
      } else {
        this.st_type = str15;
      } 
      Integer integer14 = paramBuilder.thread_type;
      if (integer14 == null) {
        this.thread_type = DEFAULT_THREAD_TYPE;
      } else {
        this.thread_type = integer14;
      } 
      integer14 = paramBuilder.banner;
      if (integer14 == null) {
        this.banner = DEFAULT_BANNER;
      } else {
        this.banner = integer14;
      } 
      integer14 = paramBuilder.arround;
      if (integer14 == null) {
        this.arround = DEFAULT_ARROUND;
      } else {
        this.arround = integer14;
      } 
      integer14 = paramBuilder.last;
      if (integer14 == null) {
        this.last = DEFAULT_LAST;
      } else {
        this.last = integer14;
      } 
      String str14 = paramBuilder.msg_click;
      if (str14 == null) {
        this.msg_click = "";
      } else {
        this.msg_click = str14;
      } 
      this.common = paramBuilder.common;
      str14 = paramBuilder.lastids;
      if (str14 == null) {
        this.lastids = "";
      } else {
        this.lastids = str14;
      } 
      str14 = paramBuilder.st_from;
      if (str14 == null) {
        this.st_from = "";
      } else {
        this.st_from = str14;
      } 
      str14 = paramBuilder.st_link;
      if (str14 == null) {
        this.st_link = "";
      } else {
        this.st_link = str14;
      } 
      Integer integer13 = paramBuilder.st_stat;
      if (integer13 == null) {
        this.st_stat = DEFAULT_ST_STAT;
      } else {
        this.st_stat = integer13;
      } 
      Long long_8 = paramBuilder.st_task;
      if (long_8 == null) {
        this.st_task = DEFAULT_ST_TASK;
      } else {
        this.st_task = long_8;
      } 
      Integer integer12 = paramBuilder.issdk;
      if (integer12 == null) {
        this.issdk = DEFAULT_ISSDK;
      } else {
        this.issdk = integer12;
      } 
      String str13 = paramBuilder.query_word;
      if (str13 == null) {
        this.query_word = "";
      } else {
        this.query_word = str13;
      } 
      Integer integer11 = paramBuilder.is_comm_reverse;
      if (integer11 == null) {
        this.is_comm_reverse = DEFAULT_IS_COMM_REVERSE;
      } else {
        this.is_comm_reverse = integer11;
      } 
      integer11 = paramBuilder.is_jumpfloor;
      if (integer11 == null) {
        this.is_jumpfloor = DEFAULT_IS_JUMPFLOOR;
      } else {
        this.is_jumpfloor = integer11;
      } 
      integer11 = paramBuilder.jumpfloor_num;
      if (integer11 == null) {
        this.jumpfloor_num = DEFAULT_JUMPFLOOR_NUM;
      } else {
        this.jumpfloor_num = integer11;
      } 
      String str12 = paramBuilder.da_idfa;
      if (str12 == null) {
        this.da_idfa = "";
      } else {
        this.da_idfa = str12;
      } 
      str12 = paramBuilder.platform;
      if (str12 == null) {
        this.platform = "";
      } else {
        this.platform = str12;
      } 
      Long long_7 = paramBuilder.jid;
      if (long_7 == null) {
        this.jid = DEFAULT_JID;
      } else {
        this.jid = long_7;
      } 
      long_7 = paramBuilder.fid;
      if (long_7 == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_7;
      } 
      String str11 = paramBuilder.jfrom;
      if (str11 == null) {
        this.jfrom = "";
      } else {
        this.jfrom = str11;
      } 
      str11 = paramBuilder.yuelaou_locate;
      if (str11 == null) {
        this.yuelaou_locate = "";
      } else {
        this.yuelaou_locate = str11;
      } 
      str11 = paramBuilder.yuelaou_params;
      if (str11 == null) {
        this.yuelaou_params = "";
      } else {
        this.yuelaou_params = str11;
      } 
      str11 = paramBuilder.obj_source;
      if (str11 == null) {
        this.obj_source = "";
      } else {
        this.obj_source = str11;
      } 
      str11 = paramBuilder.obj_locate;
      if (str11 == null) {
        this.obj_locate = "";
      } else {
        this.obj_locate = str11;
      } 
      str11 = paramBuilder.obj_param1;
      if (str11 == null) {
        this.obj_param1 = "";
      } else {
        this.obj_param1 = str11;
      } 
      this.app_pos = paramBuilder.app_pos;
      Integer integer10 = paramBuilder.from_smart_frs;
      if (integer10 == null) {
        this.from_smart_frs = DEFAULT_FROM_SMART_FRS;
      } else {
        this.from_smart_frs = integer10;
      } 
      String str10 = paramBuilder.feed_nid;
      if (str10 == null) {
        this.feed_nid = "";
      } else {
        this.feed_nid = str10;
      } 
      Long long_6 = paramBuilder.forum_id;
      if (long_6 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_6;
      } 
      Integer integer9 = paramBuilder.need_repost_recommend_forum;
      if (integer9 == null) {
        this.need_repost_recommend_forum = DEFAULT_NEED_REPOST_RECOMMEND_FORUM;
      } else {
        this.need_repost_recommend_forum = integer9;
      } 
      this.ad_param = paramBuilder.ad_param;
      integer9 = paramBuilder.need_log;
      if (integer9 == null) {
        this.need_log = DEFAULT_NEED_LOG;
      } else {
        this.need_log = integer9;
      } 
      String str9 = paramBuilder.call_url;
      if (str9 == null) {
        this.call_url = "";
      } else {
        this.call_url = str9;
      } 
      str9 = paramBuilder.shoubai_cuid;
      if (str9 == null) {
        this.shoubai_cuid = "";
      } else {
        this.shoubai_cuid = str9;
      } 
      str9 = paramBuilder.ori_ugc_nid;
      if (str9 == null) {
        this.ori_ugc_nid = "";
      } else {
        this.ori_ugc_nid = str9;
      } 
      str9 = paramBuilder.ori_ugc_tid;
      if (str9 == null) {
        this.ori_ugc_tid = "";
      } else {
        this.ori_ugc_tid = str9;
      } 
      Integer integer8 = paramBuilder.ori_ugc_type;
      if (integer8 == null) {
        this.ori_ugc_type = DEFAULT_ORI_UGC_TYPE;
      } else {
        this.ori_ugc_type = integer8;
      } 
      String str8 = paramBuilder.ori_ugc_vid;
      if (str8 == null) {
        this.ori_ugc_vid = "";
      } else {
        this.ori_ugc_vid = str8;
      } 
      Integer integer7 = paramBuilder.after_ad_thread_count;
      if (integer7 == null) {
        this.after_ad_thread_count = DEFAULT_AFTER_AD_THREAD_COUNT;
      } else {
        this.after_ad_thread_count = integer7;
      } 
      String str7 = paramBuilder.ad_context_list;
      if (str7 == null) {
        this.ad_context_list = "";
      } else {
        this.ad_context_list = str7;
      } 
      str7 = paramBuilder.up_schema;
      if (str7 == null) {
        this.up_schema = "";
      } else {
        this.up_schema = str7;
      } 
      str7 = paramBuilder.pb_test_info;
      if (str7 == null) {
        this.pb_test_info = "";
      } else {
        this.pb_test_info = str7;
      } 
      Integer integer6 = paramBuilder.from_push;
      if (integer6 == null) {
        this.from_push = DEFAULT_FROM_PUSH;
      } else {
        this.from_push = integer6;
      } 
      String str6 = paramBuilder.ad_ext_params;
      if (str6 == null) {
        this.ad_ext_params = "";
      } else {
        this.ad_ext_params = str6;
      } 
      Long long_5 = paramBuilder.broadcast_id;
      if (long_5 == null) {
        this.broadcast_id = DEFAULT_BROADCAST_ID;
      } else {
        this.broadcast_id = long_5;
      } 
      Integer integer5 = paramBuilder.floor_sort_type;
      if (integer5 == null) {
        this.floor_sort_type = DEFAULT_FLOOR_SORT_TYPE;
      } else {
        this.floor_sort_type = integer5;
      } 
      integer5 = paramBuilder.source_type;
      if (integer5 == null) {
        this.source_type = DEFAULT_SOURCE_TYPE;
      } else {
        this.source_type = integer5;
      } 
      integer5 = paramBuilder.immersion_video_comment_source;
      if (integer5 == null) {
        this.immersion_video_comment_source = DEFAULT_IMMERSION_VIDEO_COMMENT_SOURCE;
      } else {
        this.immersion_video_comment_source = integer5;
      } 
      this.app_transmit_data = paramBuilder.app_transmit_data;
      integer5 = paramBuilder.is_fold_comment_req;
      if (integer5 == null) {
        this.is_fold_comment_req = DEFAULT_IS_FOLD_COMMENT_REQ;
      } else {
        this.is_fold_comment_req = integer5;
      } 
      integer5 = paramBuilder.is_edit_comment_req;
      if (integer5 == null) {
        this.is_edit_comment_req = DEFAULT_IS_EDIT_COMMENT_REQ;
      } else {
        this.is_edit_comment_req = integer5;
      } 
      integer5 = paramBuilder.request_times;
      if (integer5 == null) {
        this.request_times = DEFAULT_REQUEST_TIMES;
      } else {
        this.request_times = integer5;
      } 
      Long long_4 = paramBuilder.last_pid;
      if (long_4 == null) {
        this.last_pid = DEFAULT_LAST_PID;
      } else {
        this.last_pid = long_4;
      } 
      Integer integer4 = paramBuilder.similar_from;
      if (integer4 == null) {
        this.similar_from = DEFAULT_SIMILAR_FROM;
      } else {
        this.similar_from = integer4;
      } 
      String str5 = paramBuilder.come_from;
      if (str5 == null) {
        this.come_from = "";
      } else {
        this.come_from = str5;
      } 
      str5 = paramBuilder.search_query;
      if (str5 == null) {
        this.search_query = "";
      } else {
        this.search_query = str5;
      } 
      this.push_info = paramBuilder.push_info;
      str5 = paramBuilder.mount_bot_uk;
      if (str5 == null) {
        this.mount_bot_uk = "";
      } else {
        this.mount_bot_uk = str5;
      } 
      str5 = paramBuilder.log_param;
      if (str5 == null) {
        this.log_param = "";
      } else {
        this.log_param = str5;
      } 
      str5 = paramBuilder.game_id;
      if (str5 == null) {
        this.game_id = "";
      } else {
        this.game_id = str5;
      } 
      str5 = paramBuilder.cid;
      if (str5 == null) {
        this.cid = "";
      } else {
        this.cid = str5;
      } 
      Integer integer3 = paramBuilder.page_from;
      if (integer3 == null) {
        this.page_from = DEFAULT_PAGE_FROM;
      } else {
        this.page_from = integer3;
      } 
      integer3 = paramBuilder.position;
      if (integer3 == null) {
        this.position = DEFAULT_POSITION;
      } else {
        this.position = integer3;
      } 
      String str4 = paramBuilder.game_fid;
      if (str4 == null) {
        this.game_fid = "";
      } else {
        this.game_fid = str4;
      } 
      str4 = paramBuilder.game_fname;
      if (str4 == null) {
        this.game_fname = "";
      } else {
        this.game_fname = str4;
      } 
      str4 = paramBuilder.ad_bear_pb_banner;
      if (str4 == null) {
        this.ad_bear_pb_banner = "";
      } else {
        this.ad_bear_pb_banner = str4;
      } 
      str4 = paramBuilder.ad_bear_pb_comment;
      if (str4 == null) {
        this.ad_bear_pb_comment = "";
      } else {
        this.ad_bear_pb_comment = str4;
      } 
      str4 = paramBuilder.tab_type;
      if (str4 == null) {
        this.tab_type = "";
      } else {
        this.tab_type = str4;
      } 
      Long long_3 = paramBuilder.tab_id;
      if (long_3 == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = long_3;
      } 
      String str3 = paramBuilder.eqid;
      if (str3 == null) {
        this.eqid = "";
      } else {
        this.eqid = str3;
      } 
      Integer integer2 = paramBuilder.is_note;
      if (integer2 == null) {
        this.is_note = DEFAULT_IS_NOTE;
      } else {
        this.is_note = integer2;
      } 
      Long long_2 = paramBuilder.aladdin_src_id;
      if (long_2 == null) {
        this.aladdin_src_id = DEFAULT_ALADDIN_SRC_ID;
      } else {
        this.aladdin_src_id = long_2;
      } 
      long_2 = paramBuilder.top_pid;
      if (long_2 == null) {
        this.top_pid = DEFAULT_TOP_PID;
      } else {
        this.top_pid = long_2;
      } 
      String str2 = paramBuilder.ad_external_banner_info;
      if (str2 == null) {
        this.ad_external_banner_info = "";
      } else {
        this.ad_external_banner_info = str2;
      } 
      str2 = paramBuilder.ad_external_info;
      if (str2 == null) {
        this.ad_external_info = "";
      } else {
        this.ad_external_info = str2;
      } 
      Long long_1 = paramBuilder.topic_id;
      if (long_1 == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_1;
      } 
      long_1 = paramBuilder.topic_fid;
      if (long_1 == null) {
        this.topic_fid = DEFAULT_TOPIC_FID;
      } else {
        this.topic_fid = long_1;
      } 
      Integer integer1 = paramBuilder.need_data_type;
      if (integer1 == null) {
        this.need_data_type = DEFAULT_NEED_DATA_TYPE;
      } else {
        this.need_data_type = integer1;
      } 
      integer1 = paramBuilder.session_request_times;
      if (integer1 == null) {
        this.session_request_times = DEFAULT_SESSION_REQUEST_TIMES;
      } else {
        this.session_request_times = integer1;
      } 
      integer1 = paramBuilder.biz_type;
      if (integer1 == null) {
        this.biz_type = DEFAULT_BIZ_TYPE;
      } else {
        this.biz_type = integer1;
      } 
      String str1 = paramBuilder.offset;
      if (str1 == null) {
        this.offset = "";
      } else {
        this.offset = str1;
      } 
      integer = paramBuilder.from_forum_id;
      if (integer == null) {
        this.from_forum_id = DEFAULT_FROM_FORUM_ID;
      } else {
        this.from_forum_id = integer;
      } 
    } else {
      this.pb_rn = ((Builder)integer).pb_rn;
      this.mark = ((Builder)integer).mark;
      this.back = ((Builder)integer).back;
      this.kz = ((Builder)integer).kz;
      this.lz = ((Builder)integer).lz;
      this.r = ((Builder)integer).r;
      this.pid = ((Builder)integer).pid;
      this.with_floor = ((Builder)integer).with_floor;
      this.floor_rn = ((Builder)integer).floor_rn;
      this.weipost = ((Builder)integer).weipost;
      this.message_id = ((Builder)integer).message_id;
      this.s_model = ((Builder)integer).s_model;
      this.rn = ((Builder)integer).rn;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.scr_dip = ((Builder)integer).scr_dip;
      this.q_type = ((Builder)integer).q_type;
      this.pn = ((Builder)integer).pn;
      this.st_type = ((Builder)integer).st_type;
      this.thread_type = ((Builder)integer).thread_type;
      this.banner = ((Builder)integer).banner;
      this.arround = ((Builder)integer).arround;
      this.last = ((Builder)integer).last;
      this.msg_click = ((Builder)integer).msg_click;
      this.common = ((Builder)integer).common;
      this.lastids = ((Builder)integer).lastids;
      this.st_from = ((Builder)integer).st_from;
      this.st_link = ((Builder)integer).st_link;
      this.st_stat = ((Builder)integer).st_stat;
      this.st_task = ((Builder)integer).st_task;
      this.issdk = ((Builder)integer).issdk;
      this.query_word = ((Builder)integer).query_word;
      this.is_comm_reverse = ((Builder)integer).is_comm_reverse;
      this.is_jumpfloor = ((Builder)integer).is_jumpfloor;
      this.jumpfloor_num = ((Builder)integer).jumpfloor_num;
      this.da_idfa = ((Builder)integer).da_idfa;
      this.platform = ((Builder)integer).platform;
      this.jid = ((Builder)integer).jid;
      this.fid = ((Builder)integer).fid;
      this.jfrom = ((Builder)integer).jfrom;
      this.yuelaou_locate = ((Builder)integer).yuelaou_locate;
      this.yuelaou_params = ((Builder)integer).yuelaou_params;
      this.obj_source = ((Builder)integer).obj_source;
      this.obj_locate = ((Builder)integer).obj_locate;
      this.obj_param1 = ((Builder)integer).obj_param1;
      this.app_pos = ((Builder)integer).app_pos;
      this.from_smart_frs = ((Builder)integer).from_smart_frs;
      this.feed_nid = ((Builder)integer).feed_nid;
      this.forum_id = ((Builder)integer).forum_id;
      this.need_repost_recommend_forum = ((Builder)integer).need_repost_recommend_forum;
      this.ad_param = ((Builder)integer).ad_param;
      this.need_log = ((Builder)integer).need_log;
      this.call_url = ((Builder)integer).call_url;
      this.shoubai_cuid = ((Builder)integer).shoubai_cuid;
      this.ori_ugc_nid = ((Builder)integer).ori_ugc_nid;
      this.ori_ugc_tid = ((Builder)integer).ori_ugc_tid;
      this.ori_ugc_type = ((Builder)integer).ori_ugc_type;
      this.ori_ugc_vid = ((Builder)integer).ori_ugc_vid;
      this.after_ad_thread_count = ((Builder)integer).after_ad_thread_count;
      this.ad_context_list = ((Builder)integer).ad_context_list;
      this.up_schema = ((Builder)integer).up_schema;
      this.pb_test_info = ((Builder)integer).pb_test_info;
      this.from_push = ((Builder)integer).from_push;
      this.ad_ext_params = ((Builder)integer).ad_ext_params;
      this.broadcast_id = ((Builder)integer).broadcast_id;
      this.floor_sort_type = ((Builder)integer).floor_sort_type;
      this.source_type = ((Builder)integer).source_type;
      this.immersion_video_comment_source = ((Builder)integer).immersion_video_comment_source;
      this.app_transmit_data = ((Builder)integer).app_transmit_data;
      this.is_fold_comment_req = ((Builder)integer).is_fold_comment_req;
      this.is_edit_comment_req = ((Builder)integer).is_edit_comment_req;
      this.request_times = ((Builder)integer).request_times;
      this.last_pid = ((Builder)integer).last_pid;
      this.similar_from = ((Builder)integer).similar_from;
      this.come_from = ((Builder)integer).come_from;
      this.search_query = ((Builder)integer).search_query;
      this.push_info = ((Builder)integer).push_info;
      this.mount_bot_uk = ((Builder)integer).mount_bot_uk;
      this.log_param = ((Builder)integer).log_param;
      this.game_id = ((Builder)integer).game_id;
      this.cid = ((Builder)integer).cid;
      this.page_from = ((Builder)integer).page_from;
      this.position = ((Builder)integer).position;
      this.game_fid = ((Builder)integer).game_fid;
      this.game_fname = ((Builder)integer).game_fname;
      this.ad_bear_pb_banner = ((Builder)integer).ad_bear_pb_banner;
      this.ad_bear_pb_comment = ((Builder)integer).ad_bear_pb_comment;
      this.tab_type = ((Builder)integer).tab_type;
      this.tab_id = ((Builder)integer).tab_id;
      this.eqid = ((Builder)integer).eqid;
      this.is_note = ((Builder)integer).is_note;
      this.aladdin_src_id = ((Builder)integer).aladdin_src_id;
      this.top_pid = ((Builder)integer).top_pid;
      this.ad_external_banner_info = ((Builder)integer).ad_external_banner_info;
      this.ad_external_info = ((Builder)integer).ad_external_info;
      this.topic_id = ((Builder)integer).topic_id;
      this.topic_fid = ((Builder)integer).topic_fid;
      this.need_data_type = ((Builder)integer).need_data_type;
      this.session_request_times = ((Builder)integer).session_request_times;
      this.biz_type = ((Builder)integer).biz_type;
      this.offset = ((Builder)integer).offset;
      this.from_forum_id = ((Builder)integer).from_forum_id;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public String ad_bear_pb_banner;
    
    public String ad_bear_pb_comment;
    
    public String ad_context_list;
    
    public String ad_ext_params;
    
    public String ad_external_banner_info;
    
    public String ad_external_info;
    
    public AdParam ad_param;
    
    public Integer after_ad_thread_count;
    
    public Long aladdin_src_id;
    
    public AppPosInfo app_pos;
    
    public AppTransmitData app_transmit_data;
    
    public Integer arround;
    
    public Integer back;
    
    public Integer banner;
    
    public Integer biz_type;
    
    public Long broadcast_id;
    
    public String call_url;
    
    public String cid;
    
    public String come_from;
    
    public CommonReq common;
    
    public String da_idfa;
    
    public String eqid;
    
    public String feed_nid;
    
    public Long fid;
    
    public Integer floor_rn;
    
    public Integer floor_sort_type;
    
    public Long forum_id;
    
    public Integer from_forum_id;
    
    public Integer from_push;
    
    public Integer from_smart_frs;
    
    public String game_fid;
    
    public String game_fname;
    
    public String game_id;
    
    public Integer immersion_video_comment_source;
    
    public Integer is_comm_reverse;
    
    public Integer is_edit_comment_req;
    
    public Integer is_fold_comment_req;
    
    public Integer is_jumpfloor;
    
    public Integer is_note;
    
    public Integer issdk;
    
    public String jfrom;
    
    public Long jid;
    
    public Integer jumpfloor_num;
    
    public Long kz;
    
    public Integer last;
    
    public Long last_pid;
    
    public String lastids;
    
    public String log_param;
    
    public Integer lz;
    
    public Integer mark;
    
    public Integer message_id;
    
    public String mount_bot_uk;
    
    public String msg_click;
    
    public Integer need_data_type;
    
    public Integer need_log;
    
    public Integer need_repost_recommend_forum;
    
    public String obj_locate;
    
    public String obj_param1;
    
    public String obj_source;
    
    public String offset;
    
    public String ori_ugc_nid;
    
    public String ori_ugc_tid;
    
    public Integer ori_ugc_type;
    
    public String ori_ugc_vid;
    
    public Integer page_from;
    
    public Integer pb_rn;
    
    public String pb_test_info;
    
    public Long pid;
    
    public String platform;
    
    public Integer pn;
    
    public Integer position;
    
    public PushInfo push_info;
    
    public Integer q_type;
    
    public String query_word;
    
    public Integer r;
    
    public Integer request_times;
    
    public Integer rn;
    
    public Integer s_model;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public String search_query;
    
    public Integer session_request_times;
    
    public String shoubai_cuid;
    
    public Integer similar_from;
    
    public Integer source_type;
    
    public String st_from;
    
    public String st_link;
    
    public Integer st_stat;
    
    public Long st_task;
    
    public String st_type;
    
    public Long tab_id;
    
    public String tab_type;
    
    public Integer thread_type;
    
    public Long top_pid;
    
    public Long topic_fid;
    
    public Long topic_id;
    
    public String up_schema;
    
    public Integer weipost;
    
    public Integer with_floor;
    
    public String yuelaou_locate;
    
    public String yuelaou_params;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.pb_rn = param1DataReq.pb_rn;
      this.mark = param1DataReq.mark;
      this.back = param1DataReq.back;
      this.kz = param1DataReq.kz;
      this.lz = param1DataReq.lz;
      this.r = param1DataReq.r;
      this.pid = param1DataReq.pid;
      this.with_floor = param1DataReq.with_floor;
      this.floor_rn = param1DataReq.floor_rn;
      this.weipost = param1DataReq.weipost;
      this.message_id = param1DataReq.message_id;
      this.s_model = param1DataReq.s_model;
      this.rn = param1DataReq.rn;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.q_type = param1DataReq.q_type;
      this.pn = param1DataReq.pn;
      this.st_type = param1DataReq.st_type;
      this.thread_type = param1DataReq.thread_type;
      this.banner = param1DataReq.banner;
      this.arround = param1DataReq.arround;
      this.last = param1DataReq.last;
      this.msg_click = param1DataReq.msg_click;
      this.common = param1DataReq.common;
      this.lastids = param1DataReq.lastids;
      this.st_from = param1DataReq.st_from;
      this.st_link = param1DataReq.st_link;
      this.st_stat = param1DataReq.st_stat;
      this.st_task = param1DataReq.st_task;
      this.issdk = param1DataReq.issdk;
      this.query_word = param1DataReq.query_word;
      this.is_comm_reverse = param1DataReq.is_comm_reverse;
      this.is_jumpfloor = param1DataReq.is_jumpfloor;
      this.jumpfloor_num = param1DataReq.jumpfloor_num;
      this.da_idfa = param1DataReq.da_idfa;
      this.platform = param1DataReq.platform;
      this.jid = param1DataReq.jid;
      this.fid = param1DataReq.fid;
      this.jfrom = param1DataReq.jfrom;
      this.yuelaou_locate = param1DataReq.yuelaou_locate;
      this.yuelaou_params = param1DataReq.yuelaou_params;
      this.obj_source = param1DataReq.obj_source;
      this.obj_locate = param1DataReq.obj_locate;
      this.obj_param1 = param1DataReq.obj_param1;
      this.app_pos = param1DataReq.app_pos;
      this.from_smart_frs = param1DataReq.from_smart_frs;
      this.feed_nid = param1DataReq.feed_nid;
      this.forum_id = param1DataReq.forum_id;
      this.need_repost_recommend_forum = param1DataReq.need_repost_recommend_forum;
      this.ad_param = param1DataReq.ad_param;
      this.need_log = param1DataReq.need_log;
      this.call_url = param1DataReq.call_url;
      this.shoubai_cuid = param1DataReq.shoubai_cuid;
      this.ori_ugc_nid = param1DataReq.ori_ugc_nid;
      this.ori_ugc_tid = param1DataReq.ori_ugc_tid;
      this.ori_ugc_type = param1DataReq.ori_ugc_type;
      this.ori_ugc_vid = param1DataReq.ori_ugc_vid;
      this.after_ad_thread_count = param1DataReq.after_ad_thread_count;
      this.ad_context_list = param1DataReq.ad_context_list;
      this.up_schema = param1DataReq.up_schema;
      this.pb_test_info = param1DataReq.pb_test_info;
      this.from_push = param1DataReq.from_push;
      this.ad_ext_params = param1DataReq.ad_ext_params;
      this.broadcast_id = param1DataReq.broadcast_id;
      this.floor_sort_type = param1DataReq.floor_sort_type;
      this.source_type = param1DataReq.source_type;
      this.immersion_video_comment_source = param1DataReq.immersion_video_comment_source;
      this.app_transmit_data = param1DataReq.app_transmit_data;
      this.is_fold_comment_req = param1DataReq.is_fold_comment_req;
      this.is_edit_comment_req = param1DataReq.is_edit_comment_req;
      this.request_times = param1DataReq.request_times;
      this.last_pid = param1DataReq.last_pid;
      this.similar_from = param1DataReq.similar_from;
      this.come_from = param1DataReq.come_from;
      this.search_query = param1DataReq.search_query;
      this.push_info = param1DataReq.push_info;
      this.mount_bot_uk = param1DataReq.mount_bot_uk;
      this.log_param = param1DataReq.log_param;
      this.game_id = param1DataReq.game_id;
      this.cid = param1DataReq.cid;
      this.page_from = param1DataReq.page_from;
      this.position = param1DataReq.position;
      this.game_fid = param1DataReq.game_fid;
      this.game_fname = param1DataReq.game_fname;
      this.ad_bear_pb_banner = param1DataReq.ad_bear_pb_banner;
      this.ad_bear_pb_comment = param1DataReq.ad_bear_pb_comment;
      this.tab_type = param1DataReq.tab_type;
      this.tab_id = param1DataReq.tab_id;
      this.eqid = param1DataReq.eqid;
      this.is_note = param1DataReq.is_note;
      this.aladdin_src_id = param1DataReq.aladdin_src_id;
      this.top_pid = param1DataReq.top_pid;
      this.ad_external_banner_info = param1DataReq.ad_external_banner_info;
      this.ad_external_info = param1DataReq.ad_external_info;
      this.topic_id = param1DataReq.topic_id;
      this.topic_fid = param1DataReq.topic_fid;
      this.need_data_type = param1DataReq.need_data_type;
      this.session_request_times = param1DataReq.session_request_times;
      this.biz_type = param1DataReq.biz_type;
      this.offset = param1DataReq.offset;
      this.from_forum_id = param1DataReq.from_forum_id;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
