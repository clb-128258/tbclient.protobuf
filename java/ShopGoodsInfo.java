package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ShopGoodsInfo extends Message {
  public static final Long DEFAULT_AGREE_COUNT;
  
  public static final String DEFAULT_AUDIT_REASON = "";
  
  public static final Integer DEFAULT_CARD_STYLE;
  
  public static final Integer DEFAULT_CHANNEL_ID;
  
  public static final Integer DEFAULT_COUPON_TYPE;
  
  public static final String DEFAULT_COVER_IMG = "";
  
  public static final Integer DEFAULT_DISCOUNT_PRICE;
  
  public static final Integer DEFAULT_DISCOUNT_TYPE;
  
  public static final Integer DEFAULT_ESTIMATED_EARNINGS;
  
  public static final String DEFAULT_FORUM_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_GOODS_DESC = "";
  
  public static final Integer DEFAULT_GOODS_ID;
  
  public static final String DEFAULT_GOODS_LABEL = "";
  
  public static final String DEFAULT_GOODS_NAME = "";
  
  public static final Integer DEFAULT_GOODS_STATUS;
  
  public static final Integer DEFAULT_GOODS_TYPE;
  
  public static final Integer DEFAULT_HAS_ORDER;
  
  public static final List<String> DEFAULT_IMG_LIST;
  
  public static final Integer DEFAULT_IS_FRS_MASK;
  
  public static final Integer DEFAULT_IS_LANDMINE;
  
  public static final String DEFAULT_NEED_NOTICE = "";
  
  public static final Long DEFAULT_POST_ID;
  
  public static final Integer DEFAULT_PREFERENTIAL_PRICE;
  
  public static final Integer DEFAULT_PRICE;
  
  public static final String DEFAULT_PV = "";
  
  public static final Long DEFAULT_SALES;
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final String DEFAULT_SECOND_SCHEME = "";
  
  public static final String DEFAULT_SHOP_DESC = "";
  
  public static final String DEFAULT_SOURCE_URL = "";
  
  public static final List<ThemeColorInfo> DEFAULT_TAG_LIST;
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 22, type = Message.Datatype.UINT64)
  public final Long agree_count;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String audit_reason;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer card_style;
  
  @ProtoField(tag = 42, type = Message.Datatype.UINT32)
  public final Integer channel_id;
  
  @ProtoField(tag = 6)
  public final ShopGoodsChannelInfo channel_info;
  
  @ProtoField(tag = 11)
  public final ShopGoodsCommentInfo comment_info;
  
  @ProtoField(tag = 32, type = Message.Datatype.UINT32)
  public final Integer coupon_type;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String cover_img;
  
  @ProtoField(tag = 36, type = Message.Datatype.UINT32)
  public final Integer discount_price;
  
  @ProtoField(tag = 26, type = Message.Datatype.UINT32)
  public final Integer discount_type;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT32)
  public final Integer estimated_earnings;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String forum_avatar;
  
  @ProtoField(tag = 18, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 35)
  public final ShopGoodsGameInfo game_info;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String goods_desc;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT32)
  public final Integer goods_id;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String goods_label;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String goods_name;
  
  @ProtoField(tag = 19, type = Message.Datatype.UINT32)
  public final Integer goods_status;
  
  @ProtoField(tag = 38, type = Message.Datatype.UINT32)
  public final Integer goods_type;
  
  @ProtoField(tag = 37, type = Message.Datatype.UINT32)
  public final Integer has_order;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 17, type = Message.Datatype.STRING)
  public final List<String> img_list;
  
  @ProtoField(tag = 41, type = Message.Datatype.UINT32)
  public final Integer is_frs_mask;
  
  @ProtoField(tag = 39, type = Message.Datatype.UINT32)
  public final Integer is_landmine;
  
  @ProtoField(tag = 43)
  public final KjsAccountDetail kjs_account_detail;
  
  @ProtoField(tag = 10)
  public final ListingReason listing_reason;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String need_notice;
  
  @ProtoField(tag = 40)
  public final PollInfo poll_info;
  
  @ProtoField(tag = 34, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 30, type = Message.Datatype.UINT32)
  public final Integer preferential_price;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer price;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String pv;
  
  @ProtoField(tag = 4)
  public final ShopGoodsRecommendInfo recommend_info;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long sales;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(tag = 31, type = Message.Datatype.STRING)
  public final String second_scheme;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String shop_desc;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String source_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 33)
  public final List<ThemeColorInfo> tag_list;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String url;
  
  @ProtoField(tag = 21)
  public final ShopGoodsCommentInfo view_info;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PRICE = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_SALES = long_;
    DEFAULT_CARD_STYLE = integer;
    DEFAULT_THREAD_ID = long_;
    DEFAULT_GOODS_ID = integer;
    DEFAULT_ESTIMATED_EARNINGS = integer;
    DEFAULT_IMG_LIST = Collections.emptyList();
    DEFAULT_FORUM_ID = long_;
    DEFAULT_GOODS_STATUS = integer;
    DEFAULT_AGREE_COUNT = long_;
    DEFAULT_DISCOUNT_TYPE = integer;
    DEFAULT_PREFERENTIAL_PRICE = integer;
    DEFAULT_COUPON_TYPE = integer;
    DEFAULT_TAG_LIST = Collections.emptyList();
    DEFAULT_POST_ID = long_;
    DEFAULT_DISCOUNT_PRICE = integer;
    DEFAULT_HAS_ORDER = integer;
    DEFAULT_GOODS_TYPE = integer;
    DEFAULT_IS_LANDMINE = integer;
    DEFAULT_IS_FRS_MASK = integer;
    DEFAULT_CHANNEL_ID = integer;
  }
  
  public ShopGoodsInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str8 = paramBuilder.goods_name;
      if (str8 == null) {
        this.goods_name = "";
      } else {
        this.goods_name = str8;
      } 
      Integer integer8 = paramBuilder.price;
      if (integer8 == null) {
        this.price = DEFAULT_PRICE;
      } else {
        this.price = integer8;
      } 
      Long long_5 = paramBuilder.sales;
      if (long_5 == null) {
        this.sales = DEFAULT_SALES;
      } else {
        this.sales = long_5;
      } 
      this.recommend_info = paramBuilder.recommend_info;
      Integer integer7 = paramBuilder.card_style;
      if (integer7 == null) {
        this.card_style = DEFAULT_CARD_STYLE;
      } else {
        this.card_style = integer7;
      } 
      this.channel_info = paramBuilder.channel_info;
      String str7 = paramBuilder.cover_img;
      if (str7 == null) {
        this.cover_img = "";
      } else {
        this.cover_img = str7;
      } 
      str7 = paramBuilder.url;
      if (str7 == null) {
        this.url = "";
      } else {
        this.url = str7;
      } 
      Long long_4 = paramBuilder.thread_id;
      if (long_4 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_4;
      } 
      this.listing_reason = paramBuilder.listing_reason;
      this.comment_info = paramBuilder.comment_info;
      String str6 = paramBuilder.scheme;
      if (str6 == null) {
        this.scheme = "";
      } else {
        this.scheme = str6;
      } 
      str6 = paramBuilder.goods_desc;
      if (str6 == null) {
        this.goods_desc = "";
      } else {
        this.goods_desc = str6;
      } 
      Integer integer6 = paramBuilder.goods_id;
      if (integer6 == null) {
        this.goods_id = DEFAULT_GOODS_ID;
      } else {
        this.goods_id = integer6;
      } 
      integer6 = paramBuilder.estimated_earnings;
      if (integer6 == null) {
        this.estimated_earnings = DEFAULT_ESTIMATED_EARNINGS;
      } else {
        this.estimated_earnings = integer6;
      } 
      String str5 = paramBuilder.audit_reason;
      if (str5 == null) {
        this.audit_reason = "";
      } else {
        this.audit_reason = str5;
      } 
      List<String> list1 = paramBuilder.img_list;
      if (list1 == null) {
        this.img_list = DEFAULT_IMG_LIST;
      } else {
        this.img_list = Message.immutableCopyOf(list1);
      } 
      Long long_3 = paramBuilder.forum_id;
      if (long_3 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_3;
      } 
      Integer integer5 = paramBuilder.goods_status;
      if (integer5 == null) {
        this.goods_status = DEFAULT_GOODS_STATUS;
      } else {
        this.goods_status = integer5;
      } 
      String str4 = paramBuilder.source_url;
      if (str4 == null) {
        this.source_url = "";
      } else {
        this.source_url = str4;
      } 
      this.view_info = paramBuilder.view_info;
      Long long_2 = paramBuilder.agree_count;
      if (long_2 == null) {
        this.agree_count = DEFAULT_AGREE_COUNT;
      } else {
        this.agree_count = long_2;
      } 
      String str3 = paramBuilder.forum_name;
      if (str3 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str3;
      } 
      str3 = paramBuilder.forum_avatar;
      if (str3 == null) {
        this.forum_avatar = "";
      } else {
        this.forum_avatar = str3;
      } 
      str3 = paramBuilder.shop_desc;
      if (str3 == null) {
        this.shop_desc = "";
      } else {
        this.shop_desc = str3;
      } 
      Integer integer4 = paramBuilder.discount_type;
      if (integer4 == null) {
        this.discount_type = DEFAULT_DISCOUNT_TYPE;
      } else {
        this.discount_type = integer4;
      } 
      String str2 = paramBuilder.pv;
      if (str2 == null) {
        this.pv = "";
      } else {
        this.pv = str2;
      } 
      str2 = paramBuilder.need_notice;
      if (str2 == null) {
        this.need_notice = "";
      } else {
        this.need_notice = str2;
      } 
      str2 = paramBuilder.goods_label;
      if (str2 == null) {
        this.goods_label = "";
      } else {
        this.goods_label = str2;
      } 
      Integer integer3 = paramBuilder.preferential_price;
      if (integer3 == null) {
        this.preferential_price = DEFAULT_PREFERENTIAL_PRICE;
      } else {
        this.preferential_price = integer3;
      } 
      String str1 = paramBuilder.second_scheme;
      if (str1 == null) {
        this.second_scheme = "";
      } else {
        this.second_scheme = str1;
      } 
      Integer integer2 = paramBuilder.coupon_type;
      if (integer2 == null) {
        this.coupon_type = DEFAULT_COUPON_TYPE;
      } else {
        this.coupon_type = integer2;
      } 
      List<ThemeColorInfo> list = paramBuilder.tag_list;
      if (list == null) {
        this.tag_list = DEFAULT_TAG_LIST;
      } else {
        this.tag_list = Message.immutableCopyOf(list);
      } 
      Long long_1 = paramBuilder.post_id;
      if (long_1 == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_1;
      } 
      this.game_info = paramBuilder.game_info;
      Integer integer1 = paramBuilder.discount_price;
      if (integer1 == null) {
        this.discount_price = DEFAULT_DISCOUNT_PRICE;
      } else {
        this.discount_price = integer1;
      } 
      integer1 = paramBuilder.has_order;
      if (integer1 == null) {
        this.has_order = DEFAULT_HAS_ORDER;
      } else {
        this.has_order = integer1;
      } 
      integer1 = paramBuilder.goods_type;
      if (integer1 == null) {
        this.goods_type = DEFAULT_GOODS_TYPE;
      } else {
        this.goods_type = integer1;
      } 
      integer1 = paramBuilder.is_landmine;
      if (integer1 == null) {
        this.is_landmine = DEFAULT_IS_LANDMINE;
      } else {
        this.is_landmine = integer1;
      } 
      this.poll_info = paramBuilder.poll_info;
      integer1 = paramBuilder.is_frs_mask;
      if (integer1 == null) {
        this.is_frs_mask = DEFAULT_IS_FRS_MASK;
      } else {
        this.is_frs_mask = integer1;
      } 
      integer1 = paramBuilder.channel_id;
      if (integer1 == null) {
        this.channel_id = DEFAULT_CHANNEL_ID;
      } else {
        this.channel_id = integer1;
      } 
      this.kjs_account_detail = paramBuilder.kjs_account_detail;
    } else {
      this.goods_name = paramBuilder.goods_name;
      this.price = paramBuilder.price;
      this.sales = paramBuilder.sales;
      this.recommend_info = paramBuilder.recommend_info;
      this.card_style = paramBuilder.card_style;
      this.channel_info = paramBuilder.channel_info;
      this.cover_img = paramBuilder.cover_img;
      this.url = paramBuilder.url;
      this.thread_id = paramBuilder.thread_id;
      this.listing_reason = paramBuilder.listing_reason;
      this.comment_info = paramBuilder.comment_info;
      this.scheme = paramBuilder.scheme;
      this.goods_desc = paramBuilder.goods_desc;
      this.goods_id = paramBuilder.goods_id;
      this.estimated_earnings = paramBuilder.estimated_earnings;
      this.audit_reason = paramBuilder.audit_reason;
      this.img_list = Message.immutableCopyOf(paramBuilder.img_list);
      this.forum_id = paramBuilder.forum_id;
      this.goods_status = paramBuilder.goods_status;
      this.source_url = paramBuilder.source_url;
      this.view_info = paramBuilder.view_info;
      this.agree_count = paramBuilder.agree_count;
      this.forum_name = paramBuilder.forum_name;
      this.forum_avatar = paramBuilder.forum_avatar;
      this.shop_desc = paramBuilder.shop_desc;
      this.discount_type = paramBuilder.discount_type;
      this.pv = paramBuilder.pv;
      this.need_notice = paramBuilder.need_notice;
      this.goods_label = paramBuilder.goods_label;
      this.preferential_price = paramBuilder.preferential_price;
      this.second_scheme = paramBuilder.second_scheme;
      this.coupon_type = paramBuilder.coupon_type;
      this.tag_list = Message.immutableCopyOf(paramBuilder.tag_list);
      this.post_id = paramBuilder.post_id;
      this.game_info = paramBuilder.game_info;
      this.discount_price = paramBuilder.discount_price;
      this.has_order = paramBuilder.has_order;
      this.goods_type = paramBuilder.goods_type;
      this.is_landmine = paramBuilder.is_landmine;
      this.poll_info = paramBuilder.poll_info;
      this.is_frs_mask = paramBuilder.is_frs_mask;
      this.channel_id = paramBuilder.channel_id;
      this.kjs_account_detail = paramBuilder.kjs_account_detail;
    } 
  }
  
  public static final class Builder extends Message.Builder<ShopGoodsInfo> {
    public Long agree_count;
    
    public String audit_reason;
    
    public Integer card_style;
    
    public Integer channel_id;
    
    public ShopGoodsChannelInfo channel_info;
    
    public ShopGoodsCommentInfo comment_info;
    
    public Integer coupon_type;
    
    public String cover_img;
    
    public Integer discount_price;
    
    public Integer discount_type;
    
    public Integer estimated_earnings;
    
    public String forum_avatar;
    
    public Long forum_id;
    
    public String forum_name;
    
    public ShopGoodsGameInfo game_info;
    
    public String goods_desc;
    
    public Integer goods_id;
    
    public String goods_label;
    
    public String goods_name;
    
    public Integer goods_status;
    
    public Integer goods_type;
    
    public Integer has_order;
    
    public List<String> img_list;
    
    public Integer is_frs_mask;
    
    public Integer is_landmine;
    
    public KjsAccountDetail kjs_account_detail;
    
    public ListingReason listing_reason;
    
    public String need_notice;
    
    public PollInfo poll_info;
    
    public Long post_id;
    
    public Integer preferential_price;
    
    public Integer price;
    
    public String pv;
    
    public ShopGoodsRecommendInfo recommend_info;
    
    public Long sales;
    
    public String scheme;
    
    public String second_scheme;
    
    public String shop_desc;
    
    public String source_url;
    
    public List<ThemeColorInfo> tag_list;
    
    public Long thread_id;
    
    public String url;
    
    public ShopGoodsCommentInfo view_info;
    
    public Builder() {}
    
    public Builder(ShopGoodsInfo param1ShopGoodsInfo) {
      super(param1ShopGoodsInfo);
      if (param1ShopGoodsInfo == null)
        return; 
      this.goods_name = param1ShopGoodsInfo.goods_name;
      this.price = param1ShopGoodsInfo.price;
      this.sales = param1ShopGoodsInfo.sales;
      this.recommend_info = param1ShopGoodsInfo.recommend_info;
      this.card_style = param1ShopGoodsInfo.card_style;
      this.channel_info = param1ShopGoodsInfo.channel_info;
      this.cover_img = param1ShopGoodsInfo.cover_img;
      this.url = param1ShopGoodsInfo.url;
      this.thread_id = param1ShopGoodsInfo.thread_id;
      this.listing_reason = param1ShopGoodsInfo.listing_reason;
      this.comment_info = param1ShopGoodsInfo.comment_info;
      this.scheme = param1ShopGoodsInfo.scheme;
      this.goods_desc = param1ShopGoodsInfo.goods_desc;
      this.goods_id = param1ShopGoodsInfo.goods_id;
      this.estimated_earnings = param1ShopGoodsInfo.estimated_earnings;
      this.audit_reason = param1ShopGoodsInfo.audit_reason;
      this.img_list = Message.copyOf(param1ShopGoodsInfo.img_list);
      this.forum_id = param1ShopGoodsInfo.forum_id;
      this.goods_status = param1ShopGoodsInfo.goods_status;
      this.source_url = param1ShopGoodsInfo.source_url;
      this.view_info = param1ShopGoodsInfo.view_info;
      this.agree_count = param1ShopGoodsInfo.agree_count;
      this.forum_name = param1ShopGoodsInfo.forum_name;
      this.forum_avatar = param1ShopGoodsInfo.forum_avatar;
      this.shop_desc = param1ShopGoodsInfo.shop_desc;
      this.discount_type = param1ShopGoodsInfo.discount_type;
      this.pv = param1ShopGoodsInfo.pv;
      this.need_notice = param1ShopGoodsInfo.need_notice;
      this.goods_label = param1ShopGoodsInfo.goods_label;
      this.preferential_price = param1ShopGoodsInfo.preferential_price;
      this.second_scheme = param1ShopGoodsInfo.second_scheme;
      this.coupon_type = param1ShopGoodsInfo.coupon_type;
      this.tag_list = Message.copyOf(param1ShopGoodsInfo.tag_list);
      this.post_id = param1ShopGoodsInfo.post_id;
      this.game_info = param1ShopGoodsInfo.game_info;
      this.discount_price = param1ShopGoodsInfo.discount_price;
      this.has_order = param1ShopGoodsInfo.has_order;
      this.goods_type = param1ShopGoodsInfo.goods_type;
      this.is_landmine = param1ShopGoodsInfo.is_landmine;
      this.poll_info = param1ShopGoodsInfo.poll_info;
      this.is_frs_mask = param1ShopGoodsInfo.is_frs_mask;
      this.channel_id = param1ShopGoodsInfo.channel_id;
      this.kjs_account_detail = param1ShopGoodsInfo.kjs_account_detail;
    }
    
    public ShopGoodsInfo build(boolean param1Boolean) {
      return new ShopGoodsInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
