package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CommentSimple extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String user_name;
  
  public CommentSimple(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.user_name;
      if (str1 == null) {
        this.user_name = "";
      } else {
        this.user_name = str1;
      } 
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
    } else {
      this.user_name = ((Builder)str).user_name;
      this.content = ((Builder)str).content;
    } 
  }
  
  public static final class Builder extends Message.Builder<CommentSimple> {
    public String content;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(CommentSimple param1CommentSimple) {
      super(param1CommentSimple);
      if (param1CommentSimple == null)
        return; 
      this.user_name = param1CommentSimple.user_name;
      this.content = param1CommentSimple.content;
    }
    
    public CommentSimple build(boolean param1Boolean) {
      return new CommentSimple(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
