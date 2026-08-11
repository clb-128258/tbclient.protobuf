package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GuideInfo extends Message {
  public static final String DEFAULT_DEFAULT_TEXT = "";
  
  public static final String DEFAULT_POLL_CONS_TEXT = "";
  
  public static final String DEFAULT_POLL_PROS_TEXT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String default_text;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String poll_cons_text;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String poll_pros_text;
  
  public GuideInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.default_text;
      if (str1 == null) {
        this.default_text = "";
      } else {
        this.default_text = str1;
      } 
      str1 = paramBuilder.poll_pros_text;
      if (str1 == null) {
        this.poll_pros_text = "";
      } else {
        this.poll_pros_text = str1;
      } 
      str = paramBuilder.poll_cons_text;
      if (str == null) {
        this.poll_cons_text = "";
      } else {
        this.poll_cons_text = str;
      } 
    } else {
      this.default_text = ((Builder)str).default_text;
      this.poll_pros_text = ((Builder)str).poll_pros_text;
      this.poll_cons_text = ((Builder)str).poll_cons_text;
    } 
  }
  
  public static final class Builder extends Message.Builder<GuideInfo> {
    public String default_text;
    
    public String poll_cons_text;
    
    public String poll_pros_text;
    
    public Builder() {}
    
    public Builder(GuideInfo param1GuideInfo) {
      super(param1GuideInfo);
      if (param1GuideInfo == null)
        return; 
      this.default_text = param1GuideInfo.default_text;
      this.poll_pros_text = param1GuideInfo.poll_pros_text;
      this.poll_cons_text = param1GuideInfo.poll_cons_text;
    }
    
    public GuideInfo build(boolean param1Boolean) {
      return new GuideInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
