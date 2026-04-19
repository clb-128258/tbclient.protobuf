package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ShopGoodsGameSKUInfo extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final Integer DEFAULT_ID;
  
  public static final Integer DEFAULT_PRICE;
  
  public static final Integer DEFAULT_STOCK;
  
  public static final String DEFAULT_VERSION_TAB = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer id;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer price;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer stock;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String version_tab;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ID = integer;
    DEFAULT_STOCK = integer;
    DEFAULT_PRICE = integer;
  }
  
  public ShopGoodsGameSKUInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.id;
      if (integer2 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer2;
      } 
      String str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
      str = paramBuilder.version_tab;
      if (str == null) {
        this.version_tab = "";
      } else {
        this.version_tab = str;
      } 
      Integer integer1 = paramBuilder.stock;
      if (integer1 == null) {
        this.stock = DEFAULT_STOCK;
      } else {
        this.stock = integer1;
      } 
      integer = paramBuilder.price;
      if (integer == null) {
        this.price = DEFAULT_PRICE;
      } else {
        this.price = integer;
      } 
    } else {
      this.id = ((Builder)integer).id;
      this.content = ((Builder)integer).content;
      this.version_tab = ((Builder)integer).version_tab;
      this.stock = ((Builder)integer).stock;
      this.price = ((Builder)integer).price;
    } 
  }
  
  public static final class Builder extends Message.Builder<ShopGoodsGameSKUInfo> {
    public String content;
    
    public Integer id;
    
    public Integer price;
    
    public Integer stock;
    
    public String version_tab;
    
    public Builder() {}
    
    public Builder(ShopGoodsGameSKUInfo param1ShopGoodsGameSKUInfo) {
      super(param1ShopGoodsGameSKUInfo);
      if (param1ShopGoodsGameSKUInfo == null)
        return; 
      this.id = param1ShopGoodsGameSKUInfo.id;
      this.content = param1ShopGoodsGameSKUInfo.content;
      this.version_tab = param1ShopGoodsGameSKUInfo.version_tab;
      this.stock = param1ShopGoodsGameSKUInfo.stock;
      this.price = param1ShopGoodsGameSKUInfo.price;
    }
    
    public ShopGoodsGameSKUInfo build(boolean param1Boolean) {
      return new ShopGoodsGameSKUInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
