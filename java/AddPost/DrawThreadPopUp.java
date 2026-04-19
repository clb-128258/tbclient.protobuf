package tbclient.AddPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DrawThreadPopUp extends Message {
  public static final Integer DEFAULT_IS_MATCH_LEVEL;
  
  public static final Integer DEFAULT_NEED_FORUM_LEVEL;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_match_level;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer need_forum_level;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_MATCH_LEVEL = integer;
    DEFAULT_NEED_FORUM_LEVEL = integer;
  }
  
  public DrawThreadPopUp(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.is_match_level;
      if (integer1 == null) {
        this.is_match_level = DEFAULT_IS_MATCH_LEVEL;
      } else {
        this.is_match_level = integer1;
      } 
      integer = paramBuilder.need_forum_level;
      if (integer == null) {
        this.need_forum_level = DEFAULT_NEED_FORUM_LEVEL;
      } else {
        this.need_forum_level = integer;
      } 
    } else {
      this.is_match_level = ((Builder)integer).is_match_level;
      this.need_forum_level = ((Builder)integer).need_forum_level;
    } 
  }
  
  public static final class Builder extends Message.Builder<DrawThreadPopUp> {
    public Integer is_match_level;
    
    public Integer need_forum_level;
    
    public Builder() {}
    
    public Builder(DrawThreadPopUp param1DrawThreadPopUp) {
      super(param1DrawThreadPopUp);
      if (param1DrawThreadPopUp == null)
        return; 
      this.is_match_level = param1DrawThreadPopUp.is_match_level;
      this.need_forum_level = param1DrawThreadPopUp.need_forum_level;
    }
    
    public DrawThreadPopUp build(boolean param1Boolean) {
      return new DrawThreadPopUp(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
