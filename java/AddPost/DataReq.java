package tbclient.AddPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_ACTIVITY_BUSINESS_ID;
  
  public static final Long DEFAULT_ACTIVITY_PRODUCT_ID;
  
  public static final String DEFAULT_ANONYMOUS = "";
  
  public static final String DEFAULT_AUTHSID = "";
  
  public static final String DEFAULT_BARRAGE_TIME = "";
  
  public static final String DEFAULT_BOT_CONF = "";
  
  public static final String DEFAULT_CAN_NO_FORUM = "";
  
  public static final String DEFAULT_COMMENT_HEAD = "";
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_DURING_TIME = "";
  
  public static final String DEFAULT_ENTRANCE_TYPE = "";
  
  public static final String DEFAULT_FID = "";
  
  public static final String DEFAULT_FLOOR_NUM = "";
  
  public static final String DEFAULT_FROM_CATEGORY_ID = "";
  
  public static final String DEFAULT_FROM_FOURM_ID = "";
  
  public static final Long DEFAULT_GOODS_ID;
  
  public static final String DEFAULT_IS_AD = "";
  
  public static final String DEFAULT_IS_ADDITION = "";
  
  public static final String DEFAULT_IS_BARRAGE = "";
  
  public static final String DEFAULT_IS_FEEDBACK = "";
  
  public static final String DEFAULT_IS_GIFTPOST = "";
  
  public static final String DEFAULT_IS_LOCATION = "";
  
  public static final String DEFAULT_IS_PICTXT = "";
  
  public static final Integer DEFAULT_IS_SHOW_BLESS;
  
  public static final String DEFAULT_IS_STORY = "";
  
  public static final String DEFAULT_IS_TWZHIBO_THREAD = "";
  
  public static final String DEFAULT_IS_WORKS = "";
  
  public static final String DEFAULT_ITEM_ID = "";
  
  public static final String DEFAULT_JFROM = "";
  
  public static final String DEFAULT_JID = "";
  
  public static final String DEFAULT_KW = "";
  
  public static final String DEFAULT_LAT = "";
  
  public static final String DEFAULT_LNG = "";
  
  public static final String DEFAULT_MEME_CONT_SIGN = "";
  
  public static final String DEFAULT_MEME_TEXT = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final String DEFAULT_NEW_VCODE = "";
  
  public static final String DEFAULT_ORI_UGC_NID = "";
  
  public static final String DEFAULT_ORI_UGC_TID = "";
  
  public static final String DEFAULT_ORI_UGC_TYPE = "";
  
  public static final String DEFAULT_ORI_UGC_VID = "";
  
  public static final String DEFAULT_POST_FROM = "";
  
  public static final String DEFAULT_PTYPE = "";
  
  public static final String DEFAULT_QUOTE_ID = "";
  
  public static final String DEFAULT_REAL_LAT = "";
  
  public static final String DEFAULT_REAL_LNG = "";
  
  public static final Long DEFAULT_REPLY_AUTHOR_STATUS_TAG_ID;
  
  public static final String DEFAULT_REPLY_UID = "";
  
  public static final String DEFAULT_REPOSTID = "";
  
  public static final Integer DEFAULT_SCORE;
  
  public static final Long DEFAULT_SCORE_ID;
  
  public static final String DEFAULT_SCORE_NAME = "";
  
  public static final Integer DEFAULT_SHOW_CUSTOM_FIGURE;
  
  public static final String DEFAULT_SIG = "";
  
  public static final String DEFAULT_SN = "";
  
  public static final String DEFAULT_SPRITE_MEME_ID = "";
  
  public static final String DEFAULT_SPRITE_MEME_QUERY = "";
  
  public static final String DEFAULT_ST_PARAM = "";
  
  public static final String DEFAULT_ST_TYPE = "";
  
  public static final String DEFAULT_SUB_POST_ID = "";
  
  public static final String DEFAULT_TAG_INFO = "";
  
  public static final String DEFAULT_TAKEPHOTO_NUM = "";
  
  public static final String DEFAULT_TBS = "";
  
  public static final String DEFAULT_TID = "";
  
  public static final String DEFAULT_TOPIC_ID = "";
  
  public static final String DEFAULT_TO_CATEGORY_ID = "";
  
  public static final String DEFAULT_TRANSFORM_FORUMS = "";
  
  public static final String DEFAULT_VCODE = "";
  
  public static final String DEFAULT_VCODE_MD5 = "";
  
  public static final String DEFAULT_VCODE_TAG = "";
  
  public static final String DEFAULT_VCODE_TYPE = "";
  
  public static final String DEFAULT_VIDEO_OTHER = "";
  
  public static final String DEFAULT_VOICE_MD5 = "";
  
  public static final String DEFAULT_V_FID = "";
  
  public static final String DEFAULT_V_FNAME = "";
  
  public static final Integer DEFAULT_WITH_TAIL;
  
  public static final String DEFAULT_WORKS_TAG = "";
  
  @ProtoField(tag = 72, type = Message.Datatype.INT64)
  public final Long activity_business_id;
  
  @ProtoField(tag = 71, type = Message.Datatype.INT64)
  public final Long activity_product_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String anonymous;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String authsid;
  
  @ProtoField(tag = 32, type = Message.Datatype.STRING)
  public final String barrage_time;
  
  @ProtoField(tag = 68, type = Message.Datatype.STRING)
  public final String bot_conf;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String can_no_forum;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String comment_head;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String during_time;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String entrance_type;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String fid;
  
  @ProtoField(tag = 48, type = Message.Datatype.STRING)
  public final String floor_num;
  
  @ProtoField(tag = 65, type = Message.Datatype.STRING)
  public final String from_category_id;
  
  @ProtoField(tag = 44, type = Message.Datatype.STRING)
  public final String from_fourm_id;
  
  @ProtoField(tag = 78, type = Message.Datatype.UINT64)
  public final Long goods_id;
  
  @ProtoField(tag = 51, type = Message.Datatype.STRING)
  public final String is_ad;
  
  @ProtoField(tag = 52, type = Message.Datatype.STRING)
  public final String is_addition;
  
  @ProtoField(tag = 31, type = Message.Datatype.STRING)
  public final String is_barrage;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String is_feedback;
  
  @ProtoField(tag = 53, type = Message.Datatype.STRING)
  public final String is_giftpost;
  
  @ProtoField(tag = 39, type = Message.Datatype.STRING)
  public final String is_location;
  
  @ProtoField(tag = 60, type = Message.Datatype.STRING)
  public final String is_pictxt;
  
  @ProtoField(tag = 67, type = Message.Datatype.INT32)
  public final Integer is_show_bless;
  
  @ProtoField(tag = 61, type = Message.Datatype.STRING)
  public final String is_story;
  
  @ProtoField(tag = 47, type = Message.Datatype.STRING)
  public final String is_twzhibo_thread;
  
  @ProtoField(tag = 59, type = Message.Datatype.STRING)
  public final String is_works;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String item_id;
  
  @ProtoField(tag = 63, type = Message.Datatype.STRING)
  public final String jfrom;
  
  @ProtoField(tag = 62, type = Message.Datatype.STRING)
  public final String jid;
  
  @ProtoField(tag = 30, type = Message.Datatype.STRING)
  public final String kw;
  
  @ProtoField(tag = 40, type = Message.Datatype.STRING)
  public final String lat;
  
  @ProtoField(tag = 41, type = Message.Datatype.STRING)
  public final String lng;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String meme_cont_sign;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String meme_text;
  
  @ProtoField(tag = 42, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 58, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String new_vcode;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String ori_ugc_nid;
  
  @ProtoField(tag = 37, type = Message.Datatype.STRING)
  public final String ori_ugc_tid;
  
  @ProtoField(tag = 38, type = Message.Datatype.STRING)
  public final String ori_ugc_type;
  
  @ProtoField(tag = 36, type = Message.Datatype.STRING)
  public final String ori_ugc_vid;
  
  @ProtoField(tag = 55, type = Message.Datatype.STRING)
  public final String post_from;
  
  @ProtoField(tag = 34, type = Message.Datatype.STRING)
  public final String ptype;
  
  @ProtoField(tag = 46, type = Message.Datatype.STRING)
  public final String quote_id;
  
  @ProtoField(tag = 56, type = Message.Datatype.STRING)
  public final String real_lat;
  
  @ProtoField(tag = 57, type = Message.Datatype.STRING)
  public final String real_lng;
  
  @ProtoField(tag = 79, type = Message.Datatype.UINT64)
  public final Long reply_author_status_tag_id;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String reply_uid;
  
  @ProtoField(tag = 49, type = Message.Datatype.STRING)
  public final String repostid;
  
  @ProtoField(tag = 75, type = Message.Datatype.UINT32)
  public final Integer score;
  
  @ProtoField(tag = 73, type = Message.Datatype.UINT64)
  public final Long score_id;
  
  @ProtoField(tag = 74, type = Message.Datatype.STRING)
  public final String score_name;
  
  @ProtoField(tag = 64, type = Message.Datatype.INT32)
  public final Integer show_custom_figure;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String sig;
  
  @ProtoField(tag = 43, type = Message.Datatype.STRING)
  public final String sn;
  
  @ProtoField(tag = 69, type = Message.Datatype.STRING)
  public final String sprite_meme_id;
  
  @ProtoField(tag = 70, type = Message.Datatype.STRING)
  public final String sprite_meme_query;
  
  @ProtoField(tag = 33, type = Message.Datatype.STRING)
  public final String st_param;
  
  @ProtoField(tag = 54, type = Message.Datatype.STRING)
  public final String st_type;
  
  @ProtoField(tag = 50, type = Message.Datatype.STRING)
  public final String sub_post_id;
  
  @ProtoField(tag = 77, type = Message.Datatype.STRING)
  public final String tag_info;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String takephoto_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String tbs;
  
  @ProtoField(tag = 45, type = Message.Datatype.STRING)
  public final String tid;
  
  @ProtoField(tag = 66, type = Message.Datatype.STRING)
  public final String to_category_id;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String topic_id;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String transform_forums;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String v_fid;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String v_fname;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String vcode;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String vcode_md5;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String vcode_tag;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String vcode_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String video_other;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String voice_md5;
  
  @ProtoField(tag = 76, type = Message.Datatype.UINT32)
  public final Integer with_tail;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String works_tag;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SHOW_CUSTOM_FIGURE = integer;
    DEFAULT_IS_SHOW_BLESS = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_ACTIVITY_PRODUCT_ID = long_;
    DEFAULT_ACTIVITY_BUSINESS_ID = long_;
    DEFAULT_SCORE_ID = long_;
    DEFAULT_SCORE = integer;
    DEFAULT_WITH_TAIL = integer;
    DEFAULT_GOODS_ID = long_;
    DEFAULT_REPLY_AUTHOR_STATUS_TAG_ID = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str5 = paramBuilder.authsid;
      if (str5 == null) {
        this.authsid = "";
      } else {
        this.authsid = str5;
      } 
      str5 = paramBuilder.sig;
      if (str5 == null) {
        this.sig = "";
      } else {
        this.sig = str5;
      } 
      str5 = paramBuilder.tbs;
      if (str5 == null) {
        this.tbs = "";
      } else {
        this.tbs = str5;
      } 
      str5 = paramBuilder.video_other;
      if (str5 == null) {
        this.video_other = "";
      } else {
        this.video_other = str5;
      } 
      str5 = paramBuilder.anonymous;
      if (str5 == null) {
        this.anonymous = "";
      } else {
        this.anonymous = str5;
      } 
      str5 = paramBuilder.can_no_forum;
      if (str5 == null) {
        this.can_no_forum = "";
      } else {
        this.can_no_forum = str5;
      } 
      str5 = paramBuilder.is_feedback;
      if (str5 == null) {
        this.is_feedback = "";
      } else {
        this.is_feedback = str5;
      } 
      str5 = paramBuilder.takephoto_num;
      if (str5 == null) {
        this.takephoto_num = "";
      } else {
        this.takephoto_num = str5;
      } 
      str5 = paramBuilder.entrance_type;
      if (str5 == null) {
        this.entrance_type = "";
      } else {
        this.entrance_type = str5;
      } 
      str5 = paramBuilder.voice_md5;
      if (str5 == null) {
        this.voice_md5 = "";
      } else {
        this.voice_md5 = str5;
      } 
      str5 = paramBuilder.during_time;
      if (str5 == null) {
        this.during_time = "";
      } else {
        this.during_time = str5;
      } 
      str5 = paramBuilder.vcode;
      if (str5 == null) {
        this.vcode = "";
      } else {
        this.vcode = str5;
      } 
      str5 = paramBuilder.vcode_md5;
      if (str5 == null) {
        this.vcode_md5 = "";
      } else {
        this.vcode_md5 = str5;
      } 
      str5 = paramBuilder.vcode_type;
      if (str5 == null) {
        this.vcode_type = "";
      } else {
        this.vcode_type = str5;
      } 
      str5 = paramBuilder.vcode_tag;
      if (str5 == null) {
        this.vcode_tag = "";
      } else {
        this.vcode_tag = str5;
      } 
      str5 = paramBuilder.topic_id;
      if (str5 == null) {
        this.topic_id = "";
      } else {
        this.topic_id = str5;
      } 
      str5 = paramBuilder.new_vcode;
      if (str5 == null) {
        this.new_vcode = "";
      } else {
        this.new_vcode = str5;
      } 
      str5 = paramBuilder.content;
      if (str5 == null) {
        this.content = "";
      } else {
        this.content = str5;
      } 
      str5 = paramBuilder.reply_uid;
      if (str5 == null) {
        this.reply_uid = "";
      } else {
        this.reply_uid = str5;
      } 
      str5 = paramBuilder.meme_text;
      if (str5 == null) {
        this.meme_text = "";
      } else {
        this.meme_text = str5;
      } 
      str5 = paramBuilder.meme_cont_sign;
      if (str5 == null) {
        this.meme_cont_sign = "";
      } else {
        this.meme_cont_sign = str5;
      } 
      str5 = paramBuilder.item_id;
      if (str5 == null) {
        this.item_id = "";
      } else {
        this.item_id = str5;
      } 
      str5 = paramBuilder.comment_head;
      if (str5 == null) {
        this.comment_head = "";
      } else {
        this.comment_head = str5;
      } 
      str5 = paramBuilder.works_tag;
      if (str5 == null) {
        this.works_tag = "";
      } else {
        this.works_tag = str5;
      } 
      str5 = paramBuilder.fid;
      if (str5 == null) {
        this.fid = "";
      } else {
        this.fid = str5;
      } 
      str5 = paramBuilder.transform_forums;
      if (str5 == null) {
        this.transform_forums = "";
      } else {
        this.transform_forums = str5;
      } 
      str5 = paramBuilder.v_fid;
      if (str5 == null) {
        this.v_fid = "";
      } else {
        this.v_fid = str5;
      } 
      str5 = paramBuilder.v_fname;
      if (str5 == null) {
        this.v_fname = "";
      } else {
        this.v_fname = str5;
      } 
      str5 = paramBuilder.kw;
      if (str5 == null) {
        this.kw = "";
      } else {
        this.kw = str5;
      } 
      str5 = paramBuilder.is_barrage;
      if (str5 == null) {
        this.is_barrage = "";
      } else {
        this.is_barrage = str5;
      } 
      str5 = paramBuilder.barrage_time;
      if (str5 == null) {
        this.barrage_time = "";
      } else {
        this.barrage_time = str5;
      } 
      str5 = paramBuilder.st_param;
      if (str5 == null) {
        this.st_param = "";
      } else {
        this.st_param = str5;
      } 
      str5 = paramBuilder.ptype;
      if (str5 == null) {
        this.ptype = "";
      } else {
        this.ptype = str5;
      } 
      str5 = paramBuilder.ori_ugc_nid;
      if (str5 == null) {
        this.ori_ugc_nid = "";
      } else {
        this.ori_ugc_nid = str5;
      } 
      str5 = paramBuilder.ori_ugc_vid;
      if (str5 == null) {
        this.ori_ugc_vid = "";
      } else {
        this.ori_ugc_vid = str5;
      } 
      str5 = paramBuilder.ori_ugc_tid;
      if (str5 == null) {
        this.ori_ugc_tid = "";
      } else {
        this.ori_ugc_tid = str5;
      } 
      str5 = paramBuilder.ori_ugc_type;
      if (str5 == null) {
        this.ori_ugc_type = "";
      } else {
        this.ori_ugc_type = str5;
      } 
      str5 = paramBuilder.is_location;
      if (str5 == null) {
        this.is_location = "";
      } else {
        this.is_location = str5;
      } 
      str5 = paramBuilder.lat;
      if (str5 == null) {
        this.lat = "";
      } else {
        this.lat = str5;
      } 
      str5 = paramBuilder.lng;
      if (str5 == null) {
        this.lng = "";
      } else {
        this.lng = str5;
      } 
      str5 = paramBuilder.name;
      if (str5 == null) {
        this.name = "";
      } else {
        this.name = str5;
      } 
      str5 = paramBuilder.sn;
      if (str5 == null) {
        this.sn = "";
      } else {
        this.sn = str5;
      } 
      str5 = paramBuilder.from_fourm_id;
      if (str5 == null) {
        this.from_fourm_id = "";
      } else {
        this.from_fourm_id = str5;
      } 
      str5 = paramBuilder.tid;
      if (str5 == null) {
        this.tid = "";
      } else {
        this.tid = str5;
      } 
      str5 = paramBuilder.quote_id;
      if (str5 == null) {
        this.quote_id = "";
      } else {
        this.quote_id = str5;
      } 
      str5 = paramBuilder.is_twzhibo_thread;
      if (str5 == null) {
        this.is_twzhibo_thread = "";
      } else {
        this.is_twzhibo_thread = str5;
      } 
      str5 = paramBuilder.floor_num;
      if (str5 == null) {
        this.floor_num = "";
      } else {
        this.floor_num = str5;
      } 
      str5 = paramBuilder.repostid;
      if (str5 == null) {
        this.repostid = "";
      } else {
        this.repostid = str5;
      } 
      str5 = paramBuilder.sub_post_id;
      if (str5 == null) {
        this.sub_post_id = "";
      } else {
        this.sub_post_id = str5;
      } 
      str5 = paramBuilder.is_ad;
      if (str5 == null) {
        this.is_ad = "";
      } else {
        this.is_ad = str5;
      } 
      str5 = paramBuilder.is_addition;
      if (str5 == null) {
        this.is_addition = "";
      } else {
        this.is_addition = str5;
      } 
      str5 = paramBuilder.is_giftpost;
      if (str5 == null) {
        this.is_giftpost = "";
      } else {
        this.is_giftpost = str5;
      } 
      str5 = paramBuilder.st_type;
      if (str5 == null) {
        this.st_type = "";
      } else {
        this.st_type = str5;
      } 
      str5 = paramBuilder.post_from;
      if (str5 == null) {
        this.post_from = "";
      } else {
        this.post_from = str5;
      } 
      str5 = paramBuilder.real_lat;
      if (str5 == null) {
        this.real_lat = "";
      } else {
        this.real_lat = str5;
      } 
      str5 = paramBuilder.real_lng;
      if (str5 == null) {
        this.real_lng = "";
      } else {
        this.real_lng = str5;
      } 
      str5 = paramBuilder.name_show;
      if (str5 == null) {
        this.name_show = "";
      } else {
        this.name_show = str5;
      } 
      str5 = paramBuilder.is_works;
      if (str5 == null) {
        this.is_works = "";
      } else {
        this.is_works = str5;
      } 
      str5 = paramBuilder.is_pictxt;
      if (str5 == null) {
        this.is_pictxt = "";
      } else {
        this.is_pictxt = str5;
      } 
      str5 = paramBuilder.is_story;
      if (str5 == null) {
        this.is_story = "";
      } else {
        this.is_story = str5;
      } 
      str5 = paramBuilder.jid;
      if (str5 == null) {
        this.jid = "";
      } else {
        this.jid = str5;
      } 
      str5 = paramBuilder.jfrom;
      if (str5 == null) {
        this.jfrom = "";
      } else {
        this.jfrom = str5;
      } 
      Integer integer3 = paramBuilder.show_custom_figure;
      if (integer3 == null) {
        this.show_custom_figure = DEFAULT_SHOW_CUSTOM_FIGURE;
      } else {
        this.show_custom_figure = integer3;
      } 
      String str4 = paramBuilder.from_category_id;
      if (str4 == null) {
        this.from_category_id = "";
      } else {
        this.from_category_id = str4;
      } 
      str4 = paramBuilder.to_category_id;
      if (str4 == null) {
        this.to_category_id = "";
      } else {
        this.to_category_id = str4;
      } 
      Integer integer2 = paramBuilder.is_show_bless;
      if (integer2 == null) {
        this.is_show_bless = DEFAULT_IS_SHOW_BLESS;
      } else {
        this.is_show_bless = integer2;
      } 
      String str3 = paramBuilder.bot_conf;
      if (str3 == null) {
        this.bot_conf = "";
      } else {
        this.bot_conf = str3;
      } 
      str3 = paramBuilder.sprite_meme_id;
      if (str3 == null) {
        this.sprite_meme_id = "";
      } else {
        this.sprite_meme_id = str3;
      } 
      str3 = paramBuilder.sprite_meme_query;
      if (str3 == null) {
        this.sprite_meme_query = "";
      } else {
        this.sprite_meme_query = str3;
      } 
      Long long_2 = paramBuilder.activity_product_id;
      if (long_2 == null) {
        this.activity_product_id = DEFAULT_ACTIVITY_PRODUCT_ID;
      } else {
        this.activity_product_id = long_2;
      } 
      long_2 = paramBuilder.activity_business_id;
      if (long_2 == null) {
        this.activity_business_id = DEFAULT_ACTIVITY_BUSINESS_ID;
      } else {
        this.activity_business_id = long_2;
      } 
      long_2 = paramBuilder.score_id;
      if (long_2 == null) {
        this.score_id = DEFAULT_SCORE_ID;
      } else {
        this.score_id = long_2;
      } 
      String str2 = paramBuilder.score_name;
      if (str2 == null) {
        this.score_name = "";
      } else {
        this.score_name = str2;
      } 
      Integer integer1 = paramBuilder.score;
      if (integer1 == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = integer1;
      } 
      integer1 = paramBuilder.with_tail;
      if (integer1 == null) {
        this.with_tail = DEFAULT_WITH_TAIL;
      } else {
        this.with_tail = integer1;
      } 
      String str1 = paramBuilder.tag_info;
      if (str1 == null) {
        this.tag_info = "";
      } else {
        this.tag_info = str1;
      } 
      Long long_1 = paramBuilder.goods_id;
      if (long_1 == null) {
        this.goods_id = DEFAULT_GOODS_ID;
      } else {
        this.goods_id = long_1;
      } 
      long_ = paramBuilder.reply_author_status_tag_id;
      if (long_ == null) {
        this.reply_author_status_tag_id = DEFAULT_REPLY_AUTHOR_STATUS_TAG_ID;
      } else {
        this.reply_author_status_tag_id = long_;
      } 
    } else {
      this.common = ((Builder)long_).common;
      this.authsid = ((Builder)long_).authsid;
      this.sig = ((Builder)long_).sig;
      this.tbs = ((Builder)long_).tbs;
      this.video_other = ((Builder)long_).video_other;
      this.anonymous = ((Builder)long_).anonymous;
      this.can_no_forum = ((Builder)long_).can_no_forum;
      this.is_feedback = ((Builder)long_).is_feedback;
      this.takephoto_num = ((Builder)long_).takephoto_num;
      this.entrance_type = ((Builder)long_).entrance_type;
      this.voice_md5 = ((Builder)long_).voice_md5;
      this.during_time = ((Builder)long_).during_time;
      this.vcode = ((Builder)long_).vcode;
      this.vcode_md5 = ((Builder)long_).vcode_md5;
      this.vcode_type = ((Builder)long_).vcode_type;
      this.vcode_tag = ((Builder)long_).vcode_tag;
      this.topic_id = ((Builder)long_).topic_id;
      this.new_vcode = ((Builder)long_).new_vcode;
      this.content = ((Builder)long_).content;
      this.reply_uid = ((Builder)long_).reply_uid;
      this.meme_text = ((Builder)long_).meme_text;
      this.meme_cont_sign = ((Builder)long_).meme_cont_sign;
      this.item_id = ((Builder)long_).item_id;
      this.comment_head = ((Builder)long_).comment_head;
      this.works_tag = ((Builder)long_).works_tag;
      this.fid = ((Builder)long_).fid;
      this.transform_forums = ((Builder)long_).transform_forums;
      this.v_fid = ((Builder)long_).v_fid;
      this.v_fname = ((Builder)long_).v_fname;
      this.kw = ((Builder)long_).kw;
      this.is_barrage = ((Builder)long_).is_barrage;
      this.barrage_time = ((Builder)long_).barrage_time;
      this.st_param = ((Builder)long_).st_param;
      this.ptype = ((Builder)long_).ptype;
      this.ori_ugc_nid = ((Builder)long_).ori_ugc_nid;
      this.ori_ugc_vid = ((Builder)long_).ori_ugc_vid;
      this.ori_ugc_tid = ((Builder)long_).ori_ugc_tid;
      this.ori_ugc_type = ((Builder)long_).ori_ugc_type;
      this.is_location = ((Builder)long_).is_location;
      this.lat = ((Builder)long_).lat;
      this.lng = ((Builder)long_).lng;
      this.name = ((Builder)long_).name;
      this.sn = ((Builder)long_).sn;
      this.from_fourm_id = ((Builder)long_).from_fourm_id;
      this.tid = ((Builder)long_).tid;
      this.quote_id = ((Builder)long_).quote_id;
      this.is_twzhibo_thread = ((Builder)long_).is_twzhibo_thread;
      this.floor_num = ((Builder)long_).floor_num;
      this.repostid = ((Builder)long_).repostid;
      this.sub_post_id = ((Builder)long_).sub_post_id;
      this.is_ad = ((Builder)long_).is_ad;
      this.is_addition = ((Builder)long_).is_addition;
      this.is_giftpost = ((Builder)long_).is_giftpost;
      this.st_type = ((Builder)long_).st_type;
      this.post_from = ((Builder)long_).post_from;
      this.real_lat = ((Builder)long_).real_lat;
      this.real_lng = ((Builder)long_).real_lng;
      this.name_show = ((Builder)long_).name_show;
      this.is_works = ((Builder)long_).is_works;
      this.is_pictxt = ((Builder)long_).is_pictxt;
      this.is_story = ((Builder)long_).is_story;
      this.jid = ((Builder)long_).jid;
      this.jfrom = ((Builder)long_).jfrom;
      this.show_custom_figure = ((Builder)long_).show_custom_figure;
      this.from_category_id = ((Builder)long_).from_category_id;
      this.to_category_id = ((Builder)long_).to_category_id;
      this.is_show_bless = ((Builder)long_).is_show_bless;
      this.bot_conf = ((Builder)long_).bot_conf;
      this.sprite_meme_id = ((Builder)long_).sprite_meme_id;
      this.sprite_meme_query = ((Builder)long_).sprite_meme_query;
      this.activity_product_id = ((Builder)long_).activity_product_id;
      this.activity_business_id = ((Builder)long_).activity_business_id;
      this.score_id = ((Builder)long_).score_id;
      this.score_name = ((Builder)long_).score_name;
      this.score = ((Builder)long_).score;
      this.with_tail = ((Builder)long_).with_tail;
      this.tag_info = ((Builder)long_).tag_info;
      this.goods_id = ((Builder)long_).goods_id;
      this.reply_author_status_tag_id = ((Builder)long_).reply_author_status_tag_id;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public Long activity_business_id;
    
    public Long activity_product_id;
    
    public String anonymous;
    
    public String authsid;
    
    public String barrage_time;
    
    public String bot_conf;
    
    public String can_no_forum;
    
    public String comment_head;
    
    public CommonReq common;
    
    public String content;
    
    public String during_time;
    
    public String entrance_type;
    
    public String fid;
    
    public String floor_num;
    
    public String from_category_id;
    
    public String from_fourm_id;
    
    public Long goods_id;
    
    public String is_ad;
    
    public String is_addition;
    
    public String is_barrage;
    
    public String is_feedback;
    
    public String is_giftpost;
    
    public String is_location;
    
    public String is_pictxt;
    
    public Integer is_show_bless;
    
    public String is_story;
    
    public String is_twzhibo_thread;
    
    public String is_works;
    
    public String item_id;
    
    public String jfrom;
    
    public String jid;
    
    public String kw;
    
    public String lat;
    
    public String lng;
    
    public String meme_cont_sign;
    
    public String meme_text;
    
    public String name;
    
    public String name_show;
    
    public String new_vcode;
    
    public String ori_ugc_nid;
    
    public String ori_ugc_tid;
    
    public String ori_ugc_type;
    
    public String ori_ugc_vid;
    
    public String post_from;
    
    public String ptype;
    
    public String quote_id;
    
    public String real_lat;
    
    public String real_lng;
    
    public Long reply_author_status_tag_id;
    
    public String reply_uid;
    
    public String repostid;
    
    public Integer score;
    
    public Long score_id;
    
    public String score_name;
    
    public Integer show_custom_figure;
    
    public String sig;
    
    public String sn;
    
    public String sprite_meme_id;
    
    public String sprite_meme_query;
    
    public String st_param;
    
    public String st_type;
    
    public String sub_post_id;
    
    public String tag_info;
    
    public String takephoto_num;
    
    public String tbs;
    
    public String tid;
    
    public String to_category_id;
    
    public String topic_id;
    
    public String transform_forums;
    
    public String v_fid;
    
    public String v_fname;
    
    public String vcode;
    
    public String vcode_md5;
    
    public String vcode_tag;
    
    public String vcode_type;
    
    public String video_other;
    
    public String voice_md5;
    
    public Integer with_tail;
    
    public String works_tag;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.authsid = param1DataReq.authsid;
      this.sig = param1DataReq.sig;
      this.tbs = param1DataReq.tbs;
      this.video_other = param1DataReq.video_other;
      this.anonymous = param1DataReq.anonymous;
      this.can_no_forum = param1DataReq.can_no_forum;
      this.is_feedback = param1DataReq.is_feedback;
      this.takephoto_num = param1DataReq.takephoto_num;
      this.entrance_type = param1DataReq.entrance_type;
      this.voice_md5 = param1DataReq.voice_md5;
      this.during_time = param1DataReq.during_time;
      this.vcode = param1DataReq.vcode;
      this.vcode_md5 = param1DataReq.vcode_md5;
      this.vcode_type = param1DataReq.vcode_type;
      this.vcode_tag = param1DataReq.vcode_tag;
      this.topic_id = param1DataReq.topic_id;
      this.new_vcode = param1DataReq.new_vcode;
      this.content = param1DataReq.content;
      this.reply_uid = param1DataReq.reply_uid;
      this.meme_text = param1DataReq.meme_text;
      this.meme_cont_sign = param1DataReq.meme_cont_sign;
      this.item_id = param1DataReq.item_id;
      this.comment_head = param1DataReq.comment_head;
      this.works_tag = param1DataReq.works_tag;
      this.fid = param1DataReq.fid;
      this.transform_forums = param1DataReq.transform_forums;
      this.v_fid = param1DataReq.v_fid;
      this.v_fname = param1DataReq.v_fname;
      this.kw = param1DataReq.kw;
      this.is_barrage = param1DataReq.is_barrage;
      this.barrage_time = param1DataReq.barrage_time;
      this.st_param = param1DataReq.st_param;
      this.ptype = param1DataReq.ptype;
      this.ori_ugc_nid = param1DataReq.ori_ugc_nid;
      this.ori_ugc_vid = param1DataReq.ori_ugc_vid;
      this.ori_ugc_tid = param1DataReq.ori_ugc_tid;
      this.ori_ugc_type = param1DataReq.ori_ugc_type;
      this.is_location = param1DataReq.is_location;
      this.lat = param1DataReq.lat;
      this.lng = param1DataReq.lng;
      this.name = param1DataReq.name;
      this.sn = param1DataReq.sn;
      this.from_fourm_id = param1DataReq.from_fourm_id;
      this.tid = param1DataReq.tid;
      this.quote_id = param1DataReq.quote_id;
      this.is_twzhibo_thread = param1DataReq.is_twzhibo_thread;
      this.floor_num = param1DataReq.floor_num;
      this.repostid = param1DataReq.repostid;
      this.sub_post_id = param1DataReq.sub_post_id;
      this.is_ad = param1DataReq.is_ad;
      this.is_addition = param1DataReq.is_addition;
      this.is_giftpost = param1DataReq.is_giftpost;
      this.st_type = param1DataReq.st_type;
      this.post_from = param1DataReq.post_from;
      this.real_lat = param1DataReq.real_lat;
      this.real_lng = param1DataReq.real_lng;
      this.name_show = param1DataReq.name_show;
      this.is_works = param1DataReq.is_works;
      this.is_pictxt = param1DataReq.is_pictxt;
      this.is_story = param1DataReq.is_story;
      this.jid = param1DataReq.jid;
      this.jfrom = param1DataReq.jfrom;
      this.show_custom_figure = param1DataReq.show_custom_figure;
      this.from_category_id = param1DataReq.from_category_id;
      this.to_category_id = param1DataReq.to_category_id;
      this.is_show_bless = param1DataReq.is_show_bless;
      this.bot_conf = param1DataReq.bot_conf;
      this.sprite_meme_id = param1DataReq.sprite_meme_id;
      this.sprite_meme_query = param1DataReq.sprite_meme_query;
      this.activity_product_id = param1DataReq.activity_product_id;
      this.activity_business_id = param1DataReq.activity_business_id;
      this.score_id = param1DataReq.score_id;
      this.score_name = param1DataReq.score_name;
      this.score = param1DataReq.score;
      this.with_tail = param1DataReq.with_tail;
      this.tag_info = param1DataReq.tag_info;
      this.goods_id = param1DataReq.goods_id;
      this.reply_author_status_tag_id = param1DataReq.reply_author_status_tag_id;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
