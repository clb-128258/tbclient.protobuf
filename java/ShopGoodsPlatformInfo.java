package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ShopGoodsPlatformInfo extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_ICON_DARK = "";
  
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_NAME = "";
  
  public static final List<ShopGoodsGameSKUInfo> DEFAULT_SKU_LIST = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String icon_dark;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<ShopGoodsGameSKUInfo> sku_list;
  
  public ShopGoodsPlatformInfo(Builder paramBuilder, boolean paramBoolean) {
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
      str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      List<ShopGoodsGameSKUInfo> list = paramBuilder.sku_list;
      if (list == null) {
        this.sku_list = DEFAULT_SKU_LIST;
      } else {
        this.sku_list = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.icon_dark;
      if (str == null) {
        this.icon_dark = "";
      } else {
        this.icon_dark = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.icon = ((Builder)str).icon;
      this.name = ((Builder)str).name;
      this.sku_list = Message.immutableCopyOf(((Builder)str).sku_list);
      this.icon_dark = ((Builder)str).icon_dark;
    } 
  }
  
  public static final class Builder extends Message.Builder<ShopGoodsPlatformInfo> {
    public String icon;
    
    public String icon_dark;
    
    public Integer id;
    
    public String name;
    
    public List<ShopGoodsGameSKUInfo> sku_list;
    
    public Builder() {}
    
    public Builder(ShopGoodsPlatformInfo param1ShopGoodsPlatformInfo) {
      super(param1ShopGoodsPlatformInfo);
      if (param1ShopGoodsPlatformInfo == null)
        return; 
      this.id = param1ShopGoodsPlatformInfo.id;
      this.icon = param1ShopGoodsPlatformInfo.icon;
      this.name = param1ShopGoodsPlatformInfo.name;
      this.sku_list = Message.copyOf(param1ShopGoodsPlatformInfo.sku_list);
      this.icon_dark = param1ShopGoodsPlatformInfo.icon_dark;
    }
    
    public ShopGoodsPlatformInfo build(boolean param1Boolean) {
      return new ShopGoodsPlatformInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
