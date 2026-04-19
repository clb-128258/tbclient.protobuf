package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Post extends Message {
  public static final Integer DEFAULT_ADD_POST_NUMBER;
  
  public static final Integer DEFAULT_ADOPT_STATUS;
  
  public static final List<String> DEFAULT_ARR_VIDEO;
  
  public static final Long DEFAULT_AUTHOR_ID;
  
  public static final Integer DEFAULT_BDT_USER_ADOPT;
  
  public static final String DEFAULT_BIMG_URL = "";
  
  public static final String DEFAULT_BOT_REPLY_CONTENT = "";
  
  public static final List<BotReplyContent> DEFAULT_BOT_REPLY_CONTENT_LIST;
  
  public static final List<CardLinkInfo> DEFAULT_CARD_LINK_INFO;
  
  public static final List<ComponentFactory> DEFAULT_COMPONENTS;
  
  public static final List<PbContent> DEFAULT_CONTENT;
  
  public static final String DEFAULT_CONTENT_STATEMENT = "";
  
  public static final String DEFAULT_DYNAMIC_URL = "";
  
  public static final List<TailInfo> DEFAULT_EXT_TAILS;
  
  public static final Integer DEFAULT_FLOOR;
  
  public static final String DEFAULT_FOLD_COMMENT_APPLY_URL = "";
  
  public static final Integer DEFAULT_FOLD_COMMENT_STATUS;
  
  public static final String DEFAULT_FOLD_TIP = "";
  
  public static final String DEFAULT_FOOTER = "";
  
  public static final List<FeedHeadSymbol> DEFAULT_HEAD_EXTRA_INFO;
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final Long DEFAULT_ID;
  
  public static final Integer DEFAULT_IMG_NUM_ABTEST;
  
  public static final String DEFAULT_IOS_BIMG_FORMAT = "";
  
  public static final String DEFAULT_IOS_B_URL = "";
  
  public static final Integer DEFAULT_IS_AD_THREAD_POST;
  
  public static final Integer DEFAULT_IS_BJH;
  
  public static final Integer DEFAULT_IS_BOT_REPLY;
  
  public static final Integer DEFAULT_IS_BUB;
  
  public static final Integer DEFAULT_IS_FOLD;
  
  public static final Integer DEFAULT_IS_HOT_POST;
  
  public static final Integer DEFAULT_IS_NTITLE;
  
  public static final Integer DEFAULT_IS_POST_VISIBLE;
  
  public static final Integer DEFAULT_IS_TOP_AGREE_POST;
  
  public static final Integer DEFAULT_IS_VOICE;
  
  public static final Integer DEFAULT_IS_VOTE;
  
  public static final Integer DEFAULT_IS_WONDERFUL_POST;
  
  public static final List<HeadItem> DEFAULT_ITEM_STAR;
  
  public static final String DEFAULT_LEGO_CARD = "";
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final Integer DEFAULT_NEED_LOG;
  
  public static final List<PbContent> DEFAULT_NO_PIC_CONTENT;
  
  public static final List<PbContent> DEFAULT_PIC_CONTENT;
  
  public static final String DEFAULT_QUOTE_ID = "";
  
  public static final List<RobotSkill> DEFAULT_ROBOT_SKILL;
  
  public static final String DEFAULT_RUMOR_SOURCE_IMG = "";
  
  public static final Integer DEFAULT_SHIELD_ICON;
  
  public static final Integer DEFAULT_SHOW_SQUARED;
  
  public static final Integer DEFAULT_STORECOUNT;
  
  public static final Integer DEFAULT_SUB_POST_NUMBER;
  
  public static final Long DEFAULT_TID;
  
  public static final Integer DEFAULT_TIME;
  
  public static final String DEFAULT_TIME_EX = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TMONEY = "";
  
  public static final String DEFAULT_TOUTIAO_CARD_TAG = "";
  
  public static final String DEFAULT_TOUTIAO_CARD_TAG_COLOR = "";
  
  public static final String DEFAULT_VOTE_CRYPT = "";
  
  @ProtoField(tag = 27)
  public final ActPost act_post;
  
  @ProtoField(tag = 16)
  public final AddPostList add_post_list;
  
  @ProtoField(tag = 20, type = Message.Datatype.UINT32)
  public final Integer add_post_number;
  
  @ProtoField(tag = 93, type = Message.Datatype.INT32)
  public final Integer adopt_status;
  
  @ProtoField(tag = 55)
  public final Advertisement advertisement;
  
  @ProtoField(tag = 37)
  public final Agree agree;
  
  @ProtoField(tag = 80)
  public final AichatBotCommentCard aichat_bot_comment_card;
  
  @ProtoField(tag = 77)
  public final AigcFeedbackInfo aigc_feedback_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.STRING)
  public final List<String> arr_video;
  
  @ProtoField(tag = 23)
  public final User author;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT64)
  public final Long author_id;
  
  @ProtoField(tag = 90)
  public final BdtSearchInfo bdt_search_info;
  
  @ProtoField(tag = 91, type = Message.Datatype.INT32)
  public final Integer bdt_user_adopt;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String bimg_url;
  
  @ProtoField(tag = 74, type = Message.Datatype.STRING)
  public final String bot_reply_content;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 75)
  public final List<BotReplyContent> bot_reply_content_list;
  
  @ProtoField(tag = 64)
  public final ThemeBubble bubble_info;
  
  @ProtoField(tag = 72)
  public final CallRobotEntrance call_robot_entrance;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 59)
  public final List<CardLinkInfo> card_link_info;
  
  @ProtoField(tag = 78)
  public final ChatContent chat_content;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 94)
  public final List<ComponentFactory> components;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<PbContent> content;
  
  @ProtoField(tag = 97, type = Message.Datatype.STRING)
  public final String content_statement;
  
  @ProtoField(tag = 60)
  public final CustomFigure custom_figure;
  
  @ProtoField(tag = 61)
  public final CustomState custom_state;
  
  @ProtoField(tag = 63, type = Message.Datatype.STRING)
  public final String dynamic_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 32)
  public final List<TailInfo> ext_tails;
  
  @ProtoField(tag = 66)
  public final FestivalTipData festival_tip_data;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer floor;
  
  @ProtoField(tag = 57, type = Message.Datatype.STRING)
  public final String fold_comment_apply_url;
  
  @ProtoField(tag = 56, type = Message.Datatype.INT32)
  public final Integer fold_comment_status;
  
  @ProtoField(tag = 44, type = Message.Datatype.STRING)
  public final String fold_tip;
  
  @ProtoField(tag = 89, type = Message.Datatype.STRING)
  public final String footer;
  
  @ProtoField(tag = 38)
  public final SimpleForum from_forum;
  
  @ProtoField(tag = 62)
  public final FullLengthNovel full_length_novel;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 83)
  public final List<FeedHeadSymbol> head_extra_info;
  
  @ProtoField(tag = 33)
  public final TogetherHi high_together;
  
  @ProtoField(tag = 69, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(tag = 41, type = Message.Datatype.INT32)
  public final Integer img_num_abtest;
  
  @ProtoField(tag = 87, type = Message.Datatype.STRING)
  public final String ios_b_url;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String ios_bimg_format;
  
  @ProtoField(tag = 96, type = Message.Datatype.INT32)
  public final Integer is_ad_thread_post;
  
  @ProtoField(tag = 48, type = Message.Datatype.INT32)
  public final Integer is_bjh;
  
  @ProtoField(tag = 73, type = Message.Datatype.INT32)
  public final Integer is_bot_reply;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT32)
  public final Integer is_bub;
  
  @ProtoField(tag = 43, type = Message.Datatype.INT32)
  public final Integer is_fold;
  
  @ProtoField(tag = 31, type = Message.Datatype.INT32)
  public final Integer is_hot_post;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer is_ntitle;
  
  @ProtoField(tag = 39, type = Message.Datatype.INT32)
  public final Integer is_post_visible;
  
  @ProtoField(tag = 45, type = Message.Datatype.INT32)
  public final Integer is_top_agree_post;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer is_voice;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer is_vote;
  
  @ProtoField(tag = 51, type = Message.Datatype.INT32)
  public final Integer is_wonderful_post;
  
  @ProtoField(tag = 53)
  public final Item item;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 52)
  public final List<HeadItem> item_star;
  
  @ProtoField(tag = 7)
  public final Lbs lbs_info;
  
  @ProtoField(tag = 36, type = Message.Datatype.STRING)
  public final String lego_card;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 81)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 95)
  public final MountedCard mounted_card;
  
  @ProtoField(tag = 40, type = Message.Datatype.INT32)
  public final Integer need_log;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 85)
  public final List<PbContent> no_pic_content;
  
  @ProtoField(tag = 58)
  public final NovelInfo novel_info;
  
  @ProtoField(tag = 67)
  public final NovelRecomCard novel_recom_card;
  
  @ProtoField(tag = 42)
  public final OriginThreadInfo origin_thread_info;
  
  @ProtoField(tag = 54)
  public final Item outer_item;
  
  @ProtoField(tag = 35)
  public final DealInfo pb_deal_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 84)
  public final List<PbContent> pic_content;
  
  @ProtoField(tag = 30)
  public final PbPostZan post_zan;
  
  @ProtoField(tag = 28)
  public final PbPresent present;
  
  @ProtoField(tag = 50, type = Message.Datatype.STRING)
  public final String quote_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 76)
  public final List<RobotSkill> robot_skill;
  
  @ProtoField(tag = 65, type = Message.Datatype.STRING)
  public final String rumor_source_img;
  
  @ProtoField(tag = 68, type = Message.Datatype.INT32)
  public final Integer shield_icon;
  
  @ProtoField(tag = 47, type = Message.Datatype.INT32)
  public final Integer show_squared;
  
  @ProtoField(tag = 21)
  public final SignatureData signature;
  
  @ProtoField(tag = 34)
  public final SkinInfo skin_info;
  
  @ProtoField(tag = 88)
  public final SpecialPost special_post;
  
  @ProtoField(tag = 79)
  public final SpriteMemeInfo sprite_meme_info;
  
  @ProtoField(tag = 82)
  public final IconMark stamp_info;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT32)
  public final Integer storecount;
  
  @ProtoField(tag = 15)
  public final SubPost sub_post_list;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer sub_post_number;
  
  @ProtoField(tag = 22)
  public final TailInfo tail_info;
  
  @ProtoField(tag = 86)
  public final ThemeTailInUser tail_style;
  
  @ProtoField(tag = 46, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer time;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String time_ex;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 92, type = Message.Datatype.STRING)
  public final String tmoney;
  
  @ProtoField(tag = 70, type = Message.Datatype.STRING)
  public final String toutiao_card_tag;
  
  @ProtoField(tag = 71, type = Message.Datatype.STRING)
  public final String toutiao_card_tag_color;
  
  @ProtoField(tag = 26)
  public final TPointPost tpoint_post;
  
  @ProtoField(tag = 29)
  public final VideoInfo video_info;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String vote_crypt;
  
  @ProtoField(tag = 24)
  public final Zan zan;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_FLOOR = integer;
    DEFAULT_TIME = integer;
    DEFAULT_CONTENT = Collections.emptyList();
    DEFAULT_ARR_VIDEO = Collections.emptyList();
    DEFAULT_IS_VOTE = integer;
    DEFAULT_IS_VOICE = integer;
    DEFAULT_IS_NTITLE = integer;
    DEFAULT_IS_BUB = integer;
    DEFAULT_SUB_POST_NUMBER = integer;
    DEFAULT_AUTHOR_ID = long_;
    DEFAULT_ADD_POST_NUMBER = integer;
    DEFAULT_STORECOUNT = integer;
    DEFAULT_IS_HOT_POST = integer;
    DEFAULT_EXT_TAILS = Collections.emptyList();
    DEFAULT_IS_POST_VISIBLE = integer;
    DEFAULT_NEED_LOG = integer;
    DEFAULT_IMG_NUM_ABTEST = integer;
    DEFAULT_IS_FOLD = integer;
    DEFAULT_IS_TOP_AGREE_POST = integer;
    DEFAULT_TID = long_;
    DEFAULT_SHOW_SQUARED = integer;
    DEFAULT_IS_BJH = integer;
    DEFAULT_IS_WONDERFUL_POST = integer;
    DEFAULT_ITEM_STAR = Collections.emptyList();
    DEFAULT_FOLD_COMMENT_STATUS = integer;
    DEFAULT_CARD_LINK_INFO = Collections.emptyList();
    DEFAULT_SHIELD_ICON = integer;
    DEFAULT_IS_BOT_REPLY = integer;
    DEFAULT_BOT_REPLY_CONTENT_LIST = Collections.emptyList();
    DEFAULT_ROBOT_SKILL = Collections.emptyList();
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_HEAD_EXTRA_INFO = Collections.emptyList();
    DEFAULT_PIC_CONTENT = Collections.emptyList();
    DEFAULT_NO_PIC_CONTENT = Collections.emptyList();
    DEFAULT_BDT_USER_ADOPT = integer;
    DEFAULT_ADOPT_STATUS = integer;
    DEFAULT_COMPONENTS = Collections.emptyList();
    DEFAULT_IS_AD_THREAD_POST = integer;
  }
  
  public Post(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.id;
      if (long_3 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_3;
      } 
      String str12 = paramBuilder.title;
      if (str12 == null) {
        this.title = "";
      } else {
        this.title = str12;
      } 
      Integer integer14 = paramBuilder.floor;
      if (integer14 == null) {
        this.floor = DEFAULT_FLOOR;
      } else {
        this.floor = integer14;
      } 
      integer14 = paramBuilder.time;
      if (integer14 == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer14;
      } 
      List<PbContent> list10 = paramBuilder.content;
      if (list10 == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list10);
      } 
      List<String> list9 = paramBuilder.arr_video;
      if (list9 == null) {
        this.arr_video = DEFAULT_ARR_VIDEO;
      } else {
        this.arr_video = Message.immutableCopyOf(list9);
      } 
      this.lbs_info = paramBuilder.lbs_info;
      Integer integer13 = paramBuilder.is_vote;
      if (integer13 == null) {
        this.is_vote = DEFAULT_IS_VOTE;
      } else {
        this.is_vote = integer13;
      } 
      integer13 = paramBuilder.is_voice;
      if (integer13 == null) {
        this.is_voice = DEFAULT_IS_VOICE;
      } else {
        this.is_voice = integer13;
      } 
      integer13 = paramBuilder.is_ntitle;
      if (integer13 == null) {
        this.is_ntitle = DEFAULT_IS_NTITLE;
      } else {
        this.is_ntitle = integer13;
      } 
      integer13 = paramBuilder.is_bub;
      if (integer13 == null) {
        this.is_bub = DEFAULT_IS_BUB;
      } else {
        this.is_bub = integer13;
      } 
      String str11 = paramBuilder.vote_crypt;
      if (str11 == null) {
        this.vote_crypt = "";
      } else {
        this.vote_crypt = str11;
      } 
      Integer integer12 = paramBuilder.sub_post_number;
      if (integer12 == null) {
        this.sub_post_number = DEFAULT_SUB_POST_NUMBER;
      } else {
        this.sub_post_number = integer12;
      } 
      String str10 = paramBuilder.time_ex;
      if (str10 == null) {
        this.time_ex = "";
      } else {
        this.time_ex = str10;
      } 
      this.sub_post_list = paramBuilder.sub_post_list;
      this.add_post_list = paramBuilder.add_post_list;
      str10 = paramBuilder.bimg_url;
      if (str10 == null) {
        this.bimg_url = "";
      } else {
        this.bimg_url = str10;
      } 
      str10 = paramBuilder.ios_bimg_format;
      if (str10 == null) {
        this.ios_bimg_format = "";
      } else {
        this.ios_bimg_format = str10;
      } 
      Long long_2 = paramBuilder.author_id;
      if (long_2 == null) {
        this.author_id = DEFAULT_AUTHOR_ID;
      } else {
        this.author_id = long_2;
      } 
      Integer integer11 = paramBuilder.add_post_number;
      if (integer11 == null) {
        this.add_post_number = DEFAULT_ADD_POST_NUMBER;
      } else {
        this.add_post_number = integer11;
      } 
      this.signature = paramBuilder.signature;
      this.tail_info = paramBuilder.tail_info;
      this.author = paramBuilder.author;
      this.zan = paramBuilder.zan;
      integer11 = paramBuilder.storecount;
      if (integer11 == null) {
        this.storecount = DEFAULT_STORECOUNT;
      } else {
        this.storecount = integer11;
      } 
      this.tpoint_post = paramBuilder.tpoint_post;
      this.act_post = paramBuilder.act_post;
      this.present = paramBuilder.present;
      this.video_info = paramBuilder.video_info;
      this.post_zan = paramBuilder.post_zan;
      integer11 = paramBuilder.is_hot_post;
      if (integer11 == null) {
        this.is_hot_post = DEFAULT_IS_HOT_POST;
      } else {
        this.is_hot_post = integer11;
      } 
      List<TailInfo> list8 = paramBuilder.ext_tails;
      if (list8 == null) {
        this.ext_tails = DEFAULT_EXT_TAILS;
      } else {
        this.ext_tails = Message.immutableCopyOf(list8);
      } 
      this.high_together = paramBuilder.high_together;
      this.skin_info = paramBuilder.skin_info;
      this.pb_deal_info = paramBuilder.pb_deal_info;
      String str9 = paramBuilder.lego_card;
      if (str9 == null) {
        this.lego_card = "";
      } else {
        this.lego_card = str9;
      } 
      this.agree = paramBuilder.agree;
      this.from_forum = paramBuilder.from_forum;
      Integer integer10 = paramBuilder.is_post_visible;
      if (integer10 == null) {
        this.is_post_visible = DEFAULT_IS_POST_VISIBLE;
      } else {
        this.is_post_visible = integer10;
      } 
      integer10 = paramBuilder.need_log;
      if (integer10 == null) {
        this.need_log = DEFAULT_NEED_LOG;
      } else {
        this.need_log = integer10;
      } 
      integer10 = paramBuilder.img_num_abtest;
      if (integer10 == null) {
        this.img_num_abtest = DEFAULT_IMG_NUM_ABTEST;
      } else {
        this.img_num_abtest = integer10;
      } 
      this.origin_thread_info = paramBuilder.origin_thread_info;
      integer10 = paramBuilder.is_fold;
      if (integer10 == null) {
        this.is_fold = DEFAULT_IS_FOLD;
      } else {
        this.is_fold = integer10;
      } 
      String str8 = paramBuilder.fold_tip;
      if (str8 == null) {
        this.fold_tip = "";
      } else {
        this.fold_tip = str8;
      } 
      Integer integer9 = paramBuilder.is_top_agree_post;
      if (integer9 == null) {
        this.is_top_agree_post = DEFAULT_IS_TOP_AGREE_POST;
      } else {
        this.is_top_agree_post = integer9;
      } 
      Long long_1 = paramBuilder.tid;
      if (long_1 == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_1;
      } 
      Integer integer8 = paramBuilder.show_squared;
      if (integer8 == null) {
        this.show_squared = DEFAULT_SHOW_SQUARED;
      } else {
        this.show_squared = integer8;
      } 
      integer8 = paramBuilder.is_bjh;
      if (integer8 == null) {
        this.is_bjh = DEFAULT_IS_BJH;
      } else {
        this.is_bjh = integer8;
      } 
      String str7 = paramBuilder.quote_id;
      if (str7 == null) {
        this.quote_id = "";
      } else {
        this.quote_id = str7;
      } 
      Integer integer7 = paramBuilder.is_wonderful_post;
      if (integer7 == null) {
        this.is_wonderful_post = DEFAULT_IS_WONDERFUL_POST;
      } else {
        this.is_wonderful_post = integer7;
      } 
      List<HeadItem> list7 = paramBuilder.item_star;
      if (list7 == null) {
        this.item_star = DEFAULT_ITEM_STAR;
      } else {
        this.item_star = Message.immutableCopyOf(list7);
      } 
      this.item = paramBuilder.item;
      this.outer_item = paramBuilder.outer_item;
      this.advertisement = paramBuilder.advertisement;
      Integer integer6 = paramBuilder.fold_comment_status;
      if (integer6 == null) {
        this.fold_comment_status = DEFAULT_FOLD_COMMENT_STATUS;
      } else {
        this.fold_comment_status = integer6;
      } 
      String str6 = paramBuilder.fold_comment_apply_url;
      if (str6 == null) {
        this.fold_comment_apply_url = "";
      } else {
        this.fold_comment_apply_url = str6;
      } 
      this.novel_info = paramBuilder.novel_info;
      List<CardLinkInfo> list6 = paramBuilder.card_link_info;
      if (list6 == null) {
        this.card_link_info = DEFAULT_CARD_LINK_INFO;
      } else {
        this.card_link_info = Message.immutableCopyOf(list6);
      } 
      this.custom_figure = paramBuilder.custom_figure;
      this.custom_state = paramBuilder.custom_state;
      this.full_length_novel = paramBuilder.full_length_novel;
      String str5 = paramBuilder.dynamic_url;
      if (str5 == null) {
        this.dynamic_url = "";
      } else {
        this.dynamic_url = str5;
      } 
      this.bubble_info = paramBuilder.bubble_info;
      str5 = paramBuilder.rumor_source_img;
      if (str5 == null) {
        this.rumor_source_img = "";
      } else {
        this.rumor_source_img = str5;
      } 
      this.festival_tip_data = paramBuilder.festival_tip_data;
      this.novel_recom_card = paramBuilder.novel_recom_card;
      Integer integer5 = paramBuilder.shield_icon;
      if (integer5 == null) {
        this.shield_icon = DEFAULT_SHIELD_ICON;
      } else {
        this.shield_icon = integer5;
      } 
      String str4 = paramBuilder.icon_url;
      if (str4 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str4;
      } 
      str4 = paramBuilder.toutiao_card_tag;
      if (str4 == null) {
        this.toutiao_card_tag = "";
      } else {
        this.toutiao_card_tag = str4;
      } 
      str4 = paramBuilder.toutiao_card_tag_color;
      if (str4 == null) {
        this.toutiao_card_tag_color = "";
      } else {
        this.toutiao_card_tag_color = str4;
      } 
      this.call_robot_entrance = paramBuilder.call_robot_entrance;
      Integer integer4 = paramBuilder.is_bot_reply;
      if (integer4 == null) {
        this.is_bot_reply = DEFAULT_IS_BOT_REPLY;
      } else {
        this.is_bot_reply = integer4;
      } 
      String str3 = paramBuilder.bot_reply_content;
      if (str3 == null) {
        this.bot_reply_content = "";
      } else {
        this.bot_reply_content = str3;
      } 
      List<BotReplyContent> list5 = paramBuilder.bot_reply_content_list;
      if (list5 == null) {
        this.bot_reply_content_list = DEFAULT_BOT_REPLY_CONTENT_LIST;
      } else {
        this.bot_reply_content_list = Message.immutableCopyOf(list5);
      } 
      List<RobotSkill> list4 = paramBuilder.robot_skill;
      if (list4 == null) {
        this.robot_skill = DEFAULT_ROBOT_SKILL;
      } else {
        this.robot_skill = Message.immutableCopyOf(list4);
      } 
      this.aigc_feedback_info = paramBuilder.aigc_feedback_info;
      this.chat_content = paramBuilder.chat_content;
      this.sprite_meme_info = paramBuilder.sprite_meme_info;
      this.aichat_bot_comment_card = paramBuilder.aichat_bot_comment_card;
      List<FeedKV> list3 = paramBuilder.log_param;
      if (list3 == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list3);
      } 
      this.stamp_info = paramBuilder.stamp_info;
      List<FeedHeadSymbol> list2 = paramBuilder.head_extra_info;
      if (list2 == null) {
        this.head_extra_info = DEFAULT_HEAD_EXTRA_INFO;
      } else {
        this.head_extra_info = Message.immutableCopyOf(list2);
      } 
      List<PbContent> list1 = paramBuilder.pic_content;
      if (list1 == null) {
        this.pic_content = DEFAULT_PIC_CONTENT;
      } else {
        this.pic_content = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.no_pic_content;
      if (list1 == null) {
        this.no_pic_content = DEFAULT_NO_PIC_CONTENT;
      } else {
        this.no_pic_content = Message.immutableCopyOf(list1);
      } 
      this.tail_style = paramBuilder.tail_style;
      String str2 = paramBuilder.ios_b_url;
      if (str2 == null) {
        this.ios_b_url = "";
      } else {
        this.ios_b_url = str2;
      } 
      this.special_post = paramBuilder.special_post;
      str2 = paramBuilder.footer;
      if (str2 == null) {
        this.footer = "";
      } else {
        this.footer = str2;
      } 
      this.bdt_search_info = paramBuilder.bdt_search_info;
      Integer integer3 = paramBuilder.bdt_user_adopt;
      if (integer3 == null) {
        this.bdt_user_adopt = DEFAULT_BDT_USER_ADOPT;
      } else {
        this.bdt_user_adopt = integer3;
      } 
      String str1 = paramBuilder.tmoney;
      if (str1 == null) {
        this.tmoney = "";
      } else {
        this.tmoney = str1;
      } 
      Integer integer2 = paramBuilder.adopt_status;
      if (integer2 == null) {
        this.adopt_status = DEFAULT_ADOPT_STATUS;
      } else {
        this.adopt_status = integer2;
      } 
      List<ComponentFactory> list = paramBuilder.components;
      if (list == null) {
        this.components = DEFAULT_COMPONENTS;
      } else {
        this.components = Message.immutableCopyOf(list);
      } 
      this.mounted_card = paramBuilder.mounted_card;
      Integer integer1 = paramBuilder.is_ad_thread_post;
      if (integer1 == null) {
        this.is_ad_thread_post = DEFAULT_IS_AD_THREAD_POST;
      } else {
        this.is_ad_thread_post = integer1;
      } 
      str = paramBuilder.content_statement;
      if (str == null) {
        this.content_statement = "";
      } else {
        this.content_statement = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.title = ((Builder)str).title;
      this.floor = ((Builder)str).floor;
      this.time = ((Builder)str).time;
      this.content = Message.immutableCopyOf(((Builder)str).content);
      this.arr_video = Message.immutableCopyOf(((Builder)str).arr_video);
      this.lbs_info = ((Builder)str).lbs_info;
      this.is_vote = ((Builder)str).is_vote;
      this.is_voice = ((Builder)str).is_voice;
      this.is_ntitle = ((Builder)str).is_ntitle;
      this.is_bub = ((Builder)str).is_bub;
      this.vote_crypt = ((Builder)str).vote_crypt;
      this.sub_post_number = ((Builder)str).sub_post_number;
      this.time_ex = ((Builder)str).time_ex;
      this.sub_post_list = ((Builder)str).sub_post_list;
      this.add_post_list = ((Builder)str).add_post_list;
      this.bimg_url = ((Builder)str).bimg_url;
      this.ios_bimg_format = ((Builder)str).ios_bimg_format;
      this.author_id = ((Builder)str).author_id;
      this.add_post_number = ((Builder)str).add_post_number;
      this.signature = ((Builder)str).signature;
      this.tail_info = ((Builder)str).tail_info;
      this.author = ((Builder)str).author;
      this.zan = ((Builder)str).zan;
      this.storecount = ((Builder)str).storecount;
      this.tpoint_post = ((Builder)str).tpoint_post;
      this.act_post = ((Builder)str).act_post;
      this.present = ((Builder)str).present;
      this.video_info = ((Builder)str).video_info;
      this.post_zan = ((Builder)str).post_zan;
      this.is_hot_post = ((Builder)str).is_hot_post;
      this.ext_tails = Message.immutableCopyOf(((Builder)str).ext_tails);
      this.high_together = ((Builder)str).high_together;
      this.skin_info = ((Builder)str).skin_info;
      this.pb_deal_info = ((Builder)str).pb_deal_info;
      this.lego_card = ((Builder)str).lego_card;
      this.agree = ((Builder)str).agree;
      this.from_forum = ((Builder)str).from_forum;
      this.is_post_visible = ((Builder)str).is_post_visible;
      this.need_log = ((Builder)str).need_log;
      this.img_num_abtest = ((Builder)str).img_num_abtest;
      this.origin_thread_info = ((Builder)str).origin_thread_info;
      this.is_fold = ((Builder)str).is_fold;
      this.fold_tip = ((Builder)str).fold_tip;
      this.is_top_agree_post = ((Builder)str).is_top_agree_post;
      this.tid = ((Builder)str).tid;
      this.show_squared = ((Builder)str).show_squared;
      this.is_bjh = ((Builder)str).is_bjh;
      this.quote_id = ((Builder)str).quote_id;
      this.is_wonderful_post = ((Builder)str).is_wonderful_post;
      this.item_star = Message.immutableCopyOf(((Builder)str).item_star);
      this.item = ((Builder)str).item;
      this.outer_item = ((Builder)str).outer_item;
      this.advertisement = ((Builder)str).advertisement;
      this.fold_comment_status = ((Builder)str).fold_comment_status;
      this.fold_comment_apply_url = ((Builder)str).fold_comment_apply_url;
      this.novel_info = ((Builder)str).novel_info;
      this.card_link_info = Message.immutableCopyOf(((Builder)str).card_link_info);
      this.custom_figure = ((Builder)str).custom_figure;
      this.custom_state = ((Builder)str).custom_state;
      this.full_length_novel = ((Builder)str).full_length_novel;
      this.dynamic_url = ((Builder)str).dynamic_url;
      this.bubble_info = ((Builder)str).bubble_info;
      this.rumor_source_img = ((Builder)str).rumor_source_img;
      this.festival_tip_data = ((Builder)str).festival_tip_data;
      this.novel_recom_card = ((Builder)str).novel_recom_card;
      this.shield_icon = ((Builder)str).shield_icon;
      this.icon_url = ((Builder)str).icon_url;
      this.toutiao_card_tag = ((Builder)str).toutiao_card_tag;
      this.toutiao_card_tag_color = ((Builder)str).toutiao_card_tag_color;
      this.call_robot_entrance = ((Builder)str).call_robot_entrance;
      this.is_bot_reply = ((Builder)str).is_bot_reply;
      this.bot_reply_content = ((Builder)str).bot_reply_content;
      this.bot_reply_content_list = Message.immutableCopyOf(((Builder)str).bot_reply_content_list);
      this.robot_skill = Message.immutableCopyOf(((Builder)str).robot_skill);
      this.aigc_feedback_info = ((Builder)str).aigc_feedback_info;
      this.chat_content = ((Builder)str).chat_content;
      this.sprite_meme_info = ((Builder)str).sprite_meme_info;
      this.aichat_bot_comment_card = ((Builder)str).aichat_bot_comment_card;
      this.log_param = Message.immutableCopyOf(((Builder)str).log_param);
      this.stamp_info = ((Builder)str).stamp_info;
      this.head_extra_info = Message.immutableCopyOf(((Builder)str).head_extra_info);
      this.pic_content = Message.immutableCopyOf(((Builder)str).pic_content);
      this.no_pic_content = Message.immutableCopyOf(((Builder)str).no_pic_content);
      this.tail_style = ((Builder)str).tail_style;
      this.ios_b_url = ((Builder)str).ios_b_url;
      this.special_post = ((Builder)str).special_post;
      this.footer = ((Builder)str).footer;
      this.bdt_search_info = ((Builder)str).bdt_search_info;
      this.bdt_user_adopt = ((Builder)str).bdt_user_adopt;
      this.tmoney = ((Builder)str).tmoney;
      this.adopt_status = ((Builder)str).adopt_status;
      this.components = Message.immutableCopyOf(((Builder)str).components);
      this.mounted_card = ((Builder)str).mounted_card;
      this.is_ad_thread_post = ((Builder)str).is_ad_thread_post;
      this.content_statement = ((Builder)str).content_statement;
    } 
  }
  
  public static final class Builder extends Message.Builder<Post> {
    public ActPost act_post;
    
    public AddPostList add_post_list;
    
    public Integer add_post_number;
    
    public Integer adopt_status;
    
    public Advertisement advertisement;
    
    public Agree agree;
    
    public AichatBotCommentCard aichat_bot_comment_card;
    
    public AigcFeedbackInfo aigc_feedback_info;
    
    public List<String> arr_video;
    
    public User author;
    
    public Long author_id;
    
    public BdtSearchInfo bdt_search_info;
    
    public Integer bdt_user_adopt;
    
    public String bimg_url;
    
    public String bot_reply_content;
    
    public List<BotReplyContent> bot_reply_content_list;
    
    public ThemeBubble bubble_info;
    
    public CallRobotEntrance call_robot_entrance;
    
    public List<CardLinkInfo> card_link_info;
    
    public ChatContent chat_content;
    
    public List<ComponentFactory> components;
    
    public List<PbContent> content;
    
    public String content_statement;
    
    public CustomFigure custom_figure;
    
    public CustomState custom_state;
    
    public String dynamic_url;
    
    public List<TailInfo> ext_tails;
    
    public FestivalTipData festival_tip_data;
    
    public Integer floor;
    
    public String fold_comment_apply_url;
    
    public Integer fold_comment_status;
    
    public String fold_tip;
    
    public String footer;
    
    public SimpleForum from_forum;
    
    public FullLengthNovel full_length_novel;
    
    public List<FeedHeadSymbol> head_extra_info;
    
    public TogetherHi high_together;
    
    public String icon_url;
    
    public Long id;
    
    public Integer img_num_abtest;
    
    public String ios_b_url;
    
    public String ios_bimg_format;
    
    public Integer is_ad_thread_post;
    
    public Integer is_bjh;
    
    public Integer is_bot_reply;
    
    public Integer is_bub;
    
    public Integer is_fold;
    
    public Integer is_hot_post;
    
    public Integer is_ntitle;
    
    public Integer is_post_visible;
    
    public Integer is_top_agree_post;
    
    public Integer is_voice;
    
    public Integer is_vote;
    
    public Integer is_wonderful_post;
    
    public Item item;
    
    public List<HeadItem> item_star;
    
    public Lbs lbs_info;
    
    public String lego_card;
    
    public List<FeedKV> log_param;
    
    public MountedCard mounted_card;
    
    public Integer need_log;
    
    public List<PbContent> no_pic_content;
    
    public NovelInfo novel_info;
    
    public NovelRecomCard novel_recom_card;
    
    public OriginThreadInfo origin_thread_info;
    
    public Item outer_item;
    
    public DealInfo pb_deal_info;
    
    public List<PbContent> pic_content;
    
    public PbPostZan post_zan;
    
    public PbPresent present;
    
    public String quote_id;
    
    public List<RobotSkill> robot_skill;
    
    public String rumor_source_img;
    
    public Integer shield_icon;
    
    public Integer show_squared;
    
    public SignatureData signature;
    
    public SkinInfo skin_info;
    
    public SpecialPost special_post;
    
    public SpriteMemeInfo sprite_meme_info;
    
    public IconMark stamp_info;
    
    public Integer storecount;
    
    public SubPost sub_post_list;
    
    public Integer sub_post_number;
    
    public TailInfo tail_info;
    
    public ThemeTailInUser tail_style;
    
    public Long tid;
    
    public Integer time;
    
    public String time_ex;
    
    public String title;
    
    public String tmoney;
    
    public String toutiao_card_tag;
    
    public String toutiao_card_tag_color;
    
    public TPointPost tpoint_post;
    
    public VideoInfo video_info;
    
    public String vote_crypt;
    
    public Zan zan;
    
    public Builder() {}
    
    public Builder(Post param1Post) {
      super(param1Post);
      if (param1Post == null)
        return; 
      this.id = param1Post.id;
      this.title = param1Post.title;
      this.floor = param1Post.floor;
      this.time = param1Post.time;
      this.content = Message.copyOf(param1Post.content);
      this.arr_video = Message.copyOf(param1Post.arr_video);
      this.lbs_info = param1Post.lbs_info;
      this.is_vote = param1Post.is_vote;
      this.is_voice = param1Post.is_voice;
      this.is_ntitle = param1Post.is_ntitle;
      this.is_bub = param1Post.is_bub;
      this.vote_crypt = param1Post.vote_crypt;
      this.sub_post_number = param1Post.sub_post_number;
      this.time_ex = param1Post.time_ex;
      this.sub_post_list = param1Post.sub_post_list;
      this.add_post_list = param1Post.add_post_list;
      this.bimg_url = param1Post.bimg_url;
      this.ios_bimg_format = param1Post.ios_bimg_format;
      this.author_id = param1Post.author_id;
      this.add_post_number = param1Post.add_post_number;
      this.signature = param1Post.signature;
      this.tail_info = param1Post.tail_info;
      this.author = param1Post.author;
      this.zan = param1Post.zan;
      this.storecount = param1Post.storecount;
      this.tpoint_post = param1Post.tpoint_post;
      this.act_post = param1Post.act_post;
      this.present = param1Post.present;
      this.video_info = param1Post.video_info;
      this.post_zan = param1Post.post_zan;
      this.is_hot_post = param1Post.is_hot_post;
      this.ext_tails = Message.copyOf(param1Post.ext_tails);
      this.high_together = param1Post.high_together;
      this.skin_info = param1Post.skin_info;
      this.pb_deal_info = param1Post.pb_deal_info;
      this.lego_card = param1Post.lego_card;
      this.agree = param1Post.agree;
      this.from_forum = param1Post.from_forum;
      this.is_post_visible = param1Post.is_post_visible;
      this.need_log = param1Post.need_log;
      this.img_num_abtest = param1Post.img_num_abtest;
      this.origin_thread_info = param1Post.origin_thread_info;
      this.is_fold = param1Post.is_fold;
      this.fold_tip = param1Post.fold_tip;
      this.is_top_agree_post = param1Post.is_top_agree_post;
      this.tid = param1Post.tid;
      this.show_squared = param1Post.show_squared;
      this.is_bjh = param1Post.is_bjh;
      this.quote_id = param1Post.quote_id;
      this.is_wonderful_post = param1Post.is_wonderful_post;
      this.item_star = Message.copyOf(param1Post.item_star);
      this.item = param1Post.item;
      this.outer_item = param1Post.outer_item;
      this.advertisement = param1Post.advertisement;
      this.fold_comment_status = param1Post.fold_comment_status;
      this.fold_comment_apply_url = param1Post.fold_comment_apply_url;
      this.novel_info = param1Post.novel_info;
      this.card_link_info = Message.copyOf(param1Post.card_link_info);
      this.custom_figure = param1Post.custom_figure;
      this.custom_state = param1Post.custom_state;
      this.full_length_novel = param1Post.full_length_novel;
      this.dynamic_url = param1Post.dynamic_url;
      this.bubble_info = param1Post.bubble_info;
      this.rumor_source_img = param1Post.rumor_source_img;
      this.festival_tip_data = param1Post.festival_tip_data;
      this.novel_recom_card = param1Post.novel_recom_card;
      this.shield_icon = param1Post.shield_icon;
      this.icon_url = param1Post.icon_url;
      this.toutiao_card_tag = param1Post.toutiao_card_tag;
      this.toutiao_card_tag_color = param1Post.toutiao_card_tag_color;
      this.call_robot_entrance = param1Post.call_robot_entrance;
      this.is_bot_reply = param1Post.is_bot_reply;
      this.bot_reply_content = param1Post.bot_reply_content;
      this.bot_reply_content_list = Message.copyOf(param1Post.bot_reply_content_list);
      this.robot_skill = Message.copyOf(param1Post.robot_skill);
      this.aigc_feedback_info = param1Post.aigc_feedback_info;
      this.chat_content = param1Post.chat_content;
      this.sprite_meme_info = param1Post.sprite_meme_info;
      this.aichat_bot_comment_card = param1Post.aichat_bot_comment_card;
      this.log_param = Message.copyOf(param1Post.log_param);
      this.stamp_info = param1Post.stamp_info;
      this.head_extra_info = Message.copyOf(param1Post.head_extra_info);
      this.pic_content = Message.copyOf(param1Post.pic_content);
      this.no_pic_content = Message.copyOf(param1Post.no_pic_content);
      this.tail_style = param1Post.tail_style;
      this.ios_b_url = param1Post.ios_b_url;
      this.special_post = param1Post.special_post;
      this.footer = param1Post.footer;
      this.bdt_search_info = param1Post.bdt_search_info;
      this.bdt_user_adopt = param1Post.bdt_user_adopt;
      this.tmoney = param1Post.tmoney;
      this.adopt_status = param1Post.adopt_status;
      this.components = Message.copyOf(param1Post.components);
      this.mounted_card = param1Post.mounted_card;
      this.is_ad_thread_post = param1Post.is_ad_thread_post;
      this.content_statement = param1Post.content_statement;
    }
    
    public Post build(boolean param1Boolean) {
      return new Post(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
