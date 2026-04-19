package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BorderInfo extends Message {
  public static final String DEFAULT_BORDER_WIDTH = "";
  
  @ProtoField(tag = 2)
  public final FeedContentColor border_color;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String border_width;
  
  public BorderInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.border_width;
      if (str == null) {
        this.border_width = "";
      } else {
        this.border_width = str;
      } 
      this.border_color = paramBuilder.border_color;
    } else {
      this.border_width = paramBuilder.border_width;
      this.border_color = paramBuilder.border_color;
    } 
  }
  
  public static final class Builder extends Message.Builder<BorderInfo> {
    public FeedContentColor border_color;
    
    public String border_width;
    
    public Builder() {}
    
    public Builder(BorderInfo param1BorderInfo) {
      super(param1BorderInfo);
      if (param1BorderInfo == null)
        return; 
      this.border_width = param1BorderInfo.border_width;
      this.border_color = param1BorderInfo.border_color;
    }
    
    public BorderInfo build(boolean param1Boolean) {
      return new BorderInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
