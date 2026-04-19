package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AigcFeedbackInfo extends Message {
  public static final String DEFAULT_AIGC_CHAT_ID = "";
  
  public static final Integer DEFAULT_FEEDBACK_FOLD = Integer.valueOf(0);
  
  public static final String DEFAULT_FEEDBACK_FOLD_TIP = "";
  
  public static final String DEFAULT_FEEDBACK_URL = "";
  
  public static final String DEFAULT_NEGATIVE_TEXT = "";
  
  public static final String DEFAULT_POSITIVE_TEXT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String aigc_chat_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer feedback_fold;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String feedback_fold_tip;
  
  @ProtoField(tag = 7)
  public final Toast feedback_toast;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String feedback_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String negative_text;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String positive_text;
  
  public AigcFeedbackInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str2 = paramBuilder.aigc_chat_id;
      if (str2 == null) {
        this.aigc_chat_id = "";
      } else {
        this.aigc_chat_id = str2;
      } 
      Integer integer = paramBuilder.feedback_fold;
      if (integer == null) {
        this.feedback_fold = DEFAULT_FEEDBACK_FOLD;
      } else {
        this.feedback_fold = integer;
      } 
      String str1 = paramBuilder.feedback_fold_tip;
      if (str1 == null) {
        this.feedback_fold_tip = "";
      } else {
        this.feedback_fold_tip = str1;
      } 
      str1 = paramBuilder.positive_text;
      if (str1 == null) {
        this.positive_text = "";
      } else {
        this.positive_text = str1;
      } 
      str1 = paramBuilder.negative_text;
      if (str1 == null) {
        this.negative_text = "";
      } else {
        this.negative_text = str1;
      } 
      str1 = paramBuilder.feedback_url;
      if (str1 == null) {
        this.feedback_url = "";
      } else {
        this.feedback_url = str1;
      } 
      this.feedback_toast = paramBuilder.feedback_toast;
    } else {
      this.aigc_chat_id = paramBuilder.aigc_chat_id;
      this.feedback_fold = paramBuilder.feedback_fold;
      this.feedback_fold_tip = paramBuilder.feedback_fold_tip;
      this.positive_text = paramBuilder.positive_text;
      this.negative_text = paramBuilder.negative_text;
      this.feedback_url = paramBuilder.feedback_url;
      this.feedback_toast = paramBuilder.feedback_toast;
    } 
  }
  
  public static final class Builder extends Message.Builder<AigcFeedbackInfo> {
    public String aigc_chat_id;
    
    public Integer feedback_fold;
    
    public String feedback_fold_tip;
    
    public Toast feedback_toast;
    
    public String feedback_url;
    
    public String negative_text;
    
    public String positive_text;
    
    public Builder() {}
    
    public Builder(AigcFeedbackInfo param1AigcFeedbackInfo) {
      super(param1AigcFeedbackInfo);
      if (param1AigcFeedbackInfo == null)
        return; 
      this.aigc_chat_id = param1AigcFeedbackInfo.aigc_chat_id;
      this.feedback_fold = param1AigcFeedbackInfo.feedback_fold;
      this.feedback_fold_tip = param1AigcFeedbackInfo.feedback_fold_tip;
      this.positive_text = param1AigcFeedbackInfo.positive_text;
      this.negative_text = param1AigcFeedbackInfo.negative_text;
      this.feedback_url = param1AigcFeedbackInfo.feedback_url;
      this.feedback_toast = param1AigcFeedbackInfo.feedback_toast;
    }
    
    public AigcFeedbackInfo build(boolean param1Boolean) {
      return new AigcFeedbackInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
