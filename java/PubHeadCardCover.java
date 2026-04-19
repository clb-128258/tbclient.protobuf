package tbclient;

import com.squareup.wire.Message;

public final class PubHeadCardCover extends Message {
  public PubHeadCardCover(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
  }
  
  public static final class Builder extends Message.Builder<PubHeadCardCover> {
    public Builder() {}
    
    public Builder(PubHeadCardCover param1PubHeadCardCover) {
      super(param1PubHeadCardCover);
    }
    
    public PubHeadCardCover build(boolean param1Boolean) {
      return new PubHeadCardCover(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
