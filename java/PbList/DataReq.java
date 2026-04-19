package tbclient.PbList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
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
  
  public static final Integer DEFAULT_BACK;
  
  public static final Long DEFAULT_BROADCAST_ID;
  
  public static final String DEFAULT_CID = "";
  
  public static final String DEFAULT_DA_IDFA = "";
  
  public static final String DEFAULT_FR = "";
  
  public static final Integer DEFAULT_FROM_FORUM_ID;
  
  public static final String DEFAULT_GAME_FID = "";
  
  public static final String DEFAULT_GAME_FNAME = "";
  
  public static final String DEFAULT_GAME_ID = "";
  
  public static final Long DEFAULT_KZ;
  
  public static final Long DEFAULT_LAST_PID;
  
  public static final String DEFAULT_LOG_PARAMS = "";
  
  public static final Integer DEFAULT_LZ;
  
  public static final Integer DEFAULT_MARK_TYPE;
  
  public static final String DEFAULT_MOUNT_BOT_UK = "";
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_POSITION;
  
  public static final String DEFAULT_QUERY_WORD = "";
  
  public static final Integer DEFAULT_R;
  
  public static final Integer DEFAULT_REQUEST_TIMES;
  
  public static final String DEFAULT_SEARCH_QUERY = "";
  
  public static final Integer DEFAULT_SESSION_REQUEST_TIMES;
  
  public static final String DEFAULT_SHOUBAI_CUID = "";
  
  public static final String DEFAULT_ST_TYPE = "";
  
  public static final Long DEFAULT_TAB_ID;
  
  public static final String DEFAULT_TAB_TYPE = "";
  
  public static final Long DEFAULT_TOPIC_FID;
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final Long DEFAULT_TOP_PID;
  
  public static final String DEFAULT_UP_SCHEMA = "";
  
  public static final String DEFAULT_YUELAOU_LOCATE = "";
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String ad_bear_pb_banner;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String ad_bear_pb_comment;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String ad_context_list;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String ad_ext_params;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String ad_external_banner_info;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String ad_external_info;
  
  @ProtoField(tag = 18)
  public final AdParam ad_param;
  
  @ProtoField(tag = 21)
  public final AppTransmitData app_transmit_data;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer back;
  
  @ProtoField(tag = 37, type = Message.Datatype.INT64)
  public final Long broadcast_id;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String cid;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String da_idfa;
  
  @ProtoField(tag = 38, type = Message.Datatype.STRING)
  public final String fr;
  
  @ProtoField(tag = 41, type = Message.Datatype.UINT32)
  public final Integer from_forum_id;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String game_fid;
  
  @ProtoField(tag = 30, type = Message.Datatype.STRING)
  public final String game_fname;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String game_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long kz;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long last_pid;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String log_params;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer lz;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer mark_type;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String mount_bot_uk;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 28, type = Message.Datatype.INT32)
  public final Integer position;
  
  @ProtoField(tag = 32)
  public final PushInfo push_info;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String query_word;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer r;
  
  @ProtoField(tag = 36, type = Message.Datatype.INT32)
  public final Integer request_times;
  
  @ProtoField(tag = 31, type = Message.Datatype.STRING)
  public final String search_query;
  
  @ProtoField(tag = 39, type = Message.Datatype.INT32)
  public final Integer session_request_times;
  
  @ProtoField(tag = 40, type = Message.Datatype.STRING)
  public final String shoubai_cuid;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String st_type;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT64)
  public final Long tab_id;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String tab_type;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT64)
  public final Long top_pid;
  
  @ProtoField(tag = 34, type = Message.Datatype.INT64)
  public final Long topic_fid;
  
  @ProtoField(tag = 33, type = Message.Datatype.INT64)
  public final Long topic_id;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String up_schema;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String yuelaou_locate;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_KZ = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_PN = integer;
    DEFAULT_LAST_PID = long_;
    DEFAULT_R = integer;
    DEFAULT_BACK = integer;
    DEFAULT_LZ = integer;
    DEFAULT_MARK_TYPE = integer;
    DEFAULT_TAB_ID = long_;
    DEFAULT_TOP_PID = long_;
    DEFAULT_POSITION = integer;
    DEFAULT_TOPIC_ID = long_;
    DEFAULT_TOPIC_FID = long_;
    DEFAULT_REQUEST_TIMES = integer;
    DEFAULT_BROADCAST_ID = long_;
    DEFAULT_SESSION_REQUEST_TIMES = integer;
    DEFAULT_FROM_FORUM_ID = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_5 = paramBuilder.kz;
      if (long_5 == null) {
        this.kz = DEFAULT_KZ;
      } else {
        this.kz = long_5;
      } 
      Integer integer5 = paramBuilder.pn;
      if (integer5 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer5;
      } 
      Long long_4 = paramBuilder.last_pid;
      if (long_4 == null) {
        this.last_pid = DEFAULT_LAST_PID;
      } else {
        this.last_pid = long_4;
      } 
      Integer integer4 = paramBuilder.r;
      if (integer4 == null) {
        this.r = DEFAULT_R;
      } else {
        this.r = integer4;
      } 
      integer4 = paramBuilder.back;
      if (integer4 == null) {
        this.back = DEFAULT_BACK;
      } else {
        this.back = integer4;
      } 
      integer4 = paramBuilder.lz;
      if (integer4 == null) {
        this.lz = DEFAULT_LZ;
      } else {
        this.lz = integer4;
      } 
      integer4 = paramBuilder.mark_type;
      if (integer4 == null) {
        this.mark_type = DEFAULT_MARK_TYPE;
      } else {
        this.mark_type = integer4;
      } 
      String str6 = paramBuilder.tab_type;
      if (str6 == null) {
        this.tab_type = "";
      } else {
        this.tab_type = str6;
      } 
      Long long_3 = paramBuilder.tab_id;
      if (long_3 == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = long_3;
      } 
      long_3 = paramBuilder.top_pid;
      if (long_3 == null) {
        this.top_pid = DEFAULT_TOP_PID;
      } else {
        this.top_pid = long_3;
      } 
      String str5 = paramBuilder.st_type;
      if (str5 == null) {
        this.st_type = "";
      } else {
        this.st_type = str5;
      } 
      str5 = paramBuilder.up_schema;
      if (str5 == null) {
        this.up_schema = "";
      } else {
        this.up_schema = str5;
      } 
      str5 = paramBuilder.log_params;
      if (str5 == null) {
        this.log_params = "";
      } else {
        this.log_params = str5;
      } 
      str5 = paramBuilder.yuelaou_locate;
      if (str5 == null) {
        this.yuelaou_locate = "";
      } else {
        this.yuelaou_locate = str5;
      } 
      str5 = paramBuilder.query_word;
      if (str5 == null) {
        this.query_word = "";
      } else {
        this.query_word = str5;
      } 
      str5 = paramBuilder.da_idfa;
      if (str5 == null) {
        this.da_idfa = "";
      } else {
        this.da_idfa = str5;
      } 
      this.ad_param = paramBuilder.ad_param;
      str5 = paramBuilder.ad_context_list;
      if (str5 == null) {
        this.ad_context_list = "";
      } else {
        this.ad_context_list = str5;
      } 
      str5 = paramBuilder.ad_ext_params;
      if (str5 == null) {
        this.ad_ext_params = "";
      } else {
        this.ad_ext_params = str5;
      } 
      this.app_transmit_data = paramBuilder.app_transmit_data;
      str5 = paramBuilder.ad_bear_pb_banner;
      if (str5 == null) {
        this.ad_bear_pb_banner = "";
      } else {
        this.ad_bear_pb_banner = str5;
      } 
      str5 = paramBuilder.ad_bear_pb_comment;
      if (str5 == null) {
        this.ad_bear_pb_comment = "";
      } else {
        this.ad_bear_pb_comment = str5;
      } 
      str5 = paramBuilder.ad_external_banner_info;
      if (str5 == null) {
        this.ad_external_banner_info = "";
      } else {
        this.ad_external_banner_info = str5;
      } 
      str5 = paramBuilder.ad_external_info;
      if (str5 == null) {
        this.ad_external_info = "";
      } else {
        this.ad_external_info = str5;
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
      Integer integer3 = paramBuilder.position;
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
      str4 = paramBuilder.search_query;
      if (str4 == null) {
        this.search_query = "";
      } else {
        this.search_query = str4;
      } 
      this.push_info = paramBuilder.push_info;
      Long long_2 = paramBuilder.topic_id;
      if (long_2 == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_2;
      } 
      long_2 = paramBuilder.topic_fid;
      if (long_2 == null) {
        this.topic_fid = DEFAULT_TOPIC_FID;
      } else {
        this.topic_fid = long_2;
      } 
      String str3 = paramBuilder.mount_bot_uk;
      if (str3 == null) {
        this.mount_bot_uk = "";
      } else {
        this.mount_bot_uk = str3;
      } 
      Integer integer2 = paramBuilder.request_times;
      if (integer2 == null) {
        this.request_times = DEFAULT_REQUEST_TIMES;
      } else {
        this.request_times = integer2;
      } 
      Long long_1 = paramBuilder.broadcast_id;
      if (long_1 == null) {
        this.broadcast_id = DEFAULT_BROADCAST_ID;
      } else {
        this.broadcast_id = long_1;
      } 
      String str2 = paramBuilder.fr;
      if (str2 == null) {
        this.fr = "";
      } else {
        this.fr = str2;
      } 
      Integer integer1 = paramBuilder.session_request_times;
      if (integer1 == null) {
        this.session_request_times = DEFAULT_SESSION_REQUEST_TIMES;
      } else {
        this.session_request_times = integer1;
      } 
      String str1 = paramBuilder.shoubai_cuid;
      if (str1 == null) {
        this.shoubai_cuid = "";
      } else {
        this.shoubai_cuid = str1;
      } 
      integer = paramBuilder.from_forum_id;
      if (integer == null) {
        this.from_forum_id = DEFAULT_FROM_FORUM_ID;
      } else {
        this.from_forum_id = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.kz = ((Builder)integer).kz;
      this.pn = ((Builder)integer).pn;
      this.last_pid = ((Builder)integer).last_pid;
      this.r = ((Builder)integer).r;
      this.back = ((Builder)integer).back;
      this.lz = ((Builder)integer).lz;
      this.mark_type = ((Builder)integer).mark_type;
      this.tab_type = ((Builder)integer).tab_type;
      this.tab_id = ((Builder)integer).tab_id;
      this.top_pid = ((Builder)integer).top_pid;
      this.st_type = ((Builder)integer).st_type;
      this.up_schema = ((Builder)integer).up_schema;
      this.log_params = ((Builder)integer).log_params;
      this.yuelaou_locate = ((Builder)integer).yuelaou_locate;
      this.query_word = ((Builder)integer).query_word;
      this.da_idfa = ((Builder)integer).da_idfa;
      this.ad_param = ((Builder)integer).ad_param;
      this.ad_context_list = ((Builder)integer).ad_context_list;
      this.ad_ext_params = ((Builder)integer).ad_ext_params;
      this.app_transmit_data = ((Builder)integer).app_transmit_data;
      this.ad_bear_pb_banner = ((Builder)integer).ad_bear_pb_banner;
      this.ad_bear_pb_comment = ((Builder)integer).ad_bear_pb_comment;
      this.ad_external_banner_info = ((Builder)integer).ad_external_banner_info;
      this.ad_external_info = ((Builder)integer).ad_external_info;
      this.game_id = ((Builder)integer).game_id;
      this.cid = ((Builder)integer).cid;
      this.position = ((Builder)integer).position;
      this.game_fid = ((Builder)integer).game_fid;
      this.game_fname = ((Builder)integer).game_fname;
      this.search_query = ((Builder)integer).search_query;
      this.push_info = ((Builder)integer).push_info;
      this.topic_id = ((Builder)integer).topic_id;
      this.topic_fid = ((Builder)integer).topic_fid;
      this.mount_bot_uk = ((Builder)integer).mount_bot_uk;
      this.request_times = ((Builder)integer).request_times;
      this.broadcast_id = ((Builder)integer).broadcast_id;
      this.fr = ((Builder)integer).fr;
      this.session_request_times = ((Builder)integer).session_request_times;
      this.shoubai_cuid = ((Builder)integer).shoubai_cuid;
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
    
    public AppTransmitData app_transmit_data;
    
    public Integer back;
    
    public Long broadcast_id;
    
    public String cid;
    
    public CommonReq common;
    
    public String da_idfa;
    
    public String fr;
    
    public Integer from_forum_id;
    
    public String game_fid;
    
    public String game_fname;
    
    public String game_id;
    
    public Long kz;
    
    public Long last_pid;
    
    public String log_params;
    
    public Integer lz;
    
    public Integer mark_type;
    
    public String mount_bot_uk;
    
    public Integer pn;
    
    public Integer position;
    
    public PushInfo push_info;
    
    public String query_word;
    
    public Integer r;
    
    public Integer request_times;
    
    public String search_query;
    
    public Integer session_request_times;
    
    public String shoubai_cuid;
    
    public String st_type;
    
    public Long tab_id;
    
    public String tab_type;
    
    public Long top_pid;
    
    public Long topic_fid;
    
    public Long topic_id;
    
    public String up_schema;
    
    public String yuelaou_locate;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.kz = param1DataReq.kz;
      this.pn = param1DataReq.pn;
      this.last_pid = param1DataReq.last_pid;
      this.r = param1DataReq.r;
      this.back = param1DataReq.back;
      this.lz = param1DataReq.lz;
      this.mark_type = param1DataReq.mark_type;
      this.tab_type = param1DataReq.tab_type;
      this.tab_id = param1DataReq.tab_id;
      this.top_pid = param1DataReq.top_pid;
      this.st_type = param1DataReq.st_type;
      this.up_schema = param1DataReq.up_schema;
      this.log_params = param1DataReq.log_params;
      this.yuelaou_locate = param1DataReq.yuelaou_locate;
      this.query_word = param1DataReq.query_word;
      this.da_idfa = param1DataReq.da_idfa;
      this.ad_param = param1DataReq.ad_param;
      this.ad_context_list = param1DataReq.ad_context_list;
      this.ad_ext_params = param1DataReq.ad_ext_params;
      this.app_transmit_data = param1DataReq.app_transmit_data;
      this.ad_bear_pb_banner = param1DataReq.ad_bear_pb_banner;
      this.ad_bear_pb_comment = param1DataReq.ad_bear_pb_comment;
      this.ad_external_banner_info = param1DataReq.ad_external_banner_info;
      this.ad_external_info = param1DataReq.ad_external_info;
      this.game_id = param1DataReq.game_id;
      this.cid = param1DataReq.cid;
      this.position = param1DataReq.position;
      this.game_fid = param1DataReq.game_fid;
      this.game_fname = param1DataReq.game_fname;
      this.search_query = param1DataReq.search_query;
      this.push_info = param1DataReq.push_info;
      this.topic_id = param1DataReq.topic_id;
      this.topic_fid = param1DataReq.topic_fid;
      this.mount_bot_uk = param1DataReq.mount_bot_uk;
      this.request_times = param1DataReq.request_times;
      this.broadcast_id = param1DataReq.broadcast_id;
      this.fr = param1DataReq.fr;
      this.session_request_times = param1DataReq.session_request_times;
      this.shoubai_cuid = param1DataReq.shoubai_cuid;
      this.from_forum_id = param1DataReq.from_forum_id;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
