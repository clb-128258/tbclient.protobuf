package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BannerList;
import tbclient.DeletedReasonInfo;
import tbclient.GameInfo;
import tbclient.ThemeColorInfo;

public final class ForumInfo extends Message {
  public static final String DEFAULT_ACCELERATE_COTENT = "";
  
  public static final Integer DEFAULT_ALBUM_OPEN_PHOTO_FRS;
  
  public static final String DEFAULT_AVATAR = "";
  
  public static final Integer DEFAULT_AVATAR_FUZZY_STATUS;
  
  public static final List<Badges> DEFAULT_BADGES;
  
  public static final Long DEFAULT_BE_TOP_LIMIT_TIME;
  
  public static final Integer DEFAULT_CAN_USE_ACCELERATE;
  
  public static final Integer DEFAULT_CUR_SCORE;
  
  public static final Integer DEFAULT_FAVO_TYPE;
  
  public static final String DEFAULT_FIRST_CLASS = "";
  
  public static final String DEFAULT_FORUM_GAME_LABEL = "";
  
  public static final String DEFAULT_FORUM_SHARE_LINK = "";
  
  public static final List<Calendar> DEFAULT_FORUM_SIGN_CALENDAR;
  
  public static final String DEFAULT_F_SHARE_IMG = "";
  
  public static final List<GameInfo> DEFAULT_GAME_CARD;
  
  public static final String DEFAULT_GAME_NAME = "";
  
  public static final String DEFAULT_GAME_URL = "";
  
  public static final List<Classify> DEFAULT_GOOD_CLASSIFY;
  
  public static final Integer DEFAULT_HAS_FRS_STAR;
  
  public static final Integer DEFAULT_HAS_GAME;
  
  public static final Integer DEFAULT_HAS_PAPER;
  
  public static final Integer DEFAULT_HAS_POSTPRE;
  
  public static final Long DEFAULT_HOT_NUM;
  
  public static final String DEFAULT_HUB_ICON = "";
  
  public static final Long DEFAULT_ID;
  
  public static final Integer DEFAULT_IS_BRAND_FORUM;
  
  public static final Integer DEFAULT_IS_EXISTS;
  
  public static final Integer DEFAULT_IS_FORBIDDEN;
  
  public static final Integer DEFAULT_IS_FRS_MASK;
  
  public static final Boolean DEFAULT_IS_HUB;
  
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final Integer DEFAULT_IS_LIVE_GAME;
  
  public static final Integer DEFAULT_IS_LIVE_GAME_FORUM;
  
  public static final Integer DEFAULT_IS_LOCAL_EFFECT;
  
  public static final Integer DEFAULT_IS_NEW_GAME_FORUM;
  
  public static final Integer DEFAULT_IS_PRIVATE_FORUM;
  
  public static final String DEFAULT_IS_READONLY = "";
  
  public static final Integer DEFAULT_IS_SEARCH_PEOPLE;
  
  public static final Integer DEFAULT_IS_SHOW_ALL_TOP_THREAD;
  
  public static final Integer DEFAULT_IS_SHOW_BAWUTASK;
  
  public static final Integer DEFAULT_IS_SHOW_FORUMRULE;
  
  public static final Integer DEFAULT_IS_STAGE_FORUM;
  
  public static final Integer DEFAULT_IS_SUPPORT_LOCAL;
  
  public static final String DEFAULT_IS_TOP_IMG = "";
  
  public static final Integer DEFAULT_LEVELUP_SCORE;
  
  public static final Integer DEFAULT_LEVEL_ID;
  
  public static final String DEFAULT_LEVEL_NAME = "";
  
  public static final String DEFAULT_LEVEL_SCHEMA = "";
  
  public static final List<Manager> DEFAULT_MANAGERS;
  
  public static final Integer DEFAULT_MEIZHI_TAG;
  
  public static final Integer DEFAULT_MEMBER_NUM;
  
  public static final Integer DEFAULT_MSG_BUBBLE_GUIDE_FREQUENCY;
  
  public static final Integer DEFAULT_MSG_BUBBLE_GUIDE_FREQUENCY_SPECIAL;
  
  public static final Integer DEFAULT_MSG_BUBBLE_GUIDE_FREQUENCY_UNREAD;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final List<RecommendForum> DEFAULT_RECOMMEND_FORUM;
  
  public static final String DEFAULT_RISK_TIP_NOTICE = "";
  
  public static final String DEFAULT_RISK_TIP_POP = "";
  
  public static final String DEFAULT_RISK_TIP_POP_TITLE = "";
  
  public static final String DEFAULT_SECOND_CLASS = "";
  
  public static final String DEFAULT_SLOGAN = "";
  
  public static final String DEFAULT_SPECIAL_FORUM_TYPE = "";
  
  public static final String DEFAULT_SUPERBOY = "";
  
  public static final Integer DEFAULT_THREAD_NUM;
  
  public static final String DEFAULT_TIDS = "";
  
  public static final List<TipInfo> DEFAULT_TIP_LIST;
  
  public static final String DEFAULT_TOPIC_SPECIAL_ICON = "";
  
  public static final String DEFAULT_TOPIC_SPECIAL_ICON_RIGHT = "";
  
  public static final Integer DEFAULT_USER_LEVEL;
  
  public static final String DEFAULT_WARNING_MSG = "";
  
  @ProtoField(tag = 50, type = Message.Datatype.STRING)
  public final String accelerate_cotent;
  
  @ProtoField(tag = 62)
  public final AcrossForumIcon across_forum_hide;
  
  @ProtoField(tag = 60)
  public final AcrossForumIcon across_forum_show;
  
  @ProtoField(tag = 56)
  public final Adkiller adkiller_data;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer album_open_photo_frs;
  
