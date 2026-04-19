package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedButtonComponent extends Message {
  public static final List<FeedContentResource> DEFAULT_DATA = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 2)
  public final FeedContentColor background;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedContentResource> data;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String schema;
  
  public FeedButtonComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<FeedContentResource> list = paramBuilder.data;
      if (list == null) {
        this.data = DEFAULT_DATA;
      } else {
        this.data = Message.immutableCopyOf(list);
      } 
      this.background = paramBuilder.background;
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.data = Message.immutableCopyOf(((Builder)str).data);
      this.background = ((Builder)str).background;
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedButtonComponent> {
    public FeedContentColor background;
    
    public List<FeedContentResource> data;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FeedButtonComponent param1FeedButtonComponent) {
      super(param1FeedButtonComponent);
      if (param1FeedButtonComponent == null)
        return; 
      this.data = Message.copyOf(param1FeedButtonComponent.data);
      this.background = param1FeedButtonComponent.background;
      this.schema = param1FeedButtonComponent.schema;
    }
    
    public FeedButtonComponent build(boolean param1Boolean) {
      return new FeedButtonComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
