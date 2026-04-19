package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ShopGoodsGameInfo extends Message {
  public static final String DEFAULT_APP_ID = "";
  
  public static final List<String> DEFAULT_CATEGORY;
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_GAME_NAME = "";
  
  public static final String DEFAULT_GAME_NAME_EN = "";
  
  public static final String DEFAULT_GAME_TYPE = "";
  
  public static final List<String> DEFAULT_IMG_URL;
  
  public static final List<ShopGoodsPlatformInfo> DEFAULT_PLATFORM = Collections.emptyList();
  
  public static final String DEFAULT_VERTICAL_MSG = "";
  
  public static final List<String> DEFAULT_VIDEO_URL;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String app_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
  public final List<String> category;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String game_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String game_name_en;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String game_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
  public final List<String> img_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ShopGoodsPlatformInfo> platform;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String vertical_msg;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
  public final List<String> video_url;
  
  static {
    DEFAULT_CATEGORY = Collections.emptyList();
    DEFAULT_VIDEO_URL = Collections.emptyList();
    DEFAULT_IMG_URL = Collections.emptyList();
  }
  
  public ShopGoodsGameInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.game_name;
      if (str2 == null) {
        this.game_name = "";
      } else {
        this.game_name = str2;
      } 
      List<ShopGoodsPlatformInfo> list1 = paramBuilder.platform;
      if (list1 == null) {
        this.platform = DEFAULT_PLATFORM;
      } else {
        this.platform = Message.immutableCopyOf(list1);
      } 
      List<String> list = paramBuilder.category;
      if (list == null) {
        this.category = DEFAULT_CATEGORY;
      } else {
        this.category = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.video_url;
      if (list == null) {
        this.video_url = DEFAULT_VIDEO_URL;
      } else {
        this.video_url = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.img_url;
      if (list == null) {
        this.img_url = DEFAULT_IMG_URL;
      } else {
        this.img_url = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.game_name_en;
      if (str1 == null) {
        this.game_name_en = "";
      } else {
        this.game_name_en = str1;
      } 
      str1 = paramBuilder.desc;
      if (str1 == null) {
        this.desc = "";
      } else {
        this.desc = str1;
      } 
      str1 = paramBuilder.app_id;
      if (str1 == null) {
        this.app_id = "";
      } else {
        this.app_id = str1;
      } 
      str1 = paramBuilder.game_type;
      if (str1 == null) {
        this.game_type = "";
      } else {
        this.game_type = str1;
      } 
      str = paramBuilder.vertical_msg;
      if (str == null) {
        this.vertical_msg = "";
      } else {
        this.vertical_msg = str;
      } 
    } else {
      this.game_name = ((Builder)str).game_name;
      this.platform = Message.immutableCopyOf(((Builder)str).platform);
      this.category = Message.immutableCopyOf(((Builder)str).category);
      this.video_url = Message.immutableCopyOf(((Builder)str).video_url);
      this.img_url = Message.immutableCopyOf(((Builder)str).img_url);
      this.game_name_en = ((Builder)str).game_name_en;
      this.desc = ((Builder)str).desc;
      this.app_id = ((Builder)str).app_id;
      this.game_type = ((Builder)str).game_type;
      this.vertical_msg = ((Builder)str).vertical_msg;
    } 
  }
  
  public static final class Builder extends Message.Builder<ShopGoodsGameInfo> {
    public String app_id;
    
    public List<String> category;
    
    public String desc;
    
    public String game_name;
    
    public String game_name_en;
    
    public String game_type;
    
    public List<String> img_url;
    
    public List<ShopGoodsPlatformInfo> platform;
    
    public String vertical_msg;
    
    public List<String> video_url;
    
    public Builder() {}
    
    public Builder(ShopGoodsGameInfo param1ShopGoodsGameInfo) {
      super(param1ShopGoodsGameInfo);
      if (param1ShopGoodsGameInfo == null)
        return; 
      this.game_name = param1ShopGoodsGameInfo.game_name;
      this.platform = Message.copyOf(param1ShopGoodsGameInfo.platform);
      this.category = Message.copyOf(param1ShopGoodsGameInfo.category);
      this.video_url = Message.copyOf(param1ShopGoodsGameInfo.video_url);
      this.img_url = Message.copyOf(param1ShopGoodsGameInfo.img_url);
      this.game_name_en = param1ShopGoodsGameInfo.game_name_en;
      this.desc = param1ShopGoodsGameInfo.desc;
      this.app_id = param1ShopGoodsGameInfo.app_id;
      this.game_type = param1ShopGoodsGameInfo.game_type;
      this.vertical_msg = param1ShopGoodsGameInfo.vertical_msg;
    }
    
    public ShopGoodsGameInfo build(boolean param1Boolean) {
      return new ShopGoodsGameInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
