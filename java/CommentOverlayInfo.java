package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CommentOverlayInfo extends Message {
  @ProtoField(tag = 1)
  public final GuideInfo guide_info;
  
  public CommentOverlayInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.guide_info = paramBuilder.guide_info;
    } else {
      this.guide_info = paramBuilder.guide_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<CommentOverlayInfo> {
    public GuideInfo guide_info;
    
    public Builder() {}
    
    public Builder(CommentOverlayInfo param1CommentOverlayInfo) {
      super(param1CommentOverlayInfo);
      if (param1CommentOverlayInfo == null)
        return; 
      this.guide_info = param1CommentOverlayInfo.guide_info;
    }
    
    public CommentOverlayInfo build(boolean param1Boolean) {
      return new CommentOverlayInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
