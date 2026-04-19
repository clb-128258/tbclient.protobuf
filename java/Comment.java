package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Comment extends Message {
  public static final Long DEFAULT_COMMENT_NUM = Long.valueOf(0L);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long comment_num;
  
  public Comment(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      long_ = paramBuilder.comment_num;
      if (long_ == null) {
        this.comment_num = DEFAULT_COMMENT_NUM;
      } else {
        this.comment_num = long_;
      } 
    } else {
      this.comment_num = ((Builder)long_).comment_num;
    } 
  }
  
  public static final class Builder extends Message.Builder<Comment> {
    public Long comment_num;
    
    public Builder() {}
    
    public Builder(Comment param1Comment) {
      super(param1Comment);
      if (param1Comment == null)
        return; 
      this.comment_num = param1Comment.comment_num;
    }
    
    public Comment build(boolean param1Boolean) {
      return new Comment(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
