package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.IconUrlInfo;
import tbclient.ThemeColorInfo;

public final class FrsBannerHeader extends Message {
  public static final String DEFAULT_BACKGROUND_IMG = "";
  
  public static final String DEFAULT_BTN_TEXT = "";
  
  public static final String DEFAULT_BTN_TEXT_AFTER = "";
  
  public static final Integer DEFAULT_CARD_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_CONTENT1 = "";
  
  public static final String DEFAULT_CONTENT2 = "";
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_JUMP_LINK = "";
  
  public static final String DEFAULT_JUMP_TIPS = "";
  
  public static final String DEFAULT_TYPE = "";
  
  @ProtoField(tag = 7)
  public final ThemeColorInfo background_color;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String background_img;
  
  @ProtoField(tag = 17)
  public final BrandBook book;
  
  @ProtoField(tag = 12)
  public final IconUrlInfo brand_icon;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String btn_text;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String btn_text_after;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer card_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content1;
  
  @ProtoField(tag = 4)
  public final ThemeColorInfo content1_color;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String content2;
  
  @ProtoField(tag = 5)
  public final ThemeColorInfo content2_color;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String jump_link;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String jump_tips;
  
  @ProtoField(tag = 6)
  public final ThemeColorInfo jump_tips_color;
  
  @ProtoField(tag = 11)
  public final IconUrlInfo jump_tips_icon;
  
  @ProtoField(tag = 18)
  public final BrandSign sign;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String type;
  
  public FrsBannerHeader(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str2 = paramBuilder.icon_url;
      if (str2 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str2;
      } 
      str2 = paramBuilder.content1;
      if (str2 == null) {
        this.content1 = "";
      } else {
        this.content1 = str2;
      } 
      str2 = paramBuilder.content2;
      if (str2 == null) {
        this.content2 = "";
      } else {
        this.content2 = str2;
      } 
      this.content1_color = paramBuilder.content1_color;
      this.content2_color = paramBuilder.content2_color;
      this.jump_tips_color = paramBuilder.jump_tips_color;
      this.background_color = paramBuilder.background_color;
      str2 = paramBuilder.jump_tips;
      if (str2 == null) {
        this.jump_tips = "";
      } else {
        this.jump_tips = str2;
      } 
      str2 = paramBuilder.jump_link;
      if (str2 == null) {
        this.jump_link = "";
      } else {
        this.jump_link = str2;
      } 
      str2 = paramBuilder.type;
      if (str2 == null) {
        this.type = "";
      } else {
        this.type = str2;
      } 
      this.jump_tips_icon = paramBuilder.jump_tips_icon;
      this.brand_icon = paramBuilder.brand_icon;
      Integer integer = paramBuilder.card_type;
      if (integer == null) {
        this.card_type = DEFAULT_CARD_TYPE;
      } else {
        this.card_type = integer;
      } 
      String str1 = paramBuilder.btn_text;
      if (str1 == null) {
        this.btn_text = "";
      } else {
        this.btn_text = str1;
      } 
      str1 = paramBuilder.btn_text_after;
      if (str1 == null) {
        this.btn_text_after = "";
      } else {
        this.btn_text_after = str1;
      } 
      str1 = paramBuilder.background_img;
      if (str1 == null) {
        this.background_img = "";
      } else {
        this.background_img = str1;
      } 
      this.book = paramBuilder.book;
      this.sign = paramBuilder.sign;
    } else {
      this.icon_url = paramBuilder.icon_url;
      this.content1 = paramBuilder.content1;
      this.content2 = paramBuilder.content2;
      this.content1_color = paramBuilder.content1_color;
      this.content2_color = paramBuilder.content2_color;
      this.jump_tips_color = paramBuilder.jump_tips_color;
      this.background_color = paramBuilder.background_color;
      this.jump_tips = paramBuilder.jump_tips;
      this.jump_link = paramBuilder.jump_link;
      this.type = paramBuilder.type;
      this.jump_tips_icon = paramBuilder.jump_tips_icon;
      this.brand_icon = paramBuilder.brand_icon;
      this.card_type = paramBuilder.card_type;
      this.btn_text = paramBuilder.btn_text;
      this.btn_text_after = paramBuilder.btn_text_after;
      this.background_img = paramBuilder.background_img;
      this.book = paramBuilder.book;
      this.sign = paramBuilder.sign;
    } 
  }
  
  public static final class Builder extends Message.Builder<FrsBannerHeader> {
    public ThemeColorInfo background_color;
    
    public String background_img;
    
    public BrandBook book;
    
    public IconUrlInfo brand_icon;
    
    public String btn_text;
    
    public String btn_text_after;
    
    public Integer card_type;
    
    public String content1;
    
    public ThemeColorInfo content1_color;
    
    public String content2;
    
    public ThemeColorInfo content2_color;
    
    public String icon_url;
    
    public String jump_link;
    
    public String jump_tips;
    
    public ThemeColorInfo jump_tips_color;
    
    public IconUrlInfo jump_tips_icon;
    
    public BrandSign sign;
    
    public String type;
    
    public Builder() {}
    
    public Builder(FrsBannerHeader param1FrsBannerHeader) {
      super(param1FrsBannerHeader);
      if (param1FrsBannerHeader == null)
        return; 
      this.icon_url = param1FrsBannerHeader.icon_url;
      this.content1 = param1FrsBannerHeader.content1;
      this.content2 = param1FrsBannerHeader.content2;
      this.content1_color = param1FrsBannerHeader.content1_color;
      this.content2_color = param1FrsBannerHeader.content2_color;
      this.jump_tips_color = param1FrsBannerHeader.jump_tips_color;
      this.background_color = param1FrsBannerHeader.background_color;
      this.jump_tips = param1FrsBannerHeader.jump_tips;
      this.jump_link = param1FrsBannerHeader.jump_link;
      this.type = param1FrsBannerHeader.type;
      this.jump_tips_icon = param1FrsBannerHeader.jump_tips_icon;
      this.brand_icon = param1FrsBannerHeader.brand_icon;
      this.card_type = param1FrsBannerHeader.card_type;
      this.btn_text = param1FrsBannerHeader.btn_text;
      this.btn_text_after = param1FrsBannerHeader.btn_text_after;
      this.background_img = param1FrsBannerHeader.background_img;
      this.book = param1FrsBannerHeader.book;
      this.sign = param1FrsBannerHeader.sign;
    }
    
    public FrsBannerHeader build(boolean param1Boolean) {
      return new FrsBannerHeader(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
