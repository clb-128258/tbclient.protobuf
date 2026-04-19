package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class VipAd extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_BACKGROUND_IMG = "";
  
  public static final String DEFAULT_BACKGROUND_IMG_DARK = "";
  
  public static final List<Post> DEFAULT_COMMENTS;
  
  public static final String DEFAULT_CREATE_TIME = "";
  
  public static final List<Media> DEFAULT_IMAGE = Collections.emptyList();
  
  public static final List<Media> DEFAULT_IMAGE_DARK = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String background_img;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String background_img_dark;
  
  @ProtoField(tag = 10)
  public final AdCloseInfo close_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 9)
  public final List<Post> comments;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String create_time;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<Media> image;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<Media> image_dark;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    DEFAULT_COMMENTS = Collections.emptyList();
  }
  
  public VipAd(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.background_img;
      if (str == null) {
        this.background_img = "";
      } else {
        this.background_img = str;
      } 
      str = paramBuilder.background_img_dark;
      if (str == null) {
        this.background_img_dark = "";
      } else {
        this.background_img_dark = str;
      } 
      str = paramBuilder.avatar;
      if (str == null) {
        this.avatar = "";
      } else {
        this.avatar = str;
      } 
      str = paramBuilder.user_name;
      if (str == null) {
        this.user_name = "";
      } else {
        this.user_name = str;
      } 
      str = paramBuilder.create_time;
      if (str == null) {
        this.create_time = "";
      } else {
        this.create_time = str;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      List<Media> list1 = paramBuilder.image;
      if (list1 == null) {
        this.image = DEFAULT_IMAGE;
      } else {
        this.image = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.image_dark;
      if (list1 == null) {
        this.image_dark = DEFAULT_IMAGE_DARK;
      } else {
        this.image_dark = Message.immutableCopyOf(list1);
      } 
      List<Post> list = paramBuilder.comments;
      if (list == null) {
        this.comments = DEFAULT_COMMENTS;
      } else {
        this.comments = Message.immutableCopyOf(list);
      } 
      this.close_info = paramBuilder.close_info;
    } else {
      this.background_img = paramBuilder.background_img;
      this.background_img_dark = paramBuilder.background_img_dark;
      this.avatar = paramBuilder.avatar;
      this.user_name = paramBuilder.user_name;
      this.create_time = paramBuilder.create_time;
      this.title = paramBuilder.title;
      this.image = Message.immutableCopyOf(paramBuilder.image);
      this.image_dark = Message.immutableCopyOf(paramBuilder.image_dark);
      this.comments = Message.immutableCopyOf(paramBuilder.comments);
      this.close_info = paramBuilder.close_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<VipAd> {
    public String avatar;
    
    public String background_img;
    
    public String background_img_dark;
    
    public AdCloseInfo close_info;
    
    public List<Post> comments;
    
    public String create_time;
    
    public List<Media> image;
    
    public List<Media> image_dark;
    
    public String title;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(VipAd param1VipAd) {
      super(param1VipAd);
      if (param1VipAd == null)
        return; 
      this.background_img = param1VipAd.background_img;
      this.background_img_dark = param1VipAd.background_img_dark;
      this.avatar = param1VipAd.avatar;
      this.user_name = param1VipAd.user_name;
      this.create_time = param1VipAd.create_time;
      this.title = param1VipAd.title;
      this.image = Message.copyOf(param1VipAd.image);
      this.image_dark = Message.copyOf(param1VipAd.image_dark);
      this.comments = Message.copyOf(param1VipAd.comments);
      this.close_info = param1VipAd.close_info;
    }
    
    public VipAd build(boolean param1Boolean) {
      return new VipAd(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
