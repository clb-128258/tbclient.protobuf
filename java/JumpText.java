package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class JumpText extends Message {
  public static final String DEFAULT_SCHEMA = "";
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 3)
  public final ThemeColorInfo button_color;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 4)
  public final ThemeColorInfo text_color;
  
  public JumpText(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      this.button_color = paramBuilder.button_color;
      this.text_color = paramBuilder.text_color;
    } else {
      this.text = paramBuilder.text;
      this.schema = paramBuilder.schema;
      this.button_color = paramBuilder.button_color;
      this.text_color = paramBuilder.text_color;
    } 
  }
  
  public static final class Builder extends Message.Builder<JumpText> {
    public ThemeColorInfo button_color;
    
    public String schema;
    
    public String text;
    
    public ThemeColorInfo text_color;
    
    public Builder() {}
    
    public Builder(JumpText param1JumpText) {
      super(param1JumpText);
      if (param1JumpText == null)
        return; 
      this.text = param1JumpText.text;
      this.schema = param1JumpText.schema;
      this.button_color = param1JumpText.button_color;
      this.text_color = param1JumpText.text_color;
    }
    
    public JumpText build(boolean param1Boolean) {
      return new JumpText(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
