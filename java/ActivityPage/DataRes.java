package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BannerImage;
import tbclient.FeedKV;
import tbclient.Page;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static final List<BannerImage> DEFAULT_BANNER_IMAGE = Collections.emptyList();
  
  public static final List<BannerImage> DEFAULT_GRID = Collections.emptyList();
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<BannerImage> banner_image;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<BannerImage> grid;
  
  @ProtoField(tag = 4)
  public final HotTopic hot_topic;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 9)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 8)
  public final Page page_info;
  
  @ProtoField(tag = 6)
  public final RecommendForumList recommend_forum;
  
  @ProtoField(tag = 7)
  public final RecommendUserList recommend_user;
  
  @ProtoField(tag = 5)
  public final SpecialColumnList special_column;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ThreadInfo> thread_list;
  
  static {
    DEFAULT_LOG_PARAM = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      List<BannerImage> list2 = paramBuilder.banner_image;
      if (list2 == null) {
        this.banner_image = DEFAULT_BANNER_IMAGE;
      } else {
        this.banner_image = Message.immutableCopyOf(list2);
      } 
      list2 = paramBuilder.grid;
      if (list2 == null) {
        this.grid = DEFAULT_GRID;
      } else {
        this.grid = Message.immutableCopyOf(list2);
      } 
      List<ThreadInfo> list1 = paramBuilder.thread_list;
      if (list1 == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list1);
      } 
      this.hot_topic = paramBuilder.hot_topic;
      this.special_column = paramBuilder.special_column;
      this.recommend_forum = paramBuilder.recommend_forum;
      this.recommend_user = paramBuilder.recommend_user;
      this.page_info = paramBuilder.page_info;
      list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
    } else {
      this.banner_image = Message.immutableCopyOf(((Builder)list).banner_image);
      this.grid = Message.immutableCopyOf(((Builder)list).grid);
      this.thread_list = Message.immutableCopyOf(((Builder)list).thread_list);
      this.hot_topic = ((Builder)list).hot_topic;
      this.special_column = ((Builder)list).special_column;
      this.recommend_forum = ((Builder)list).recommend_forum;
      this.recommend_user = ((Builder)list).recommend_user;
      this.page_info = ((Builder)list).page_info;
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<BannerImage> banner_image;
    
    public List<BannerImage> grid;
    
    public HotTopic hot_topic;
    
    public List<FeedKV> log_param;
    
    public Page page_info;
    
    public RecommendForumList recommend_forum;
    
    public RecommendUserList recommend_user;
    
    public SpecialColumnList special_column;
    
    public List<ThreadInfo> thread_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.banner_image = Message.copyOf(param1DataRes.banner_image);
      this.grid = Message.copyOf(param1DataRes.grid);
      this.thread_list = Message.copyOf(param1DataRes.thread_list);
      this.hot_topic = param1DataRes.hot_topic;
      this.special_column = param1DataRes.special_column;
      this.recommend_forum = param1DataRes.recommend_forum;
      this.recommend_user = param1DataRes.recommend_user;
      this.page_info = param1DataRes.page_info;
      this.log_param = Message.copyOf(param1DataRes.log_param);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
