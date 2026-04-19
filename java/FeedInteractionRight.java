package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedInteractionRight extends Message {
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 4)
  public final FeedInteractionRightData data;
  
  @ProtoField(tag = 2)
  public final FeedContentIcon icon_data;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String schema;
  
  public FeedInteractionRight(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      this.icon_data = paramBuilder.icon_data;
      this.data = paramBuilder.data;
    } else {
      this.schema = paramBuilder.schema;
      this.icon_data = paramBuilder.icon_data;
      this.data = paramBuilder.data;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedInteractionRight> {
    public FeedInteractionRightData data;
    
    public FeedContentIcon icon_data;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FeedInteractionRight param1FeedInteractionRight) {
      super(param1FeedInteractionRight);
      if (param1FeedInteractionRight == null)
        return; 
      this.schema = param1FeedInteractionRight.schema;
      this.icon_data = param1FeedInteractionRight.icon_data;
      this.data = param1FeedInteractionRight.data;
    }
    
    public FeedInteractionRight build(boolean param1Boolean) {
      return new FeedInteractionRight(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
