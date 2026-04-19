package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AiChatBotInfo;

public final class AiChatroomGuide extends Message {
  public static final String DEFAULT_BG_TOP_ANIMATION_URL = "";
  
  public static final List<AiChatBotInfo> DEFAULT_BOT_LIST = Collections.emptyList();
  
  public static final String DEFAULT_BOT_TYPE = "";
  
  public static final String DEFAULT_BUTTON_CONTENT = "";
  
  public static final String DEFAULT_BUTTON_ICON = "";
  
  public static final String DEFAULT_BUTTON_URL = "";
  
  public static final String DEFAULT_GUIDE_TEXT = "";
  
  public static final String DEFAULT_H5_URL = "";
  
  public static final String DEFAULT_JUMP_TYPE = "";
  
  public static final String DEFAULT_NEW_BOT_GUIDE_TEXT = "";
  
  public static final String DEFAULT_TITLE_IMG = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String bg_top_animation_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<AiChatBotInfo> bot_list;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String bot_type;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String button_content;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String button_icon;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String button_url;
  
  @ProtoField(tag = 9)
  public final AiChatBotInfo default_bot_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String guide_text;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String h5_url;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String jump_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String new_bot_guide_text;
  
  @ProtoField(tag = 3)
  public final AiChatBotInfo new_bot_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title_img;
  
  public AiChatroomGuide(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.guide_text;
      if (str2 == null) {
        this.guide_text = "";
      } else {
        this.guide_text = str2;
      } 
      str2 = paramBuilder.new_bot_guide_text;
      if (str2 == null) {
        this.new_bot_guide_text = "";
      } else {
        this.new_bot_guide_text = str2;
      } 
      this.new_bot_info = paramBuilder.new_bot_info;
      str2 = paramBuilder.title_img;
      if (str2 == null) {
        this.title_img = "";
      } else {
        this.title_img = str2;
      } 
      str2 = paramBuilder.button_url;
      if (str2 == null) {
        this.button_url = "";
      } else {
        this.button_url = str2;
      } 
      str2 = paramBuilder.bg_top_animation_url;
      if (str2 == null) {
        this.bg_top_animation_url = "";
      } else {
        this.bg_top_animation_url = str2;
      } 
      List<AiChatBotInfo> list = paramBuilder.bot_list;
      if (list == null) {
        this.bot_list = DEFAULT_BOT_LIST;
      } else {
        this.bot_list = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.h5_url;
      if (str1 == null) {
        this.h5_url = "";
      } else {
        this.h5_url = str1;
      } 
      this.default_bot_info = paramBuilder.default_bot_info;
      str1 = paramBuilder.bot_type;
      if (str1 == null) {
        this.bot_type = "";
      } else {
        this.bot_type = str1;
      } 
      str1 = paramBuilder.button_content;
      if (str1 == null) {
        this.button_content = "";
      } else {
        this.button_content = str1;
      } 
      str1 = paramBuilder.button_icon;
      if (str1 == null) {
        this.button_icon = "";
      } else {
        this.button_icon = str1;
      } 
      str = paramBuilder.jump_type;
      if (str == null) {
        this.jump_type = "";
      } else {
        this.jump_type = str;
      } 
    } else {
      this.guide_text = ((Builder)str).guide_text;
      this.new_bot_guide_text = ((Builder)str).new_bot_guide_text;
      this.new_bot_info = ((Builder)str).new_bot_info;
      this.title_img = ((Builder)str).title_img;
      this.button_url = ((Builder)str).button_url;
      this.bg_top_animation_url = ((Builder)str).bg_top_animation_url;
      this.bot_list = Message.immutableCopyOf(((Builder)str).bot_list);
      this.h5_url = ((Builder)str).h5_url;
      this.default_bot_info = ((Builder)str).default_bot_info;
      this.bot_type = ((Builder)str).bot_type;
      this.button_content = ((Builder)str).button_content;
      this.button_icon = ((Builder)str).button_icon;
      this.jump_type = ((Builder)str).jump_type;
    } 
  }
  
  public static final class Builder extends Message.Builder<AiChatroomGuide> {
    public String bg_top_animation_url;
    
    public List<AiChatBotInfo> bot_list;
    
    public String bot_type;
    
    public String button_content;
    
    public String button_icon;
    
    public String button_url;
    
    public AiChatBotInfo default_bot_info;
    
    public String guide_text;
    
    public String h5_url;
    
    public String jump_type;
    
    public String new_bot_guide_text;
    
    public AiChatBotInfo new_bot_info;
    
    public String title_img;
    
    public Builder() {}
    
    public Builder(AiChatroomGuide param1AiChatroomGuide) {
      super(param1AiChatroomGuide);
      if (param1AiChatroomGuide == null)
        return; 
      this.guide_text = param1AiChatroomGuide.guide_text;
      this.new_bot_guide_text = param1AiChatroomGuide.new_bot_guide_text;
      this.new_bot_info = param1AiChatroomGuide.new_bot_info;
      this.title_img = param1AiChatroomGuide.title_img;
      this.button_url = param1AiChatroomGuide.button_url;
      this.bg_top_animation_url = param1AiChatroomGuide.bg_top_animation_url;
      this.bot_list = Message.copyOf(param1AiChatroomGuide.bot_list);
      this.h5_url = param1AiChatroomGuide.h5_url;
      this.default_bot_info = param1AiChatroomGuide.default_bot_info;
      this.bot_type = param1AiChatroomGuide.bot_type;
      this.button_content = param1AiChatroomGuide.button_content;
      this.button_icon = param1AiChatroomGuide.button_icon;
      this.jump_type = param1AiChatroomGuide.jump_type;
    }
    
    public AiChatroomGuide build(boolean param1Boolean) {
      return new AiChatroomGuide(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
