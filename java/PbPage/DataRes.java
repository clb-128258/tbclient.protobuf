package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AiGameInfo;
import tbclient.AichatBotCard;
import tbclient.AlaLiveInfo;
import tbclient.Anti;
import tbclient.BannerList;
import tbclient.BdtSearchInfo;
import tbclient.BottomBar;
import tbclient.BottomGameBar;
import tbclient.BusinessAccountInfo;
import tbclient.CommentOverlayInfo;
import tbclient.CommentPublisherConfig;
import tbclient.EditConfig;
import tbclient.EditInfo;
import tbclient.FeedKV;
import tbclient.FineBannerPb;
import tbclient.FloorFoldInfo;
import tbclient.ForumBotInfo;
import tbclient.ForumRuleStatus;
import tbclient.ForumShopGoodsInfo;
import tbclient.GameDetail;
import tbclient.GraffitiRankListInfo;
import tbclient.GuideWordList;
import tbclient.InputHintItem;
import tbclient.InteractInfo;
import tbclient.JumpLinkInfo;
import tbclient.Lbs;
import tbclient.ManagerElection;
import tbclient.MutliAichatBotCard;
import tbclient.NaGuide;
import tbclient.Page;
import tbclient.PageGuidTips;
import tbclient.PbHotPost;
import tbclient.PbTopAgreePost;
import tbclient.PlaceholderText;
import tbclient.Post;
import tbclient.Promotion;
import tbclient.PsRankListItem;
import tbclient.PushFeedbackInfo;
import tbclient.RecomTopicList;
import tbclient.RecommendThread;
import tbclient.RobotEntrance;
import tbclient.SdkTopicThread;
import tbclient.ShareChatroom;
import tbclient.SimpleForum;
import tbclient.SimpleUser;
import tbclient.SpriteShowStrategy;
import tbclient.SuggestQuery;
import tbclient.TabInfo;
import tbclient.TailRecommendInfo;
import tbclient.ThemeColorInfo;
import tbclient.ThreadAlbumManage;
import tbclient.ThreadInfo;
import tbclient.TwZhiBoAnti;
import tbclient.User;
import tbclient.WebviewData;

public final class DataRes extends Message {
  public static final String DEFAULT_AD_INFO = "";
  
  public static final Integer DEFAULT_AD_SHOW_SELECT;
  
  public static final List<AiChatCard> DEFAULT_AICHAT_CARD;
  
  public static final String DEFAULT_ASP_SHOWN_INFO = "";
  
  public static final List<ThreadInfo> DEFAULT_BJH_RECOMMEND;
  
  public static final List<ThemeColorInfo> DEFAULT_BOTTOM_RESOURCE;
  
  public static final Integer DEFAULT_EXP_GUIDE_TODAY;
  
  public static final Integer DEFAULT_EXP_NEWS_TODAY;
  
  public static final List<ThreadInfo> DEFAULT_FEED_THREAD_LIST;
  
  public static final List<FineBannerPb> DEFAULT_FINE_BANNER;
  
  public static final Long DEFAULT_FOLD_COMMENT_NUM;
  
  public static final String DEFAULT_FOLD_COMMENT_SHOW_TEXT = "";
  
  public static final String DEFAULT_FOLD_TIP = "";
  
  public static final List<SimpleForum> DEFAULT_FROM_FORUM_LIST;
  
  public static final List<GuideWordList> DEFAULT_GUIDE_WORD_LIST;
  
  public static final Integer DEFAULT_HAS_FLOOR;
  
  public static final Integer DEFAULT_HAS_FOLD_COMMENT;
  
  public static final List<InputHintItem> DEFAULT_INPUT_HINT;
  
  public static final Integer DEFAULT_IS_BLACK_WHITE;
  
  public static final Integer DEFAULT_IS_FOLLOW_CURRENT_CHANNEL;
  
  public static final Integer DEFAULT_IS_NEW_URL;
  
  public static final Integer DEFAULT_IS_OFFICIAL_FORUM;
  
  public static final Integer DEFAULT_IS_PURCHASE;
  
  public static final Integer DEFAULT_IS_TID_WHITE;
  
  public static final Integer DEFAULT_JUMPTOTAB1;
  
  public static final String DEFAULT_JUMPTOTAB2 = "";
  
  public static final List<String> DEFAULT_LIMIT_DIALOG_NAME;
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final String DEFAULT_MULTI_FORUM_TEXT = "";
  
  public static final List<SimpleUser> DEFAULT_NEW_AGREE_USER;
  
  public static final String DEFAULT_NO_MORE_SHOW_TEXT = "";
  
  public static final String DEFAULT_PARTIAL_VISIBLE_TOAST = "";
  
  public static final String DEFAULT_PB_NOTICE = "";
  
  public static final Integer DEFAULT_PB_NOTICE_TYPE;
  
  public static final List<PbSortType> DEFAULT_PB_SORT_INFO;
  
  public static final List<PsRankListItem> DEFAULT_PLAY_RANK_LIST;
  
  public static final List<PostBanner> DEFAULT_POST_BANNER;
  
  public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
  
  public static final List<RecommendThread> DEFAULT_RECOMMEND_THREADS;
  
  public static final List<ThreadInfo> DEFAULT_RECOM_THREAD_INFO;
  
  public static final List<SimpleForum> DEFAULT_REPOST_RECOMMEND_FORUM_LIST;
  
  public static final String DEFAULT_RETURN_PAGE = "";
  
  public static final Integer DEFAULT_SCROLL;
  
  public static final String DEFAULT_SEARCH_QUERY = "";
  
  public static final Integer DEFAULT_SERVER_TIME;
  
  public static final Integer DEFAULT_SHOW_ADSENSE;
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  public static final Integer DEFAULT_SWITCH_READ_OPEN;
  
  public static final List<TabInfo> DEFAULT_TAB_INFO;
  
  public static final Long DEFAULT_THREAD_FREQ_NUM;
  
  public static final List<RecomTopicList> DEFAULT_THREAD_TOPIC;
  
  public static final List<User> DEFAULT_USER_LIST;
  
  public static final Integer DEFAULT_USE_HYBRID_PB;
  
  @ProtoField(tag = 107)
  public final AdFilter ad_filter;
  
  @ProtoField(tag = 113, type = Message.Datatype.STRING)
  public final String ad_info;
  
  @ProtoField(tag = 88, type = Message.Datatype.INT32)
  public final Integer ad_show_select;
  
  @ProtoField(tag = 5)
  public final AddPost add_post;
  
  @ProtoField(tag = 117)
  public final AiGameInfo ai_game_info;
  
