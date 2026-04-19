package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class QuizOption extends Message {
  public static final String DEFAULT_BUTTON_IMG = "";
  
  public static final String DEFAULT_BUTTON_TEXT_NO = "";
  
  public static final String DEFAULT_BUTTON_TEXT_SUP = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_QUIZ_OPTION = "";
  
  public static final Long DEFAULT_QUIZ_OPTION_ID;
  
  public static final Long DEFAULT_TOTAL_USER_COUNT;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String button_img;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String button_text_no;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String button_text_sup;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String quiz_option;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long quiz_option_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long total_user_count;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_QUIZ_OPTION_ID = long_;
    DEFAULT_TOTAL_USER_COUNT = long_;
  }
  
  public QuizOption(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.quiz_option_id;
      if (long_2 == null) {
        this.quiz_option_id = DEFAULT_QUIZ_OPTION_ID;
      } else {
        this.quiz_option_id = long_2;
      } 
      String str2 = paramBuilder.quiz_option;
      if (str2 == null) {
        this.quiz_option = "";
      } else {
        this.quiz_option = str2;
      } 
      str2 = paramBuilder.icon;
      if (str2 == null) {
        this.icon = "";
      } else {
        this.icon = str2;
      } 
      Long long_1 = paramBuilder.total_user_count;
      if (long_1 == null) {
        this.total_user_count = DEFAULT_TOTAL_USER_COUNT;
      } else {
        this.total_user_count = long_1;
      } 
      String str1 = paramBuilder.button_img;
      if (str1 == null) {
        this.button_img = "";
      } else {
        this.button_img = str1;
      } 
      str1 = paramBuilder.button_text_sup;
      if (str1 == null) {
        this.button_text_sup = "";
      } else {
        this.button_text_sup = str1;
      } 
      str = paramBuilder.button_text_no;
      if (str == null) {
        this.button_text_no = "";
      } else {
        this.button_text_no = str;
      } 
    } else {
      this.quiz_option_id = ((Builder)str).quiz_option_id;
      this.quiz_option = ((Builder)str).quiz_option;
      this.icon = ((Builder)str).icon;
      this.total_user_count = ((Builder)str).total_user_count;
      this.button_img = ((Builder)str).button_img;
      this.button_text_sup = ((Builder)str).button_text_sup;
      this.button_text_no = ((Builder)str).button_text_no;
    } 
  }
  
  public static final class Builder extends Message.Builder<QuizOption> {
    public String button_img;
    
    public String button_text_no;
    
    public String button_text_sup;
    
    public String icon;
    
    public String quiz_option;
    
    public Long quiz_option_id;
    
    public Long total_user_count;
    
    public Builder() {}
    
    public Builder(QuizOption param1QuizOption) {
      super(param1QuizOption);
      if (param1QuizOption == null)
        return; 
      this.quiz_option_id = param1QuizOption.quiz_option_id;
      this.quiz_option = param1QuizOption.quiz_option;
      this.icon = param1QuizOption.icon;
      this.total_user_count = param1QuizOption.total_user_count;
      this.button_img = param1QuizOption.button_img;
      this.button_text_sup = param1QuizOption.button_text_sup;
      this.button_text_no = param1QuizOption.button_text_no;
    }
    
    public QuizOption build(boolean param1Boolean) {
      return new QuizOption(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
