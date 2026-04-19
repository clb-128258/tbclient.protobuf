package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AppPosInfo;
import tbclient.AppTransmitData;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_AD_BEAR_CONTEXT = "";
  
  public static final String DEFAULT_AD_CONTEXT_LIST = "";
  
  public static final String DEFAULT_AD_EXTERNAL_INFO = "";
  
  public static final String DEFAULT_AD_EXT_PARAMS = "";
  
  public static final String DEFAULT_AGE_TAG = "";
  
  public static final Integer DEFAULT_CACHE_COLUMN_STYLE;
  
  public static final String DEFAULT_DA_IDFA = "";
  
  public static final Long DEFAULT_FAKE_FORUM_ID;
  
  public static final Long DEFAULT_FAKE_THREAD_ID;
  
  public static final String DEFAULT_FEED_STYLE = "";
  
  public static final String DEFAULT_FIRST_DIR = "";
  
  public static final Integer DEFAULT_FIRST_REFRESH;
  
  public static final Long DEFAULT_FROM_TID;
  
  public static final List<String> DEFAULT_INTEREST_TAG;
  
  public static final String DEFAULT_INVOKE_SOURCE = "";
  
  public static final Integer DEFAULT_ISSDK;
  
  public static final Integer DEFAULT_IS_CLOUD_LOG;
  
  public static final Integer DEFAULT_IS_NEWFEED;
  
  public static final Integer DEFAULT_IS_NEW_USER;
  
  public static final String DEFAULT_LASTIDS = "";
  
  public static final Integer DEFAULT_LOAD_TYPE;
  
  public static final Integer DEFAULT_NEED_AGE_MODULE;
  
  public static final Integer DEFAULT_NEED_FORUMLIST;
  
  public static final Integer DEFAULT_NEED_TAGS;
  
  public static final Integer DEFAULT_NEW_INSTALL;
  
  public static final Integer DEFAULT_NEW_NET_TYPE;
  
  public static final Integer DEFAULT_PAGE_THREAD_COUNT;
  
  public static final String DEFAULT_PLATFORM = "";
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_PRE_AD_THREAD_COUNT;
  
  public static final Long DEFAULT_PUSH_TID;
  
  public static final String DEFAULT_QUERY_EQID = "";
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Integer DEFAULT_REQUEST_TIMES;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final String DEFAULT_SECOND_DIR = "";
  
  public static final String DEFAULT_SEX_TAG = "";
  
  public static final String DEFAULT_SHOUBAI_CUID = "";
  
  public static final Integer DEFAULT_SUG_COUNT;
  
  public static final Integer DEFAULT_TAG_CHANGED;
  
  public static final Integer DEFAULT_TAG_CODE;
  
  @ProtoField(tag = 43, type = Message.Datatype.STRING)
  public final String ad_bear_context;
  
  @ProtoField(tag = 30, type = Message.Datatype.STRING)
  public final String ad_context_list;
  
  @ProtoField(tag = 37, type = Message.Datatype.STRING)
  public final String ad_ext_params;
  
  @ProtoField(tag = 45, type = Message.Datatype.STRING)
  public final String ad_external_info;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String age_tag;
  
  @ProtoField(tag = 36)
  public final AppPosInfo app_pos;
  
  @ProtoField(tag = 38)
  public final AppTransmitData app_transmit_data;
  
  @ProtoField(tag = 46, type = Message.Datatype.UINT32)
  public final Integer cache_column_style;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String da_idfa;
  
  @ProtoField(tag = 48, type = Message.Datatype.UINT64)
  public final Long fake_forum_id;
  
  @ProtoField(tag = 47, type = Message.Datatype.UINT64)
  public final Long fake_thread_id;
  
  @ProtoField(tag = 51, type = Message.Datatype.STRING)
  public final String feed_style;
  
  @ProtoField(tag = 34, type = Message.Datatype.STRING)
  public final String first_dir;
  
  @ProtoField(tag = 49, type = Message.Datatype.UINT32)
  public final Integer first_refresh;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT64)
  public final Long from_tid;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 20, type = Message.Datatype.STRING)
  public final List<String> interest_tag;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String invoke_source;
  
  @ProtoField(tag = 52, type = Message.Datatype.INT32)
  public final Integer is_cloud_log;
  
  @ProtoField(tag = 44, type = Message.Datatype.UINT32)
  public final Integer is_new_user;
  
  @ProtoField(tag = 40, type = Message.Datatype.INT32)
  public final Integer is_newfeed;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer issdk;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String lastids;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer load_type;
  
  @ProtoField(tag = 19, type = Message.Datatype.UINT32)
  public final Integer need_age_module;
  
  @ProtoField(tag = 22, type = Message.Datatype.UINT32)
  public final Integer need_forumlist;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer need_tags;
  
  @ProtoField(tag = 27, type = Message.Datatype.INT32)
  public final Integer new_install;
  
  @ProtoField(tag = 23, type = Message.Datatype.UINT32)
  public final Integer new_net_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer page_thread_count;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String platform;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer pn;
  
  @ProtoField(tag = 26, type = Message.Datatype.INT32)
  public final Integer pre_ad_thread_count;
  
  @ProtoField(tag = 39, type = Message.Datatype.INT64)
  public final Long push_tid;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer q_type;
  
  @ProtoField(tag = 33, type = Message.Datatype.STRING)
  public final String query_eqid;
  
  @ProtoField(tag = 28, type = Message.Datatype.INT32)
  public final Integer request_times;
  
  @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String second_dir;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String sex_tag;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String shoubai_cuid;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer sug_count;
  
  @ProtoField(tag = 21, type = Message.Datatype.UINT32)
  public final Integer tag_changed;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer tag_code;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TAG_CODE = integer;
    DEFAULT_NEED_TAGS = integer;
    DEFAULT_LOAD_TYPE = integer;
    DEFAULT_PAGE_THREAD_COUNT = integer;
    DEFAULT_PN = integer;
    DEFAULT_SUG_COUNT = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_Q_TYPE = integer;
    DEFAULT_ISSDK = integer;
    DEFAULT_NEED_AGE_MODULE = integer;
    DEFAULT_INTEREST_TAG = Collections.emptyList();
    DEFAULT_TAG_CHANGED = integer;
    DEFAULT_NEED_FORUMLIST = integer;
    DEFAULT_NEW_NET_TYPE = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_FROM_TID = long_;
    DEFAULT_PRE_AD_THREAD_COUNT = integer;
    DEFAULT_NEW_INSTALL = integer;
    DEFAULT_REQUEST_TIMES = integer;
    DEFAULT_PUSH_TID = long_;
    DEFAULT_IS_NEWFEED = integer;
    DEFAULT_IS_NEW_USER = integer;
    DEFAULT_CACHE_COLUMN_STYLE = integer;
    DEFAULT_FAKE_THREAD_ID = long_;
    DEFAULT_FAKE_FORUM_ID = long_;
    DEFAULT_FIRST_REFRESH = integer;
    DEFAULT_IS_CLOUD_LOG = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer10 = paramBuilder.tag_code;
      if (integer10 == null) {
        this.tag_code = DEFAULT_TAG_CODE;
      } else {
        this.tag_code = integer10;
      } 
      integer10 = paramBuilder.need_tags;
      if (integer10 == null) {
        this.need_tags = DEFAULT_NEED_TAGS;
      } else {
        this.need_tags = integer10;
      } 
      integer10 = paramBuilder.load_type;
      if (integer10 == null) {
        this.load_type = DEFAULT_LOAD_TYPE;
      } else {
        this.load_type = integer10;
      } 
      integer10 = paramBuilder.page_thread_count;
      if (integer10 == null) {
        this.page_thread_count = DEFAULT_PAGE_THREAD_COUNT;
      } else {
        this.page_thread_count = integer10;
      } 
      integer10 = paramBuilder.pn;
      if (integer10 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer10;
      } 
      integer10 = paramBuilder.sug_count;
      if (integer10 == null) {
        this.sug_count = DEFAULT_SUG_COUNT;
      } else {
        this.sug_count = integer10;
      } 
      integer10 = paramBuilder.scr_w;
      if (integer10 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer10;
      } 
      integer10 = paramBuilder.scr_h;
      if (integer10 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer10;
      } 
      Double double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
      Integer integer9 = paramBuilder.q_type;
      if (integer9 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer9;
      } 
      String str7 = paramBuilder.lastids;
      if (str7 == null) {
        this.lastids = "";
      } else {
        this.lastids = str7;
      } 
      Integer integer8 = paramBuilder.issdk;
      if (integer8 == null) {
        this.issdk = DEFAULT_ISSDK;
      } else {
        this.issdk = integer8;
      } 
      String str6 = paramBuilder.da_idfa;
      if (str6 == null) {
        this.da_idfa = "";
      } else {
        this.da_idfa = str6;
      } 
      str6 = paramBuilder.platform;
      if (str6 == null) {
        this.platform = "";
      } else {
        this.platform = str6;
      } 
      str6 = paramBuilder.sex_tag;
      if (str6 == null) {
        this.sex_tag = "";
      } else {
        this.sex_tag = str6;
      } 
      str6 = paramBuilder.age_tag;
      if (str6 == null) {
        this.age_tag = "";
      } else {
        this.age_tag = str6;
      } 
      Integer integer7 = paramBuilder.need_age_module;
      if (integer7 == null) {
        this.need_age_module = DEFAULT_NEED_AGE_MODULE;
      } else {
        this.need_age_module = integer7;
      } 
      List<String> list = paramBuilder.interest_tag;
      if (list == null) {
        this.interest_tag = DEFAULT_INTEREST_TAG;
      } else {
        this.interest_tag = Message.immutableCopyOf(list);
      } 
      Integer integer6 = paramBuilder.tag_changed;
      if (integer6 == null) {
        this.tag_changed = DEFAULT_TAG_CHANGED;
      } else {
        this.tag_changed = integer6;
      } 
      integer6 = paramBuilder.need_forumlist;
      if (integer6 == null) {
        this.need_forumlist = DEFAULT_NEED_FORUMLIST;
      } else {
        this.need_forumlist = integer6;
      } 
      integer6 = paramBuilder.new_net_type;
      if (integer6 == null) {
        this.new_net_type = DEFAULT_NEW_NET_TYPE;
      } else {
        this.new_net_type = integer6;
      } 
      String str5 = paramBuilder.shoubai_cuid;
      if (str5 == null) {
        this.shoubai_cuid = "";
      } else {
        this.shoubai_cuid = str5;
      } 
      Long long_3 = paramBuilder.from_tid;
      if (long_3 == null) {
        this.from_tid = DEFAULT_FROM_TID;
      } else {
        this.from_tid = long_3;
      } 
      Integer integer5 = paramBuilder.pre_ad_thread_count;
      if (integer5 == null) {
        this.pre_ad_thread_count = DEFAULT_PRE_AD_THREAD_COUNT;
      } else {
        this.pre_ad_thread_count = integer5;
      } 
      integer5 = paramBuilder.new_install;
      if (integer5 == null) {
        this.new_install = DEFAULT_NEW_INSTALL;
      } else {
        this.new_install = integer5;
      } 
      integer5 = paramBuilder.request_times;
      if (integer5 == null) {
        this.request_times = DEFAULT_REQUEST_TIMES;
      } else {
        this.request_times = integer5;
      } 
      String str4 = paramBuilder.invoke_source;
      if (str4 == null) {
        this.invoke_source = "";
      } else {
        this.invoke_source = str4;
      } 
      str4 = paramBuilder.ad_context_list;
      if (str4 == null) {
        this.ad_context_list = "";
      } else {
        this.ad_context_list = str4;
      } 
      str4 = paramBuilder.query_eqid;
      if (str4 == null) {
        this.query_eqid = "";
      } else {
        this.query_eqid = str4;
      } 
      str4 = paramBuilder.first_dir;
      if (str4 == null) {
        this.first_dir = "";
      } else {
        this.first_dir = str4;
      } 
      str4 = paramBuilder.second_dir;
      if (str4 == null) {
        this.second_dir = "";
      } else {
        this.second_dir = str4;
      } 
      this.app_pos = paramBuilder.app_pos;
      str4 = paramBuilder.ad_ext_params;
      if (str4 == null) {
        this.ad_ext_params = "";
      } else {
        this.ad_ext_params = str4;
      } 
      this.app_transmit_data = paramBuilder.app_transmit_data;
      Long long_2 = paramBuilder.push_tid;
      if (long_2 == null) {
        this.push_tid = DEFAULT_PUSH_TID;
      } else {
        this.push_tid = long_2;
      } 
      Integer integer4 = paramBuilder.is_newfeed;
      if (integer4 == null) {
        this.is_newfeed = DEFAULT_IS_NEWFEED;
      } else {
        this.is_newfeed = integer4;
      } 
      String str3 = paramBuilder.ad_bear_context;
      if (str3 == null) {
        this.ad_bear_context = "";
      } else {
        this.ad_bear_context = str3;
      } 
      Integer integer3 = paramBuilder.is_new_user;
      if (integer3 == null) {
        this.is_new_user = DEFAULT_IS_NEW_USER;
      } else {
        this.is_new_user = integer3;
      } 
      String str2 = paramBuilder.ad_external_info;
      if (str2 == null) {
        this.ad_external_info = "";
      } else {
        this.ad_external_info = str2;
      } 
      Integer integer2 = paramBuilder.cache_column_style;
      if (integer2 == null) {
        this.cache_column_style = DEFAULT_CACHE_COLUMN_STYLE;
      } else {
        this.cache_column_style = integer2;
      } 
      Long long_1 = paramBuilder.fake_thread_id;
      if (long_1 == null) {
        this.fake_thread_id = DEFAULT_FAKE_THREAD_ID;
      } else {
        this.fake_thread_id = long_1;
      } 
      long_1 = paramBuilder.fake_forum_id;
      if (long_1 == null) {
        this.fake_forum_id = DEFAULT_FAKE_FORUM_ID;
      } else {
        this.fake_forum_id = long_1;
      } 
      Integer integer1 = paramBuilder.first_refresh;
      if (integer1 == null) {
        this.first_refresh = DEFAULT_FIRST_REFRESH;
      } else {
        this.first_refresh = integer1;
      } 
      String str1 = paramBuilder.feed_style;
      if (str1 == null) {
        this.feed_style = "";
      } else {
        this.feed_style = str1;
      } 
      integer = paramBuilder.is_cloud_log;
      if (integer == null) {
        this.is_cloud_log = DEFAULT_IS_CLOUD_LOG;
      } else {
        this.is_cloud_log = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.tag_code = ((Builder)integer).tag_code;
      this.need_tags = ((Builder)integer).need_tags;
      this.load_type = ((Builder)integer).load_type;
      this.page_thread_count = ((Builder)integer).page_thread_count;
      this.pn = ((Builder)integer).pn;
      this.sug_count = ((Builder)integer).sug_count;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.scr_dip = ((Builder)integer).scr_dip;
      this.q_type = ((Builder)integer).q_type;
      this.lastids = ((Builder)integer).lastids;
      this.issdk = ((Builder)integer).issdk;
      this.da_idfa = ((Builder)integer).da_idfa;
      this.platform = ((Builder)integer).platform;
      this.sex_tag = ((Builder)integer).sex_tag;
      this.age_tag = ((Builder)integer).age_tag;
      this.need_age_module = ((Builder)integer).need_age_module;
      this.interest_tag = Message.immutableCopyOf(((Builder)integer).interest_tag);
      this.tag_changed = ((Builder)integer).tag_changed;
      this.need_forumlist = ((Builder)integer).need_forumlist;
      this.new_net_type = ((Builder)integer).new_net_type;
      this.shoubai_cuid = ((Builder)integer).shoubai_cuid;
      this.from_tid = ((Builder)integer).from_tid;
      this.pre_ad_thread_count = ((Builder)integer).pre_ad_thread_count;
      this.new_install = ((Builder)integer).new_install;
      this.request_times = ((Builder)integer).request_times;
      this.invoke_source = ((Builder)integer).invoke_source;
      this.ad_context_list = ((Builder)integer).ad_context_list;
      this.query_eqid = ((Builder)integer).query_eqid;
      this.first_dir = ((Builder)integer).first_dir;
      this.second_dir = ((Builder)integer).second_dir;
      this.app_pos = ((Builder)integer).app_pos;
      this.ad_ext_params = ((Builder)integer).ad_ext_params;
      this.app_transmit_data = ((Builder)integer).app_transmit_data;
      this.push_tid = ((Builder)integer).push_tid;
      this.is_newfeed = ((Builder)integer).is_newfeed;
      this.ad_bear_context = ((Builder)integer).ad_bear_context;
      this.is_new_user = ((Builder)integer).is_new_user;
      this.ad_external_info = ((Builder)integer).ad_external_info;
      this.cache_column_style = ((Builder)integer).cache_column_style;
      this.fake_thread_id = ((Builder)integer).fake_thread_id;
      this.fake_forum_id = ((Builder)integer).fake_forum_id;
      this.first_refresh = ((Builder)integer).first_refresh;
      this.feed_style = ((Builder)integer).feed_style;
      this.is_cloud_log = ((Builder)integer).is_cloud_log;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public String ad_bear_context;
    
    public String ad_context_list;
    
    public String ad_ext_params;
    
    public String ad_external_info;
    
    public String age_tag;
    
    public AppPosInfo app_pos;
    
    public AppTransmitData app_transmit_data;
    
    public Integer cache_column_style;
    
    public CommonReq common;
    
    public String da_idfa;
    
    public Long fake_forum_id;
    
    public Long fake_thread_id;
    
    public String feed_style;
    
    public String first_dir;
    
    public Integer first_refresh;
    
    public Long from_tid;
    
    public List<String> interest_tag;
    
    public String invoke_source;
    
    public Integer is_cloud_log;
    
    public Integer is_new_user;
    
    public Integer is_newfeed;
    
    public Integer issdk;
    
    public String lastids;
    
    public Integer load_type;
    
    public Integer need_age_module;
    
    public Integer need_forumlist;
    
    public Integer need_tags;
    
    public Integer new_install;
    
    public Integer new_net_type;
    
    public Integer page_thread_count;
    
    public String platform;
    
    public Integer pn;
    
    public Integer pre_ad_thread_count;
    
    public Long push_tid;
    
    public Integer q_type;
    
    public String query_eqid;
    
    public Integer request_times;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public String second_dir;
    
    public String sex_tag;
    
    public String shoubai_cuid;
    
    public Integer sug_count;
    
    public Integer tag_changed;
    
    public Integer tag_code;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.tag_code = param1DataReq.tag_code;
      this.need_tags = param1DataReq.need_tags;
      this.load_type = param1DataReq.load_type;
      this.page_thread_count = param1DataReq.page_thread_count;
      this.pn = param1DataReq.pn;
      this.sug_count = param1DataReq.sug_count;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.q_type = param1DataReq.q_type;
      this.lastids = param1DataReq.lastids;
      this.issdk = param1DataReq.issdk;
      this.da_idfa = param1DataReq.da_idfa;
      this.platform = param1DataReq.platform;
      this.sex_tag = param1DataReq.sex_tag;
      this.age_tag = param1DataReq.age_tag;
      this.need_age_module = param1DataReq.need_age_module;
      this.interest_tag = Message.copyOf(param1DataReq.interest_tag);
      this.tag_changed = param1DataReq.tag_changed;
      this.need_forumlist = param1DataReq.need_forumlist;
      this.new_net_type = param1DataReq.new_net_type;
      this.shoubai_cuid = param1DataReq.shoubai_cuid;
      this.from_tid = param1DataReq.from_tid;
      this.pre_ad_thread_count = param1DataReq.pre_ad_thread_count;
      this.new_install = param1DataReq.new_install;
      this.request_times = param1DataReq.request_times;
      this.invoke_source = param1DataReq.invoke_source;
      this.ad_context_list = param1DataReq.ad_context_list;
      this.query_eqid = param1DataReq.query_eqid;
      this.first_dir = param1DataReq.first_dir;
      this.second_dir = param1DataReq.second_dir;
      this.app_pos = param1DataReq.app_pos;
      this.ad_ext_params = param1DataReq.ad_ext_params;
      this.app_transmit_data = param1DataReq.app_transmit_data;
      this.push_tid = param1DataReq.push_tid;
      this.is_newfeed = param1DataReq.is_newfeed;
      this.ad_bear_context = param1DataReq.ad_bear_context;
      this.is_new_user = param1DataReq.is_new_user;
      this.ad_external_info = param1DataReq.ad_external_info;
      this.cache_column_style = param1DataReq.cache_column_style;
      this.fake_thread_id = param1DataReq.fake_thread_id;
      this.fake_forum_id = param1DataReq.fake_forum_id;
      this.first_refresh = param1DataReq.first_refresh;
      this.feed_style = param1DataReq.feed_style;
      this.is_cloud_log = param1DataReq.is_cloud_log;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
