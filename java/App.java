package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class App extends Message {
  public static final String DEFAULT_ABTEST = "";
  
  public static final String DEFAULT_AD_ID = "";
  
  public static final String DEFAULT_APK_NAME = "";
  
  public static final String DEFAULT_APK_URL = "";
  
  public static final String DEFAULT_APP_DESC = "";
  
  public static final String DEFAULT_APP_NAME = "";
  
  public static final Integer DEFAULT_APP_TIME;
  
  public static final String DEFAULT_BUSINESS_TYPE = "";
  
  public static final Integer DEFAULT_CPID;
  
  public static final String DEFAULT_DEEP_URL = "";
  
  public static final String DEFAULT_EXT_INFO = "";
  
  public static final String DEFAULT_FIRST_NAME = "";
  
  public static final List<GoodsInfo> DEFAULT_GOODS_INFO;
  
  public static final String DEFAULT_ICON_LINK = "";
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_ID = "";
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_IOS_URL = "";
  
  public static final String DEFAULT_LOC_CODE = "";
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_PLAN_ID;
  
  public static final String DEFAULT_PLATFORM_TYPE = "";
  
  public static final Integer DEFAULT_POS;
  
  public static final String DEFAULT_POS_NAME = "";
  
  public static final String DEFAULT_PRICE = "";
  
  public static final String DEFAULT_P_NAME = "";
  
  public static final String DEFAULT_P_URL = "";
  
  public static final String DEFAULT_SECOND_NAME = "";
  
  public static final Integer DEFAULT_TOUCH_LEVEL;
  
  public static final String DEFAULT_TOUCH_TYPE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_URL = "";
  
  public static final Integer DEFAULT_URL_TYPE;
  
  public static final String DEFAULT_USER_ID = "";
  
  public static final String DEFAULT_VERIFY = "";
  
  public static final String DEFAULT_WEB_URL = "";
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String abtest;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String ad_id;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String apk_name;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String apk_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String app_desc;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String app_name;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer app_time;
  
  @ProtoField(tag = 33, type = Message.Datatype.STRING)
  public final String business_type;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer cpid;
  
  @ProtoField(tag = 32, type = Message.Datatype.STRING)
  public final String deep_url;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String ext_info;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String first_name;
  
  @ProtoField(tag = 35)
  public final GameAd game_ad;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 30)
  public final List<GoodsInfo> goods_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String icon_link;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String id;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String ios_url;
  
  @ProtoField(tag = 38)
  public final LiveAdData live_ad;
  
  @ProtoField(tag = 31, type = Message.Datatype.STRING)
  public final String loc_code;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 36)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String p_name;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String p_url;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT32)
  public final Integer plan_id;
  
  @ProtoField(tag = 39, type = Message.Datatype.STRING)
  public final String platform_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer pos;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String pos_name;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String price;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String second_name;
  
  @ProtoField(tag = 37, type = Message.Datatype.INT32)
  public final Integer touch_level;
  
  @ProtoField(tag = 40, type = Message.Datatype.STRING)
  public final String touch_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String url;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer url_type;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String user_id;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String verify;
  
  @ProtoField(tag = 34)
  public final VipAd vip_ad;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String web_url;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_POS = integer;
    DEFAULT_APP_TIME = integer;
    DEFAULT_URL_TYPE = integer;
    DEFAULT_CPID = integer;
    DEFAULT_PLAN_ID = integer;
    DEFAULT_GOODS_INFO = Collections.emptyList();
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_TOUCH_LEVEL = integer;
  }
  
  public App(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer6 = paramBuilder.type;
      if (integer6 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer6;
      } 
      integer6 = paramBuilder.pos;
      if (integer6 == null) {
        this.pos = DEFAULT_POS;
      } else {
        this.pos = integer6;
      } 
      String str7 = paramBuilder.icon_url;
      if (str7 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str7;
      } 
      str7 = paramBuilder.icon_link;
      if (str7 == null) {
        this.icon_link = "";
      } else {
        this.icon_link = str7;
      } 
      str7 = paramBuilder.app_name;
      if (str7 == null) {
        this.app_name = "";
      } else {
        this.app_name = str7;
      } 
      str7 = paramBuilder.app_desc;
      if (str7 == null) {
        this.app_desc = "";
      } else {
        this.app_desc = str7;
      } 
      str7 = paramBuilder.p_name;
      if (str7 == null) {
        this.p_name = "";
      } else {
        this.p_name = str7;
      } 
      str7 = paramBuilder.p_url;
      if (str7 == null) {
        this.p_url = "";
      } else {
        this.p_url = str7;
      } 
      str7 = paramBuilder.img_url;
      if (str7 == null) {
        this.img_url = "";
      } else {
        this.img_url = str7;
      } 
      Integer integer5 = paramBuilder.app_time;
      if (integer5 == null) {
        this.app_time = DEFAULT_APP_TIME;
      } else {
        this.app_time = integer5;
      } 
      String str6 = paramBuilder.web_url;
      if (str6 == null) {
        this.web_url = "";
      } else {
        this.web_url = str6;
      } 
      str6 = paramBuilder.ad_id;
      if (str6 == null) {
        this.ad_id = "";
      } else {
        this.ad_id = str6;
      } 
      str6 = paramBuilder.id;
      if (str6 == null) {
        this.id = "";
      } else {
        this.id = str6;
      } 
      str6 = paramBuilder.name;
      if (str6 == null) {
        this.name = "";
      } else {
        this.name = str6;
      } 
      Integer integer4 = paramBuilder.url_type;
      if (integer4 == null) {
        this.url_type = DEFAULT_URL_TYPE;
      } else {
        this.url_type = integer4;
      } 
      String str5 = paramBuilder.url;
      if (str5 == null) {
        this.url = "";
      } else {
        this.url = str5;
      } 
      str5 = paramBuilder.ios_url;
      if (str5 == null) {
        this.ios_url = "";
      } else {
        this.ios_url = str5;
      } 
      str5 = paramBuilder.apk_url;
      if (str5 == null) {
        this.apk_url = "";
      } else {
        this.apk_url = str5;
      } 
      str5 = paramBuilder.apk_name;
      if (str5 == null) {
        this.apk_name = "";
      } else {
        this.apk_name = str5;
      } 
      str5 = paramBuilder.pos_name;
      if (str5 == null) {
        this.pos_name = "";
      } else {
        this.pos_name = str5;
      } 
      str5 = paramBuilder.first_name;
      if (str5 == null) {
        this.first_name = "";
      } else {
        this.first_name = str5;
      } 
      str5 = paramBuilder.second_name;
      if (str5 == null) {
        this.second_name = "";
      } else {
        this.second_name = str5;
      } 
      Integer integer3 = paramBuilder.cpid;
      if (integer3 == null) {
        this.cpid = DEFAULT_CPID;
      } else {
        this.cpid = integer3;
      } 
      String str4 = paramBuilder.abtest;
      if (str4 == null) {
        this.abtest = "";
      } else {
        this.abtest = str4;
      } 
      Integer integer2 = paramBuilder.plan_id;
      if (integer2 == null) {
        this.plan_id = DEFAULT_PLAN_ID;
      } else {
        this.plan_id = integer2;
      } 
      String str3 = paramBuilder.user_id;
      if (str3 == null) {
        this.user_id = "";
      } else {
        this.user_id = str3;
      } 
      str3 = paramBuilder.price;
      if (str3 == null) {
        this.price = "";
      } else {
        this.price = str3;
      } 
      str3 = paramBuilder.verify;
      if (str3 == null) {
        this.verify = "";
      } else {
        this.verify = str3;
      } 
      str3 = paramBuilder.ext_info;
      if (str3 == null) {
        this.ext_info = "";
      } else {
        this.ext_info = str3;
      } 
      List<GoodsInfo> list1 = paramBuilder.goods_info;
      if (list1 == null) {
        this.goods_info = DEFAULT_GOODS_INFO;
      } else {
        this.goods_info = Message.immutableCopyOf(list1);
      } 
      String str2 = paramBuilder.loc_code;
      if (str2 == null) {
        this.loc_code = "";
      } else {
        this.loc_code = str2;
      } 
      str2 = paramBuilder.deep_url;
      if (str2 == null) {
        this.deep_url = "";
      } else {
        this.deep_url = str2;
      } 
      str2 = paramBuilder.business_type;
      if (str2 == null) {
        this.business_type = "";
      } else {
        this.business_type = str2;
      } 
      this.vip_ad = paramBuilder.vip_ad;
      this.game_ad = paramBuilder.game_ad;
      List<FeedKV> list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.touch_level;
      if (integer1 == null) {
        this.touch_level = DEFAULT_TOUCH_LEVEL;
      } else {
        this.touch_level = integer1;
      } 
      this.live_ad = paramBuilder.live_ad;
      String str1 = paramBuilder.platform_type;
      if (str1 == null) {
        this.platform_type = "";
      } else {
        this.platform_type = str1;
      } 
      str = paramBuilder.touch_type;
      if (str == null) {
        this.touch_type = "";
      } else {
        this.touch_type = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.pos = ((Builder)str).pos;
      this.icon_url = ((Builder)str).icon_url;
      this.icon_link = ((Builder)str).icon_link;
      this.app_name = ((Builder)str).app_name;
      this.app_desc = ((Builder)str).app_desc;
      this.p_name = ((Builder)str).p_name;
      this.p_url = ((Builder)str).p_url;
      this.img_url = ((Builder)str).img_url;
      this.app_time = ((Builder)str).app_time;
      this.web_url = ((Builder)str).web_url;
      this.ad_id = ((Builder)str).ad_id;
      this.id = ((Builder)str).id;
      this.name = ((Builder)str).name;
      this.url_type = ((Builder)str).url_type;
      this.url = ((Builder)str).url;
      this.ios_url = ((Builder)str).ios_url;
      this.apk_url = ((Builder)str).apk_url;
      this.apk_name = ((Builder)str).apk_name;
      this.pos_name = ((Builder)str).pos_name;
      this.first_name = ((Builder)str).first_name;
      this.second_name = ((Builder)str).second_name;
      this.cpid = ((Builder)str).cpid;
      this.abtest = ((Builder)str).abtest;
      this.plan_id = ((Builder)str).plan_id;
      this.user_id = ((Builder)str).user_id;
      this.price = ((Builder)str).price;
      this.verify = ((Builder)str).verify;
      this.ext_info = ((Builder)str).ext_info;
      this.goods_info = Message.immutableCopyOf(((Builder)str).goods_info);
      this.loc_code = ((Builder)str).loc_code;
      this.deep_url = ((Builder)str).deep_url;
      this.business_type = ((Builder)str).business_type;
      this.vip_ad = ((Builder)str).vip_ad;
      this.game_ad = ((Builder)str).game_ad;
      this.log_param = Message.immutableCopyOf(((Builder)str).log_param);
      this.touch_level = ((Builder)str).touch_level;
      this.live_ad = ((Builder)str).live_ad;
      this.platform_type = ((Builder)str).platform_type;
      this.touch_type = ((Builder)str).touch_type;
    } 
  }
  
  public static final class Builder extends Message.Builder<App> {
    public String abtest;
    
    public String ad_id;
    
    public String apk_name;
    
    public String apk_url;
    
    public String app_desc;
    
    public String app_name;
    
    public Integer app_time;
    
    public String business_type;
    
    public Integer cpid;
    
    public String deep_url;
    
    public String ext_info;
    
    public String first_name;
    
    public GameAd game_ad;
    
    public List<GoodsInfo> goods_info;
    
    public String icon_link;
    
    public String icon_url;
    
    public String id;
    
    public String img_url;
    
    public String ios_url;
    
    public LiveAdData live_ad;
    
    public String loc_code;
    
    public List<FeedKV> log_param;
    
    public String name;
    
    public String p_name;
    
    public String p_url;
    
    public Integer plan_id;
    
    public String platform_type;
    
    public Integer pos;
    
    public String pos_name;
    
    public String price;
    
    public String second_name;
    
    public Integer touch_level;
    
    public String touch_type;
    
    public Integer type;
    
    public String url;
    
    public Integer url_type;
    
    public String user_id;
    
    public String verify;
    
    public VipAd vip_ad;
    
    public String web_url;
    
    public Builder() {}
    
    public Builder(App param1App) {
      super(param1App);
      if (param1App == null)
        return; 
      this.type = param1App.type;
      this.pos = param1App.pos;
      this.icon_url = param1App.icon_url;
      this.icon_link = param1App.icon_link;
      this.app_name = param1App.app_name;
      this.app_desc = param1App.app_desc;
      this.p_name = param1App.p_name;
      this.p_url = param1App.p_url;
      this.img_url = param1App.img_url;
      this.app_time = param1App.app_time;
      this.web_url = param1App.web_url;
      this.ad_id = param1App.ad_id;
      this.id = param1App.id;
      this.name = param1App.name;
      this.url_type = param1App.url_type;
      this.url = param1App.url;
      this.ios_url = param1App.ios_url;
      this.apk_url = param1App.apk_url;
      this.apk_name = param1App.apk_name;
      this.pos_name = param1App.pos_name;
      this.first_name = param1App.first_name;
      this.second_name = param1App.second_name;
      this.cpid = param1App.cpid;
      this.abtest = param1App.abtest;
      this.plan_id = param1App.plan_id;
      this.user_id = param1App.user_id;
      this.price = param1App.price;
      this.verify = param1App.verify;
      this.ext_info = param1App.ext_info;
      this.goods_info = Message.copyOf(param1App.goods_info);
      this.loc_code = param1App.loc_code;
      this.deep_url = param1App.deep_url;
      this.business_type = param1App.business_type;
      this.vip_ad = param1App.vip_ad;
      this.game_ad = param1App.game_ad;
      this.log_param = Message.copyOf(param1App.log_param);
      this.touch_level = param1App.touch_level;
      this.live_ad = param1App.live_ad;
      this.platform_type = param1App.platform_type;
      this.touch_type = param1App.touch_type;
    }
    
    public App build(boolean param1Boolean) {
      return new App(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
