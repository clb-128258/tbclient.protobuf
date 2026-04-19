package tbclient;

import com.squareup.wire.Message;

public final class ShareChatroom extends Message {
  public ShareChatroom(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
  }
  
  public static final class Builder extends Message.Builder<ShareChatroom> {
    public Builder() {}
    
    public Builder(ShareChatroom param1ShareChatroom) {
      super(param1ShareChatroom);
    }
    
    public ShareChatroom build(boolean param1Boolean) {
      return new ShareChatroom(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
