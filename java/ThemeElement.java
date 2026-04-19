package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeElement extends Message {
  public static final String DEFAULT_COMMON_COLOR = "";
  
  public static final Integer DEFAULT_COVER_TYPE;
  
  public static final String DEFAULT_DARK_COLOR = "";
  
  public static final String DEFAULT_FONT_COLOR = "";
  
  public static final String DEFAULT_LIGHT_COLOR = "";
  
  public static final String DEFAULT_PATTERN_IMAGE = "";
  
  public static final Long DEFAULT_PATTERN_IMAGE_HEIGHT;
  
  public static final String DEFAULT_PATTERN_IMAGE_NOT_SELECTED = "";
  
  public static final String DEFAULT_PATTERN_IMAGE_SELECT = "";
  
  public static final Long DEFAULT_PATTERN_IMAGE_WIDTH;
  
  public static final Integer DEFAULT_PATTERN_NUM;
  
  public static final String DEFAULT_PATTERN_TEXT = "";
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String common_color;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer cover_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String dark_color;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String font_color;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String light_color;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String pattern_image;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long pattern_image_height;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String pattern_image_not_selected;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String pattern_image_select;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long pattern_image_width;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer pattern_num;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String pattern_text;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_PATTERN_IMAGE_HEIGHT = long_;
    DEFAULT_PATTERN_IMAGE_WIDTH = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_PATTERN_NUM = integer;
    DEFAULT_COVER_TYPE = integer;
  }
  
  public ThemeElement(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str3 = paramBuilder.common_color;
      if (str3 == null) {
        this.common_color = "";
      } else {
        this.common_color = str3;
      } 
      str3 = paramBuilder.dark_color;
      if (str3 == null) {
        this.dark_color = "";
      } else {
        this.dark_color = str3;
      } 
      str3 = paramBuilder.light_color;
      if (str3 == null) {
        this.light_color = "";
      } else {
        this.light_color = str3;
      } 
      str3 = paramBuilder.pattern_image;
      if (str3 == null) {
        this.pattern_image = "";
      } else {
        this.pattern_image = str3;
      } 
      str3 = paramBuilder.font_color;
      if (str3 == null) {
        this.font_color = "";
      } else {
        this.font_color = str3;
      } 
      Long long_ = paramBuilder.pattern_image_height;
      if (long_ == null) {
        this.pattern_image_height = DEFAULT_PATTERN_IMAGE_HEIGHT;
      } else {
        this.pattern_image_height = long_;
      } 
      long_ = paramBuilder.pattern_image_width;
      if (long_ == null) {
        this.pattern_image_width = DEFAULT_PATTERN_IMAGE_WIDTH;
      } else {
        this.pattern_image_width = long_;
      } 
      String str2 = paramBuilder.pattern_text;
      if (str2 == null) {
        this.pattern_text = "";
      } else {
        this.pattern_text = str2;
      } 
      Integer integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      integer1 = paramBuilder.pattern_num;
      if (integer1 == null) {
        this.pattern_num = DEFAULT_PATTERN_NUM;
      } else {
        this.pattern_num = integer1;
      } 
      String str1 = paramBuilder.pattern_image_select;
      if (str1 == null) {
        this.pattern_image_select = "";
      } else {
        this.pattern_image_select = str1;
      } 
      str1 = paramBuilder.pattern_image_not_selected;
      if (str1 == null) {
        this.pattern_image_not_selected = "";
      } else {
        this.pattern_image_not_selected = str1;
      } 
      integer = paramBuilder.cover_type;
      if (integer == null) {
        this.cover_type = DEFAULT_COVER_TYPE;
      } else {
        this.cover_type = integer;
      } 
    } else {
      this.common_color = ((Builder)integer).common_color;
      this.dark_color = ((Builder)integer).dark_color;
      this.light_color = ((Builder)integer).light_color;
      this.pattern_image = ((Builder)integer).pattern_image;
      this.font_color = ((Builder)integer).font_color;
      this.pattern_image_height = ((Builder)integer).pattern_image_height;
      this.pattern_image_width = ((Builder)integer).pattern_image_width;
      this.pattern_text = ((Builder)integer).pattern_text;
      this.type = ((Builder)integer).type;
      this.pattern_num = ((Builder)integer).pattern_num;
      this.pattern_image_select = ((Builder)integer).pattern_image_select;
      this.pattern_image_not_selected = ((Builder)integer).pattern_image_not_selected;
      this.cover_type = ((Builder)integer).cover_type;
    } 
  }
  
  public static final class Builder extends Message.Builder<ThemeElement> {
    public String common_color;
    
    public Integer cover_type;
    
    public String dark_color;
    
    public String font_color;
    
    public String light_color;
    
    public String pattern_image;
    
    public Long pattern_image_height;
    
    public String pattern_image_not_selected;
    
    public String pattern_image_select;
    
    public Long pattern_image_width;
    
    public Integer pattern_num;
    
    public String pattern_text;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(ThemeElement param1ThemeElement) {
      super(param1ThemeElement);
      if (param1ThemeElement == null)
        return; 
      this.common_color = param1ThemeElement.common_color;
      this.dark_color = param1ThemeElement.dark_color;
      this.light_color = param1ThemeElement.light_color;
      this.pattern_image = param1ThemeElement.pattern_image;
      this.font_color = param1ThemeElement.font_color;
      this.pattern_image_height = param1ThemeElement.pattern_image_height;
      this.pattern_image_width = param1ThemeElement.pattern_image_width;
      this.pattern_text = param1ThemeElement.pattern_text;
      this.type = param1ThemeElement.type;
      this.pattern_num = param1ThemeElement.pattern_num;
      this.pattern_image_select = param1ThemeElement.pattern_image_select;
      this.pattern_image_not_selected = param1ThemeElement.pattern_image_not_selected;
      this.cover_type = param1ThemeElement.cover_type;
    }
    
    public ThemeElement build(boolean param1Boolean) {
      return new ThemeElement(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
