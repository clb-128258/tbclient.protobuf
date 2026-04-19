package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class StyleConf extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_SCENE = "";
  
  @ProtoField(tag = 3)
  public final StyleConfExtra android_extra;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 6)
  public final StyleContentInfo dark;
  
  @ProtoField(tag = 5)
  public final StyleContentInfo day;
  
  @ProtoField(tag = 4)
  public final StyleConfExtra ios_extra;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String scene;
  
  public StyleConf(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.scene;
      if (str == null) {
        this.scene = "";
      } else {
        this.scene = str;
      } 
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
      this.android_extra = paramBuilder.android_extra;
      this.ios_extra = paramBuilder.ios_extra;
      this.day = paramBuilder.day;
      this.dark = paramBuilder.dark;
    } else {
      this.scene = paramBuilder.scene;
      this.content = paramBuilder.content;
      this.android_extra = paramBuilder.android_extra;
      this.ios_extra = paramBuilder.ios_extra;
      this.day = paramBuilder.day;
      this.dark = paramBuilder.dark;
    } 
  }
  
  public static final class Builder extends Message.Builder<StyleConf> {
    public StyleConfExtra android_extra;
    
    public String content;
    
    public StyleContentInfo dark;
    
    public StyleContentInfo day;
    
    public StyleConfExtra ios_extra;
    
    public String scene;
    
    public Builder() {}
    
    public Builder(StyleConf param1StyleConf) {
      super(param1StyleConf);
      if (param1StyleConf == null)
        return; 
      this.scene = param1StyleConf.scene;
      this.content = param1StyleConf.content;
      this.android_extra = param1StyleConf.android_extra;
      this.ios_extra = param1StyleConf.ios_extra;
      this.day = param1StyleConf.day;
      this.dark = param1StyleConf.dark;
    }
    
    public StyleConf build(boolean param1Boolean) {
      return new StyleConf(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
