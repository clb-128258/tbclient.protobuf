package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ShopGoodsRecommendInfo extends Message {
  public static final Integer DEFAULT_COUNT;
  
  public static final Integer DEFAULT_RECOMMEND_STATUS;
  
  public static final String DEFAULT_SUB_TITLE = "";
  
  public static final List<ShopGoodsRecommendUserInfo> DEFAULT_USER_INFO = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer count;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer recommend_status;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String sub_title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ShopGoodsRecommendUserInfo> user_info;
  
  public ShopGoodsRecommendInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.count;
      if (integer == null) {
        this.count = DEFAULT_COUNT;
      } else {
        this.count = integer;
      } 
      integer = paramBuilder.recommend_status;
      if (integer == null) {
        this.recommend_status = DEFAULT_RECOMMEND_STATUS;
      } else {
        this.recommend_status = integer;
      } 
      List<ShopGoodsRecommendUserInfo> list = paramBuilder.user_info;
      if (list == null) {
        this.user_info = DEFAULT_USER_INFO;
      } else {
        this.user_info = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.sub_title;
      if (str == null) {
        this.sub_title = "";
      } else {
        this.sub_title = str;
      } 
    } else {
      this.count = ((Builder)str).count;
      this.recommend_status = ((Builder)str).recommend_status;
      this.user_info = Message.immutableCopyOf(((Builder)str).user_info);
      this.sub_title = ((Builder)str).sub_title;
    } 
  }
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_COUNT = integer;
    DEFAULT_RECOMMEND_STATUS = integer;
  }
  
  public static final class Builder extends Message.Builder<ShopGoodsRecommendInfo> {
    public Integer count;
    
    public Integer recommend_status;
    
    public String sub_title;
    
    public List<ShopGoodsRecommendUserInfo> user_info;
    
    public Builder() {}
    
    public Builder(ShopGoodsRecommendInfo param1ShopGoodsRecommendInfo) {
      super(param1ShopGoodsRecommendInfo);
      if (param1ShopGoodsRecommendInfo == null)
        return; 
      this.count = param1ShopGoodsRecommendInfo.count;
      this.recommend_status = param1ShopGoodsRecommendInfo.recommend_status;
      this.user_info = Message.copyOf(param1ShopGoodsRecommendInfo.user_info);
      this.sub_title = param1ShopGoodsRecommendInfo.sub_title;
    }
    
    public ShopGoodsRecommendInfo build(boolean param1Boolean) {
      return new ShopGoodsRecommendInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
