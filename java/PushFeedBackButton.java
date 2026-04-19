package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PushFeedBackButton extends Message {
  public static final String DEFAULT_BUTTON_NAME = "";
  
  public static final Integer DEFAULT_FEEDBACK_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String button_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer feedback_type;
  
  public PushFeedBackButton(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.button_name;
      if (str == null) {
        this.button_name = "";
      } else {
        this.button_name = str;
      } 
      integer = paramBuilder.feedback_type;
      if (integer == null) {
        this.feedback_type = DEFAULT_FEEDBACK_TYPE;
      } else {
        this.feedback_type = integer;
      } 
    } else {
      this.button_name = ((Builder)integer).button_name;
      this.feedback_type = ((Builder)integer).feedback_type;
    } 
  }
  
  public static final class Builder extends Message.Builder<PushFeedBackButton> {
    public String button_name;
    
    public Integer feedback_type;
    
    public Builder() {}
    
    public Builder(PushFeedBackButton param1PushFeedBackButton) {
      super(param1PushFeedBackButton);
      if (param1PushFeedBackButton == null)
        return; 
      this.button_name = param1PushFeedBackButton.button_name;
      this.feedback_type = param1PushFeedBackButton.feedback_type;
    }
    
    public PushFeedBackButton build(boolean param1Boolean) {
      return new PushFeedBackButton(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
