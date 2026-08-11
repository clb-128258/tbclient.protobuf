package tbclient.PbFloor;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Anti;
import tbclient.CommentPublisherConfig;
import tbclient.FeedKV;
import tbclient.Page;
import tbclient.Post;
import tbclient.SimpleForum;
import tbclient.SubPostList;
import tbclient.TabInfo;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static final Integer DEFAULT_CURRENT_TAB;
  
  public static final Integer DEFAULT_IS_BLACK_WHITE;
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final Integer DEFAULT_SERVER_TIME;
  
  public static final List<SubPostList> DEFAULT_SUBPOST_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_SUBPOST_NUM;
  
  public static final List<TabInfo> DEFAULT_TAB_INFO;
  
  @ProtoField(tag = 2)
  public final Anti anti;
  
  @ProtoField(tag = 12)
  public final CommentPublisherConfig comment_publisher_config;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT32)
  public final Integer current_tab;
  
  @ProtoField(tag = 8)
  public final SimpleForum display_forum;
  
  @ProtoField(tag = 6)
  public final SimpleForum forum;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer is_black_white;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 10)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 1)
  public final Page page;
  
  @ProtoField(tag = 3)
  public final Post post;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer server_time;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<SubPostList> subpost_list;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer subpost_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 14)
  public final List<TabInfo> tab_info;
  
  @ProtoField(tag = 5)
  public final ThreadInfo thread;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SERVER_TIME = integer;
    DEFAULT_IS_BLACK_WHITE = integer;
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_SUBPOST_NUM = integer;
    DEFAULT_TAB_INFO = Collections.emptyList();
    DEFAULT_CURRENT_TAB = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.page = paramBuilder.page;
      this.anti = paramBuilder.anti;
      this.post = paramBuilder.post;
      List<SubPostList> list2 = paramBuilder.subpost_list;
      if (list2 == null) {
        this.subpost_list = DEFAULT_SUBPOST_LIST;
      } else {
        this.subpost_list = Message.immutableCopyOf(list2);
      } 
      this.thread = paramBuilder.thread;
      this.forum = paramBuilder.forum;
      Integer integer2 = paramBuilder.server_time;
      if (integer2 == null) {
        this.server_time = DEFAULT_SERVER_TIME;
      } else {
        this.server_time = integer2;
      } 
      this.display_forum = paramBuilder.display_forum;
      integer2 = paramBuilder.is_black_white;
      if (integer2 == null) {
        this.is_black_white = DEFAULT_IS_BLACK_WHITE;
      } else {
        this.is_black_white = integer2;
      } 
      List<FeedKV> list1 = paramBuilder.log_param;
      if (list1 == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list1);
      } 
      this.comment_publisher_config = paramBuilder.comment_publisher_config;
      Integer integer1 = paramBuilder.subpost_num;
      if (integer1 == null) {
        this.subpost_num = DEFAULT_SUBPOST_NUM;
      } else {
        this.subpost_num = integer1;
      } 
      List<TabInfo> list = paramBuilder.tab_info;
      if (list == null) {
        this.tab_info = DEFAULT_TAB_INFO;
      } else {
        this.tab_info = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.current_tab;
      if (integer == null) {
        this.current_tab = DEFAULT_CURRENT_TAB;
      } else {
        this.current_tab = integer;
      } 
    } else {
      this.page = ((Builder)integer).page;
      this.anti = ((Builder)integer).anti;
      this.post = ((Builder)integer).post;
      this.subpost_list = Message.immutableCopyOf(((Builder)integer).subpost_list);
      this.thread = ((Builder)integer).thread;
      this.forum = ((Builder)integer).forum;
      this.server_time = ((Builder)integer).server_time;
      this.display_forum = ((Builder)integer).display_forum;
      this.is_black_white = ((Builder)integer).is_black_white;
      this.log_param = Message.immutableCopyOf(((Builder)integer).log_param);
      this.comment_publisher_config = ((Builder)integer).comment_publisher_config;
      this.subpost_num = ((Builder)integer).subpost_num;
      this.tab_info = Message.immutableCopyOf(((Builder)integer).tab_info);
      this.current_tab = ((Builder)integer).current_tab;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Anti anti;
    
    public CommentPublisherConfig comment_publisher_config;
    
    public Integer current_tab;
    
    public SimpleForum display_forum;
    
    public SimpleForum forum;
    
    public Integer is_black_white;
    
    public List<FeedKV> log_param;
    
    public Page page;
    
    public Post post;
    
    public Integer server_time;
    
    public List<SubPostList> subpost_list;
    
    public Integer subpost_num;
    
    public List<TabInfo> tab_info;
    
    public ThreadInfo thread;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.page = param1DataRes.page;
      this.anti = param1DataRes.anti;
      this.post = param1DataRes.post;
      this.subpost_list = Message.copyOf(param1DataRes.subpost_list);
      this.thread = param1DataRes.thread;
      this.forum = param1DataRes.forum;
      this.server_time = param1DataRes.server_time;
      this.display_forum = param1DataRes.display_forum;
      this.is_black_white = param1DataRes.is_black_white;
      this.log_param = Message.copyOf(param1DataRes.log_param);
      this.comment_publisher_config = param1DataRes.comment_publisher_config;
      this.subpost_num = param1DataRes.subpost_num;
      this.tab_info = Message.copyOf(param1DataRes.tab_info);
      this.current_tab = param1DataRes.current_tab;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
