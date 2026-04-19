package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AichatBotCard extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_TARGET_SCHEME = "";
  
  @ProtoField(tag = 1)
  public final User bot_info;
  
  @ProtoField(tag = 5)
  public final BotUser bot_user_info;
  
  @ProtoField(tag = 3)
  public final ChatContent chat_button;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String target_scheme;
  
  public AichatBotCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.bot_info = paramBuilder.bot_info;
      String str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
      this.chat_button = paramBuilder.chat_button;
      str = paramBuilder.target_scheme;
      if (str == null) {
        this.target_scheme = "";
      } else {
        this.target_scheme = str;
      } 
      this.bot_user_info = paramBuilder.bot_user_info;
    } else {
      this.bot_info = paramBuilder.bot_info;
      this.content = paramBuilder.content;
      this.chat_button = paramBuilder.chat_button;
      this.target_scheme = paramBuilder.target_scheme;
      this.bot_user_info = paramBuilder.bot_user_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<AichatBotCard> {
    public User bot_info;
    
    public BotUser bot_user_info;
    
    public ChatContent chat_button;
    
    public String content;
    
    public String target_scheme;
    
    public Builder() {}
    
    public Builder(AichatBotCard param1AichatBotCard) {
      super(param1AichatBotCard);
      if (param1AichatBotCard == null)
        return; 
      this.bot_info = param1AichatBotCard.bot_info;
      this.content = param1AichatBotCard.content;
      this.chat_button = param1AichatBotCard.chat_button;
      this.target_scheme = param1AichatBotCard.target_scheme;
      this.bot_user_info = param1AichatBotCard.bot_user_info;
    }
    
    public AichatBotCard build(boolean param1Boolean) {
      return new AichatBotCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
