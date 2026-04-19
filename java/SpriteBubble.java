package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SpriteBubble extends Message {
  public static final Integer DEFAULT_DISAPPEAR_SECONDS;
  
  public static final String DEFAULT_EXT = "";
  
  public static final Integer DEFAULT_NEED_SEND;
  
  public static final Integer DEFAULT_SCENE;
  
  public static final String DEFAULT_SEND_TEXT = "";
  
  public static final Integer DEFAULT_SPEECH_TYPE;
  
  public static final String DEFAULT_SPRITE_TEXT = "";
  
  public static final String DEFAULT_TEXT = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_VERSION = "";
  
  @ProtoField(tag = 10)
  public final SpriteButton button_info;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer disappear_seconds;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String ext;
  
  @ProtoField(tag = 8)
  public final ThemeColorInfo icon_url;
  
  @ProtoField(tag = 15)
  public final ThemeColorInfo img;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer need_send;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer scene;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String send_text;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer speech_type;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String sprite_text;
  
  @ProtoField(tag = 6)
  public final PbContent struct_data;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 7)
  public final ThemeColorInfo text_color;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String version;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SCENE = integer;
    DEFAULT_NEED_SEND = integer;
    DEFAULT_SPEECH_TYPE = integer;
    DEFAULT_DISAPPEAR_SECONDS = integer;
    DEFAULT_TYPE = integer;
  }
  
  public SpriteBubble(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer4 = paramBuilder.scene;
      if (integer4 == null) {
        this.scene = DEFAULT_SCENE;
      } else {
        this.scene = integer4;
      } 
      String str3 = paramBuilder.text;
      if (str3 == null) {
        this.text = "";
      } else {
        this.text = str3;
      } 
      Integer integer3 = paramBuilder.need_send;
      if (integer3 == null) {
        this.need_send = DEFAULT_NEED_SEND;
      } else {
        this.need_send = integer3;
      } 
      String str2 = paramBuilder.send_text;
      if (str2 == null) {
        this.send_text = "";
      } else {
        this.send_text = str2;
      } 
      str2 = paramBuilder.version;
      if (str2 == null) {
        this.version = "";
      } else {
        this.version = str2;
      } 
      this.struct_data = paramBuilder.struct_data;
      this.text_color = paramBuilder.text_color;
      this.icon_url = paramBuilder.icon_url;
      str2 = paramBuilder.sprite_text;
      if (str2 == null) {
        this.sprite_text = "";
      } else {
        this.sprite_text = str2;
      } 
      this.button_info = paramBuilder.button_info;
      Integer integer2 = paramBuilder.speech_type;
      if (integer2 == null) {
        this.speech_type = DEFAULT_SPEECH_TYPE;
      } else {
        this.speech_type = integer2;
      } 
      integer2 = paramBuilder.disappear_seconds;
      if (integer2 == null) {
        this.disappear_seconds = DEFAULT_DISAPPEAR_SECONDS;
      } else {
        this.disappear_seconds = integer2;
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      Integer integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      this.img = paramBuilder.img;
      str = paramBuilder.ext;
      if (str == null) {
        this.ext = "";
      } else {
        this.ext = str;
      } 
    } else {
      this.scene = ((Builder)str).scene;
      this.text = ((Builder)str).text;
      this.need_send = ((Builder)str).need_send;
      this.send_text = ((Builder)str).send_text;
      this.version = ((Builder)str).version;
      this.struct_data = ((Builder)str).struct_data;
      this.text_color = ((Builder)str).text_color;
      this.icon_url = ((Builder)str).icon_url;
      this.sprite_text = ((Builder)str).sprite_text;
      this.button_info = ((Builder)str).button_info;
      this.speech_type = ((Builder)str).speech_type;
      this.disappear_seconds = ((Builder)str).disappear_seconds;
      this.title = ((Builder)str).title;
      this.type = ((Builder)str).type;
      this.img = ((Builder)str).img;
      this.ext = ((Builder)str).ext;
    } 
  }
  
  public static final class Builder extends Message.Builder<SpriteBubble> {
    public SpriteButton button_info;
    
    public Integer disappear_seconds;
    
    public String ext;
    
    public ThemeColorInfo icon_url;
    
    public ThemeColorInfo img;
    
    public Integer need_send;
    
    public Integer scene;
    
    public String send_text;
    
    public Integer speech_type;
    
    public String sprite_text;
    
    public PbContent struct_data;
    
    public String text;
    
    public ThemeColorInfo text_color;
    
    public String title;
    
    public Integer type;
    
    public String version;
    
    public Builder() {}
    
    public Builder(SpriteBubble param1SpriteBubble) {
      super(param1SpriteBubble);
      if (param1SpriteBubble == null)
        return; 
      this.scene = param1SpriteBubble.scene;
      this.text = param1SpriteBubble.text;
      this.need_send = param1SpriteBubble.need_send;
      this.send_text = param1SpriteBubble.send_text;
      this.version = param1SpriteBubble.version;
      this.struct_data = param1SpriteBubble.struct_data;
      this.text_color = param1SpriteBubble.text_color;
      this.icon_url = param1SpriteBubble.icon_url;
      this.sprite_text = param1SpriteBubble.sprite_text;
      this.button_info = param1SpriteBubble.button_info;
      this.speech_type = param1SpriteBubble.speech_type;
      this.disappear_seconds = param1SpriteBubble.disappear_seconds;
      this.title = param1SpriteBubble.title;
      this.type = param1SpriteBubble.type;
      this.img = param1SpriteBubble.img;
      this.ext = param1SpriteBubble.ext;
    }
    
    public SpriteBubble build(boolean param1Boolean) {
      return new SpriteBubble(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
