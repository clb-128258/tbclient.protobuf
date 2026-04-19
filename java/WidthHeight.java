package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class WidthHeight extends Message {
  public static final Integer DEFAULT_HEIGHT;
  
  public static final Integer DEFAULT_WIDTH;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer height;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer width;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_WIDTH = integer;
    DEFAULT_HEIGHT = integer;
  }
  
  public WidthHeight(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.width;
      if (integer1 == null) {
        this.width = DEFAULT_WIDTH;
      } else {
        this.width = integer1;
      } 
      integer = paramBuilder.height;
      if (integer == null) {
        this.height = DEFAULT_HEIGHT;
      } else {
        this.height = integer;
      } 
    } else {
      this.width = ((Builder)integer).width;
      this.height = ((Builder)integer).height;
    } 
  }
  
  public static final class Builder extends Message.Builder<WidthHeight> {
    public Integer height;
    
    public Integer width;
    
    public Builder() {}
    
    public Builder(WidthHeight param1WidthHeight) {
      super(param1WidthHeight);
      if (param1WidthHeight == null)
        return; 
      this.width = param1WidthHeight.width;
      this.height = param1WidthHeight.height;
    }
    
    public WidthHeight build(boolean param1Boolean) {
      return new WidthHeight(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
