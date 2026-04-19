package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RecommendForumInfo extends Message {
  public static final String DEFAULT_ABTEST_TAG = "";
  
  public static final String DEFAULT_AUTHEN = "";
  
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_AVATAR_ORIGIN = "";
  
  public static final List<PbContent> DEFAULT_CONTENT;
  
  public static final Integer DEFAULT_DAY_THREAD_NUM;
  
  public static final String DEFAULT_EXTRA = "";
  
  public static final String DEFAULT_FIRST_CATEGORY = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_FORUM_TYPE;
  
  public static final Integer DEFAULT_HAS_POSTPRE;
  
  public static final Integer DEFAULT_HOT_NUM;
  
  public static final String DEFAULT_HOT_TEXT = "";
  
  public static final Long DEFAULT_HOT_THREAD_ID;
  
  public static final Integer DEFAULT_IS_BRAND_FORUM;
  
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final Integer DEFAULT_IS_PRIVATE_FORUM;
  
  public static final Integer DEFAULT_IS_RECOMMEND_FORUM;
  
  public static final Integer DEFAULT_IS_SIGN;
  
  public static final Integer DEFAULT_LEVEL_ID;
  
  public static final String DEFAULT_LV1_NAME = "";
  
  public static final String DEFAULT_LV2_NAME = "";
  
  public static final Integer DEFAULT_MEMBER_COUNT;
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final String DEFAULT_RECOM_REASON = "";
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final String DEFAULT_SLOGAN = "";
  
  public static final String DEFAULT_SOURCE = "";
  
  public static final List<FrsTabInfo> DEFAULT_TAB_INFO;
  
  public static final List<String> DEFAULT_TAG_LIST;
  
  public static final Integer DEFAULT_THREAD_COUNT;
  
  public static final Integer DEFAULT_THREAD_NUM;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String abtest_tag;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String authen;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String avatar_origin;
  
  @ProtoField(tag = 28)
  public final BlockPopInfo block_pop_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<PbContent> content;
  
  @ProtoField(tag = 27, type = Message.Datatype.UINT32)
  public final Integer day_thread_num;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String extra;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String first_category;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer forum_type;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT32)
  public final Integer has_postpre;
  
  @ProtoField(tag = 21, type = Message.Datatype.INT32)
  public final Integer hot_num;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String hot_text;
  
  @ProtoField(tag = 22, type = Message.Datatype.UINT64)
  public final Long hot_thread_id;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer is_brand_forum;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer is_like;
  
  @ProtoField(tag = 17, type = Message.Datatype.UINT32)
  public final Integer is_private_forum;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer is_recommend_forum;
  
  @ProtoField(tag = 33, type = Message.Datatype.UINT32)
  public final Integer is_sign;
  
  @ProtoField(tag = 35)
  public final LabelInfo label_info;
  
  @ProtoField(tag = 30, type = Message.Datatype.INT32)
  public final Integer level_id;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String lv1_name;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String lv2_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer member_count;
  
  @ProtoField(tag = 32, type = Message.Datatype.INT32)
  public final Integer post_num;
  
  @ProtoField(tag = 24)
  public final PostPrefix post_prefix;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String recom_reason;
  
  @ProtoField(tag = 34, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String slogan;
  
  @ProtoField(tag = 36)
  public final ThemeColorInfo smart_color;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String source;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 26)
  public final List<FrsTabInfo> tab_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 37, type = Message.Datatype.STRING)
  public final List<String> tag_list;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer thread_count;
  
  @ProtoField(tag = 31, type = Message.Datatype.UINT32)
  public final Integer thread_num;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LIKE = integer;
    DEFAULT_MEMBER_COUNT = integer;
    DEFAULT_THREAD_COUNT = integer;
    DEFAULT_CONTENT = Collections.emptyList();
    DEFAULT_FORUM_TYPE = integer;
    DEFAULT_IS_BRAND_FORUM = integer;
    DEFAULT_IS_PRIVATE_FORUM = integer;
    DEFAULT_HOT_NUM = integer;
    DEFAULT_HOT_THREAD_ID = long_;
    DEFAULT_IS_RECOMMEND_FORUM = integer;
    DEFAULT_HAS_POSTPRE = integer;
    DEFAULT_TAB_INFO = Collections.emptyList();
    DEFAULT_DAY_THREAD_NUM = integer;
    DEFAULT_LEVEL_ID = integer;
    DEFAULT_THREAD_NUM = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_IS_SIGN = integer;
    DEFAULT_TAG_LIST = Collections.emptyList();
  }
  
  public RecommendForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      String str8 = paramBuilder.avatar;
      if (str8 == null) {
        this.avatar = "";
      } else {
        this.avatar = str8;
      } 
      Long long_2 = paramBuilder.forum_id;
      if (long_2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_2;
      } 
      String str7 = paramBuilder.forum_name;
      if (str7 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str7;
      } 
      Integer integer8 = paramBuilder.is_like;
      if (integer8 == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer8;
      } 
      integer8 = paramBuilder.member_count;
      if (integer8 == null) {
        this.member_count = DEFAULT_MEMBER_COUNT;
      } else {
        this.member_count = integer8;
      } 
      integer8 = paramBuilder.thread_count;
      if (integer8 == null) {
        this.thread_count = DEFAULT_THREAD_COUNT;
      } else {
        this.thread_count = integer8;
      } 
      String str6 = paramBuilder.slogan;
      if (str6 == null) {
        this.slogan = "";
      } else {
        this.slogan = str6;
      } 
      List<PbContent> list2 = paramBuilder.content;
      if (list2 == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list2);
      } 
      Integer integer7 = paramBuilder.forum_type;
      if (integer7 == null) {
        this.forum_type = DEFAULT_FORUM_TYPE;
      } else {
        this.forum_type = integer7;
      } 
      String str5 = paramBuilder.authen;
      if (str5 == null) {
        this.authen = "";
      } else {
        this.authen = str5;
      } 
      str5 = paramBuilder.recom_reason;
      if (str5 == null) {
        this.recom_reason = "";
      } else {
        this.recom_reason = str5;
      } 
      Integer integer6 = paramBuilder.is_brand_forum;
      if (integer6 == null) {
        this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
      } else {
        this.is_brand_forum = integer6;
      } 
      String str4 = paramBuilder.hot_text;
      if (str4 == null) {
        this.hot_text = "";
      } else {
        this.hot_text = str4;
      } 
      str4 = paramBuilder.abtest_tag;
      if (str4 == null) {
        this.abtest_tag = "";
      } else {
        this.abtest_tag = str4;
      } 
      str4 = paramBuilder.source;
      if (str4 == null) {
        this.source = "";
      } else {
        this.source = str4;
      } 
      str4 = paramBuilder.extra;
      if (str4 == null) {
        this.extra = "";
      } else {
        this.extra = str4;
      } 
      Integer integer5 = paramBuilder.is_private_forum;
      if (integer5 == null) {
        this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
      } else {
        this.is_private_forum = integer5;
      } 
      String str3 = paramBuilder.lv1_name;
      if (str3 == null) {
        this.lv1_name = "";
      } else {
        this.lv1_name = str3;
      } 
      str3 = paramBuilder.lv2_name;
      if (str3 == null) {
        this.lv2_name = "";
      } else {
        this.lv2_name = str3;
      } 
      str3 = paramBuilder.avatar_origin;
      if (str3 == null) {
        this.avatar_origin = "";
      } else {
        this.avatar_origin = str3;
      } 
      Integer integer4 = paramBuilder.hot_num;
      if (integer4 == null) {
        this.hot_num = DEFAULT_HOT_NUM;
      } else {
        this.hot_num = integer4;
      } 
      Long long_1 = paramBuilder.hot_thread_id;
      if (long_1 == null) {
        this.hot_thread_id = DEFAULT_HOT_THREAD_ID;
      } else {
        this.hot_thread_id = long_1;
      } 
      Integer integer3 = paramBuilder.is_recommend_forum;
      if (integer3 == null) {
        this.is_recommend_forum = DEFAULT_IS_RECOMMEND_FORUM;
      } else {
        this.is_recommend_forum = integer3;
      } 
      this.post_prefix = paramBuilder.post_prefix;
      integer3 = paramBuilder.has_postpre;
      if (integer3 == null) {
        this.has_postpre = DEFAULT_HAS_POSTPRE;
      } else {
        this.has_postpre = integer3;
      } 
      List<FrsTabInfo> list1 = paramBuilder.tab_info;
      if (list1 == null) {
        this.tab_info = DEFAULT_TAB_INFO;
      } else {
        this.tab_info = Message.immutableCopyOf(list1);
      } 
      Integer integer2 = paramBuilder.day_thread_num;
      if (integer2 == null) {
        this.day_thread_num = DEFAULT_DAY_THREAD_NUM;
      } else {
        this.day_thread_num = integer2;
      } 
      this.block_pop_info = paramBuilder.block_pop_info;
      String str2 = paramBuilder.first_category;
      if (str2 == null) {
        this.first_category = "";
      } else {
        this.first_category = str2;
      } 
      Integer integer1 = paramBuilder.level_id;
      if (integer1 == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = integer1;
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
      integer1 = paramBuilder.is_sign;
      if (integer1 == null) {
        this.is_sign = DEFAULT_IS_SIGN;
      } else {
        this.is_sign = integer1;
      } 
      String str1 = paramBuilder.scheme;
      if (str1 == null) {
        this.scheme = "";
      } else {
        this.scheme = str1;
      } 
      this.label_info = paramBuilder.label_info;
      this.smart_color = paramBuilder.smart_color;
      list = paramBuilder.tag_list;
      if (list == null) {
        this.tag_list = DEFAULT_TAG_LIST;
      } else {
        this.tag_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.avatar = ((Builder)list).avatar;
      this.forum_id = ((Builder)list).forum_id;
      this.forum_name = ((Builder)list).forum_name;
      this.is_like = ((Builder)list).is_like;
      this.member_count = ((Builder)list).member_count;
      this.thread_count = ((Builder)list).thread_count;
      this.slogan = ((Builder)list).slogan;
      this.content = Message.immutableCopyOf(((Builder)list).content);
      this.forum_type = ((Builder)list).forum_type;
      this.authen = ((Builder)list).authen;
      this.recom_reason = ((Builder)list).recom_reason;
      this.is_brand_forum = ((Builder)list).is_brand_forum;
      this.hot_text = ((Builder)list).hot_text;
      this.abtest_tag = ((Builder)list).abtest_tag;
      this.source = ((Builder)list).source;
      this.extra = ((Builder)list).extra;
      this.is_private_forum = ((Builder)list).is_private_forum;
      this.lv1_name = ((Builder)list).lv1_name;
      this.lv2_name = ((Builder)list).lv2_name;
      this.avatar_origin = ((Builder)list).avatar_origin;
      this.hot_num = ((Builder)list).hot_num;
      this.hot_thread_id = ((Builder)list).hot_thread_id;
      this.is_recommend_forum = ((Builder)list).is_recommend_forum;
      this.post_prefix = ((Builder)list).post_prefix;
      this.has_postpre = ((Builder)list).has_postpre;
      this.tab_info = Message.immutableCopyOf(((Builder)list).tab_info);
      this.day_thread_num = ((Builder)list).day_thread_num;
      this.block_pop_info = ((Builder)list).block_pop_info;
      this.first_category = ((Builder)list).first_category;
      this.level_id = ((Builder)list).level_id;
      this.thread_num = ((Builder)list).thread_num;
      this.post_num = ((Builder)list).post_num;
      this.is_sign = ((Builder)list).is_sign;
      this.scheme = ((Builder)list).scheme;
      this.label_info = ((Builder)list).label_info;
      this.smart_color = ((Builder)list).smart_color;
      this.tag_list = Message.immutableCopyOf(((Builder)list).tag_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<RecommendForumInfo> {
    public String abtest_tag;
    
    public String authen;
    
    public String avatar;
    
    public String avatar_origin;
    
    public BlockPopInfo block_pop_info;
    
    public List<PbContent> content;
    
    public Integer day_thread_num;
    
    public String extra;
    
    public String first_category;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer forum_type;
    
    public Integer has_postpre;
    
    public Integer hot_num;
    
    public String hot_text;
    
    public Long hot_thread_id;
    
    public Integer is_brand_forum;
    
    public Integer is_like;
    
    public Integer is_private_forum;
    
    public Integer is_recommend_forum;
    
    public Integer is_sign;
    
    public LabelInfo label_info;
    
    public Integer level_id;
    
    public String lv1_name;
    
    public String lv2_name;
    
    public Integer member_count;
    
    public Integer post_num;
    
    public PostPrefix post_prefix;
    
    public String recom_reason;
    
    public String scheme;
    
    public String slogan;
    
    public ThemeColorInfo smart_color;
    
    public String source;
    
    public List<FrsTabInfo> tab_info;
    
    public List<String> tag_list;
    
    public Integer thread_count;
    
    public Integer thread_num;
    
    public Builder() {}
    
    public Builder(RecommendForumInfo param1RecommendForumInfo) {
      super(param1RecommendForumInfo);
      if (param1RecommendForumInfo == null)
        return; 
      this.avatar = param1RecommendForumInfo.avatar;
      this.forum_id = param1RecommendForumInfo.forum_id;
      this.forum_name = param1RecommendForumInfo.forum_name;
      this.is_like = param1RecommendForumInfo.is_like;
      this.member_count = param1RecommendForumInfo.member_count;
      this.thread_count = param1RecommendForumInfo.thread_count;
      this.slogan = param1RecommendForumInfo.slogan;
      this.content = Message.copyOf(param1RecommendForumInfo.content);
      this.forum_type = param1RecommendForumInfo.forum_type;
      this.authen = param1RecommendForumInfo.authen;
      this.recom_reason = param1RecommendForumInfo.recom_reason;
      this.is_brand_forum = param1RecommendForumInfo.is_brand_forum;
      this.hot_text = param1RecommendForumInfo.hot_text;
      this.abtest_tag = param1RecommendForumInfo.abtest_tag;
      this.source = param1RecommendForumInfo.source;
      this.extra = param1RecommendForumInfo.extra;
      this.is_private_forum = param1RecommendForumInfo.is_private_forum;
      this.lv1_name = param1RecommendForumInfo.lv1_name;
      this.lv2_name = param1RecommendForumInfo.lv2_name;
      this.avatar_origin = param1RecommendForumInfo.avatar_origin;
      this.hot_num = param1RecommendForumInfo.hot_num;
      this.hot_thread_id = param1RecommendForumInfo.hot_thread_id;
      this.is_recommend_forum = param1RecommendForumInfo.is_recommend_forum;
      this.post_prefix = param1RecommendForumInfo.post_prefix;
      this.has_postpre = param1RecommendForumInfo.has_postpre;
      this.tab_info = Message.copyOf(param1RecommendForumInfo.tab_info);
      this.day_thread_num = param1RecommendForumInfo.day_thread_num;
      this.block_pop_info = param1RecommendForumInfo.block_pop_info;
      this.first_category = param1RecommendForumInfo.first_category;
      this.level_id = param1RecommendForumInfo.level_id;
      this.thread_num = param1RecommendForumInfo.thread_num;
      this.post_num = param1RecommendForumInfo.post_num;
      this.is_sign = param1RecommendForumInfo.is_sign;
      this.scheme = param1RecommendForumInfo.scheme;
      this.label_info = param1RecommendForumInfo.label_info;
      this.smart_color = param1RecommendForumInfo.smart_color;
      this.tag_list = Message.copyOf(param1RecommendForumInfo.tag_list);
    }
    
    public RecommendForumInfo build(boolean param1Boolean) {
      return new RecommendForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
