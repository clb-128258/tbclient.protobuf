package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedScoreComponent extends Message {
  public static final List<FeedScoreItem> DEFAULT_ITEM = Collections.emptyList();
  
  public static final Integer DEFAULT_LIMIT_COUNT = Integer.valueOf(0);
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 3)
  public final FeedContentResource desc;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedScoreItem> item;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer limit_count;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  public FeedScoreComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<FeedScoreItem> list = paramBuilder.item;
      if (list == null) {
        this.item = DEFAULT_ITEM;
      } else {
        this.item = Message.immutableCopyOf(list);
      } 
      Integer integer = paramBuilder.limit_count;
      if (integer == null) {
        this.limit_count = DEFAULT_LIMIT_COUNT;
      } else {
        this.limit_count = integer;
      } 
      this.desc = paramBuilder.desc;
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.item = Message.immutableCopyOf(((Builder)str).item);
      this.limit_count = ((Builder)str).limit_count;
      this.desc = ((Builder)str).desc;
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedScoreComponent> {
    public FeedContentResource desc;
    
    public List<FeedScoreItem> item;
    
    public Integer limit_count;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FeedScoreComponent param1FeedScoreComponent) {
      super(param1FeedScoreComponent);
      if (param1FeedScoreComponent == null)
        return; 
      this.item = Message.copyOf(param1FeedScoreComponent.item);
      this.limit_count = param1FeedScoreComponent.limit_count;
      this.desc = param1FeedScoreComponent.desc;
      this.schema = param1FeedScoreComponent.schema;
    }
    
    public FeedScoreComponent build(boolean param1Boolean) {
      return new FeedScoreComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
