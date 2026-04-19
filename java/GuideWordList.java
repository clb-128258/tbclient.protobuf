package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GuideWordList extends Message {
  public static final String DEFAULT_GUIDE_WORD = "";
  
  public static final String DEFAULT_KEY_WORD = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String guide_word;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String key_word;
  
  public GuideWordList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.guide_word;
      if (str1 == null) {
        this.guide_word = "";
      } else {
        this.guide_word = str1;
      } 
      str = paramBuilder.key_word;
      if (str == null) {
        this.key_word = "";
      } else {
        this.key_word = str;
      } 
    } else {
      this.guide_word = ((Builder)str).guide_word;
      this.key_word = ((Builder)str).key_word;
    } 
  }
  
  public static final class Builder extends Message.Builder<GuideWordList> {
    public String guide_word;
    
    public String key_word;
    
    public Builder() {}
    
    public Builder(GuideWordList param1GuideWordList) {
      super(param1GuideWordList);
      if (param1GuideWordList == null)
        return; 
      this.guide_word = param1GuideWordList.guide_word;
      this.key_word = param1GuideWordList.key_word;
    }
    
    public GuideWordList build(boolean param1Boolean) {
      return new GuideWordList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
