package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FrsBottomSmartBgColor extends Message {
  public static final String DEFAULT_AT_FONT_COLOR = "";
  
  public static final String DEFAULT_BALL_BG_COLOR = "";
  
  public static final String DEFAULT_MODULE1_BG_COLOR = "";
  
  public static final String DEFAULT_MODULE2_BG_COLOR = "";
  
  public static final String DEFAULT_MODULE3_BG_COLOR = "";
  
  public static final String DEFAULT_MODULE4_BG_COLOR = "";
  
  public static final String DEFAULT_POST_BUTTON_COLOR = "";
  
  public static final String DEFAULT_POST_BUTTON_SHADOW_COLOR = "";
  
  public static final String DEFAULT_TAB_LINE_COLOR = "";
  
  public static final String DEFAULT_TAG_COLOR = "";
  
  public static final String DEFAULT_THEME_COLOR = "";
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String at_font_color;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String ball_bg_color;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String module1_bg_color;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String module2_bg_color;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String module3_bg_color;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String module4_bg_color;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String post_button_color;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String post_button_shadow_color;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tab_line_color;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String tag_color;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String theme_color;
  
  public FrsBottomSmartBgColor(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.theme_color;
      if (str1 == null) {
        this.theme_color = "";
      } else {
        this.theme_color = str1;
      } 
      str1 = paramBuilder.ball_bg_color;
      if (str1 == null) {
        this.ball_bg_color = "";
      } else {
        this.ball_bg_color = str1;
      } 
      str1 = paramBuilder.tab_line_color;
      if (str1 == null) {
        this.tab_line_color = "";
      } else {
        this.tab_line_color = str1;
      } 
      str1 = paramBuilder.tag_color;
      if (str1 == null) {
        this.tag_color = "";
      } else {
        this.tag_color = str1;
      } 
      str1 = paramBuilder.post_button_color;
      if (str1 == null) {
        this.post_button_color = "";
      } else {
        this.post_button_color = str1;
      } 
      str1 = paramBuilder.post_button_shadow_color;
      if (str1 == null) {
        this.post_button_shadow_color = "";
      } else {
        this.post_button_shadow_color = str1;
      } 
      str1 = paramBuilder.module1_bg_color;
      if (str1 == null) {
        this.module1_bg_color = "";
      } else {
        this.module1_bg_color = str1;
      } 
      str1 = paramBuilder.module2_bg_color;
      if (str1 == null) {
        this.module2_bg_color = "";
      } else {
        this.module2_bg_color = str1;
      } 
      str1 = paramBuilder.module3_bg_color;
      if (str1 == null) {
        this.module3_bg_color = "";
      } else {
        this.module3_bg_color = str1;
      } 
      str1 = paramBuilder.module4_bg_color;
      if (str1 == null) {
        this.module4_bg_color = "";
      } else {
        this.module4_bg_color = str1;
      } 
      str = paramBuilder.at_font_color;
      if (str == null) {
        this.at_font_color = "";
      } else {
        this.at_font_color = str;
      } 
    } else {
      this.theme_color = ((Builder)str).theme_color;
      this.ball_bg_color = ((Builder)str).ball_bg_color;
      this.tab_line_color = ((Builder)str).tab_line_color;
      this.tag_color = ((Builder)str).tag_color;
      this.post_button_color = ((Builder)str).post_button_color;
      this.post_button_shadow_color = ((Builder)str).post_button_shadow_color;
      this.module1_bg_color = ((Builder)str).module1_bg_color;
      this.module2_bg_color = ((Builder)str).module2_bg_color;
      this.module3_bg_color = ((Builder)str).module3_bg_color;
      this.module4_bg_color = ((Builder)str).module4_bg_color;
      this.at_font_color = ((Builder)str).at_font_color;
    } 
  }
  
  public static final class Builder extends Message.Builder<FrsBottomSmartBgColor> {
    public String at_font_color;
    
    public String ball_bg_color;
    
    public String module1_bg_color;
    
    public String module2_bg_color;
    
    public String module3_bg_color;
    
    public String module4_bg_color;
    
    public String post_button_color;
    
    public String post_button_shadow_color;
    
    public String tab_line_color;
    
    public String tag_color;
    
    public String theme_color;
    
    public Builder() {}
    
    public Builder(FrsBottomSmartBgColor param1FrsBottomSmartBgColor) {
      super(param1FrsBottomSmartBgColor);
      if (param1FrsBottomSmartBgColor == null)
        return; 
      this.theme_color = param1FrsBottomSmartBgColor.theme_color;
      this.ball_bg_color = param1FrsBottomSmartBgColor.ball_bg_color;
      this.tab_line_color = param1FrsBottomSmartBgColor.tab_line_color;
      this.tag_color = param1FrsBottomSmartBgColor.tag_color;
      this.post_button_color = param1FrsBottomSmartBgColor.post_button_color;
      this.post_button_shadow_color = param1FrsBottomSmartBgColor.post_button_shadow_color;
      this.module1_bg_color = param1FrsBottomSmartBgColor.module1_bg_color;
      this.module2_bg_color = param1FrsBottomSmartBgColor.module2_bg_color;
      this.module3_bg_color = param1FrsBottomSmartBgColor.module3_bg_color;
      this.module4_bg_color = param1FrsBottomSmartBgColor.module4_bg_color;
      this.at_font_color = param1FrsBottomSmartBgColor.at_font_color;
    }
    
    public FrsBottomSmartBgColor build(boolean param1Boolean) {
      return new FrsBottomSmartBgColor(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
