package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class VipBanner extends Message {
  public static final String DEFAULT_BACKGROUND_DAY = "";
  
  public static final String DEFAULT_BACKGROUND_NIGHT = "";
  
  public static final String DEFAULT_BANNER_PIC = "";
  
  public static final String DEFAULT_BUBBLE = "";
  
  public static final String DEFAULT_BUTTON_LABLE = "";
  
  public static final String DEFAULT_BUTTON_PIC = "";
  
  public static final String DEFAULT_BUTTON_URL = "";
  
  public static final String DEFAULT_IOS_BANNER_BACKGROUND = "";
  
  public static final String DEFAULT_IOS_BANNER_EMOJI = "";
  
  public static final String DEFAULT_SUB_TITLE = "";
  
  public static final List<String> DEFAULT_SUB_TITLE_LIST = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TOPIC_MODE;
  
  public static final String DEFAULT_URL = "";
  
  public static final String DEFAULT_VIP_ICON = "";
  
  public static final Integer DEFAULT_VIP_STATUS;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String background_day;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String background_night;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String banner_pic;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String bubble;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String button_lable;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String button_pic;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String button_url;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String ios_banner_background;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String ios_banner_emoji;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String sub_title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7, type = Message.Datatype.STRING)
  public final List<String> sub_title_list;
  
  @ProtoField(tag = 13)
  public final VipBannerThemeColorInfo theme_color_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer topic_mode;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String url;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String vip_icon;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer vip_status;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TOPIC_MODE = integer;
    DEFAULT_VIP_STATUS = integer;
  }
  
  public VipBanner(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      str3 = paramBuilder.sub_title;
      if (str3 == null) {
        this.sub_title = "";
      } else {
        this.sub_title = str3;
      } 
      str3 = paramBuilder.button_lable;
      if (str3 == null) {
        this.button_lable = "";
      } else {
        this.button_lable = str3;
      } 
      str3 = paramBuilder.bubble;
      if (str3 == null) {
        this.bubble = "";
      } else {
        this.bubble = str3;
      } 
      str3 = paramBuilder.url;
      if (str3 == null) {
        this.url = "";
      } else {
        this.url = str3;
      } 
      str3 = paramBuilder.button_url;
      if (str3 == null) {
        this.button_url = "";
      } else {
        this.button_url = str3;
      } 
      List<String> list = paramBuilder.sub_title_list;
      if (list == null) {
        this.sub_title_list = DEFAULT_SUB_TITLE_LIST;
      } else {
        this.sub_title_list = Message.immutableCopyOf(list);
      } 
      String str2 = paramBuilder.button_pic;
      if (str2 == null) {
        this.button_pic = "";
      } else {
        this.button_pic = str2;
      } 
      str2 = paramBuilder.banner_pic;
      if (str2 == null) {
        this.banner_pic = "";
      } else {
        this.banner_pic = str2;
      } 
      str2 = paramBuilder.background_day;
      if (str2 == null) {
        this.background_day = "";
      } else {
        this.background_day = str2;
      } 
      Integer integer = paramBuilder.topic_mode;
      if (integer == null) {
        this.topic_mode = DEFAULT_TOPIC_MODE;
      } else {
        this.topic_mode = integer;
      } 
      integer = paramBuilder.vip_status;
      if (integer == null) {
        this.vip_status = DEFAULT_VIP_STATUS;
      } else {
        this.vip_status = integer;
      } 
      this.theme_color_info = paramBuilder.theme_color_info;
      String str1 = paramBuilder.vip_icon;
      if (str1 == null) {
        this.vip_icon = "";
      } else {
        this.vip_icon = str1;
      } 
      str1 = paramBuilder.background_night;
      if (str1 == null) {
        this.background_night = "";
      } else {
        this.background_night = str1;
      } 
      str1 = paramBuilder.ios_banner_background;
      if (str1 == null) {
        this.ios_banner_background = "";
      } else {
        this.ios_banner_background = str1;
      } 
      str = paramBuilder.ios_banner_emoji;
      if (str == null) {
        this.ios_banner_emoji = "";
      } else {
        this.ios_banner_emoji = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.sub_title = ((Builder)str).sub_title;
      this.button_lable = ((Builder)str).button_lable;
      this.bubble = ((Builder)str).bubble;
      this.url = ((Builder)str).url;
      this.button_url = ((Builder)str).button_url;
      this.sub_title_list = Message.immutableCopyOf(((Builder)str).sub_title_list);
      this.button_pic = ((Builder)str).button_pic;
      this.banner_pic = ((Builder)str).banner_pic;
      this.background_day = ((Builder)str).background_day;
      this.topic_mode = ((Builder)str).topic_mode;
      this.vip_status = ((Builder)str).vip_status;
      this.theme_color_info = ((Builder)str).theme_color_info;
      this.vip_icon = ((Builder)str).vip_icon;
      this.background_night = ((Builder)str).background_night;
      this.ios_banner_background = ((Builder)str).ios_banner_background;
      this.ios_banner_emoji = ((Builder)str).ios_banner_emoji;
    } 
  }
  
  public static final class Builder extends Message.Builder<VipBanner> {
    public String background_day;
    
    public String background_night;
    
    public String banner_pic;
    
    public String bubble;
    
    public String button_lable;
    
    public String button_pic;
    
    public String button_url;
    
    public String ios_banner_background;
    
    public String ios_banner_emoji;
    
    public String sub_title;
    
    public List<String> sub_title_list;
    
    public VipBannerThemeColorInfo theme_color_info;
    
    public String title;
    
    public Integer topic_mode;
    
    public String url;
    
    public String vip_icon;
    
    public Integer vip_status;
    
    public Builder() {}
    
    public Builder(VipBanner param1VipBanner) {
      super(param1VipBanner);
      if (param1VipBanner == null)
        return; 
      this.title = param1VipBanner.title;
      this.sub_title = param1VipBanner.sub_title;
      this.button_lable = param1VipBanner.button_lable;
      this.bubble = param1VipBanner.bubble;
      this.url = param1VipBanner.url;
      this.button_url = param1VipBanner.button_url;
      this.sub_title_list = Message.copyOf(param1VipBanner.sub_title_list);
      this.button_pic = param1VipBanner.button_pic;
      this.banner_pic = param1VipBanner.banner_pic;
      this.background_day = param1VipBanner.background_day;
      this.topic_mode = param1VipBanner.topic_mode;
      this.vip_status = param1VipBanner.vip_status;
      this.theme_color_info = param1VipBanner.theme_color_info;
      this.vip_icon = param1VipBanner.vip_icon;
      this.background_night = param1VipBanner.background_night;
      this.ios_banner_background = param1VipBanner.ios_banner_background;
      this.ios_banner_emoji = param1VipBanner.ios_banner_emoji;
    }
    
    public VipBanner build(boolean param1Boolean) {
      return new VipBanner(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
