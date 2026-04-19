package tbclient.UserPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_BEGIN_THREAD_ID;
  
  public static final Integer DEFAULT_BEGIN_TIME;
  
  public static final Integer DEFAULT_CHECK_LOGIN;
  
  public static final String DEFAULT_COOKIE = "";
  
  public static final String DEFAULT_EMAIL = "";
  
  public static final Integer DEFAULT_END_TIME;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_FROM_TYPE;
  
  public static final Integer DEFAULT_IP_INT;
  
  public static final String DEFAULT_IP_STR = "";
  
  public static final Integer DEFAULT_IS_THREAD;
  
  public static final Integer DEFAULT_IS_TWZHIBO;
  
  public static final Integer DEFAULT_IS_VIEW_CARD;
  
  public static final Integer DEFAULT_LAST_THREAD_TIME;
  
  public static final Integer DEFAULT_LOGIN;
  
  public static final String DEFAULT_MOBILE = "";
  
  public static final String DEFAULT_MODULE_NAME = "";
  
  public static final Integer DEFAULT_NEED_CONTENT;
  
  public static final Integer DEFAULT_NO_UN;
  
  public static final Integer DEFAULT_OFFSET;
  
  public static final Integer DEFAULT_PAGE_SOURCE;
  
  public static final Integer DEFAULT_PN;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Integer DEFAULT_REQUEST_TIMES;
  
  public static final Integer DEFAULT_RN;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final Integer DEFAULT_SMILE_GRADE;
  
  public static final Integer DEFAULT_ST_PARAM;
  
  public static final Integer DEFAULT_ST_TYPE;
  
  public static final Integer DEFAULT_SUBTYPE;
  
  public static final Integer DEFAULT_SUPPORT_NOUN;
  
  public static final Integer DEFAULT_TYPE;
  
  public static final Long DEFAULT_UID;
  
  public static final Long DEFAULT_USER_ID;
  
  public static final String DEFAULT_USER_NAME = "";
  
  public static final Integer DEFAULT_WORK_TAB_ID;
  
  @ProtoField(tag = 38, type = Message.Datatype.UINT64)
  public final Long begin_thread_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer begin_time;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer check_login;
  
  @ProtoField(tag = 27)
  public final CommonReq common;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String cookie;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String email;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer end_time;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 37, type = Message.Datatype.UINT32)
  public final Integer from_type;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer ip_int;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String ip_str;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer is_thread;
  
  @ProtoField(tag = 28, type = Message.Datatype.UINT32)
  public final Integer is_twzhibo;
  
  @ProtoField(tag = 33, type = Message.Datatype.INT32)
  public final Integer is_view_card;
  
  @ProtoField(tag = 34, type = Message.Datatype.UINT32)
  public final Integer last_thread_time;
  
  @ProtoField(tag = 18, type = Message.Datatype.UINT32)
  public final Integer login;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String mobile;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String module_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer need_content;
  
  @ProtoField(tag = 21, type = Message.Datatype.UINT32)
  public final Integer no_un;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer offset;
  
  @ProtoField(tag = 40, type = Message.Datatype.UINT32)
  public final Integer page_source;
  
  @ProtoField(tag = 26, type = Message.Datatype.UINT32)
  public final Integer pn;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 32, type = Message.Datatype.INT32)
  public final Integer q_type;
  
  @ProtoField(tag = 39, type = Message.Datatype.INT32)
  public final Integer request_times;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer rn;
  
  @ProtoField(tag = 31, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 30, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 29, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 16, type = Message.Datatype.UINT32)
  public final Integer smile_grade;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT32)
  public final Integer st_param;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT32)
  public final Integer st_type;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer subtype;
  
  @ProtoField(tag = 17, type = Message.Datatype.UINT32)
  public final Integer support_noun;
  
  @ProtoField(tag = 36, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long uid;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 35, type = Message.Datatype.UINT32)
  public final Integer work_tab_id;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_UID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_RN = integer;
    DEFAULT_OFFSET = integer;
    DEFAULT_IS_THREAD = integer;
    DEFAULT_NEED_CONTENT = integer;
    DEFAULT_FORUM_ID = long_;
    DEFAULT_BEGIN_TIME = integer;
    DEFAULT_END_TIME = integer;
    DEFAULT_SUBTYPE = integer;
    DEFAULT_CHECK_LOGIN = integer;
    DEFAULT_IP_INT = integer;
    DEFAULT_ST_TYPE = integer;
    DEFAULT_ST_PARAM = integer;
    DEFAULT_SMILE_GRADE = integer;
    DEFAULT_SUPPORT_NOUN = integer;
    DEFAULT_LOGIN = integer;
    DEFAULT_USER_ID = long_;
    DEFAULT_NO_UN = integer;
    DEFAULT_PN = integer;
    DEFAULT_IS_TWZHIBO = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_Q_TYPE = integer;
    DEFAULT_IS_VIEW_CARD = integer;
    DEFAULT_LAST_THREAD_TIME = integer;
    DEFAULT_WORK_TAB_ID = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_FROM_TYPE = integer;
    DEFAULT_BEGIN_THREAD_ID = long_;
    DEFAULT_REQUEST_TIMES = integer;
    DEFAULT_PAGE_SOURCE = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_4 = paramBuilder.uid;
      if (long_4 == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_4;
      } 
      Integer integer8 = paramBuilder.rn;
      if (integer8 == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer8;
      } 
      integer8 = paramBuilder.offset;
      if (integer8 == null) {
        this.offset = DEFAULT_OFFSET;
      } else {
        this.offset = integer8;
      } 
      integer8 = paramBuilder.is_thread;
      if (integer8 == null) {
        this.is_thread = DEFAULT_IS_THREAD;
      } else {
        this.is_thread = integer8;
      } 
      integer8 = paramBuilder.need_content;
      if (integer8 == null) {
        this.need_content = DEFAULT_NEED_CONTENT;
      } else {
        this.need_content = integer8;
      } 
      Long long_3 = paramBuilder.forum_id;
      if (long_3 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_3;
      } 
      Integer integer7 = paramBuilder.begin_time;
      if (integer7 == null) {
        this.begin_time = DEFAULT_BEGIN_TIME;
      } else {
        this.begin_time = integer7;
      } 
      integer7 = paramBuilder.end_time;
      if (integer7 == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = integer7;
      } 
      integer7 = paramBuilder.subtype;
      if (integer7 == null) {
        this.subtype = DEFAULT_SUBTYPE;
      } else {
        this.subtype = integer7;
      } 
      integer7 = paramBuilder.check_login;
      if (integer7 == null) {
        this.check_login = DEFAULT_CHECK_LOGIN;
      } else {
        this.check_login = integer7;
      } 
      String str4 = paramBuilder.ip_str;
      if (str4 == null) {
        this.ip_str = "";
      } else {
        this.ip_str = str4;
      } 
      Integer integer6 = paramBuilder.ip_int;
      if (integer6 == null) {
        this.ip_int = DEFAULT_IP_INT;
      } else {
        this.ip_int = integer6;
      } 
      String str3 = paramBuilder.module_name;
      if (str3 == null) {
        this.module_name = "";
      } else {
        this.module_name = str3;
      } 
      Integer integer5 = paramBuilder.st_type;
      if (integer5 == null) {
        this.st_type = DEFAULT_ST_TYPE;
      } else {
        this.st_type = integer5;
      } 
      integer5 = paramBuilder.st_param;
      if (integer5 == null) {
        this.st_param = DEFAULT_ST_PARAM;
      } else {
        this.st_param = integer5;
      } 
      integer5 = paramBuilder.smile_grade;
      if (integer5 == null) {
        this.smile_grade = DEFAULT_SMILE_GRADE;
      } else {
        this.smile_grade = integer5;
      } 
      integer5 = paramBuilder.support_noun;
      if (integer5 == null) {
        this.support_noun = DEFAULT_SUPPORT_NOUN;
      } else {
        this.support_noun = integer5;
      } 
      integer5 = paramBuilder.login;
      if (integer5 == null) {
        this.login = DEFAULT_LOGIN;
      } else {
        this.login = integer5;
      } 
      Long long_2 = paramBuilder.user_id;
      if (long_2 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_2;
      } 
      String str2 = paramBuilder.user_name;
      if (str2 == null) {
        this.user_name = "";
      } else {
        this.user_name = str2;
      } 
      Integer integer4 = paramBuilder.no_un;
      if (integer4 == null) {
        this.no_un = DEFAULT_NO_UN;
      } else {
        this.no_un = integer4;
      } 
      String str1 = paramBuilder.portrait;
      if (str1 == null) {
        this.portrait = "";
      } else {
        this.portrait = str1;
      } 
      str1 = paramBuilder.mobile;
      if (str1 == null) {
        this.mobile = "";
      } else {
        this.mobile = str1;
      } 
      str1 = paramBuilder.email;
      if (str1 == null) {
        this.email = "";
      } else {
        this.email = str1;
      } 
      str1 = paramBuilder.cookie;
      if (str1 == null) {
        this.cookie = "";
      } else {
        this.cookie = str1;
      } 
      Integer integer3 = paramBuilder.pn;
      if (integer3 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer3;
      } 
      this.common = paramBuilder.common;
      integer3 = paramBuilder.is_twzhibo;
      if (integer3 == null) {
        this.is_twzhibo = DEFAULT_IS_TWZHIBO;
      } else {
        this.is_twzhibo = integer3;
      } 
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
      Double double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
      Integer integer2 = paramBuilder.q_type;
      if (integer2 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer2;
      } 
      integer2 = paramBuilder.is_view_card;
      if (integer2 == null) {
        this.is_view_card = DEFAULT_IS_VIEW_CARD;
      } else {
        this.is_view_card = integer2;
      } 
      integer2 = paramBuilder.last_thread_time;
      if (integer2 == null) {
        this.last_thread_time = DEFAULT_LAST_THREAD_TIME;
      } else {
        this.last_thread_time = integer2;
      } 
      integer2 = paramBuilder.work_tab_id;
      if (integer2 == null) {
        this.work_tab_id = DEFAULT_WORK_TAB_ID;
      } else {
        this.work_tab_id = integer2;
      } 
      integer2 = paramBuilder.type;
      if (integer2 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer2;
      } 
      integer2 = paramBuilder.from_type;
      if (integer2 == null) {
        this.from_type = DEFAULT_FROM_TYPE;
      } else {
        this.from_type = integer2;
      } 
      Long long_1 = paramBuilder.begin_thread_id;
      if (long_1 == null) {
        this.begin_thread_id = DEFAULT_BEGIN_THREAD_ID;
      } else {
        this.begin_thread_id = long_1;
      } 
      Integer integer1 = paramBuilder.request_times;
      if (integer1 == null) {
        this.request_times = DEFAULT_REQUEST_TIMES;
      } else {
        this.request_times = integer1;
      } 
      integer = paramBuilder.page_source;
      if (integer == null) {
        this.page_source = DEFAULT_PAGE_SOURCE;
      } else {
        this.page_source = integer;
      } 
    } else {
      this.uid = ((Builder)integer).uid;
      this.rn = ((Builder)integer).rn;
      this.offset = ((Builder)integer).offset;
      this.is_thread = ((Builder)integer).is_thread;
      this.need_content = ((Builder)integer).need_content;
      this.forum_id = ((Builder)integer).forum_id;
      this.begin_time = ((Builder)integer).begin_time;
      this.end_time = ((Builder)integer).end_time;
      this.subtype = ((Builder)integer).subtype;
      this.check_login = ((Builder)integer).check_login;
      this.ip_str = ((Builder)integer).ip_str;
      this.ip_int = ((Builder)integer).ip_int;
      this.module_name = ((Builder)integer).module_name;
      this.st_type = ((Builder)integer).st_type;
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
      this.cookie = ((Builder)integer).cookie;
      this.pn = ((Builder)integer).pn;
      this.common = ((Builder)integer).common;
      this.is_twzhibo = ((Builder)integer).is_twzhibo;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.scr_dip = ((Builder)integer).scr_dip;
      this.q_type = ((Builder)integer).q_type;
      this.is_view_card = ((Builder)integer).is_view_card;
      this.last_thread_time = ((Builder)integer).last_thread_time;
      this.work_tab_id = ((Builder)integer).work_tab_id;
      this.type = ((Builder)integer).type;
      this.from_type = ((Builder)integer).from_type;
      this.begin_thread_id = ((Builder)integer).begin_thread_id;
      this.request_times = ((Builder)integer).request_times;
      this.page_source = ((Builder)integer).page_source;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public Long begin_thread_id;
    
    public Integer begin_time;
    
    public Integer check_login;
    
    public CommonReq common;
    
    public String cookie;
    
    public String email;
    
    public Integer end_time;
    
    public Long forum_id;
    
    public Integer from_type;
    
    public Integer ip_int;
    
    public String ip_str;
    
    public Integer is_thread;
    
    public Integer is_twzhibo;
    
    public Integer is_view_card;
    
    public Integer last_thread_time;
    
    public Integer login;
    
    public String mobile;
    
    public String module_name;
    
    public Integer need_content;
    
    public Integer no_un;
    
    public Integer offset;
    
    public Integer page_source;
    
    public Integer pn;
    
    public String portrait;
    
    public Integer q_type;
    
    public Integer request_times;
    
    public Integer rn;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public Integer smile_grade;
    
    public Integer st_param;
    
    public Integer st_type;
    
    public Integer subtype;
    
    public Integer support_noun;
    
    public Integer type;
    
    public Long uid;
    
    public Long user_id;
    
    public String user_name;
    
    public Integer work_tab_id;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.uid = param1DataReq.uid;
      this.rn = param1DataReq.rn;
      this.offset = param1DataReq.offset;
      this.is_thread = param1DataReq.is_thread;
      this.need_content = param1DataReq.need_content;
      this.forum_id = param1DataReq.forum_id;
      this.begin_time = param1DataReq.begin_time;
      this.end_time = param1DataReq.end_time;
      this.subtype = param1DataReq.subtype;
      this.check_login = param1DataReq.check_login;
      this.ip_str = param1DataReq.ip_str;
      this.ip_int = param1DataReq.ip_int;
      this.module_name = param1DataReq.module_name;
      this.st_type = param1DataReq.st_type;
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
      this.cookie = param1DataReq.cookie;
      this.pn = param1DataReq.pn;
      this.common = param1DataReq.common;
      this.is_twzhibo = param1DataReq.is_twzhibo;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.q_type = param1DataReq.q_type;
      this.is_view_card = param1DataReq.is_view_card;
      this.last_thread_time = param1DataReq.last_thread_time;
      this.work_tab_id = param1DataReq.work_tab_id;
      this.type = param1DataReq.type;
      this.from_type = param1DataReq.from_type;
      this.begin_thread_id = param1DataReq.begin_thread_id;
      this.request_times = param1DataReq.request_times;
      this.page_source = param1DataReq.page_source;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
