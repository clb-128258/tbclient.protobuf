package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedUpdateTipComponent extends Message {
  public static final List<FeedContentResource> DEFAULT_DATA = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedContentResource> data;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String schema;
  
  public FeedUpdateTipComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<FeedContentResource> list = paramBuilder.data;
      if (list == null) {
        this.data = DEFAULT_DATA;
      } else {
        this.data = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.data = Message.immutableCopyOf(((Builder)str).data);
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedUpdateTipComponent> {
    public List<FeedContentResource> data;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FeedUpdateTipComponent param1FeedUpdateTipComponent) {
      super(param1FeedUpdateTipComponent);
      if (param1FeedUpdateTipComponent == null)
        return; 
      this.data = Message.copyOf(param1FeedUpdateTipComponent.data);
      this.schema = param1FeedUpdateTipComponent.schema;
    }
    
    public FeedUpdateTipComponent build(boolean param1Boolean) {
      return new FeedUpdateTipComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
