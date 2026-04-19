package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class MultiThreadComponent extends Message {
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final List<FeedContentResource> DEFAULT_TITLE = Collections.emptyList();
  
  public static final List<FeedContentResource> DEFAULT_TOPIC = Collections.emptyList();
  
  @ProtoField(tag = 3)
  public final PicInfo image;
  
  @ProtoField(tag = 4)
  public final FeedContentText left_desc;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 5)
  public final FeedContentText right_desc;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedContentResource> title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedContentResource> topic;
  
  static {
    DEFAULT_LOG_PARAM = Collections.emptyList();
  }
  
  public MultiThreadComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      List<FeedContentResource> list1 = paramBuilder.title;
      if (list1 == null) {
        this.title = DEFAULT_TITLE;
      } else {
        this.title = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.topic;
      if (list1 == null) {
        this.topic = DEFAULT_TOPIC;
      } else {
        this.topic = Message.immutableCopyOf(list1);
      } 
      this.image = paramBuilder.image;
      this.left_desc = paramBuilder.left_desc;
      this.right_desc = paramBuilder.right_desc;
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = Message.immutableCopyOf(((Builder)list).title);
      this.topic = Message.immutableCopyOf(((Builder)list).topic);
      this.image = ((Builder)list).image;
      this.left_desc = ((Builder)list).left_desc;
      this.right_desc = ((Builder)list).right_desc;
      this.schema = ((Builder)list).schema;
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
    } 
  }
  
  public static final class Builder extends Message.Builder<MultiThreadComponent> {
    public PicInfo image;
    
    public FeedContentText left_desc;
    
    public List<FeedKV> log_param;
    
    public FeedContentText right_desc;
    
    public String schema;
    
    public List<FeedContentResource> title;
    
    public List<FeedContentResource> topic;
    
    public Builder() {}
    
    public Builder(MultiThreadComponent param1MultiThreadComponent) {
      super(param1MultiThreadComponent);
      if (param1MultiThreadComponent == null)
        return; 
      this.title = Message.copyOf(param1MultiThreadComponent.title);
      this.topic = Message.copyOf(param1MultiThreadComponent.topic);
      this.image = param1MultiThreadComponent.image;
      this.left_desc = param1MultiThreadComponent.left_desc;
      this.right_desc = param1MultiThreadComponent.right_desc;
      this.schema = param1MultiThreadComponent.schema;
      this.log_param = Message.copyOf(param1MultiThreadComponent.log_param);
    }
    
    public MultiThreadComponent build(boolean param1Boolean) {
      return new MultiThreadComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
