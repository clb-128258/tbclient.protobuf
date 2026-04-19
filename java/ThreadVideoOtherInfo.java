package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadVideoOtherInfo extends Message {
  @ProtoField(tag = 1)
  public final Post hot_post;
  
  public ThreadVideoOtherInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.hot_post = paramBuilder.hot_post;
    } else {
      this.hot_post = paramBuilder.hot_post;
    } 
  }
  
  public static final class Builder extends Message.Builder<ThreadVideoOtherInfo> {
    public Post hot_post;
    
    public Builder() {}
    
    public Builder(ThreadVideoOtherInfo param1ThreadVideoOtherInfo) {
      super(param1ThreadVideoOtherInfo);
      if (param1ThreadVideoOtherInfo == null)
        return; 
      this.hot_post = param1ThreadVideoOtherInfo.hot_post;
    }
    
    public ThreadVideoOtherInfo build(boolean param1Boolean) {
      return new ThreadVideoOtherInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
