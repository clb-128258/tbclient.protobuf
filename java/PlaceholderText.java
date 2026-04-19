package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PlaceholderText extends Message {
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  public PlaceholderText(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
    } else {
      this.text = ((Builder)str).text;
    } 
  }
  
  public static final class Builder extends Message.Builder<PlaceholderText> {
    public String text;
    
    public Builder() {}
    
    public Builder(PlaceholderText param1PlaceholderText) {
      super(param1PlaceholderText);
      if (param1PlaceholderText == null)
        return; 
      this.text = param1PlaceholderText.text;
    }
    
    public PlaceholderText build(boolean param1Boolean) {
      return new PlaceholderText(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
