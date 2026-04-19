package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class VideoField extends Message {
  public static final List<PicDecoration> DEFAULT_DECORATION;
  
  public static final Integer DEFAULT_DURATION;
  
  public static final Integer DEFAULT_HEIGHT;
  
  public static final Integer DEFAULT_IS_HIDE;
  
  public static final Integer DEFAULT_IS_HIDE_PLAY_BTN;
  
  public static final Integer DEFAULT_IS_VERTICAL;
  
  public static final String DEFAULT_MD5 = "";
  
  public static final Integer DEFAULT_PLAY_COUNT;
  
  public static final String DEFAULT_URL = "";
  
  public static final Integer DEFAULT_WIDTH;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 10)
  public final List<PicDecoration> decoration;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer duration;
  
  @ProtoField(tag = 9)
  public final ThumbnailInfo first_frame_thumbnail;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer height;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer is_hide;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer is_hide_play_btn;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_vertical;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String md5;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer play_count;
  
  @ProtoField(tag = 6)
  public final ThumbnailInfo thumbnail;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer width;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_DURATION = integer;
    DEFAULT_WIDTH = integer;
    DEFAULT_HEIGHT = integer;
    DEFAULT_PLAY_COUNT = integer;
    DEFAULT_IS_VERTICAL = integer;
    DEFAULT_DECORATION = Collections.emptyList();
    DEFAULT_IS_HIDE = integer;
    DEFAULT_IS_HIDE_PLAY_BTN = integer;
  }
  
  public VideoField(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.url;
      if (str2 == null) {
        this.url = "";
      } else {
        this.url = str2;
      } 
      Integer integer2 = paramBuilder.duration;
      if (integer2 == null) {
        this.duration = DEFAULT_DURATION;
      } else {
        this.duration = integer2;
      } 
      integer2 = paramBuilder.width;
      if (integer2 == null) {
        this.width = DEFAULT_WIDTH;
      } else {
        this.width = integer2;
      } 
      integer2 = paramBuilder.height;
      if (integer2 == null) {
        this.height = DEFAULT_HEIGHT;
      } else {
        this.height = integer2;
      } 
      integer2 = paramBuilder.play_count;
      if (integer2 == null) {
        this.play_count = DEFAULT_PLAY_COUNT;
      } else {
        this.play_count = integer2;
      } 
      this.thumbnail = paramBuilder.thumbnail;
      integer2 = paramBuilder.is_vertical;
      if (integer2 == null) {
        this.is_vertical = DEFAULT_IS_VERTICAL;
      } else {
        this.is_vertical = integer2;
      } 
      String str1 = paramBuilder.md5;
      if (str1 == null) {
        this.md5 = "";
      } else {
        this.md5 = str1;
      } 
      this.first_frame_thumbnail = paramBuilder.first_frame_thumbnail;
      List<PicDecoration> list = paramBuilder.decoration;
      if (list == null) {
        this.decoration = DEFAULT_DECORATION;
      } else {
        this.decoration = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.is_hide;
      if (integer1 == null) {
        this.is_hide = DEFAULT_IS_HIDE;
      } else {
        this.is_hide = integer1;
      } 
      integer = paramBuilder.is_hide_play_btn;
      if (integer == null) {
        this.is_hide_play_btn = DEFAULT_IS_HIDE_PLAY_BTN;
      } else {
        this.is_hide_play_btn = integer;
      } 
    } else {
      this.url = ((Builder)integer).url;
      this.duration = ((Builder)integer).duration;
      this.width = ((Builder)integer).width;
      this.height = ((Builder)integer).height;
      this.play_count = ((Builder)integer).play_count;
      this.thumbnail = ((Builder)integer).thumbnail;
      this.is_vertical = ((Builder)integer).is_vertical;
      this.md5 = ((Builder)integer).md5;
      this.first_frame_thumbnail = ((Builder)integer).first_frame_thumbnail;
      this.decoration = Message.immutableCopyOf(((Builder)integer).decoration);
      this.is_hide = ((Builder)integer).is_hide;
      this.is_hide_play_btn = ((Builder)integer).is_hide_play_btn;
    } 
  }
  
  public static final class Builder extends Message.Builder<VideoField> {
    public List<PicDecoration> decoration;
    
    public Integer duration;
    
    public ThumbnailInfo first_frame_thumbnail;
    
    public Integer height;
    
    public Integer is_hide;
    
    public Integer is_hide_play_btn;
    
    public Integer is_vertical;
    
    public String md5;
    
    public Integer play_count;
    
    public ThumbnailInfo thumbnail;
    
    public String url;
    
    public Integer width;
    
    public Builder() {}
    
    public Builder(VideoField param1VideoField) {
      super(param1VideoField);
      if (param1VideoField == null)
        return; 
      this.url = param1VideoField.url;
      this.duration = param1VideoField.duration;
      this.width = param1VideoField.width;
      this.height = param1VideoField.height;
      this.play_count = param1VideoField.play_count;
      this.thumbnail = param1VideoField.thumbnail;
      this.is_vertical = param1VideoField.is_vertical;
      this.md5 = param1VideoField.md5;
      this.first_frame_thumbnail = param1VideoField.first_frame_thumbnail;
      this.decoration = Message.copyOf(param1VideoField.decoration);
      this.is_hide = param1VideoField.is_hide;
      this.is_hide_play_btn = param1VideoField.is_hide_play_btn;
    }
    
    public VideoField build(boolean param1Boolean) {
      return new VideoField(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
