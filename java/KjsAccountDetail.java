package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class KjsAccountDetail extends Message {
  public static final String DEFAULT_IMAGE = "";
  
  public static final Boolean DEFAULT_IS_SOLD = Boolean.FALSE;
  
  public static final Long DEFAULT_KJS_ID;
  
  public static final Integer DEFAULT_PRICE = Integer.valueOf(0);
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final String DEFAULT_SPEC = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 1)
  public final KjsBasicInfo basic_info;
  
  @ProtoField(tag = 3)
  public final KjsGameScreenshot game_screenshot;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 5, type = Message.Datatype.BOOL)
  public final Boolean is_sold;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long kjs_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer price;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 2)
  public final KjsSkinSection skin_section;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String spec;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    DEFAULT_KJS_ID = Long.valueOf(0L);
  }
  
  public KjsAccountDetail(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.basic_info = paramBuilder.basic_info;
      this.skin_section = paramBuilder.skin_section;
      this.game_screenshot = paramBuilder.game_screenshot;
      String str2 = paramBuilder.schema;
      if (str2 == null) {
        this.schema = "";
      } else {
        this.schema = str2;
      } 
      Boolean bool = paramBuilder.is_sold;
      if (bool == null) {
        this.is_sold = DEFAULT_IS_SOLD;
      } else {
        this.is_sold = bool;
      } 
      Integer integer = paramBuilder.price;
      if (integer == null) {
        this.price = DEFAULT_PRICE;
      } else {
        this.price = integer;
      } 
      Long long_ = paramBuilder.kjs_id;
      if (long_ == null) {
        this.kjs_id = DEFAULT_KJS_ID;
      } else {
        this.kjs_id = long_;
      } 
      String str1 = paramBuilder.image;
      if (str1 == null) {
        this.image = "";
      } else {
        this.image = str1;
      } 
      str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str = paramBuilder.spec;
      if (str == null) {
        this.spec = "";
      } else {
        this.spec = str;
      } 
    } else {
      this.basic_info = ((Builder)str).basic_info;
      this.skin_section = ((Builder)str).skin_section;
      this.game_screenshot = ((Builder)str).game_screenshot;
      this.schema = ((Builder)str).schema;
      this.is_sold = ((Builder)str).is_sold;
      this.price = ((Builder)str).price;
      this.kjs_id = ((Builder)str).kjs_id;
      this.image = ((Builder)str).image;
      this.title = ((Builder)str).title;
      this.spec = ((Builder)str).spec;
    } 
  }
  
  public static final class Builder extends Message.Builder<KjsAccountDetail> {
    public KjsBasicInfo basic_info;
    
    public KjsGameScreenshot game_screenshot;
    
    public String image;
    
    public Boolean is_sold;
    
    public Long kjs_id;
    
    public Integer price;
    
    public String schema;
    
    public KjsSkinSection skin_section;
    
    public String spec;
    
    public String title;
    
    public Builder() {}
    
    public Builder(KjsAccountDetail param1KjsAccountDetail) {
      super(param1KjsAccountDetail);
      if (param1KjsAccountDetail == null)
        return; 
      this.basic_info = param1KjsAccountDetail.basic_info;
      this.skin_section = param1KjsAccountDetail.skin_section;
      this.game_screenshot = param1KjsAccountDetail.game_screenshot;
      this.schema = param1KjsAccountDetail.schema;
      this.is_sold = param1KjsAccountDetail.is_sold;
      this.price = param1KjsAccountDetail.price;
      this.kjs_id = param1KjsAccountDetail.kjs_id;
      this.image = param1KjsAccountDetail.image;
      this.title = param1KjsAccountDetail.title;
      this.spec = param1KjsAccountDetail.spec;
    }
    
    public KjsAccountDetail build(boolean param1Boolean) {
      return new KjsAccountDetail(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
