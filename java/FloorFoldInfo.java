package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FloorFoldInfo extends Message {
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  public FloorFoldInfo(Builder paramBuilder, boolean paramBoolean) {
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
  
  public static final class Builder extends Message.Builder<FloorFoldInfo> {
    public String text;
    
    public Builder() {}
    
    public Builder(FloorFoldInfo param1FloorFoldInfo) {
      super(param1FloorFoldInfo);
      if (param1FloorFoldInfo == null)
        return; 
      this.text = param1FloorFoldInfo.text;
    }
    
    public FloorFoldInfo build(boolean param1Boolean) {
      return new FloorFoldInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
