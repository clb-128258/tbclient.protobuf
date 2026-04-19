package tbclient;

import com.squareup.wire.Message;

public final class SpecialPost extends Message {
  public SpecialPost(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
  }
  
  public static final class Builder extends Message.Builder<SpecialPost> {
    public Builder() {}
    
    public Builder(SpecialPost param1SpecialPost) {
      super(param1SpecialPost);
    }
    
    public SpecialPost build(boolean param1Boolean) {
      return new SpecialPost(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
