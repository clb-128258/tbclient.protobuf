package tbclient.AdBid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;
import tbclient.BannerList;
import tbclient.User;

public final class DataRes extends Message {
  public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1)
  public final BannerList banner_list;
  
  @ProtoField(tag = 2)
  public final AlaLiveInfo recom_ala_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<User> user_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<User> list;
    if (paramBoolean == true) {
      this.banner_list = paramBuilder.banner_list;
      this.recom_ala_info = paramBuilder.recom_ala_info;
      list = paramBuilder.user_list;
      if (list == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.banner_list = ((Builder)list).banner_list;
      this.recom_ala_info = ((Builder)list).recom_ala_info;
      this.user_list = Message.immutableCopyOf(((Builder)list).user_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public BannerList banner_list;
    
    public AlaLiveInfo recom_ala_info;
    
    public List<User> user_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.banner_list = param1DataRes.banner_list;
      this.recom_ala_info = param1DataRes.recom_ala_info;
      this.user_list = Message.copyOf(param1DataRes.user_list);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
