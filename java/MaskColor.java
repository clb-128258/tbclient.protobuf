package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MaskColor extends Message {
  @ProtoField(tag = 1)
  public final ThemeColorInfo begin_color;
  
  @ProtoField(tag = 2)
  public final ThemeColorInfo end_color;
  
  public MaskColor(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.begin_color = paramBuilder.begin_color;
      this.end_color = paramBuilder.end_color;
    } else {
      this.begin_color = paramBuilder.begin_color;
      this.end_color = paramBuilder.end_color;
    } 
  }
  
  public static final class Builder extends Message.Builder<MaskColor> {
    public ThemeColorInfo begin_color;
    
    public ThemeColorInfo end_color;
    
    public Builder() {}
    
    public Builder(MaskColor param1MaskColor) {
      super(param1MaskColor);
      if (param1MaskColor == null)
        return; 
      this.begin_color = param1MaskColor.begin_color;
      this.end_color = param1MaskColor.end_color;
    }
    
    public MaskColor build(boolean param1Boolean) {
      return new MaskColor(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
