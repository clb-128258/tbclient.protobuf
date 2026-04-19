package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedConfigurableHeadComponent extends Message {
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 5)
  public final Feedback feedback;
  
  @ProtoField(tag = 1)
  public final FeedContentIcon icon;
  
  @ProtoField(tag = 3)
  public final RightBoxInfo right_box;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 2)
  public final ConfigurableHeadTitle title;
  
  public FeedConfigurableHeadComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.icon = paramBuilder.icon;
      this.title = paramBuilder.title;
      this.right_box = paramBuilder.right_box;
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      this.feedback = paramBuilder.feedback;
    } else {
      this.icon = paramBuilder.icon;
      this.title = paramBuilder.title;
      this.right_box = paramBuilder.right_box;
      this.schema = paramBuilder.schema;
      this.feedback = paramBuilder.feedback;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedConfigurableHeadComponent> {
    public Feedback feedback;
    
    public FeedContentIcon icon;
    
    public RightBoxInfo right_box;
    
    public String schema;
    
    public ConfigurableHeadTitle title;
    
    public Builder() {}
    
    public Builder(FeedConfigurableHeadComponent param1FeedConfigurableHeadComponent) {
      super(param1FeedConfigurableHeadComponent);
      if (param1FeedConfigurableHeadComponent == null)
        return; 
      this.icon = param1FeedConfigurableHeadComponent.icon;
      this.title = param1FeedConfigurableHeadComponent.title;
      this.right_box = param1FeedConfigurableHeadComponent.right_box;
      this.schema = param1FeedConfigurableHeadComponent.schema;
      this.feedback = param1FeedConfigurableHeadComponent.feedback;
    }
    
    public FeedConfigurableHeadComponent build(boolean param1Boolean) {
      return new FeedConfigurableHeadComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
