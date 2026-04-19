package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class BannerList extends Message {
  public static final List<App> DEFAULT_APP = Collections.emptyList();
  
  public static final String DEFAULT_APPLIST = "";
  
  public static final List<App> DEFAULT_COMMENT_GAME_AD;
  
  public static final List<FeedForumInfo> DEFAULT_FEED_FORUM = Collections.emptyList();
  
  public static final List<App> DEFAULT_VIDEO_RECOMMEND_AD = Collections.emptyList();
  
  @ProtoField(tag = 8)
  public final AdAuditInfo ad_audit_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<App> app;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String applist;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<App> comment_game_ad;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedForumInfo> feed_forum;
  
  @ProtoField(tag = 3)
  public final RecomTopicInfo hot_topic;
  
  @ProtoField(tag = 5)
  public final App pb_banner_ad;
  
  @ProtoField(tag = 9)
  public final AdAuditInfo pb_banner_ad_audit_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<App> video_recommend_ad;
  
  static {
    DEFAULT_COMMENT_GAME_AD = Collections.emptyList();
  }
  
  public BannerList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<App> list2 = paramBuilder.app;
      if (list2 == null) {
        this.app = DEFAULT_APP;
      } else {
        this.app = Message.immutableCopyOf(list2);
      } 
      List<FeedForumInfo> list = paramBuilder.feed_forum;
      if (list == null) {
        this.feed_forum = DEFAULT_FEED_FORUM;
      } else {
        this.feed_forum = Message.immutableCopyOf(list);
      } 
      this.hot_topic = paramBuilder.hot_topic;
      String str = paramBuilder.applist;
      if (str == null) {
        this.applist = "";
      } else {
        this.applist = str;
      } 
      this.pb_banner_ad = paramBuilder.pb_banner_ad;
      List<App> list1 = paramBuilder.video_recommend_ad;
      if (list1 == null) {
        this.video_recommend_ad = DEFAULT_VIDEO_RECOMMEND_AD;
      } else {
        this.video_recommend_ad = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.comment_game_ad;
      if (list1 == null) {
        this.comment_game_ad = DEFAULT_COMMENT_GAME_AD;
      } else {
        this.comment_game_ad = Message.immutableCopyOf(list1);
      } 
      this.ad_audit_info = paramBuilder.ad_audit_info;
      this.pb_banner_ad_audit_info = paramBuilder.pb_banner_ad_audit_info;
    } else {
      this.app = Message.immutableCopyOf(paramBuilder.app);
      this.feed_forum = Message.immutableCopyOf(paramBuilder.feed_forum);
      this.hot_topic = paramBuilder.hot_topic;
      this.applist = paramBuilder.applist;
      this.pb_banner_ad = paramBuilder.pb_banner_ad;
      this.video_recommend_ad = Message.immutableCopyOf(paramBuilder.video_recommend_ad);
      this.comment_game_ad = Message.immutableCopyOf(paramBuilder.comment_game_ad);
      this.ad_audit_info = paramBuilder.ad_audit_info;
      this.pb_banner_ad_audit_info = paramBuilder.pb_banner_ad_audit_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<BannerList> {
    public AdAuditInfo ad_audit_info;
    
    public List<App> app;
    
    public String applist;
    
    public List<App> comment_game_ad;
    
    public List<FeedForumInfo> feed_forum;
    
    public RecomTopicInfo hot_topic;
    
    public App pb_banner_ad;
    
    public AdAuditInfo pb_banner_ad_audit_info;
    
    public List<App> video_recommend_ad;
    
    public Builder() {}
    
    public Builder(BannerList param1BannerList) {
      super(param1BannerList);
      if (param1BannerList == null)
        return; 
      this.app = Message.copyOf(param1BannerList.app);
      this.feed_forum = Message.copyOf(param1BannerList.feed_forum);
      this.hot_topic = param1BannerList.hot_topic;
      this.applist = param1BannerList.applist;
      this.pb_banner_ad = param1BannerList.pb_banner_ad;
      this.video_recommend_ad = Message.copyOf(param1BannerList.video_recommend_ad);
      this.comment_game_ad = Message.copyOf(param1BannerList.comment_game_ad);
      this.ad_audit_info = param1BannerList.ad_audit_info;
      this.pb_banner_ad_audit_info = param1BannerList.pb_banner_ad_audit_info;
    }
    
    public BannerList build(boolean param1Boolean) {
      return new BannerList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
