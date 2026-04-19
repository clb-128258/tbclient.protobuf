package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ActiveCenter;
import tbclient.Anti;
import tbclient.BannerList;
import tbclient.DiscoverHotForum;
import tbclient.FavoritePanel;
import tbclient.FeedKV;
import tbclient.SimpleForum;
import tbclient.ThreadInfo;
import tbclient.UserReadStyle;

public final class DataRes extends Message {
  public static final Integer DEFAULT_AD_SHOW_SELECT;
  
  public static final List<CardForum> DEFAULT_CARD_FORUM;
  
  public static final List<CardGod> DEFAULT_CARD_GOD;
  
  public static final List<CardTopic> DEFAULT_CARD_TOPIC;
  
  public static final Integer DEFAULT_FRESH_CTRL_NUM;
  
  public static final Integer DEFAULT_HIT_DOUBLE_COLUMN_USER_EXP;
  
  public static final List<TagStruct> DEFAULT_INTERESTION;
  
  public static final Integer DEFAULT_IS_NEED_LIVE_UNUNIQ;
  
  public static final Integer DEFAULT_IS_NEW_URL;
  
  public static final Integer DEFAULT_IS_SHOUBAI_UGC_AGREE_NEW_STYLE;
  
  public static final List<SimpleForum> DEFAULT_LIKE_FORUMS;
  
  public static final String DEFAULT_LOADING_TEXT = "";
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final Integer DEFAULT_NEED_POST_CDN;
  
  public static final List<PrefetchInfo> DEFAULT_PREFETCH_INFO;
  
  public static final List<Resource> DEFAULT_RESOURCE_LIST;
  
  public static final String DEFAULT_SEND_THREAD_BUTTON_SCHEME = "";
  
  public static final Integer DEFAULT_SHOW_ADSENSE;
  
  public static final String DEFAULT_SHOW_FREQUENCY = "";
  
  public static final String DEFAULT_STAT_KEY = "";
  
  public static final Integer DEFAULT_STYLE_AB_TAG;
  
  public static final Integer DEFAULT_SUG_SECONDS;
  
  public static final List<TagInfo> DEFAULT_TAG_LIST = Collections.emptyList();
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public static final List<ThreadPersonalized> DEFAULT_THREAD_PERSONALIZED;
  
  @ProtoField(tag = 22)
  public final ActiveCenter active_center;
  
  @ProtoField(tag = 38, type = Message.Datatype.INT32)
  public final Integer ad_show_select;
  
  @ProtoField(tag = 10)
  public final AgeSexModule age_sex;
  
  @ProtoField(tag = 16)
  public final Anti anti;
  
