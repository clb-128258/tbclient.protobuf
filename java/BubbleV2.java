package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BubbleV2 extends Message {
  public static final String DEFAULT_COLOR_DAY_END = "";
  
  public static final String DEFAULT_COLOR_DAY_START = "";
  
  public static final String DEFAULT_COLOR_NIGHT_END = "";
  
  public static final String DEFAULT_COLOR_NIGHT_START = "";
  
  public static final String DEFAULT_COMMENT_COLOR_DAY_END = "";
  
  public static final String DEFAULT_COMMENT_COLOR_DAY_START = "";
  
  public static final String DEFAULT_COMMENT_COLOR_NIGHT_END = "";
  
  public static final String DEFAULT_COMMENT_COLOR_NIGHT_START = "";
  
  public static final String DEFAULT_MAIN_ELEMENT_ICON = "";
  
  public static final String DEFAULT_MAIN_ELEMENT_VIDEO = "";
  
  public static final String DEFAULT_SUB_ELEMENT_ICON = "";
  
  public static final String DEFAULT_SUB_ELEMENT_VIDEO = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String color_day_end;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String color_day_start;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String color_night_end;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String color_night_start;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String comment_color_day_end;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String comment_color_day_start;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String comment_color_night_end;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String comment_color_night_start;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String main_element_icon;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String main_element_video;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String sub_element_icon;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String sub_element_video;
  
  public BubbleV2(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.color_day_start;
      if (str1 == null) {
        this.color_day_start = "";
      } else {
        this.color_day_start = str1;
      } 
      str1 = paramBuilder.color_night_start;
      if (str1 == null) {
        this.color_night_start = "";
      } else {
        this.color_night_start = str1;
      } 
      str1 = paramBuilder.main_element_icon;
      if (str1 == null) {
        this.main_element_icon = "";
      } else {
        this.main_element_icon = str1;
      } 
      str1 = paramBuilder.main_element_video;
      if (str1 == null) {
        this.main_element_video = "";
      } else {
        this.main_element_video = str1;
      } 
      str1 = paramBuilder.color_day_end;
      if (str1 == null) {
        this.color_day_end = "";
      } else {
        this.color_day_end = str1;
      } 
      str1 = paramBuilder.color_night_end;
      if (str1 == null) {
        this.color_night_end = "";
      } else {
        this.color_night_end = str1;
      } 
      str1 = paramBuilder.sub_element_icon;
      if (str1 == null) {
        this.sub_element_icon = "";
      } else {
        this.sub_element_icon = str1;
      } 
      str1 = paramBuilder.sub_element_video;
      if (str1 == null) {
        this.sub_element_video = "";
      } else {
        this.sub_element_video = str1;
      } 
      str1 = paramBuilder.comment_color_day_start;
      if (str1 == null) {
        this.comment_color_day_start = "";
      } else {
        this.comment_color_day_start = str1;
      } 
      str1 = paramBuilder.comment_color_night_start;
      if (str1 == null) {
        this.comment_color_night_start = "";
      } else {
        this.comment_color_night_start = str1;
      } 
      str1 = paramBuilder.comment_color_day_end;
      if (str1 == null) {
        this.comment_color_day_end = "";
      } else {
        this.comment_color_day_end = str1;
      } 
      str = paramBuilder.comment_color_night_end;
      if (str == null) {
        this.comment_color_night_end = "";
      } else {
        this.comment_color_night_end = str;
      } 
    } else {
      this.color_day_start = ((Builder)str).color_day_start;
      this.color_night_start = ((Builder)str).color_night_start;
      this.main_element_icon = ((Builder)str).main_element_icon;
      this.main_element_video = ((Builder)str).main_element_video;
      this.color_day_end = ((Builder)str).color_day_end;
      this.color_night_end = ((Builder)str).color_night_end;
      this.sub_element_icon = ((Builder)str).sub_element_icon;
      this.sub_element_video = ((Builder)str).sub_element_video;
      this.comment_color_day_start = ((Builder)str).comment_color_day_start;
      this.comment_color_night_start = ((Builder)str).comment_color_night_start;
      this.comment_color_day_end = ((Builder)str).comment_color_day_end;
      this.comment_color_night_end = ((Builder)str).comment_color_night_end;
    } 
  }
  
  public static final class Builder extends Message.Builder<BubbleV2> {
    public String color_day_end;
    
    public String color_day_start;
    
    public String color_night_end;
    
    public String color_night_start;
    
    public String comment_color_day_end;
    
    public String comment_color_day_start;
    
    public String comment_color_night_end;
    
    public String comment_color_night_start;
    
    public String main_element_icon;
    
    public String main_element_video;
    
    public String sub_element_icon;
    
    public String sub_element_video;
    
    public Builder() {}
    
    public Builder(BubbleV2 param1BubbleV2) {
      super(param1BubbleV2);
      if (param1BubbleV2 == null)
        return; 
      this.color_day_start = param1BubbleV2.color_day_start;
      this.color_night_start = param1BubbleV2.color_night_start;
      this.main_element_icon = param1BubbleV2.main_element_icon;
      this.main_element_video = param1BubbleV2.main_element_video;
      this.color_day_end = param1BubbleV2.color_day_end;
      this.color_night_end = param1BubbleV2.color_night_end;
      this.sub_element_icon = param1BubbleV2.sub_element_icon;
      this.sub_element_video = param1BubbleV2.sub_element_video;
      this.comment_color_day_start = param1BubbleV2.comment_color_day_start;
      this.comment_color_night_start = param1BubbleV2.comment_color_night_start;
      this.comment_color_day_end = param1BubbleV2.comment_color_day_end;
      this.comment_color_night_end = param1BubbleV2.comment_color_night_end;
    }
    
    public BubbleV2 build(boolean param1Boolean) {
      return new BubbleV2(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
