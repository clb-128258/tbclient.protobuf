package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class HistoryForumInfo extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final Integer DEFAULT_DAY_THREAD_NUM;
  
  public static final String DEFAULT_FIRST_CATEGORY = "";
  
  public static final Integer DEFAULT_FOLLOW_NUM;
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Boolean DEFAULT_HAS_POSTPRE;
  
  public static final Integer DEFAULT_HOT_NUM;
  
  public static final Integer DEFAULT_IS_FORBIDDEN;
  
  public static final Integer DEFAULT_IS_FORUM_BUSINESS_ACCOUNT;
  
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final Integer DEFAULT_IS_LIVEFORUM;
  
  public static final Integer DEFAULT_IS_OFFICIAL_FORUM;
  
  public static final Integer DEFAULT_LEVEL_ID;
  
  public static final Boolean DEFAULT_NEED_TRANS;
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final List<FrsTabInfo> DEFAULT_TAB_INFO;
  
  public static final Integer DEFAULT_THREAD_NUM;
  
  public static final Integer DEFAULT_UNREAD_NUM;
  
  public static final String DEFAULT_VISIT_TIME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 14)
  public final BlockPopInfo block_pop_info;
  
  @ProtoField(tag = 24, type = Message.Datatype.INT32)
  public final Integer day_thread_num;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String first_category;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer follow_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 18, type = Message.Datatype.BOOL)
  public final Boolean has_postpre;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT32)
  public final Integer hot_num;
  
  @ProtoField(tag = 27, type = Message.Datatype.UINT32)
  public final Integer is_forbidden;
  
  @ProtoField(tag = 20, type = Message.Datatype.INT32)
  public final Integer is_forum_business_account;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer is_like;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_liveforum;
  
  @ProtoField(tag = 28, type = Message.Datatype.INT32)
  public final Integer is_official_forum;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer level_id;
  
  @ProtoField(tag = 10, type = Message.Datatype.BOOL)
  public final Boolean need_trans;
  
  @ProtoField(tag = 26, type = Message.Datatype.INT32)
  public final Integer post_num;
  
  @ProtoField(tag = 19)
  public final PostPrefix post_prefix;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 17)
  public final List<FrsTabInfo> tab_info;
  
  @ProtoField(tag = 21)
  public final RecomTagInfo tag_info;
  
  @ProtoField(tag = 8)
  public final ThemeColorInfo theme_color;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT32)
  public final Integer thread_num;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer unread_num;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String visit_time;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LIVEFORUM = integer;
    DEFAULT_UNREAD_NUM = integer;
    DEFAULT_FOLLOW_NUM = integer;
    DEFAULT_NEED_TRANS = Boolean.FALSE;
    DEFAULT_HOT_NUM = integer;
    DEFAULT_LEVEL_ID = integer;
    DEFAULT_TAB_INFO = Collections.emptyList();
    DEFAULT_HAS_POSTPRE = Boolean.FALSE;
    DEFAULT_IS_FORUM_BUSINESS_ACCOUNT = integer;
    DEFAULT_IS_LIKE = integer;
    DEFAULT_DAY_THREAD_NUM = integer;
    DEFAULT_THREAD_NUM = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_IS_FORBIDDEN = integer;
    DEFAULT_IS_OFFICIAL_FORUM = integer;
  }
  
  public HistoryForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      String str3 = paramBuilder.forum_name;
      if (str3 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str3;
      } 
      str3 = paramBuilder.avatar;
      if (str3 == null) {
        this.avatar = "";
      } else {
        this.avatar = str3;
      } 
      Integer integer5 = paramBuilder.is_liveforum;
      if (integer5 == null) {
        this.is_liveforum = DEFAULT_IS_LIVEFORUM;
      } else {
        this.is_liveforum = integer5;
      } 
      integer5 = paramBuilder.unread_num;
      if (integer5 == null) {
        this.unread_num = DEFAULT_UNREAD_NUM;
      } else {
        this.unread_num = integer5;
      } 
      String str2 = paramBuilder.visit_time;
      if (str2 == null) {
        this.visit_time = "";
      } else {
        this.visit_time = str2;
      } 
      Integer integer4 = paramBuilder.follow_num;
      if (integer4 == null) {
        this.follow_num = DEFAULT_FOLLOW_NUM;
      } else {
        this.follow_num = integer4;
      } 
      this.theme_color = paramBuilder.theme_color;
      Boolean bool2 = paramBuilder.need_trans;
      if (bool2 == null) {
        this.need_trans = DEFAULT_NEED_TRANS;
      } else {
        this.need_trans = bool2;
      } 
      this.block_pop_info = paramBuilder.block_pop_info;
      Integer integer3 = paramBuilder.hot_num;
      if (integer3 == null) {
        this.hot_num = DEFAULT_HOT_NUM;
      } else {
        this.hot_num = integer3;
      } 
      integer3 = paramBuilder.level_id;
      if (integer3 == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = integer3;
      } 
      List<FrsTabInfo> list = paramBuilder.tab_info;
      if (list == null) {
        this.tab_info = DEFAULT_TAB_INFO;
      } else {
        this.tab_info = Message.immutableCopyOf(list);
      } 
      Boolean bool1 = paramBuilder.has_postpre;
      if (bool1 == null) {
        this.has_postpre = DEFAULT_HAS_POSTPRE;
      } else {
        this.has_postpre = bool1;
      } 
      this.post_prefix = paramBuilder.post_prefix;
      Integer integer2 = paramBuilder.is_forum_business_account;
      if (integer2 == null) {
        this.is_forum_business_account = DEFAULT_IS_FORUM_BUSINESS_ACCOUNT;
      } else {
        this.is_forum_business_account = integer2;
      } 
      this.tag_info = paramBuilder.tag_info;
      String str1 = paramBuilder.first_category;
      if (str1 == null) {
        this.first_category = "";
      } else {
        this.first_category = str1;
      } 
      Integer integer1 = paramBuilder.is_like;
      if (integer1 == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer1;
      } 
      integer1 = paramBuilder.day_thread_num;
      if (integer1 == null) {
        this.day_thread_num = DEFAULT_DAY_THREAD_NUM;
      } else {
        this.day_thread_num = integer1;
      } 
      integer1 = paramBuilder.thread_num;
      if (integer1 == null) {
        this.thread_num = DEFAULT_THREAD_NUM;
      } else {
        this.thread_num = integer1;
      } 
      integer1 = paramBuilder.post_num;
      if (integer1 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer1;
      } 
      integer1 = paramBuilder.is_forbidden;
      if (integer1 == null) {
        this.is_forbidden = DEFAULT_IS_FORBIDDEN;
      } else {
        this.is_forbidden = integer1;
      } 
      integer = paramBuilder.is_official_forum;
      if (integer == null) {
        this.is_official_forum = DEFAULT_IS_OFFICIAL_FORUM;
      } else {
        this.is_official_forum = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.avatar = ((Builder)integer).avatar;
      this.is_liveforum = ((Builder)integer).is_liveforum;
      this.unread_num = ((Builder)integer).unread_num;
      this.visit_time = ((Builder)integer).visit_time;
      this.follow_num = ((Builder)integer).follow_num;
      this.theme_color = ((Builder)integer).theme_color;
      this.need_trans = ((Builder)integer).need_trans;
      this.block_pop_info = ((Builder)integer).block_pop_info;
      this.hot_num = ((Builder)integer).hot_num;
      this.level_id = ((Builder)integer).level_id;
      this.tab_info = Message.immutableCopyOf(((Builder)integer).tab_info);
      this.has_postpre = ((Builder)integer).has_postpre;
      this.post_prefix = ((Builder)integer).post_prefix;
      this.is_forum_business_account = ((Builder)integer).is_forum_business_account;
      this.tag_info = ((Builder)integer).tag_info;
      this.first_category = ((Builder)integer).first_category;
      this.is_like = ((Builder)integer).is_like;
      this.day_thread_num = ((Builder)integer).day_thread_num;
      this.thread_num = ((Builder)integer).thread_num;
      this.post_num = ((Builder)integer).post_num;
      this.is_forbidden = ((Builder)integer).is_forbidden;
      this.is_official_forum = ((Builder)integer).is_official_forum;
    } 
  }
  
  public static final class Builder extends Message.Builder<HistoryForumInfo> {
    public String avatar;
    
    public BlockPopInfo block_pop_info;
    
    public Integer day_thread_num;
    
    public String first_category;
    
    public Integer follow_num;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Boolean has_postpre;
    
    public Integer hot_num;
    
    public Integer is_forbidden;
    
    public Integer is_forum_business_account;
    
    public Integer is_like;
    
    public Integer is_liveforum;
    
    public Integer is_official_forum;
    
    public Integer level_id;
    
    public Boolean need_trans;
    
    public Integer post_num;
    
    public PostPrefix post_prefix;
    
    public List<FrsTabInfo> tab_info;
    
    public RecomTagInfo tag_info;
    
    public ThemeColorInfo theme_color;
    
    public Integer thread_num;
    
    public Integer unread_num;
    
    public String visit_time;
    
    public Builder() {}
    
    public Builder(HistoryForumInfo param1HistoryForumInfo) {
      super(param1HistoryForumInfo);
      if (param1HistoryForumInfo == null)
        return; 
      this.forum_id = param1HistoryForumInfo.forum_id;
      this.forum_name = param1HistoryForumInfo.forum_name;
      this.avatar = param1HistoryForumInfo.avatar;
      this.is_liveforum = param1HistoryForumInfo.is_liveforum;
      this.unread_num = param1HistoryForumInfo.unread_num;
      this.visit_time = param1HistoryForumInfo.visit_time;
      this.follow_num = param1HistoryForumInfo.follow_num;
      this.theme_color = param1HistoryForumInfo.theme_color;
      this.need_trans = param1HistoryForumInfo.need_trans;
      this.block_pop_info = param1HistoryForumInfo.block_pop_info;
      this.hot_num = param1HistoryForumInfo.hot_num;
      this.level_id = param1HistoryForumInfo.level_id;
      this.tab_info = Message.copyOf(param1HistoryForumInfo.tab_info);
      this.has_postpre = param1HistoryForumInfo.has_postpre;
      this.post_prefix = param1HistoryForumInfo.post_prefix;
      this.is_forum_business_account = param1HistoryForumInfo.is_forum_business_account;
      this.tag_info = param1HistoryForumInfo.tag_info;
      this.first_category = param1HistoryForumInfo.first_category;
      this.is_like = param1HistoryForumInfo.is_like;
      this.day_thread_num = param1HistoryForumInfo.day_thread_num;
      this.thread_num = param1HistoryForumInfo.thread_num;
      this.post_num = param1HistoryForumInfo.post_num;
      this.is_forbidden = param1HistoryForumInfo.is_forbidden;
      this.is_official_forum = param1HistoryForumInfo.is_official_forum;
    }
    
    public HistoryForumInfo build(boolean param1Boolean) {
      return new HistoryForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