  @ProtoField(tag = 9)
  public final BannerList banner_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<CardForum> card_forum;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 12)
  public final List<CardGod> card_god;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<CardTopic> card_topic;
  
  @ProtoField(tag = 24)
  public final FavoritePanel favorite_panel;
  
  @ProtoField(tag = 18)
  public final FloatInfo float_info;
  
  @ProtoField(tag = 21, type = Message.Datatype.INT32)
  public final Integer fresh_ctrl_num;
  
  @ProtoField(tag = 39)
  public final IndexGuideCardInfo guide_card;
  
  @ProtoField(tag = 26)
  public final HeaderCard header_card;
  
  @ProtoField(tag = 41, type = Message.Datatype.INT32)
  public final Integer hit_double_column_user_exp;
  
  @ProtoField(tag = 28)
  public final HotCard hot_card;
  
  @ProtoField(tag = 23)
  public final DiscoverHotForum hot_recomforum;
  
  @ProtoField(tag = 34)
  public final DiscoverHotForum hot_recomforum_top;
  
  @ProtoField(tag = 36)
  public final InterestClass interest_class;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 11)
  public final List<TagStruct> interestion;
  
  @ProtoField(tag = 31, type = Message.Datatype.INT32)
  public final Integer is_need_live_ununiq;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer is_new_url;
  
  @ProtoField(tag = 45, type = Message.Datatype.INT32)
  public final Integer is_shoubai_ugc_agree_new_style;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 14)
  public final List<SimpleForum> like_forums;
  
  @ProtoField(tag = 17)
  public final LiveAnswer live_answer;
  
  @ProtoField(tag = 42, type = Message.Datatype.STRING)
  public final String loading_text;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 35)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 44, type = Message.Datatype.INT32)
  public final Integer need_post_cdn;
  
  @ProtoField(tag = 30)
  public final NovelCard novel_card;
  
  @ProtoField(tag = 27)
  public final PageData page_data;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 40)
  public final List<PrefetchInfo> prefetch_info;
  
  @ProtoField(tag = 19)
  public final RecomPostTopic recom_post_topic;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<Resource> resource_list;
  
  @ProtoField(tag = 43, type = Message.Datatype.STRING)
  public final String send_thread_button_scheme;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT32)
  public final Integer show_adsense;
  
  @ProtoField(tag = 37, type = Message.Datatype.STRING)
  public final String show_frequency;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String stat_key;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer style_ab_tag;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer sug_seconds;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<TagInfo> tag_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<ThreadPersonalized> thread_personalized;
  
  @ProtoField(tag = 20)
  public final UserFollowLive user_follow_live;
  
  @ProtoField(tag = 46)
  public final UserReadStyle user_read_style;
  
  static {
    DEFAULT_RESOURCE_LIST = Collections.emptyList();
    DEFAULT_CARD_FORUM = Collections.emptyList();
    DEFAULT_CARD_TOPIC = Collections.emptyList();
    Integer integer = Integer.valueOf(0);
    DEFAULT_SUG_SECONDS = integer;
    DEFAULT_THREAD_PERSONALIZED = Collections.emptyList();
    DEFAULT_IS_NEW_URL = integer;
    DEFAULT_INTERESTION = Collections.emptyList();
    DEFAULT_CARD_GOD = Collections.emptyList();
    DEFAULT_LIKE_FORUMS = Collections.emptyList();
    DEFAULT_STYLE_AB_TAG = integer;
    DEFAULT_FRESH_CTRL_NUM = integer;
    DEFAULT_SHOW_ADSENSE = integer;
    DEFAULT_IS_NEED_LIVE_UNUNIQ = integer;
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_AD_SHOW_SELECT = integer;
    DEFAULT_PREFETCH_INFO = Collections.emptyList();
    DEFAULT_HIT_DOUBLE_COLUMN_USER_EXP = integer;
    DEFAULT_NEED_POST_CDN = integer;
    DEFAULT_IS_SHOUBAI_UGC_AGREE_NEW_STYLE = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<TagInfo> list10 = paramBuilder.tag_list;
      if (list10 == null) {
        this.tag_list = DEFAULT_TAG_LIST;
      } else {
        this.tag_list = Message.immutableCopyOf(list10);
      } 
      List<ThreadInfo> list9 = paramBuilder.thread_list;
      if (list9 == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list9);
      } 
      List<Resource> list8 = paramBuilder.resource_list;
      if (list8 == null) {
        this.resource_list = DEFAULT_RESOURCE_LIST;
      } else {
        this.resource_list = Message.immutableCopyOf(list8);
      } 
      List<CardForum> list7 = paramBuilder.card_forum;
      if (list7 == null) {
        this.card_forum = DEFAULT_CARD_FORUM;
      } else {
        this.card_forum = Message.immutableCopyOf(list7);
      } 
      List<CardTopic> list6 = paramBuilder.card_topic;
      if (list6 == null) {
        this.card_topic = DEFAULT_CARD_TOPIC;
      } else {
        this.card_topic = Message.immutableCopyOf(list6);
      } 
      Integer integer6 = paramBuilder.sug_seconds;
      if (integer6 == null) {
        this.sug_seconds = DEFAULT_SUG_SECONDS;
      } else {
        this.sug_seconds = integer6;
      } 
      List<ThreadPersonalized> list5 = paramBuilder.thread_personalized;
      if (list5 == null) {
        this.thread_personalized = DEFAULT_THREAD_PERSONALIZED;
      } else {
        this.thread_personalized = Message.immutableCopyOf(list5);
      } 
      Integer integer5 = paramBuilder.is_new_url;
      if (integer5 == null) {
        this.is_new_url = DEFAULT_IS_NEW_URL;
      } else {
        this.is_new_url = integer5;
      } 
      this.banner_list = paramBuilder.banner_list;
      this.age_sex = paramBuilder.age_sex;
      List<TagStruct> list4 = paramBuilder.interestion;
      if (list4 == null) {
        this.interestion = DEFAULT_INTERESTION;
      } else {
        this.interestion = Message.immutableCopyOf(list4);
      } 
      List<CardGod> list3 = paramBuilder.card_god;
      if (list3 == null) {
        this.card_god = DEFAULT_CARD_GOD;
      } else {
        this.card_god = Message.immutableCopyOf(list3);
      } 
      String str3 = paramBuilder.stat_key;
      if (str3 == null) {
        this.stat_key = "";
      } else {
        this.stat_key = str3;
      } 
      List<SimpleForum> list2 = paramBuilder.like_forums;
      if (list2 == null) {
        this.like_forums = DEFAULT_LIKE_FORUMS;
      } else {
        this.like_forums = Message.immutableCopyOf(list2);
      } 
      Integer integer4 = paramBuilder.style_ab_tag;
      if (integer4 == null) {
        this.style_ab_tag = DEFAULT_STYLE_AB_TAG;
      } else {
        this.style_ab_tag = integer4;
      } 
      this.anti = paramBuilder.anti;
      this.live_answer = paramBuilder.live_answer;
      this.float_info = paramBuilder.float_info;
      this.recom_post_topic = paramBuilder.recom_post_topic;
      this.user_follow_live = paramBuilder.user_follow_live;
      integer4 = paramBuilder.fresh_ctrl_num;
      if (integer4 == null) {
        this.fresh_ctrl_num = DEFAULT_FRESH_CTRL_NUM;
      } else {
        this.fresh_ctrl_num = integer4;
      } 
      this.active_center = paramBuilder.active_center;
      this.hot_recomforum = paramBuilder.hot_recomforum;
      this.favorite_panel = paramBuilder.favorite_panel;
      integer4 = paramBuilder.show_adsense;
      if (integer4 == null) {
        this.show_adsense = DEFAULT_SHOW_ADSENSE;
      } else {
        this.show_adsense = integer4;
      } 
      this.header_card = paramBuilder.header_card;
      this.page_data = paramBuilder.page_data;
      this.hot_card = paramBuilder.hot_card;
      this.novel_card = paramBuilder.novel_card;
      integer4 = paramBuilder.is_need_live_ununiq;
      if (integer4 == null) {
        this.is_need_live_ununiq = DEFAULT_IS_NEED_LIVE_UNUNIQ;
      } else {
        this.is_need_live_ununiq = integer4;
      } 
      this.hot_recomforum_top = paramBuilder.hot_recomforum_top;
      List<FeedKV> list1 = paramBuilder.log_param;
      if (list1 == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list1);
      } 
      this.interest_class = paramBuilder.interest_class;
      String str2 = paramBuilder.show_frequency;
      if (str2 == null) {
        this.show_frequency = "";
      } else {
        this.show_frequency = str2;
      } 
      Integer integer3 = paramBuilder.ad_show_select;
      if (integer3 == null) {
        this.ad_show_select = DEFAULT_AD_SHOW_SELECT;
      } else {
        this.ad_show_select = integer3;
      } 
      this.guide_card = paramBuilder.guide_card;
      List<PrefetchInfo> list = paramBuilder.prefetch_info;
      if (list == null) {
        this.prefetch_info = DEFAULT_PREFETCH_INFO;
      } else {
        this.prefetch_info = Message.immutableCopyOf(list);
      } 
      Integer integer2 = paramBuilder.hit_double_column_user_exp;
      if (integer2 == null) {
        this.hit_double_column_user_exp = DEFAULT_HIT_DOUBLE_COLUMN_USER_EXP;
      } else {
        this.hit_double_column_user_exp = integer2;
      } 
      String str1 = paramBuilder.loading_text;
      if (str1 == null) {
        this.loading_text = "";
      } else {
        this.loading_text = str1;
      } 
      str1 = paramBuilder.send_thread_button_scheme;
      if (str1 == null) {
        this.send_thread_button_scheme = "";
      } else {
        this.send_thread_button_scheme = str1;
      } 
      Integer integer1 = paramBuilder.need_post_cdn;
      if (integer1 == null) {
        this.need_post_cdn = DEFAULT_NEED_POST_CDN;
      } else {
        this.need_post_cdn = integer1;
      } 
      integer1 = paramBuilder.is_shoubai_ugc_agree_new_style;
      if (integer1 == null) {
        this.is_shoubai_ugc_agree_new_style = DEFAULT_IS_SHOUBAI_UGC_AGREE_NEW_STYLE;
      } else {
        this.is_shoubai_ugc_agree_new_style = integer1;
      } 
      this.user_read_style = paramBuilder.user_read_style;
    } else {
      this.tag_list = Message.immutableCopyOf(paramBuilder.tag_list);
      this.thread_list = Message.immutableCopyOf(paramBuilder.thread_list);
      this.resource_list = Message.immutableCopyOf(paramBuilder.resource_list);
      this.card_forum = Message.immutableCopyOf(paramBuilder.card_forum);
      this.card_topic = Message.immutableCopyOf(paramBuilder.card_topic);
      this.sug_seconds = paramBuilder.sug_seconds;
      this.thread_personalized = Message.immutableCopyOf(paramBuilder.thread_personalized);
      this.is_new_url = paramBuilder.is_new_url;
      this.banner_list = paramBuilder.banner_list;
      this.age_sex = paramBuilder.age_sex;
      this.interestion = Message.immutableCopyOf(paramBuilder.interestion);
      this.card_god = Message.immutableCopyOf(paramBuilder.card_god);
      this.stat_key = paramBuilder.stat_key;
      this.like_forums = Message.immutableCopyOf(paramBuilder.like_forums);
      this.style_ab_tag = paramBuilder.style_ab_tag;
      this.anti = paramBuilder.anti;
      this.live_answer = paramBuilder.live_answer;
      this.float_info = paramBuilder.float_info;
      this.recom_post_topic = paramBuilder.recom_post_topic;
      this.user_follow_live = paramBuilder.user_follow_live;
      this.fresh_ctrl_num = paramBuilder.fresh_ctrl_num;
      this.active_center = paramBuilder.active_center;
      this.hot_recomforum = paramBuilder.hot_recomforum;
      this.favorite_panel = paramBuilder.favorite_panel;
      this.show_adsense = paramBuilder.show_adsense;
      this.header_card = paramBuilder.header_card;
      this.page_data = paramBuilder.page_data;
      this.hot_card = paramBuilder.hot_card;
      this.novel_card = paramBuilder.novel_card;
      this.is_need_live_ununiq = paramBuilder.is_need_live_ununiq;
      this.hot_recomforum_top = paramBuilder.hot_recomforum_top;
      this.log_param = Message.immutableCopyOf(paramBuilder.log_param);
      this.interest_class = paramBuilder.interest_class;
      this.show_frequency = paramBuilder.show_frequency;
      this.ad_show_select = paramBuilder.ad_show_select;
      this.guide_card = paramBuilder.guide_card;
      this.prefetch_info = Message.immutableCopyOf(paramBuilder.prefetch_info);
      this.hit_double_column_user_exp = paramBuilder.hit_double_column_user_exp;
      this.loading_text = paramBuilder.loading_text;
      this.send_thread_button_scheme = paramBuilder.send_thread_button_scheme;
      this.need_post_cdn = paramBuilder.need_post_cdn;
      this.is_shoubai_ugc_agree_new_style = paramBuilder.is_shoubai_ugc_agree_new_style;
      this.user_read_style = paramBuilder.user_read_style;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public ActiveCenter active_center;
    
    public Integer ad_show_select;
    
    public AgeSexModule age_sex;
    
    public Anti anti;
    
    public BannerList banner_list;
    
    public List<CardForum> card_forum;
    
    public List<CardGod> card_god;
    
    public List<CardTopic> card_topic;
    
    public FavoritePanel favorite_panel;
    
    public FloatInfo float_info;
    
    public Integer fresh_ctrl_num;
    
    public IndexGuideCardInfo guide_card;
    
    public HeaderCard header_card;
    
    public Integer hit_double_column_user_exp;
    
    public HotCard hot_card;
    
    public DiscoverHotForum hot_recomforum;
    
    public DiscoverHotForum hot_recomforum_top;
    
    public InterestClass interest_class;
    
    public List<TagStruct> interestion;
    
    public Integer is_need_live_ununiq;
    
    public Integer is_new_url;
    
    public Integer is_shoubai_ugc_agree_new_style;
    
    public List<SimpleForum> like_forums;
    
    public LiveAnswer live_answer;
    
    public String loading_text;
    
    public List<FeedKV> log_param;
    
    public Integer need_post_cdn;
    
    public NovelCard novel_card;
    
    public PageData page_data;
    
    public List<PrefetchInfo> prefetch_info;
    
    public RecomPostTopic recom_post_topic;
    
    public List<Resource> resource_list;
    
    public String send_thread_button_scheme;
    
    public Integer show_adsense;
    
    public String show_frequency;
    
    public String stat_key;
    
    public Integer style_ab_tag;
    
    public Integer sug_seconds;
    
    public List<TagInfo> tag_list;
    
    public List<ThreadInfo> thread_list;
    
    public List<ThreadPersonalized> thread_personalized;
    
    public UserFollowLive user_follow_live;
    
    public UserReadStyle user_read_style;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.tag_list = Message.copyOf(param1DataRes.tag_list);
      this.thread_list = Message.copyOf(param1DataRes.thread_list);
      this.resource_list = Message.copyOf(param1DataRes.resource_list);
      this.card_forum = Message.copyOf(param1DataRes.card_forum);
      this.card_topic = Message.copyOf(param1DataRes.card_topic);
      this.sug_seconds = param1DataRes.sug_seconds;
      this.thread_personalized = Message.copyOf(param1DataRes.thread_personalized);
      this.is_new_url = param1DataRes.is_new_url;
      this.banner_list = param1DataRes.banner_list;
      this.age_sex = param1DataRes.age_sex;
      this.interestion = Message.copyOf(param1DataRes.interestion);
      this.card_god = Message.copyOf(param1DataRes.card_god);
      this.stat_key = param1DataRes.stat_key;
      this.like_forums = Message.copyOf(param1DataRes.like_forums);
      this.style_ab_tag = param1DataRes.style_ab_tag;
      this.anti = param1DataRes.anti;
      this.live_answer = param1DataRes.live_answer;
      this.float_info = param1DataRes.float_info;
      this.recom_post_topic = param1DataRes.recom_post_topic;
      this.user_follow_live = param1DataRes.user_follow_live;
      this.fresh_ctrl_num = param1DataRes.fresh_ctrl_num;
      this.active_center = param1DataRes.active_center;
      this.hot_recomforum = param1DataRes.hot_recomforum;
      this.favorite_panel = param1DataRes.favorite_panel;
      this.show_adsense = param1DataRes.show_adsense;
      this.header_card = param1DataRes.header_card;
      this.page_data = param1DataRes.page_data;
      this.hot_card = param1DataRes.hot_card;
      this.novel_card = param1DataRes.novel_card;
      this.is_need_live_ununiq = param1DataRes.is_need_live_ununiq;
      this.hot_recomforum_top = param1DataRes.hot_recomforum_top;
      this.log_param = Message.copyOf(param1DataRes.log_param);
      this.interest_class = param1DataRes.interest_class;
      this.show_frequency = param1DataRes.show_frequency;
      this.ad_show_select = param1DataRes.ad_show_select;
      this.guide_card = param1DataRes.guide_card;
      this.prefetch_info = Message.copyOf(param1DataRes.prefetch_info);
      this.hit_double_column_user_exp = param1DataRes.hit_double_column_user_exp;
      this.loading_text = param1DataRes.loading_text;
      this.send_thread_button_scheme = param1DataRes.send_thread_button_scheme;
      this.need_post_cdn = param1DataRes.need_post_cdn;
      this.is_shoubai_ugc_agree_new_style = param1DataRes.is_shoubai_ugc_agree_new_style;
      this.user_read_style = param1DataRes.user_read_style;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
