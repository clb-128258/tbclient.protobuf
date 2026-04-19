package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AichatBotCommentCard extends Message {
  public static final String DEFAULT_BOT_TYPE = "";
  
  public static final String DEFAULT_UK = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String bot_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String uk;
  
  public AichatBotCommentCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.uk;
      if (str1 == null) {
        this.uk = "";
      } else {
        this.uk = str1;
      } 
      str = paramBuilder.bot_type;
      if (str == null) {
        this.bot_type = "";
      } else {
        this.bot_type = str;
      } 
    } else {
      this.uk = ((Builder)str).uk;
      this.bot_type = ((Builder)str).bot_type;
    } 
  }
  
  public static final class Builder extends Message.Builder<AichatBotCommentCard> {
    public String bot_type;
    
    public String uk;
    
    public Builder() {}
    
    public Builder(AichatBotCommentCard param1AichatBotCommentCard) {
      super(param1AichatBotCommentCard);
      if (param1AichatBotCommentCard == null)
        return; 
      this.uk = param1AichatBotCommentCard.uk;
      this.bot_type = param1AichatBotCommentCard.bot_type;
    }
    
    public AichatBotCommentCard build(boolean param1Boolean) {
      return new AichatBotCommentCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
