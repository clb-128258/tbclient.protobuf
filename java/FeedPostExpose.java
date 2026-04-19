package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedPostExpose extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final Integer DEFAULT_CONTENT_MAX_LINES;
  
  public static final List<FeedContentResource> DEFAULT_FLOOR = Collections.emptyList();
  
  public static final String DEFAULT_HEAD_TEXT = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final String DEFAULT_STAMP_URL = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer content_max_lines;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedContentResource> floor;
  
  @ProtoField(tag = 7)
  public final Agree head_agree;
  
  @ProtoField(tag = 4)
  public final PostExposeHead head_img;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String head_text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String stamp_url;
  
  static {
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
    DEFAULT_CONTENT_MAX_LINES = Integer.valueOf(0);
  }
  
  public FeedPostExpose(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.schema;
      if (str2 == null) {
        this.schema = "";
      } else {
        this.schema = str2;
      } 
      str2 = paramBuilder.stamp_url;
      if (str2 == null) {
        this.stamp_url = "";
      } else {
        this.stamp_url = str2;
      } 
      List<FeedContentResource> list1 = paramBuilder.floor;
      if (list1 == null) {
        this.floor = DEFAULT_FLOOR;
      } else {
        this.floor = Message.immutableCopyOf(list1);
      } 
      this.head_img = paramBuilder.head_img;
      List<FeedKV> list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.head_text;
      if (str1 == null) {
        this.head_text = "";
      } else {
        this.head_text = str1;
      } 
      this.head_agree = paramBuilder.head_agree;
      integer = paramBuilder.content_max_lines;
      if (integer == null) {
        this.content_max_lines = DEFAULT_CONTENT_MAX_LINES;
      } else {
        this.content_max_lines = integer;
      } 
    } else {
      this.schema = ((Builder)integer).schema;
      this.stamp_url = ((Builder)integer).stamp_url;
      this.floor = Message.immutableCopyOf(((Builder)integer).floor);
      this.head_img = ((Builder)integer).head_img;
      this.business_info = Message.immutableCopyOf(((Builder)integer).business_info);
      this.head_text = ((Builder)integer).head_text;
      this.head_agree = ((Builder)integer).head_agree;
      this.content_max_lines = ((Builder)integer).content_max_lines;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedPostExpose> {
    public List<FeedKV> business_info;
    
    public Integer content_max_lines;
    
    public List<FeedContentResource> floor;
    
    public Agree head_agree;
    
    public PostExposeHead head_img;
    
    public String head_text;
    
    public String schema;
    
    public String stamp_url;
    
    public Builder() {}
    
    public Builder(FeedPostExpose param1FeedPostExpose) {
      super(param1FeedPostExpose);
      if (param1FeedPostExpose == null)
        return; 
      this.schema = param1FeedPostExpose.schema;
      this.stamp_url = param1FeedPostExpose.stamp_url;
      this.floor = Message.copyOf(param1FeedPostExpose.floor);
      this.head_img = param1FeedPostExpose.head_img;
      this.business_info = Message.copyOf(param1FeedPostExpose.business_info);
      this.head_text = param1FeedPostExpose.head_text;
      this.head_agree = param1FeedPostExpose.head_agree;
      this.content_max_lines = param1FeedPostExpose.content_max_lines;
    }
    
    public FeedPostExpose build(boolean param1Boolean) {
      return new FeedPostExpose(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
