package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class IconMark extends Message {
  public static final String DEFAULT_TYPE = "";
  
  @ProtoField(tag = 2)
  public final ThemeColorInfo icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String type;
  
  public IconMark(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.type;
      if (str == null) {
        this.type = "";
      } else {
        this.type = str;
      } 
      this.icon = paramBuilder.icon;
    } else {
      this.type = paramBuilder.type;
      this.icon = paramBuilder.icon;
    } 
  }
  
  public static final class Builder extends Message.Builder<IconMark> {
    public ThemeColorInfo icon;
    
    public String type;
    
    public Builder() {}
    
    public Builder(IconMark param1IconMark) {
      super(param1IconMark);
      if (param1IconMark == null)
        return; 
      this.type = param1IconMark.type;
      this.icon = param1IconMark.icon;
    }
    
    public IconMark build(boolean param1Boolean) {
      return new IconMark(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
