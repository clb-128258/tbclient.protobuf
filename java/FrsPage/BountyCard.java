package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.IconUrlInfo;

public final class BountyCard extends Message {
  public static final Integer DEFAULT_AWARD_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_BONUS = "";
  
  public static final String DEFAULT_BTN_TEXT = "";
  
  public static final List<String> DEFAULT_GIFT_IMGS = Collections.emptyList();
  
  public static final String DEFAULT_SUBTITLE = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer award_type;
  
  @ProtoField(tag = 4)
  public final IconUrlInfo bg_img;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String bonus;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String btn_text;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
  public final List<String> gift_imgs;
  
  @ProtoField(tag = 1)
  public final IconUrlInfo icon;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String subtitle;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String url;
  
  public BountyCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.icon = paramBuilder.icon;
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.subtitle;
      if (str2 == null) {
        this.subtitle = "";
      } else {
        this.subtitle = str2;
      } 
      this.bg_img = paramBuilder.bg_img;
      Integer integer = paramBuilder.award_type;
      if (integer == null) {
        this.award_type = DEFAULT_AWARD_TYPE;
      } else {
        this.award_type = integer;
      } 
      String str1 = paramBuilder.bonus;
      if (str1 == null) {
        this.bonus = "";
      } else {
        this.bonus = str1;
      } 
      str1 = paramBuilder.btn_text;
      if (str1 == null) {
        this.btn_text = "";
      } else {
        this.btn_text = str1;
      } 
      List<String> list = paramBuilder.gift_imgs;
      if (list == null) {
        this.gift_imgs = DEFAULT_GIFT_IMGS;
      } else {
        this.gift_imgs = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.icon = ((Builder)str).icon;
      this.title = ((Builder)str).title;
      this.subtitle = ((Builder)str).subtitle;
      this.bg_img = ((Builder)str).bg_img;
      this.award_type = ((Builder)str).award_type;
      this.bonus = ((Builder)str).bonus;
      this.btn_text = ((Builder)str).btn_text;
      this.gift_imgs = Message.immutableCopyOf(((Builder)str).gift_imgs);
      this.url = ((Builder)str).url;
    } 
  }
  
  public static final class Builder extends Message.Builder<BountyCard> {
    public Integer award_type;
    
    public IconUrlInfo bg_img;
    
    public String bonus;
    
    public String btn_text;
    
    public List<String> gift_imgs;
    
    public IconUrlInfo icon;
    
    public String subtitle;
    
    public String title;
    
    public String url;
    
    public Builder() {}
    
    public Builder(BountyCard param1BountyCard) {
      super(param1BountyCard);
      if (param1BountyCard == null)
        return; 
      this.icon = param1BountyCard.icon;
      this.title = param1BountyCard.title;
      this.subtitle = param1BountyCard.subtitle;
      this.bg_img = param1BountyCard.bg_img;
      this.award_type = param1BountyCard.award_type;
      this.bonus = param1BountyCard.bonus;
      this.btn_text = param1BountyCard.btn_text;
      this.gift_imgs = Message.copyOf(param1BountyCard.gift_imgs);
      this.url = param1BountyCard.url;
    }
    
    public BountyCard build(boolean param1Boolean) {
      return new BountyCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
