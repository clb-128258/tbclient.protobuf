package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AppDownloadInfo;
import tbclient.BusinessPromotBannerMedia;

public final class BusinessPromot extends Message {
  public static final Integer DEFAULT_BANNER_WAIT_INTERVAL;
  
  public static final Integer DEFAULT_BAN_DIALOG;
  
  public static final List<BusinessPromotCommentList> DEFAULT_COMMENT_LIST;
  
  public static final String DEFAULT_COVER_URL = "";
  
  public static final String DEFAULT_DOWNLOAD_APPID = "";
  
  public static final String DEFAULT_DOWNLOAD_APPNAME = "";
  
  public static final String DEFAULT_DOWNLOAD_DEVELOPER = "";
  
  public static final String DEFAULT_DOWNLOAD_EFFECT = "";
  
  public static final String DEFAULT_DOWNLOAD_IMG = "";
  
  public static final String DEFAULT_DOWNLOAD_ITEM_ID = "";
  
  public static final String DEFAULT_DOWNLOAD_PACKAGE_NAME = "";
  
  public static final String DEFAULT_DOWNLOAD_PACKAGE_SIZE = "";
  
  public static final String DEFAULT_DOWNLOAD_PRIVACY_POLICY = "";
  
  public static final String DEFAULT_DOWNLOAD_URL = "";
  
  public static final String DEFAULT_DOWNLOAD_USER_POWER = "";
  
  public static final String DEFAULT_DOWNLOAD_VERSION = "";
  
  public static final Integer DEFAULT_END_TIME;
  
  public static final Long DEFAULT_ID;
  
  public static final String DEFAULT_IMG = "";
  
  public static final String DEFAULT_IMG_POPUP = "";
  
  public static final Boolean DEFAULT_IS_AD;
  
  public static final Boolean DEFAULT_IS_ALLOW_SHAKE;
  
  public static final Boolean DEFAULT_IS_DOWNLOAD;
  
  public static final Integer DEFAULT_IS_EXPAND;
  
  public static final Integer DEFAULT_IS_SHIELD_BANNER;
  
  public static final Integer DEFAULT_JOIN_NUM;
  
  public static final String DEFAULT_LIGHTHOUSE_URL = "";
  
  public static final Integer DEFAULT_NOFOCUS_POP;
  
  public static final Integer DEFAULT_NOSIGN_POP;
  
  public static final String DEFAULT_PACKAGE_NAME = "";
  
  public static final String DEFAULT_POPUP_JUMP_URL = "";
  
  public static final String DEFAULT_POPUP_PACKAGE_NAME = "";
  
  public static final String DEFAULT_POPUP_SCHEME = "";
  
  public static final Integer DEFAULT_POP_CLOSE_SECOND;
  
  public static final Integer DEFAULT_POP_NUM;
  
  public static final Integer DEFAULT_POP_TYPE;
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final Integer DEFAULT_START_TIME;
  
  public static final List<String> DEFAULT_THIRD_STATISTICS_URL;
  
  public static final String DEFAULT_THREAD_ID = "";
  
  public static final Integer DEFAULT_THREAD_TYPE;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_URL = "";
  
  public static final String DEFAULT_VIDEO_URL = "";
  
  @ProtoField(tag = 30, type = Message.Datatype.INT32)
  public final Integer ban_dialog;
  
  @ProtoField(tag = 40)
  public final BusinessPromotBannerMedia banner_media;
  
  @ProtoField(tag = 43, type = Message.Datatype.UINT32)
  public final Integer banner_wait_interval;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<BusinessPromotCommentList> comment_list;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String cover_url;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String download_appid;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String download_appname;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String download_developer;
  
  @ProtoField(tag = 31, type = Message.Datatype.STRING)
  public final String download_effect;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String download_img;
  
  @ProtoField(tag = 47)
  public final AppDownloadInfo download_info;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String download_item_id;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String download_package_name;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String download_package_size;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String download_privacy_policy;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String download_url;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String download_user_power;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String download_version;
  
  @ProtoField(tag = 39, type = Message.Datatype.UINT32)
  public final Integer end_time;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String img;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String img_popup;
  
  @ProtoField(tag = 14, type = Message.Datatype.BOOL)
  public final Boolean is_ad;
  
  @ProtoField(tag = 13, type = Message.Datatype.BOOL)
  public final Boolean is_allow_shake;
  
  @ProtoField(tag = 24, type = Message.Datatype.BOOL)
  public final Boolean is_download;
  
