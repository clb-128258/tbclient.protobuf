package tbclient;

import com.squareup.wire.Message;

public final class CurrentNameInfo extends Message {
  public CurrentNameInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
  }
  
  public static final class Builder extends Message.Builder<CurrentNameInfo> {
    public Builder() {}
    
    public Builder(CurrentNameInfo param1CurrentNameInfo) {
      super(param1CurrentNameInfo);
    }
    
    public CurrentNameInfo build(boolean param1Boolean) {
      return new CurrentNameInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
