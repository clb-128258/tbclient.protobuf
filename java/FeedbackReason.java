package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedbackReason extends Message {
  public static final String DEFAULT_EXTRA = "";
  
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_REASON = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String extra;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String reason;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 5)
  public final Toast toast;
  
  public FeedbackReason(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str2 = paramBuilder.reason;
      if (str2 == null) {
        this.reason = "";
      } else {
        this.reason = str2;
      } 
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      String str1 = paramBuilder.extra;
      if (str1 == null) {
        this.extra = "";
      } else {
        this.extra = str1;
      } 
      str1 = paramBuilder.schema;
      if (str1 == null) {
        this.schema = "";
      } else {
        this.schema = str1;
      } 
      this.toast = paramBuilder.toast;
    } else {
      this.reason = paramBuilder.reason;
      this.id = paramBuilder.id;
      this.extra = paramBuilder.extra;
      this.schema = paramBuilder.schema;
      this.toast = paramBuilder.toast;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedbackReason> {
    public String extra;
    
    public Integer id;
    
    public String reason;
    
    public String schema;
    
    public Toast toast;
    
    public Builder() {}
    
    public Builder(FeedbackReason param1FeedbackReason) {
      super(param1FeedbackReason);
      if (param1FeedbackReason == null)
        return; 
      this.reason = param1FeedbackReason.reason;
      this.id = param1FeedbackReason.id;
      this.extra = param1FeedbackReason.extra;
      this.schema = param1FeedbackReason.schema;
      this.toast = param1FeedbackReason.toast;
    }
    
    public FeedbackReason build(boolean param1Boolean) {
      return new FeedbackReason(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
