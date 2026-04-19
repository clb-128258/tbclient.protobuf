package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedRecomtagStaggeredComponent extends Message {
  public static final String DEFAULT_SCHEMA = "";
  
  public static final List<FeedContentResource> DEFAULT_TEXT = Collections.emptyList();
  
  @ProtoField(tag = 1)
  public final FeedContentIcon icon_data;
  
  @ProtoField(tag = 3)
  public final FeedContentIcon right_icon;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedContentResource> text;
  
  public FeedRecomtagStaggeredComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.icon_data = paramBuilder.icon_data;
      List<FeedContentResource> list = paramBuilder.text;
      if (list == null) {
        this.text = DEFAULT_TEXT;
      } else {
        this.text = Message.immutableCopyOf(list);
      } 
      this.right_icon = paramBuilder.right_icon;
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.icon_data = ((Builder)str).icon_data;
      this.text = Message.immutableCopyOf(((Builder)str).text);
      this.right_icon = ((Builder)str).right_icon;
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedRecomtagStaggeredComponent> {
    public FeedContentIcon icon_data;
    
    public FeedContentIcon right_icon;
    
    public String schema;
    
    public List<FeedContentResource> text;
    
    public Builder() {}
    
    public Builder(FeedRecomtagStaggeredComponent param1FeedRecomtagStaggeredComponent) {
      super(param1FeedRecomtagStaggeredComponent);
      if (param1FeedRecomtagStaggeredComponent == null)
        return; 
      this.icon_data = param1FeedRecomtagStaggeredComponent.icon_data;
      this.text = Message.copyOf(param1FeedRecomtagStaggeredComponent.text);
      this.right_icon = param1FeedRecomtagStaggeredComponent.right_icon;
      this.schema = param1FeedRecomtagStaggeredComponent.schema;
    }
    
    public FeedRecomtagStaggeredComponent build(boolean param1Boolean) {
      return new FeedRecomtagStaggeredComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
