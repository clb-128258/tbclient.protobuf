package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedTextHeadComponent extends Message {
  public static final List<FeedContentResource> DEFAULT_LEFT_RICH_TEXT = Collections.emptyList();
  
  public static final List<FeedContentResource> DEFAULT_RIGHT_RICH_TEXT = Collections.emptyList();
  
  public static final String DEFAULT_RIGHT_SCHEMA = "";
  
  @ProtoField(tag = 1)
  public final FeedContentIcon left_icon;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedContentResource> left_rich_text;
  
  @ProtoField(tag = 2)
  public final FeedContentIcon right_icon;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<FeedContentResource> right_rich_text;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String right_schema;
  
  public FeedTextHeadComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.left_icon = paramBuilder.left_icon;
      this.right_icon = paramBuilder.right_icon;
      List<FeedContentResource> list = paramBuilder.left_rich_text;
      if (list == null) {
        this.left_rich_text = DEFAULT_LEFT_RICH_TEXT;
      } else {
        this.left_rich_text = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.right_rich_text;
      if (list == null) {
        this.right_rich_text = DEFAULT_RIGHT_RICH_TEXT;
      } else {
        this.right_rich_text = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.right_schema;
      if (str == null) {
        this.right_schema = "";
      } else {
        this.right_schema = str;
      } 
    } else {
      this.left_icon = ((Builder)str).left_icon;
      this.right_icon = ((Builder)str).right_icon;
      this.left_rich_text = Message.immutableCopyOf(((Builder)str).left_rich_text);
      this.right_rich_text = Message.immutableCopyOf(((Builder)str).right_rich_text);
      this.right_schema = ((Builder)str).right_schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedTextHeadComponent> {
    public FeedContentIcon left_icon;
    
    public List<FeedContentResource> left_rich_text;
    
    public FeedContentIcon right_icon;
    
    public List<FeedContentResource> right_rich_text;
    
    public String right_schema;
    
    public Builder() {}
    
    public Builder(FeedTextHeadComponent param1FeedTextHeadComponent) {
      super(param1FeedTextHeadComponent);
      if (param1FeedTextHeadComponent == null)
        return; 
      this.left_icon = param1FeedTextHeadComponent.left_icon;
      this.right_icon = param1FeedTextHeadComponent.right_icon;
      this.left_rich_text = Message.copyOf(param1FeedTextHeadComponent.left_rich_text);
      this.right_rich_text = Message.copyOf(param1FeedTextHeadComponent.right_rich_text);
      this.right_schema = param1FeedTextHeadComponent.right_schema;
    }
    
    public FeedTextHeadComponent build(boolean param1Boolean) {
      return new FeedTextHeadComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