  @ProtoField(tag = 44)
  public final AnchorPower anchor_power;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 91, type = Message.Datatype.INT32)
  public final Integer avatar_fuzzy_status;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 34)
  public final List<Badges> badges;
  
  @ProtoField(tag = 32)
  public final Banner banner;
  
  @ProtoField(tag = 33)
  public final BannerList banner_list;
  
  @ProtoField(tag = 88, type = Message.Datatype.INT64)
  public final Long be_top_limit_time;
  
  @ProtoField(tag = 49, type = Message.Datatype.INT32)
  public final Integer can_use_accelerate;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer cur_score;
  
  @ProtoField(tag = 85)
  public final DeletedReasonInfo deleted_reason_info;
  
  @ProtoField(tag = 78, type = Message.Datatype.STRING)
  public final String f_share_img;
  
  @ProtoField(tag = 37, type = Message.Datatype.INT32)
  public final Integer favo_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String first_class;
  
  @ProtoField(tag = 27)
  public final ForumButton forum_button;
  
  @ProtoField(tag = 66, type = Message.Datatype.STRING)
  public final String forum_game_label;
  
  @ProtoField(tag = 79, type = Message.Datatype.STRING)
  public final String forum_share_link;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 18)
  public final List<Calendar> forum_sign_calendar;
  
  @ProtoField(tag = 55)
  public final MemberShowIcon forumvip_show_icon;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 53)
  public final List<GameInfo> game_card;
  
  @ProtoField(tag = 54, type = Message.Datatype.STRING)
  public final String game_name;
  
  @ProtoField(tag = 47, type = Message.Datatype.STRING)
  public final String game_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 21)
  public final List<Classify> good_classify;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer has_frs_star;
  
  @ProtoField(tag = 46, type = Message.Datatype.INT32)
  public final Integer has_game;
  
  @ProtoField(tag = 29, type = Message.Datatype.INT32)
  public final Integer has_paper;
  
  @ProtoField(tag = 26, type = Message.Datatype.INT32)
  public final Integer has_postpre;
  
  @ProtoField(tag = 96, type = Message.Datatype.INT64)
  public final Long hot_num;
  
  @ProtoField(tag = 97, type = Message.Datatype.STRING)
  public final String hub_icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 71, type = Message.Datatype.INT32)
  public final Integer is_brand_forum;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_exists;
  
  @ProtoField(tag = 36, type = Message.Datatype.INT32)
  public final Integer is_forbidden;
  
  @ProtoField(tag = 86, type = Message.Datatype.INT32)
  public final Integer is_frs_mask;
  
  @ProtoField(tag = 95, type = Message.Datatype.BOOL)
  public final Boolean is_hub;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer is_like;
  
  @ProtoField(tag = 64, type = Message.Datatype.INT32)
  public final Integer is_live_game;
  
  @ProtoField(tag = 63, type = Message.Datatype.INT32)
  public final Integer is_live_game_forum;
  
  @ProtoField(tag = 42, type = Message.Datatype.INT32)
  public final Integer is_local_effect;
  
  @ProtoField(tag = 65, type = Message.Datatype.INT32)
  public final Integer is_new_game_forum;
  
  @ProtoField(tag = 75, type = Message.Datatype.INT32)
  public final Integer is_private_forum;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String is_readonly;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT32)
  public final Integer is_search_people;
  
  @ProtoField(tag = 72, type = Message.Datatype.INT32)
  public final Integer is_show_all_top_thread;
  
  @ProtoField(tag = 77, type = Message.Datatype.INT32)
  public final Integer is_show_bawutask;
  
  @ProtoField(tag = 84, type = Message.Datatype.INT32)
  public final Integer is_show_forumrule;
  
  @ProtoField(tag = 30, type = Message.Datatype.INT32)
  public final Integer is_stage_forum;
  
  @ProtoField(tag = 41, type = Message.Datatype.INT32)
  public final Integer is_support_local;
  
  @ProtoField(tag = 74, type = Message.Datatype.STRING)
  public final String is_top_img;
  
  @ProtoField(tag = 35, type = Message.Datatype.INT32)
  public final Integer level_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String level_name;
  
  @ProtoField(tag = 92, type = Message.Datatype.STRING)
  public final String level_schema;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer levelup_score;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 17)
  public final List<Manager> managers;
  
  @ProtoField(tag = 31, type = Message.Datatype.INT32)
  public final Integer meizhi_tag;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer member_num;
  
  @ProtoField(tag = 87, type = Message.Datatype.INT32)
  public final Integer msg_bubble_guide_frequency;
  
  @ProtoField(tag = 90, type = Message.Datatype.INT32)
  public final Integer msg_bubble_guide_frequency_special;
  
  @ProtoField(tag = 89, type = Message.Datatype.INT32)
  public final Integer msg_bubble_guide_frequency_unread;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 52)
  public final TopNews news_info;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer post_num;
  
  @ProtoField(tag = 39)
  public final PostPrefix post_prefix;
  
  @ProtoField(tag = 61)
  public final PostTopic post_topic;
  
  @ProtoField(tag = 58)
  public final RealTime realtime_data;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 43)
  public final List<RecommendForum> recommend_forum;
  
  @ProtoField(tag = 48)
  public final RecomUserInfo recommend_user_info;
  
  @ProtoField(tag = 81, type = Message.Datatype.STRING)
  public final String risk_tip_notice;
  
  @ProtoField(tag = 80, type = Message.Datatype.STRING)
  public final String risk_tip_pop;
  
  @ProtoField(tag = 82, type = Message.Datatype.STRING)
  public final String risk_tip_pop_title;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String second_class;
  
  @ProtoField(tag = 15)
  public final SignInfo sign_in_info;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String slogan;
  
  @ProtoField(tag = 68, type = Message.Datatype.STRING)
  public final String special_forum_type;
  
  @ProtoField(tag = 40, type = Message.Datatype.STRING)
  public final String superboy;
  
  @ProtoField(tag = 38)
  public final TagInfo tag_info;
  
  @ProtoField(tag = 73)
  public final ThemeColorInfo theme_color;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer thread_num;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String tids;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 83)
  public final List<TipInfo> tip_list;
  
  @ProtoField(tag = 51)
  public final TopCode top_code;
  
  @ProtoField(tag = 28)
  public final TopNotice top_notice;
  
  @ProtoField(tag = 69, type = Message.Datatype.STRING)
  public final String topic_special_icon;
  
  @ProtoField(tag = 70, type = Message.Datatype.STRING)
  public final String topic_special_icon_right;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer user_level;
  
  @ProtoField(tag = 67, type = Message.Datatype.STRING)
  public final String warning_msg;
  
  @ProtoField(tag = 45)
  public final WorldCup worldcupinfo;
  
  @ProtoField(tag = 57)
  public final Yule yule;
  
  @ProtoField(tag = 16)
  public final Zhibo zhibo;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_EXISTS = integer;
    DEFAULT_IS_LIKE = integer;
    DEFAULT_USER_LEVEL = integer;
    DEFAULT_MEMBER_NUM = integer;
    DEFAULT_THREAD_NUM = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_HAS_FRS_STAR = integer;
    DEFAULT_CUR_SCORE = integer;
    DEFAULT_LEVELUP_SCORE = integer;
    DEFAULT_MANAGERS = Collections.emptyList();
    DEFAULT_FORUM_SIGN_CALENDAR = Collections.emptyList();
    DEFAULT_IS_SEARCH_PEOPLE = integer;
    DEFAULT_GOOD_CLASSIFY = Collections.emptyList();
    DEFAULT_ALBUM_OPEN_PHOTO_FRS = integer;
    DEFAULT_HAS_POSTPRE = integer;
    DEFAULT_HAS_PAPER = integer;
    DEFAULT_IS_STAGE_FORUM = integer;
    DEFAULT_MEIZHI_TAG = integer;
    DEFAULT_BADGES = Collections.emptyList();
    DEFAULT_LEVEL_ID = integer;
    DEFAULT_IS_FORBIDDEN = integer;
    DEFAULT_FAVO_TYPE = integer;
    DEFAULT_IS_SUPPORT_LOCAL = integer;
    DEFAULT_IS_LOCAL_EFFECT = integer;
    DEFAULT_RECOMMEND_FORUM = Collections.emptyList();
    DEFAULT_HAS_GAME = integer;
    DEFAULT_CAN_USE_ACCELERATE = integer;
    DEFAULT_GAME_CARD = Collections.emptyList();
    DEFAULT_IS_LIVE_GAME_FORUM = integer;
    DEFAULT_IS_LIVE_GAME = integer;
    DEFAULT_IS_NEW_GAME_FORUM = integer;
    DEFAULT_IS_BRAND_FORUM = integer;
    DEFAULT_IS_SHOW_ALL_TOP_THREAD = integer;
    DEFAULT_IS_PRIVATE_FORUM = integer;
    DEFAULT_IS_SHOW_BAWUTASK = integer;
    DEFAULT_TIP_LIST = Collections.emptyList();
    DEFAULT_IS_SHOW_FORUMRULE = integer;
    DEFAULT_IS_FRS_MASK = integer;
    DEFAULT_MSG_BUBBLE_GUIDE_FREQUENCY = integer;
    DEFAULT_BE_TOP_LIMIT_TIME = long_;
    DEFAULT_MSG_BUBBLE_GUIDE_FREQUENCY_UNREAD = integer;
    DEFAULT_MSG_BUBBLE_GUIDE_FREQUENCY_SPECIAL = integer;
    DEFAULT_AVATAR_FUZZY_STATUS = integer;
    DEFAULT_IS_HUB = Boolean.FALSE;
    DEFAULT_HOT_NUM = long_;
  }
  
  public ForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.id;
      if (long_3 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_3;
      } 
      String str13 = paramBuilder.name;
      if (str13 == null) {
        this.name = "";
      } else {
        this.name = str13;
      } 
      str13 = paramBuilder.first_class;
      if (str13 == null) {
        this.first_class = "";
      } else {
        this.first_class = str13;
      } 
      str13 = paramBuilder.second_class;
      if (str13 == null) {
        this.second_class = "";
      } else {
        this.second_class = str13;
      } 
      Integer integer14 = paramBuilder.is_exists;
      if (integer14 == null) {
        this.is_exists = DEFAULT_IS_EXISTS;
      } else {
        this.is_exists = integer14;
      } 
      integer14 = paramBuilder.is_like;
      if (integer14 == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer14;
      } 
      integer14 = paramBuilder.user_level;
      if (integer14 == null) {
        this.user_level = DEFAULT_USER_LEVEL;
      } else {
        this.user_level = integer14;
      } 
      String str12 = paramBuilder.level_name;
      if (str12 == null) {
        this.level_name = "";
      } else {
        this.level_name = str12;
      } 
      Integer integer13 = paramBuilder.member_num;
      if (integer13 == null) {
        this.member_num = DEFAULT_MEMBER_NUM;
      } else {
        this.member_num = integer13;
      } 
      integer13 = paramBuilder.thread_num;
      if (integer13 == null) {
        this.thread_num = DEFAULT_THREAD_NUM;
      } else {
        this.thread_num = integer13;
      } 
      integer13 = paramBuilder.post_num;
      if (integer13 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer13;
      } 
      integer13 = paramBuilder.has_frs_star;
      if (integer13 == null) {
        this.has_frs_star = DEFAULT_HAS_FRS_STAR;
      } else {
        this.has_frs_star = integer13;
      } 
      integer13 = paramBuilder.cur_score;
      if (integer13 == null) {
        this.cur_score = DEFAULT_CUR_SCORE;
      } else {
        this.cur_score = integer13;
      } 
      integer13 = paramBuilder.levelup_score;
      if (integer13 == null) {
        this.levelup_score = DEFAULT_LEVELUP_SCORE;
      } else {
        this.levelup_score = integer13;
      } 
      this.sign_in_info = paramBuilder.sign_in_info;
      this.zhibo = paramBuilder.zhibo;
      List<Manager> list6 = paramBuilder.managers;
      if (list6 == null) {
        this.managers = DEFAULT_MANAGERS;
      } else {
        this.managers = Message.immutableCopyOf(list6);
      } 
      List<Calendar> list5 = paramBuilder.forum_sign_calendar;
      if (list5 == null) {
        this.forum_sign_calendar = DEFAULT_FORUM_SIGN_CALENDAR;
      } else {
        this.forum_sign_calendar = Message.immutableCopyOf(list5);
      } 
      Integer integer12 = paramBuilder.is_search_people;
      if (integer12 == null) {
        this.is_search_people = DEFAULT_IS_SEARCH_PEOPLE;
      } else {
        this.is_search_people = integer12;
      } 
      String str11 = paramBuilder.tids;
      if (str11 == null) {
        this.tids = "";
      } else {
        this.tids = str11;
      } 
      List<Classify> list4 = paramBuilder.good_classify;
      if (list4 == null) {
        this.good_classify = DEFAULT_GOOD_CLASSIFY;
      } else {
        this.good_classify = Message.immutableCopyOf(list4);
      } 
      String str10 = paramBuilder.is_readonly;
      if (str10 == null) {
        this.is_readonly = "";
      } else {
        this.is_readonly = str10;
      } 
      Integer integer11 = paramBuilder.album_open_photo_frs;
      if (integer11 == null) {
        this.album_open_photo_frs = DEFAULT_ALBUM_OPEN_PHOTO_FRS;
      } else {
        this.album_open_photo_frs = integer11;
      } 
      String str9 = paramBuilder.avatar;
      if (str9 == null) {
        this.avatar = "";
      } else {
        this.avatar = str9;
      } 
      str9 = paramBuilder.slogan;
      if (str9 == null) {
        this.slogan = "";
      } else {
        this.slogan = str9;
      } 
      Integer integer10 = paramBuilder.has_postpre;
      if (integer10 == null) {
        this.has_postpre = DEFAULT_HAS_POSTPRE;
      } else {
        this.has_postpre = integer10;
      } 
      this.forum_button = paramBuilder.forum_button;
      this.top_notice = paramBuilder.top_notice;
      integer10 = paramBuilder.has_paper;
      if (integer10 == null) {
        this.has_paper = DEFAULT_HAS_PAPER;
      } else {
        this.has_paper = integer10;
      } 
      integer10 = paramBuilder.is_stage_forum;
      if (integer10 == null) {
        this.is_stage_forum = DEFAULT_IS_STAGE_FORUM;
      } else {
        this.is_stage_forum = integer10;
      } 
      integer10 = paramBuilder.meizhi_tag;
      if (integer10 == null) {
        this.meizhi_tag = DEFAULT_MEIZHI_TAG;
      } else {
        this.meizhi_tag = integer10;
      } 
      this.banner = paramBuilder.banner;
      this.banner_list = paramBuilder.banner_list;
      List<Badges> list3 = paramBuilder.badges;
      if (list3 == null) {
        this.badges = DEFAULT_BADGES;
      } else {
        this.badges = Message.immutableCopyOf(list3);
      } 
      Integer integer9 = paramBuilder.level_id;
      if (integer9 == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = integer9;
      } 
      integer9 = paramBuilder.is_forbidden;
      if (integer9 == null) {
        this.is_forbidden = DEFAULT_IS_FORBIDDEN;
      } else {
        this.is_forbidden = integer9;
      } 
      integer9 = paramBuilder.favo_type;
      if (integer9 == null) {
        this.favo_type = DEFAULT_FAVO_TYPE;
      } else {
        this.favo_type = integer9;
      } 
      this.tag_info = paramBuilder.tag_info;
      this.post_prefix = paramBuilder.post_prefix;
      String str8 = paramBuilder.superboy;
      if (str8 == null) {
        this.superboy = "";
      } else {
        this.superboy = str8;
      } 
      Integer integer8 = paramBuilder.is_support_local;
      if (integer8 == null) {
        this.is_support_local = DEFAULT_IS_SUPPORT_LOCAL;
      } else {
        this.is_support_local = integer8;
      } 
      integer8 = paramBuilder.is_local_effect;
      if (integer8 == null) {
        this.is_local_effect = DEFAULT_IS_LOCAL_EFFECT;
      } else {
        this.is_local_effect = integer8;
      } 
      List<RecommendForum> list2 = paramBuilder.recommend_forum;
      if (list2 == null) {
        this.recommend_forum = DEFAULT_RECOMMEND_FORUM;
      } else {
        this.recommend_forum = Message.immutableCopyOf(list2);
      } 
      this.anchor_power = paramBuilder.anchor_power;
      this.worldcupinfo = paramBuilder.worldcupinfo;
      Integer integer7 = paramBuilder.has_game;
      if (integer7 == null) {
        this.has_game = DEFAULT_HAS_GAME;
      } else {
        this.has_game = integer7;
      } 
      String str7 = paramBuilder.game_url;
      if (str7 == null) {
        this.game_url = "";
      } else {
        this.game_url = str7;
      } 
      this.recommend_user_info = paramBuilder.recommend_user_info;
      Integer integer6 = paramBuilder.can_use_accelerate;
      if (integer6 == null) {
        this.can_use_accelerate = DEFAULT_CAN_USE_ACCELERATE;
      } else {
        this.can_use_accelerate = integer6;
      } 
      String str6 = paramBuilder.accelerate_cotent;
      if (str6 == null) {
        this.accelerate_cotent = "";
      } else {
        this.accelerate_cotent = str6;
      } 
      this.top_code = paramBuilder.top_code;
      this.news_info = paramBuilder.news_info;
      List<GameInfo> list1 = paramBuilder.game_card;
      if (list1 == null) {
        this.game_card = DEFAULT_GAME_CARD;
      } else {
        this.game_card = Message.immutableCopyOf(list1);
      } 
      String str5 = paramBuilder.game_name;
      if (str5 == null) {
        this.game_name = "";
      } else {
        this.game_name = str5;
      } 
      this.forumvip_show_icon = paramBuilder.forumvip_show_icon;
      this.adkiller_data = paramBuilder.adkiller_data;
      this.yule = paramBuilder.yule;
      this.realtime_data = paramBuilder.realtime_data;
      this.across_forum_show = paramBuilder.across_forum_show;
      this.post_topic = paramBuilder.post_topic;
      this.across_forum_hide = paramBuilder.across_forum_hide;
      Integer integer5 = paramBuilder.is_live_game_forum;
      if (integer5 == null) {
        this.is_live_game_forum = DEFAULT_IS_LIVE_GAME_FORUM;
      } else {
        this.is_live_game_forum = integer5;
      } 
      integer5 = paramBuilder.is_live_game;
      if (integer5 == null) {
        this.is_live_game = DEFAULT_IS_LIVE_GAME;
      } else {
        this.is_live_game = integer5;
      } 
      integer5 = paramBuilder.is_new_game_forum;
      if (integer5 == null) {
        this.is_new_game_forum = DEFAULT_IS_NEW_GAME_FORUM;
      } else {
        this.is_new_game_forum = integer5;
      } 
      String str4 = paramBuilder.forum_game_label;
      if (str4 == null) {
        this.forum_game_label = "";
      } else {
        this.forum_game_label = str4;
      } 
      str4 = paramBuilder.warning_msg;
      if (str4 == null) {
        this.warning_msg = "";
      } else {
        this.warning_msg = str4;
      } 
      str4 = paramBuilder.special_forum_type;
      if (str4 == null) {
        this.special_forum_type = "";
      } else {
        this.special_forum_type = str4;
      } 
      str4 = paramBuilder.topic_special_icon;
      if (str4 == null) {
        this.topic_special_icon = "";
      } else {
        this.topic_special_icon = str4;
      } 
      str4 = paramBuilder.topic_special_icon_right;
      if (str4 == null) {
        this.topic_special_icon_right = "";
      } else {
        this.topic_special_icon_right = str4;
      } 
      Integer integer4 = paramBuilder.is_brand_forum;
      if (integer4 == null) {
        this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
      } else {
        this.is_brand_forum = integer4;
      } 
      integer4 = paramBuilder.is_show_all_top_thread;
      if (integer4 == null) {
        this.is_show_all_top_thread = DEFAULT_IS_SHOW_ALL_TOP_THREAD;
      } else {
        this.is_show_all_top_thread = integer4;
      } 
      this.theme_color = paramBuilder.theme_color;
      String str3 = paramBuilder.is_top_img;
      if (str3 == null) {
        this.is_top_img = "";
      } else {
        this.is_top_img = str3;
      } 
      Integer integer3 = paramBuilder.is_private_forum;
      if (integer3 == null) {
        this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
      } else {
        this.is_private_forum = integer3;
      } 
      integer3 = paramBuilder.is_show_bawutask;
      if (integer3 == null) {
        this.is_show_bawutask = DEFAULT_IS_SHOW_BAWUTASK;
      } else {
        this.is_show_bawutask = integer3;
      } 
      String str2 = paramBuilder.f_share_img;
      if (str2 == null) {
        this.f_share_img = "";
      } else {
        this.f_share_img = str2;
      } 
      str2 = paramBuilder.forum_share_link;
      if (str2 == null) {
        this.forum_share_link = "";
      } else {
        this.forum_share_link = str2;
      } 
      str2 = paramBuilder.risk_tip_pop;
      if (str2 == null) {
        this.risk_tip_pop = "";
      } else {
        this.risk_tip_pop = str2;
      } 
      str2 = paramBuilder.risk_tip_notice;
      if (str2 == null) {
        this.risk_tip_notice = "";
      } else {
        this.risk_tip_notice = str2;
      } 
      str2 = paramBuilder.risk_tip_pop_title;
      if (str2 == null) {
        this.risk_tip_pop_title = "";
      } else {
        this.risk_tip_pop_title = str2;
      } 
      List<TipInfo> list = paramBuilder.tip_list;
      if (list == null) {
        this.tip_list = DEFAULT_TIP_LIST;
      } else {
        this.tip_list = Message.immutableCopyOf(list);
      } 
      Integer integer2 = paramBuilder.is_show_forumrule;
      if (integer2 == null) {
        this.is_show_forumrule = DEFAULT_IS_SHOW_FORUMRULE;
      } else {
        this.is_show_forumrule = integer2;
      } 
      this.deleted_reason_info = paramBuilder.deleted_reason_info;
      integer2 = paramBuilder.is_frs_mask;
      if (integer2 == null) {
        this.is_frs_mask = DEFAULT_IS_FRS_MASK;
      } else {
        this.is_frs_mask = integer2;
      } 
      integer2 = paramBuilder.msg_bubble_guide_frequency;
      if (integer2 == null) {
        this.msg_bubble_guide_frequency = DEFAULT_MSG_BUBBLE_GUIDE_FREQUENCY;
      } else {
        this.msg_bubble_guide_frequency = integer2;
      } 
      Long long_2 = paramBuilder.be_top_limit_time;
      if (long_2 == null) {
        this.be_top_limit_time = DEFAULT_BE_TOP_LIMIT_TIME;
      } else {
        this.be_top_limit_time = long_2;
      } 
      Integer integer1 = paramBuilder.msg_bubble_guide_frequency_unread;
      if (integer1 == null) {
        this.msg_bubble_guide_frequency_unread = DEFAULT_MSG_BUBBLE_GUIDE_FREQUENCY_UNREAD;
      } else {
        this.msg_bubble_guide_frequency_unread = integer1;
      } 
      integer1 = paramBuilder.msg_bubble_guide_frequency_special;
      if (integer1 == null) {
        this.msg_bubble_guide_frequency_special = DEFAULT_MSG_BUBBLE_GUIDE_FREQUENCY_SPECIAL;
      } else {
        this.msg_bubble_guide_frequency_special = integer1;
      } 
      integer1 = paramBuilder.avatar_fuzzy_status;
      if (integer1 == null) {
        this.avatar_fuzzy_status = DEFAULT_AVATAR_FUZZY_STATUS;
      } else {
        this.avatar_fuzzy_status = integer1;
      } 
      String str1 = paramBuilder.level_schema;
      if (str1 == null) {
        this.level_schema = "";
      } else {
        this.level_schema = str1;
      } 
      Boolean bool = paramBuilder.is_hub;
      if (bool == null) {
        this.is_hub = DEFAULT_IS_HUB;
      } else {
        this.is_hub = bool;
      } 
      Long long_1 = paramBuilder.hot_num;
      if (long_1 == null) {
        this.hot_num = DEFAULT_HOT_NUM;
      } else {
        this.hot_num = long_1;
      } 
      str = paramBuilder.hub_icon;
      if (str == null) {
        this.hub_icon = "";
      } else {
        this.hub_icon = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.name = ((Builder)str).name;
      this.first_class = ((Builder)str).first_class;
      this.second_class = ((Builder)str).second_class;
      this.is_exists = ((Builder)str).is_exists;
      this.is_like = ((Builder)str).is_like;
      this.user_level = ((Builder)str).user_level;
      this.level_name = ((Builder)str).level_name;
      this.member_num = ((Builder)str).member_num;
      this.thread_num = ((Builder)str).thread_num;
      this.post_num = ((Builder)str).post_num;
      this.has_frs_star = ((Builder)str).has_frs_star;
      this.cur_score = ((Builder)str).cur_score;
      this.levelup_score = ((Builder)str).levelup_score;
      this.sign_in_info = ((Builder)str).sign_in_info;
      this.zhibo = ((Builder)str).zhibo;
      this.managers = Message.immutableCopyOf(((Builder)str).managers);
      this.forum_sign_calendar = Message.immutableCopyOf(((Builder)str).forum_sign_calendar);
      this.is_search_people = ((Builder)str).is_search_people;
      this.tids = ((Builder)str).tids;
      this.good_classify = Message.immutableCopyOf(((Builder)str).good_classify);
      this.is_readonly = ((Builder)str).is_readonly;
      this.album_open_photo_frs = ((Builder)str).album_open_photo_frs;
      this.avatar = ((Builder)str).avatar;
      this.slogan = ((Builder)str).slogan;
      this.has_postpre = ((Builder)str).has_postpre;
      this.forum_button = ((Builder)str).forum_button;
      this.top_notice = ((Builder)str).top_notice;
      this.has_paper = ((Builder)str).has_paper;
      this.is_stage_forum = ((Builder)str).is_stage_forum;
      this.meizhi_tag = ((Builder)str).meizhi_tag;
      this.banner = ((Builder)str).banner;
      this.banner_list = ((Builder)str).banner_list;
      this.badges = Message.immutableCopyOf(((Builder)str).badges);
      this.level_id = ((Builder)str).level_id;
      this.is_forbidden = ((Builder)str).is_forbidden;
      this.favo_type = ((Builder)str).favo_type;
      this.tag_info = ((Builder)str).tag_info;
      this.post_prefix = ((Builder)str).post_prefix;
      this.superboy = ((Builder)str).superboy;
      this.is_support_local = ((Builder)str).is_support_local;
      this.is_local_effect = ((Builder)str).is_local_effect;
      this.recommend_forum = Message.immutableCopyOf(((Builder)str).recommend_forum);
      this.anchor_power = ((Builder)str).anchor_power;
      this.worldcupinfo = ((Builder)str).worldcupinfo;
      this.has_game = ((Builder)str).has_game;
      this.game_url = ((Builder)str).game_url;
      this.recommend_user_info = ((Builder)str).recommend_user_info;
      this.can_use_accelerate = ((Builder)str).can_use_accelerate;
      this.accelerate_cotent = ((Builder)str).accelerate_cotent;
      this.top_code = ((Builder)str).top_code;
      this.news_info = ((Builder)str).news_info;
      this.game_card = Message.immutableCopyOf(((Builder)str).game_card);
      this.game_name = ((Builder)str).game_name;
      this.forumvip_show_icon = ((Builder)str).forumvip_show_icon;
      this.adkiller_data = ((Builder)str).adkiller_data;
      this.yule = ((Builder)str).yule;
      this.realtime_data = ((Builder)str).realtime_data;
      this.across_forum_show = ((Builder)str).across_forum_show;
      this.post_topic = ((Builder)str).post_topic;
      this.across_forum_hide = ((Builder)str).across_forum_hide;
      this.is_live_game_forum = ((Builder)str).is_live_game_forum;
      this.is_live_game = ((Builder)str).is_live_game;
      this.is_new_game_forum = ((Builder)str).is_new_game_forum;
      this.forum_game_label = ((Builder)str).forum_game_label;
      this.warning_msg = ((Builder)str).warning_msg;
      this.special_forum_type = ((Builder)str).special_forum_type;
      this.topic_special_icon = ((Builder)str).topic_special_icon;
      this.topic_special_icon_right = ((Builder)str).topic_special_icon_right;
      this.is_brand_forum = ((Builder)str).is_brand_forum;
      this.is_show_all_top_thread = ((Builder)str).is_show_all_top_thread;
      this.theme_color = ((Builder)str).theme_color;
      this.is_top_img = ((Builder)str).is_top_img;
      this.is_private_forum = ((Builder)str).is_private_forum;
      this.is_show_bawutask = ((Builder)str).is_show_bawutask;
      this.f_share_img = ((Builder)str).f_share_img;
      this.forum_share_link = ((Builder)str).forum_share_link;
      this.risk_tip_pop = ((Builder)str).risk_tip_pop;
      this.risk_tip_notice = ((Builder)str).risk_tip_notice;
      this.risk_tip_pop_title = ((Builder)str).risk_tip_pop_title;
      this.tip_list = Message.immutableCopyOf(((Builder)str).tip_list);
      this.is_show_forumrule = ((Builder)str).is_show_forumrule;
      this.deleted_reason_info = ((Builder)str).deleted_reason_info;
      this.is_frs_mask = ((Builder)str).is_frs_mask;
      this.msg_bubble_guide_frequency = ((Builder)str).msg_bubble_guide_frequency;
      this.be_top_limit_time = ((Builder)str).be_top_limit_time;
      this.msg_bubble_guide_frequency_unread = ((Builder)str).msg_bubble_guide_frequency_unread;
      this.msg_bubble_guide_frequency_special = ((Builder)str).msg_bubble_guide_frequency_special;
      this.avatar_fuzzy_status = ((Builder)str).avatar_fuzzy_status;
      this.level_schema = ((Builder)str).level_schema;
      this.is_hub = ((Builder)str).is_hub;
      this.hot_num = ((Builder)str).hot_num;
      this.hub_icon = ((Builder)str).hub_icon;
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumInfo> {
    public String accelerate_cotent;
    
    public AcrossForumIcon across_forum_hide;
    
    public AcrossForumIcon across_forum_show;
    
    public Adkiller adkiller_data;
    
    public Integer album_open_photo_frs;
    
    public AnchorPower anchor_power;
    
    public String avatar;
    
    public Integer avatar_fuzzy_status;
    
    public List<Badges> badges;
    
    public Banner banner;
    
    public BannerList banner_list;
    
    public Long be_top_limit_time;
    
    public Integer can_use_accelerate;
    
    public Integer cur_score;
    
    public DeletedReasonInfo deleted_reason_info;
    
    public String f_share_img;
    
    public Integer favo_type;
    
    public String first_class;
    
    public ForumButton forum_button;
    
    public String forum_game_label;
    
    public String forum_share_link;
    
    public List<Calendar> forum_sign_calendar;
    
    public MemberShowIcon forumvip_show_icon;
    
    public List<GameInfo> game_card;
    
    public String game_name;
    
    public String game_url;
    
    public List<Classify> good_classify;
    
    public Integer has_frs_star;
    
    public Integer has_game;
    
    public Integer has_paper;
    
    public Integer has_postpre;
    
    public Long hot_num;
    
    public String hub_icon;
    
    public Long id;
    
    public Integer is_brand_forum;
    
    public Integer is_exists;
    
    public Integer is_forbidden;
    
    public Integer is_frs_mask;
    
    public Boolean is_hub;
    
    public Integer is_like;
    
    public Integer is_live_game;
    
    public Integer is_live_game_forum;
    
    public Integer is_local_effect;
    
    public Integer is_new_game_forum;
    
    public Integer is_private_forum;
    
    public String is_readonly;
    
    public Integer is_search_people;
    
    public Integer is_show_all_top_thread;
    
    public Integer is_show_bawutask;
    
    public Integer is_show_forumrule;
    
    public Integer is_stage_forum;
    
    public Integer is_support_local;
    
    public String is_top_img;
    
    public Integer level_id;
    
    public String level_name;
    
    public String level_schema;
    
    public Integer levelup_score;
    
    public List<Manager> managers;
    
    public Integer meizhi_tag;
    
    public Integer member_num;
    
    public Integer msg_bubble_guide_frequency;
    
    public Integer msg_bubble_guide_frequency_special;
    
    public Integer msg_bubble_guide_frequency_unread;
    
    public String name;
    
    public TopNews news_info;
    
    public Integer post_num;
    
    public PostPrefix post_prefix;
    
    public PostTopic post_topic;
    
    public RealTime realtime_data;
    
    public List<RecommendForum> recommend_forum;
    
    public RecomUserInfo recommend_user_info;
    
    public String risk_tip_notice;
    
    public String risk_tip_pop;
    
    public String risk_tip_pop_title;
    
    public String second_class;
    
    public SignInfo sign_in_info;
    
    public String slogan;
    
    public String special_forum_type;
    
    public String superboy;
    
    public TagInfo tag_info;
    
    public ThemeColorInfo theme_color;
    
    public Integer thread_num;
    
    public String tids;
    
    public List<TipInfo> tip_list;
    
    public TopCode top_code;
    
    public TopNotice top_notice;
    
    public String topic_special_icon;
    
    public String topic_special_icon_right;
    
    public Integer user_level;
    
    public String warning_msg;
    
    public WorldCup worldcupinfo;
    
    public Yule yule;
    
    public Zhibo zhibo;
    
    public Builder() {}
    
    public Builder(ForumInfo param1ForumInfo) {
      super(param1ForumInfo);
      if (param1ForumInfo == null)
        return; 
      this.id = param1ForumInfo.id;
      this.name = param1ForumInfo.name;
      this.first_class = param1ForumInfo.first_class;
      this.second_class = param1ForumInfo.second_class;
      this.is_exists = param1ForumInfo.is_exists;
      this.is_like = param1ForumInfo.is_like;
      this.user_level = param1ForumInfo.user_level;
      this.level_name = param1ForumInfo.level_name;
      this.member_num = param1ForumInfo.member_num;
      this.thread_num = param1ForumInfo.thread_num;
      this.post_num = param1ForumInfo.post_num;
      this.has_frs_star = param1ForumInfo.has_frs_star;
      this.cur_score = param1ForumInfo.cur_score;
      this.levelup_score = param1ForumInfo.levelup_score;
      this.sign_in_info = param1ForumInfo.sign_in_info;
      this.zhibo = param1ForumInfo.zhibo;
      this.managers = Message.copyOf(param1ForumInfo.managers);
      this.forum_sign_calendar = Message.copyOf(param1ForumInfo.forum_sign_calendar);
      this.is_search_people = param1ForumInfo.is_search_people;
      this.tids = param1ForumInfo.tids;
      this.good_classify = Message.copyOf(param1ForumInfo.good_classify);
      this.is_readonly = param1ForumInfo.is_readonly;
      this.album_open_photo_frs = param1ForumInfo.album_open_photo_frs;
      this.avatar = param1ForumInfo.avatar;
      this.slogan = param1ForumInfo.slogan;
      this.has_postpre = param1ForumInfo.has_postpre;
      this.forum_button = param1ForumInfo.forum_button;
      this.top_notice = param1ForumInfo.top_notice;
      this.has_paper = param1ForumInfo.has_paper;
      this.is_stage_forum = param1ForumInfo.is_stage_forum;
      this.meizhi_tag = param1ForumInfo.meizhi_tag;
      this.banner = param1ForumInfo.banner;
      this.banner_list = param1ForumInfo.banner_list;
      this.badges = Message.copyOf(param1ForumInfo.badges);
      this.level_id = param1ForumInfo.level_id;
      this.is_forbidden = param1ForumInfo.is_forbidden;
      this.favo_type = param1ForumInfo.favo_type;
      this.tag_info = param1ForumInfo.tag_info;
      this.post_prefix = param1ForumInfo.post_prefix;
      this.superboy = param1ForumInfo.superboy;
      this.is_support_local = param1ForumInfo.is_support_local;
      this.is_local_effect = param1ForumInfo.is_local_effect;
      this.recommend_forum = Message.copyOf(param1ForumInfo.recommend_forum);
      this.anchor_power = param1ForumInfo.anchor_power;
      this.worldcupinfo = param1ForumInfo.worldcupinfo;
      this.has_game = param1ForumInfo.has_game;
      this.game_url = param1ForumInfo.game_url;
      this.recommend_user_info = param1ForumInfo.recommend_user_info;
      this.can_use_accelerate = param1ForumInfo.can_use_accelerate;
      this.accelerate_cotent = param1ForumInfo.accelerate_cotent;
      this.top_code = param1ForumInfo.top_code;
      this.news_info = param1ForumInfo.news_info;
      this.game_card = Message.copyOf(param1ForumInfo.game_card);
      this.game_name = param1ForumInfo.game_name;
      this.forumvip_show_icon = param1ForumInfo.forumvip_show_icon;
      this.adkiller_data = param1ForumInfo.adkiller_data;
      this.yule = param1ForumInfo.yule;
      this.realtime_data = param1ForumInfo.realtime_data;
      this.across_forum_show = param1ForumInfo.across_forum_show;
      this.post_topic = param1ForumInfo.post_topic;
      this.across_forum_hide = param1ForumInfo.across_forum_hide;
      this.is_live_game_forum = param1ForumInfo.is_live_game_forum;
      this.is_live_game = param1ForumInfo.is_live_game;
      this.is_new_game_forum = param1ForumInfo.is_new_game_forum;
      this.forum_game_label = param1ForumInfo.forum_game_label;
      this.warning_msg = param1ForumInfo.warning_msg;
      this.special_forum_type = param1ForumInfo.special_forum_type;
      this.topic_special_icon = param1ForumInfo.topic_special_icon;
      this.topic_special_icon_right = param1ForumInfo.topic_special_icon_right;
      this.is_brand_forum = param1ForumInfo.is_brand_forum;
      this.is_show_all_top_thread = param1ForumInfo.is_show_all_top_thread;
      this.theme_color = param1ForumInfo.theme_color;
      this.is_top_img = param1ForumInfo.is_top_img;
      this.is_private_forum = param1ForumInfo.is_private_forum;
      this.is_show_bawutask = param1ForumInfo.is_show_bawutask;
      this.f_share_img = param1ForumInfo.f_share_img;
      this.forum_share_link = param1ForumInfo.forum_share_link;
      this.risk_tip_pop = param1ForumInfo.risk_tip_pop;
      this.risk_tip_notice = param1ForumInfo.risk_tip_notice;
      this.risk_tip_pop_title = param1ForumInfo.risk_tip_pop_title;
      this.tip_list = Message.copyOf(param1ForumInfo.tip_list);
      this.is_show_forumrule = param1ForumInfo.is_show_forumrule;
      this.deleted_reason_info = param1ForumInfo.deleted_reason_info;
      this.is_frs_mask = param1ForumInfo.is_frs_mask;
      this.msg_bubble_guide_frequency = param1ForumInfo.msg_bubble_guide_frequency;
      this.be_top_limit_time = param1ForumInfo.be_top_limit_time;
      this.msg_bubble_guide_frequency_unread = param1ForumInfo.msg_bubble_guide_frequency_unread;
      this.msg_bubble_guide_frequency_special = param1ForumInfo.msg_bubble_guide_frequency_special;
      this.avatar_fuzzy_status = param1ForumInfo.avatar_fuzzy_status;
      this.level_schema = param1ForumInfo.level_schema;
      this.is_hub = param1ForumInfo.is_hub;
      this.hot_num = param1ForumInfo.hot_num;
      this.hub_icon = param1ForumInfo.hub_icon;
    }
    
    public ForumInfo build(boolean param1Boolean) {
      return new ForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
