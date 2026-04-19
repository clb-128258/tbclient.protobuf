package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NovelChapterInfo extends Message {
  public static final String DEFAULT_CHAPTER_CONTENT = "";
  
  public static final String DEFAULT_CHAPTER_INDEX = "";
  
  public static final String DEFAULT_CHAPTER_NAME = "";
  
  public static final String DEFAULT_IS_LATEST = "";
  
  public static final Long DEFAULT_UPDATE_TIME = Long.valueOf(0L);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String chapter_content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String chapter_index;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String chapter_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String is_latest;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long update_time;
  
  public NovelChapterInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.chapter_index;
      if (str1 == null) {
        this.chapter_index = "";
      } else {
        this.chapter_index = str1;
      } 
      str1 = paramBuilder.chapter_name;
      if (str1 == null) {
        this.chapter_name = "";
      } else {
        this.chapter_name = str1;
      } 
      str1 = paramBuilder.chapter_content;
      if (str1 == null) {
        this.chapter_content = "";
      } else {
        this.chapter_content = str1;
      } 
      Long long_ = paramBuilder.update_time;
      if (long_ == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = long_;
      } 
      str = paramBuilder.is_latest;
      if (str == null) {
        this.is_latest = "";
      } else {
        this.is_latest = str;
      } 
    } else {
      this.chapter_index = ((Builder)str).chapter_index;
      this.chapter_name = ((Builder)str).chapter_name;
      this.chapter_content = ((Builder)str).chapter_content;
      this.update_time = ((Builder)str).update_time;
      this.is_latest = ((Builder)str).is_latest;
    } 
  }
  
  public static final class Builder extends Message.Builder<NovelChapterInfo> {
    public String chapter_content;
    
    public String chapter_index;
    
    public String chapter_name;
    
    public String is_latest;
    
    public Long update_time;
    
    public Builder() {}
    
    public Builder(NovelChapterInfo param1NovelChapterInfo) {
      super(param1NovelChapterInfo);
      if (param1NovelChapterInfo == null)
        return; 
      this.chapter_index = param1NovelChapterInfo.chapter_index;
      this.chapter_name = param1NovelChapterInfo.chapter_name;
      this.chapter_content = param1NovelChapterInfo.chapter_content;
      this.update_time = param1NovelChapterInfo.update_time;
      this.is_latest = param1NovelChapterInfo.is_latest;
    }
    
    public NovelChapterInfo build(boolean param1Boolean) {
      return new NovelChapterInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
