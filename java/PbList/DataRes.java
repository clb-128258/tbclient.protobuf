package tbclient.PbList;

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
import tbclient.FeedKV;
import tbclient.ForumBotInfo;
import tbclient.ForumRuleStatus;
import tbclient.ForumShopGoodsInfo;
import tbclient.GameDetail;
import tbclient.GuideWordList;
import tbclient.InputHintItem;
import tbclient.InteractInfo;
import tbclient.JumpLinkInfo;
import tbclient.ManagerElection;
import tbclient.MutliAichatBotCard;
import tbclient.Page;
import tbclient.PageGuidTips;
import tbclient.Post;
import tbclient.PushFeedbackInfo;
import tbclient.RecomTopicList;
import tbclient.SimpleForum;
import tbclient.SpriteShowStrategy;
import tbclient.TabInfo;
import tbclient.ThemeColorInfo;
import tbclient.ThreadAlbumManage;
import tbclient.ThreadInfo;
import tbclient.User;
import tbclient.WebviewData;

public final class DataRes extends Message {
  public static final Integer DEFAULT_AD_SHOW_SELECT;
  
  public static final List<AiChatCard> DEFAULT_AICHAT_CARD;
  
  public static final List<ThemeColorInfo> DEFAULT_BOTTOM_RESOURCE;
  
  public static final Long DEFAULT_FOLD_COMMENT_NUM;
  
  public static final String DEFAULT_FOLD_TIP = "";
  
  public static final List<SimpleForum> DEFAULT_FROM_FORUM_LIST;
  
  public static final List<GuideWordList> DEFAULT_GUIDE_WORD_LIST;
  
  public static final Integer DEFAULT_HAS_FOLD_COMMENT;
  
  public static final List<InputHintItem> DEFAULT_INPUT_HINT;
  
  public static final Integer DEFAULT_IS_BLACK_WHITE;
  
  public static final Integer DEFAULT_IS_EXCLUSIVE;
  
  public static final Integer DEFAULT_IS_OFFICIAL_FORUM;
  
  public static final Integer DEFAULT_IS_PURCHASE;
  
  public static final List<String> DEFAULT_LIMIT_DIALOG_NAME;
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final String DEFAULT_MULTI_FORUM_TEXT = "";
  
  public static final String DEFAULT_PARTIAL_VISIBLE_TOAST = "";
  
  public static final String DEFAULT_PB_NOTICE = "";
  
  public static final Integer DEFAULT_PB_NOTICE_TYPE;
  
  public static final List<PbSortType> DEFAULT_PB_SORT_INFO;
  
  public static final List<Post> DEFAULT_POST_LIST;
  
  public static final String DEFAULT_RETURN_PAGE = "";
  
  public static final Integer DEFAULT_SHOW_ADSENSE;
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  public static final List<TabInfo> DEFAULT_TAB_INFO;
  
  public static final Long DEFAULT_THREAD_FREQ_NUM;
  
  public static final List<RecomTopicList> DEFAULT_THREAD_TOPIC;
  
  public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_USE_HYBRID_PB;
  
  @ProtoField(tag = 51)
  public final AdFilter ad_filter;
  
  @ProtoField(tag = 26, type = Message.Datatype.INT32)
  public final Integer ad_show_select;
  
  @ProtoField(tag = 62)
  public final AiGameInfo ai_game_info;
  
