package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadVideoCard extends Message {
  public static final String DEFAULT_LINK_TITLE = "";
  
  public static final Integer DEFAULT_THUMBNAIL_HEIGHT;
  
  public static final String DEFAULT_THUMBNAIL_URL = "";
  
  public static final Integer DEFAULT_THUMBNAIL_WIDTH;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_VIDEO_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String link_title;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer thumbnail_height;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String thumbnail_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer thumbnail_width;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String video_url;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_THUMBNAIL_HEIGHT = integer;
    DEFAULT_THUMBNAIL_WIDTH = integer;
  }
  
  public ThreadVideoCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.link_title;
      if (str == null) {
        this.link_title = "";
      } else {
        this.link_title = str;
      } 
      str = paramBuilder.video_url;
      if (str == null) {
        this.video_url = "";
      } else {
        this.video_url = str;
      } 
      str = paramBuilder.thumbnail_url;
      if (str == null) {
        this.thumbnail_url = "";
      } else {
        this.thumbnail_url = str;
      } 
      Integer integer1 = paramBuilder.thumbnail_height;
      if (integer1 == null) {
        this.thumbnail_height = DEFAULT_THUMBNAIL_HEIGHT;
      } else {
        this.thumbnail_height = integer1;
      } 
      integer = paramBuilder.thumbnail_width;
      if (integer == null) {
        this.thumbnail_width = DEFAULT_THUMBNAIL_WIDTH;
      } else {
        this.thumbnail_width = integer;
      } 
    } else {
      this.title = ((Builder)integer).title;
      this.link_title = ((Builder)integer).link_title;
      this.video_url = ((Builder)integer).video_url;
      this.thumbnail_url = ((Builder)integer).thumbnail_url;
      this.thumbnail_height = ((Builder)integer).thumbnail_height;
      this.thumbnail_width = ((Builder)integer).thumbnail_width;
    } 
  }
  
  public static final class Builder extends Message.Builder<ThreadVideoCard> {
    public String link_title;
    
    public Integer thumbnail_height;
    
    public String thumbnail_url;
    
    public Integer thumbnail_width;
    
    public String title;
    
    public String video_url;
    
    public Builder() {}
    
    public Builder(ThreadVideoCard param1ThreadVideoCard) {
      super(param1ThreadVideoCard);
      if (param1ThreadVideoCard == null)
        return; 
      this.title = param1ThreadVideoCard.title;
      this.link_title = param1ThreadVideoCard.link_title;
      this.video_url = param1ThreadVideoCard.video_url;
      this.thumbnail_url = param1ThreadVideoCard.thumbnail_url;
      this.thumbnail_height = param1ThreadVideoCard.thumbnail_height;
      this.thumbnail_width = param1ThreadVideoCard.thumbnail_width;
    }
    
    public ThreadVideoCard build(boolean param1Boolean) {
      return new ThreadVideoCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
