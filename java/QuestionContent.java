package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class QuestionContent extends Message {
  @ProtoField(tag = 4)
  public final FeedContentText award_content;
  
  @ProtoField(tag = 3)
  public final FeedContentIcon award_icon;
  
  @ProtoField(tag = 2)
  public final FeedContentText mid_text;
  
  @ProtoField(tag = 1)
  public final FeedContentText user_name;
  
  public QuestionContent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.user_name = paramBuilder.user_name;
      this.mid_text = paramBuilder.mid_text;
      this.award_icon = paramBuilder.award_icon;
      this.award_content = paramBuilder.award_content;
    } else {
      this.user_name = paramBuilder.user_name;
      this.mid_text = paramBuilder.mid_text;
      this.award_icon = paramBuilder.award_icon;
      this.award_content = paramBuilder.award_content;
    } 
  }
  
  public static final class Builder extends Message.Builder<QuestionContent> {
    public FeedContentText award_content;
    
    public FeedContentIcon award_icon;
    
    public FeedContentText mid_text;
    
    public FeedContentText user_name;
    
    public Builder() {}
    
    public Builder(QuestionContent param1QuestionContent) {
      super(param1QuestionContent);
      if (param1QuestionContent == null)
        return; 
      this.user_name = param1QuestionContent.user_name;
      this.mid_text = param1QuestionContent.mid_text;
      this.award_icon = param1QuestionContent.award_icon;
      this.award_content = param1QuestionContent.award_content;
    }
    
    public QuestionContent build(boolean param1Boolean) {
      return new QuestionContent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