  @ProtoField(tag = 39)
  public final AichatBotCard aichat_bot_card;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 38)
  public final List<AiChatCard> aichat_card;
  
  @ProtoField(tag = 3)
  public final Anti anti;
  
  @ProtoField(tag = 24)
  public final BannerList banner_list;
  
  @ProtoField(tag = 37)
  public final BawuDeleteReasonItem bawu_delete_reason;
  
  @ProtoField(tag = 61)
  public final BdtSearchInfo bdt_search_info;
  
  @ProtoField(tag = 59)
  public final BottomBar bottom_bar;
  
  @ProtoField(tag = 64)
  public final BottomGameBar bottom_game_bar;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 56)
  public final List<ThemeColorInfo> bottom_resource;
  
  @ProtoField(tag = 28)
  public final GameDetail bottom_toast;
  
  @ProtoField(tag = 29)
  public final BreadcrumbNavigation breadcrumb_navigation;
  
  @ProtoField(tag = 12)
  public final TabInfo current_tab;
  
  @ProtoField(tag = 22)
  public final SimpleForum display_forum;
  
  @ProtoField(tag = 6)
  public final Post first_floor;
  
  @ProtoField(tag = 42)
  public final FloatingIcon floating_icon;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT64)
  public final Long fold_comment_num;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String fold_tip;
  
  @ProtoField(tag = 2)
  public final SimpleForum forum;
  
  @ProtoField(tag = 54)
  public final ForumBotInfo forum_bot_info;
  
  @ProtoField(tag = 36)
  public final ForumRuleStatus forum_rule;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 20)
  public final List<SimpleForum> from_forum_list;
  
  @ProtoField(tag = 31)
  public final GameDetail game_detail;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 45)
  public final List<GuideWordList> guide_word_list;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer has_fold_comment;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 47)
  public final List<InputHintItem> input_hint;
  
  @ProtoField(tag = 60)
  public final InteractInfo interact_info;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer is_black_white;
  
  @ProtoField(tag = 63, type = Message.Datatype.INT32)
  public final Integer is_exclusive;
  
  @ProtoField(tag = 52, type = Message.Datatype.INT32)
  public final Integer is_official_forum;
  
  @ProtoField(tag = 27, type = Message.Datatype.INT32)
  public final Integer is_purchase;
  
  @ProtoField(tag = 44)
  public final JumpLinkInfo jump_link_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 46, type = Message.Datatype.STRING)
  public final List<String> limit_dialog_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 49)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 35)
  public final ManagerElection manager_election;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String multi_forum_text;
  
  @ProtoField(tag = 53)
  public final MutliAichatBotCard mutli_aichat_bot_card;
  
  @ProtoField(tag = 8)
  public final Page page;
  
  @ProtoField(tag = 65)
  public final PageGuidTips page_guid_tips;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String partial_visible_toast;
  
  @ProtoField(tag = 30)
  public final PbGamePop pb_game_pop;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String pb_notice;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer pb_notice_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 9)
  public final List<PbSortType> pb_sort_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<Post> post_list;
  
  @ProtoField(tag = 40)
  public final PushFeedbackInfo push_feedback_info;
  
  @ProtoField(tag = 33)
  public final AlaLiveInfo recom_ala_info;
  
  @ProtoField(tag = 41, type = Message.Datatype.STRING)
  public final String return_page;
  
  @ProtoField(tag = 55)
  public final SettingInfo setting_info;
  
  @ProtoField(tag = 57)
  public final ForumShopGoodsInfo shop_goods_info;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT32)
  public final Integer show_adsense;
  
  @ProtoField(tag = 34)
  public final SimilarContent similar_content;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer sort_type;
  
  @ProtoField(tag = 32)
  public final SpriteShowStrategy sprite_show_strategy;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 11)
  public final List<TabInfo> tab_info;
  
  @ProtoField(tag = 1)
  public final ThreadInfo thread;
  
  @ProtoField(tag = 48)
  public final ThreadAlbumManage thread_album_manage;
  
  @ProtoField(tag = 21, type = Message.Datatype.INT64)
  public final Long thread_freq_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 43)
  public final List<RecomTopicList> thread_topic;
  
  @ProtoField(tag = 58, type = Message.Datatype.INT32)
  public final Integer use_hybrid_pb;
  
  @ProtoField(tag = 4)
  public final User user;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<User> user_list;
  
  @ProtoField(tag = 50)
  public final WebviewData webview_data;
  
  static {
    DEFAULT_POST_LIST = Collections.emptyList();
    DEFAULT_PB_SORT_INFO = Collections.emptyList();
    Integer integer = Integer.valueOf(0);
    DEFAULT_SORT_TYPE = integer;
    DEFAULT_TAB_INFO = Collections.emptyList();
    DEFAULT_IS_BLACK_WHITE = integer;
    DEFAULT_PB_NOTICE_TYPE = integer;
    DEFAULT_HAS_FOLD_COMMENT = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_FOLD_COMMENT_NUM = long_;
    DEFAULT_FROM_FORUM_LIST = Collections.emptyList();
    DEFAULT_THREAD_FREQ_NUM = long_;
    DEFAULT_SHOW_ADSENSE = integer;
    DEFAULT_AD_SHOW_SELECT = integer;
    DEFAULT_IS_PURCHASE = integer;
    DEFAULT_AICHAT_CARD = Collections.emptyList();
    DEFAULT_THREAD_TOPIC = Collections.emptyList();
    DEFAULT_GUIDE_WORD_LIST = Collections.emptyList();
    DEFAULT_LIMIT_DIALOG_NAME = Collections.emptyList();
    DEFAULT_INPUT_HINT = Collections.emptyList();
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_IS_OFFICIAL_FORUM = integer;
    DEFAULT_BOTTOM_RESOURCE = Collections.emptyList();
    DEFAULT_USE_HYBRID_PB = integer;
    DEFAULT_IS_EXCLUSIVE = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.thread = paramBuilder.thread;
      this.forum = paramBuilder.forum;
      this.anti = paramBuilder.anti;
      this.user = paramBuilder.user;
      List<User> list11 = paramBuilder.user_list;
      if (list11 == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list11);
      } 
      this.first_floor = paramBuilder.first_floor;
      List<Post> list10 = paramBuilder.post_list;
      if (list10 == null) {
        this.post_list = DEFAULT_POST_LIST;
      } else {
        this.post_list = Message.immutableCopyOf(list10);
      } 
      this.page = paramBuilder.page;
      List<PbSortType> list9 = paramBuilder.pb_sort_info;
      if (list9 == null) {
        this.pb_sort_info = DEFAULT_PB_SORT_INFO;
      } else {
        this.pb_sort_info = Message.immutableCopyOf(list9);
      } 
      Integer integer6 = paramBuilder.sort_type;
      if (integer6 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer6;
      } 
      List<TabInfo> list8 = paramBuilder.tab_info;
      if (list8 == null) {
        this.tab_info = DEFAULT_TAB_INFO;
      } else {
        this.tab_info = Message.immutableCopyOf(list8);
      } 
      this.current_tab = paramBuilder.current_tab;
      String str4 = paramBuilder.partial_visible_toast;
      if (str4 == null) {
        this.partial_visible_toast = "";
      } else {
        this.partial_visible_toast = str4;
      } 
      str4 = paramBuilder.fold_tip;
      if (str4 == null) {
        this.fold_tip = "";
      } else {
        this.fold_tip = str4;
      } 
      Integer integer5 = paramBuilder.is_black_white;
      if (integer5 == null) {
        this.is_black_white = DEFAULT_IS_BLACK_WHITE;
      } else {
        this.is_black_white = integer5;
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
      Long long_2 = paramBuilder.fold_comment_num;
      if (long_2 == null) {
        this.fold_comment_num = DEFAULT_FOLD_COMMENT_NUM;
      } else {
        this.fold_comment_num = long_2;
      } 
      List<SimpleForum> list7 = paramBuilder.from_forum_list;
      if (list7 == null) {
        this.from_forum_list = DEFAULT_FROM_FORUM_LIST;
      } else {
        this.from_forum_list = Message.immutableCopyOf(list7);
      } 
      Long long_1 = paramBuilder.thread_freq_num;
      if (long_1 == null) {
        this.thread_freq_num = DEFAULT_THREAD_FREQ_NUM;
      } else {
        this.thread_freq_num = long_1;
      } 
      this.display_forum = paramBuilder.display_forum;
      String str2 = paramBuilder.multi_forum_text;
      if (str2 == null) {
        this.multi_forum_text = "";
      } else {
        this.multi_forum_text = str2;
      } 
      this.banner_list = paramBuilder.banner_list;
      Integer integer3 = paramBuilder.show_adsense;
      if (integer3 == null) {
        this.show_adsense = DEFAULT_SHOW_ADSENSE;
      } else {
        this.show_adsense = integer3;
      } 
      integer3 = paramBuilder.ad_show_select;
      if (integer3 == null) {
        this.ad_show_select = DEFAULT_AD_SHOW_SELECT;
      } else {
        this.ad_show_select = integer3;
      } 
      integer3 = paramBuilder.is_purchase;
      if (integer3 == null) {
        this.is_purchase = DEFAULT_IS_PURCHASE;
      } else {
        this.is_purchase = integer3;
      } 
      this.bottom_toast = paramBuilder.bottom_toast;
      this.breadcrumb_navigation = paramBuilder.breadcrumb_navigation;
      this.pb_game_pop = paramBuilder.pb_game_pop;
      this.game_detail = paramBuilder.game_detail;
      this.sprite_show_strategy = paramBuilder.sprite_show_strategy;
      this.recom_ala_info = paramBuilder.recom_ala_info;
      this.similar_content = paramBuilder.similar_content;
      this.manager_election = paramBuilder.manager_election;
      this.forum_rule = paramBuilder.forum_rule;
      this.bawu_delete_reason = paramBuilder.bawu_delete_reason;
      List<AiChatCard> list6 = paramBuilder.aichat_card;
      if (list6 == null) {
        this.aichat_card = DEFAULT_AICHAT_CARD;
      } else {
        this.aichat_card = Message.immutableCopyOf(list6);
      } 
      this.aichat_bot_card = paramBuilder.aichat_bot_card;
      this.push_feedback_info = paramBuilder.push_feedback_info;
      String str1 = paramBuilder.return_page;
      if (str1 == null) {
        this.return_page = "";
      } else {
        this.return_page = str1;
      } 
      this.floating_icon = paramBuilder.floating_icon;
      List<RecomTopicList> list5 = paramBuilder.thread_topic;
      if (list5 == null) {
        this.thread_topic = DEFAULT_THREAD_TOPIC;
      } else {
        this.thread_topic = Message.immutableCopyOf(list5);
      } 
      this.jump_link_info = paramBuilder.jump_link_info;
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
      List<InputHintItem> list2 = paramBuilder.input_hint;
      if (list2 == null) {
        this.input_hint = DEFAULT_INPUT_HINT;
      } else {
        this.input_hint = Message.immutableCopyOf(list2);
      } 
      this.thread_album_manage = paramBuilder.thread_album_manage;
      List<FeedKV> list1 = paramBuilder.log_param;
      if (list1 == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list1);
      } 
      this.webview_data = paramBuilder.webview_data;
      this.ad_filter = paramBuilder.ad_filter;
      Integer integer2 = paramBuilder.is_official_forum;
      if (integer2 == null) {
        this.is_official_forum = DEFAULT_IS_OFFICIAL_FORUM;
      } else {
        this.is_official_forum = integer2;
      } 
      this.mutli_aichat_bot_card = paramBuilder.mutli_aichat_bot_card;
      this.forum_bot_info = paramBuilder.forum_bot_info;
      this.setting_info = paramBuilder.setting_info;
      List<ThemeColorInfo> list = paramBuilder.bottom_resource;
      if (list == null) {
        this.bottom_resource = DEFAULT_BOTTOM_RESOURCE;
      } else {
        this.bottom_resource = Message.immutableCopyOf(list);
      } 
      this.shop_goods_info = paramBuilder.shop_goods_info;
      Integer integer1 = paramBuilder.use_hybrid_pb;
      if (integer1 == null) {
        this.use_hybrid_pb = DEFAULT_USE_HYBRID_PB;
      } else {
        this.use_hybrid_pb = integer1;
      } 
      this.bottom_bar = paramBuilder.bottom_bar;
      this.interact_info = paramBuilder.interact_info;
      this.bdt_search_info = paramBuilder.bdt_search_info;
      this.ai_game_info = paramBuilder.ai_game_info;
      integer1 = paramBuilder.is_exclusive;
      if (integer1 == null) {
        this.is_exclusive = DEFAULT_IS_EXCLUSIVE;
      } else {
        this.is_exclusive = integer1;
      } 
      this.bottom_game_bar = paramBuilder.bottom_game_bar;
      this.page_guid_tips = paramBuilder.page_guid_tips;
    } else {
      this.thread = paramBuilder.thread;
      this.forum = paramBuilder.forum;
      this.anti = paramBuilder.anti;
      this.user = paramBuilder.user;
      this.user_list = Message.immutableCopyOf(paramBuilder.user_list);
      this.first_floor = paramBuilder.first_floor;
      this.post_list = Message.immutableCopyOf(paramBuilder.post_list);
      this.page = paramBuilder.page;
      this.pb_sort_info = Message.immutableCopyOf(paramBuilder.pb_sort_info);
      this.sort_type = paramBuilder.sort_type;
      this.tab_info = Message.immutableCopyOf(paramBuilder.tab_info);
      this.current_tab = paramBuilder.current_tab;
      this.partial_visible_toast = paramBuilder.partial_visible_toast;
      this.fold_tip = paramBuilder.fold_tip;
      this.is_black_white = paramBuilder.is_black_white;
      this.pb_notice_type = paramBuilder.pb_notice_type;
      this.pb_notice = paramBuilder.pb_notice;
      this.has_fold_comment = paramBuilder.has_fold_comment;
      this.fold_comment_num = paramBuilder.fold_comment_num;
      this.from_forum_list = Message.immutableCopyOf(paramBuilder.from_forum_list);
      this.thread_freq_num = paramBuilder.thread_freq_num;
      this.display_forum = paramBuilder.display_forum;
      this.multi_forum_text = paramBuilder.multi_forum_text;
      this.banner_list = paramBuilder.banner_list;
      this.show_adsense = paramBuilder.show_adsense;
      this.ad_show_select = paramBuilder.ad_show_select;
      this.is_purchase = paramBuilder.is_purchase;
      this.bottom_toast = paramBuilder.bottom_toast;
      this.breadcrumb_navigation = paramBuilder.breadcrumb_navigation;
      this.pb_game_pop = paramBuilder.pb_game_pop;
      this.game_detail = paramBuilder.game_detail;
      this.sprite_show_strategy = paramBuilder.sprite_show_strategy;
      this.recom_ala_info = paramBuilder.recom_ala_info;
      this.similar_content = paramBuilder.similar_content;
      this.manager_election = paramBuilder.manager_election;
      this.forum_rule = paramBuilder.forum_rule;
      this.bawu_delete_reason = paramBuilder.bawu_delete_reason;
      this.aichat_card = Message.immutableCopyOf(paramBuilder.aichat_card);
      this.aichat_bot_card = paramBuilder.aichat_bot_card;
      this.push_feedback_info = paramBuilder.push_feedback_info;
      this.return_page = paramBuilder.return_page;
      this.floating_icon = paramBuilder.floating_icon;
      this.thread_topic = Message.immutableCopyOf(paramBuilder.thread_topic);
      this.jump_link_info = paramBuilder.jump_link_info;
      this.guide_word_list = Message.immutableCopyOf(paramBuilder.guide_word_list);
      this.limit_dialog_name = Message.immutableCopyOf(paramBuilder.limit_dialog_name);
      this.input_hint = Message.immutableCopyOf(paramBuilder.input_hint);
      this.thread_album_manage = paramBuilder.thread_album_manage;
      this.log_param = Message.immutableCopyOf(paramBuilder.log_param);
      this.webview_data = paramBuilder.webview_data;
      this.ad_filter = paramBuilder.ad_filter;
      this.is_official_forum = paramBuilder.is_official_forum;
      this.mutli_aichat_bot_card = paramBuilder.mutli_aichat_bot_card;
      this.forum_bot_info = paramBuilder.forum_bot_info;
      this.setting_info = paramBuilder.setting_info;
      this.bottom_resource = Message.immutableCopyOf(paramBuilder.bottom_resource);
      this.shop_goods_info = paramBuilder.shop_goods_info;
      this.use_hybrid_pb = paramBuilder.use_hybrid_pb;
      this.bottom_bar = paramBuilder.bottom_bar;
      this.interact_info = paramBuilder.interact_info;
      this.bdt_search_info = paramBuilder.bdt_search_info;
      this.ai_game_info = paramBuilder.ai_game_info;
      this.is_exclusive = paramBuilder.is_exclusive;
      this.bottom_game_bar = paramBuilder.bottom_game_bar;
      this.page_guid_tips = paramBuilder.page_guid_tips;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public AdFilter ad_filter;
    
    public Integer ad_show_select;
    
    public AiGameInfo ai_game_info;
    
    public AichatBotCard aichat_bot_card;
    
    public List<AiChatCard> aichat_card;
    
    public Anti anti;
    
    public BannerList banner_list;
    
    public BawuDeleteReasonItem bawu_delete_reason;
    
    public BdtSearchInfo bdt_search_info;
    
    public BottomBar bottom_bar;
    
    public BottomGameBar bottom_game_bar;
    
    public List<ThemeColorInfo> bottom_resource;
    
    public GameDetail bottom_toast;
    
    public BreadcrumbNavigation breadcrumb_navigation;
    
    public TabInfo current_tab;
    
    public SimpleForum display_forum;
    
    public Post first_floor;
    
    public FloatingIcon floating_icon;
    
    public Long fold_comment_num;
    
    public String fold_tip;
    
    public SimpleForum forum;
    
    public ForumBotInfo forum_bot_info;
    
    public ForumRuleStatus forum_rule;
    
    public List<SimpleForum> from_forum_list;
    
    public GameDetail game_detail;
    
    public List<GuideWordList> guide_word_list;
    
    public Integer has_fold_comment;
    
    public List<InputHintItem> input_hint;
    
    public InteractInfo interact_info;
    
    public Integer is_black_white;
    
    public Integer is_exclusive;
    
    public Integer is_official_forum;
    
    public Integer is_purchase;
    
    public JumpLinkInfo jump_link_info;
    
    public List<String> limit_dialog_name;
    
    public List<FeedKV> log_param;
    
    public ManagerElection manager_election;
    
    public String multi_forum_text;
    
    public MutliAichatBotCard mutli_aichat_bot_card;
    
    public Page page;
    
    public PageGuidTips page_guid_tips;
    
    public String partial_visible_toast;
    
    public PbGamePop pb_game_pop;
    
    public String pb_notice;
    
    public Integer pb_notice_type;
    
    public List<PbSortType> pb_sort_info;
    
    public List<Post> post_list;
    
    public PushFeedbackInfo push_feedback_info;
    
    public AlaLiveInfo recom_ala_info;
    
    public String return_page;
    
    public SettingInfo setting_info;
    
    public ForumShopGoodsInfo shop_goods_info;
    
    public Integer show_adsense;
    
    public SimilarContent similar_content;
    
    public Integer sort_type;
    
    public SpriteShowStrategy sprite_show_strategy;
    
    public List<TabInfo> tab_info;
    
    public ThreadInfo thread;
    
    public ThreadAlbumManage thread_album_manage;
    
    public Long thread_freq_num;
    
    public List<RecomTopicList> thread_topic;
    
    public Integer use_hybrid_pb;
    
    public User user;
    
    public List<User> user_list;
    
    public WebviewData webview_data;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.thread = param1DataRes.thread;
      this.forum = param1DataRes.forum;
      this.anti = param1DataRes.anti;
      this.user = param1DataRes.user;
      this.user_list = Message.copyOf(param1DataRes.user_list);
      this.first_floor = param1DataRes.first_floor;
      this.post_list = Message.copyOf(param1DataRes.post_list);
      this.page = param1DataRes.page;
      this.pb_sort_info = Message.copyOf(param1DataRes.pb_sort_info);
      this.sort_type = param1DataRes.sort_type;
      this.tab_info = Message.copyOf(param1DataRes.tab_info);
      this.current_tab = param1DataRes.current_tab;
      this.partial_visible_toast = param1DataRes.partial_visible_toast;
      this.fold_tip = param1DataRes.fold_tip;
      this.is_black_white = param1DataRes.is_black_white;
      this.pb_notice_type = param1DataRes.pb_notice_type;
      this.pb_notice = param1DataRes.pb_notice;
      this.has_fold_comment = param1DataRes.has_fold_comment;
      this.fold_comment_num = param1DataRes.fold_comment_num;
      this.from_forum_list = Message.copyOf(param1DataRes.from_forum_list);
      this.thread_freq_num = param1DataRes.thread_freq_num;
      this.display_forum = param1DataRes.display_forum;
      this.multi_forum_text = param1DataRes.multi_forum_text;
      this.banner_list = param1DataRes.banner_list;
      this.show_adsense = param1DataRes.show_adsense;
      this.ad_show_select = param1DataRes.ad_show_select;
      this.is_purchase = param1DataRes.is_purchase;
      this.bottom_toast = param1DataRes.bottom_toast;
      this.breadcrumb_navigation = param1DataRes.breadcrumb_navigation;
      this.pb_game_pop = param1DataRes.pb_game_pop;
      this.game_detail = param1DataRes.game_detail;
      this.sprite_show_strategy = param1DataRes.sprite_show_strategy;
      this.recom_ala_info = param1DataRes.recom_ala_info;
      this.similar_content = param1DataRes.similar_content;
      this.manager_election = param1DataRes.manager_election;
      this.forum_rule = param1DataRes.forum_rule;
      this.bawu_delete_reason = param1DataRes.bawu_delete_reason;
      this.aichat_card = Message.copyOf(param1DataRes.aichat_card);
      this.aichat_bot_card = param1DataRes.aichat_bot_card;
      this.push_feedback_info = param1DataRes.push_feedback_info;
      this.return_page = param1DataRes.return_page;
      this.floating_icon = param1DataRes.floating_icon;
      this.thread_topic = Message.copyOf(param1DataRes.thread_topic);
      this.jump_link_info = param1DataRes.jump_link_info;
      this.guide_word_list = Message.copyOf(param1DataRes.guide_word_list);
      this.limit_dialog_name = Message.copyOf(param1DataRes.limit_dialog_name);
      this.input_hint = Message.copyOf(param1DataRes.input_hint);
      this.thread_album_manage = param1DataRes.thread_album_manage;
      this.log_param = Message.copyOf(param1DataRes.log_param);
      this.webview_data = param1DataRes.webview_data;
      this.ad_filter = param1DataRes.ad_filter;
      this.is_official_forum = param1DataRes.is_official_forum;
      this.mutli_aichat_bot_card = param1DataRes.mutli_aichat_bot_card;
      this.forum_bot_info = param1DataRes.forum_bot_info;
      this.setting_info = param1DataRes.setting_info;
      this.bottom_resource = Message.copyOf(param1DataRes.bottom_resource);
      this.shop_goods_info = param1DataRes.shop_goods_info;
      this.use_hybrid_pb = param1DataRes.use_hybrid_pb;
      this.bottom_bar = param1DataRes.bottom_bar;
      this.interact_info = param1DataRes.interact_info;
      this.bdt_search_info = param1DataRes.bdt_search_info;
      this.ai_game_info = param1DataRes.ai_game_info;
      this.is_exclusive = param1DataRes.is_exclusive;
      this.bottom_game_bar = param1DataRes.bottom_game_bar;
      this.page_guid_tips = param1DataRes.page_guid_tips;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
