package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class PostInfoList extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final List<Abstract> DEFAULT_ABSTRACT_THREAD;
  
  public static final Integer DEFAULT_AGREE_NUM;
  
  public static final String DEFAULT_ARTICLE_COVER = "";
  
  public static final Integer DEFAULT_AUDIT_STATUS;
  
  public static final List<PostInfoContent> DEFAULT_CONTENT;
  
  public static final String DEFAULT_CONTENT_THREAD = "";
  
  public static final Integer DEFAULT_CREATE_TIME;
  
  public static final List<PbContent> DEFAULT_FIRST_POST_CONTENT;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_FREQ_NUM;
  
  public static final Integer DEFAULT_GOOD_TYPES;
  
  public static final Integer DEFAULT_HIDE_POST;
  
  public static final String DEFAULT_IP = "";
  
  public static final Integer DEFAULT_IS_AUTHOR_VIEW;
  
  public static final Boolean DEFAULT_IS_DEAL;
  
  public static final Integer DEFAULT_IS_MANAGER;
  
  public static final Integer DEFAULT_IS_NTITLE;
  
  public static final Integer DEFAULT_IS_ORIGIN_MANAGER;
  
  public static final Integer DEFAULT_IS_POST_DELETED;
  
  public static final Integer DEFAULT_IS_REMAIN;
  
  public static final Integer DEFAULT_IS_SHARE_THREAD;
  
  public static final Integer DEFAULT_IS_THREAD;
  
  public static final Integer DEFAULT_IS_VIEW_YEAR;
  
  public static final List<HeadItem> DEFAULT_ITEM_STAR;
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final List<Media> DEFAULT_MEDIA;
  
  public static final List<MultipleForum> DEFAULT_MULTIPLE_FORUM_LIST;
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final List<PbGoodsInfo> DEFAULT_PB_GOODS_INFO;
  
  public static final List<PbLinkInfo> DEFAULT_PB_LINK_INFO;
  
  public static final Long DEFAULT_POST_ID;
  
  public static final String DEFAULT_POST_TYPE = "";
  
  public static final List<PrivSets> DEFAULT_PRIV_SETS;
  
  public static final String DEFAULT_PTYPE = "";
  
  public static final Integer DEFAULT_REPLY_NUM;
  
  public static final List<PbContent> DEFAULT_RICH_ABSTRACT;
  
  public static final List<PbContent> DEFAULT_RICH_TITLE;
  
  public static final Integer DEFAULT_SHARE_NUM;
  
  public static final String DEFAULT_TARGET_SCHEME = "";
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final Long DEFAULT_THREAD_TYPE;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TOP_TYPES;
  
  public static final Long DEFAULT_USER_ID;
  
  public static final String DEFAULT_USER_NAME = "";
  
  public static final String DEFAULT_USER_PORTRAIT = "";
  
  public static final Integer DEFAULT_VIEW_NUM;
  
  public static final List<Voice> DEFAULT_VOICE_INFO;
  
  public static final Long DEFAULT_V_FORUM_ID;
  
  public static final String DEFAULT_WONDERFUL_POST_INFO = "";
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 71)
  public final ThreadAblum ablum_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 15)
  public final List<Abstract> abstract_thread;
  
  @ProtoField(tag = 40)
  public final Agree agree;
  
  @ProtoField(tag = 37, type = Message.Datatype.INT32)
  public final Integer agree_num;
  
  @ProtoField(tag = 36)
  public final AlaLiveInfo ala_info;
  
  @ProtoField(tag = 24)
  public final AnchorInfo anchor_info;
  
  @ProtoField(tag = 48, type = Message.Datatype.STRING)
  public final String article_cover;
  
  @ProtoField(tag = 70, type = Message.Datatype.INT32)
  public final Integer audit_status;
  
  @ProtoField(tag = 73)
  public final HelpStatusTag author_status_tag;
  
  @ProtoField(tag = 50)
  public final BaijiahaoInfo baijiahao_info;
  
  @ProtoField(tag = 67)
  public final ChatPrivate chat_private;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<PostInfoContent> content;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String content_thread;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer create_time;
  
  @ProtoField(tag = 31)
  public final DealInfo deal_info;
  
  @ProtoField(tag = 72)
  public final ThreadDrawInfo draw_info;
  
  @ProtoField(tag = 65)
  public final EditInfo edit_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 49)
  public final List<PbContent> first_post_content;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 33, type = Message.Datatype.INT32)
  public final Integer freq_num;
  
  @ProtoField(tag = 61, type = Message.Datatype.INT32)
  public final Integer good_types;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT32)
  public final Integer hide_post;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String ip;
  
  @ProtoField(tag = 57, type = Message.Datatype.INT32)
  public final Integer is_author_view;
  
  @ProtoField(tag = 30, type = Message.Datatype.BOOL)
  public final Boolean is_deal;
  
  @ProtoField(tag = 59, type = Message.Datatype.INT32)
  public final Integer is_manager;
  
  @ProtoField(tag = 47, type = Message.Datatype.INT32)
  public final Integer is_ntitle;
  
  @ProtoField(tag = 60, type = Message.Datatype.INT32)
  public final Integer is_origin_manager;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer is_post_deleted;
  
  @ProtoField(tag = 41, type = Message.Datatype.INT32)
  public final Integer is_remain;
  
  @ProtoField(tag = 44, type = Message.Datatype.INT32)
  public final Integer is_share_thread;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer is_thread;
  
  @ProtoField(tag = 43, type = Message.Datatype.INT32)
  public final Integer is_view_year;
  
  @ProtoField(tag = 52)
  public final Item item;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 53)
  public final List<HeadItem> item_star;
  
  @ProtoField(tag = 21)
  public final LbsInfo lbs_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 68)
  public final List<FeedKV> log_param;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 16)
  public final List<Media> media;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 32)
  public final List<MultipleForum> multiple_forum_list;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 42)
  public final OriginThreadInfo origin_thread_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 55)
  public final List<PbGoodsInfo> pb_goods_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 54)
  public final List<PbLinkInfo> pb_link_info;
  
  @ProtoField(tag = 28)
  public final PollInfo poll_info;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String post_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 56)
  public final List<PrivSets> priv_sets;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String ptype;
  
  @ProtoField(tag = 22)
  public final Quote quote;
  
  @ProtoField(tag = 17, type = Message.Datatype.UINT32)
  public final Integer reply_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 46)
  public final List<PbContent> rich_abstract;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 45)
  public final List<PbContent> rich_title;
  
  @ProtoField(tag = 69)
  public final ThreadScoreInfo score_info;
  
  @ProtoField(tag = 39, type = Message.Datatype.INT32)
  public final Integer share_num;
  
  @ProtoField(tag = 66, type = Message.Datatype.STRING)
  public final String target_scheme;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 26, type = Message.Datatype.UINT64)
  public final Long thread_type;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 62, type = Message.Datatype.INT32)
  public final Integer top_types;
  
  @ProtoField(tag = 27)
  public final ZhiBoInfoTW twzhibo_info;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String user_portrait;
  
  @ProtoField(tag = 63)
  public final UserPostPerm user_post_perm;
  
  @ProtoField(tag = 34, type = Message.Datatype.UINT64)
  public final Long v_forum_id;
  
  @ProtoField(tag = 29)
  public final VideoInfo video_info;
  
  @ProtoField(tag = 38, type = Message.Datatype.INT32)
  public final Integer view_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 23)
  public final List<Voice> voice_info;
  
  @ProtoField(tag = 64)
  public final VoiceRoom voice_room;
  
  @ProtoField(tag = 51, type = Message.Datatype.STRING)
  public final String wonderful_post_info;
  
  @ProtoField(tag = 58)
  public final WorksInfo works_info;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_THREAD_ID = long_;
    DEFAULT_POST_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_THREAD = integer;
    DEFAULT_CREATE_TIME = integer;
    DEFAULT_CONTENT = Collections.emptyList();
    DEFAULT_IS_POST_DELETED = integer;
    DEFAULT_ABSTRACT_THREAD = Collections.emptyList();
    DEFAULT_MEDIA = Collections.emptyList();
    DEFAULT_REPLY_NUM = integer;
    DEFAULT_USER_ID = long_;
    DEFAULT_VOICE_INFO = Collections.emptyList();
    DEFAULT_HIDE_POST = integer;
    DEFAULT_THREAD_TYPE = long_;
    DEFAULT_IS_DEAL = Boolean.FALSE;
    DEFAULT_MULTIPLE_FORUM_LIST = Collections.emptyList();
    DEFAULT_FREQ_NUM = integer;
    DEFAULT_V_FORUM_ID = long_;
    DEFAULT_AGREE_NUM = integer;
    DEFAULT_VIEW_NUM = integer;
    DEFAULT_SHARE_NUM = integer;
    DEFAULT_IS_REMAIN = integer;
    DEFAULT_IS_VIEW_YEAR = integer;
    DEFAULT_IS_SHARE_THREAD = integer;
    DEFAULT_RICH_TITLE = Collections.emptyList();
    DEFAULT_RICH_ABSTRACT = Collections.emptyList();
    DEFAULT_IS_NTITLE = integer;
    DEFAULT_FIRST_POST_CONTENT = Collections.emptyList();
    DEFAULT_ITEM_STAR = Collections.emptyList();
    DEFAULT_PB_LINK_INFO = Collections.emptyList();
    DEFAULT_PB_GOODS_INFO = Collections.emptyList();
    DEFAULT_PRIV_SETS = Collections.emptyList();
    DEFAULT_IS_AUTHOR_VIEW = integer;
    DEFAULT_IS_MANAGER = integer;
    DEFAULT_IS_ORIGIN_MANAGER = integer;
    DEFAULT_GOOD_TYPES = integer;
    DEFAULT_TOP_TYPES = integer;
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_AUDIT_STATUS = integer;
  }
  
  public PostInfoList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Long long_4 = paramBuilder.forum_id;
      if (long_4 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_4;
      } 
      long_4 = paramBuilder.thread_id;
      if (long_4 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_4;
      } 
      long_4 = paramBuilder.post_id;
      if (long_4 == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_4;
      } 
      Integer integer9 = paramBuilder.is_thread;
      if (integer9 == null) {
        this.is_thread = DEFAULT_IS_THREAD;
      } else {
        this.is_thread = integer9;
      } 
      integer9 = paramBuilder.create_time;
      if (integer9 == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = integer9;
      } 
      String str8 = paramBuilder.forum_name;
      if (str8 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str8;
      } 
      str8 = paramBuilder.title;
      if (str8 == null) {
        this.title = "";
      } else {
        this.title = str8;
      } 
      List<PostInfoContent> list11 = paramBuilder.content;
      if (list11 == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list11);
      } 
      String str7 = paramBuilder.content_thread;
      if (str7 == null) {
        this.content_thread = "";
      } else {
        this.content_thread = str7;
      } 
      str7 = paramBuilder.user_name;
      if (str7 == null) {
        this.user_name = "";
      } else {
        this.user_name = str7;
      } 
      str7 = paramBuilder.ip;
      if (str7 == null) {
        this.ip = "";
      } else {
        this.ip = str7;
      } 
      Integer integer8 = paramBuilder.is_post_deleted;
      if (integer8 == null) {
        this.is_post_deleted = DEFAULT_IS_POST_DELETED;
      } else {
        this.is_post_deleted = integer8;
      } 
      String str6 = paramBuilder.ptype;
      if (str6 == null) {
        this.ptype = "";
      } else {
        this.ptype = str6;
      } 
      str6 = paramBuilder._abstract;
      if (str6 == null) {
        this._abstract = "";
      } else {
        this._abstract = str6;
      } 
      List<Abstract> list10 = paramBuilder.abstract_thread;
      if (list10 == null) {
        this.abstract_thread = DEFAULT_ABSTRACT_THREAD;
      } else {
        this.abstract_thread = Message.immutableCopyOf(list10);
      } 
      List<Media> list9 = paramBuilder.media;
      if (list9 == null) {
        this.media = DEFAULT_MEDIA;
      } else {
        this.media = Message.immutableCopyOf(list9);
      } 
      Integer integer7 = paramBuilder.reply_num;
      if (integer7 == null) {
        this.reply_num = DEFAULT_REPLY_NUM;
      } else {
        this.reply_num = integer7;
      } 
      Long long_3 = paramBuilder.user_id;
      if (long_3 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_3;
      } 
      String str5 = paramBuilder.user_portrait;
      if (str5 == null) {
        this.user_portrait = "";
      } else {
        this.user_portrait = str5;
      } 
      str5 = paramBuilder.post_type;
      if (str5 == null) {
        this.post_type = "";
      } else {
        this.post_type = str5;
      } 
      this.lbs_info = paramBuilder.lbs_info;
      this.quote = paramBuilder.quote;
      List<Voice> list8 = paramBuilder.voice_info;
      if (list8 == null) {
        this.voice_info = DEFAULT_VOICE_INFO;
      } else {
        this.voice_info = Message.immutableCopyOf(list8);
      } 
      this.anchor_info = paramBuilder.anchor_info;
      Integer integer6 = paramBuilder.hide_post;
      if (integer6 == null) {
        this.hide_post = DEFAULT_HIDE_POST;
      } else {
        this.hide_post = integer6;
      } 
      Long long_2 = paramBuilder.thread_type;
      if (long_2 == null) {
        this.thread_type = DEFAULT_THREAD_TYPE;
      } else {
        this.thread_type = long_2;
      } 
      this.twzhibo_info = paramBuilder.twzhibo_info;
      this.poll_info = paramBuilder.poll_info;
      this.video_info = paramBuilder.video_info;
      Boolean bool = paramBuilder.is_deal;
      if (bool == null) {
        this.is_deal = DEFAULT_IS_DEAL;
      } else {
        this.is_deal = bool;
      } 
      this.deal_info = paramBuilder.deal_info;
      List<MultipleForum> list7 = paramBuilder.multiple_forum_list;
      if (list7 == null) {
        this.multiple_forum_list = DEFAULT_MULTIPLE_FORUM_LIST;
      } else {
        this.multiple_forum_list = Message.immutableCopyOf(list7);
      } 
      Integer integer5 = paramBuilder.freq_num;
      if (integer5 == null) {
        this.freq_num = DEFAULT_FREQ_NUM;
      } else {
        this.freq_num = integer5;
      } 
      Long long_1 = paramBuilder.v_forum_id;
      if (long_1 == null) {
        this.v_forum_id = DEFAULT_V_FORUM_ID;
      } else {
        this.v_forum_id = long_1;
      } 
      String str4 = paramBuilder.name_show;
      if (str4 == null) {
        this.name_show = "";
      } else {
        this.name_show = str4;
      } 
      this.ala_info = paramBuilder.ala_info;
      Integer integer4 = paramBuilder.agree_num;
      if (integer4 == null) {
        this.agree_num = DEFAULT_AGREE_NUM;
      } else {
        this.agree_num = integer4;
      } 
      integer4 = paramBuilder.view_num;
      if (integer4 == null) {
        this.view_num = DEFAULT_VIEW_NUM;
      } else {
        this.view_num = integer4;
      } 
      integer4 = paramBuilder.share_num;
      if (integer4 == null) {
        this.share_num = DEFAULT_SHARE_NUM;
      } else {
        this.share_num = integer4;
      } 
      this.agree = paramBuilder.agree;
      integer4 = paramBuilder.is_remain;
      if (integer4 == null) {
        this.is_remain = DEFAULT_IS_REMAIN;
      } else {
        this.is_remain = integer4;
      } 
      this.origin_thread_info = paramBuilder.origin_thread_info;
      integer4 = paramBuilder.is_view_year;
      if (integer4 == null) {
        this.is_view_year = DEFAULT_IS_VIEW_YEAR;
      } else {
        this.is_view_year = integer4;
      } 
      integer4 = paramBuilder.is_share_thread;
      if (integer4 == null) {
        this.is_share_thread = DEFAULT_IS_SHARE_THREAD;
      } else {
        this.is_share_thread = integer4;
      } 
      List<PbContent> list6 = paramBuilder.rich_title;
      if (list6 == null) {
        this.rich_title = DEFAULT_RICH_TITLE;
      } else {
        this.rich_title = Message.immutableCopyOf(list6);
      } 
      list6 = paramBuilder.rich_abstract;
      if (list6 == null) {
        this.rich_abstract = DEFAULT_RICH_ABSTRACT;
      } else {
        this.rich_abstract = Message.immutableCopyOf(list6);
      } 
      Integer integer3 = paramBuilder.is_ntitle;
      if (integer3 == null) {
        this.is_ntitle = DEFAULT_IS_NTITLE;
      } else {
        this.is_ntitle = integer3;
      } 
      String str3 = paramBuilder.article_cover;
      if (str3 == null) {
        this.article_cover = "";
      } else {
        this.article_cover = str3;
      } 
      List<PbContent> list5 = paramBuilder.first_post_content;
      if (list5 == null) {
        this.first_post_content = DEFAULT_FIRST_POST_CONTENT;
      } else {
        this.first_post_content = Message.immutableCopyOf(list5);
      } 
      this.baijiahao_info = paramBuilder.baijiahao_info;
      String str2 = paramBuilder.wonderful_post_info;
      if (str2 == null) {
        this.wonderful_post_info = "";
      } else {
        this.wonderful_post_info = str2;
      } 
      this.item = paramBuilder.item;
      List<HeadItem> list4 = paramBuilder.item_star;
      if (list4 == null) {
        this.item_star = DEFAULT_ITEM_STAR;
      } else {
        this.item_star = Message.immutableCopyOf(list4);
      } 
      List<PbLinkInfo> list3 = paramBuilder.pb_link_info;
      if (list3 == null) {
        this.pb_link_info = DEFAULT_PB_LINK_INFO;
      } else {
        this.pb_link_info = Message.immutableCopyOf(list3);
      } 
      List<PbGoodsInfo> list2 = paramBuilder.pb_goods_info;
      if (list2 == null) {
        this.pb_goods_info = DEFAULT_PB_GOODS_INFO;
      } else {
        this.pb_goods_info = Message.immutableCopyOf(list2);
      } 
      List<PrivSets> list1 = paramBuilder.priv_sets;
      if (list1 == null) {
        this.priv_sets = DEFAULT_PRIV_SETS;
      } else {
        this.priv_sets = Message.immutableCopyOf(list1);
      } 
      Integer integer2 = paramBuilder.is_author_view;
      if (integer2 == null) {
        this.is_author_view = DEFAULT_IS_AUTHOR_VIEW;
      } else {
        this.is_author_view = integer2;
      } 
      this.works_info = paramBuilder.works_info;
      integer2 = paramBuilder.is_manager;
      if (integer2 == null) {
        this.is_manager = DEFAULT_IS_MANAGER;
      } else {
        this.is_manager = integer2;
      } 
      integer2 = paramBuilder.is_origin_manager;
      if (integer2 == null) {
        this.is_origin_manager = DEFAULT_IS_ORIGIN_MANAGER;
      } else {
        this.is_origin_manager = integer2;
      } 
      integer2 = paramBuilder.good_types;
      if (integer2 == null) {
        this.good_types = DEFAULT_GOOD_TYPES;
      } else {
        this.good_types = integer2;
      } 
      integer2 = paramBuilder.top_types;
      if (integer2 == null) {
        this.top_types = DEFAULT_TOP_TYPES;
      } else {
        this.top_types = integer2;
      } 
      this.user_post_perm = paramBuilder.user_post_perm;
      this.voice_room = paramBuilder.voice_room;
      this.edit_info = paramBuilder.edit_info;
      String str1 = paramBuilder.target_scheme;
      if (str1 == null) {
        this.target_scheme = "";
      } else {
        this.target_scheme = str1;
      } 
      this.chat_private = paramBuilder.chat_private;
      List<FeedKV> list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
      this.score_info = paramBuilder.score_info;
      Integer integer1 = paramBuilder.audit_status;
      if (integer1 == null) {
        this.audit_status = DEFAULT_AUDIT_STATUS;
      } else {
        this.audit_status = integer1;
      } 
      this.ablum_info = paramBuilder.ablum_info;
      this.draw_info = paramBuilder.draw_info;
      this.author_status_tag = paramBuilder.author_status_tag;
    } else {
      this.forum_id = paramBuilder.forum_id;
      this.thread_id = paramBuilder.thread_id;
      this.post_id = paramBuilder.post_id;
      this.is_thread = paramBuilder.is_thread;
      this.create_time = paramBuilder.create_time;
      this.forum_name = paramBuilder.forum_name;
      this.title = paramBuilder.title;
      this.content = Message.immutableCopyOf(paramBuilder.content);
      this.content_thread = paramBuilder.content_thread;
      this.user_name = paramBuilder.user_name;
      this.ip = paramBuilder.ip;
      this.is_post_deleted = paramBuilder.is_post_deleted;
      this.ptype = paramBuilder.ptype;
      this._abstract = paramBuilder._abstract;
      this.abstract_thread = Message.immutableCopyOf(paramBuilder.abstract_thread);
      this.media = Message.immutableCopyOf(paramBuilder.media);
      this.reply_num = paramBuilder.reply_num;
      this.user_id = paramBuilder.user_id;
      this.user_portrait = paramBuilder.user_portrait;
      this.post_type = paramBuilder.post_type;
      this.lbs_info = paramBuilder.lbs_info;
      this.quote = paramBuilder.quote;
      this.voice_info = Message.immutableCopyOf(paramBuilder.voice_info);
      this.anchor_info = paramBuilder.anchor_info;
      this.hide_post = paramBuilder.hide_post;
      this.thread_type = paramBuilder.thread_type;
      this.twzhibo_info = paramBuilder.twzhibo_info;
      this.poll_info = paramBuilder.poll_info;
      this.video_info = paramBuilder.video_info;
      this.is_deal = paramBuilder.is_deal;
      this.deal_info = paramBuilder.deal_info;
      this.multiple_forum_list = Message.immutableCopyOf(paramBuilder.multiple_forum_list);
      this.freq_num = paramBuilder.freq_num;
      this.v_forum_id = paramBuilder.v_forum_id;
      this.name_show = paramBuilder.name_show;
      this.ala_info = paramBuilder.ala_info;
      this.agree_num = paramBuilder.agree_num;
      this.view_num = paramBuilder.view_num;
      this.share_num = paramBuilder.share_num;
      this.agree = paramBuilder.agree;
      this.is_remain = paramBuilder.is_remain;
      this.origin_thread_info = paramBuilder.origin_thread_info;
      this.is_view_year = paramBuilder.is_view_year;
      this.is_share_thread = paramBuilder.is_share_thread;
      this.rich_title = Message.immutableCopyOf(paramBuilder.rich_title);
      this.rich_abstract = Message.immutableCopyOf(paramBuilder.rich_abstract);
      this.is_ntitle = paramBuilder.is_ntitle;
      this.article_cover = paramBuilder.article_cover;
      this.first_post_content = Message.immutableCopyOf(paramBuilder.first_post_content);
      this.baijiahao_info = paramBuilder.baijiahao_info;
      this.wonderful_post_info = paramBuilder.wonderful_post_info;
      this.item = paramBuilder.item;
      this.item_star = Message.immutableCopyOf(paramBuilder.item_star);
      this.pb_link_info = Message.immutableCopyOf(paramBuilder.pb_link_info);
      this.pb_goods_info = Message.immutableCopyOf(paramBuilder.pb_goods_info);
      this.priv_sets = Message.immutableCopyOf(paramBuilder.priv_sets);
      this.is_author_view = paramBuilder.is_author_view;
      this.works_info = paramBuilder.works_info;
      this.is_manager = paramBuilder.is_manager;
      this.is_origin_manager = paramBuilder.is_origin_manager;
      this.good_types = paramBuilder.good_types;
      this.top_types = paramBuilder.top_types;
      this.user_post_perm = paramBuilder.user_post_perm;
      this.voice_room = paramBuilder.voice_room;
      this.edit_info = paramBuilder.edit_info;
      this.target_scheme = paramBuilder.target_scheme;
      this.chat_private = paramBuilder.chat_private;
      this.log_param = Message.immutableCopyOf(paramBuilder.log_param);
      this.score_info = paramBuilder.score_info;
      this.audit_status = paramBuilder.audit_status;
      this.ablum_info = paramBuilder.ablum_info;
      this.draw_info = paramBuilder.draw_info;
      this.author_status_tag = paramBuilder.author_status_tag;
    } 
  }
  
  public static final class Builder extends Message.Builder<PostInfoList> {
    public String _abstract;
    
    public ThreadAblum ablum_info;
    
    public List<Abstract> abstract_thread;
    
    public Agree agree;
    
    public Integer agree_num;
    
    public AlaLiveInfo ala_info;
    
    public AnchorInfo anchor_info;
    
    public String article_cover;
    
    public Integer audit_status;
    
    public HelpStatusTag author_status_tag;
    
    public BaijiahaoInfo baijiahao_info;
    
    public ChatPrivate chat_private;
    
    public List<PostInfoContent> content;
    
    public String content_thread;
    
    public Integer create_time;
    
    public DealInfo deal_info;
    
    public ThreadDrawInfo draw_info;
    
    public EditInfo edit_info;
    
    public List<PbContent> first_post_content;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer freq_num;
    
    public Integer good_types;
    
    public Integer hide_post;
    
    public String ip;
    
    public Integer is_author_view;
    
    public Boolean is_deal;
    
    public Integer is_manager;
    
    public Integer is_ntitle;
    
    public Integer is_origin_manager;
    
    public Integer is_post_deleted;
    
    public Integer is_remain;
    
    public Integer is_share_thread;
    
    public Integer is_thread;
    
    public Integer is_view_year;
    
    public Item item;
    
    public List<HeadItem> item_star;
    
    public LbsInfo lbs_info;
    
    public List<FeedKV> log_param;
    
    public List<Media> media;
    
    public List<MultipleForum> multiple_forum_list;
    
    public String name_show;
    
    public OriginThreadInfo origin_thread_info;
    
    public List<PbGoodsInfo> pb_goods_info;
    
    public List<PbLinkInfo> pb_link_info;
    
    public PollInfo poll_info;
    
    public Long post_id;
    
    public String post_type;
    
    public List<PrivSets> priv_sets;
    
    public String ptype;
    
    public Quote quote;
    
    public Integer reply_num;
    
    public List<PbContent> rich_abstract;
    
    public List<PbContent> rich_title;
    
    public ThreadScoreInfo score_info;
    
    public Integer share_num;
    
    public String target_scheme;
    
    public Long thread_id;
    
    public Long thread_type;
    
    public String title;
    
    public Integer top_types;
    
    public ZhiBoInfoTW twzhibo_info;
    
    public Long user_id;
    
    public String user_name;
    
    public String user_portrait;
    
    public UserPostPerm user_post_perm;
    
    public Long v_forum_id;
    
    public VideoInfo video_info;
    
    public Integer view_num;
    
    public List<Voice> voice_info;
    
    public VoiceRoom voice_room;
    
    public String wonderful_post_info;
    
    public WorksInfo works_info;
    
    public Builder() {}
    
    public Builder(PostInfoList param1PostInfoList) {
      super(param1PostInfoList);
      if (param1PostInfoList == null)
        return; 
      this.forum_id = param1PostInfoList.forum_id;
      this.thread_id = param1PostInfoList.thread_id;
      this.post_id = param1PostInfoList.post_id;
      this.is_thread = param1PostInfoList.is_thread;
      this.create_time = param1PostInfoList.create_time;
      this.forum_name = param1PostInfoList.forum_name;
      this.title = param1PostInfoList.title;
      this.content = Message.copyOf(param1PostInfoList.content);
      this.content_thread = param1PostInfoList.content_thread;
      this.user_name = param1PostInfoList.user_name;
      this.ip = param1PostInfoList.ip;
      this.is_post_deleted = param1PostInfoList.is_post_deleted;
      this.ptype = param1PostInfoList.ptype;
      this._abstract = param1PostInfoList._abstract;
      this.abstract_thread = Message.copyOf(param1PostInfoList.abstract_thread);
      this.media = Message.copyOf(param1PostInfoList.media);
      this.reply_num = param1PostInfoList.reply_num;
      this.user_id = param1PostInfoList.user_id;
      this.user_portrait = param1PostInfoList.user_portrait;
      this.post_type = param1PostInfoList.post_type;
      this.lbs_info = param1PostInfoList.lbs_info;
      this.quote = param1PostInfoList.quote;
      this.voice_info = Message.copyOf(param1PostInfoList.voice_info);
      this.anchor_info = param1PostInfoList.anchor_info;
      this.hide_post = param1PostInfoList.hide_post;
      this.thread_type = param1PostInfoList.thread_type;
      this.twzhibo_info = param1PostInfoList.twzhibo_info;
      this.poll_info = param1PostInfoList.poll_info;
      this.video_info = param1PostInfoList.video_info;
      this.is_deal = param1PostInfoList.is_deal;
      this.deal_info = param1PostInfoList.deal_info;
      this.multiple_forum_list = Message.copyOf(param1PostInfoList.multiple_forum_list);
      this.freq_num = param1PostInfoList.freq_num;
      this.v_forum_id = param1PostInfoList.v_forum_id;
      this.name_show = param1PostInfoList.name_show;
      this.ala_info = param1PostInfoList.ala_info;
      this.agree_num = param1PostInfoList.agree_num;
      this.view_num = param1PostInfoList.view_num;
      this.share_num = param1PostInfoList.share_num;
      this.agree = param1PostInfoList.agree;
      this.is_remain = param1PostInfoList.is_remain;
      this.origin_thread_info = param1PostInfoList.origin_thread_info;
      this.is_view_year = param1PostInfoList.is_view_year;
      this.is_share_thread = param1PostInfoList.is_share_thread;
      this.rich_title = Message.copyOf(param1PostInfoList.rich_title);
      this.rich_abstract = Message.copyOf(param1PostInfoList.rich_abstract);
      this.is_ntitle = param1PostInfoList.is_ntitle;
      this.article_cover = param1PostInfoList.article_cover;
      this.first_post_content = Message.copyOf(param1PostInfoList.first_post_content);
      this.baijiahao_info = param1PostInfoList.baijiahao_info;
      this.wonderful_post_info = param1PostInfoList.wonderful_post_info;
      this.item = param1PostInfoList.item;
      this.item_star = Message.copyOf(param1PostInfoList.item_star);
      this.pb_link_info = Message.copyOf(param1PostInfoList.pb_link_info);
      this.pb_goods_info = Message.copyOf(param1PostInfoList.pb_goods_info);
      this.priv_sets = Message.copyOf(param1PostInfoList.priv_sets);
      this.is_author_view = param1PostInfoList.is_author_view;
      this.works_info = param1PostInfoList.works_info;
      this.is_manager = param1PostInfoList.is_manager;
      this.is_origin_manager = param1PostInfoList.is_origin_manager;
      this.good_types = param1PostInfoList.good_types;
      this.top_types = param1PostInfoList.top_types;
      this.user_post_perm = param1PostInfoList.user_post_perm;
      this.voice_room = param1PostInfoList.voice_room;
      this.edit_info = param1PostInfoList.edit_info;
      this.target_scheme = param1PostInfoList.target_scheme;
      this.chat_private = param1PostInfoList.chat_private;
      this.log_param = Message.copyOf(param1PostInfoList.log_param);
      this.score_info = param1PostInfoList.score_info;
      this.audit_status = param1PostInfoList.audit_status;
      this.ablum_info = param1PostInfoList.ablum_info;
      this.draw_info = param1PostInfoList.draw_info;
      this.author_status_tag = param1PostInfoList.author_status_tag;
    }
    
    public PostInfoList build(boolean param1Boolean) {
      return new PostInfoList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
