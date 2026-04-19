package tbclient.ThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AdMixFloor;
import tbclient.BannerList;
import tbclient.FeedKV;
import tbclient.ThreadInfo;
import tbclient.User;

public final class DataRes extends Message {
  public static final List<AdMixFloor> DEFAULT_AD_MIX_LIST;
  
  public static final String DEFAULT_AD_SAMPLE_MAP_KEY = "";
  
  public static final Integer DEFAULT_AD_SHOW_SELECT;
  
  public static final String DEFAULT_ASP_SHOWN_INFO = "";
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final String DEFAULT_PARTIAL_VISIBLE_TOAST = "";
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<AdMixFloor> ad_mix_list;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String ad_sample_map_key;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer ad_show_select;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String asp_shown_info;
  
  @ProtoField(tag = 3)
  public final BannerList banner_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 10)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 9)
  public final PageData page_data;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String partial_visible_toast;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<User> user_list;
  
  static {
    DEFAULT_AD_MIX_LIST = Collections.emptyList();
    DEFAULT_AD_SHOW_SELECT = Integer.valueOf(0);
    DEFAULT_LOG_PARAM = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      List<ThreadInfo> list3 = paramBuilder.thread_list;
      if (list3 == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list3);
      } 
      List<User> list2 = paramBuilder.user_list;
      if (list2 == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list2);
      } 
      this.banner_list = paramBuilder.banner_list;
      String str2 = paramBuilder.asp_shown_info;
      if (str2 == null) {
        this.asp_shown_info = "";
      } else {
        this.asp_shown_info = str2;
      } 
      str2 = paramBuilder.partial_visible_toast;
      if (str2 == null) {
        this.partial_visible_toast = "";
      } else {
        this.partial_visible_toast = str2;
      } 
      List<AdMixFloor> list1 = paramBuilder.ad_mix_list;
      if (list1 == null) {
        this.ad_mix_list = DEFAULT_AD_MIX_LIST;
      } else {
        this.ad_mix_list = Message.immutableCopyOf(list1);
      } 
      Integer integer = paramBuilder.ad_show_select;
      if (integer == null) {
        this.ad_show_select = DEFAULT_AD_SHOW_SELECT;
      } else {
        this.ad_show_select = integer;
      } 
      String str1 = paramBuilder.ad_sample_map_key;
      if (str1 == null) {
        this.ad_sample_map_key = "";
      } else {
        this.ad_sample_map_key = str1;
      } 
      this.page_data = paramBuilder.page_data;
      list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
    } else {
      this.thread_list = Message.immutableCopyOf(((Builder)list).thread_list);
      this.user_list = Message.immutableCopyOf(((Builder)list).user_list);
      this.banner_list = ((Builder)list).banner_list;
      this.asp_shown_info = ((Builder)list).asp_shown_info;
      this.partial_visible_toast = ((Builder)list).partial_visible_toast;
      this.ad_mix_list = Message.immutableCopyOf(((Builder)list).ad_mix_list);
      this.ad_show_select = ((Builder)list).ad_show_select;
      this.ad_sample_map_key = ((Builder)list).ad_sample_map_key;
      this.page_data = ((Builder)list).page_data;
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<AdMixFloor> ad_mix_list;
    
    public String ad_sample_map_key;
    
    public Integer ad_show_select;
    
    public String asp_shown_info;
    
    public BannerList banner_list;
    
    public List<FeedKV> log_param;
    
    public PageData page_data;
    
    public String partial_visible_toast;
    
    public List<ThreadInfo> thread_list;
    
    public List<User> user_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.thread_list = Message.copyOf(param1DataRes.thread_list);
      this.user_list = Message.copyOf(param1DataRes.user_list);
      this.banner_list = param1DataRes.banner_list;
      this.asp_shown_info = param1DataRes.asp_shown_info;
      this.partial_visible_toast = param1DataRes.partial_visible_toast;
      this.ad_mix_list = Message.copyOf(param1DataRes.ad_mix_list);
      this.ad_show_select = param1DataRes.ad_show_select;
      this.ad_sample_map_key = param1DataRes.ad_sample_map_key;
      this.page_data = param1DataRes.page_data;
      this.log_param = Message.copyOf(param1DataRes.log_param);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
