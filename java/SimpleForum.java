package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class SimpleForum extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_EXT = "";
  
  public static final String DEFAULT_FIRST_CLASS = "";
  
  public static final Long DEFAULT_FORUM_CTIME;
  
  public static final List<ThreadRecommendTag> DEFAULT_FORUM_TAGS;
  
  public static final String DEFAULT_FORUM_TOUTU = "";
  
  public static final Long DEFAULT_ID;
  
  public static final Integer DEFAULT_IS_BRAND_FORUM;
  
  public static final Integer DEFAULT_IS_EXISTS;
  
  public static final Integer DEFAULT_IS_FRS_MASK;
  
  public static final Boolean DEFAULT_IS_HUB;
  
  public static final Integer DEFAULT_IS_LIKED;
  
  public static final Integer DEFAULT_IS_OFFICIAL_FORUM;
  
  public static final Integer DEFAULT_IS_SIGNED;
  
  public static final Integer DEFAULT_LEVEL_ID;
  
  public static final Integer DEFAULT_MEMBER_NUM;
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_OFFICIAL_ICON = "";
  
  public static final String DEFAULT_OFFICIAL_TEXT = "";
  
  public static final List<String> DEFAULT_PENDANTS;
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final String DEFAULT_RECOMMEND_TIP = "";
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final String DEFAULT_SECOND_CLASS = "";
  
  public static final String DEFAULT_SLOGAN = "";
  
  public static final List<FrsTabInfo> DEFAULT_TAB_INFO;
  
  public static final Integer DEFAULT_THREAD_NUM;
  
  public static final Long DEFAULT_UPDATE_THREAD_NUM;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 17)
  public final DeletedReasonInfo deleted_reason_info;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String ext;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String first_class;
  
  @ProtoField(tag = 33, type = Message.Datatype.UINT64)
  public final Long forum_ctime;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 28)
  public final List<ThreadRecommendTag> forum_tags;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String forum_toutu;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer is_brand_forum;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_exists;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer is_frs_mask;
  
  @ProtoField(tag = 34, type = Message.Datatype.BOOL)
  public final Boolean is_hub;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer is_liked;
  
  @ProtoField(tag = 31, type = Message.Datatype.INT32)
  public final Integer is_official_forum;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer is_signed;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer level_id;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer member_num;
  
  @ProtoField(tag = 11)
  public final MultiForumPerm multi_forum_perm;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String official_icon;
  
  @ProtoField(tag = 30, type = Message.Datatype.STRING)
  public final String official_text;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 21, type = Message.Datatype.STRING)
  public final List<String> pendants;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer post_num;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String recommend_tip;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String second_class;
  
  @ProtoField(tag = 22)
  public final ForumShowInfo show_info;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String slogan;
  
  @ProtoField(tag = 23)
  public final SpritePBGuide sprite_pb_guide;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 15)
  public final List<FrsTabInfo> tab_info;
  
  @ProtoField(tag = 19)
  public final ThemeColorInfo theme_color;
  
  @ProtoField(tag = 27, type = Message.Datatype.INT32)
  public final Integer thread_num;
  
  @ProtoField(tag = 32, type = Message.Datatype.UINT64)
  public final Long update_thread_num;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_EXISTS = integer;
    DEFAULT_IS_LIKED = integer;
    DEFAULT_IS_SIGNED = integer;
    DEFAULT_LEVEL_ID = integer;
    DEFAULT_MEMBER_NUM = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_IS_BRAND_FORUM = integer;
    DEFAULT_TAB_INFO = Collections.emptyList();
    DEFAULT_IS_FRS_MASK = integer;
    DEFAULT_PENDANTS = Collections.emptyList();
    DEFAULT_THREAD_NUM = integer;
    DEFAULT_FORUM_TAGS = Collections.emptyList();
    DEFAULT_IS_OFFICIAL_FORUM = integer;
    DEFAULT_UPDATE_THREAD_NUM = long_;
    DEFAULT_FORUM_CTIME = long_;
    DEFAULT_IS_HUB = Boolean.FALSE;
  }
  
  public SimpleForum(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Boolean bool;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.id;
      if (long_2 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_2;
      } 
      String str7 = paramBuilder.name;
      if (str7 == null) {
        this.name = "";
      } else {
        this.name = str7;
      } 
      Integer integer6 = paramBuilder.is_exists;
      if (integer6 == null) {
        this.is_exists = DEFAULT_IS_EXISTS;
      } else {
        this.is_exists = integer6;
      } 
      String str6 = paramBuilder.avatar;
      if (str6 == null) {
        this.avatar = "";
      } else {
        this.avatar = str6;
      } 
      Integer integer5 = paramBuilder.is_liked;
      if (integer5 == null) {
        this.is_liked = DEFAULT_IS_LIKED;
      } else {
        this.is_liked = integer5;
      } 
      integer5 = paramBuilder.is_signed;
      if (integer5 == null) {
        this.is_signed = DEFAULT_IS_SIGNED;
      } else {
        this.is_signed = integer5;
      } 
      String str5 = paramBuilder.first_class;
      if (str5 == null) {
        this.first_class = "";
      } else {
        this.first_class = str5;
      } 
      str5 = paramBuilder.second_class;
      if (str5 == null) {
        this.second_class = "";
      } else {
        this.second_class = str5;
      } 
      str5 = paramBuilder.ext;
      if (str5 == null) {
        this.ext = "";
      } else {
        this.ext = str5;
      } 
      Integer integer4 = paramBuilder.level_id;
      if (integer4 == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = integer4;
      } 
      this.multi_forum_perm = paramBuilder.multi_forum_perm;
      integer4 = paramBuilder.member_num;
      if (integer4 == null) {
        this.member_num = DEFAULT_MEMBER_NUM;
      } else {
        this.member_num = integer4;
      } 
      integer4 = paramBuilder.post_num;
      if (integer4 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer4;
      } 
      integer4 = paramBuilder.is_brand_forum;
      if (integer4 == null) {
        this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
      } else {
        this.is_brand_forum = integer4;
      } 
      List<FrsTabInfo> list2 = paramBuilder.tab_info;
      if (list2 == null) {
        this.tab_info = DEFAULT_TAB_INFO;
      } else {
        this.tab_info = Message.immutableCopyOf(list2);
      } 
      String str4 = paramBuilder.forum_toutu;
      if (str4 == null) {
        this.forum_toutu = "";
      } else {
        this.forum_toutu = str4;
      } 
      this.deleted_reason_info = paramBuilder.deleted_reason_info;
      Integer integer3 = paramBuilder.is_frs_mask;
      if (integer3 == null) {
        this.is_frs_mask = DEFAULT_IS_FRS_MASK;
      } else {
        this.is_frs_mask = integer3;
      } 
      this.theme_color = paramBuilder.theme_color;
      String str3 = paramBuilder.recommend_tip;
      if (str3 == null) {
        this.recommend_tip = "";
      } else {
        this.recommend_tip = str3;
      } 
      List<String> list1 = paramBuilder.pendants;
      if (list1 == null) {
        this.pendants = DEFAULT_PENDANTS;
      } else {
        this.pendants = Message.immutableCopyOf(list1);
      } 
      this.show_info = paramBuilder.show_info;
      this.sprite_pb_guide = paramBuilder.sprite_pb_guide;
      String str2 = paramBuilder.scheme;
      if (str2 == null) {
        this.scheme = "";
      } else {
        this.scheme = str2;
      } 
      str2 = paramBuilder.desc;
      if (str2 == null) {
        this.desc = "";
      } else {
        this.desc = str2;
      } 
      str2 = paramBuilder.slogan;
      if (str2 == null) {
        this.slogan = "";
      } else {
        this.slogan = str2;
      } 
      Integer integer2 = paramBuilder.thread_num;
      if (integer2 == null) {
        this.thread_num = DEFAULT_THREAD_NUM;
      } else {
        this.thread_num = integer2;
      } 
      List<ThreadRecommendTag> list = paramBuilder.forum_tags;
      if (list == null) {
        this.forum_tags = DEFAULT_FORUM_TAGS;
      } else {
        this.forum_tags = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.official_icon;
      if (str1 == null) {
        this.official_icon = "";
      } else {
        this.official_icon = str1;
      } 
      str1 = paramBuilder.official_text;
      if (str1 == null) {
        this.official_text = "";
      } else {
        this.official_text = str1;
      } 
      Integer integer1 = paramBuilder.is_official_forum;
      if (integer1 == null) {
        this.is_official_forum = DEFAULT_IS_OFFICIAL_FORUM;
      } else {
        this.is_official_forum = integer1;
      } 
      Long long_1 = paramBuilder.update_thread_num;
      if (long_1 == null) {
        this.update_thread_num = DEFAULT_UPDATE_THREAD_NUM;
      } else {
        this.update_thread_num = long_1;
      } 
      long_1 = paramBuilder.forum_ctime;
      if (long_1 == null) {
        this.forum_ctime = DEFAULT_FORUM_CTIME;
      } else {
        this.forum_ctime = long_1;
      } 
      bool = paramBuilder.is_hub;
      if (bool == null) {
        this.is_hub = DEFAULT_IS_HUB;
      } else {
        this.is_hub = bool;
      } 
    } else {
      this.id = ((Builder)bool).id;
      this.name = ((Builder)bool).name;
      this.is_exists = ((Builder)bool).is_exists;
      this.avatar = ((Builder)bool).avatar;
      this.is_liked = ((Builder)bool).is_liked;
      this.is_signed = ((Builder)bool).is_signed;
      this.first_class = ((Builder)bool).first_class;
      this.second_class = ((Builder)bool).second_class;
      this.ext = ((Builder)bool).ext;
      this.level_id = ((Builder)bool).level_id;
      this.multi_forum_perm = ((Builder)bool).multi_forum_perm;
      this.member_num = ((Builder)bool).member_num;
      this.post_num = ((Builder)bool).post_num;
      this.is_brand_forum = ((Builder)bool).is_brand_forum;
      this.tab_info = Message.immutableCopyOf(((Builder)bool).tab_info);
      this.forum_toutu = ((Builder)bool).forum_toutu;
      this.deleted_reason_info = ((Builder)bool).deleted_reason_info;
      this.is_frs_mask = ((Builder)bool).is_frs_mask;
      this.theme_color = ((Builder)bool).theme_color;
      this.recommend_tip = ((Builder)bool).recommend_tip;
      this.pendants = Message.immutableCopyOf(((Builder)bool).pendants);
      this.show_info = ((Builder)bool).show_info;
      this.sprite_pb_guide = ((Builder)bool).sprite_pb_guide;
      this.scheme = ((Builder)bool).scheme;
      this.desc = ((Builder)bool).desc;
      this.slogan = ((Builder)bool).slogan;
      this.thread_num = ((Builder)bool).thread_num;
      this.forum_tags = Message.immutableCopyOf(((Builder)bool).forum_tags);
      this.official_icon = ((Builder)bool).official_icon;
      this.official_text = ((Builder)bool).official_text;
      this.is_official_forum = ((Builder)bool).is_official_forum;
      this.update_thread_num = ((Builder)bool).update_thread_num;
      this.forum_ctime = ((Builder)bool).forum_ctime;
      this.is_hub = ((Builder)bool).is_hub;
    } 
  }
  
  public static final class Builder extends Message.Builder<SimpleForum> {
    public String avatar;
    
    public DeletedReasonInfo deleted_reason_info;
    
    public String desc;
    
    public String ext;
    
    public String first_class;
    
    public Long forum_ctime;
    
    public List<ThreadRecommendTag> forum_tags;
    
    public String forum_toutu;
    
    public Long id;
    
    public Integer is_brand_forum;
    
    public Integer is_exists;
    
    public Integer is_frs_mask;
    
    public Boolean is_hub;
    
    public Integer is_liked;
    
    public Integer is_official_forum;
    
    public Integer is_signed;
    
    public Integer level_id;
    
    public Integer member_num;
    
    public MultiForumPerm multi_forum_perm;
    
    public String name;
    
    public String official_icon;
    
    public String official_text;
    
    public List<String> pendants;
    
    public Integer post_num;
    
    public String recommend_tip;
    
    public String scheme;
    
    public String second_class;
    
    public ForumShowInfo show_info;
    
    public String slogan;
    
    public SpritePBGuide sprite_pb_guide;
    
    public List<FrsTabInfo> tab_info;
    
    public ThemeColorInfo theme_color;
    
    public Integer thread_num;
    
    public Long update_thread_num;
    
    public Builder() {}
    
    public Builder(SimpleForum param1SimpleForum) {
      super(param1SimpleForum);
      if (param1SimpleForum == null)
        return; 
      this.id = param1SimpleForum.id;
      this.name = param1SimpleForum.name;
      this.is_exists = param1SimpleForum.is_exists;
      this.avatar = param1SimpleForum.avatar;
      this.is_liked = param1SimpleForum.is_liked;
      this.is_signed = param1SimpleForum.is_signed;
      this.first_class = param1SimpleForum.first_class;
      this.second_class = param1SimpleForum.second_class;
      this.ext = param1SimpleForum.ext;
      this.level_id = param1SimpleForum.level_id;
      this.multi_forum_perm = param1SimpleForum.multi_forum_perm;
      this.member_num = param1SimpleForum.member_num;
      this.post_num = param1SimpleForum.post_num;
      this.is_brand_forum = param1SimpleForum.is_brand_forum;
      this.tab_info = Message.copyOf(param1SimpleForum.tab_info);
      this.forum_toutu = param1SimpleForum.forum_toutu;
      this.deleted_reason_info = param1SimpleForum.deleted_reason_info;
      this.is_frs_mask = param1SimpleForum.is_frs_mask;
      this.theme_color = param1SimpleForum.theme_color;
      this.recommend_tip = param1SimpleForum.recommend_tip;
      this.pendants = Message.copyOf(param1SimpleForum.pendants);
      this.show_info = param1SimpleForum.show_info;
      this.sprite_pb_guide = param1SimpleForum.sprite_pb_guide;
      this.scheme = param1SimpleForum.scheme;
      this.desc = param1SimpleForum.desc;
      this.slogan = param1SimpleForum.slogan;
      this.thread_num = param1SimpleForum.thread_num;
      this.forum_tags = Message.copyOf(param1SimpleForum.forum_tags);
      this.official_icon = param1SimpleForum.official_icon;
      this.official_text = param1SimpleForum.official_text;
      this.is_official_forum = param1SimpleForum.is_official_forum;
      this.update_thread_num = param1SimpleForum.update_thread_num;
      this.forum_ctime = param1SimpleForum.forum_ctime;
      this.is_hub = param1SimpleForum.is_hub;
    }
    
    public SimpleForum build(boolean param1Boolean) {
      return new SimpleForum(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
