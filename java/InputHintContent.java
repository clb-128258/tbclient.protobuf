package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class InputHintContent extends Message {
  public static final String DEFAULT_TEXT = "";
  
  public static final String DEFAULT_TYPE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String type;
  
  public InputHintContent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.type;
      if (str1 == null) {
        this.type = "";
      } else {
        this.type = str1;
      } 
      str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.text = ((Builder)str).text;
    } 
  }
  
  public static final class Builder extends Message.Builder<InputHintContent> {
    public String text;
    
    public String type;
    
    public Builder() {}
    
    public Builder(InputHintContent param1InputHintContent) {
      super(param1InputHintContent);
      if (param1InputHintContent == null)
        return; 
      this.type = param1InputHintContent.type;
      this.text = param1InputHintContent.text;
    }
    
    public InputHintContent build(boolean param1Boolean) {
      return new InputHintContent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
