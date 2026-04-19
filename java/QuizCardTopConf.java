package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class QuizCardTopConf extends Message {
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 1)
  public final ThemeColorInfo img;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text;
  
  public QuizCardTopConf(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.img = paramBuilder.img;
      str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
    } else {
      this.img = ((Builder)str).img;
      this.text = ((Builder)str).text;
    } 
  }
  
  public static final class Builder extends Message.Builder<QuizCardTopConf> {
    public ThemeColorInfo img;
    
    public String text;
    
    public Builder() {}
    
    public Builder(QuizCardTopConf param1QuizCardTopConf) {
      super(param1QuizCardTopConf);
      if (param1QuizCardTopConf == null)
        return; 
      this.img = param1QuizCardTopConf.img;
      this.text = param1QuizCardTopConf.text;
    }
    
    public QuizCardTopConf build(boolean param1Boolean) {
      return new QuizCardTopConf(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
