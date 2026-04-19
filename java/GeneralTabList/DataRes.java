package tbclient.GeneralTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AdAuditInfo;
import tbclient.AdMixFloor;
import tbclient.App;
import tbclient.FeedKV;
import tbclient.ForumLikeGuide;
import tbclient.ItemInfo;
import tbclient.SortOption;
import tbclient.SportPageHeadInfo;
import tbclient.SportScheduleInfo;
import tbclient.ThreadInfo;
import tbclient.User;
import tbclient.UserReadStyle;

public final class DataRes extends Message {
  public static final List<AdMixFloor> DEFAULT_AD_MIX_LIST;
  
  public static final String DEFAULT_AD_SAMPLE_MAP_KEY = "";
  
  public static final Integer DEFAULT_AD_SHOW_SELECT;
  
  public static final List<App> DEFAULT_APP_LIST;
  
  public static final List<ThreadInfo> DEFAULT_GENERAL_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final Integer DEFAULT_NEED_POST_CDN;
  
  public static final Integer DEFAULT_NEW_THREAD_NUM;
  
  public static final List<SortOption> DEFAULT_SORT_OPTION;
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
  
  @ProtoField(tag = 21)
  public final AdAuditInfo ad_audit_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 12)
  public final List<AdMixFloor> ad_mix_list;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String ad_sample_map_key;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer ad_show_select;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 10)
  public final List<App> app_list;
  
  @ProtoField(tag = 16)
  public final ForumLikeGuide forum_like_guide;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> general_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(tag = 8)
  public final ItemInfo item_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 15)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 17, type = Message.Datatype.INT32)
  public final Integer need_post_cdn;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer new_thread_num;
  
  @ProtoField(tag = 14)
  public final PageData page_data;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 9)
  public final List<SortOption> sort_option;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer sort_type;
  
  @ProtoField(tag = 5)
  public final SportPageHeadInfo sport_head_info;
  
  @ProtoField(tag = 4)
  public final SportScheduleInfo sport_schedule_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<User> user_list;
  
  @ProtoField(tag = 18)
  public final UserReadStyle user_read_style;
  
  static {
    DEFAULT_NEW_THREAD_NUM = integer;
    DEFAULT_SORT_TYPE = integer;
    DEFAULT_SORT_OPTION = Collections.emptyList();
    DEFAULT_APP_LIST = Collections.emptyList();
    DEFAULT_AD_SHOW_SELECT = integer;
    DEFAULT_AD_MIX_LIST = Collections.emptyList();
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_NEED_POST_CDN = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<ThreadInfo> list5 = paramBuilder.general_list;
      if (list5 == null) {
        this.general_list = DEFAULT_GENERAL_LIST;
      } else {
        this.general_list = Message.immutableCopyOf(list5);
      } 
      Integer integer4 = paramBuilder.has_more;
      if (integer4 == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer4;
      } 
      List<User> list4 = paramBuilder.user_list;
      if (list4 == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list4);
      } 
      this.sport_schedule_info = paramBuilder.sport_schedule_info;
      this.sport_head_info = paramBuilder.sport_head_info;
      Integer integer3 = paramBuilder.new_thread_num;
      if (integer3 == null) {
        this.new_thread_num = DEFAULT_NEW_THREAD_NUM;
      } else {
        this.new_thread_num = integer3;
      } 
      integer3 = paramBuilder.sort_type;
      if (integer3 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer3;
      } 
      this.item_info = paramBuilder.item_info;
      List<SortOption> list3 = paramBuilder.sort_option;
      if (list3 == null) {
        this.sort_option = DEFAULT_SORT_OPTION;
      } else {
        this.sort_option = Message.immutableCopyOf(list3);
      } 
      List<App> list2 = paramBuilder.app_list;
      if (list2 == null) {
        this.app_list = DEFAULT_APP_LIST;
      } else {
        this.app_list = Message.immutableCopyOf(list2);
      } 
      Integer integer2 = paramBuilder.ad_show_select;
      if (integer2 == null) {
        this.ad_show_select = DEFAULT_AD_SHOW_SELECT;
      } else {
        this.ad_show_select = integer2;
      } 
      List<AdMixFloor> list1 = paramBuilder.ad_mix_list;
      if (list1 == null) {
        this.ad_mix_list = DEFAULT_AD_MIX_LIST;
      } else {
        this.ad_mix_list = Message.immutableCopyOf(list1);
      } 
      String str = paramBuilder.ad_sample_map_key;
      if (str == null) {
        this.ad_sample_map_key = "";
      } else {
        this.ad_sample_map_key = str;
      } 
      this.page_data = paramBuilder.page_data;
      List<FeedKV> list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
      this.forum_like_guide = paramBuilder.forum_like_guide;
      Integer integer1 = paramBuilder.need_post_cdn;
      if (integer1 == null) {
        this.need_post_cdn = DEFAULT_NEED_POST_CDN;
      } else {
        this.need_post_cdn = integer1;
      } 
      this.user_read_style = paramBuilder.user_read_style;
      this.ad_audit_info = paramBuilder.ad_audit_info;
    } else {
      this.general_list = Message.immutableCopyOf(paramBuilder.general_list);
      this.has_more = paramBuilder.has_more;
      this.user_list = Message.immutableCopyOf(paramBuilder.user_list);
      this.sport_schedule_info = paramBuilder.sport_schedule_info;
      this.sport_head_info = paramBuilder.sport_head_info;
      this.new_thread_num = paramBuilder.new_thread_num;
      this.sort_type = paramBuilder.sort_type;
      this.item_info = paramBuilder.item_info;
      this.sort_option = Message.immutableCopyOf(paramBuilder.sort_option);
      this.app_list = Message.immutableCopyOf(paramBuilder.app_list);
      this.ad_show_select = paramBuilder.ad_show_select;
      this.ad_mix_list = Message.immutableCopyOf(paramBuilder.ad_mix_list);
      this.ad_sample_map_key = paramBuilder.ad_sample_map_key;
      this.page_data = paramBuilder.page_data;
      this.log_param = Message.immutableCopyOf(paramBuilder.log_param);
      this.forum_like_guide = paramBuilder.forum_like_guide;
      this.need_post_cdn = paramBuilder.need_post_cdn;
      this.user_read_style = paramBuilder.user_read_style;
      this.ad_audit_info = paramBuilder.ad_audit_info;
    } 
  }
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_MORE = integer;
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public AdAuditInfo ad_audit_info;
    
    public List<AdMixFloor> ad_mix_list;
    
    public String ad_sample_map_key;
    
    public Integer ad_show_select;
    
    public List<App> app_list;
    
    public ForumLikeGuide forum_like_guide;
    
    public List<ThreadInfo> general_list;
    
    public Integer has_more;
    
    public ItemInfo item_info;
    
    public List<FeedKV> log_param;
    
    public Integer need_post_cdn;
    
    public Integer new_thread_num;
    
    public PageData page_data;
    
    public List<SortOption> sort_option;
    
    public Integer sort_type;
    
    public SportPageHeadInfo sport_head_info;
    
    public SportScheduleInfo sport_schedule_info;
    
    public List<User> user_list;
    
    public UserReadStyle user_read_style;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.general_list = Message.copyOf(param1DataRes.general_list);
      this.has_more = param1DataRes.has_more;
      this.user_list = Message.copyOf(param1DataRes.user_list);
      this.sport_schedule_info = param1DataRes.sport_schedule_info;
      this.sport_head_info = param1DataRes.sport_head_info;
      this.new_thread_num = param1DataRes.new_thread_num;
      this.sort_type = param1DataRes.sort_type;
      this.item_info = param1DataRes.item_info;
      this.sort_option = Message.copyOf(param1DataRes.sort_option);
      this.app_list = Message.copyOf(param1DataRes.app_list);
      this.ad_show_select = param1DataRes.ad_show_select;
      this.ad_mix_list = Message.copyOf(param1DataRes.ad_mix_list);
      this.ad_sample_map_key = param1DataRes.ad_sample_map_key;
      this.page_data = param1DataRes.page_data;
      this.log_param = Message.copyOf(param1DataRes.log_param);
      this.forum_like_guide = param1DataRes.forum_like_guide;
      this.need_post_cdn = param1DataRes.need_post_cdn;
      this.user_read_style = param1DataRes.user_read_style;
      this.ad_audit_info = param1DataRes.ad_audit_info;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
