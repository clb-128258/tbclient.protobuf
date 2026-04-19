package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class InteractInfo extends Message {
  @ProtoField(tag = 1)
  public final IconUrlInfo agree;
  
  @ProtoField(tag = 2)
  public final IconUrlInfo post;
  
  @ProtoField(tag = 3)
  public final IconUrlInfo share;
  
  public InteractInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.agree = paramBuilder.agree;
      this.post = paramBuilder.post;
      this.share = paramBuilder.share;
    } else {
      this.agree = paramBuilder.agree;
      this.post = paramBuilder.post;
      this.share = paramBuilder.share;
    } 
  }
  
  public static final class Builder extends Message.Builder<InteractInfo> {
    public IconUrlInfo agree;
    
    public IconUrlInfo post;
    
    public IconUrlInfo share;
    
    public Builder() {}
    
    public Builder(InteractInfo param1InteractInfo) {
      super(param1InteractInfo);
      if (param1InteractInfo == null)
        return; 
      this.agree = param1InteractInfo.agree;
      this.post = param1InteractInfo.post;
      this.share = param1InteractInfo.share;
    }
    
    public InteractInfo build(boolean param1Boolean) {
      return new InteractInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
