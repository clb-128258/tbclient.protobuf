package tbclient.PbList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BawuDeleteReasonItem extends Message {
  public static final String DEFAULT_JUMP_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String jump_url;
  
  public BawuDeleteReasonItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
  
  public static final class Builder extends Message.Builder<BawuDeleteReasonItem> {
    public String jump_url;
    
    public Builder() {}
    
    public Builder(BawuDeleteReasonItem param1BawuDeleteReasonItem) {
      super(param1BawuDeleteReasonItem);
      if (param1BawuDeleteReasonItem == null)
        return; 
      this.jump_url = param1BawuDeleteReasonItem.jump_url;
    }
    
    public BawuDeleteReasonItem build(boolean param1Boolean) {
      return new BawuDeleteReasonItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
