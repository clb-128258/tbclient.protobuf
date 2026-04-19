package tbclient.SidebarHome;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GameTabInfo extends Message {
  public static final Integer DEFAULT_ACTION_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_ACTION_URI = "";
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_TAB_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer action_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String action_uri;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tab_name;
  
  public GameTabInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.tab_name;
      if (str1 == null) {
        this.tab_name = "";
      } else {
        this.tab_name = str1;
      } 
      str1 = paramBuilder.icon_url;
      if (str1 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str1;
      } 
      Integer integer = paramBuilder.action_type;
      if (integer == null) {
        this.action_type = DEFAULT_ACTION_TYPE;
      } else {
        this.action_type = integer;
      } 
      str = paramBuilder.action_uri;
      if (str == null) {
        this.action_uri = "";
      } else {
        this.action_uri = str;
      } 
    } else {
      this.tab_name = ((Builder)str).tab_name;
      this.icon_url = ((Builder)str).icon_url;
      this.action_type = ((Builder)str).action_type;
      this.action_uri = ((Builder)str).action_uri;
    } 
  }
  
  public static final class Builder extends Message.Builder<GameTabInfo> {
    public Integer action_type;
    
    public String action_uri;
    
    public String icon_url;
    
    public String tab_name;
    
    public Builder() {}
    
    public Builder(GameTabInfo param1GameTabInfo) {
      super(param1GameTabInfo);
      if (param1GameTabInfo == null)
        return; 
      this.tab_name = param1GameTabInfo.tab_name;
      this.icon_url = param1GameTabInfo.icon_url;
      this.action_type = param1GameTabInfo.action_type;
      this.action_uri = param1GameTabInfo.action_uri;
    }
    
    public GameTabInfo build(boolean param1Boolean) {
      return new GameTabInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
