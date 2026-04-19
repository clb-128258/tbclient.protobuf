package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumShowInfoTag extends Message {
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 3)
  public final ThemeColorInfo bg_color;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 2)
  public final ThemeColorInfo text_color;
  
  public ForumShowInfoTag(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      this.text_color = paramBuilder.text_color;
      this.bg_color = paramBuilder.bg_color;
    } else {
      this.text = paramBuilder.text;
      this.text_color = paramBuilder.text_color;
      this.bg_color = paramBuilder.bg_color;
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumShowInfoTag> {
    public ThemeColorInfo bg_color;
    
    public String text;
    
    public ThemeColorInfo text_color;
    
    public Builder() {}
    
    public Builder(ForumShowInfoTag param1ForumShowInfoTag) {
      super(param1ForumShowInfoTag);
      if (param1ForumShowInfoTag == null)
        return; 
      this.text = param1ForumShowInfoTag.text;
      this.text_color = param1ForumShowInfoTag.text_color;
      this.bg_color = param1ForumShowInfoTag.bg_color;
    }
    
    public ForumShowInfoTag build(boolean param1Boolean) {
      return new ForumShowInfoTag(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
