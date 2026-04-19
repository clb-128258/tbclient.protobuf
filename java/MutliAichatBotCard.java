package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class MutliAichatBotCard extends Message {
  public static final List<AichatBotCard> DEFAULT_AICHAT_BOT_CARD_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_HAS_INVALID_BOT = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<AichatBotCard> aichat_bot_card_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer has_invalid_bot;
  
  @ProtoField(tag = 3)
  public final InvalidInfo invalid_info;
  
  public MutliAichatBotCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<AichatBotCard> list = paramBuilder.aichat_bot_card_list;
      if (list == null) {
        this.aichat_bot_card_list = DEFAULT_AICHAT_BOT_CARD_LIST;
      } else {
        this.aichat_bot_card_list = Message.immutableCopyOf(list);
      } 
      Integer integer = paramBuilder.has_invalid_bot;
      if (integer == null) {
        this.has_invalid_bot = DEFAULT_HAS_INVALID_BOT;
      } else {
        this.has_invalid_bot = integer;
      } 
      this.invalid_info = paramBuilder.invalid_info;
    } else {
      this.aichat_bot_card_list = Message.immutableCopyOf(paramBuilder.aichat_bot_card_list);
      this.has_invalid_bot = paramBuilder.has_invalid_bot;
      this.invalid_info = paramBuilder.invalid_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<MutliAichatBotCard> {
    public List<AichatBotCard> aichat_bot_card_list;
    
    public Integer has_invalid_bot;
    
    public InvalidInfo invalid_info;
    
    public Builder() {}
    
    public Builder(MutliAichatBotCard param1MutliAichatBotCard) {
      super(param1MutliAichatBotCard);
      if (param1MutliAichatBotCard == null)
        return; 
      this.aichat_bot_card_list = Message.copyOf(param1MutliAichatBotCard.aichat_bot_card_list);
      this.has_invalid_bot = param1MutliAichatBotCard.has_invalid_bot;
      this.invalid_info = param1MutliAichatBotCard.invalid_info;
    }
    
    public MutliAichatBotCard build(boolean param1Boolean) {
      return new MutliAichatBotCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
