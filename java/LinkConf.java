package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LinkConf extends Message {
  public static final String DEFAULT_TEXT = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  public LinkConf(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
    } else {
      this.url = ((Builder)str).url;
      this.text = ((Builder)str).text;
    } 
  }
  
  public static final class Builder extends Message.Builder<LinkConf> {
    public String text;
    
    public String url;
    
    public Builder() {}
    
    public Builder(LinkConf param1LinkConf) {
      super(param1LinkConf);
      if (param1LinkConf == null)
        return; 
      this.url = param1LinkConf.url;
      this.text = param1LinkConf.text;
    }
    
    public LinkConf build(boolean param1Boolean) {
      return new LinkConf(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
