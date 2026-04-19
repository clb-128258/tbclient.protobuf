package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedMultiComponent extends Message {
  public static final List<PicInfo> DEFAULT_PICS = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<PicInfo> pics;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 3)
  public final SidewayListSeeMore see_more;
  
  public FeedMultiComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<PicInfo> list = paramBuilder.pics;
      if (list == null) {
        this.pics = DEFAULT_PICS;
      } else {
        this.pics = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      this.see_more = paramBuilder.see_more;
    } else {
      this.pics = Message.immutableCopyOf(paramBuilder.pics);
      this.schema = paramBuilder.schema;
      this.see_more = paramBuilder.see_more;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedMultiComponent> {
    public List<PicInfo> pics;
    
    public String schema;
    
    public SidewayListSeeMore see_more;
    
    public Builder() {}
    
    public Builder(FeedMultiComponent param1FeedMultiComponent) {
      super(param1FeedMultiComponent);
      if (param1FeedMultiComponent == null)
        return; 
      this.pics = Message.copyOf(param1FeedMultiComponent.pics);
      this.schema = param1FeedMultiComponent.schema;
      this.see_more = param1FeedMultiComponent.see_more;
    }
    
    public FeedMultiComponent build(boolean param1Boolean) {
      return new FeedMultiComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
