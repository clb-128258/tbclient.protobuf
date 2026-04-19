package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SugList extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String schema;
  
  public SugList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.content;
      if (str1 == null) {
        this.content = "";
      } else {
        this.content = str1;
      } 
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.content = ((Builder)str).content;
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<SugList> {
    public String content;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(SugList param1SugList) {
      super(param1SugList);
      if (param1SugList == null)
        return; 
      this.content = param1SugList.content;
      this.schema = param1SugList.schema;
    }
    
    public SugList build(boolean param1Boolean) {
      return new SugList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
