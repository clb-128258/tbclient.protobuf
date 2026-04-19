package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MountedCard extends Message {
  public static final String DEFAULT_BUTTON_SCHEMA = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String button_schema;
  
  @ProtoField(tag = 1)
  public final FeedContentText content;
  
  @ProtoField(tag = 3)
  public final FeedContentText enable_button;
  
  @ProtoField(tag = 5)
  public final FeedContentIcon icon;
  
  @ProtoField(tag = 2)
  public final FeedContentText normal_button;
  
  public MountedCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.content = paramBuilder.content;
      this.normal_button = paramBuilder.normal_button;
      this.enable_button = paramBuilder.enable_button;
      String str = paramBuilder.button_schema;
      if (str == null) {
        this.button_schema = "";
      } else {
        this.button_schema = str;
      } 
      this.icon = paramBuilder.icon;
    } else {
      this.content = paramBuilder.content;
      this.normal_button = paramBuilder.normal_button;
      this.enable_button = paramBuilder.enable_button;
      this.button_schema = paramBuilder.button_schema;
      this.icon = paramBuilder.icon;
    } 
  }
  
  public static final class Builder extends Message.Builder<MountedCard> {
    public String button_schema;
    
    public FeedContentText content;
    
    public FeedContentText enable_button;
    
    public FeedContentIcon icon;
    
    public FeedContentText normal_button;
    
    public Builder() {}
    
    public Builder(MountedCard param1MountedCard) {
      super(param1MountedCard);
      if (param1MountedCard == null)
        return; 
      this.content = param1MountedCard.content;
      this.normal_button = param1MountedCard.normal_button;
      this.enable_button = param1MountedCard.enable_button;
      this.button_schema = param1MountedCard.button_schema;
      this.icon = param1MountedCard.icon;
    }
    
    public MountedCard build(boolean param1Boolean) {
      return new MountedCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
