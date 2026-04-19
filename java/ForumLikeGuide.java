package tbclient;

import com.squareup.wire.Message;

public final class ForumLikeGuide extends Message {
  public ForumLikeGuide(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
  }
  
  public static final class Builder extends Message.Builder<ForumLikeGuide> {
    public Builder() {}
    
    public Builder(ForumLikeGuide param1ForumLikeGuide) {
      super(param1ForumLikeGuide);
    }
    
    public ForumLikeGuide build(boolean param1Boolean) {
      return new ForumLikeGuide(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
