package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedQuestionInfo extends Message {
  @ProtoField(tag = 3)
  public final FeedButton feed_button;
  
  @ProtoField(tag = 1)
  public final TitleComponent feed_title;
  
  @ProtoField(tag = 2)
  public final QuestionContent question_content;
  
  public FeedQuestionInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.feed_title = paramBuilder.feed_title;
      this.question_content = paramBuilder.question_content;
      this.feed_button = paramBuilder.feed_button;
    } else {
      this.feed_title = paramBuilder.feed_title;
      this.question_content = paramBuilder.question_content;
      this.feed_button = paramBuilder.feed_button;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedQuestionInfo> {
    public FeedButton feed_button;
    
    public TitleComponent feed_title;
    
    public QuestionContent question_content;
    
    public Builder() {}
    
    public Builder(FeedQuestionInfo param1FeedQuestionInfo) {
      super(param1FeedQuestionInfo);
      if (param1FeedQuestionInfo == null)
        return; 
      this.feed_title = param1FeedQuestionInfo.feed_title;
      this.question_content = param1FeedQuestionInfo.question_content;
      this.feed_button = param1FeedQuestionInfo.feed_button;
    }
    
    public FeedQuestionInfo build(boolean param1Boolean) {
      return new FeedQuestionInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
