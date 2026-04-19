package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedTagComponent extends Message {
  public static final String DEFAULT_SCHEMA = "";
  
  public static final List<FeedContentResource> DEFAULT_SUFFIX;
  
  public static final List<FeedContentResource> DEFAULT_TAG = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedContentResource> suffix;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedContentResource> tag;
  
  static {
    DEFAULT_SUFFIX = Collections.emptyList();
  }
  
  public FeedTagComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedContentResource> list;
    if (paramBoolean == true) {
      List<FeedContentResource> list1 = paramBuilder.tag;
      if (list1 == null) {
        this.tag = DEFAULT_TAG;
      } else {
        this.tag = Message.immutableCopyOf(list1);
      } 
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      list = paramBuilder.suffix;
      if (list == null) {
        this.suffix = DEFAULT_SUFFIX;
      } else {
        this.suffix = Message.immutableCopyOf(list);
      } 
    } else {
      this.tag = Message.immutableCopyOf(((Builder)list).tag);
      this.schema = ((Builder)list).schema;
      this.suffix = Message.immutableCopyOf(((Builder)list).suffix);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedTagComponent> {
    public String schema;
    
    public List<FeedContentResource> suffix;
    
    public List<FeedContentResource> tag;
    
    public Builder() {}
    
    public Builder(FeedTagComponent param1FeedTagComponent) {
      super(param1FeedTagComponent);
      if (param1FeedTagComponent == null)
        return; 
      this.tag = Message.copyOf(param1FeedTagComponent.tag);
      this.schema = param1FeedTagComponent.schema;
      this.suffix = Message.copyOf(param1FeedTagComponent.suffix);
    }
    
    public FeedTagComponent build(boolean param1Boolean) {
      return new FeedTagComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
