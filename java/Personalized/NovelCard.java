package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.NovelChapterInfo;
import tbclient.NovelInfo;
import tbclient.ThemeColorInfo;

public final class NovelCard extends Message {
  public static final String DEFAULT_CHAPTER_SCHEME = "";
  
  public static final List<ThemeColorInfo> DEFAULT_CHAPTER_TAGS;
  
  public static final String DEFAULT_ENTRY_TEXT = "";
  
  public static final List<ThemeColorInfo> DEFAULT_NOVEL_TAGS = Collections.emptyList();
  
  public static final Integer DEFAULT_OFFSET;
  
  public static final Long DEFAULT_READER_CNT;
  
  public static final Integer DEFAULT_STATUS;
  
  public static final String DEFAULT_TARGET_SCHEME = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 10)
  public final ThemeColorInfo background_image;
  
  @ProtoField(tag = 3)
  public final NovelChapterInfo chapter_info;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String chapter_scheme;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<ThemeColorInfo> chapter_tags;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String entry_text;
  
  @ProtoField(tag = 2)
  public final NovelInfo novel_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<ThemeColorInfo> novel_tags;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer offset;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long reader_cnt;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String target_scheme;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    DEFAULT_CHAPTER_TAGS = Collections.emptyList();
    DEFAULT_READER_CNT = Long.valueOf(0L);
    Integer integer = Integer.valueOf(0);
    DEFAULT_OFFSET = integer;
    DEFAULT_STATUS = integer;
  }
  
  public NovelCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      this.novel_info = paramBuilder.novel_info;
      this.chapter_info = paramBuilder.chapter_info;
      List<ThemeColorInfo> list = paramBuilder.novel_tags;
      if (list == null) {
        this.novel_tags = DEFAULT_NOVEL_TAGS;
      } else {
        this.novel_tags = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.chapter_tags;
      if (list == null) {
        this.chapter_tags = DEFAULT_CHAPTER_TAGS;
      } else {
        this.chapter_tags = Message.immutableCopyOf(list);
      } 
      Long long_ = paramBuilder.reader_cnt;
      if (long_ == null) {
        this.reader_cnt = DEFAULT_READER_CNT;
      } else {
        this.reader_cnt = long_;
      } 
      String str1 = paramBuilder.entry_text;
      if (str1 == null) {
        this.entry_text = "";
      } else {
        this.entry_text = str1;
      } 
      str1 = paramBuilder.target_scheme;
      if (str1 == null) {
        this.target_scheme = "";
      } else {
        this.target_scheme = str1;
      } 
      str1 = paramBuilder.chapter_scheme;
      if (str1 == null) {
        this.chapter_scheme = "";
      } else {
        this.chapter_scheme = str1;
      } 
      this.background_image = paramBuilder.background_image;
      Integer integer1 = paramBuilder.offset;
      if (integer1 == null) {
        this.offset = DEFAULT_OFFSET;
      } else {
        this.offset = integer1;
      } 
      integer = paramBuilder.status;
      if (integer == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer;
      } 
    } else {
      this.title = ((Builder)integer).title;
      this.novel_info = ((Builder)integer).novel_info;
      this.chapter_info = ((Builder)integer).chapter_info;
      this.novel_tags = Message.immutableCopyOf(((Builder)integer).novel_tags);
      this.chapter_tags = Message.immutableCopyOf(((Builder)integer).chapter_tags);
      this.reader_cnt = ((Builder)integer).reader_cnt;
      this.entry_text = ((Builder)integer).entry_text;
      this.target_scheme = ((Builder)integer).target_scheme;
      this.chapter_scheme = ((Builder)integer).chapter_scheme;
      this.background_image = ((Builder)integer).background_image;
      this.offset = ((Builder)integer).offset;
      this.status = ((Builder)integer).status;
    } 
  }
  
  public static final class Builder extends Message.Builder<NovelCard> {
    public ThemeColorInfo background_image;
    
    public NovelChapterInfo chapter_info;
    
    public String chapter_scheme;
    
    public List<ThemeColorInfo> chapter_tags;
    
    public String entry_text;
    
    public NovelInfo novel_info;
    
    public List<ThemeColorInfo> novel_tags;
    
    public Integer offset;
    
    public Long reader_cnt;
    
    public Integer status;
    
    public String target_scheme;
    
    public String title;
    
    public Builder() {}
    
    public Builder(NovelCard param1NovelCard) {
      super(param1NovelCard);
      if (param1NovelCard == null)
        return; 
      this.title = param1NovelCard.title;
      this.novel_info = param1NovelCard.novel_info;
      this.chapter_info = param1NovelCard.chapter_info;
      this.novel_tags = Message.copyOf(param1NovelCard.novel_tags);
      this.chapter_tags = Message.copyOf(param1NovelCard.chapter_tags);
      this.reader_cnt = param1NovelCard.reader_cnt;
      this.entry_text = param1NovelCard.entry_text;
      this.target_scheme = param1NovelCard.target_scheme;
      this.chapter_scheme = param1NovelCard.chapter_scheme;
      this.background_image = param1NovelCard.background_image;
      this.offset = param1NovelCard.offset;
      this.status = param1NovelCard.status;
    }
    
    public NovelCard build(boolean param1Boolean) {
      return new NovelCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
