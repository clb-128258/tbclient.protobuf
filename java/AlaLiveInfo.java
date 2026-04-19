package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class AlaLiveInfo extends Message {
  public static final Integer DEFAULT_AUDIENCE_COUNT;
  
  public static final String DEFAULT_COVER = "";
  
  public static final String DEFAULT_COVER_WIDE = "";
  
  public static final String DEFAULT_CTR_FEA = "";
  
  public static final String DEFAULT_DESCRIPTION = "";
  
  public static final List<DislikeInfo> DEFAULT_DISLIKE_INFO;
  
  public static final Long DEFAULT_DISTANCE;
  
  public static final Integer DEFAULT_DURATION;
  
  public static final String DEFAULT_FIRST_HEADLINE = "";
  
  public static final String DEFAULT_FLV = "";
  
  public static final String DEFAULT_FORUM_USER_LIVE_MSG = "";
  
  public static final Integer DEFAULT_FRS_TOPLIVE_FORCE;
  
  public static final String DEFAULT_FRS_TOPLIVE_PIC = "";
  
  public static final Integer DEFAULT_FRS_TOPLIVE_TYPE;
  
  public static final Long DEFAULT_GROUP_ID;
  
  public static final String DEFAULT_HLS_URL = "";
  
  public static final String DEFAULT_LABEL_NAME = "";
  
  public static final Integer DEFAULT_LIVE_FROM;
  
  public static final Long DEFAULT_LIVE_ID;
  
  public static final Integer DEFAULT_LIVE_STATUS;
  
  public static final Integer DEFAULT_LIVE_TYPE;
  
  public static final String DEFAULT_MEDIA_ID = "";
  
  public static final String DEFAULT_MEDIA_PIC = "";
  
  public static final String DEFAULT_MEDIA_SUBTITLE = "";
  
  public static final String DEFAULT_MEDIA_URL = "";
  
  public static final Integer DEFAULT_OPEN_RECOM_DURATION;
  
  public static final Integer DEFAULT_OPEN_RECOM_FANS;
  
  public static final Integer DEFAULT_OPEN_RECOM_LOCATION;
  
  public static final Integer DEFAULT_OPEN_RECOM_REASON;
  
  public static final Integer DEFAULT_PAGE_FROM;
  
  public static final Integer DEFAULT_PB_DISPLAY_TYPE;
  
  public static final String DEFAULT_RECOM_REASON = "";
  
  public static final Long DEFAULT_ROOM_ID;
  
  public static final String DEFAULT_ROOM_NAME = "";
  
  public static final Integer DEFAULT_ROOM_STATUS;
  
  public static final String DEFAULT_ROUTER_TYPE = "";
  
  public static final String DEFAULT_RTMP_URL = "";
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final Integer DEFAULT_SCREEN_DIRECTION;
  
  public static final String DEFAULT_SECOND_HEADLINE = "";
  
  public static final String DEFAULT_SESSION_ID = "";
  
  public static final Integer DEFAULT_SHOW_PAGE;
  
  public static final List<AlaStageDislikeInfo> DEFAULT_STAGE_DISLIKE_INFO;
  
  public static final String DEFAULT_THIRD_APP_ID = "";
  
  public static final String DEFAULT_THIRD_LIVE_TYPE = "";
  
  public static final String DEFAULT_THIRD_ROOM_ID = "";
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final String DEFAULT_YY_SOURCE = "";
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT32)
  public final Integer audience_count;
  
  @ProtoField(tag = 25)
  public final AlaChallengeInfo challenge_info;
  
  @ProtoField(tag = 57)
  public final WidthHeight container_size;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String cover;
  
  @ProtoField(tag = 48, type = Message.Datatype.STRING)
  public final String cover_wide;
  
  @ProtoField(tag = 58, type = Message.Datatype.STRING)
  public final String ctr_fea;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String description;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 43)
  public final List<DislikeInfo> dislike_info;
  
  @ProtoField(tag = 20, type = Message.Datatype.UINT64)
  public final Long distance;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer duration;
  
  @ProtoField(tag = 34, type = Message.Datatype.STRING)
  public final String first_headline;
  
  @ProtoField(tag = 52, type = Message.Datatype.STRING)
  public final String flv;
  
  @ProtoField(tag = 47, type = Message.Datatype.STRING)
  public final String forum_user_live_msg;
  
  @ProtoField(tag = 28, type = Message.Datatype.INT32)
  public final Integer frs_toplive_force;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String frs_toplive_pic;
  
  @ProtoField(tag = 26, type = Message.Datatype.INT32)
  public final Integer frs_toplive_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long group_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String hls_url;
  
  @ProtoField(tag = 24)
  public final AlaCoverLabel label;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String label_name;
  
  @ProtoField(tag = 29, type = Message.Datatype.INT32)
  public final Integer live_from;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long live_id;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer live_status;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT32)
  public final Integer live_type;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String media_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String media_pic;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String media_subtitle;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String media_url;
  
  @ProtoField(tag = 41, type = Message.Datatype.UINT32)
  public final Integer open_recom_duration;
  
  @ProtoField(tag = 40, type = Message.Datatype.UINT32)
  public final Integer open_recom_fans;
  
  @ProtoField(tag = 39, type = Message.Datatype.UINT32)
  public final Integer open_recom_location;
  
  @ProtoField(tag = 38, type = Message.Datatype.UINT32)
  public final Integer open_recom_reason;
  
  @ProtoField(tag = 54, type = Message.Datatype.INT32)
  public final Integer page_from;
  
  @ProtoField(tag = 36, type = Message.Datatype.UINT32)
  public final Integer pb_display_type;
  
  @ProtoField(tag = 56)
  public final WidthHeight player_size;
  
  @ProtoField(tag = 37, type = Message.Datatype.STRING)
  public final String recom_reason;
  
  @ProtoField(tag = 44, type = Message.Datatype.UINT64)
  public final Long room_id;
  
  @ProtoField(tag = 46, type = Message.Datatype.STRING)
  public final String room_name;
  
  @ProtoField(tag = 45, type = Message.Datatype.INT32)
  public final Integer room_status;
  
  @ProtoField(tag = 32, type = Message.Datatype.STRING)
  public final String router_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String rtmp_url;
  
  @ProtoField(tag = 55, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(tag = 16, type = Message.Datatype.UINT32)
  public final Integer screen_direction;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String second_headline;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String session_id;
  
  @ProtoField(tag = 19)
  public final AlaShareInfo share_info;
  
  @ProtoField(tag = 50, type = Message.Datatype.INT32)
  public final Integer show_page;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 23)
  public final List<AlaStageDislikeInfo> stage_dislike_info;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String third_app_id;
  
  @ProtoField(tag = 33, type = Message.Datatype.STRING)
  public final String third_live_type;
  
  @ProtoField(tag = 31, type = Message.Datatype.STRING)
  public final String third_room_id;
  
  @ProtoField(tag = 22, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 12)
  public final AlaUserInfo user_info;
  
  @ProtoField(tag = 51)
  public final UniversalLabel user_label;
  
  @ProtoField(tag = 49)
  public final YyExt yy_ext;
  
  @ProtoField(tag = 59, type = Message.Datatype.STRING)
  public final String yy_source;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_LIVE_ID = long_;
    DEFAULT_GROUP_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_DURATION = integer;
    DEFAULT_AUDIENCE_COUNT = integer;
    DEFAULT_LIVE_TYPE = integer;
    DEFAULT_SCREEN_DIRECTION = integer;
    DEFAULT_LIVE_STATUS = integer;
    DEFAULT_DISTANCE = long_;
    DEFAULT_THREAD_ID = long_;
    DEFAULT_STAGE_DISLIKE_INFO = Collections.emptyList();
    DEFAULT_FRS_TOPLIVE_TYPE = integer;
    DEFAULT_FRS_TOPLIVE_FORCE = integer;
    DEFAULT_LIVE_FROM = integer;
    DEFAULT_PB_DISPLAY_TYPE = integer;
    DEFAULT_OPEN_RECOM_REASON = integer;
    DEFAULT_OPEN_RECOM_LOCATION = integer;
    DEFAULT_OPEN_RECOM_FANS = integer;
    DEFAULT_OPEN_RECOM_DURATION = integer;
    DEFAULT_DISLIKE_INFO = Collections.emptyList();
    DEFAULT_ROOM_ID = long_;
    DEFAULT_ROOM_STATUS = integer;
    DEFAULT_SHOW_PAGE = integer;
    DEFAULT_PAGE_FROM = integer;
  }
  
  public AlaLiveInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_5 = paramBuilder.live_id;
      if (long_5 == null) {
        this.live_id = DEFAULT_LIVE_ID;
      } else {
        this.live_id = long_5;
      } 
      String str10 = paramBuilder.cover;
      if (str10 == null) {
        this.cover = "";
      } else {
        this.cover = str10;
      } 
      str10 = paramBuilder.session_id;
      if (str10 == null) {
        this.session_id = "";
      } else {
        this.session_id = str10;
      } 
      str10 = paramBuilder.rtmp_url;
      if (str10 == null) {
        this.rtmp_url = "";
      } else {
        this.rtmp_url = str10;
      } 
      str10 = paramBuilder.hls_url;
      if (str10 == null) {
        this.hls_url = "";
      } else {
        this.hls_url = str10;
      } 
      Long long_4 = paramBuilder.group_id;
      if (long_4 == null) {
        this.group_id = DEFAULT_GROUP_ID;
      } else {
        this.group_id = long_4;
      } 
      String str9 = paramBuilder.media_url;
      if (str9 == null) {
        this.media_url = "";
      } else {
        this.media_url = str9;
      } 
      str9 = paramBuilder.media_pic;
      if (str9 == null) {
        this.media_pic = "";
      } else {
        this.media_pic = str9;
      } 
      str9 = paramBuilder.media_id;
      if (str9 == null) {
        this.media_id = "";
      } else {
        this.media_id = str9;
      } 
      str9 = paramBuilder.media_subtitle;
      if (str9 == null) {
        this.media_subtitle = "";
      } else {
        this.media_subtitle = str9;
      } 
      str9 = paramBuilder.description;
      if (str9 == null) {
        this.description = "";
      } else {
        this.description = str9;
      } 
      this.user_info = paramBuilder.user_info;
      Integer integer9 = paramBuilder.duration;
      if (integer9 == null) {
        this.duration = DEFAULT_DURATION;
      } else {
        this.duration = integer9;
      } 
      integer9 = paramBuilder.audience_count;
      if (integer9 == null) {
        this.audience_count = DEFAULT_AUDIENCE_COUNT;
      } else {
        this.audience_count = integer9;
      } 
      integer9 = paramBuilder.live_type;
      if (integer9 == null) {
        this.live_type = DEFAULT_LIVE_TYPE;
      } else {
        this.live_type = integer9;
      } 
      integer9 = paramBuilder.screen_direction;
      if (integer9 == null) {
        this.screen_direction = DEFAULT_SCREEN_DIRECTION;
      } else {
        this.screen_direction = integer9;
      } 
      String str8 = paramBuilder.label_name;
      if (str8 == null) {
        this.label_name = "";
      } else {
        this.label_name = str8;
      } 
      Integer integer8 = paramBuilder.live_status;
      if (integer8 == null) {
        this.live_status = DEFAULT_LIVE_STATUS;
      } else {
        this.live_status = integer8;
      } 
      this.share_info = paramBuilder.share_info;
      Long long_3 = paramBuilder.distance;
      if (long_3 == null) {
        this.distance = DEFAULT_DISTANCE;
      } else {
        this.distance = long_3;
      } 
      String str7 = paramBuilder.third_app_id;
      if (str7 == null) {
        this.third_app_id = "";
      } else {
        this.third_app_id = str7;
      } 
      Long long_2 = paramBuilder.thread_id;
      if (long_2 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_2;
      } 
      List<AlaStageDislikeInfo> list1 = paramBuilder.stage_dislike_info;
      if (list1 == null) {
        this.stage_dislike_info = DEFAULT_STAGE_DISLIKE_INFO;
      } else {
        this.stage_dislike_info = Message.immutableCopyOf(list1);
      } 
      this.label = paramBuilder.label;
      this.challenge_info = paramBuilder.challenge_info;
      Integer integer7 = paramBuilder.frs_toplive_type;
      if (integer7 == null) {
        this.frs_toplive_type = DEFAULT_FRS_TOPLIVE_TYPE;
      } else {
        this.frs_toplive_type = integer7;
      } 
      String str6 = paramBuilder.frs_toplive_pic;
      if (str6 == null) {
        this.frs_toplive_pic = "";
      } else {
        this.frs_toplive_pic = str6;
      } 
      Integer integer6 = paramBuilder.frs_toplive_force;
      if (integer6 == null) {
        this.frs_toplive_force = DEFAULT_FRS_TOPLIVE_FORCE;
      } else {
        this.frs_toplive_force = integer6;
      } 
      integer6 = paramBuilder.live_from;
      if (integer6 == null) {
        this.live_from = DEFAULT_LIVE_FROM;
      } else {
        this.live_from = integer6;
      } 
      String str5 = paramBuilder.third_room_id;
      if (str5 == null) {
        this.third_room_id = "";
      } else {
        this.third_room_id = str5;
      } 
      str5 = paramBuilder.router_type;
      if (str5 == null) {
        this.router_type = "";
      } else {
        this.router_type = str5;
      } 
      str5 = paramBuilder.third_live_type;
      if (str5 == null) {
        this.third_live_type = "";
      } else {
        this.third_live_type = str5;
      } 
      str5 = paramBuilder.first_headline;
      if (str5 == null) {
        this.first_headline = "";
      } else {
        this.first_headline = str5;
      } 
      str5 = paramBuilder.second_headline;
      if (str5 == null) {
        this.second_headline = "";
      } else {
        this.second_headline = str5;
      } 
      Integer integer5 = paramBuilder.pb_display_type;
      if (integer5 == null) {
        this.pb_display_type = DEFAULT_PB_DISPLAY_TYPE;
      } else {
        this.pb_display_type = integer5;
      } 
      String str4 = paramBuilder.recom_reason;
      if (str4 == null) {
        this.recom_reason = "";
      } else {
        this.recom_reason = str4;
      } 
      Integer integer4 = paramBuilder.open_recom_reason;
      if (integer4 == null) {
        this.open_recom_reason = DEFAULT_OPEN_RECOM_REASON;
      } else {
        this.open_recom_reason = integer4;
      } 
      integer4 = paramBuilder.open_recom_location;
      if (integer4 == null) {
        this.open_recom_location = DEFAULT_OPEN_RECOM_LOCATION;
      } else {
        this.open_recom_location = integer4;
      } 
      integer4 = paramBuilder.open_recom_fans;
      if (integer4 == null) {
        this.open_recom_fans = DEFAULT_OPEN_RECOM_FANS;
      } else {
        this.open_recom_fans = integer4;
      } 
      integer4 = paramBuilder.open_recom_duration;
      if (integer4 == null) {
        this.open_recom_duration = DEFAULT_OPEN_RECOM_DURATION;
      } else {
        this.open_recom_duration = integer4;
      } 
      List<DislikeInfo> list = paramBuilder.dislike_info;
      if (list == null) {
        this.dislike_info = DEFAULT_DISLIKE_INFO;
      } else {
        this.dislike_info = Message.immutableCopyOf(list);
      } 
      Long long_1 = paramBuilder.room_id;
      if (long_1 == null) {
        this.room_id = DEFAULT_ROOM_ID;
      } else {
        this.room_id = long_1;
      } 
      Integer integer3 = paramBuilder.room_status;
      if (integer3 == null) {
        this.room_status = DEFAULT_ROOM_STATUS;
      } else {
        this.room_status = integer3;
      } 
      String str3 = paramBuilder.room_name;
      if (str3 == null) {
        this.room_name = "";
      } else {
        this.room_name = str3;
      } 
      str3 = paramBuilder.forum_user_live_msg;
      if (str3 == null) {
        this.forum_user_live_msg = "";
      } else {
        this.forum_user_live_msg = str3;
      } 
      str3 = paramBuilder.cover_wide;
      if (str3 == null) {
        this.cover_wide = "";
      } else {
        this.cover_wide = str3;
      } 
      this.yy_ext = paramBuilder.yy_ext;
      Integer integer2 = paramBuilder.show_page;
      if (integer2 == null) {
        this.show_page = DEFAULT_SHOW_PAGE;
      } else {
        this.show_page = integer2;
      } 
      this.user_label = paramBuilder.user_label;
      String str2 = paramBuilder.flv;
      if (str2 == null) {
        this.flv = "";
      } else {
        this.flv = str2;
      } 
      Integer integer1 = paramBuilder.page_from;
      if (integer1 == null) {
        this.page_from = DEFAULT_PAGE_FROM;
      } else {
        this.page_from = integer1;
      } 
      String str1 = paramBuilder.scheme;
      if (str1 == null) {
        this.scheme = "";
      } else {
        this.scheme = str1;
      } 
      this.player_size = paramBuilder.player_size;
      this.container_size = paramBuilder.container_size;
      str1 = paramBuilder.ctr_fea;
      if (str1 == null) {
        this.ctr_fea = "";
      } else {
        this.ctr_fea = str1;
      } 
      str = paramBuilder.yy_source;
      if (str == null) {
        this.yy_source = "";
      } else {
        this.yy_source = str;
      } 
    } else {
      this.live_id = ((Builder)str).live_id;
      this.cover = ((Builder)str).cover;
      this.session_id = ((Builder)str).session_id;
      this.rtmp_url = ((Builder)str).rtmp_url;
      this.hls_url = ((Builder)str).hls_url;
      this.group_id = ((Builder)str).group_id;
      this.media_url = ((Builder)str).media_url;
      this.media_pic = ((Builder)str).media_pic;
      this.media_id = ((Builder)str).media_id;
      this.media_subtitle = ((Builder)str).media_subtitle;
      this.description = ((Builder)str).description;
      this.user_info = ((Builder)str).user_info;
      this.duration = ((Builder)str).duration;
      this.audience_count = ((Builder)str).audience_count;
      this.live_type = ((Builder)str).live_type;
      this.screen_direction = ((Builder)str).screen_direction;
      this.label_name = ((Builder)str).label_name;
      this.live_status = ((Builder)str).live_status;
      this.share_info = ((Builder)str).share_info;
      this.distance = ((Builder)str).distance;
      this.third_app_id = ((Builder)str).third_app_id;
      this.thread_id = ((Builder)str).thread_id;
      this.stage_dislike_info = Message.immutableCopyOf(((Builder)str).stage_dislike_info);
      this.label = ((Builder)str).label;
      this.challenge_info = ((Builder)str).challenge_info;
      this.frs_toplive_type = ((Builder)str).frs_toplive_type;
      this.frs_toplive_pic = ((Builder)str).frs_toplive_pic;
      this.frs_toplive_force = ((Builder)str).frs_toplive_force;
      this.live_from = ((Builder)str).live_from;
      this.third_room_id = ((Builder)str).third_room_id;
      this.router_type = ((Builder)str).router_type;
      this.third_live_type = ((Builder)str).third_live_type;
      this.first_headline = ((Builder)str).first_headline;
      this.second_headline = ((Builder)str).second_headline;
      this.pb_display_type = ((Builder)str).pb_display_type;
      this.recom_reason = ((Builder)str).recom_reason;
      this.open_recom_reason = ((Builder)str).open_recom_reason;
      this.open_recom_location = ((Builder)str).open_recom_location;
      this.open_recom_fans = ((Builder)str).open_recom_fans;
      this.open_recom_duration = ((Builder)str).open_recom_duration;
      this.dislike_info = Message.immutableCopyOf(((Builder)str).dislike_info);
      this.room_id = ((Builder)str).room_id;
      this.room_status = ((Builder)str).room_status;
      this.room_name = ((Builder)str).room_name;
      this.forum_user_live_msg = ((Builder)str).forum_user_live_msg;
      this.cover_wide = ((Builder)str).cover_wide;
      this.yy_ext = ((Builder)str).yy_ext;
      this.show_page = ((Builder)str).show_page;
      this.user_label = ((Builder)str).user_label;
      this.flv = ((Builder)str).flv;
      this.page_from = ((Builder)str).page_from;
      this.scheme = ((Builder)str).scheme;
      this.player_size = ((Builder)str).player_size;
      this.container_size = ((Builder)str).container_size;
      this.ctr_fea = ((Builder)str).ctr_fea;
      this.yy_source = ((Builder)str).yy_source;
    } 
  }
  
  public static final class Builder extends Message.Builder<AlaLiveInfo> {
    public Integer audience_count;
    
    public AlaChallengeInfo challenge_info;
    
    public WidthHeight container_size;
    
    public String cover;
    
    public String cover_wide;
    
    public String ctr_fea;
    
    public String description;
    
    public List<DislikeInfo> dislike_info;
    
    public Long distance;
    
    public Integer duration;
    
    public String first_headline;
    
    public String flv;
    
    public String forum_user_live_msg;
    
    public Integer frs_toplive_force;
    
    public String frs_toplive_pic;
    
    public Integer frs_toplive_type;
    
    public Long group_id;
    
    public String hls_url;
    
    public AlaCoverLabel label;
    
    public String label_name;
    
    public Integer live_from;
    
    public Long live_id;
    
    public Integer live_status;
    
    public Integer live_type;
    
    public String media_id;
    
    public String media_pic;
    
    public String media_subtitle;
    
    public String media_url;
    
    public Integer open_recom_duration;
    
    public Integer open_recom_fans;
    
    public Integer open_recom_location;
    
    public Integer open_recom_reason;
    
    public Integer page_from;
    
    public Integer pb_display_type;
    
    public WidthHeight player_size;
    
    public String recom_reason;
    
    public Long room_id;
    
    public String room_name;
    
    public Integer room_status;
    
    public String router_type;
    
    public String rtmp_url;
    
    public String scheme;
    
    public Integer screen_direction;
    
    public String second_headline;
    
    public String session_id;
    
    public AlaShareInfo share_info;
    
    public Integer show_page;
    
    public List<AlaStageDislikeInfo> stage_dislike_info;
    
    public String third_app_id;
    
    public String third_live_type;
    
    public String third_room_id;
    
    public Long thread_id;
    
    public AlaUserInfo user_info;
    
    public UniversalLabel user_label;
    
    public YyExt yy_ext;
    
    public String yy_source;
    
    public Builder() {}
    
    public Builder(AlaLiveInfo param1AlaLiveInfo) {
      super(param1AlaLiveInfo);
      if (param1AlaLiveInfo == null)
        return; 
      this.live_id = param1AlaLiveInfo.live_id;
      this.cover = param1AlaLiveInfo.cover;
      this.session_id = param1AlaLiveInfo.session_id;
      this.rtmp_url = param1AlaLiveInfo.rtmp_url;
      this.hls_url = param1AlaLiveInfo.hls_url;
      this.group_id = param1AlaLiveInfo.group_id;
      this.media_url = param1AlaLiveInfo.media_url;
      this.media_pic = param1AlaLiveInfo.media_pic;
      this.media_id = param1AlaLiveInfo.media_id;
      this.media_subtitle = param1AlaLiveInfo.media_subtitle;
      this.description = param1AlaLiveInfo.description;
      this.user_info = param1AlaLiveInfo.user_info;
      this.duration = param1AlaLiveInfo.duration;
      this.audience_count = param1AlaLiveInfo.audience_count;
      this.live_type = param1AlaLiveInfo.live_type;
      this.screen_direction = param1AlaLiveInfo.screen_direction;
      this.label_name = param1AlaLiveInfo.label_name;
      this.live_status = param1AlaLiveInfo.live_status;
      this.share_info = param1AlaLiveInfo.share_info;
      this.distance = param1AlaLiveInfo.distance;
      this.third_app_id = param1AlaLiveInfo.third_app_id;
      this.thread_id = param1AlaLiveInfo.thread_id;
      this.stage_dislike_info = Message.copyOf(param1AlaLiveInfo.stage_dislike_info);
      this.label = param1AlaLiveInfo.label;
      this.challenge_info = param1AlaLiveInfo.challenge_info;
      this.frs_toplive_type = param1AlaLiveInfo.frs_toplive_type;
      this.frs_toplive_pic = param1AlaLiveInfo.frs_toplive_pic;
      this.frs_toplive_force = param1AlaLiveInfo.frs_toplive_force;
      this.live_from = param1AlaLiveInfo.live_from;
      this.third_room_id = param1AlaLiveInfo.third_room_id;
      this.router_type = param1AlaLiveInfo.router_type;
      this.third_live_type = param1AlaLiveInfo.third_live_type;
      this.first_headline = param1AlaLiveInfo.first_headline;
      this.second_headline = param1AlaLiveInfo.second_headline;
      this.pb_display_type = param1AlaLiveInfo.pb_display_type;
      this.recom_reason = param1AlaLiveInfo.recom_reason;
      this.open_recom_reason = param1AlaLiveInfo.open_recom_reason;
      this.open_recom_location = param1AlaLiveInfo.open_recom_location;
      this.open_recom_fans = param1AlaLiveInfo.open_recom_fans;
      this.open_recom_duration = param1AlaLiveInfo.open_recom_duration;
      this.dislike_info = Message.copyOf(param1AlaLiveInfo.dislike_info);
      this.room_id = param1AlaLiveInfo.room_id;
      this.room_status = param1AlaLiveInfo.room_status;
      this.room_name = param1AlaLiveInfo.room_name;
      this.forum_user_live_msg = param1AlaLiveInfo.forum_user_live_msg;
      this.cover_wide = param1AlaLiveInfo.cover_wide;
      this.yy_ext = param1AlaLiveInfo.yy_ext;
      this.show_page = param1AlaLiveInfo.show_page;
      this.user_label = param1AlaLiveInfo.user_label;
      this.flv = param1AlaLiveInfo.flv;
      this.page_from = param1AlaLiveInfo.page_from;
      this.scheme = param1AlaLiveInfo.scheme;
      this.player_size = param1AlaLiveInfo.player_size;
      this.container_size = param1AlaLiveInfo.container_size;
      this.ctr_fea = param1AlaLiveInfo.ctr_fea;
      this.yy_source = param1AlaLiveInfo.yy_source;
    }
    
    public AlaLiveInfo build(boolean param1Boolean) {
      return new AlaLiveInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
