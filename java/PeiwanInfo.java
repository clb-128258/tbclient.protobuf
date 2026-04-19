package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class PeiwanInfo extends Message {
  public static final String DEFAULT_COVER = "";
  
  public static final String DEFAULT_EXTENSION_INFO = "";
  
  public static final Long DEFAULT_ROOM_ID;
  
  public static final Integer DEFAULT_ROOM_STATUS = Integer.valueOf(0);
  
  public static final String DEFAULT_ROOM_STATUS_TEXT = "";
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final List<ThreadRecommendTag> DEFAULT_TAG_LIST = Collections.emptyList();
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String cover;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String extension_info;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT64)
  public final Long room_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer room_status;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String room_status_text;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<ThreadRecommendTag> tag_list;
  
  @ProtoField(tag = 3)
  public final Voice voice;
  
  static {
    DEFAULT_ROOM_ID = Long.valueOf(0L);
  }
  
  public PeiwanInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.room_status;
      if (integer == null) {
        this.room_status = DEFAULT_ROOM_STATUS;
      } else {
        this.room_status = integer;
      } 
      String str2 = paramBuilder.room_status_text;
      if (str2 == null) {
        this.room_status_text = "";
      } else {
        this.room_status_text = str2;
      } 
      this.voice = paramBuilder.voice;
      List<ThreadRecommendTag> list = paramBuilder.tag_list;
      if (list == null) {
        this.tag_list = DEFAULT_TAG_LIST;
      } else {
        this.tag_list = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.scheme;
      if (str1 == null) {
        this.scheme = "";
      } else {
        this.scheme = str1;
      } 
      str1 = paramBuilder.extension_info;
      if (str1 == null) {
        this.extension_info = "";
      } else {
        this.extension_info = str1;
      } 
      str1 = paramBuilder.cover;
      if (str1 == null) {
        this.cover = "";
      } else {
        this.cover = str1;
      } 
      long_ = paramBuilder.room_id;
      if (long_ == null) {
        this.room_id = DEFAULT_ROOM_ID;
      } else {
        this.room_id = long_;
      } 
    } else {
      this.room_status = ((Builder)long_).room_status;
      this.room_status_text = ((Builder)long_).room_status_text;
      this.voice = ((Builder)long_).voice;
      this.tag_list = Message.immutableCopyOf(((Builder)long_).tag_list);
      this.scheme = ((Builder)long_).scheme;
      this.extension_info = ((Builder)long_).extension_info;
      this.cover = ((Builder)long_).cover;
      this.room_id = ((Builder)long_).room_id;
    } 
  }
  
  public static final class Builder extends Message.Builder<PeiwanInfo> {
    public String cover;
    
    public String extension_info;
    
    public Long room_id;
    
    public Integer room_status;
    
    public String room_status_text;
    
    public String scheme;
    
    public List<ThreadRecommendTag> tag_list;
    
    public Voice voice;
    
    public Builder() {}
    
    public Builder(PeiwanInfo param1PeiwanInfo) {
      super(param1PeiwanInfo);
      if (param1PeiwanInfo == null)
        return; 
      this.room_status = param1PeiwanInfo.room_status;
      this.room_status_text = param1PeiwanInfo.room_status_text;
      this.voice = param1PeiwanInfo.voice;
      this.tag_list = Message.copyOf(param1PeiwanInfo.tag_list);
      this.scheme = param1PeiwanInfo.scheme;
      this.extension_info = param1PeiwanInfo.extension_info;
      this.cover = param1PeiwanInfo.cover;
      this.room_id = param1PeiwanInfo.room_id;
    }
    
    public PeiwanInfo build(boolean param1Boolean) {
      return new PeiwanInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
