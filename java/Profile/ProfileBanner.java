package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BannerImage;
import tbclient.FeedKV;

public final class ProfileBanner extends Message {
  public static final List<BannerImage> DEFAULT_BANNER_LIST = Collections.emptyList();
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<BannerImage> banner_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedKV> log_param;
  
  public ProfileBanner(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      List<BannerImage> list1 = paramBuilder.banner_list;
      if (list1 == null) {
        this.banner_list = DEFAULT_BANNER_LIST;
      } else {
        this.banner_list = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
    } else {
      this.banner_list = Message.immutableCopyOf(((Builder)list).banner_list);
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
    } 
  }
  
  public static final class Builder extends Message.Builder<ProfileBanner> {
    public List<BannerImage> banner_list;
    
    public List<FeedKV> log_param;
    
    public Builder() {}
    
    public Builder(ProfileBanner param1ProfileBanner) {
      super(param1ProfileBanner);
      if (param1ProfileBanner == null)
        return; 
      this.banner_list = Message.copyOf(param1ProfileBanner.banner_list);
      this.log_param = Message.copyOf(param1ProfileBanner.log_param);
    }
    
    public ProfileBanner build(boolean param1Boolean) {
      return new ProfileBanner(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
