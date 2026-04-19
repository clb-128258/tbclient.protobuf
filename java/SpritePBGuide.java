package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SpritePBGuide extends Message {
  public static final String DEFAULT_BUTTON_TEXT = "";
  
  public static final String DEFAULT_GUIDE_TEXT = "";
  
  public static final Long DEFAULT_GUIDE_TYPE = Long.valueOf(0L);
  
  public static final String DEFAULT_JUMP_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String button_text;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String guide_text;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long guide_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String jump_url;
  
  public SpritePBGuide(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.guide_type;
      if (long_ == null) {
        this.guide_type = DEFAULT_GUIDE_TYPE;
      } else {
        this.guide_type = long_;
      } 
      String str1 = paramBuilder.guide_text;
      if (str1 == null) {
        this.guide_text = "";
      } else {
        this.guide_text = str1;
      } 
      str1 = paramBuilder.button_text;
      if (str1 == null) {
        this.button_text = "";
      } else {
        this.button_text = str1;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.guide_type = ((Builder)str).guide_type;
      this.guide_text = ((Builder)str).guide_text;
      this.button_text = ((Builder)str).button_text;
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
  
  public static final class Builder extends Message.Builder<SpritePBGuide> {
    public String button_text;
    
    public String guide_text;
    
    public Long guide_type;
    
    public String jump_url;
    
    public Builder() {}
    
    public Builder(SpritePBGuide param1SpritePBGuide) {
      super(param1SpritePBGuide);
      if (param1SpritePBGuide == null)
        return; 
      this.guide_type = param1SpritePBGuide.guide_type;
      this.guide_text = param1SpritePBGuide.guide_text;
      this.button_text = param1SpritePBGuide.button_text;
      this.jump_url = param1SpritePBGuide.jump_url;
    }
    
    public SpritePBGuide build(boolean param1Boolean) {
      return new SpritePBGuide(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
