package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Link extends Message {
  public static final String DEFAULT_TEXT = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public Link(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.text = ((Builder)str).text;
      this.url = ((Builder)str).url;
    } 
  }
  
  public static final class Builder extends Message.Builder<Link> {
    public String text;
    
    public String url;
    
    public Builder() {}
    
    public Builder(Link param1Link) {
      super(param1Link);
      if (param1Link == null)
        return; 
      this.text = param1Link.text;
      this.url = param1Link.url;
    }
    
    public Link build(boolean param1Boolean) {
      return new Link(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
