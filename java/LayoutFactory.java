package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class LayoutFactory extends Message {
  public static final List<FeedKV> DEFAULT_FREQ_INFO = Collections.emptyList();
  
  public static final String DEFAULT_LAYOUT = "";
  
  @ProtoField(tag = 19)
  public final BannerCardLayout banner_card;
  
  @ProtoField(tag = 21)
  public final FeedbackCardLayout bawu_feedback_card;
  
  @ProtoField(tag = 10)
  public final CardFrequency card_click_frequency;
  
  @ProtoField(tag = 9)
  public final CardFrequency card_expose_frequency;
  
  @ProtoField(tag = 24)
  public final DiscussLayout discuss_card;
  
  @ProtoField(tag = 6)
  public final VideoDoubleRowLayout double_row_video;
  
  @ProtoField(tag = 2)
  public final FeedLayout feed;
  
  @ProtoField(tag = 23)
  public final FeedStaggerLayout feed_stagger_layout;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 16)
  public final List<FeedKV> freq_info;
  
  @ProtoField(tag = 25)
  public final FrsOfficialRecomLayout frs_official_recom_card;
  
  @ProtoField(tag = 5)
  public final FrsTopThreadCardLayout frs_top_thread_card;
  
  @ProtoField(tag = 20)
  public final GuideCardLayout guide_card;
  
  @ProtoField(tag = 4)
  public final HeadcardLayout headcard;
  
  @ProtoField(tag = 11)
  public final HotCardLayout hot_card;
  
  @ProtoField(tag = 17)
  public final HotTopicCardLayout hot_topic_card;
  
  @ProtoField(tag = 18)
  public final InspirationTopicCardLayout inspiration_topic_card;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String layout;
  
  @ProtoField(tag = 12)
  public final MultiThreadCardLayout multi_thread_card;
  
  @ProtoField(tag = 22)
  public final QuestionCard question_card;
  
  @ProtoField(tag = 3)
  public final SidewayLayout sideway;
  
  @ProtoField(tag = 26)
  public final SideWayFeedLayout sideway_feed;
  
  @ProtoField(tag = 15)
  public final SidewayLayout sideway_vertical;
  
  @ProtoField(tag = 7)
  public final PlaceholderLayout template_stub_hot_card;
  
  @ProtoField(tag = 13)
  public final PlaceholderLayout template_stub_hot_forum_group;
  
  @ProtoField(tag = 14)
  public final PlaceholderLayout template_stub_interest_card;
  
  @ProtoField(tag = 8)
  public final PlaceholderLayout template_stub_recommend_forums;
  
  public LayoutFactory(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.layout;
      if (str == null) {
        this.layout = "";
      } else {
        this.layout = str;
      } 
      this.feed = paramBuilder.feed;
      this.sideway = paramBuilder.sideway;
      this.headcard = paramBuilder.headcard;
      this.frs_top_thread_card = paramBuilder.frs_top_thread_card;
      this.double_row_video = paramBuilder.double_row_video;
      this.template_stub_hot_card = paramBuilder.template_stub_hot_card;
      this.template_stub_recommend_forums = paramBuilder.template_stub_recommend_forums;
      this.card_expose_frequency = paramBuilder.card_expose_frequency;
      this.card_click_frequency = paramBuilder.card_click_frequency;
      this.hot_card = paramBuilder.hot_card;
      this.multi_thread_card = paramBuilder.multi_thread_card;
      this.template_stub_hot_forum_group = paramBuilder.template_stub_hot_forum_group;
      this.template_stub_interest_card = paramBuilder.template_stub_interest_card;
      this.sideway_vertical = paramBuilder.sideway_vertical;
      List<FeedKV> list = paramBuilder.freq_info;
      if (list == null) {
        this.freq_info = DEFAULT_FREQ_INFO;
      } else {
        this.freq_info = Message.immutableCopyOf(list);
      } 
      this.hot_topic_card = paramBuilder.hot_topic_card;
      this.inspiration_topic_card = paramBuilder.inspiration_topic_card;
      this.banner_card = paramBuilder.banner_card;
      this.guide_card = paramBuilder.guide_card;
      this.bawu_feedback_card = paramBuilder.bawu_feedback_card;
      this.question_card = paramBuilder.question_card;
      this.feed_stagger_layout = paramBuilder.feed_stagger_layout;
      this.discuss_card = paramBuilder.discuss_card;
      this.frs_official_recom_card = paramBuilder.frs_official_recom_card;
      this.sideway_feed = paramBuilder.sideway_feed;
    } else {
      this.layout = paramBuilder.layout;
      this.feed = paramBuilder.feed;
      this.sideway = paramBuilder.sideway;
      this.headcard = paramBuilder.headcard;
      this.frs_top_thread_card = paramBuilder.frs_top_thread_card;
      this.double_row_video = paramBuilder.double_row_video;
      this.template_stub_hot_card = paramBuilder.template_stub_hot_card;
      this.template_stub_recommend_forums = paramBuilder.template_stub_recommend_forums;
      this.card_expose_frequency = paramBuilder.card_expose_frequency;
      this.card_click_frequency = paramBuilder.card_click_frequency;
      this.hot_card = paramBuilder.hot_card;
      this.multi_thread_card = paramBuilder.multi_thread_card;
      this.template_stub_hot_forum_group = paramBuilder.template_stub_hot_forum_group;
      this.template_stub_interest_card = paramBuilder.template_stub_interest_card;
      this.sideway_vertical = paramBuilder.sideway_vertical;
      this.freq_info = Message.immutableCopyOf(paramBuilder.freq_info);
      this.hot_topic_card = paramBuilder.hot_topic_card;
      this.inspiration_topic_card = paramBuilder.inspiration_topic_card;
      this.banner_card = paramBuilder.banner_card;
      this.guide_card = paramBuilder.guide_card;
      this.bawu_feedback_card = paramBuilder.bawu_feedback_card;
      this.question_card = paramBuilder.question_card;
      this.feed_stagger_layout = paramBuilder.feed_stagger_layout;
      this.discuss_card = paramBuilder.discuss_card;
      this.frs_official_recom_card = paramBuilder.frs_official_recom_card;
      this.sideway_feed = paramBuilder.sideway_feed;
    } 
  }
  
  public static final class Builder extends Message.Builder<LayoutFactory> {
    public BannerCardLayout banner_card;
    
    public FeedbackCardLayout bawu_feedback_card;
    
    public CardFrequency card_click_frequency;
    
    public CardFrequency card_expose_frequency;
    
    public DiscussLayout discuss_card;
    
    public VideoDoubleRowLayout double_row_video;
    
    public FeedLayout feed;
    
    public FeedStaggerLayout feed_stagger_layout;
    
    public List<FeedKV> freq_info;
    
    public FrsOfficialRecomLayout frs_official_recom_card;
    
    public FrsTopThreadCardLayout frs_top_thread_card;
    
    public GuideCardLayout guide_card;
    
    public HeadcardLayout headcard;
    
    public HotCardLayout hot_card;
    
    public HotTopicCardLayout hot_topic_card;
    
    public InspirationTopicCardLayout inspiration_topic_card;
    
    public String layout;
    
    public MultiThreadCardLayout multi_thread_card;
    
    public QuestionCard question_card;
    
    public SidewayLayout sideway;
    
    public SideWayFeedLayout sideway_feed;
    
    public SidewayLayout sideway_vertical;
    
    public PlaceholderLayout template_stub_hot_card;
    
    public PlaceholderLayout template_stub_hot_forum_group;
    
    public PlaceholderLayout template_stub_interest_card;
    
    public PlaceholderLayout template_stub_recommend_forums;
    
    public Builder() {}
    
    public Builder(LayoutFactory param1LayoutFactory) {
      super(param1LayoutFactory);
      if (param1LayoutFactory == null)
        return; 
      this.layout = param1LayoutFactory.layout;
      this.feed = param1LayoutFactory.feed;
      this.sideway = param1LayoutFactory.sideway;
      this.headcard = param1LayoutFactory.headcard;
      this.frs_top_thread_card = param1LayoutFactory.frs_top_thread_card;
      this.double_row_video = param1LayoutFactory.double_row_video;
      this.template_stub_hot_card = param1LayoutFactory.template_stub_hot_card;
      this.template_stub_recommend_forums = param1LayoutFactory.template_stub_recommend_forums;
      this.card_expose_frequency = param1LayoutFactory.card_expose_frequency;
      this.card_click_frequency = param1LayoutFactory.card_click_frequency;
      this.hot_card = param1LayoutFactory.hot_card;
      this.multi_thread_card = param1LayoutFactory.multi_thread_card;
      this.template_stub_hot_forum_group = param1LayoutFactory.template_stub_hot_forum_group;
      this.template_stub_interest_card = param1LayoutFactory.template_stub_interest_card;
      this.sideway_vertical = param1LayoutFactory.sideway_vertical;
      this.freq_info = Message.copyOf(param1LayoutFactory.freq_info);
      this.hot_topic_card = param1LayoutFactory.hot_topic_card;
      this.inspiration_topic_card = param1LayoutFactory.inspiration_topic_card;
      this.banner_card = param1LayoutFactory.banner_card;
      this.guide_card = param1LayoutFactory.guide_card;
      this.bawu_feedback_card = param1LayoutFactory.bawu_feedback_card;
      this.question_card = param1LayoutFactory.question_card;
      this.feed_stagger_layout = param1LayoutFactory.feed_stagger_layout;
      this.discuss_card = param1LayoutFactory.discuss_card;
      this.frs_official_recom_card = param1LayoutFactory.frs_official_recom_card;
      this.sideway_feed = param1LayoutFactory.sideway_feed;
    }
    
    public LayoutFactory build(boolean param1Boolean) {
      return new LayoutFactory(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
