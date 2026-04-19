package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedAiRecreationCard extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_TARGET_SCHEMA = "";
  
  @ProtoField(tag = 1)
  public final User bot_info;
  
  @ProtoField(tag = 4)
  public final BotUser bot_user_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 3)
  public final ChatContent chat_button;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String target_schema;
  
  public FeedAiRecreationCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.bot_info = paramBuilder.bot_info;
      String str1 = paramBuilder.content;
      if (str1 == null) {
        this.content = "";
      } else {
        this.content = str1;
      } 
      this.chat_button = paramBuilder.chat_button;
      this.bot_user_info = paramBuilder.bot_user_info;
      List<FeedKV> list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.target_schema;
      if (str == null) {
        this.target_schema = "";
      } else {
        this.target_schema = str;
      } 
    } else {
      this.bot_info = ((Builder)str).bot_info;
      this.content = ((Builder)str).content;
      this.chat_button = ((Builder)str).chat_button;
      this.bot_user_info = ((Builder)str).bot_user_info;
      this.business_info = Message.immutableCopyOf(((Builder)str).business_info);
      this.target_schema = ((Builder)str).target_schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedAiRecreationCard> {
    public User bot_info;
    
    public BotUser bot_user_info;
    
    public List<FeedKV> business_info;
    
    public ChatContent chat_button;
    
    public String content;
    
    public String target_schema;
    
    public Builder() {}
    
    public Builder(FeedAiRecreationCard param1FeedAiRecreationCard) {
      super(param1FeedAiRecreationCard);
      if (param1FeedAiRecreationCard == null)
        return; 
      this.bot_info = param1FeedAiRecreationCard.bot_info;
      this.content = param1FeedAiRecreationCard.content;
      this.chat_button = param1FeedAiRecreationCard.chat_button;
      this.bot_user_info = param1FeedAiRecreationCard.bot_user_info;
      this.business_info = Message.copyOf(param1FeedAiRecreationCard.business_info);
      this.target_schema = param1FeedAiRecreationCard.target_schema;
    }
    
    public FeedAiRecreationCard build(boolean param1Boolean) {
      return new FeedAiRecreationCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
