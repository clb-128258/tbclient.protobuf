package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LevelRes extends Message {
  public static final String DEFAULT_POP_KEY = "";
  
  public static final String DEFAULT_POP_VALUE = "";
  
  @ProtoField(tag = 1)
  public final LevelPop pop;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pop_key;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pop_value;
  
  public LevelRes(Builder paramBuilder, boolean paramBoolean) {
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
  
  public static final class Builder extends Message.Builder<LevelRes> {
    public LevelPop pop;
    
    public String pop_key;
    
    public String pop_value;
    
    public Builder() {}
    
    public Builder(LevelRes param1LevelRes) {
      super(param1LevelRes);
      if (param1LevelRes == null)
        return; 
      this.pop = param1LevelRes.pop;
      this.pop_key = param1LevelRes.pop_key;
      this.pop_value = param1LevelRes.pop_value;
    }
    
    public LevelRes build(boolean param1Boolean) {
      return new LevelRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
