package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BottomBar extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 3)
  public final ButtonConf button;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public BottomBar(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      this.button = paramBuilder.button;
      str = paramBuilder.scheme;
      if (str == null) {
        this.scheme = "";
      } else {
        this.scheme = str;
      } 
    } else {
      this.icon = ((Builder)str).icon;
      this.title = ((Builder)str).title;
      this.button = ((Builder)str).button;
      this.scheme = ((Builder)str).scheme;
    } 
  }
  
  public static final class Builder extends Message.Builder<BottomBar> {
    public ButtonConf button;
    
    public String icon;
    
    public String scheme;
    
    public String title;
    
    public Builder() {}
    
    public Builder(BottomBar param1BottomBar) {
      super(param1BottomBar);
      if (param1BottomBar == null)
        return; 
      this.icon = param1BottomBar.icon;
      this.title = param1BottomBar.title;
      this.button = param1BottomBar.button;
      this.scheme = param1BottomBar.scheme;
    }
    
    public BottomBar build(boolean param1Boolean) {
      return new BottomBar(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