  @ProtoField(tag = 79)
  public final AichatBotCard aichat_bot_card;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 77)
  public final List<AiChatCard> aichat_card;
  
  @ProtoField(tag = 26)
  public final AlaLiveInfo ala_info;
  
  @ProtoField(tag = 4)
  public final Anti anti;
  
  @ProtoField(tag = 22)
  public final AppealInfo appeal_info;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String asp_shown_info;
  
  @ProtoField(tag = 12)
  public final BannerList banner_list;
  
  @ProtoField(tag = 103)
  public final BawuDeleteReasonItem bawu_delete_reason;
  
  @ProtoField(tag = 116)
  public final BdtSearchInfo bdt_search_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 52)
  public final List<ThreadInfo> bjh_recommend;
  
  @ProtoField(tag = 115)
  public final BottomBar bottom_bar;
  
  @ProtoField(tag = 118)
  public final BottomGameBar bottom_game_bar;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 110)
  public final List<ThemeColorInfo> bottom_resource;
  
  @ProtoField(tag = 85)
  public final GameDetail bottom_toast;
  
  @ProtoField(tag = 86)
  public final BreadcrumbNavigation breadcrumb_navigation;
  
  @ProtoField(tag = 58)
  public final BusinessAccountInfo business_account_info;
  
  @ProtoField(tag = 53)
  public final BusinessPromotInfo business_promot_info;
  
  @ProtoField(tag = 120)
  public final CommentOverlayInfo comment_overlay_info;
  
  @ProtoField(tag = 126)
  public final CommentPublisherConfig comment_publisher_config;
  
  @ProtoField(tag = 91)
  public final TabInfo current_tab;
  
  @ProtoField(tag = 39)
  public final SimpleForum display_forum;
  
  @ProtoField(tag = 71)
  public final EditConfig edit_config;
  
  @ProtoField(tag = 72)
  public final EditInfo edit_info;
  
  @ProtoField(tag = 46, type = Message.Datatype.INT32)
  public final Integer exp_guide_today;
  
  @ProtoField(tag = 45, type = Message.Datatype.INT32)
  public final Integer exp_news_today;
  
  @ProtoField(tag = 33)
  public final FeedExtInfo feed_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 30)
  public final List<ThreadInfo> feed_thread_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 17)
  public final List<FineBannerPb> fine_banner;
  
  @ProtoField(tag = 97)
  public final Post first_floor;
  
  @ProtoField(tag = 38)
  public final Post first_floor_post;
  
  @ProtoField(tag = 64)
  public final FloatingIcon floating_icon;
  
  @ProtoField(tag = 121)
  public final FloorFoldInfo floor_fold_info;
  
  @ProtoField(tag = 70, type = Message.Datatype.INT64)
  public final Long fold_comment_num;
  
  @ProtoField(tag = 124, type = Message.Datatype.STRING)
  public final String fold_comment_show_text;
  
  @ProtoField(tag = 44, type = Message.Datatype.STRING)
  public final String fold_tip;
  
  @ProtoField(tag = 43)
  public final PbFollowTip follow_tip;
  
  @ProtoField(tag = 2)
  public final SimpleForum forum;
  
  @ProtoField(tag = 111)
  public final ForumBotInfo forum_bot_info;
  
  @ProtoField(tag = 27)
  public final ForumHeadlineImgInfo forum_headline_img_info;
  
  @ProtoField(tag = 60)
  public final ForumRuleStatus forum_rule;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 36)
  public final List<SimpleForum> from_forum_list;
  
  @ProtoField(tag = 94)
  public final GameDetail game_detail;
  
  @ProtoField(tag = 23)
  public final GodCard god_card;
  
  @ProtoField(tag = 21)
  public final GraffitiRankListInfo graffiti_rank_list_info;
  
  @ProtoField(tag = 29)
  public final GuessLikeStruct guess_like;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 83)
  public final List<GuideWordList> guide_word_list;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer has_floor;
  
  @ProtoField(tag = 68, type = Message.Datatype.INT32)
  public final Integer has_fold_comment;
  
  @ProtoField(tag = 20)
  public final PbHotPost hot_post_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 102)
  public final List<InputHintItem> input_hint;
  
  @ProtoField(tag = 114)
  public final InteractInfo interact_info;
  
  @ProtoField(tag = 62, type = Message.Datatype.INT32)
  public final Integer is_black_white;
  
  @ProtoField(tag = 31, type = Message.Datatype.UINT32)
  public final Integer is_follow_current_channel;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer is_new_url;
  
  @ProtoField(tag = 63, type = Message.Datatype.INT32)
  public final Integer is_official_forum;
  
  @ProtoField(tag = 65, type = Message.Datatype.INT32)
  public final Integer is_purchase;
  
  @ProtoField(tag = 101, type = Message.Datatype.UINT32)
  public final Integer is_tid_white;
  
  @ProtoField(tag = 74)
  public final JumpLinkInfo jump_link_info;
  
  @ProtoField(tag = 56, type = Message.Datatype.INT32)
  public final Integer jumptotab1;
  
  @ProtoField(tag = 57, type = Message.Datatype.STRING)
  public final String jumptotab2;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 84, type = Message.Datatype.STRING)
  public final List<String> limit_dialog_name;
  
  @ProtoField(tag = 9)
  public final Lbs location;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 81)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 51)
  public final ManagerElection manager_election;
  
  @ProtoField(tag = 47, type = Message.Datatype.STRING)
  public final String multi_forum_text;
  
  @ProtoField(tag = 104)
  public final MutliAichatBotCard mutli_aichat_bot_card;
  
  @ProtoField(tag = 42)
  public final NaGuide na_guide;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 40)
  public final List<SimpleUser> new_agree_user;
  
  @ProtoField(tag = 15)
  public final NewsInfo news_info;
  
  @ProtoField(tag = 123, type = Message.Datatype.STRING)
  public final String no_more_show_text;
  
  @ProtoField(tag = 3)
  public final Page page;
  
  @ProtoField(tag = 119)
  public final PageGuidTips page_guid_tips;
  
  @ProtoField(tag = 41, type = Message.Datatype.STRING)
  public final String partial_visible_toast;
  
  @ProtoField(tag = 87)
  public final PbGamePop pb_game_pop;
  
  @ProtoField(tag = 67, type = Message.Datatype.STRING)
  public final String pb_notice;
  
  @ProtoField(tag = 66, type = Message.Datatype.INT32)
  public final Integer pb_notice_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 49)
  public final List<PbSortType> pb_sort_info;
  
  @ProtoField(tag = 98)
  public final PlaceholderText placeholder_text;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 24)
  public final List<PsRankListItem> play_rank_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 11)
  public final List<PostBanner> post_banner;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<Post> post_list;
  
  @ProtoField(tag = 54)
  public final Promotion promotion;
  
  @ProtoField(tag = 80)
  public final PushFeedbackInfo push_feedback_info;
  
  @ProtoField(tag = 55)
  public final AlaLiveInfo recom_ala_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 59)
  public final List<ThreadInfo> recom_thread_info;
  
  @ProtoField(tag = 25)
  public final RecommendBook recommend_book;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 16)
  public final List<RecommendThread> recommend_threads;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 35)
  public final List<SimpleForum> repost_recommend_forum_list;
  
  @ProtoField(tag = 96, type = Message.Datatype.STRING)
  public final String return_page;
  
  @ProtoField(tag = 76)
  public final RobotEntrance robot_entrance;
  
  @ProtoField(tag = 100, type = Message.Datatype.UINT32)
  public final Integer scroll;
  
  @ProtoField(tag = 19)
  public final SdkTopicThread sdk_topic_thread;
  
  @ProtoField(tag = 92, type = Message.Datatype.STRING)
  public final String search_query;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer server_time;
  
  @ProtoField(tag = 105)
  public final SettingInfo setting_info;
  
  @ProtoField(tag = 78)
  public final ShareChatroom share_chatroom;
  
  @ProtoField(tag = 106)
  public final ForumShopGoodsInfo shop_goods_info;
  
  @ProtoField(tag = 61, type = Message.Datatype.INT32)
  public final Integer show_adsense;
  
  @ProtoField(tag = 75)
  public final SimilarContent similar_content;
  
  @ProtoField(tag = 50, type = Message.Datatype.INT32)
  public final Integer sort_type;
  
  @ProtoField(tag = 95)
  public final SpriteShowStrategy sprite_show_strategy;
  
  @ProtoField(tag = 93)
  public final SuggestQuery suggest_querys;
  
  @ProtoField(tag = 32, type = Message.Datatype.INT32)
  public final Integer switch_read_open;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 90)
  public final List<TabInfo> tab_info;
  
  @ProtoField(tag = 122)
  public final TailRecommendInfo tail_recommend_info;
  
  @ProtoField(tag = 8)
  public final ThreadInfo thread;
  
  @ProtoField(tag = 99)
  public final ThreadAlbumManage thread_album_manage;
  
  @ProtoField(tag = 37, type = Message.Datatype.INT64)
  public final Long thread_freq_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 48)
  public final List<RecomTopicList> thread_topic;
  
  @ProtoField(tag = 34)
  public final PbTopAgreePost top_agree_post_list;
  
  @ProtoField(tag = 73)
  public final Post top_answer;
  
  @ProtoField(tag = 18)
  public final TwZhiBoAnti twzhibo_anti;
  
  @ProtoField(tag = 112, type = Message.Datatype.INT32)
  public final Integer use_hybrid_pb;
  
  @ProtoField(tag = 1)
  public final User user;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 13)
  public final List<User> user_list;
  
  @ProtoField(tag = 89)
  public final WebviewData webview_data;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_FLOOR = integer;
    DEFAULT_IS_NEW_URL = integer;
    DEFAULT_POST_BANNER = Collections.emptyList();
    DEFAULT_USER_LIST = Collections.emptyList();
    DEFAULT_SERVER_TIME = integer;
    DEFAULT_RECOMMEND_THREADS = Collections.emptyList();
    DEFAULT_FINE_BANNER = Collections.emptyList();
    DEFAULT_PLAY_RANK_LIST = Collections.emptyList();
    DEFAULT_FEED_THREAD_LIST = Collections.emptyList();
    DEFAULT_IS_FOLLOW_CURRENT_CHANNEL = integer;
    DEFAULT_SWITCH_READ_OPEN = integer;
    DEFAULT_REPOST_RECOMMEND_FORUM_LIST = Collections.emptyList();
    DEFAULT_FROM_FORUM_LIST = Collections.emptyList();
    Long long_ = Long.valueOf(0L);
    DEFAULT_THREAD_FREQ_NUM = long_;
    DEFAULT_NEW_AGREE_USER = Collections.emptyList();
    DEFAULT_EXP_NEWS_TODAY = integer;
    DEFAULT_EXP_GUIDE_TODAY = integer;
    DEFAULT_THREAD_TOPIC = Collections.emptyList();
    DEFAULT_PB_SORT_INFO = Collections.emptyList();
    DEFAULT_SORT_TYPE = integer;
    DEFAULT_BJH_RECOMMEND = Collections.emptyList();
    DEFAULT_JUMPTOTAB1 = integer;
    DEFAULT_RECOM_THREAD_INFO = Collections.emptyList();
    DEFAULT_SHOW_ADSENSE = integer;
    DEFAULT_IS_BLACK_WHITE = integer;
    DEFAULT_IS_OFFICIAL_FORUM = integer;
    DEFAULT_IS_PURCHASE = integer;
    DEFAULT_PB_NOTICE_TYPE = integer;
    DEFAULT_HAS_FOLD_COMMENT = integer;
    DEFAULT_FOLD_COMMENT_NUM = long_;
    DEFAULT_AICHAT_CARD = Collections.emptyList();
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_GUIDE_WORD_LIST = Collections.emptyList();
    DEFAULT_LIMIT_DIALOG_NAME = Collections.emptyList();
    DEFAULT_AD_SHOW_SELECT = integer;
    DEFAULT_TAB_INFO = Collections.emptyList();
    DEFAULT_SCROLL = integer;
    DEFAULT_IS_TID_WHITE = integer;
    DEFAULT_INPUT_HINT = Collections.emptyList();
    DEFAULT_BOTTOM_RESOURCE = Collections.emptyList();
    DEFAULT_USE_HYBRID_PB = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.user = paramBuilder.user;
      this.forum = paramBuilder.forum;
      this.page = paramBuilder.page;
      this.anti = paramBuilder.anti;
      this.add_post = paramBuilder.add_post;
      List<Post> list19 = paramBuilder.post_list;
      if (list19 == null) {
        this.post_list = DEFAULT_POST_LIST;
      } else {
        this.post_list = Message.immutableCopyOf(list19);
      } 
      Integer integer11 = paramBuilder.has_floor;
      if (integer11 == null) {
        this.has_floor = DEFAULT_HAS_FLOOR;
      } else {
        this.has_floor = integer11;
      } 
      this.thread = paramBuilder.thread;
      this.location = paramBuilder.location;
      integer11 = paramBuilder.is_new_url;
      if (integer11 == null) {
        this.is_new_url = DEFAULT_IS_NEW_URL;
      } else {
        this.is_new_url = integer11;
      } 
      List<PostBanner> list18 = paramBuilder.post_banner;
      if (list18 == null) {
        this.post_banner = DEFAULT_POST_BANNER;
      } else {
        this.post_banner = Message.immutableCopyOf(list18);
      } 
      this.banner_list = paramBuilder.banner_list;
      List<User> list17 = paramBuilder.user_list;
      if (list17 == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list17);
      } 
      Integer integer10 = paramBuilder.server_time;
      if (integer10 == null) {
        this.server_time = DEFAULT_SERVER_TIME;
      } else {
        this.server_time = integer10;
      } 
      this.news_info = paramBuilder.news_info;
      List<RecommendThread> list16 = paramBuilder.recommend_threads;
      if (list16 == null) {
        this.recommend_threads = DEFAULT_RECOMMEND_THREADS;
      } else {
        this.recommend_threads = Message.immutableCopyOf(list16);
      } 
      List<FineBannerPb> list15 = paramBuilder.fine_banner;
      if (list15 == null) {
        this.fine_banner = DEFAULT_FINE_BANNER;
      } else {
        this.fine_banner = Message.immutableCopyOf(list15);
      } 
      this.twzhibo_anti = paramBuilder.twzhibo_anti;
      this.sdk_topic_thread = paramBuilder.sdk_topic_thread;
      this.hot_post_list = paramBuilder.hot_post_list;
      this.graffiti_rank_list_info = paramBuilder.graffiti_rank_list_info;
      this.appeal_info = paramBuilder.appeal_info;
      this.god_card = paramBuilder.god_card;
      List<PsRankListItem> list14 = paramBuilder.play_rank_list;
      if (list14 == null) {
        this.play_rank_list = DEFAULT_PLAY_RANK_LIST;
      } else {
        this.play_rank_list = Message.immutableCopyOf(list14);
      } 
      this.recommend_book = paramBuilder.recommend_book;
      this.ala_info = paramBuilder.ala_info;
      this.forum_headline_img_info = paramBuilder.forum_headline_img_info;
      String str7 = paramBuilder.asp_shown_info;
      if (str7 == null) {
        this.asp_shown_info = "";
      } else {
        this.asp_shown_info = str7;
      } 
      this.guess_like = paramBuilder.guess_like;
      List<ThreadInfo> list13 = paramBuilder.feed_thread_list;
      if (list13 == null) {
        this.feed_thread_list = DEFAULT_FEED_THREAD_LIST;
      } else {
        this.feed_thread_list = Message.immutableCopyOf(list13);
      } 
      Integer integer9 = paramBuilder.is_follow_current_channel;
      if (integer9 == null) {
        this.is_follow_current_channel = DEFAULT_IS_FOLLOW_CURRENT_CHANNEL;
      } else {
        this.is_follow_current_channel = integer9;
      } 
      integer9 = paramBuilder.switch_read_open;
      if (integer9 == null) {
        this.switch_read_open = DEFAULT_SWITCH_READ_OPEN;
      } else {
        this.switch_read_open = integer9;
      } 
      this.feed_info = paramBuilder.feed_info;
      this.top_agree_post_list = paramBuilder.top_agree_post_list;
      List<SimpleForum> list12 = paramBuilder.repost_recommend_forum_list;
      if (list12 == null) {
        this.repost_recommend_forum_list = DEFAULT_REPOST_RECOMMEND_FORUM_LIST;
      } else {
        this.repost_recommend_forum_list = Message.immutableCopyOf(list12);
      } 
      list12 = paramBuilder.from_forum_list;
      if (list12 == null) {
        this.from_forum_list = DEFAULT_FROM_FORUM_LIST;
      } else {
        this.from_forum_list = Message.immutableCopyOf(list12);
      } 
      Long long_2 = paramBuilder.thread_freq_num;
      if (long_2 == null) {
        this.thread_freq_num = DEFAULT_THREAD_FREQ_NUM;
      } else {
        this.thread_freq_num = long_2;
      } 
      this.first_floor_post = paramBuilder.first_floor_post;
      this.display_forum = paramBuilder.display_forum;
      List<SimpleUser> list11 = paramBuilder.new_agree_user;
      if (list11 == null) {
        this.new_agree_user = DEFAULT_NEW_AGREE_USER;
      } else {
        this.new_agree_user = Message.immutableCopyOf(list11);
      } 
      String str6 = paramBuilder.partial_visible_toast;
      if (str6 == null) {
        this.partial_visible_toast = "";
      } else {
        this.partial_visible_toast = str6;
      } 
      this.na_guide = paramBuilder.na_guide;
      this.follow_tip = paramBuilder.follow_tip;
      str6 = paramBuilder.fold_tip;
      if (str6 == null) {
        this.fold_tip = "";
      } else {
        this.fold_tip = str6;
      } 
      Integer integer8 = paramBuilder.exp_news_today;
      if (integer8 == null) {
        this.exp_news_today = DEFAULT_EXP_NEWS_TODAY;
      } else {
        this.exp_news_today = integer8;
      } 
      integer8 = paramBuilder.exp_guide_today;
      if (integer8 == null) {
        this.exp_guide_today = DEFAULT_EXP_GUIDE_TODAY;
      } else {
        this.exp_guide_today = integer8;
      } 
      String str5 = paramBuilder.multi_forum_text;
      if (str5 == null) {
        this.multi_forum_text = "";
      } else {
        this.multi_forum_text = str5;
      } 
      List<RecomTopicList> list10 = paramBuilder.thread_topic;
      if (list10 == null) {
        this.thread_topic = DEFAULT_THREAD_TOPIC;
      } else {
        this.thread_topic = Message.immutableCopyOf(list10);
      } 
      List<PbSortType> list9 = paramBuilder.pb_sort_info;
      if (list9 == null) {
        this.pb_sort_info = DEFAULT_PB_SORT_INFO;
      } else {
        this.pb_sort_info = Message.immutableCopyOf(list9);
      } 
      Integer integer7 = paramBuilder.sort_type;
      if (integer7 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer7;
      } 
      this.manager_election = paramBuilder.manager_election;
      List<ThreadInfo> list8 = paramBuilder.bjh_recommend;
      if (list8 == null) {
        this.bjh_recommend = DEFAULT_BJH_RECOMMEND;
      } else {
        this.bjh_recommend = Message.immutableCopyOf(list8);
      } 
      this.business_promot_info = paramBuilder.business_promot_info;
      this.promotion = paramBuilder.promotion;
      this.recom_ala_info = paramBuilder.recom_ala_info;
      Integer integer6 = paramBuilder.jumptotab1;
      if (integer6 == null) {
        this.jumptotab1 = DEFAULT_JUMPTOTAB1;
      } else {
        this.jumptotab1 = integer6;
      } 
      String str4 = paramBuilder.jumptotab2;
      if (str4 == null) {
        this.jumptotab2 = "";
      } else {
        this.jumptotab2 = str4;
      } 
      this.business_account_info = paramBuilder.business_account_info;
      List<ThreadInfo> list7 = paramBuilder.recom_thread_info;
      if (list7 == null) {
        this.recom_thread_info = DEFAULT_RECOM_THREAD_INFO;
      } else {
        this.recom_thread_info = Message.immutableCopyOf(list7);
      } 
      this.forum_rule = paramBuilder.forum_rule;
      Integer integer5 = paramBuilder.show_adsense;
      if (integer5 == null) {
        this.show_adsense = DEFAULT_SHOW_ADSENSE;
      } else {
        this.show_adsense = integer5;
      } 
      integer5 = paramBuilder.is_black_white;
      if (integer5 == null) {
        this.is_black_white = DEFAULT_IS_BLACK_WHITE;
      } else {
        this.is_black_white = integer5;
      } 
      integer5 = paramBuilder.is_official_forum;
      if (integer5 == null) {
        this.is_official_forum = DEFAULT_IS_OFFICIAL_FORUM;
      } else {
        this.is_official_forum = integer5;
      } 
      this.floating_icon = paramBuilder.floating_icon;
      integer5 = paramBuilder.is_purchase;
      if (integer5 == null) {
        this.is_purchase = DEFAULT_IS_PURCHASE;
      } else {
        this.is_purchase = integer5;
      } 
      integer5 = paramBuilder.pb_notice_type;
      if (integer5 == null) {
        this.pb_notice_type = DEFAULT_PB_NOTICE_TYPE;
      } else {
        this.pb_notice_type = integer5;
      } 
      String str3 = paramBuilder.pb_notice;
      if (str3 == null) {
        this.pb_notice = "";
      } else {
        this.pb_notice = str3;
      } 
      Integer integer4 = paramBuilder.has_fold_comment;
      if (integer4 == null) {
        this.has_fold_comment = DEFAULT_HAS_FOLD_COMMENT;
      } else {
        this.has_fold_comment = integer4;
      } 
      Long long_1 = paramBuilder.fold_comment_num;
      if (long_1 == null) {
        this.fold_comment_num = DEFAULT_FOLD_COMMENT_NUM;
      } else {
        this.fold_comment_num = long_1;
      } 
      this.edit_config = paramBuilder.edit_config;
      this.edit_info = paramBuilder.edit_info;
      this.top_answer = paramBuilder.top_answer;
      this.jump_link_info = paramBuilder.jump_link_info;
      this.similar_content = paramBuilder.similar_content;
      this.robot_entrance = paramBuilder.robot_entrance;
      List<AiChatCard> list6 = paramBuilder.aichat_card;
      if (list6 == null) {
        this.aichat_card = DEFAULT_AICHAT_CARD;
      } else {
        this.aichat_card = Message.immutableCopyOf(list6);
      } 
      this.share_chatroom = paramBuilder.share_chatroom;
      this.aichat_bot_card = paramBuilder.aichat_bot_card;
      this.push_feedback_info = paramBuilder.push_feedback_info;
      List<FeedKV> list5 = paramBuilder.log_param;
      if (list5 == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list5);
      } 
      List<GuideWordList> list4 = paramBuilder.guide_word_list;
      if (list4 == null) {
        this.guide_word_list = DEFAULT_GUIDE_WORD_LIST;
      } else {
        this.guide_word_list = Message.immutableCopyOf(list4);
      } 
      List<String> list3 = paramBuilder.limit_dialog_name;
      if (list3 == null) {
        this.limit_dialog_name = DEFAULT_LIMIT_DIALOG_NAME;
      } else {
        this.limit_dialog_name = Message.immutableCopyOf(list3);
      } 
      this.bottom_toast = paramBuilder.bottom_toast;
      this.breadcrumb_navigation = paramBuilder.breadcrumb_navigation;
      this.pb_game_pop = paramBuilder.pb_game_pop;
      Integer integer3 = paramBuilder.ad_show_select;
      if (integer3 == null) {
        this.ad_show_select = DEFAULT_AD_SHOW_SELECT;
      } else {
        this.ad_show_select = integer3;
      } 
      this.webview_data = paramBuilder.webview_data;
      List<TabInfo> list2 = paramBuilder.tab_info;
      if (list2 == null) {
        this.tab_info = DEFAULT_TAB_INFO;
      } else {
        this.tab_info = Message.immutableCopyOf(list2);
      } 
      this.current_tab = paramBuilder.current_tab;
      String str2 = paramBuilder.search_query;
      if (str2 == null) {
        this.search_query = "";
      } else {
        this.search_query = str2;
      } 
      this.suggest_querys = paramBuilder.suggest_querys;
      this.game_detail = paramBuilder.game_detail;
      this.sprite_show_strategy = paramBuilder.sprite_show_strategy;
      str2 = paramBuilder.return_page;
      if (str2 == null) {
        this.return_page = "";
      } else {
        this.return_page = str2;
      } 
      this.first_floor = paramBuilder.first_floor;
      this.placeholder_text = paramBuilder.placeholder_text;
      this.thread_album_manage = paramBuilder.thread_album_manage;
      Integer integer2 = paramBuilder.scroll;
      if (integer2 == null) {
        this.scroll = DEFAULT_SCROLL;
      } else {
        this.scroll = integer2;
      } 
      integer2 = paramBuilder.is_tid_white;
      if (integer2 == null) {
        this.is_tid_white = DEFAULT_IS_TID_WHITE;
      } else {
        this.is_tid_white = integer2;
      } 
      List<InputHintItem> list1 = paramBuilder.input_hint;
      if (list1 == null) {
        this.input_hint = DEFAULT_INPUT_HINT;
      } else {
        this.input_hint = Message.immutableCopyOf(list1);
      } 
      this.bawu_delete_reason = paramBuilder.bawu_delete_reason;
      this.mutli_aichat_bot_card = paramBuilder.mutli_aichat_bot_card;
      this.setting_info = paramBuilder.setting_info;
      this.shop_goods_info = paramBuilder.shop_goods_info;
      this.ad_filter = paramBuilder.ad_filter;
      List<ThemeColorInfo> list = paramBuilder.bottom_resource;
      if (list == null) {
        this.bottom_resource = DEFAULT_BOTTOM_RESOURCE;
      } else {
        this.bottom_resource = Message.immutableCopyOf(list);
      } 
      this.forum_bot_info = paramBuilder.forum_bot_info;
      Integer integer1 = paramBuilder.use_hybrid_pb;
      if (integer1 == null) {
        this.use_hybrid_pb = DEFAULT_USE_HYBRID_PB;
      } else {
        this.use_hybrid_pb = integer1;
      } 
      String str1 = paramBuilder.ad_info;
      if (str1 == null) {
        this.ad_info = "";
      } else {
        this.ad_info = str1;
      } 
      this.interact_info = paramBuilder.interact_info;
      this.bottom_bar = paramBuilder.bottom_bar;
      this.bdt_search_info = paramBuilder.bdt_search_info;
      this.ai_game_info = paramBuilder.ai_game_info;
      this.bottom_game_bar = paramBuilder.bottom_game_bar;
      this.page_guid_tips = paramBuilder.page_guid_tips;
      this.comment_overlay_info = paramBuilder.comment_overlay_info;
      this.floor_fold_info = paramBuilder.floor_fold_info;
      this.tail_recommend_info = paramBuilder.tail_recommend_info;
      str1 = paramBuilder.no_more_show_text;
      if (str1 == null) {
        this.no_more_show_text = "";
      } else {
        this.no_more_show_text = str1;
      } 
      str1 = paramBuilder.fold_comment_show_text;
      if (str1 == null) {
        this.fold_comment_show_text = "";
      } else {
        this.fold_comment_show_text = str1;
      } 
      this.comment_publisher_config = paramBuilder.comment_publisher_config;
    } else {
      this.user = paramBuilder.user;
      this.forum = paramBuilder.forum;
      this.page = paramBuilder.page;
      this.anti = paramBuilder.anti;
      this.add_post = paramBuilder.add_post;
      this.post_list = Message.immutableCopyOf(paramBuilder.post_list);
      this.has_floor = paramBuilder.has_floor;
      this.thread = paramBuilder.thread;
      this.location = paramBuilder.location;
      this.is_new_url = paramBuilder.is_new_url;
      this.post_banner = Message.immutableCopyOf(paramBuilder.post_banner);
      this.banner_list = paramBuilder.banner_list;
      this.user_list = Message.immutableCopyOf(paramBuilder.user_list);
      this.server_time = paramBuilder.server_time;
      this.news_info = paramBuilder.news_info;
      this.recommend_threads = Message.immutableCopyOf(paramBuilder.recommend_threads);
      this.fine_banner = Message.immutableCopyOf(paramBuilder.fine_banner);
      this.twzhibo_anti = paramBuilder.twzhibo_anti;
      this.sdk_topic_thread = paramBuilder.sdk_topic_thread;
      this.hot_post_list = paramBuilder.hot_post_list;
      this.graffiti_rank_list_info = paramBuilder.graffiti_rank_list_info;
      this.appeal_info = paramBuilder.appeal_info;
      this.god_card = paramBuilder.god_card;
      this.play_rank_list = Message.immutableCopyOf(paramBuilder.play_rank_list);
      this.recommend_book = paramBuilder.recommend_book;
      this.ala_info = paramBuilder.ala_info;
      this.forum_headline_img_info = paramBuilder.forum_headline_img_info;
      this.asp_shown_info = paramBuilder.asp_shown_info;
      this.guess_like = paramBuilder.guess_like;
      this.feed_thread_list = Message.immutableCopyOf(paramBuilder.feed_thread_list);
      this.is_follow_current_channel = paramBuilder.is_follow_current_channel;
      this.switch_read_open = paramBuilder.switch_read_open;
      this.feed_info = paramBuilder.feed_info;
      this.top_agree_post_list = paramBuilder.top_agree_post_list;
      this.repost_recommend_forum_list = Message.immutableCopyOf(paramBuilder.repost_recommend_forum_list);
      this.from_forum_list = Message.immutableCopyOf(paramBuilder.from_forum_list);
      this.thread_freq_num = paramBuilder.thread_freq_num;
      this.first_floor_post = paramBuilder.first_floor_post;
      this.display_forum = paramBuilder.display_forum;
      this.new_agree_user = Message.immutableCopyOf(paramBuilder.new_agree_user);
      this.partial_visible_toast = paramBuilder.partial_visible_toast;
      this.na_guide = paramBuilder.na_guide;
      this.follow_tip = paramBuilder.follow_tip;
      this.fold_tip = paramBuilder.fold_tip;
      this.exp_news_today = paramBuilder.exp_news_today;
      this.exp_guide_today = paramBuilder.exp_guide_today;
      this.multi_forum_text = paramBuilder.multi_forum_text;
      this.thread_topic = Message.immutableCopyOf(paramBuilder.thread_topic);
      this.pb_sort_info = Message.immutableCopyOf(paramBuilder.pb_sort_info);
      this.sort_type = paramBuilder.sort_type;
      this.manager_election = paramBuilder.manager_election;
      this.bjh_recommend = Message.immutableCopyOf(paramBuilder.bjh_recommend);
      this.business_promot_info = paramBuilder.business_promot_info;
      this.promotion = paramBuilder.promotion;
      this.recom_ala_info = paramBuilder.recom_ala_info;
      this.jumptotab1 = paramBuilder.jumptotab1;
      this.jumptotab2 = paramBuilder.jumptotab2;
      this.business_account_info = paramBuilder.business_account_info;
      this.recom_thread_info = Message.immutableCopyOf(paramBuilder.recom_thread_info);
      this.forum_rule = paramBuilder.forum_rule;
      this.show_adsense = paramBuilder.show_adsense;
      this.is_black_white = paramBuilder.is_black_white;
      this.is_official_forum = paramBuilder.is_official_forum;
      this.floating_icon = paramBuilder.floating_icon;
      this.is_purchase = paramBuilder.is_purchase;
      this.pb_notice_type = paramBuilder.pb_notice_type;
      this.pb_notice = paramBuilder.pb_notice;
      this.has_fold_comment = paramBuilder.has_fold_comment;
      this.fold_comment_num = paramBuilder.fold_comment_num;
      this.edit_config = paramBuilder.edit_config;
      this.edit_info = paramBuilder.edit_info;
      this.top_answer = paramBuilder.top_answer;
      this.jump_link_info = paramBuilder.jump_link_info;
      this.similar_content = paramBuilder.similar_content;
      this.robot_entrance = paramBuilder.robot_entrance;
      this.aichat_card = Message.immutableCopyOf(paramBuilder.aichat_card);
      this.share_chatroom = paramBuilder.share_chatroom;
      this.aichat_bot_card = paramBuilder.aichat_bot_card;
      this.push_feedback_info = paramBuilder.push_feedback_info;
      this.log_param = Message.immutableCopyOf(paramBuilder.log_param);
      this.guide_word_list = Message.immutableCopyOf(paramBuilder.guide_word_list);
      this.limit_dialog_name = Message.immutableCopyOf(paramBuilder.limit_dialog_name);
      this.bottom_toast = paramBuilder.bottom_toast;
      this.breadcrumb_navigation = paramBuilder.breadcrumb_navigation;
      this.pb_game_pop = paramBuilder.pb_game_pop;
      this.ad_show_select = paramBuilder.ad_show_select;
      this.webview_data = paramBuilder.webview_data;
      this.tab_info = Message.immutableCopyOf(paramBuilder.tab_info);
      this.current_tab = paramBuilder.current_tab;
      this.search_query = paramBuilder.search_query;
      this.suggest_querys = paramBuilder.suggest_querys;
      this.game_detail = paramBuilder.game_detail;
      this.sprite_show_strategy = paramBuilder.sprite_show_strategy;
      this.return_page = paramBuilder.return_page;
      this.first_floor = paramBuilder.first_floor;
      this.placeholder_text = paramBuilder.placeholder_text;
      this.thread_album_manage = paramBuilder.thread_album_manage;
      this.scroll = paramBuilder.scroll;
      this.is_tid_white = paramBuilder.is_tid_white;
      this.input_hint = Message.immutableCopyOf(paramBuilder.input_hint);
      this.bawu_delete_reason = paramBuilder.bawu_delete_reason;
      this.mutli_aichat_bot_card = paramBuilder.mutli_aichat_bot_card;
      this.setting_info = paramBuilder.setting_info;
      this.shop_goods_info = paramBuilder.shop_goods_info;
      this.ad_filter = paramBuilder.ad_filter;
      this.bottom_resource = Message.immutableCopyOf(paramBuilder.bottom_resource);
      this.forum_bot_info = paramBuilder.forum_bot_info;
      this.use_hybrid_pb = paramBuilder.use_hybrid_pb;
      this.ad_info = paramBuilder.ad_info;
      this.interact_info = paramBuilder.interact_info;
      this.bottom_bar = paramBuilder.bottom_bar;
      this.bdt_search_info = paramBuilder.bdt_search_info;
      this.ai_game_info = paramBuilder.ai_game_info;
      this.bottom_game_bar = paramBuilder.bottom_game_bar;
      this.page_guid_tips = paramBuilder.page_guid_tips;
      this.comment_overlay_info = paramBuilder.comment_overlay_info;
      this.floor_fold_info = paramBuilder.floor_fold_info;
      this.tail_recommend_info = paramBuilder.tail_recommend_info;
      this.no_more_show_text = paramBuilder.no_more_show_text;
      this.fold_comment_show_text = paramBuilder.fold_comment_show_text;
      this.comment_publisher_config = paramBuilder.comment_publisher_config;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public AdFilter ad_filter;
    
    public String ad_info;
    
    public Integer ad_show_select;
    
    public AddPost add_post;
    
    public AiGameInfo ai_game_info;
    
    public AichatBotCard aichat_bot_card;
    
    public List<AiChatCard> aichat_card;
    
    public AlaLiveInfo ala_info;
    
    public Anti anti;
    
    public AppealInfo appeal_info;
    
    public String asp_shown_info;
    
    public BannerList banner_list;
    
    public BawuDeleteReasonItem bawu_delete_reason;
    
    public BdtSearchInfo bdt_search_info;
    
    public List<ThreadInfo> bjh_recommend;
    
    public BottomBar bottom_bar;
    
    public BottomGameBar bottom_game_bar;
    
    public List<ThemeColorInfo> bottom_resource;
    
    public GameDetail bottom_toast;
    
    public BreadcrumbNavigation breadcrumb_navigation;
    
    public BusinessAccountInfo business_account_info;
    
    public BusinessPromotInfo business_promot_info;
    
    public CommentOverlayInfo comment_overlay_info;
    
    public CommentPublisherConfig comment_publisher_config;
    
    public TabInfo current_tab;
    
    public SimpleForum display_forum;
    
    public EditConfig edit_config;
    
    public EditInfo edit_info;
    
    public Integer exp_guide_today;
    
    public Integer exp_news_today;
    
    public FeedExtInfo feed_info;
    
    public List<ThreadInfo> feed_thread_list;
    
    public List<FineBannerPb> fine_banner;
    
    public Post first_floor;
    
    public Post first_floor_post;
    
    public FloatingIcon floating_icon;
    
    public FloorFoldInfo floor_fold_info;
    
    public Long fold_comment_num;
    
    public String fold_comment_show_text;
    
    public String fold_tip;
    
    public PbFollowTip follow_tip;
    
    public SimpleForum forum;
    
    public ForumBotInfo forum_bot_info;
    
    public ForumHeadlineImgInfo forum_headline_img_info;
    
    public ForumRuleStatus forum_rule;
    
    public List<SimpleForum> from_forum_list;
    
    public GameDetail game_detail;
    
    public GodCard god_card;
    
    public GraffitiRankListInfo graffiti_rank_list_info;
    
    public GuessLikeStruct guess_like;
    
    public List<GuideWordList> guide_word_list;
    
    public Integer has_floor;
    
    public Integer has_fold_comment;
    
    public PbHotPost hot_post_list;
    
    public List<InputHintItem> input_hint;
    
    public InteractInfo interact_info;
    
    public Integer is_black_white;
    
    public Integer is_follow_current_channel;
    
    public Integer is_new_url;
    
    public Integer is_official_forum;
    
    public Integer is_purchase;
    
    public Integer is_tid_white;
    
    public JumpLinkInfo jump_link_info;
    
    public Integer jumptotab1;
    
    public String jumptotab2;
    
    public List<String> limit_dialog_name;
    
    public Lbs location;
    
    public List<FeedKV> log_param;
    
    public ManagerElection manager_election;
    
    public String multi_forum_text;
    
    public MutliAichatBotCard mutli_aichat_bot_card;
    
    public NaGuide na_guide;
    
    public List<SimpleUser> new_agree_user;
    
    public NewsInfo news_info;
    
    public String no_more_show_text;
    
    public Page page;
    
    public PageGuidTips page_guid_tips;
    
    public String partial_visible_toast;
    
    public PbGamePop pb_game_pop;
    
    public String pb_notice;
    
    public Integer pb_notice_type;
    
    public List<PbSortType> pb_sort_info;
    
    public PlaceholderText placeholder_text;
    
    public List<PsRankListItem> play_rank_list;
    
    public List<PostBanner> post_banner;
    
    public List<Post> post_list;
    
    public Promotion promotion;
    
    public PushFeedbackInfo push_feedback_info;
    
    public AlaLiveInfo recom_ala_info;
    
    public List<ThreadInfo> recom_thread_info;
    
    public RecommendBook recommend_book;
    
    public List<RecommendThread> recommend_threads;
    
    public List<SimpleForum> repost_recommend_forum_list;
    
    public String return_page;
    
    public RobotEntrance robot_entrance;
    
    public Integer scroll;
    
    public SdkTopicThread sdk_topic_thread;
    
    public String search_query;
    
    public Integer server_time;
    
    public SettingInfo setting_info;
    
    public ShareChatroom share_chatroom;
    
    public ForumShopGoodsInfo shop_goods_info;
    
    public Integer show_adsense;
    
    public SimilarContent similar_content;
    
    public Integer sort_type;
    
    public SpriteShowStrategy sprite_show_strategy;
    
    public SuggestQuery suggest_querys;
    
    public Integer switch_read_open;
    
    public List<TabInfo> tab_info;
    
    public TailRecommendInfo tail_recommend_info;
    
    public ThreadInfo thread;
    
    public ThreadAlbumManage thread_album_manage;
    
    public Long thread_freq_num;
    
    public List<RecomTopicList> thread_topic;
    
    public PbTopAgreePost top_agree_post_list;
    
    public Post top_answer;
    
    public TwZhiBoAnti twzhibo_anti;
    
    public Integer use_hybrid_pb;
    
    public User user;
    
    public List<User> user_list;
    
    public WebviewData webview_data;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.user = param1DataRes.user;
      this.forum = param1DataRes.forum;
      this.page = param1DataRes.page;
      this.anti = param1DataRes.anti;
      this.add_post = param1DataRes.add_post;
      this.post_list = Message.copyOf(param1DataRes.post_list);
      this.has_floor = param1DataRes.has_floor;
      this.thread = param1DataRes.thread;
      this.location = param1DataRes.location;
      this.is_new_url = param1DataRes.is_new_url;
      this.post_banner = Message.copyOf(param1DataRes.post_banner);
      this.banner_list = param1DataRes.banner_list;
      this.user_list = Message.copyOf(param1DataRes.user_list);
      this.server_time = param1DataRes.server_time;
      this.news_info = param1DataRes.news_info;
      this.recommend_threads = Message.copyOf(param1DataRes.recommend_threads);
      this.fine_banner = Message.copyOf(param1DataRes.fine_banner);
      this.twzhibo_anti = param1DataRes.twzhibo_anti;
      this.sdk_topic_thread = param1DataRes.sdk_topic_thread;
      this.hot_post_list = param1DataRes.hot_post_list;
      this.graffiti_rank_list_info = param1DataRes.graffiti_rank_list_info;
      this.appeal_info = param1DataRes.appeal_info;
      this.god_card = param1DataRes.god_card;
      this.play_rank_list = Message.copyOf(param1DataRes.play_rank_list);
      this.recommend_book = param1DataRes.recommend_book;
      this.ala_info = param1DataRes.ala_info;
      this.forum_headline_img_info = param1DataRes.forum_headline_img_info;
      this.asp_shown_info = param1DataRes.asp_shown_info;
      this.guess_like = param1DataRes.guess_like;
      this.feed_thread_list = Message.copyOf(param1DataRes.feed_thread_list);
      this.is_follow_current_channel = param1DataRes.is_follow_current_channel;
      this.switch_read_open = param1DataRes.switch_read_open;
      this.feed_info = param1DataRes.feed_info;
      this.top_agree_post_list = param1DataRes.top_agree_post_list;
      this.repost_recommend_forum_list = Message.copyOf(param1DataRes.repost_recommend_forum_list);
      this.from_forum_list = Message.copyOf(param1DataRes.from_forum_list);
      this.thread_freq_num = param1DataRes.thread_freq_num;
      this.first_floor_post = param1DataRes.first_floor_post;
      this.display_forum = param1DataRes.display_forum;
      this.new_agree_user = Message.copyOf(param1DataRes.new_agree_user);
      this.partial_visible_toast = param1DataRes.partial_visible_toast;
      this.na_guide = param1DataRes.na_guide;
      this.follow_tip = param1DataRes.follow_tip;
      this.fold_tip = param1DataRes.fold_tip;
      this.exp_news_today = param1DataRes.exp_news_today;
      this.exp_guide_today = param1DataRes.exp_guide_today;
      this.multi_forum_text = param1DataRes.multi_forum_text;
      this.thread_topic = Message.copyOf(param1DataRes.thread_topic);
      this.pb_sort_info = Message.copyOf(param1DataRes.pb_sort_info);
      this.sort_type = param1DataRes.sort_type;
      this.manager_election = param1DataRes.manager_election;
      this.bjh_recommend = Message.copyOf(param1DataRes.bjh_recommend);
      this.business_promot_info = param1DataRes.business_promot_info;
      this.promotion = param1DataRes.promotion;
      this.recom_ala_info = param1DataRes.recom_ala_info;
      this.jumptotab1 = param1DataRes.jumptotab1;
      this.jumptotab2 = param1DataRes.jumptotab2;
      this.business_account_info = param1DataRes.business_account_info;
      this.recom_thread_info = Message.copyOf(param1DataRes.recom_thread_info);
      this.forum_rule = param1DataRes.forum_rule;
      this.show_adsense = param1DataRes.show_adsense;
      this.is_black_white = param1DataRes.is_black_white;
      this.is_official_forum = param1DataRes.is_official_forum;
      this.floating_icon = param1DataRes.floating_icon;
      this.is_purchase = param1DataRes.is_purchase;
      this.pb_notice_type = param1DataRes.pb_notice_type;
      this.pb_notice = param1DataRes.pb_notice;
      this.has_fold_comment = param1DataRes.has_fold_comment;
      this.fold_comment_num = param1DataRes.fold_comment_num;
      this.edit_config = param1DataRes.edit_config;
      this.edit_info = param1DataRes.edit_info;
      this.top_answer = param1DataRes.top_answer;
      this.jump_link_info = param1DataRes.jump_link_info;
      this.similar_content = param1DataRes.similar_content;
      this.robot_entrance = param1DataRes.robot_entrance;
      this.aichat_card = Message.copyOf(param1DataRes.aichat_card);
      this.share_chatroom = param1DataRes.share_chatroom;
      this.aichat_bot_card = param1DataRes.aichat_bot_card;
      this.push_feedback_info = param1DataRes.push_feedback_info;
      this.log_param = Message.copyOf(param1DataRes.log_param);
      this.guide_word_list = Message.copyOf(param1DataRes.guide_word_list);
      this.limit_dialog_name = Message.copyOf(param1DataRes.limit_dialog_name);
      this.bottom_toast = param1DataRes.bottom_toast;
      this.breadcrumb_navigation = param1DataRes.breadcrumb_navigation;
      this.pb_game_pop = param1DataRes.pb_game_pop;
      this.ad_show_select = param1DataRes.ad_show_select;
      this.webview_data = param1DataRes.webview_data;
      this.tab_info = Message.copyOf(param1DataRes.tab_info);
      this.current_tab = param1DataRes.current_tab;
      this.search_query = param1DataRes.search_query;
      this.suggest_querys = param1DataRes.suggest_querys;
      this.game_detail = param1DataRes.game_detail;
      this.sprite_show_strategy = param1DataRes.sprite_show_strategy;
      this.return_page = param1DataRes.return_page;
      this.first_floor = param1DataRes.first_floor;
      this.placeholder_text = param1DataRes.placeholder_text;
      this.thread_album_manage = param1DataRes.thread_album_manage;
      this.scroll = param1DataRes.scroll;
      this.is_tid_white = param1DataRes.is_tid_white;
      this.input_hint = Message.copyOf(param1DataRes.input_hint);
      this.bawu_delete_reason = param1DataRes.bawu_delete_reason;
      this.mutli_aichat_bot_card = param1DataRes.mutli_aichat_bot_card;
      this.setting_info = param1DataRes.setting_info;
      this.shop_goods_info = param1DataRes.shop_goods_info;
      this.ad_filter = param1DataRes.ad_filter;
      this.bottom_resource = Message.copyOf(param1DataRes.bottom_resource);
      this.forum_bot_info = param1DataRes.forum_bot_info;
      this.use_hybrid_pb = param1DataRes.use_hybrid_pb;
      this.ad_info = param1DataRes.ad_info;
      this.interact_info = param1DataRes.interact_info;
      this.bottom_bar = param1DataRes.bottom_bar;
      this.bdt_search_info = param1DataRes.bdt_search_info;
      this.ai_game_info = param1DataRes.ai_game_info;
      this.bottom_game_bar = param1DataRes.bottom_game_bar;
      this.page_guid_tips = param1DataRes.page_guid_tips;
      this.comment_overlay_info = param1DataRes.comment_overlay_info;
      this.floor_fold_info = param1DataRes.floor_fold_info;
      this.tail_recommend_info = param1DataRes.tail_recommend_info;
      this.no_more_show_text = param1DataRes.no_more_show_text;
      this.fold_comment_show_text = param1DataRes.fold_comment_show_text;
      this.comment_publisher_config = param1DataRes.comment_publisher_config;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
