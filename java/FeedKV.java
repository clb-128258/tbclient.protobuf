package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedKV extends Message {
  public static final String DEFAULT_KEY = "";
  
  public static final String DEFAULT_VALUE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String key;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String value;
  
  public FeedKV(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.key;
      if (str1 == null) {
        this.key = "";
      } else {
        this.key = str1;
      } 
      str = paramBuilder.value;
      if (str == null) {
        this.value = "";
      } else {
        this.value = str;
      } 
    } else {
      this.key = ((Builder)str).key;
      this.value = ((Builder)str).value;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedKV> {
    public String key;
    
    public String value;
    
    public Builder() {}
    
    public Builder(FeedKV param1FeedKV) {
      super(param1FeedKV);
      if (param1FeedKV == null)
        return; 
      this.key = param1FeedKV.key;
      this.value = param1FeedKV.value;
    }
    
    public FeedKV build(boolean param1Boolean) {
      return new FeedKV(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
