package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedLinkComponent extends Message {
  public static final List<PbLinkInfo> DEFAULT_LINKS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<PbLinkInfo> links;
  
  public FeedLinkComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<PbLinkInfo> list;
    if (paramBoolean == true) {
      list = paramBuilder.links;
      if (list == null) {
        this.links = DEFAULT_LINKS;
      } else {
        this.links = Message.immutableCopyOf(list);
      } 
    } else {
      this.links = Message.immutableCopyOf(((Builder)list).links);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedLinkComponent> {
    public List<PbLinkInfo> links;
    
    public Builder() {}
    
    public Builder(FeedLinkComponent param1FeedLinkComponent) {
      super(param1FeedLinkComponent);
      if (param1FeedLinkComponent == null)
        return; 
      this.links = Message.copyOf(param1FeedLinkComponent.links);
    }
    
    public FeedLinkComponent build(boolean param1Boolean) {
      return new FeedLinkComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
