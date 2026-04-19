package tbclient.FrsPage;

import com.squareup.wire.Message;

public final class PopupPostInfo extends Message {
  public PopupPostInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
  }
  
  public static final class Builder extends Message.Builder<PopupPostInfo> {
    public Builder() {}
    
    public Builder(PopupPostInfo param1PopupPostInfo) {
      super(param1PopupPostInfo);
    }
    
    public PopupPostInfo build(boolean param1Boolean) {
      return new PopupPostInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
