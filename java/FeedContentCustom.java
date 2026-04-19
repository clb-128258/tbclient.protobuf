package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedContentCustom extends Message {
  public static final String DEFAULT_DATA = "";
  
  public static final String DEFAULT_STYLE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String data;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String style;
  
  public FeedContentCustom(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.style;
      if (str1 == null) {
        this.style = "";
      } else {
        this.style = str1;
      } 
      str = paramBuilder.data;
      if (str == null) {
        this.data = "";
      } else {
        this.data = str;
      } 
    } else {
      this.style = ((Builder)str).style;
      this.data = ((Builder)str).data;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedContentCustom> {
    public String data;
    
    public String style;
    
    public Builder() {}
    
    public Builder(FeedContentCustom param1FeedContentCustom) {
      super(param1FeedContentCustom);
      if (param1FeedContentCustom == null)
        return; 
      this.style = param1FeedContentCustom.style;
      this.data = param1FeedContentCustom.data;
    }
    
    public FeedContentCustom build(boolean param1Boolean) {
      return new FeedContentCustom(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
