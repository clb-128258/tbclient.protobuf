package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ButtonConf extends Message {
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 1)
  public final IconUrlInfo left_icon;
  
  @ProtoField(tag = 3)
  public final IconUrlInfo right_icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text;
  
  public ButtonConf(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.left_icon = paramBuilder.left_icon;
      String str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      this.right_icon = paramBuilder.right_icon;
    } else {
      this.left_icon = paramBuilder.left_icon;
      this.text = paramBuilder.text;
      this.right_icon = paramBuilder.right_icon;
    } 
  }
  
  public static final class Builder extends Message.Builder<ButtonConf> {
    public IconUrlInfo left_icon;
    
    public IconUrlInfo right_icon;
    
    public String text;
    
    public Builder() {}
    
    public Builder(ButtonConf param1ButtonConf) {
      super(param1ButtonConf);
      if (param1ButtonConf == null)
        return; 
      this.left_icon = param1ButtonConf.left_icon;
      this.text = param1ButtonConf.text;
      this.right_icon = param1ButtonConf.right_icon;
    }
    
    public ButtonConf build(boolean param1Boolean) {
      return new ButtonConf(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
