package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ShopGoodsRecommendUserInfo extends Message {
  public static final Integer DEFAULT_FORUM_LEVEL = Integer.valueOf(0);
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer forum_level;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String user_name;
  
  public ShopGoodsRecommendUserInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.user_name;
      if (str1 == null) {
        this.user_name = "";
      } else {
        this.user_name = str1;
      } 
      Integer integer = paramBuilder.forum_level;
      if (integer == null) {
        this.forum_level = DEFAULT_FORUM_LEVEL;
      } else {
        this.forum_level = integer;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
    } else {
      this.user_name = ((Builder)str).user_name;
      this.forum_level = ((Builder)str).forum_level;
      this.portrait = ((Builder)str).portrait;
    } 
  }
  
  public static final class Builder extends Message.Builder<ShopGoodsRecommendUserInfo> {
    public Integer forum_level;
    
    public String portrait;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(ShopGoodsRecommendUserInfo param1ShopGoodsRecommendUserInfo) {
      super(param1ShopGoodsRecommendUserInfo);
      if (param1ShopGoodsRecommendUserInfo == null)
        return; 
      this.user_name = param1ShopGoodsRecommendUserInfo.user_name;
      this.forum_level = param1ShopGoodsRecommendUserInfo.forum_level;
      this.portrait = param1ShopGoodsRecommendUserInfo.portrait;
    }
    
    public ShopGoodsRecommendUserInfo build(boolean param1Boolean) {
      return new ShopGoodsRecommendUserInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
