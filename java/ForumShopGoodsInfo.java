package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumShopGoodsInfo extends Message {
  @ProtoField(tag = 1)
  public final ShopGoodsInfo goods_info;
  
  @ProtoField(tag = 3)
  public final KjsAccountInfo kjs_account_info;
  
  @ProtoField(tag = 2)
  public final ForumShopRoleInfo role_info;
  
  public ForumShopGoodsInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.goods_info = paramBuilder.goods_info;
      this.role_info = paramBuilder.role_info;
      this.kjs_account_info = paramBuilder.kjs_account_info;
    } else {
      this.goods_info = paramBuilder.goods_info;
      this.role_info = paramBuilder.role_info;
      this.kjs_account_info = paramBuilder.kjs_account_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumShopGoodsInfo> {
    public ShopGoodsInfo goods_info;
    
    public KjsAccountInfo kjs_account_info;
    
    public ForumShopRoleInfo role_info;
    
    public Builder() {}
    
    public Builder(ForumShopGoodsInfo param1ForumShopGoodsInfo) {
      super(param1ForumShopGoodsInfo);
      if (param1ForumShopGoodsInfo == null)
        return; 
      this.goods_info = param1ForumShopGoodsInfo.goods_info;
      this.role_info = param1ForumShopGoodsInfo.role_info;
      this.kjs_account_info = param1ForumShopGoodsInfo.kjs_account_info;
    }
    
    public ForumShopGoodsInfo build(boolean param1Boolean) {
      return new ForumShopGoodsInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
