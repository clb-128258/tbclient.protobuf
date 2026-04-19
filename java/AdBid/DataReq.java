package tbclient.AdBid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppTransmitData;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_AD_CONTEXT_LIST = "";
  
  public static final String DEFAULT_AD_EXTERNAL_BANNER_INFO = "";
  
  public static final String DEFAULT_AD_EXTERNAL_INFO = "";
  
  public static final String DEFAULT_AD_EXT_PARAMS = "";
  
  public static final Integer DEFAULT_BACK;
  
  public static final Integer DEFAULT_BIZ_TYPE;
  
  public static final String DEFAULT_CALL_FROM = "";
  
  public static final String DEFAULT_CID = "";
  
  public static final Long DEFAULT_FID;
  
  public static final Long DEFAULT_FLOOR_RN;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_GAME_FID = "";
  
  public static final String DEFAULT_GAME_ID = "";
  
  public static final Integer DEFAULT_ISSDK;
  
  public static final Integer DEFAULT_IS_COMM_REVERSE;
  
  public static final Integer DEFAULT_IS_FOLD_COMMENT_REQ;
  
  public static final Long DEFAULT_KZ;
  
  public static final Long DEFAULT_LAST_PID;
  
  public static final Integer DEFAULT_LZ;
  
  public static final String DEFAULT_OBJ_LOCATE = "";
  
  public static final String DEFAULT_OBJ_PARAM1 = "";
  
  public static final String DEFAULT_OBJ_SOURCE = "";
  
  public static final Integer DEFAULT_PAGE_FROM;
  
  public static final Long DEFAULT_PID;
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_POSITION;
  
  public static final Integer DEFAULT_R;
  
  public static final String DEFAULT_REQUEST_TIMES = "";
  
  public static final Integer DEFAULT_RN;
  
  public static final Long DEFAULT_TAB_ID;
  
  public static final Integer DEFAULT_WITH_FLOOR;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String ad_context_list;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String ad_ext_params;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String ad_external_banner_info;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String ad_external_info;
  
  @ProtoField(tag = 2)
  public final AppTransmitData app_transmit_data;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer back;
  
  @ProtoField(tag = 33, type = Message.Datatype.INT32)
  public final Integer biz_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String call_from;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String cid;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 21, type = Message.Datatype.UINT64)
  public final Long fid;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT64)
  public final Long floor_rn;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String game_fid;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String game_id;
  
  @ProtoField(tag = 17, type = Message.Datatype.INT32)
  public final Integer is_comm_reverse;
  
  @ProtoField(tag = 30, type = Message.Datatype.INT32)
  public final Integer is_fold_comment_req;
  
  @ProtoField(tag = 24, type = Message.Datatype.INT32)
  public final Integer issdk;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT64)
  public final Long kz;
  
  @ProtoField(tag = 22, type = Message.Datatype.INT64)
  public final Long last_pid;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer lz;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String obj_locate;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String obj_param1;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String obj_source;
  
  @ProtoField(tag = 27, type = Message.Datatype.INT32)
  public final Integer page_from;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long pid;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 28, type = Message.Datatype.INT32)
  public final Integer position;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer r;
  
  @ProtoField(tag = 32, type = Message.Datatype.STRING)
  public final String request_times;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer rn;
  
  @ProtoField(tag = 31, type = Message.Datatype.UINT64)
  public final Long tab_id;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer with_floor;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_KZ = long_;
    DEFAULT_PID = long_;
    DEFAULT_FORUM_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_PN = integer;
    DEFAULT_RN = integer;
    DEFAULT_LZ = integer;
    DEFAULT_R = integer;
    DEFAULT_WITH_FLOOR = integer;
    DEFAULT_FLOOR_RN = long_;
    DEFAULT_IS_COMM_REVERSE = integer;
    DEFAULT_FID = long_;
    DEFAULT_LAST_PID = long_;
    DEFAULT_BACK = integer;
    DEFAULT_ISSDK = integer;
    DEFAULT_PAGE_FROM = integer;
    DEFAULT_POSITION = integer;
    DEFAULT_IS_FOLD_COMMENT_REQ = integer;
    DEFAULT_TAB_ID = long_;
    DEFAULT_BIZ_TYPE = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      this.app_transmit_data = paramBuilder.app_transmit_data;
      String str5 = paramBuilder.ad_external_info;
      if (str5 == null) {
        this.ad_external_info = "";
      } else {
        this.ad_external_info = str5;
      } 
      str5 = paramBuilder.ad_external_banner_info;
      if (str5 == null) {
        this.ad_external_banner_info = "";
      } else {
        this.ad_external_banner_info = str5;
      } 
      str5 = paramBuilder.call_from;
      if (str5 == null) {
        this.call_from = "";
      } else {
        this.call_from = str5;
      } 
      str5 = paramBuilder.ad_ext_params;
      if (str5 == null) {
        this.ad_ext_params = "";
      } else {
        this.ad_ext_params = str5;
      } 
      str5 = paramBuilder.ad_context_list;
      if (str5 == null) {
        this.ad_context_list = "";
      } else {
        this.ad_context_list = str5;
      } 
      Long long_4 = paramBuilder.kz;
      if (long_4 == null) {
        this.kz = DEFAULT_KZ;
      } else {
        this.kz = long_4;
      } 
      long_4 = paramBuilder.pid;
      if (long_4 == null) {
        this.pid = DEFAULT_PID;
      } else {
        this.pid = long_4;
      } 
      long_4 = paramBuilder.forum_id;
      if (long_4 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_4;
      } 
      Integer integer5 = paramBuilder.pn;
      if (integer5 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer5;
      } 
      integer5 = paramBuilder.rn;
      if (integer5 == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer5;
      } 
      integer5 = paramBuilder.lz;
      if (integer5 == null) {
        this.lz = DEFAULT_LZ;
      } else {
        this.lz = integer5;
      } 
      integer5 = paramBuilder.r;
      if (integer5 == null) {
        this.r = DEFAULT_R;
      } else {
        this.r = integer5;
      } 
      integer5 = paramBuilder.with_floor;
      if (integer5 == null) {
        this.with_floor = DEFAULT_WITH_FLOOR;
      } else {
        this.with_floor = integer5;
      } 
      Long long_3 = paramBuilder.floor_rn;
      if (long_3 == null) {
        this.floor_rn = DEFAULT_FLOOR_RN;
      } else {
        this.floor_rn = long_3;
      } 
      Integer integer4 = paramBuilder.is_comm_reverse;
      if (integer4 == null) {
        this.is_comm_reverse = DEFAULT_IS_COMM_REVERSE;
      } else {
        this.is_comm_reverse = integer4;
      } 
      String str4 = paramBuilder.obj_source;
      if (str4 == null) {
        this.obj_source = "";
      } else {
        this.obj_source = str4;
      } 
      str4 = paramBuilder.obj_locate;
      if (str4 == null) {
        this.obj_locate = "";
      } else {
        this.obj_locate = str4;
      } 
      str4 = paramBuilder.obj_param1;
      if (str4 == null) {
        this.obj_param1 = "";
      } else {
        this.obj_param1 = str4;
      } 
      Long long_2 = paramBuilder.fid;
      if (long_2 == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_2;
      } 
      long_2 = paramBuilder.last_pid;
      if (long_2 == null) {
        this.last_pid = DEFAULT_LAST_PID;
      } else {
        this.last_pid = long_2;
      } 
      Integer integer3 = paramBuilder.back;
      if (integer3 == null) {
        this.back = DEFAULT_BACK;
      } else {
        this.back = integer3;
      } 
      integer3 = paramBuilder.issdk;
      if (integer3 == null) {
        this.issdk = DEFAULT_ISSDK;
      } else {
        this.issdk = integer3;
      } 
      String str3 = paramBuilder.cid;
      if (str3 == null) {
        this.cid = "";
      } else {
        this.cid = str3;
      } 
      str3 = paramBuilder.game_id;
      if (str3 == null) {
        this.game_id = "";
      } else {
        this.game_id = str3;
      } 
      Integer integer2 = paramBuilder.page_from;
      if (integer2 == null) {
        this.page_from = DEFAULT_PAGE_FROM;
      } else {
        this.page_from = integer2;
      } 
      integer2 = paramBuilder.position;
      if (integer2 == null) {
        this.position = DEFAULT_POSITION;
      } else {
        this.position = integer2;
      } 
      String str2 = paramBuilder.game_fid;
      if (str2 == null) {
        this.game_fid = "";
      } else {
        this.game_fid = str2;
      } 
      Integer integer1 = paramBuilder.is_fold_comment_req;
      if (integer1 == null) {
        this.is_fold_comment_req = DEFAULT_IS_FOLD_COMMENT_REQ;
      } else {
        this.is_fold_comment_req = integer1;
      } 
      Long long_1 = paramBuilder.tab_id;
      if (long_1 == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = long_1;
      } 
      String str1 = paramBuilder.request_times;
      if (str1 == null) {
        this.request_times = "";
      } else {
        this.request_times = str1;
      } 
      integer = paramBuilder.biz_type;
      if (integer == null) {
        this.biz_type = DEFAULT_BIZ_TYPE;
      } else {
        this.biz_type = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.app_transmit_data = ((Builder)integer).app_transmit_data;
      this.ad_external_info = ((Builder)integer).ad_external_info;
      this.ad_external_banner_info = ((Builder)integer).ad_external_banner_info;
      this.call_from = ((Builder)integer).call_from;
      this.ad_ext_params = ((Builder)integer).ad_ext_params;
      this.ad_context_list = ((Builder)integer).ad_context_list;
      this.kz = ((Builder)integer).kz;
      this.pid = ((Builder)integer).pid;
      this.forum_id = ((Builder)integer).forum_id;
      this.pn = ((Builder)integer).pn;
      this.rn = ((Builder)integer).rn;
      this.lz = ((Builder)integer).lz;
      this.r = ((Builder)integer).r;
      this.with_floor = ((Builder)integer).with_floor;
      this.floor_rn = ((Builder)integer).floor_rn;
      this.is_comm_reverse = ((Builder)integer).is_comm_reverse;
      this.obj_source = ((Builder)integer).obj_source;
      this.obj_locate = ((Builder)integer).obj_locate;
      this.obj_param1 = ((Builder)integer).obj_param1;
      this.fid = ((Builder)integer).fid;
      this.last_pid = ((Builder)integer).last_pid;
      this.back = ((Builder)integer).back;
      this.issdk = ((Builder)integer).issdk;
      this.cid = ((Builder)integer).cid;
      this.game_id = ((Builder)integer).game_id;
      this.page_from = ((Builder)integer).page_from;
      this.position = ((Builder)integer).position;
      this.game_fid = ((Builder)integer).game_fid;
      this.is_fold_comment_req = ((Builder)integer).is_fold_comment_req;
      this.tab_id = ((Builder)integer).tab_id;
      this.request_times = ((Builder)integer).request_times;
      this.biz_type = ((Builder)integer).biz_type;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public String ad_context_list;
    
    public String ad_ext_params;
    
    public String ad_external_banner_info;
    
    public String ad_external_info;
    
    public AppTransmitData app_transmit_data;
    
    public Integer back;
    
    public Integer biz_type;
    
    public String call_from;
    
    public String cid;
    
    public CommonReq common;
    
    public Long fid;
    
    public Long floor_rn;
    
    public Long forum_id;
    
    public String game_fid;
    
    public String game_id;
    
    public Integer is_comm_reverse;
    
    public Integer is_fold_comment_req;
    
    public Integer issdk;
    
    public Long kz;
    
    public Long last_pid;
    
    public Integer lz;
    
    public String obj_locate;
    
    public String obj_param1;
    
    public String obj_source;
    
    public Integer page_from;
    
    public Long pid;
    
    public Integer pn;
    
    public Integer position;
    
    public Integer r;
    
    public String request_times;
    
    public Integer rn;
    
    public Long tab_id;
    
    public Integer with_floor;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.app_transmit_data = param1DataReq.app_transmit_data;
      this.ad_external_info = param1DataReq.ad_external_info;
      this.ad_external_banner_info = param1DataReq.ad_external_banner_info;
      this.call_from = param1DataReq.call_from;
      this.ad_ext_params = param1DataReq.ad_ext_params;
      this.ad_context_list = param1DataReq.ad_context_list;
      this.kz = param1DataReq.kz;
      this.pid = param1DataReq.pid;
      this.forum_id = param1DataReq.forum_id;
      this.pn = param1DataReq.pn;
      this.rn = param1DataReq.rn;
      this.lz = param1DataReq.lz;
      this.r = param1DataReq.r;
      this.with_floor = param1DataReq.with_floor;
      this.floor_rn = param1DataReq.floor_rn;
      this.is_comm_reverse = param1DataReq.is_comm_reverse;
      this.obj_source = param1DataReq.obj_source;
      this.obj_locate = param1DataReq.obj_locate;
      this.obj_param1 = param1DataReq.obj_param1;
      this.fid = param1DataReq.fid;
      this.last_pid = param1DataReq.last_pid;
      this.back = param1DataReq.back;
      this.issdk = param1DataReq.issdk;
      this.cid = param1DataReq.cid;
      this.game_id = param1DataReq.game_id;
      this.page_from = param1DataReq.page_from;
      this.position = param1DataReq.position;
      this.game_fid = param1DataReq.game_fid;
      this.is_fold_comment_req = param1DataReq.is_fold_comment_req;
      this.tab_id = param1DataReq.tab_id;
      this.request_times = param1DataReq.request_times;
      this.biz_type = param1DataReq.biz_type;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
