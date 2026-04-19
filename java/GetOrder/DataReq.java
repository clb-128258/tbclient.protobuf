package tbclient.GetOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
import tbclient.Wares;

public final class DataReq extends Message {
  public static final String DEFAULT_CLICK_ZONE = "";
  
  public static final Integer DEFAULT_DIALOG_TYPE;
  
  public static final Long DEFAULT_FROM_SCENE;
  
  public static final Integer DEFAULT_GOOD_ID;
  
  public static final Integer DEFAULT_IS_AUTOPAY;
  
  public static final Integer DEFAULT_IS_LEFT;
  
  public static final String DEFAULT_MOBILE = "";
  
  public static final String DEFAULT_ORDER_URL = "";
  
  public static final String DEFAULT_PAYMENT_EXTRA = "";
  
  public static final String DEFAULT_PAYMENT_POS_KEY = "";
  
  public static final Integer DEFAULT_PAY_TYPE;
  
  public static final String DEFAULT_REFER_PAGE = "";
  
  public static final Integer DEFAULT_SCENE_ID;
  
  public static final String DEFAULT_WALLET_SDK_UA = "";
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String click_zone;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer dialog_type;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT64)
  public final Long from_scene;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer good_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_autopay;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer is_left;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String mobile;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String order_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer pay_type;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String payment_extra;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String payment_pos_key;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String refer_page;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer scene_id;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String wallet_sdk_ua;
  
  @ProtoField(tag = 6)
  public final Wares wares;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PAY_TYPE = integer;
    DEFAULT_IS_LEFT = integer;
    DEFAULT_IS_AUTOPAY = integer;
    DEFAULT_FROM_SCENE = Long.valueOf(0L);
    DEFAULT_GOOD_ID = integer;
    DEFAULT_SCENE_ID = integer;
    DEFAULT_DIALOG_TYPE = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer3 = paramBuilder.pay_type;
      if (integer3 == null) {
        this.pay_type = DEFAULT_PAY_TYPE;
      } else {
        this.pay_type = integer3;
      } 
      integer3 = paramBuilder.is_left;
      if (integer3 == null) {
        this.is_left = DEFAULT_IS_LEFT;
      } else {
        this.is_left = integer3;
      } 
      String str2 = paramBuilder.order_url;
      if (str2 == null) {
        this.order_url = "";
      } else {
        this.order_url = str2;
      } 
      str2 = paramBuilder.mobile;
      if (str2 == null) {
        this.mobile = "";
      } else {
        this.mobile = str2;
      } 
      this.wares = paramBuilder.wares;
      Integer integer2 = paramBuilder.is_autopay;
      if (integer2 == null) {
        this.is_autopay = DEFAULT_IS_AUTOPAY;
      } else {
        this.is_autopay = integer2;
      } 
      String str1 = paramBuilder.payment_pos_key;
      if (str1 == null) {
        this.payment_pos_key = "";
      } else {
        this.payment_pos_key = str1;
      } 
      str1 = paramBuilder.refer_page;
      if (str1 == null) {
        this.refer_page = "";
      } else {
        this.refer_page = str1;
      } 
      str1 = paramBuilder.click_zone;
      if (str1 == null) {
        this.click_zone = "";
      } else {
        this.click_zone = str1;
      } 
      str1 = paramBuilder.wallet_sdk_ua;
      if (str1 == null) {
        this.wallet_sdk_ua = "";
      } else {
        this.wallet_sdk_ua = str1;
      } 
      Long long_ = paramBuilder.from_scene;
      if (long_ == null) {
        this.from_scene = DEFAULT_FROM_SCENE;
      } else {
        this.from_scene = long_;
      } 
      Integer integer1 = paramBuilder.good_id;
      if (integer1 == null) {
        this.good_id = DEFAULT_GOOD_ID;
      } else {
        this.good_id = integer1;
      } 
      integer1 = paramBuilder.scene_id;
      if (integer1 == null) {
        this.scene_id = DEFAULT_SCENE_ID;
      } else {
        this.scene_id = integer1;
      } 
      integer1 = paramBuilder.dialog_type;
      if (integer1 == null) {
        this.dialog_type = DEFAULT_DIALOG_TYPE;
      } else {
        this.dialog_type = integer1;
      } 
      str = paramBuilder.payment_extra;
      if (str == null) {
        this.payment_extra = "";
      } else {
        this.payment_extra = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.pay_type = ((Builder)str).pay_type;
      this.is_left = ((Builder)str).is_left;
      this.order_url = ((Builder)str).order_url;
      this.mobile = ((Builder)str).mobile;
      this.wares = ((Builder)str).wares;
      this.is_autopay = ((Builder)str).is_autopay;
      this.payment_pos_key = ((Builder)str).payment_pos_key;
      this.refer_page = ((Builder)str).refer_page;
      this.click_zone = ((Builder)str).click_zone;
      this.wallet_sdk_ua = ((Builder)str).wallet_sdk_ua;
      this.from_scene = ((Builder)str).from_scene;
      this.good_id = ((Builder)str).good_id;
      this.scene_id = ((Builder)str).scene_id;
      this.dialog_type = ((Builder)str).dialog_type;
      this.payment_extra = ((Builder)str).payment_extra;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public String click_zone;
    
    public CommonReq common;
    
    public Integer dialog_type;
    
    public Long from_scene;
    
    public Integer good_id;
    
    public Integer is_autopay;
    
    public Integer is_left;
    
    public String mobile;
    
    public String order_url;
    
    public Integer pay_type;
    
    public String payment_extra;
    
    public String payment_pos_key;
    
    public String refer_page;
    
    public Integer scene_id;
    
    public String wallet_sdk_ua;
    
    public Wares wares;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.pay_type = param1DataReq.pay_type;
      this.is_left = param1DataReq.is_left;
      this.order_url = param1DataReq.order_url;
      this.mobile = param1DataReq.mobile;
      this.wares = param1DataReq.wares;
      this.is_autopay = param1DataReq.is_autopay;
      this.payment_pos_key = param1DataReq.payment_pos_key;
      this.refer_page = param1DataReq.refer_page;
      this.click_zone = param1DataReq.click_zone;
      this.wallet_sdk_ua = param1DataReq.wallet_sdk_ua;
      this.from_scene = param1DataReq.from_scene;
      this.good_id = param1DataReq.good_id;
      this.scene_id = param1DataReq.scene_id;
      this.dialog_type = param1DataReq.dialog_type;
      this.payment_extra = param1DataReq.payment_extra;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean);
    }
  }
}