  @ProtoField(tag = 36, type = Message.Datatype.UINT32)
  public final Integer is_expand;
  
  @ProtoField(tag = 37, type = Message.Datatype.UINT32)
  public final Integer is_shield_banner;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer join_num;
  
  @ProtoField(tag = 41, type = Message.Datatype.STRING)
  public final String lighthouse_url;
  
  @ProtoField(tag = 34, type = Message.Datatype.UINT32)
  public final Integer nofocus_pop;
  
  @ProtoField(tag = 35, type = Message.Datatype.UINT32)
  public final Integer nosign_pop;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String package_name;
  
  @ProtoField(tag = 42, type = Message.Datatype.UINT32)
  public final Integer pop_close_second;
  
  @ProtoField(tag = 33, type = Message.Datatype.UINT32)
  public final Integer pop_num;
  
  @ProtoField(tag = 32, type = Message.Datatype.UINT32)
  public final Integer pop_type;
  
  @ProtoField(tag = 44, type = Message.Datatype.STRING)
  public final String popup_jump_url;
  
  @ProtoField(tag = 46, type = Message.Datatype.STRING)
  public final String popup_package_name;
  
  @ProtoField(tag = 45, type = Message.Datatype.STRING)
  public final String popup_scheme;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 38, type = Message.Datatype.UINT32)
  public final Integer start_time;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 12, type = Message.Datatype.STRING)
  public final List<String> third_statistics_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String thread_id;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer thread_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String url;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String video_url;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_JOIN_NUM = integer;
    DEFAULT_COMMENT_LIST = Collections.emptyList();
    DEFAULT_ID = Long.valueOf(0L);
    DEFAULT_THREAD_TYPE = integer;
    DEFAULT_THIRD_STATISTICS_URL = Collections.emptyList();
    Boolean bool = Boolean.FALSE;
    DEFAULT_IS_ALLOW_SHAKE = bool;
    DEFAULT_IS_AD = bool;
    DEFAULT_IS_DOWNLOAD = bool;
    DEFAULT_BAN_DIALOG = integer;
    DEFAULT_POP_TYPE = integer;
    DEFAULT_POP_NUM = integer;
    DEFAULT_NOFOCUS_POP = integer;
    DEFAULT_NOSIGN_POP = integer;
    DEFAULT_IS_EXPAND = integer;
    DEFAULT_IS_SHIELD_BANNER = integer;
    DEFAULT_START_TIME = integer;
    DEFAULT_END_TIME = integer;
    DEFAULT_POP_CLOSE_SECOND = integer;
    DEFAULT_BANNER_WAIT_INTERVAL = integer;
  }
  
  public BusinessPromot(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str8 = paramBuilder.title;
      if (str8 == null) {
        this.title = "";
      } else {
        this.title = str8;
      } 
      str8 = paramBuilder.img;
      if (str8 == null) {
        this.img = "";
      } else {
        this.img = str8;
      } 
      str8 = paramBuilder.img_popup;
      if (str8 == null) {
        this.img_popup = "";
      } else {
        this.img_popup = str8;
      } 
      Integer integer6 = paramBuilder.type;
      if (integer6 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer6;
      } 
      String str7 = paramBuilder.thread_id;
      if (str7 == null) {
        this.thread_id = "";
      } else {
        this.thread_id = str7;
      } 
      str7 = paramBuilder.url;
      if (str7 == null) {
        this.url = "";
      } else {
        this.url = str7;
      } 
      Integer integer5 = paramBuilder.join_num;
      if (integer5 == null) {
        this.join_num = DEFAULT_JOIN_NUM;
      } else {
        this.join_num = integer5;
      } 
      List<BusinessPromotCommentList> list1 = paramBuilder.comment_list;
      if (list1 == null) {
        this.comment_list = DEFAULT_COMMENT_LIST;
      } else {
        this.comment_list = Message.immutableCopyOf(list1);
      } 
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      Integer integer4 = paramBuilder.thread_type;
      if (integer4 == null) {
        this.thread_type = DEFAULT_THREAD_TYPE;
      } else {
        this.thread_type = integer4;
      } 
      String str6 = paramBuilder.schema;
      if (str6 == null) {
        this.schema = "";
      } else {
        this.schema = str6;
      } 
      List<String> list = paramBuilder.third_statistics_url;
      if (list == null) {
        this.third_statistics_url = DEFAULT_THIRD_STATISTICS_URL;
      } else {
        this.third_statistics_url = Message.immutableCopyOf(list);
      } 
      Boolean bool2 = paramBuilder.is_allow_shake;
      if (bool2 == null) {
        this.is_allow_shake = DEFAULT_IS_ALLOW_SHAKE;
      } else {
        this.is_allow_shake = bool2;
      } 
      bool2 = paramBuilder.is_ad;
      if (bool2 == null) {
        this.is_ad = DEFAULT_IS_AD;
      } else {
        this.is_ad = bool2;
      } 
      String str5 = paramBuilder.package_name;
      if (str5 == null) {
        this.package_name = "";
      } else {
        this.package_name = str5;
      } 
      str5 = paramBuilder.download_appname;
      if (str5 == null) {
        this.download_appname = "";
      } else {
        this.download_appname = str5;
      } 
      str5 = paramBuilder.download_developer;
      if (str5 == null) {
        this.download_developer = "";
      } else {
        this.download_developer = str5;
      } 
      str5 = paramBuilder.download_package_size;
      if (str5 == null) {
        this.download_package_size = "";
      } else {
        this.download_package_size = str5;
      } 
      str5 = paramBuilder.download_privacy_policy;
      if (str5 == null) {
        this.download_privacy_policy = "";
      } else {
        this.download_privacy_policy = str5;
      } 
      str5 = paramBuilder.download_url;
      if (str5 == null) {
        this.download_url = "";
      } else {
        this.download_url = str5;
      } 
      str5 = paramBuilder.download_img;
      if (str5 == null) {
        this.download_img = "";
      } else {
        this.download_img = str5;
      } 
      str5 = paramBuilder.download_version;
      if (str5 == null) {
        this.download_version = "";
      } else {
        this.download_version = str5;
      } 
      str5 = paramBuilder.download_user_power;
      if (str5 == null) {
        this.download_user_power = "";
      } else {
        this.download_user_power = str5;
      } 
      Boolean bool1 = paramBuilder.is_download;
      if (bool1 == null) {
        this.is_download = DEFAULT_IS_DOWNLOAD;
      } else {
        this.is_download = bool1;
      } 
      String str4 = paramBuilder.download_item_id;
      if (str4 == null) {
        this.download_item_id = "";
      } else {
        this.download_item_id = str4;
      } 
      str4 = paramBuilder.download_package_name;
      if (str4 == null) {
        this.download_package_name = "";
      } else {
        this.download_package_name = str4;
      } 
      str4 = paramBuilder.download_appid;
      if (str4 == null) {
        this.download_appid = "";
      } else {
        this.download_appid = str4;
      } 
      str4 = paramBuilder.cover_url;
      if (str4 == null) {
        this.cover_url = "";
      } else {
        this.cover_url = str4;
      } 
      str4 = paramBuilder.video_url;
      if (str4 == null) {
        this.video_url = "";
      } else {
        this.video_url = str4;
      } 
      Integer integer3 = paramBuilder.ban_dialog;
      if (integer3 == null) {
        this.ban_dialog = DEFAULT_BAN_DIALOG;
      } else {
        this.ban_dialog = integer3;
      } 
      String str3 = paramBuilder.download_effect;
      if (str3 == null) {
        this.download_effect = "";
      } else {
        this.download_effect = str3;
      } 
      Integer integer2 = paramBuilder.pop_type;
      if (integer2 == null) {
        this.pop_type = DEFAULT_POP_TYPE;
      } else {
        this.pop_type = integer2;
      } 
      integer2 = paramBuilder.pop_num;
      if (integer2 == null) {
        this.pop_num = DEFAULT_POP_NUM;
      } else {
        this.pop_num = integer2;
      } 
      integer2 = paramBuilder.nofocus_pop;
      if (integer2 == null) {
        this.nofocus_pop = DEFAULT_NOFOCUS_POP;
      } else {
        this.nofocus_pop = integer2;
      } 
      integer2 = paramBuilder.nosign_pop;
      if (integer2 == null) {
        this.nosign_pop = DEFAULT_NOSIGN_POP;
      } else {
        this.nosign_pop = integer2;
      } 
      integer2 = paramBuilder.is_expand;
      if (integer2 == null) {
        this.is_expand = DEFAULT_IS_EXPAND;
      } else {
        this.is_expand = integer2;
      } 
      integer2 = paramBuilder.is_shield_banner;
      if (integer2 == null) {
        this.is_shield_banner = DEFAULT_IS_SHIELD_BANNER;
      } else {
        this.is_shield_banner = integer2;
      } 
      integer2 = paramBuilder.start_time;
      if (integer2 == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = integer2;
      } 
      integer2 = paramBuilder.end_time;
      if (integer2 == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = integer2;
      } 
      this.banner_media = paramBuilder.banner_media;
      String str2 = paramBuilder.lighthouse_url;
      if (str2 == null) {
        this.lighthouse_url = "";
      } else {
        this.lighthouse_url = str2;
      } 
      Integer integer1 = paramBuilder.pop_close_second;
      if (integer1 == null) {
        this.pop_close_second = DEFAULT_POP_CLOSE_SECOND;
      } else {
        this.pop_close_second = integer1;
      } 
      integer1 = paramBuilder.banner_wait_interval;
      if (integer1 == null) {
        this.banner_wait_interval = DEFAULT_BANNER_WAIT_INTERVAL;
      } else {
        this.banner_wait_interval = integer1;
      } 
      String str1 = paramBuilder.popup_jump_url;
      if (str1 == null) {
        this.popup_jump_url = "";
      } else {
        this.popup_jump_url = str1;
      } 
      str1 = paramBuilder.popup_scheme;
      if (str1 == null) {
        this.popup_scheme = "";
      } else {
        this.popup_scheme = str1;
      } 
      str1 = paramBuilder.popup_package_name;
      if (str1 == null) {
        this.popup_package_name = "";
      } else {
        this.popup_package_name = str1;
      } 
      this.download_info = paramBuilder.download_info;
    } else {
      this.title = paramBuilder.title;
      this.img = paramBuilder.img;
      this.img_popup = paramBuilder.img_popup;
      this.type = paramBuilder.type;
      this.thread_id = paramBuilder.thread_id;
      this.url = paramBuilder.url;
      this.join_num = paramBuilder.join_num;
      this.comment_list = Message.immutableCopyOf(paramBuilder.comment_list);
      this.id = paramBuilder.id;
      this.thread_type = paramBuilder.thread_type;
      this.schema = paramBuilder.schema;
      this.third_statistics_url = Message.immutableCopyOf(paramBuilder.third_statistics_url);
      this.is_allow_shake = paramBuilder.is_allow_shake;
      this.is_ad = paramBuilder.is_ad;
      this.package_name = paramBuilder.package_name;
      this.download_appname = paramBuilder.download_appname;
      this.download_developer = paramBuilder.download_developer;
      this.download_package_size = paramBuilder.download_package_size;
      this.download_privacy_policy = paramBuilder.download_privacy_policy;
      this.download_url = paramBuilder.download_url;
      this.download_img = paramBuilder.download_img;
      this.download_version = paramBuilder.download_version;
      this.download_user_power = paramBuilder.download_user_power;
      this.is_download = paramBuilder.is_download;
      this.download_item_id = paramBuilder.download_item_id;
      this.download_package_name = paramBuilder.download_package_name;
      this.download_appid = paramBuilder.download_appid;
      this.cover_url = paramBuilder.cover_url;
      this.video_url = paramBuilder.video_url;
      this.ban_dialog = paramBuilder.ban_dialog;
      this.download_effect = paramBuilder.download_effect;
      this.pop_type = paramBuilder.pop_type;
      this.pop_num = paramBuilder.pop_num;
      this.nofocus_pop = paramBuilder.nofocus_pop;
      this.nosign_pop = paramBuilder.nosign_pop;
      this.is_expand = paramBuilder.is_expand;
      this.is_shield_banner = paramBuilder.is_shield_banner;
      this.start_time = paramBuilder.start_time;
      this.end_time = paramBuilder.end_time;
      this.banner_media = paramBuilder.banner_media;
      this.lighthouse_url = paramBuilder.lighthouse_url;
      this.pop_close_second = paramBuilder.pop_close_second;
      this.banner_wait_interval = paramBuilder.banner_wait_interval;
      this.popup_jump_url = paramBuilder.popup_jump_url;
      this.popup_scheme = paramBuilder.popup_scheme;
      this.popup_package_name = paramBuilder.popup_package_name;
      this.download_info = paramBuilder.download_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<BusinessPromot> {
    public Integer ban_dialog;
    
    public BusinessPromotBannerMedia banner_media;
    
    public Integer banner_wait_interval;
    
    public List<BusinessPromotCommentList> comment_list;
    
    public String cover_url;
    
    public String download_appid;
    
    public String download_appname;
    
    public String download_developer;
    
    public String download_effect;
    
    public String download_img;
    
    public AppDownloadInfo download_info;
    
    public String download_item_id;
    
    public String download_package_name;
    
    public String download_package_size;
    
    public String download_privacy_policy;
    
    public String download_url;
    
    public String download_user_power;
    
    public String download_version;
    
    public Integer end_time;
    
    public Long id;
    
    public String img;
    
    public String img_popup;
    
    public Boolean is_ad;
    
    public Boolean is_allow_shake;
    
    public Boolean is_download;
    
    public Integer is_expand;
    
    public Integer is_shield_banner;
    
    public Integer join_num;
    
    public String lighthouse_url;
    
    public Integer nofocus_pop;
    
    public Integer nosign_pop;
    
    public String package_name;
    
    public Integer pop_close_second;
    
    public Integer pop_num;
    
    public Integer pop_type;
    
    public String popup_jump_url;
    
    public String popup_package_name;
    
    public String popup_scheme;
    
    public String schema;
    
    public Integer start_time;
    
    public List<String> third_statistics_url;
    
    public String thread_id;
    
    public Integer thread_type;
    
    public String title;
    
    public Integer type;
    
    public String url;
    
    public String video_url;
    
    public Builder() {}
    
    public Builder(BusinessPromot param1BusinessPromot) {
      super(param1BusinessPromot);
      if (param1BusinessPromot == null)
        return; 
      this.title = param1BusinessPromot.title;
      this.img = param1BusinessPromot.img;
      this.img_popup = param1BusinessPromot.img_popup;
      this.type = param1BusinessPromot.type;
      this.thread_id = param1BusinessPromot.thread_id;
      this.url = param1BusinessPromot.url;
      this.join_num = param1BusinessPromot.join_num;
      this.comment_list = Message.copyOf(param1BusinessPromot.comment_list);
      this.id = param1BusinessPromot.id;
      this.thread_type = param1BusinessPromot.thread_type;
      this.schema = param1BusinessPromot.schema;
      this.third_statistics_url = Message.copyOf(param1BusinessPromot.third_statistics_url);
      this.is_allow_shake = param1BusinessPromot.is_allow_shake;
      this.is_ad = param1BusinessPromot.is_ad;
      this.package_name = param1BusinessPromot.package_name;
      this.download_appname = param1BusinessPromot.download_appname;
      this.download_developer = param1BusinessPromot.download_developer;
      this.download_package_size = param1BusinessPromot.download_package_size;
      this.download_privacy_policy = param1BusinessPromot.download_privacy_policy;
      this.download_url = param1BusinessPromot.download_url;
      this.download_img = param1BusinessPromot.download_img;
      this.download_version = param1BusinessPromot.download_version;
      this.download_user_power = param1BusinessPromot.download_user_power;
      this.is_download = param1BusinessPromot.is_download;
      this.download_item_id = param1BusinessPromot.download_item_id;
      this.download_package_name = param1BusinessPromot.download_package_name;
      this.download_appid = param1BusinessPromot.download_appid;
      this.cover_url = param1BusinessPromot.cover_url;
      this.video_url = param1BusinessPromot.video_url;
      this.ban_dialog = param1BusinessPromot.ban_dialog;
      this.download_effect = param1BusinessPromot.download_effect;
      this.pop_type = param1BusinessPromot.pop_type;
      this.pop_num = param1BusinessPromot.pop_num;
      this.nofocus_pop = param1BusinessPromot.nofocus_pop;
      this.nosign_pop = param1BusinessPromot.nosign_pop;
      this.is_expand = param1BusinessPromot.is_expand;
      this.is_shield_banner = param1BusinessPromot.is_shield_banner;
      this.start_time = param1BusinessPromot.start_time;
      this.end_time = param1BusinessPromot.end_time;
      this.banner_media = param1BusinessPromot.banner_media;
      this.lighthouse_url = param1BusinessPromot.lighthouse_url;
      this.pop_close_second = param1BusinessPromot.pop_close_second;
      this.banner_wait_interval = param1BusinessPromot.banner_wait_interval;
      this.popup_jump_url = param1BusinessPromot.popup_jump_url;
      this.popup_scheme = param1BusinessPromot.popup_scheme;
      this.popup_package_name = param1BusinessPromot.popup_package_name;
      this.download_info = param1BusinessPromot.download_info;
    }
    
    public BusinessPromot build(boolean param1Boolean) {
      return new BusinessPromot(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
