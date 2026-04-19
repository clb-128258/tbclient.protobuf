package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedFeedback extends Message {
  public static final String DEFAULT_ACTION_TYPE = "";
  
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final String DEFAULT_BUTTON_TEXT = "";
  
  public static final String DEFAULT_COMMON_ID = "";
  
  public static final List<FeedbackReason> DEFAULT_DISLIKE = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TYPE = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String action_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String button_text;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String common_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<FeedbackReason> dislike;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String type;
  
  static {
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
  }
  
  public FeedFeedback(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      String str2 = paramBuilder.type;
      if (str2 == null) {
        this.type = "";
      } else {
        this.type = str2;
      } 
      str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.button_text;
      if (str2 == null) {
        this.button_text = "";
      } else {
        this.button_text = str2;
      } 
      str2 = paramBuilder.common_id;
      if (str2 == null) {
        this.common_id = "";
      } else {
        this.common_id = str2;
      } 
      List<FeedbackReason> list1 = paramBuilder.dislike;
      if (list1 == null) {
        this.dislike = DEFAULT_DISLIKE;
      } else {
        this.dislike = Message.immutableCopyOf(list1);
      } 
      String str1 = paramBuilder.action_type;
      if (str1 == null) {
        this.action_type = "";
      } else {
        this.action_type = str1;
      } 
      list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.type = ((Builder)list).type;
      this.title = ((Builder)list).title;
      this.button_text = ((Builder)list).button_text;
      this.common_id = ((Builder)list).common_id;
      this.dislike = Message.immutableCopyOf(((Builder)list).dislike);
      this.action_type = ((Builder)list).action_type;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedFeedback> {
    public String action_type;
    
    public List<FeedKV> business_info;
    
    public String button_text;
    
    public String common_id;
    
    public List<FeedbackReason> dislike;
    
    public String title;
    
    public String type;
    
    public Builder() {}
    
    public Builder(FeedFeedback param1FeedFeedback) {
      super(param1FeedFeedback);
      if (param1FeedFeedback == null)
        return; 
      this.type = param1FeedFeedback.type;
      this.title = param1FeedFeedback.title;
      this.button_text = param1FeedFeedback.button_text;
      this.common_id = param1FeedFeedback.common_id;
      this.dislike = Message.copyOf(param1FeedFeedback.dislike);
      this.action_type = param1FeedFeedback.action_type;
      this.business_info = Message.copyOf(param1FeedFeedback.business_info);
    }
    
    public FeedFeedback build(boolean param1Boolean) {
      return new FeedFeedback(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
