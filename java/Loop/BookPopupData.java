package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BookPopupExt;

public final class BookPopupData extends Message {
  public static final String DEFAULT_BTN_TEXT = "";
  
  public static final String DEFAULT_BTN_TEXT_WIFI = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_DESC_WIFI = "";
  
  public static final Integer DEFAULT_FREQUENCY;
  
  public static final Integer DEFAULT_JUMP_TYPE;
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final Integer DEFAULT_SOURCE;
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String btn_text;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String btn_text_wifi;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String desc_wifi;
  
  @ProtoField(tag = 8)
  public final BookPopupExt ext;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer frequency;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer jump_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer source;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_JUMP_TYPE = integer;
    DEFAULT_FREQUENCY = integer;
    DEFAULT_SOURCE = integer;
  }
  
  public BookPopupData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      str3 = paramBuilder.desc;
      if (str3 == null) {
        this.desc = "";
      } else {
        this.desc = str3;
      } 
      str3 = paramBuilder.btn_text;
      if (str3 == null) {
        this.btn_text = "";
      } else {
        this.btn_text = str3;
      } 
      Integer integer2 = paramBuilder.jump_type;
      if (integer2 == null) {
        this.jump_type = DEFAULT_JUMP_TYPE;
      } else {
        this.jump_type = integer2;
      } 
      String str2 = paramBuilder.jump_url;
      if (str2 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str2;
      } 
      Integer integer1 = paramBuilder.frequency;
      if (integer1 == null) {
        this.frequency = DEFAULT_FREQUENCY;
      } else {
        this.frequency = integer1;
      } 
      integer1 = paramBuilder.source;
      if (integer1 == null) {
        this.source = DEFAULT_SOURCE;
      } else {
        this.source = integer1;
      } 
      this.ext = paramBuilder.ext;
      String str1 = paramBuilder.desc_wifi;
      if (str1 == null) {
        this.desc_wifi = "";
      } else {
        this.desc_wifi = str1;
      } 
      str = paramBuilder.btn_text_wifi;
      if (str == null) {
        this.btn_text_wifi = "";
      } else {
        this.btn_text_wifi = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.desc = ((Builder)str).desc;
      this.btn_text = ((Builder)str).btn_text;
      this.jump_type = ((Builder)str).jump_type;
      this.jump_url = ((Builder)str).jump_url;
      this.frequency = ((Builder)str).frequency;
      this.source = ((Builder)str).source;
      this.ext = ((Builder)str).ext;
      this.desc_wifi = ((Builder)str).desc_wifi;
      this.btn_text_wifi = ((Builder)str).btn_text_wifi;
    } 
  }
  
  public static final class Builder extends Message.Builder<BookPopupData> {
    public String btn_text;
    
    public String btn_text_wifi;
    
    public String desc;
    
    public String desc_wifi;
    
    public BookPopupExt ext;
    
    public Integer frequency;
    
    public Integer jump_type;
    
    public String jump_url;
    
    public Integer source;
    
    public String title;
    
    public Builder() {}
    
    public Builder(BookPopupData param1BookPopupData) {
      super(param1BookPopupData);
      if (param1BookPopupData == null)
        return; 
      this.title = param1BookPopupData.title;
      this.desc = param1BookPopupData.desc;
      this.btn_text = param1BookPopupData.btn_text;
      this.jump_type = param1BookPopupData.jump_type;
      this.jump_url = param1BookPopupData.jump_url;
      this.frequency = param1BookPopupData.frequency;
      this.source = param1BookPopupData.source;
      this.ext = param1BookPopupData.ext;
      this.desc_wifi = param1BookPopupData.desc_wifi;
      this.btn_text_wifi = param1BookPopupData.btn_text_wifi;
    }
    
    public BookPopupData build(boolean param1Boolean) {
      return new BookPopupData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
