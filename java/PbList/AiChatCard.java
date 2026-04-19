package tbclient.PbList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AiChatCard extends Message {
  public static final String DEFAULT_BTN_LINK = "";
  
  public static final String DEFAULT_BTN_TEXT = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_SUBTITLE_TEXT = "";
  
  public static final String DEFAULT_TITLE_ICON = "";
  
  public static final String DEFAULT_TITLE_TEXT = "";
  
  public static final String DEFAULT_UK = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String btn_link;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String btn_text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String subtitle_text;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String title_icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title_text;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String uk;
  
  public AiChatCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.portrait;
      if (str1 == null) {
        this.portrait = "";
      } else {
        this.portrait = str1;
      } 
      str1 = paramBuilder.title_text;
      if (str1 == null) {
        this.title_text = "";
      } else {
        this.title_text = str1;
      } 
      str1 = paramBuilder.subtitle_text;
      if (str1 == null) {
        this.subtitle_text = "";
      } else {
        this.subtitle_text = str1;
      } 
      str1 = paramBuilder.btn_text;
      if (str1 == null) {
        this.btn_text = "";
      } else {
        this.btn_text = str1;
      } 
      str1 = paramBuilder.btn_link;
      if (str1 == null) {
        this.btn_link = "";
      } else {
        this.btn_link = str1;
      } 
      str1 = paramBuilder.title_icon;
      if (str1 == null) {
        this.title_icon = "";
      } else {
        this.title_icon = str1;
      } 
      str = paramBuilder.uk;
      if (str == null) {
        this.uk = "";
      } else {
        this.uk = str;
      } 
    } else {
      this.portrait = ((Builder)str).portrait;
      this.title_text = ((Builder)str).title_text;
      this.subtitle_text = ((Builder)str).subtitle_text;
      this.btn_text = ((Builder)str).btn_text;
      this.btn_link = ((Builder)str).btn_link;
      this.title_icon = ((Builder)str).title_icon;
      this.uk = ((Builder)str).uk;
    } 
  }
  
  public static final class Builder extends Message.Builder<AiChatCard> {
    public String btn_link;
    
    public String btn_text;
    
    public String portrait;
    
    public String subtitle_text;
    
    public String title_icon;
    
    public String title_text;
    
    public String uk;
    
    public Builder() {}
    
    public Builder(AiChatCard param1AiChatCard) {
      super(param1AiChatCard);
      if (param1AiChatCard == null)
        return; 
      this.portrait = param1AiChatCard.portrait;
      this.title_text = param1AiChatCard.title_text;
      this.subtitle_text = param1AiChatCard.subtitle_text;
      this.btn_text = param1AiChatCard.btn_text;
      this.btn_link = param1AiChatCard.btn_link;
      this.title_icon = param1AiChatCard.title_icon;
      this.uk = param1AiChatCard.uk;
    }
    
    public AiChatCard build(boolean param1Boolean) {
      return new AiChatCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
