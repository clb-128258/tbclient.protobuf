package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class IconRes extends Message {
  public static final String DEFAULT_POP_KEY = "";
  
  public static final String DEFAULT_POP_VALUE = "";
  
  @ProtoField(tag = 1)
  public final IconPop pop;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pop_key;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pop_value;
  
  public IconRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.pop = paramBuilder.pop;
      String str1 = paramBuilder.pop_key;
      if (str1 == null) {
        this.pop_key = "";
      } else {
        this.pop_key = str1;
      } 
      str = paramBuilder.pop_value;
      if (str == null) {
        this.pop_value = "";
      } else {
        this.pop_value = str;
      } 
    } else {
      this.pop = ((Builder)str).pop;
      this.pop_key = ((Builder)str).pop_key;
      this.pop_value = ((Builder)str).pop_value;
    } 
  }
  
  public static final class Builder extends Message.Builder<IconRes> {
    public IconPop pop;
    
    public String pop_key;
    
    public String pop_value;
    
    public Builder() {}
    
    public Builder(IconRes param1IconRes) {
      super(param1IconRes);
      if (param1IconRes == null)
        return; 
      this.pop = param1IconRes.pop;
      this.pop_key = param1IconRes.pop_key;
      this.pop_value = param1IconRes.pop_value;
    }
    
    public IconRes build(boolean param1Boolean) {
      return new IconRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
