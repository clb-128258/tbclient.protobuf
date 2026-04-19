package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BotReplyContent extends Message {
  public static final String DEFAULT_TARGET_SCHEME = "";
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String target_scheme;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 2)
  public final BotReplyUserInfo user_info;
  
  public BotReplyContent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      this.user_info = paramBuilder.user_info;
      str = paramBuilder.target_scheme;
      if (str == null) {
        this.target_scheme = "";
      } else {
        this.target_scheme = str;
      } 
    } else {
      this.text = ((Builder)str).text;
      this.user_info = ((Builder)str).user_info;
      this.target_scheme = ((Builder)str).target_scheme;
    } 
  }
  
  public static final class Builder extends Message.Builder<BotReplyContent> {
    public String target_scheme;
    
    public String text;
    
    public BotReplyUserInfo user_info;
    
    public Builder() {}
    
    public Builder(BotReplyContent param1BotReplyContent) {
      super(param1BotReplyContent);
      if (param1BotReplyContent == null)
        return; 
      this.text = param1BotReplyContent.text;
      this.user_info = param1BotReplyContent.user_info;
      this.target_scheme = param1BotReplyContent.target_scheme;
    }
    
    public BotReplyContent build(boolean param1Boolean) {
      return new BotReplyContent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
