package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.SpriteBubble;

public final class FrsSpriteBubble extends Message {
  public static final Integer DEFAULT_BUBBLE_SECONDS = Integer.valueOf(0);
  
  public static final String DEFAULT_BUBBLE_URI = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer bubble_seconds;
  
  @ProtoField(tag = 1)
  public final SpriteBubble bubble_text;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String bubble_uri;
  
  public FrsSpriteBubble(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.bubble_text = paramBuilder.bubble_text;
      String str = paramBuilder.bubble_uri;
      if (str == null) {
        this.bubble_uri = "";
      } else {
        this.bubble_uri = str;
      } 
      integer = paramBuilder.bubble_seconds;
      if (integer == null) {
        this.bubble_seconds = DEFAULT_BUBBLE_SECONDS;
      } else {
        this.bubble_seconds = integer;
      } 
    } else {
      this.bubble_text = ((Builder)integer).bubble_text;
      this.bubble_uri = ((Builder)integer).bubble_uri;
      this.bubble_seconds = ((Builder)integer).bubble_seconds;
    } 
  }
  
  public static final class Builder extends Message.Builder<FrsSpriteBubble> {
    public Integer bubble_seconds;
    
    public SpriteBubble bubble_text;
    
    public String bubble_uri;
    
    public Builder() {}
    
    public Builder(FrsSpriteBubble param1FrsSpriteBubble) {
      super(param1FrsSpriteBubble);
      if (param1FrsSpriteBubble == null)
        return; 
      this.bubble_text = param1FrsSpriteBubble.bubble_text;
      this.bubble_uri = param1FrsSpriteBubble.bubble_uri;
      this.bubble_seconds = param1FrsSpriteBubble.bubble_seconds;
    }
    
    public FrsSpriteBubble build(boolean param1Boolean) {
      return new FrsSpriteBubble(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
