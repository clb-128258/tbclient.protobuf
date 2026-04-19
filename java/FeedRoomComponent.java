package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedRoomComponent extends Message {
  public static final List<ThreadRecommendTag> DEFAULT_BOTTOM_LABELS;
  
  public static final String DEFAULT_COVER_URL = "";
  
  public static final Long DEFAULT_ROOM_ID;
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
  
  public static final String DEFAULT_TOP_LABEL = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<ThreadRecommendTag> bottom_labels;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String cover_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long room_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String top_label;
  
  @ProtoField(tag = 3)
  public final Voice voice;
  
  static {
    DEFAULT_BOTTOM_LABELS = Collections.emptyList();
    DEFAULT_ROOM_ID = Long.valueOf(0L);
  }
  
  public FeedRoomComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str2 = paramBuilder.top_label;
      if (str2 == null) {
        this.top_label = "";
      } else {
        this.top_label = str2;
      } 
      Integer integer = paramBuilder.status;
      if (integer == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer;
      } 
      this.voice = paramBuilder.voice;
      List<ThreadRecommendTag> list = paramBuilder.bottom_labels;
      if (list == null) {
        this.bottom_labels = DEFAULT_BOTTOM_LABELS;
      } else {
        this.bottom_labels = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.scheme;
      if (str1 == null) {
        this.scheme = "";
      } else {
        this.scheme = str1;
      } 
      str1 = paramBuilder.cover_url;
      if (str1 == null) {
        this.cover_url = "";
      } else {
        this.cover_url = str1;
      } 
      long_ = paramBuilder.room_id;
      if (long_ == null) {
        this.room_id = DEFAULT_ROOM_ID;
      } else {
        this.room_id = long_;
      } 
    } else {
      this.top_label = ((Builder)long_).top_label;
      this.status = ((Builder)long_).status;
      this.voice = ((Builder)long_).voice;
      this.bottom_labels = Message.immutableCopyOf(((Builder)long_).bottom_labels);
      this.scheme = ((Builder)long_).scheme;
      this.cover_url = ((Builder)long_).cover_url;
      this.room_id = ((Builder)long_).room_id;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedRoomComponent> {
    public List<ThreadRecommendTag> bottom_labels;
    
    public String cover_url;
    
    public Long room_id;
    
    public String scheme;
    
    public Integer status;
    
    public String top_label;
    
    public Voice voice;
    
    public Builder() {}
    
    public Builder(FeedRoomComponent param1FeedRoomComponent) {
      super(param1FeedRoomComponent);
      if (param1FeedRoomComponent == null)
        return; 
      this.top_label = param1FeedRoomComponent.top_label;
      this.status = param1FeedRoomComponent.status;
      this.voice = param1FeedRoomComponent.voice;
      this.bottom_labels = Message.copyOf(param1FeedRoomComponent.bottom_labels);
      this.scheme = param1FeedRoomComponent.scheme;
      this.cover_url = param1FeedRoomComponent.cover_url;
      this.room_id = param1FeedRoomComponent.room_id;
    }
    
    public FeedRoomComponent build(boolean param1Boolean) {
      return new FeedRoomComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
