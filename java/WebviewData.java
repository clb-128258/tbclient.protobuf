package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class WebviewData extends Message {
  public static final String DEFAULT_DATA = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String data;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  public WebviewData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.data;
      if (str == null) {
        this.data = "";
      } else {
        this.data = str;
      } 
    } else {
      this.url = ((Builder)str).url;
      this.data = ((Builder)str).data;
    } 
  }
  
  public static final class Builder extends Message.Builder<WebviewData> {
    public String data;
    
    public String url;
    
    public Builder() {}
    
    public Builder(WebviewData param1WebviewData) {
      super(param1WebviewData);
      if (param1WebviewData == null)
        return; 
      this.url = param1WebviewData.url;
      this.data = param1WebviewData.data;
    }
    
    public WebviewData build(boolean param1Boolean) {
      return new WebviewData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
