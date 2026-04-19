package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SuccessToast extends Message {
  public static final String DEFAULT_BUTTON_SCHEMA = "";
  
  public static final String DEFAULT_BUTTON_TEXT = "";
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String button_schema;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String button_text;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public SuccessToast(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.content;
      if (str1 == null) {
        this.content = "";
      } else {
        this.content = str1;
      } 
      str1 = paramBuilder.button_text;
      if (str1 == null) {
        this.button_text = "";
      } else {
        this.button_text = str1;
      } 
      str = paramBuilder.button_schema;
      if (str == null) {
        this.button_schema = "";
      } else {
        this.button_schema = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.content = ((Builder)str).content;
      this.button_text = ((Builder)str).button_text;
      this.button_schema = ((Builder)str).button_schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<SuccessToast> {
    public String button_schema;
    
    public String button_text;
    
    public String content;
    
    public String title;
    
    public Builder() {}
    
    public Builder(SuccessToast param1SuccessToast) {
      super(param1SuccessToast);
      if (param1SuccessToast == null)
        return; 
      this.title = param1SuccessToast.title;
      this.content = param1SuccessToast.content;
      this.button_text = param1SuccessToast.button_text;
      this.button_schema = param1SuccessToast.button_schema;
    }
    
    public SuccessToast build(boolean param1Boolean) {
      return new SuccessToast(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
