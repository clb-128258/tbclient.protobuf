package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedAichatCard extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_TARGET_SCHEME = "";
  
  @ProtoField(tag = 1)
  public final User bot_info;
  
  @ProtoField(tag = 5)
  public final BotUser bot_user_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 3)
  public final ChatContent chat_button;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String target_scheme;
  
  public FeedAichatCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
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
      list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.bot_info = ((Builder)list).bot_info;
      this.content = ((Builder)list).content;
      this.chat_button = ((Builder)list).chat_button;
      this.target_scheme = ((Builder)list).target_scheme;
      this.bot_user_info = ((Builder)list).bot_user_info;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedAichatCard> {
    public User bot_info;
    
    public BotUser bot_user_info;
    
    public List<FeedKV> business_info;
    
    public ChatContent chat_button;
    
    public String content;
    
    public String target_scheme;
    
    public Builder() {}
    
    public Builder(FeedAichatCard param1FeedAichatCard) {
      super(param1FeedAichatCard);
      if (param1FeedAichatCard == null)
        return; 
      this.bot_info = param1FeedAichatCard.bot_info;
      this.content = param1FeedAichatCard.content;
      this.chat_button = param1FeedAichatCard.chat_button;
      this.target_scheme = param1FeedAichatCard.target_scheme;
      this.bot_user_info = param1FeedAichatCard.bot_user_info;
      this.business_info = Message.copyOf(param1FeedAichatCard.business_info);
    }
    
    public FeedAichatCard build(boolean param1Boolean) {
      return new FeedAichatCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
