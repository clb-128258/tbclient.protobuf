package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BannerImage extends Message {
  public static final String DEFAULT_AHEAD_URL = "";
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String ahead_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 4)
  public final ThemeColorInfo theme_color_info;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  public BannerImage(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.img_url;
      if (str == null) {
        this.img_url = "";
      } else {
        this.img_url = str;
      } 
      str = paramBuilder.ahead_url;
      if (str == null) {
        this.ahead_url = "";
      } else {
        this.ahead_url = str;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      this.theme_color_info = paramBuilder.theme_color_info;
    } else {
      this.img_url = paramBuilder.img_url;
      this.ahead_url = paramBuilder.ahead_url;
      this.title = paramBuilder.title;
      this.theme_color_info = paramBuilder.theme_color_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<BannerImage> {
    public String ahead_url;
    
    public String img_url;
    
    public ThemeColorInfo theme_color_info;
    
    public String title;
    
    public Builder() {}
    
    public Builder(BannerImage param1BannerImage) {
      super(param1BannerImage);
      if (param1BannerImage == null)
        return; 
      this.img_url = param1BannerImage.img_url;
      this.ahead_url = param1BannerImage.ahead_url;
      this.title = param1BannerImage.title;
      this.theme_color_info = param1BannerImage.theme_color_info;
    }
    
    public BannerImage build(boolean param1Boolean) {
      return new BannerImage(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
