package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SpriteButton extends Message {
  public static final String DEFAULT_SCHEMA = "";
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  public SpriteButton(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.text = ((Builder)str).text;
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<SpriteButton> {
    public String schema;
    
    public String text;
    
    public Builder() {}
    
    public Builder(SpriteButton param1SpriteButton) {
      super(param1SpriteButton);
      if (param1SpriteButton == null)
        return; 
      this.text = param1SpriteButton.text;
      this.schema = param1SpriteButton.schema;
    }
    
    public SpriteButton build(boolean param1Boolean) {
      return new SpriteButton(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
