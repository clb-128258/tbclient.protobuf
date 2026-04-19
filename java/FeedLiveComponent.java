package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedLiveComponent extends Message {
  public static final String DEFAULT_AUDIENCE_LABEL = "";
  
  public static final String DEFAULT_BOTTOM_LABEL = "";
  
  public static final String DEFAULT_COVER_URL = "";
  
  public static final List<PicDecoration> DEFAULT_DECORATION = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final String DEFAULT_TOP_LABEL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String audience_label;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String bottom_label;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String cover_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<PicDecoration> decoration;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String top_label;
  
  public FeedLiveComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<PicDecoration> list;
    if (paramBoolean == true) {
      String str = paramBuilder.top_label;
      if (str == null) {
        this.top_label = "";
      } else {
        this.top_label = str;
      } 
      str = paramBuilder.bottom_label;
      if (str == null) {
        this.bottom_label = "";
      } else {
        this.bottom_label = str;
      } 
      str = paramBuilder.audience_label;
      if (str == null) {
        this.audience_label = "";
      } else {
        this.audience_label = str;
      } 
      str = paramBuilder.cover_url;
      if (str == null) {
        this.cover_url = "";
      } else {
        this.cover_url = str;
      } 
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      list = paramBuilder.decoration;
      if (list == null) {
        this.decoration = DEFAULT_DECORATION;
      } else {
        this.decoration = Message.immutableCopyOf(list);
      } 
    } else {
      this.top_label = ((Builder)list).top_label;
      this.bottom_label = ((Builder)list).bottom_label;
      this.audience_label = ((Builder)list).audience_label;
      this.cover_url = ((Builder)list).cover_url;
      this.schema = ((Builder)list).schema;
      this.decoration = Message.immutableCopyOf(((Builder)list).decoration);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedLiveComponent> {
    public String audience_label;
    
    public String bottom_label;
    
    public String cover_url;
    
    public List<PicDecoration> decoration;
    
    public String schema;
    
    public String top_label;
    
    public Builder() {}
    
    public Builder(FeedLiveComponent param1FeedLiveComponent) {
      super(param1FeedLiveComponent);
      if (param1FeedLiveComponent == null)
        return; 
      this.top_label = param1FeedLiveComponent.top_label;
      this.bottom_label = param1FeedLiveComponent.bottom_label;
      this.audience_label = param1FeedLiveComponent.audience_label;
      this.cover_url = param1FeedLiveComponent.cover_url;
      this.schema = param1FeedLiveComponent.schema;
      this.decoration = Message.copyOf(param1FeedLiveComponent.decoration);
    }
    
    public FeedLiveComponent build(boolean param1Boolean) {
      return new FeedLiveComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
