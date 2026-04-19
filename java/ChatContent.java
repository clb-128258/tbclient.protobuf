package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ChatContent extends Message {
  public static final String DEFAULT_BOT_UK = "";
  
  public static final String DEFAULT_BTN_TEXT = "";
  
  public static final String DEFAULT_SCHEME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String bot_uk;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String btn_text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String scheme;
  
  public ChatContent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.scheme;
      if (str1 == null) {
        this.scheme = "";
      } else {
        this.scheme = str1;
      } 
      str1 = paramBuilder.btn_text;
      if (str1 == null) {
        this.btn_text = "";
      } else {
        this.btn_text = str1;
      } 
      str = paramBuilder.bot_uk;
      if (str == null) {
        this.bot_uk = "";
      } else {
        this.bot_uk = str;
      } 
    } else {
      this.scheme = ((Builder)str).scheme;
      this.btn_text = ((Builder)str).btn_text;
      this.bot_uk = ((Builder)str).bot_uk;
    } 
  }
  
  public static final class Builder extends Message.Builder<ChatContent> {
    public String bot_uk;
    
    public String btn_text;
    
    public String scheme;
    
    public Builder() {}
    
    public Builder(ChatContent param1ChatContent) {
      super(param1ChatContent);
      if (param1ChatContent == null)
        return; 
      this.scheme = param1ChatContent.scheme;
      this.btn_text = param1ChatContent.btn_text;
      this.bot_uk = param1ChatContent.bot_uk;
    }
    
    public ChatContent build(boolean param1Boolean) {
      return new ChatContent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
