package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SpriteShowStrategy extends Message {
  public static final Integer DEFAULT_ALTER_SECONDS;
  
  public static final Integer DEFAULT_ALTER_TIMES;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer alter_seconds;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer alter_times;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ALTER_SECONDS = integer;
    DEFAULT_ALTER_TIMES = integer;
  }
  
  public SpriteShowStrategy(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.alter_seconds;
      if (integer1 == null) {
        this.alter_seconds = DEFAULT_ALTER_SECONDS;
      } else {
        this.alter_seconds = integer1;
      } 
      integer = paramBuilder.alter_times;
      if (integer == null) {
        this.alter_times = DEFAULT_ALTER_TIMES;
      } else {
        this.alter_times = integer;
      } 
    } else {
      this.alter_seconds = ((Builder)integer).alter_seconds;
      this.alter_times = ((Builder)integer).alter_times;
    } 
  }
  
  public static final class Builder extends Message.Builder<SpriteShowStrategy> {
    public Integer alter_seconds;
    
    public Integer alter_times;
    
    public Builder() {}
    
    public Builder(SpriteShowStrategy param1SpriteShowStrategy) {
      super(param1SpriteShowStrategy);
      if (param1SpriteShowStrategy == null)
        return; 
      this.alter_seconds = param1SpriteShowStrategy.alter_seconds;
      this.alter_times = param1SpriteShowStrategy.alter_times;
    }
    
    public SpriteShowStrategy build(boolean param1Boolean) {
      return new SpriteShowStrategy(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
