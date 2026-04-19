package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class NovelInfo extends Message {
  public static final String DEFAULT_AUTHOR = "";
  
  public static final String DEFAULT_BOTTOM_TEXT = "";
  
  public static final String DEFAULT_BUY_URL = "";
  
  public static final List<String> DEFAULT_CATEGORY;
  
  public static final Long DEFAULT_CHAPTERS;
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_DISCOUNT_PRICE = "";
  
  public static final String DEFAULT_FROM = "";
  
  public static final String DEFAULT_H5_URL = "";
  
  public static final String DEFAULT_IMG = "";
  
  public static final String DEFAULT_IS_PAY = "";
  
  public static final String DEFAULT_MEMBER_IMG = "";
  
  public static final String DEFAULT_MEMBER_TEXT = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final Long DEFAULT_NOVEL_ID;
  
  public static final Long DEFAULT_PERCENT;
  
  public static final String DEFAULT_READER_TEXT = "";
  
  public static final String DEFAULT_STORY_CHANNEL_TEXT = "";
  
  public static final String DEFAULT_STORY_CHANNEL_URL = "";
  
  public static final String DEFAULT_TOURIST_TEXT = "";
  
  public static final String DEFAULT_TOURIST_URL = "";
  
  public static final Integer DEFAULT_YAB_TYPE;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String author;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String bottom_text;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String buy_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 14, type = Message.Datatype.STRING)
  public final List<String> category;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long chapters;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String discount_price;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String from;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String h5_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String img;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String is_pay;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String member_img;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String member_text;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long novel_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long percent;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String reader_text;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String story_channel_text;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String story_channel_url;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String tourist_text;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String tourist_url;
  
  @ProtoField(tag = 21, type = Message.Datatype.UINT32)
  public final Integer yab_type;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_NOVEL_ID = long_;
    DEFAULT_PERCENT = long_;
    DEFAULT_CHAPTERS = long_;
    DEFAULT_CATEGORY = Collections.emptyList();
    DEFAULT_YAB_TYPE = Integer.valueOf(0);
  }
  
  public NovelInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.novel_id;
      if (long_3 == null) {
        this.novel_id = DEFAULT_NOVEL_ID;
      } else {
        this.novel_id = long_3;
      } 
      String str4 = paramBuilder.img;
      if (str4 == null) {
        this.img = "";
      } else {
        this.img = str4;
      } 
      str4 = paramBuilder.name;
      if (str4 == null) {
        this.name = "";
      } else {
        this.name = str4;
      } 
      str4 = paramBuilder.author;
      if (str4 == null) {
        this.author = "";
      } else {
        this.author = str4;
      } 
      str4 = paramBuilder.desc;
      if (str4 == null) {
        this.desc = "";
      } else {
        this.desc = str4;
      } 
      str4 = paramBuilder.discount_price;
      if (str4 == null) {
        this.discount_price = "";
      } else {
        this.discount_price = str4;
      } 
      Long long_2 = paramBuilder.percent;
      if (long_2 == null) {
        this.percent = DEFAULT_PERCENT;
      } else {
        this.percent = long_2;
      } 
      String str3 = paramBuilder.h5_url;
      if (str3 == null) {
        this.h5_url = "";
      } else {
        this.h5_url = str3;
      } 
      str3 = paramBuilder.is_pay;
      if (str3 == null) {
        this.is_pay = "";
      } else {
        this.is_pay = str3;
      } 
      Long long_1 = paramBuilder.chapters;
      if (long_1 == null) {
        this.chapters = DEFAULT_CHAPTERS;
      } else {
        this.chapters = long_1;
      } 
      String str2 = paramBuilder.member_text;
      if (str2 == null) {
        this.member_text = "";
      } else {
        this.member_text = str2;
      } 
      str2 = paramBuilder.member_img;
      if (str2 == null) {
        this.member_img = "";
      } else {
        this.member_img = str2;
      } 
      str2 = paramBuilder.buy_url;
      if (str2 == null) {
        this.buy_url = "";
      } else {
        this.buy_url = str2;
      } 
      List<String> list = paramBuilder.category;
      if (list == null) {
        this.category = DEFAULT_CATEGORY;
      } else {
        this.category = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.story_channel_text;
      if (str1 == null) {
        this.story_channel_text = "";
      } else {
        this.story_channel_text = str1;
      } 
      str1 = paramBuilder.story_channel_url;
      if (str1 == null) {
        this.story_channel_url = "";
      } else {
        this.story_channel_url = str1;
      } 
      str1 = paramBuilder.tourist_text;
      if (str1 == null) {
        this.tourist_text = "";
      } else {
        this.tourist_text = str1;
      } 
      str1 = paramBuilder.tourist_url;
      if (str1 == null) {
        this.tourist_url = "";
      } else {
        this.tourist_url = str1;
      } 
      str1 = paramBuilder.reader_text;
      if (str1 == null) {
        this.reader_text = "";
      } else {
        this.reader_text = str1;
      } 
      str1 = paramBuilder.from;
      if (str1 == null) {
        this.from = "";
      } else {
        this.from = str1;
      } 
      Integer integer = paramBuilder.yab_type;
      if (integer == null) {
        this.yab_type = DEFAULT_YAB_TYPE;
      } else {
        this.yab_type = integer;
      } 
      str = paramBuilder.bottom_text;
      if (str == null) {
        this.bottom_text = "";
      } else {
        this.bottom_text = str;
      } 
    } else {
      this.novel_id = ((Builder)str).novel_id;
      this.img = ((Builder)str).img;
      this.name = ((Builder)str).name;
      this.author = ((Builder)str).author;
      this.desc = ((Builder)str).desc;
      this.discount_price = ((Builder)str).discount_price;
      this.percent = ((Builder)str).percent;
      this.h5_url = ((Builder)str).h5_url;
      this.is_pay = ((Builder)str).is_pay;
      this.chapters = ((Builder)str).chapters;
      this.member_text = ((Builder)str).member_text;
      this.member_img = ((Builder)str).member_img;
      this.buy_url = ((Builder)str).buy_url;
      this.category = Message.immutableCopyOf(((Builder)str).category);
      this.story_channel_text = ((Builder)str).story_channel_text;
      this.story_channel_url = ((Builder)str).story_channel_url;
      this.tourist_text = ((Builder)str).tourist_text;
      this.tourist_url = ((Builder)str).tourist_url;
      this.reader_text = ((Builder)str).reader_text;
      this.from = ((Builder)str).from;
      this.yab_type = ((Builder)str).yab_type;
      this.bottom_text = ((Builder)str).bottom_text;
    } 
  }
  
  public static final class Builder extends Message.Builder<NovelInfo> {
    public String author;
    
    public String bottom_text;
    
    public String buy_url;
    
    public List<String> category;
    
    public Long chapters;
    
    public String desc;
    
    public String discount_price;
    
    public String from;
    
    public String h5_url;
    
    public String img;
    
    public String is_pay;
    
    public String member_img;
    
    public String member_text;
    
    public String name;
    
    public Long novel_id;
    
    public Long percent;
    
    public String reader_text;
    
    public String story_channel_text;
    
    public String story_channel_url;
    
    public String tourist_text;
    
    public String tourist_url;
    
    public Integer yab_type;
    
    public Builder() {}
    
    public Builder(NovelInfo param1NovelInfo) {
      super(param1NovelInfo);
      if (param1NovelInfo == null)
        return; 
      this.novel_id = param1NovelInfo.novel_id;
      this.img = param1NovelInfo.img;
      this.name = param1NovelInfo.name;
      this.author = param1NovelInfo.author;
      this.desc = param1NovelInfo.desc;
      this.discount_price = param1NovelInfo.discount_price;
      this.percent = param1NovelInfo.percent;
      this.h5_url = param1NovelInfo.h5_url;
      this.is_pay = param1NovelInfo.is_pay;
      this.chapters = param1NovelInfo.chapters;
      this.member_text = param1NovelInfo.member_text;
      this.member_img = param1NovelInfo.member_img;
      this.buy_url = param1NovelInfo.buy_url;
      this.category = Message.copyOf(param1NovelInfo.category);
      this.story_channel_text = param1NovelInfo.story_channel_text;
      this.story_channel_url = param1NovelInfo.story_channel_url;
      this.tourist_text = param1NovelInfo.tourist_text;
      this.tourist_url = param1NovelInfo.tourist_url;
      this.reader_text = param1NovelInfo.reader_text;
      this.from = param1NovelInfo.from;
      this.yab_type = param1NovelInfo.yab_type;
      this.bottom_text = param1NovelInfo.bottom_text;
    }
    
    public NovelInfo build(boolean param1Boolean) {
      return new NovelInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
