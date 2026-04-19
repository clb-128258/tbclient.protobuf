package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class StyleConfExtra extends Message {
  public static final String DEFAULT_BOT_LOADING_CONTENT = "";
  
  public static final String DEFAULT_BOT_LOADING_TOAST = "";
  
  public static final String DEFAULT_BOT_NAME = "";
  
  public static final String DEFAULT_BOT_PORTRAIT = "";
  
  public static final String DEFAULT_BOT_REPLY_CONTENT = "";
  
  public static final List<BotReplyContent> DEFAULT_BOT_REPLY_CONTENT_LIST = Collections.emptyList();
  
  public static final String DEFAULT_BOT_TIMEOUT_CONTENT = "";
  
  public static final String DEFAULT_FIRST_POST_GUIDE = "";
  
  public static final String DEFAULT_GUIDE = "";
  
  public static final String DEFAULT_GUIDE_CONTENT = "";
  
  public static final String DEFAULT_GUIDE_ICON = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String bot_loading_content;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String bot_loading_toast;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String bot_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String bot_portrait;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String bot_reply_content;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 11)
  public final List<BotReplyContent> bot_reply_content_list;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String bot_timeout_content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String first_post_guide;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String guide;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String guide_content;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String guide_icon;
  
  public StyleConfExtra(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<BotReplyContent> list;
    if (paramBoolean == true) {
      String str = paramBuilder.first_post_guide;
      if (str == null) {
        this.first_post_guide = "";
      } else {
        this.first_post_guide = str;
      } 
      str = paramBuilder.guide;
      if (str == null) {
        this.guide = "";
      } else {
        this.guide = str;
      } 
      str = paramBuilder.bot_name;
      if (str == null) {
        this.bot_name = "";
      } else {
        this.bot_name = str;
      } 
      str = paramBuilder.bot_portrait;
      if (str == null) {
        this.bot_portrait = "";
      } else {
        this.bot_portrait = str;
      } 
      str = paramBuilder.bot_reply_content;
      if (str == null) {
        this.bot_reply_content = "";
      } else {
        this.bot_reply_content = str;
      } 
      str = paramBuilder.bot_loading_content;
      if (str == null) {
        this.bot_loading_content = "";
      } else {
        this.bot_loading_content = str;
      } 
      str = paramBuilder.guide_content;
      if (str == null) {
        this.guide_content = "";
      } else {
        this.guide_content = str;
      } 
      str = paramBuilder.guide_icon;
      if (str == null) {
        this.guide_icon = "";
      } else {
        this.guide_icon = str;
      } 
      str = paramBuilder.bot_loading_toast;
      if (str == null) {
        this.bot_loading_toast = "";
      } else {
        this.bot_loading_toast = str;
      } 
      str = paramBuilder.bot_timeout_content;
      if (str == null) {
        this.bot_timeout_content = "";
      } else {
        this.bot_timeout_content = str;
      } 
      list = paramBuilder.bot_reply_content_list;
      if (list == null) {
        this.bot_reply_content_list = DEFAULT_BOT_REPLY_CONTENT_LIST;
      } else {
        this.bot_reply_content_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.first_post_guide = ((Builder)list).first_post_guide;
      this.guide = ((Builder)list).guide;
      this.bot_name = ((Builder)list).bot_name;
      this.bot_portrait = ((Builder)list).bot_portrait;
      this.bot_reply_content = ((Builder)list).bot_reply_content;
      this.bot_loading_content = ((Builder)list).bot_loading_content;
      this.guide_content = ((Builder)list).guide_content;
      this.guide_icon = ((Builder)list).guide_icon;
      this.bot_loading_toast = ((Builder)list).bot_loading_toast;
      this.bot_timeout_content = ((Builder)list).bot_timeout_content;
      this.bot_reply_content_list = Message.immutableCopyOf(((Builder)list).bot_reply_content_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<StyleConfExtra> {
    public String bot_loading_content;
    
    public String bot_loading_toast;
    
    public String bot_name;
    
    public String bot_portrait;
    
    public String bot_reply_content;
    
    public List<BotReplyContent> bot_reply_content_list;
    
    public String bot_timeout_content;
    
    public String first_post_guide;
    
    public String guide;
    
    public String guide_content;
    
    public String guide_icon;
    
    public Builder() {}
    
    public Builder(StyleConfExtra param1StyleConfExtra) {
      super(param1StyleConfExtra);
      if (param1StyleConfExtra == null)
        return; 
      this.first_post_guide = param1StyleConfExtra.first_post_guide;
      this.guide = param1StyleConfExtra.guide;
      this.bot_name = param1StyleConfExtra.bot_name;
      this.bot_portrait = param1StyleConfExtra.bot_portrait;
      this.bot_reply_content = param1StyleConfExtra.bot_reply_content;
      this.bot_loading_content = param1StyleConfExtra.bot_loading_content;
      this.guide_content = param1StyleConfExtra.guide_content;
      this.guide_icon = param1StyleConfExtra.guide_icon;
      this.bot_loading_toast = param1StyleConfExtra.bot_loading_toast;
      this.bot_timeout_content = param1StyleConfExtra.bot_timeout_content;
      this.bot_reply_content_list = Message.copyOf(param1StyleConfExtra.bot_reply_content_list);
    }
    
    public StyleConfExtra build(boolean param1Boolean) {
      return new StyleConfExtra(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
