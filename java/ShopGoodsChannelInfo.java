package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ShopGoodsChannelInfo extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  public ShopGoodsChannelInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      String str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.icon = ((Builder)str).icon;
      this.name = ((Builder)str).name;
    } 
  }
  
  public static final class Builder extends Message.Builder<ShopGoodsChannelInfo> {
    public String icon;
    
    public Integer id;
    
    public String name;
    
    public Builder() {}
    
    public Builder(ShopGoodsChannelInfo param1ShopGoodsChannelInfo) {
      super(param1ShopGoodsChannelInfo);
      if (param1ShopGoodsChannelInfo == null)
        return; 
      this.id = param1ShopGoodsChannelInfo.id;
      this.icon = param1ShopGoodsChannelInfo.icon;
      this.name = param1ShopGoodsChannelInfo.name;
    }
    
    public ShopGoodsChannelInfo build(boolean param1Boolean) {
      return new ShopGoodsChannelInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
