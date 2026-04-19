package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ShopGoodsCommentInfo extends Message {
  public static final Integer DEFAULT_COUNT = Integer.valueOf(0);
  
  public static final List<String> DEFAULT_PORTRAIT = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer count;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
  public final List<String> portrait;
  
  public ShopGoodsCommentInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.count;
      if (integer == null) {
        this.count = DEFAULT_COUNT;
      } else {
        this.count = integer;
      } 
      list = paramBuilder.portrait;
      if (list == null) {
        this.portrait = DEFAULT_PORTRAIT;
      } else {
        this.portrait = Message.immutableCopyOf(list);
      } 
    } else {
      this.count = ((Builder)list).count;
      this.portrait = Message.immutableCopyOf(((Builder)list).portrait);
    } 
  }
  
  public static final class Builder extends Message.Builder<ShopGoodsCommentInfo> {
    public Integer count;
    
    public List<String> portrait;
    
    public Builder() {}
    
    public Builder(ShopGoodsCommentInfo param1ShopGoodsCommentInfo) {
      super(param1ShopGoodsCommentInfo);
      if (param1ShopGoodsCommentInfo == null)
        return; 
      this.count = param1ShopGoodsCommentInfo.count;
      this.portrait = Message.copyOf(param1ShopGoodsCommentInfo.portrait);
    }
    
    public ShopGoodsCommentInfo build(boolean param1Boolean) {
      return new ShopGoodsCommentInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
