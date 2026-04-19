package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TextPlugin extends Message {
  public static final String DEFAULT_PLUGINS_TXT = "";
  
  public static final String DEFAULT_PLUGINS_TYPE = "";
  
  @ProtoField(tag = 3)
  public final GameDetail game_detail;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String plugins_txt;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String plugins_type;
  
  public TextPlugin(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.plugins_txt;
      if (str == null) {
        this.plugins_txt = "";
      } else {
        this.plugins_txt = str;
      } 
      str = paramBuilder.plugins_type;
      if (str == null) {
        this.plugins_type = "";
      } else {
        this.plugins_type = str;
      } 
      this.game_detail = paramBuilder.game_detail;
    } else {
      this.plugins_txt = paramBuilder.plugins_txt;
      this.plugins_type = paramBuilder.plugins_type;
      this.game_detail = paramBuilder.game_detail;
    } 
  }
  
  public static final class Builder extends Message.Builder<TextPlugin> {
    public GameDetail game_detail;
    
    public String plugins_txt;
    
    public String plugins_type;
    
    public Builder() {}
    
    public Builder(TextPlugin param1TextPlugin) {
      super(param1TextPlugin);
      if (param1TextPlugin == null)
        return; 
      this.plugins_txt = param1TextPlugin.plugins_txt;
      this.plugins_type = param1TextPlugin.plugins_type;
      this.game_detail = param1TextPlugin.game_detail;
    }
    
    public TextPlugin build(boolean param1Boolean) {
      return new TextPlugin(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
