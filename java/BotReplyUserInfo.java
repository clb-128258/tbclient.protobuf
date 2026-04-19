package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BotReplyUserInfo extends Message {
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PORTRAIT_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String portrait_url;
  
  public BotReplyUserInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.portrait_url;
      if (str1 == null) {
        this.portrait_url = "";
      } else {
        this.portrait_url = str1;
      } 
      str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.icon_url;
      if (str == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str;
      } 
    } else {
      this.portrait_url = ((Builder)str).portrait_url;
      this.name = ((Builder)str).name;
      this.icon_url = ((Builder)str).icon_url;
    } 
  }
  
  public static final class Builder extends Message.Builder<BotReplyUserInfo> {
    public String icon_url;
    
    public String name;
    
    public String portrait_url;
    
    public Builder() {}
    
    public Builder(BotReplyUserInfo param1BotReplyUserInfo) {
      super(param1BotReplyUserInfo);
      if (param1BotReplyUserInfo == null)
        return; 
      this.portrait_url = param1BotReplyUserInfo.portrait_url;
      this.name = param1BotReplyUserInfo.name;
      this.icon_url = param1BotReplyUserInfo.icon_url;
    }
    
    public BotReplyUserInfo build(boolean param1Boolean) {
      return new BotReplyUserInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
