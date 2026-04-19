package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class PushFeedbackInfo extends Message {
  public static final List<PushFeedBackButton> DEFAULT_BUTTON_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_DISAPPEAR_DELAY_TIME;
  
  public static final Integer DEFAULT_DISPLAY_DELAY_TIME;
  
  public static final String DEFAULT_FEEDBACK_URL = "";
  
  public static final List<PushFeedbackStrategy> DEFAULT_SHOW_STRATEGY;
  
  public static final Integer DEFAULT_SWITCH;
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer _switch;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<PushFeedBackButton> button_list;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer disappear_delay_time;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer display_delay_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String feedback_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<PushFeedbackStrategy> show_strategy;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SWITCH = integer;
    DEFAULT_SHOW_STRATEGY = Collections.emptyList();
    DEFAULT_DISPLAY_DELAY_TIME = integer;
    DEFAULT_DISAPPEAR_DELAY_TIME = integer;
  }
  
  public PushFeedbackInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      List<PushFeedBackButton> list1 = paramBuilder.button_list;
      if (list1 == null) {
        this.button_list = DEFAULT_BUTTON_LIST;
      } else {
        this.button_list = Message.immutableCopyOf(list1);
      } 
      Integer integer2 = paramBuilder._switch;
      if (integer2 == null) {
        this._switch = DEFAULT_SWITCH;
      } else {
        this._switch = integer2;
      } 
      String str1 = paramBuilder.feedback_url;
      if (str1 == null) {
        this.feedback_url = "";
      } else {
        this.feedback_url = str1;
      } 
      List<PushFeedbackStrategy> list = paramBuilder.show_strategy;
      if (list == null) {
        this.show_strategy = DEFAULT_SHOW_STRATEGY;
      } else {
        this.show_strategy = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.display_delay_time;
      if (integer1 == null) {
        this.display_delay_time = DEFAULT_DISPLAY_DELAY_TIME;
      } else {
        this.display_delay_time = integer1;
      } 
      integer = paramBuilder.disappear_delay_time;
      if (integer == null) {
        this.disappear_delay_time = DEFAULT_DISAPPEAR_DELAY_TIME;
      } else {
        this.disappear_delay_time = integer;
      } 
    } else {
      this.title = ((Builder)integer).title;
      this.button_list = Message.immutableCopyOf(((Builder)integer).button_list);
      this._switch = ((Builder)integer)._switch;
      this.feedback_url = ((Builder)integer).feedback_url;
      this.show_strategy = Message.immutableCopyOf(((Builder)integer).show_strategy);
      this.display_delay_time = ((Builder)integer).display_delay_time;
      this.disappear_delay_time = ((Builder)integer).disappear_delay_time;
    } 
  }
  
  public static final class Builder extends Message.Builder<PushFeedbackInfo> {
    public Integer _switch;
    
    public List<PushFeedBackButton> button_list;
    
    public Integer disappear_delay_time;
    
    public Integer display_delay_time;
    
    public String feedback_url;
    
    public List<PushFeedbackStrategy> show_strategy;
    
    public String title;
    
    public Builder() {}
    
    public Builder(PushFeedbackInfo param1PushFeedbackInfo) {
      super(param1PushFeedbackInfo);
      if (param1PushFeedbackInfo == null)
        return; 
      this.title = param1PushFeedbackInfo.title;
      this.button_list = Message.copyOf(param1PushFeedbackInfo.button_list);
      this._switch = param1PushFeedbackInfo._switch;
      this.feedback_url = param1PushFeedbackInfo.feedback_url;
      this.show_strategy = Message.copyOf(param1PushFeedbackInfo.show_strategy);
      this.display_delay_time = param1PushFeedbackInfo.display_delay_time;
      this.disappear_delay_time = param1PushFeedbackInfo.disappear_delay_time;
    }
    
    public PushFeedbackInfo build(boolean param1Boolean) {
      return new PushFeedbackInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
