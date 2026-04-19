package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class QuizInfo extends Message {
  public static final Long DEFAULT_BONUS_TYPE;
  
  public static final Long DEFAULT_BROWSE_USER_OPTION;
  
  public static final Long DEFAULT_MIN_POUR_COUNT;
  
  public static final List<QuizOption> DEFAULT_OPTIONS;
  
  public static final Long DEFAULT_PRODUCT;
  
  public static final Long DEFAULT_QUIZ_ID;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Long DEFAULT_TOTAL_COUNT;
  
  public static final String DEFAULT_TOTAL_COUNT_ICON = "";
  
  public static final String DEFAULT_TOTAL_COUNT_TEXT = "";
  
  public static final Long DEFAULT_TOTAL_USER_COUNT;
  
  public static final Long DEFAULT_TYPE;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long bonus_type;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long browse_user_option;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long min_pour_count;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 11)
  public final List<QuizOption> options;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long product;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT64)
  public final Long quiz_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long total_count;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String total_count_icon;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String total_count_text;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long total_user_count;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT64)
  public final Long type;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_BONUS_TYPE = long_;
    DEFAULT_TOTAL_COUNT = long_;
    DEFAULT_TOTAL_USER_COUNT = long_;
    DEFAULT_MIN_POUR_COUNT = long_;
    DEFAULT_QUIZ_ID = long_;
    DEFAULT_BROWSE_USER_OPTION = long_;
    DEFAULT_PRODUCT = long_;
    DEFAULT_OPTIONS = Collections.emptyList();
    DEFAULT_TYPE = long_;
  }
  
  public QuizInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.bonus_type;
      if (long_2 == null) {
        this.bonus_type = DEFAULT_BONUS_TYPE;
      } else {
        this.bonus_type = long_2;
      } 
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.total_count_icon;
      if (str == null) {
        this.total_count_icon = "";
      } else {
        this.total_count_icon = str;
      } 
      str = paramBuilder.total_count_text;
      if (str == null) {
        this.total_count_text = "";
      } else {
        this.total_count_text = str;
      } 
      Long long_1 = paramBuilder.total_count;
      if (long_1 == null) {
        this.total_count = DEFAULT_TOTAL_COUNT;
      } else {
        this.total_count = long_1;
      } 
      long_1 = paramBuilder.total_user_count;
      if (long_1 == null) {
        this.total_user_count = DEFAULT_TOTAL_USER_COUNT;
      } else {
        this.total_user_count = long_1;
      } 
      long_1 = paramBuilder.min_pour_count;
      if (long_1 == null) {
        this.min_pour_count = DEFAULT_MIN_POUR_COUNT;
      } else {
        this.min_pour_count = long_1;
      } 
      long_1 = paramBuilder.quiz_id;
      if (long_1 == null) {
        this.quiz_id = DEFAULT_QUIZ_ID;
      } else {
        this.quiz_id = long_1;
      } 
      long_1 = paramBuilder.browse_user_option;
      if (long_1 == null) {
        this.browse_user_option = DEFAULT_BROWSE_USER_OPTION;
      } else {
        this.browse_user_option = long_1;
      } 
      long_1 = paramBuilder.product;
      if (long_1 == null) {
        this.product = DEFAULT_PRODUCT;
      } else {
        this.product = long_1;
      } 
      List<QuizOption> list = paramBuilder.options;
      if (list == null) {
        this.options = DEFAULT_OPTIONS;
      } else {
        this.options = Message.immutableCopyOf(list);
      } 
      long_ = paramBuilder.type;
      if (long_ == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = long_;
      } 
    } else {
      this.bonus_type = ((Builder)long_).bonus_type;
      this.title = ((Builder)long_).title;
      this.total_count_icon = ((Builder)long_).total_count_icon;
      this.total_count_text = ((Builder)long_).total_count_text;
      this.total_count = ((Builder)long_).total_count;
      this.total_user_count = ((Builder)long_).total_user_count;
      this.min_pour_count = ((Builder)long_).min_pour_count;
      this.quiz_id = ((Builder)long_).quiz_id;
      this.browse_user_option = ((Builder)long_).browse_user_option;
      this.product = ((Builder)long_).product;
      this.options = Message.immutableCopyOf(((Builder)long_).options);
      this.type = ((Builder)long_).type;
    } 
  }
  
  public static final class Builder extends Message.Builder<QuizInfo> {
    public Long bonus_type;
    
    public Long browse_user_option;
    
    public Long min_pour_count;
    
    public List<QuizOption> options;
    
    public Long product;
    
    public Long quiz_id;
    
    public String title;
    
    public Long total_count;
    
    public String total_count_icon;
    
    public String total_count_text;
    
    public Long total_user_count;
    
    public Long type;
    
    public Builder() {}
    
    public Builder(QuizInfo param1QuizInfo) {
      super(param1QuizInfo);
      if (param1QuizInfo == null)
        return; 
      this.bonus_type = param1QuizInfo.bonus_type;
      this.title = param1QuizInfo.title;
      this.total_count_icon = param1QuizInfo.total_count_icon;
      this.total_count_text = param1QuizInfo.total_count_text;
      this.total_count = param1QuizInfo.total_count;
      this.total_user_count = param1QuizInfo.total_user_count;
      this.min_pour_count = param1QuizInfo.min_pour_count;
      this.quiz_id = param1QuizInfo.quiz_id;
      this.browse_user_option = param1QuizInfo.browse_user_option;
      this.product = param1QuizInfo.product;
      this.options = Message.copyOf(param1QuizInfo.options);
      this.type = param1QuizInfo.type;
    }
    
    public QuizInfo build(boolean param1Boolean) {
      return new QuizInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
