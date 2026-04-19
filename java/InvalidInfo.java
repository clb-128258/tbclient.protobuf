package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class InvalidInfo extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_ICON = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  public InvalidInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
    } else {
      this.icon = ((Builder)str).icon;
      this.content = ((Builder)str).content;
    } 
  }
  
  public static final class Builder extends Message.Builder<InvalidInfo> {
    public String content;
    
    public String icon;
    
    public Builder() {}
    
    public Builder(InvalidInfo param1InvalidInfo) {
      super(param1InvalidInfo);
      if (param1InvalidInfo == null)
        return; 
      this.icon = param1InvalidInfo.icon;
      this.content = param1InvalidInfo.content;
    }
    
    public InvalidInfo build(boolean param1Boolean) {
      return new InvalidInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
