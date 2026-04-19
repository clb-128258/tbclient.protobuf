package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThemeColorInfo;

public final class VipBannerThemeColorInfo extends Message {
  @ProtoField(tag = 3)
  public final ThemeColorInfo button_theme;
  
  @ProtoField(tag = 2)
  public final ThemeColorInfo sub_title_theme;
  
  @ProtoField(tag = 1)
  public final ThemeColorInfo title_theme;
  
  public VipBannerThemeColorInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.title_theme = paramBuilder.title_theme;
      this.sub_title_theme = paramBuilder.sub_title_theme;
      this.button_theme = paramBuilder.button_theme;
    } else {
      this.title_theme = paramBuilder.title_theme;
      this.sub_title_theme = paramBuilder.sub_title_theme;
      this.button_theme = paramBuilder.button_theme;
    } 
  }
  
  public static final class Builder extends Message.Builder<VipBannerThemeColorInfo> {
    public ThemeColorInfo button_theme;
    
    public ThemeColorInfo sub_title_theme;
    
    public ThemeColorInfo title_theme;
    
    public Builder() {}
    
    public Builder(VipBannerThemeColorInfo param1VipBannerThemeColorInfo) {
      super(param1VipBannerThemeColorInfo);
      if (param1VipBannerThemeColorInfo == null)
        return; 
      this.title_theme = param1VipBannerThemeColorInfo.title_theme;
      this.sub_title_theme = param1VipBannerThemeColorInfo.sub_title_theme;
      this.button_theme = param1VipBannerThemeColorInfo.button_theme;
    }
    
    public VipBannerThemeColorInfo build(boolean param1Boolean) {
      return new VipBannerThemeColorInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
