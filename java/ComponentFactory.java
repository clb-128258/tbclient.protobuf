package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ComponentFactory extends Message {
  public static final String DEFAULT_BASE_TEXT = "";
  
  public static final String DEFAULT_COMPONENT = "";
  
  public static final List<ThreadRecommendInfo> DEFAULT_FEED_RECOMTAG = Collections.emptyList();
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String base_text;
  
  @ProtoField(tag = 40)
  public final FeedConfigurableHeadComponent card_head;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String component;
  
  @ProtoField(tag = 4)
  public final AbstractComponent feed_abstract;
  
  @ProtoField(tag = 43)
  public final FeedAiRecreationCard feed_ai_recreation_card;
  
  @ProtoField(tag = 26)
  public final FeedAichatCard feed_aichat_card;
  
  @ProtoField(tag = 36)
  public final FeedAnswerBoxComponent feed_answer_box;
  
  @ProtoField(tag = 25)
  public final FeedAuthorSocial feed_author_social;
  
  @ProtoField(tag = 51)
  public final FeedAvatarInputComponent feed_avatar_input;
  
  @ProtoField(tag = 41)
  public final FeedBannerComponent feed_banner;
  
  @ProtoField(tag = 66)
  public final FeedHeadComponent feed_bottom_ext;
  
  @ProtoField(tag = 48)
  public final FeedButtonComponent feed_button;
  
  @ProtoField(tag = 28)
  public final FeedConfigurableHeadComponent feed_configurable_head;
  
  @ProtoField(tag = 39)
  public final FeedDanmaku feed_danmaku;
  
  @ProtoField(tag = 57)
  public final FeedDiscussComponent feed_discuss;
  
  @ProtoField(tag = 78)
  public final FeedDownloadComponent feed_download;
  
  @ProtoField(tag = 79)
  public final FeedDynamicTag feed_dynamic_tag;
  
  @ProtoField(tag = 10)
  public final FeedEntrybarComponent feed_entrybar;
  
  @ProtoField(tag = 44)
  public final ScoreFeedbackComponent feed_feedback_icon_list;
  
  @ProtoField(tag = 45)
  public final FeedFlipPage feed_flip_page;
  
  @ProtoField(tag = 42)
  public final FeedGuideCardComponent feed_guide_card;
  
  @ProtoField(tag = 5)
  public final FeedHeadComponent feed_head;
  
  @ProtoField(tag = 6)
  public final FeedHeadFigureComponent feed_head_figure;
  
  @ProtoField(tag = 30)
  public final FeedHeadLoopComponent feed_head_loop;
  
  @ProtoField(tag = 60)
  public final FeedHorizontalPicComponent feed_horizontal_pic;
  
  @ProtoField(tag = 49)
  public final FeedInputGuideComponent feed_input_guide;
  
  @ProtoField(tag = 69)
  public final FeedInteractComponent feed_interact;
  
  @ProtoField(tag = 54)
  public final FeedInteractionComponent feed_interaction;
  
  @ProtoField(tag = 15)
  public final FeedItem feed_item;
  
  @ProtoField(tag = 64)
  public final FeedLeftPost feed_left_post;
  
  @ProtoField(tag = 17)
  public final FeedLinkComponent feed_link;
  
  @ProtoField(tag = 59)
  public final FeedLinkStoreComponent feed_link_store;
  
  @ProtoField(tag = 62)
  public final FeedLinkVoiceRoomComponent feed_link_voice_room;
  
  @ProtoField(tag = 12)
  public final FeedLiveComponent feed_live;
  
  @ProtoField(tag = 56)
  public final LoopAvatarWithBtnComponent feed_loop_avatar_with_btn;
  
  @ProtoField(tag = 50)
  public final FeedLoopReplyComponent feed_loop_reply;
  
  @ProtoField(tag = 38)
  public final FeedMixComponent feed_mix;
  
  @ProtoField(tag = 29)
  public final FeedHeadComponent feed_mount;
  
  @ProtoField(tag = 80)
  public final FeedDownloadComponent feed_mount_book;
  
  @ProtoField(tag = 68)
  public final FeedMultiComponent feed_multi_pic;
  
  @ProtoField(tag = 16)
  public final FeedOriginComponent feed_origin;
  
  @ProtoField(tag = 77)
  public final FeedHeadComponent feed_origin_mount;
  
  @ProtoField(tag = 7)
  public final FeedPicComponent feed_pic;
  
  @ProtoField(tag = 35)
  public final FeedPicContentComponent feed_pic_content;
  
  @ProtoField(tag = 52)
  public final FeedPicSingleComponent feed_pic_single;
  
  @ProtoField(tag = 31)
  public final FeedPkComponent feed_pk;
  
  @ProtoField(tag = 22)
  public final PollInfo feed_poll;
  
  @ProtoField(tag = 20)
  public final FeedPostExpose feed_postexpose;
  
  @ProtoField(tag = 27)
  public final FeedPrivateInfoComponent feed_privateinfo;
  
  @ProtoField(tag = 46)
  public final FeedQuestionInfo feed_question_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 18)
  public final List<ThreadRecommendInfo> feed_recomtag;
  
  @ProtoField(tag = 53)
  public final FeedRecomtagStaggeredComponent feed_recomtag_staggered;
  
  @ProtoField(tag = 75)
  public final FeedReplyComponent feed_reply;
  
  @ProtoField(tag = 21)
  public final FeedRoomComponent feed_room;
  
  @ProtoField(tag = 33)
  public final FeedScoreComponent feed_score;
  
  @ProtoField(tag = 65)
  public final PicInfo feed_small_pic;
  
  @ProtoField(tag = 67)
  public final FeedVideoComponent feed_small_video;
  
  @ProtoField(tag = 8)
  public final FeedSocialComponent feed_social;
  
  @ProtoField(tag = 58)
  public final FeedStoreComponent feed_store;
  
  @ProtoField(tag = 70)
  public final FeedTagComponent feed_tag;
  
  @ProtoField(tag = 76)
  public final FeedTextHeadComponent feed_text_head;
  
  @ProtoField(tag = 55)
  public final FeedTipsComponent feed_tips;
  
  @ProtoField(tag = 3)
  public final TitleComponent feed_title;
  
  @ProtoField(tag = 23)
  public final FeedToutiao feed_toutiao;
  
  @ProtoField(tag = 61)
  public final FeedUpdateTipComponent feed_update_tip;
  
  @ProtoField(tag = 63)
  public final FeedUserFold feed_user_fold;
  
  @ProtoField(tag = 9)
  public final FeedVideoComponent feed_video;
  
  @ProtoField(tag = 19)
  public final FeedVideoAdComponent feed_videoad;
  
  @ProtoField(tag = 11)
  public final Voice feed_voice;
  
  @ProtoField(tag = 24)
  public final FrsTopThreadComponent frs_top_thread;
  
  @ProtoField(tag = 47)
  public final FeedSidewayComponent inspiration_sideway;
  
  @ProtoField(tag = 32)
  public final MultiThreadComponent multi_thread_card;
  
  @ProtoField(tag = 34)
  public final SidewayListComponent sideway_list;
  
  @ProtoField(tag = 14)
  public final SidewayRecomComponent sideway_recom;
  
  @ProtoField(tag = 37)
  public final ThreadExtShowComponent thread_ext_show;
  
  public ComponentFactory(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.component;
      if (str == null) {
        this.component = "";
      } else {
        this.component = str;
      } 
      this.feed_title = paramBuilder.feed_title;
      this.feed_abstract = paramBuilder.feed_abstract;
      this.feed_head = paramBuilder.feed_head;
      this.feed_head_figure = paramBuilder.feed_head_figure;
      this.feed_pic = paramBuilder.feed_pic;
      this.feed_social = paramBuilder.feed_social;
      this.feed_video = paramBuilder.feed_video;
      this.feed_entrybar = paramBuilder.feed_entrybar;
      this.feed_voice = paramBuilder.feed_voice;
      this.feed_live = paramBuilder.feed_live;
      str = paramBuilder.base_text;
      if (str == null) {
        this.base_text = "";
      } else {
        this.base_text = str;
      } 
      this.sideway_recom = paramBuilder.sideway_recom;
      this.feed_item = paramBuilder.feed_item;
      this.feed_origin = paramBuilder.feed_origin;
      this.feed_link = paramBuilder.feed_link;
      List<ThreadRecommendInfo> list = paramBuilder.feed_recomtag;
      if (list == null) {
        this.feed_recomtag = DEFAULT_FEED_RECOMTAG;
      } else {
        this.feed_recomtag = Message.immutableCopyOf(list);
      } 
      this.feed_videoad = paramBuilder.feed_videoad;
      this.feed_postexpose = paramBuilder.feed_postexpose;
      this.feed_room = paramBuilder.feed_room;
      this.feed_poll = paramBuilder.feed_poll;
      this.feed_toutiao = paramBuilder.feed_toutiao;
      this.frs_top_thread = paramBuilder.frs_top_thread;
      this.feed_author_social = paramBuilder.feed_author_social;
      this.feed_aichat_card = paramBuilder.feed_aichat_card;
      this.feed_privateinfo = paramBuilder.feed_privateinfo;
      this.feed_configurable_head = paramBuilder.feed_configurable_head;
      this.feed_mount = paramBuilder.feed_mount;
      this.feed_head_loop = paramBuilder.feed_head_loop;
      this.feed_pk = paramBuilder.feed_pk;
      this.multi_thread_card = paramBuilder.multi_thread_card;
      this.feed_score = paramBuilder.feed_score;
      this.sideway_list = paramBuilder.sideway_list;
      this.feed_pic_content = paramBuilder.feed_pic_content;
      this.feed_answer_box = paramBuilder.feed_answer_box;
      this.thread_ext_show = paramBuilder.thread_ext_show;
      this.feed_mix = paramBuilder.feed_mix;
      this.feed_danmaku = paramBuilder.feed_danmaku;
      this.card_head = paramBuilder.card_head;
      this.feed_banner = paramBuilder.feed_banner;
      this.feed_guide_card = paramBuilder.feed_guide_card;
      this.feed_ai_recreation_card = paramBuilder.feed_ai_recreation_card;
      this.feed_feedback_icon_list = paramBuilder.feed_feedback_icon_list;
      this.feed_flip_page = paramBuilder.feed_flip_page;
      this.feed_question_info = paramBuilder.feed_question_info;
      this.inspiration_sideway = paramBuilder.inspiration_sideway;
      this.feed_button = paramBuilder.feed_button;
      this.feed_input_guide = paramBuilder.feed_input_guide;
      this.feed_loop_reply = paramBuilder.feed_loop_reply;
      this.feed_avatar_input = paramBuilder.feed_avatar_input;
      this.feed_pic_single = paramBuilder.feed_pic_single;
      this.feed_recomtag_staggered = paramBuilder.feed_recomtag_staggered;
      this.feed_interaction = paramBuilder.feed_interaction;
      this.feed_tips = paramBuilder.feed_tips;
      this.feed_loop_avatar_with_btn = paramBuilder.feed_loop_avatar_with_btn;
      this.feed_discuss = paramBuilder.feed_discuss;
      this.feed_store = paramBuilder.feed_store;
      this.feed_link_store = paramBuilder.feed_link_store;
      this.feed_horizontal_pic = paramBuilder.feed_horizontal_pic;
      this.feed_update_tip = paramBuilder.feed_update_tip;
      this.feed_link_voice_room = paramBuilder.feed_link_voice_room;
      this.feed_user_fold = paramBuilder.feed_user_fold;
      this.feed_left_post = paramBuilder.feed_left_post;
      this.feed_small_pic = paramBuilder.feed_small_pic;
      this.feed_bottom_ext = paramBuilder.feed_bottom_ext;
      this.feed_small_video = paramBuilder.feed_small_video;
      this.feed_multi_pic = paramBuilder.feed_multi_pic;
      this.feed_interact = paramBuilder.feed_interact;
      this.feed_tag = paramBuilder.feed_tag;
      this.feed_reply = paramBuilder.feed_reply;
      this.feed_text_head = paramBuilder.feed_text_head;
      this.feed_origin_mount = paramBuilder.feed_origin_mount;
      this.feed_download = paramBuilder.feed_download;
      this.feed_dynamic_tag = paramBuilder.feed_dynamic_tag;
      this.feed_mount_book = paramBuilder.feed_mount_book;
    } else {
      this.component = paramBuilder.component;
      this.feed_title = paramBuilder.feed_title;
      this.feed_abstract = paramBuilder.feed_abstract;
      this.feed_head = paramBuilder.feed_head;
      this.feed_head_figure = paramBuilder.feed_head_figure;
      this.feed_pic = paramBuilder.feed_pic;
      this.feed_social = paramBuilder.feed_social;
      this.feed_video = paramBuilder.feed_video;
      this.feed_entrybar = paramBuilder.feed_entrybar;
      this.feed_voice = paramBuilder.feed_voice;
      this.feed_live = paramBuilder.feed_live;
      this.base_text = paramBuilder.base_text;
      this.sideway_recom = paramBuilder.sideway_recom;
      this.feed_item = paramBuilder.feed_item;
      this.feed_origin = paramBuilder.feed_origin;
      this.feed_link = paramBuilder.feed_link;
      this.feed_recomtag = Message.immutableCopyOf(paramBuilder.feed_recomtag);
      this.feed_videoad = paramBuilder.feed_videoad;
      this.feed_postexpose = paramBuilder.feed_postexpose;
      this.feed_room = paramBuilder.feed_room;
      this.feed_poll = paramBuilder.feed_poll;
      this.feed_toutiao = paramBuilder.feed_toutiao;
      this.frs_top_thread = paramBuilder.frs_top_thread;
      this.feed_author_social = paramBuilder.feed_author_social;
      this.feed_aichat_card = paramBuilder.feed_aichat_card;
      this.feed_privateinfo = paramBuilder.feed_privateinfo;
      this.feed_configurable_head = paramBuilder.feed_configurable_head;
      this.feed_mount = paramBuilder.feed_mount;
      this.feed_head_loop = paramBuilder.feed_head_loop;
      this.feed_pk = paramBuilder.feed_pk;
      this.multi_thread_card = paramBuilder.multi_thread_card;
      this.feed_score = paramBuilder.feed_score;
      this.sideway_list = paramBuilder.sideway_list;
      this.feed_pic_content = paramBuilder.feed_pic_content;
      this.feed_answer_box = paramBuilder.feed_answer_box;
      this.thread_ext_show = paramBuilder.thread_ext_show;
      this.feed_mix = paramBuilder.feed_mix;
      this.feed_danmaku = paramBuilder.feed_danmaku;
      this.card_head = paramBuilder.card_head;
      this.feed_banner = paramBuilder.feed_banner;
      this.feed_guide_card = paramBuilder.feed_guide_card;
      this.feed_ai_recreation_card = paramBuilder.feed_ai_recreation_card;
      this.feed_feedback_icon_list = paramBuilder.feed_feedback_icon_list;
      this.feed_flip_page = paramBuilder.feed_flip_page;
      this.feed_question_info = paramBuilder.feed_question_info;
      this.inspiration_sideway = paramBuilder.inspiration_sideway;
      this.feed_button = paramBuilder.feed_button;
      this.feed_input_guide = paramBuilder.feed_input_guide;
      this.feed_loop_reply = paramBuilder.feed_loop_reply;
      this.feed_avatar_input = paramBuilder.feed_avatar_input;
      this.feed_pic_single = paramBuilder.feed_pic_single;
      this.feed_recomtag_staggered = paramBuilder.feed_recomtag_staggered;
      this.feed_interaction = paramBuilder.feed_interaction;
      this.feed_tips = paramBuilder.feed_tips;
      this.feed_loop_avatar_with_btn = paramBuilder.feed_loop_avatar_with_btn;
      this.feed_discuss = paramBuilder.feed_discuss;
      this.feed_store = paramBuilder.feed_store;
      this.feed_link_store = paramBuilder.feed_link_store;
      this.feed_horizontal_pic = paramBuilder.feed_horizontal_pic;
      this.feed_update_tip = paramBuilder.feed_update_tip;
      this.feed_link_voice_room = paramBuilder.feed_link_voice_room;
      this.feed_user_fold = paramBuilder.feed_user_fold;
      this.feed_left_post = paramBuilder.feed_left_post;
      this.feed_small_pic = paramBuilder.feed_small_pic;
      this.feed_bottom_ext = paramBuilder.feed_bottom_ext;
      this.feed_small_video = paramBuilder.feed_small_video;
      this.feed_multi_pic = paramBuilder.feed_multi_pic;
      this.feed_interact = paramBuilder.feed_interact;
      this.feed_tag = paramBuilder.feed_tag;
      this.feed_reply = paramBuilder.feed_reply;
      this.feed_text_head = paramBuilder.feed_text_head;
      this.feed_origin_mount = paramBuilder.feed_origin_mount;
      this.feed_download = paramBuilder.feed_download;
      this.feed_dynamic_tag = paramBuilder.feed_dynamic_tag;
      this.feed_mount_book = paramBuilder.feed_mount_book;
    } 
  }
  
  public static final class Builder extends Message.Builder<ComponentFactory> {
    public String base_text;
    
    public FeedConfigurableHeadComponent card_head;
    
    public String component;
    
    public AbstractComponent feed_abstract;
    
    public FeedAiRecreationCard feed_ai_recreation_card;
    
    public FeedAichatCard feed_aichat_card;
    
    public FeedAnswerBoxComponent feed_answer_box;
    
    public FeedAuthorSocial feed_author_social;
    
    public FeedAvatarInputComponent feed_avatar_input;
    
    public FeedBannerComponent feed_banner;
    
    public FeedHeadComponent feed_bottom_ext;
    
    public FeedButtonComponent feed_button;
    
    public FeedConfigurableHeadComponent feed_configurable_head;
    
    public FeedDanmaku feed_danmaku;
    
    public FeedDiscussComponent feed_discuss;
    
    public FeedDownloadComponent feed_download;
    
    public FeedDynamicTag feed_dynamic_tag;
    
    public FeedEntrybarComponent feed_entrybar;
    
    public ScoreFeedbackComponent feed_feedback_icon_list;
    
    public FeedFlipPage feed_flip_page;
    
    public FeedGuideCardComponent feed_guide_card;
    
    public FeedHeadComponent feed_head;
    
    public FeedHeadFigureComponent feed_head_figure;
    
    public FeedHeadLoopComponent feed_head_loop;
    
    public FeedHorizontalPicComponent feed_horizontal_pic;
    
    public FeedInputGuideComponent feed_input_guide;
    
    public FeedInteractComponent feed_interact;
    
    public FeedInteractionComponent feed_interaction;
    
    public FeedItem feed_item;
    
    public FeedLeftPost feed_left_post;
    
    public FeedLinkComponent feed_link;
    
    public FeedLinkStoreComponent feed_link_store;
    
    public FeedLinkVoiceRoomComponent feed_link_voice_room;
    
    public FeedLiveComponent feed_live;
    
    public LoopAvatarWithBtnComponent feed_loop_avatar_with_btn;
    
    public FeedLoopReplyComponent feed_loop_reply;
    
    public FeedMixComponent feed_mix;
    
    public FeedHeadComponent feed_mount;
    
    public FeedDownloadComponent feed_mount_book;
    
    public FeedMultiComponent feed_multi_pic;
    
    public FeedOriginComponent feed_origin;
    
    public FeedHeadComponent feed_origin_mount;
    
    public FeedPicComponent feed_pic;
    
    public FeedPicContentComponent feed_pic_content;
    
    public FeedPicSingleComponent feed_pic_single;
    
    public FeedPkComponent feed_pk;
    
    public PollInfo feed_poll;
    
    public FeedPostExpose feed_postexpose;
    
    public FeedPrivateInfoComponent feed_privateinfo;
    
    public FeedQuestionInfo feed_question_info;
    
    public List<ThreadRecommendInfo> feed_recomtag;
    
    public FeedRecomtagStaggeredComponent feed_recomtag_staggered;
    
    public FeedReplyComponent feed_reply;
    
    public FeedRoomComponent feed_room;
    
    public FeedScoreComponent feed_score;
    
    public PicInfo feed_small_pic;
    
    public FeedVideoComponent feed_small_video;
    
    public FeedSocialComponent feed_social;
    
    public FeedStoreComponent feed_store;
    
    public FeedTagComponent feed_tag;
    
    public FeedTextHeadComponent feed_text_head;
    
    public FeedTipsComponent feed_tips;
    
    public TitleComponent feed_title;
    
    public FeedToutiao feed_toutiao;
    
    public FeedUpdateTipComponent feed_update_tip;
    
    public FeedUserFold feed_user_fold;
    
    public FeedVideoComponent feed_video;
    
    public FeedVideoAdComponent feed_videoad;
    
    public Voice feed_voice;
    
    public FrsTopThreadComponent frs_top_thread;
    
    public FeedSidewayComponent inspiration_sideway;
    
    public MultiThreadComponent multi_thread_card;
    
    public SidewayListComponent sideway_list;
    
    public SidewayRecomComponent sideway_recom;
    
    public ThreadExtShowComponent thread_ext_show;
    
    public Builder() {}
    
    public Builder(ComponentFactory param1ComponentFactory) {
      super(param1ComponentFactory);
      if (param1ComponentFactory == null)
        return; 
      this.component = param1ComponentFactory.component;
      this.feed_title = param1ComponentFactory.feed_title;
      this.feed_abstract = param1ComponentFactory.feed_abstract;
      this.feed_head = param1ComponentFactory.feed_head;
      this.feed_head_figure = param1ComponentFactory.feed_head_figure;
      this.feed_pic = param1ComponentFactory.feed_pic;
      this.feed_social = param1ComponentFactory.feed_social;
      this.feed_video = param1ComponentFactory.feed_video;
      this.feed_entrybar = param1ComponentFactory.feed_entrybar;
      this.feed_voice = param1ComponentFactory.feed_voice;
      this.feed_live = param1ComponentFactory.feed_live;
      this.base_text = param1ComponentFactory.base_text;
      this.sideway_recom = param1ComponentFactory.sideway_recom;
      this.feed_item = param1ComponentFactory.feed_item;
      this.feed_origin = param1ComponentFactory.feed_origin;
      this.feed_link = param1ComponentFactory.feed_link;
      this.feed_recomtag = Message.copyOf(param1ComponentFactory.feed_recomtag);
      this.feed_videoad = param1ComponentFactory.feed_videoad;
      this.feed_postexpose = param1ComponentFactory.feed_postexpose;
      this.feed_room = param1ComponentFactory.feed_room;
      this.feed_poll = param1ComponentFactory.feed_poll;
      this.feed_toutiao = param1ComponentFactory.feed_toutiao;
      this.frs_top_thread = param1ComponentFactory.frs_top_thread;
      this.feed_author_social = param1ComponentFactory.feed_author_social;
      this.feed_aichat_card = param1ComponentFactory.feed_aichat_card;
      this.feed_privateinfo = param1ComponentFactory.feed_privateinfo;
      this.feed_configurable_head = param1ComponentFactory.feed_configurable_head;
      this.feed_mount = param1ComponentFactory.feed_mount;
      this.feed_head_loop = param1ComponentFactory.feed_head_loop;
      this.feed_pk = param1ComponentFactory.feed_pk;
      this.multi_thread_card = param1ComponentFactory.multi_thread_card;
      this.feed_score = param1ComponentFactory.feed_score;
      this.sideway_list = param1ComponentFactory.sideway_list;
      this.feed_pic_content = param1ComponentFactory.feed_pic_content;
      this.feed_answer_box = param1ComponentFactory.feed_answer_box;
      this.thread_ext_show = param1ComponentFactory.thread_ext_show;
      this.feed_mix = param1ComponentFactory.feed_mix;
      this.feed_danmaku = param1ComponentFactory.feed_danmaku;
      this.card_head = param1ComponentFactory.card_head;
      this.feed_banner = param1ComponentFactory.feed_banner;
      this.feed_guide_card = param1ComponentFactory.feed_guide_card;
      this.feed_ai_recreation_card = param1ComponentFactory.feed_ai_recreation_card;
      this.feed_feedback_icon_list = param1ComponentFactory.feed_feedback_icon_list;
      this.feed_flip_page = param1ComponentFactory.feed_flip_page;
      this.feed_question_info = param1ComponentFactory.feed_question_info;
      this.inspiration_sideway = param1ComponentFactory.inspiration_sideway;
      this.feed_button = param1ComponentFactory.feed_button;
      this.feed_input_guide = param1ComponentFactory.feed_input_guide;
      this.feed_loop_reply = param1ComponentFactory.feed_loop_reply;
      this.feed_avatar_input = param1ComponentFactory.feed_avatar_input;
      this.feed_pic_single = param1ComponentFactory.feed_pic_single;
      this.feed_recomtag_staggered = param1ComponentFactory.feed_recomtag_staggered;
      this.feed_interaction = param1ComponentFactory.feed_interaction;
      this.feed_tips = param1ComponentFactory.feed_tips;
      this.feed_loop_avatar_with_btn = param1ComponentFactory.feed_loop_avatar_with_btn;
      this.feed_discuss = param1ComponentFactory.feed_discuss;
      this.feed_store = param1ComponentFactory.feed_store;
      this.feed_link_store = param1ComponentFactory.feed_link_store;
      this.feed_horizontal_pic = param1ComponentFactory.feed_horizontal_pic;
      this.feed_update_tip = param1ComponentFactory.feed_update_tip;
      this.feed_link_voice_room = param1ComponentFactory.feed_link_voice_room;
      this.feed_user_fold = param1ComponentFactory.feed_user_fold;
      this.feed_left_post = param1ComponentFactory.feed_left_post;
      this.feed_small_pic = param1ComponentFactory.feed_small_pic;
      this.feed_bottom_ext = param1ComponentFactory.feed_bottom_ext;
      this.feed_small_video = param1ComponentFactory.feed_small_video;
      this.feed_multi_pic = param1ComponentFactory.feed_multi_pic;
      this.feed_interact = param1ComponentFactory.feed_interact;
      this.feed_tag = param1ComponentFactory.feed_tag;
      this.feed_reply = param1ComponentFactory.feed_reply;
      this.feed_text_head = param1ComponentFactory.feed_text_head;
      this.feed_origin_mount = param1ComponentFactory.feed_origin_mount;
      this.feed_download = param1ComponentFactory.feed_download;
      this.feed_dynamic_tag = param1ComponentFactory.feed_dynamic_tag;
      this.feed_mount_book = param1ComponentFactory.feed_mount_book;
    }
    
    public ComponentFactory build(boolean param1Boolean) {
      return new ComponentFactory(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
