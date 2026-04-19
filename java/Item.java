package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Item extends Message {
  public static final Integer DEFAULT_ABLE_CANCEL_SUBSCRIBE;
  
  public static final String DEFAULT_APK_NAME = "";
  
  public static final String DEFAULT_BUTTON_LINK = "";
  
  public static final Integer DEFAULT_BUTTON_LINK_TYPE;
  
  public static final String DEFAULT_BUTTON_NAME = "";
  
  public static final Integer DEFAULT_CATEGORY_ID;
  
  public static final String DEFAULT_ERR_TOAST = "";
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_GAME_ID = "";
  
  public static final Double DEFAULT_ICON_SIZE;
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_ITEM_APPID = "";
  
  public static final Long DEFAULT_ITEM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_ITEM_NAME = "";
  
  public static final Double DEFAULT_SCORE;
  
  public static final Integer DEFAULT_STAR;
  
  public static final List<String> DEFAULT_TAGS;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer able_cancel_subscribe;
  
  @ProtoField(tag = 15)
  public final ApkDetail apk_detail;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String apk_name;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String button_link;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer button_link_type;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String button_name;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer category_id;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String err_toast;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String game_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.DOUBLE)
  public final Double icon_size;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String item_appid;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long item_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String item_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
  public final Double score;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer star;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
  public final List<String> tags;
  
  static {
    Double double_ = Double.valueOf(0.0D);
    DEFAULT_ICON_SIZE = double_;
    DEFAULT_TAGS = Collections.emptyList();
    DEFAULT_SCORE = double_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_STAR = integer;
    DEFAULT_CATEGORY_ID = integer;
    DEFAULT_BUTTON_LINK_TYPE = integer;
    DEFAULT_ABLE_CANCEL_SUBSCRIBE = integer;
  }
  
  public Item(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.item_id;
      if (long_ == null) {
        this.item_id = DEFAULT_ITEM_ID;
      } else {
        this.item_id = long_;
      } 
      String str4 = paramBuilder.item_name;
      if (str4 == null) {
        this.item_name = "";
      } else {
        this.item_name = str4;
      } 
      Double double_2 = paramBuilder.icon_size;
      if (double_2 == null) {
        this.icon_size = DEFAULT_ICON_SIZE;
      } else {
        this.icon_size = double_2;
      } 
      String str3 = paramBuilder.icon_url;
      if (str3 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str3;
      } 
      List<String> list = paramBuilder.tags;
      if (list == null) {
        this.tags = DEFAULT_TAGS;
      } else {
        this.tags = Message.immutableCopyOf(list);
      } 
      Double double_1 = paramBuilder.score;
      if (double_1 == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = double_1;
      } 
      Integer integer2 = paramBuilder.star;
      if (integer2 == null) {
        this.star = DEFAULT_STAR;
      } else {
        this.star = integer2;
      } 
      String str2 = paramBuilder.button_name;
      if (str2 == null) {
        this.button_name = "";
      } else {
        this.button_name = str2;
      } 
      str2 = paramBuilder.button_link;
      if (str2 == null) {
        this.button_link = "";
      } else {
        this.button_link = str2;
      } 
      str2 = paramBuilder.item_appid;
      if (str2 == null) {
        this.item_appid = "";
      } else {
        this.item_appid = str2;
      } 
      Integer integer1 = paramBuilder.category_id;
      if (integer1 == null) {
        this.category_id = DEFAULT_CATEGORY_ID;
      } else {
        this.category_id = integer1;
      } 
      integer1 = paramBuilder.button_link_type;
      if (integer1 == null) {
        this.button_link_type = DEFAULT_BUTTON_LINK_TYPE;
      } else {
        this.button_link_type = integer1;
      } 
      String str1 = paramBuilder.apk_name;
      if (str1 == null) {
        this.apk_name = "";
      } else {
        this.apk_name = str1;
      } 
      str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      this.apk_detail = paramBuilder.apk_detail;
      str1 = paramBuilder.game_id;
      if (str1 == null) {
        this.game_id = "";
      } else {
        this.game_id = str1;
      } 
      str1 = paramBuilder.err_toast;
      if (str1 == null) {
        this.err_toast = "";
      } else {
        this.err_toast = str1;
      } 
      integer = paramBuilder.able_cancel_subscribe;
      if (integer == null) {
        this.able_cancel_subscribe = DEFAULT_ABLE_CANCEL_SUBSCRIBE;
      } else {
        this.able_cancel_subscribe = integer;
      } 
    } else {
      this.item_id = ((Builder)integer).item_id;
      this.item_name = ((Builder)integer).item_name;
      this.icon_size = ((Builder)integer).icon_size;
      this.icon_url = ((Builder)integer).icon_url;
      this.tags = Message.immutableCopyOf(((Builder)integer).tags);
      this.score = ((Builder)integer).score;
      this.star = ((Builder)integer).star;
      this.button_name = ((Builder)integer).button_name;
      this.button_link = ((Builder)integer).button_link;
      this.item_appid = ((Builder)integer).item_appid;
      this.category_id = ((Builder)integer).category_id;
      this.button_link_type = ((Builder)integer).button_link_type;
      this.apk_name = ((Builder)integer).apk_name;
      this.forum_name = ((Builder)integer).forum_name;
      this.apk_detail = ((Builder)integer).apk_detail;
      this.game_id = ((Builder)integer).game_id;
      this.err_toast = ((Builder)integer).err_toast;
      this.able_cancel_subscribe = ((Builder)integer).able_cancel_subscribe;
    } 
  }
  
  public static final class Builder extends Message.Builder<Item> {
    public Integer able_cancel_subscribe;
    
    public ApkDetail apk_detail;
    
    public String apk_name;
    
    public String button_link;
    
    public Integer button_link_type;
    
    public String button_name;
    
    public Integer category_id;
    
    public String err_toast;
    
    public String forum_name;
    
    public String game_id;
    
    public Double icon_size;
    
    public String icon_url;
    
    public String item_appid;
    
    public Long item_id;
    
    public String item_name;
    
    public Double score;
    
    public Integer star;
    
    public List<String> tags;
    
    public Builder() {}
    
    public Builder(Item param1Item) {
      super(param1Item);
      if (param1Item == null)
        return; 
      this.item_id = param1Item.item_id;
      this.item_name = param1Item.item_name;
      this.icon_size = param1Item.icon_size;
      this.icon_url = param1Item.icon_url;
      this.tags = Message.copyOf(param1Item.tags);
      this.score = param1Item.score;
      this.star = param1Item.star;
      this.button_name = param1Item.button_name;
      this.button_link = param1Item.button_link;
      this.item_appid = param1Item.item_appid;
      this.category_id = param1Item.category_id;
      this.button_link_type = param1Item.button_link_type;
      this.apk_name = param1Item.apk_name;
      this.forum_name = param1Item.forum_name;
      this.apk_detail = param1Item.apk_detail;
      this.game_id = param1Item.game_id;
      this.err_toast = param1Item.err_toast;
      this.able_cancel_subscribe = param1Item.able_cancel_subscribe;
    }
    
    public Item build(boolean param1Boolean) {
      return new Item(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
