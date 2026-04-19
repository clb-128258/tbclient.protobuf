package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class NovelRecomCard extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final String DEFAULT_AUTHOR = "";
  
  public static final String DEFAULT_BOTTOM_GUIDE = "";
  
  public static final String DEFAULT_BOTTOM_SCHEME = "";
  
  public static final String DEFAULT_BOTTOM_TITLE = "";
  
  public static final String DEFAULT_BUTTON_NAME = "";
  
  public static final String DEFAULT_BUTTON_SCHEME = "";
  
  public static final String DEFAULT_CARD_SCHEME = "";
  
  public static final String DEFAULT_CHAPTER_NAME = "";
  
  public static final Long DEFAULT_CHAPTER_TIME;
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final List<ThemeColorInfo> DEFAULT_TITLE_LABELS = Collections.emptyList();
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String author;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String bottom_guide;
  
  @ProtoField(tag = 13)
  public final ThemeColorInfo bottom_left_icon;
  
  @ProtoField(tag = 16)
  public final ThemeColorInfo bottom_right_icon;
  
  @ProtoField(tag = 19)
  public final ThemeColorInfo bottom_right_icon_2;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String bottom_scheme;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String bottom_title;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String button_name;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String button_scheme;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String card_scheme;
  
  @ProtoField(tag = 17)
  public final ThemeColorInfo chapter_bg_color;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String chapter_name;
  
  @ProtoField(tag = 18)
  public final ThemeColorInfo chapter_name_color;
  
  @ProtoField(tag = 8)
  public final ThemeColorInfo chapter_new_labels;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long chapter_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ThemeColorInfo> title_labels;
  
  static {
    DEFAULT_CHAPTER_TIME = Long.valueOf(0L);
  }
  
  public NovelRecomCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str3 = paramBuilder.icon_url;
      if (str3 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str3;
      } 
      str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      List<ThemeColorInfo> list = paramBuilder.title_labels;
      if (list == null) {
        this.title_labels = DEFAULT_TITLE_LABELS;
      } else {
        this.title_labels = Message.immutableCopyOf(list);
      } 
      String str2 = paramBuilder.author;
      if (str2 == null) {
        this.author = "";
      } else {
        this.author = str2;
      } 
      str2 = paramBuilder._abstract;
      if (str2 == null) {
        this._abstract = "";
      } else {
        this._abstract = str2;
      } 
      str2 = paramBuilder.chapter_name;
      if (str2 == null) {
        this.chapter_name = "";
      } else {
        this.chapter_name = str2;
      } 
      Long long_ = paramBuilder.chapter_time;
      if (long_ == null) {
        this.chapter_time = DEFAULT_CHAPTER_TIME;
      } else {
        this.chapter_time = long_;
      } 
      this.chapter_new_labels = paramBuilder.chapter_new_labels;
      String str1 = paramBuilder.button_name;
      if (str1 == null) {
        this.button_name = "";
      } else {
        this.button_name = str1;
      } 
      str1 = paramBuilder.button_scheme;
      if (str1 == null) {
        this.button_scheme = "";
      } else {
        this.button_scheme = str1;
      } 
      str1 = paramBuilder.card_scheme;
      if (str1 == null) {
        this.card_scheme = "";
      } else {
        this.card_scheme = str1;
      } 
      str1 = paramBuilder.bottom_title;
      if (str1 == null) {
        this.bottom_title = "";
      } else {
        this.bottom_title = str1;
      } 
      this.bottom_left_icon = paramBuilder.bottom_left_icon;
      str1 = paramBuilder.bottom_scheme;
      if (str1 == null) {
        this.bottom_scheme = "";
      } else {
        this.bottom_scheme = str1;
      } 
      str1 = paramBuilder.bottom_guide;
      if (str1 == null) {
        this.bottom_guide = "";
      } else {
        this.bottom_guide = str1;
      } 
      this.bottom_right_icon = paramBuilder.bottom_right_icon;
      this.chapter_bg_color = paramBuilder.chapter_bg_color;
      this.chapter_name_color = paramBuilder.chapter_name_color;
      this.bottom_right_icon_2 = paramBuilder.bottom_right_icon_2;
    } else {
      this.icon_url = paramBuilder.icon_url;
      this.title = paramBuilder.title;
      this.title_labels = Message.immutableCopyOf(paramBuilder.title_labels);
      this.author = paramBuilder.author;
      this._abstract = paramBuilder._abstract;
      this.chapter_name = paramBuilder.chapter_name;
      this.chapter_time = paramBuilder.chapter_time;
      this.chapter_new_labels = paramBuilder.chapter_new_labels;
      this.button_name = paramBuilder.button_name;
      this.button_scheme = paramBuilder.button_scheme;
      this.card_scheme = paramBuilder.card_scheme;
      this.bottom_title = paramBuilder.bottom_title;
      this.bottom_left_icon = paramBuilder.bottom_left_icon;
      this.bottom_scheme = paramBuilder.bottom_scheme;
      this.bottom_guide = paramBuilder.bottom_guide;
      this.bottom_right_icon = paramBuilder.bottom_right_icon;
      this.chapter_bg_color = paramBuilder.chapter_bg_color;
      this.chapter_name_color = paramBuilder.chapter_name_color;
      this.bottom_right_icon_2 = paramBuilder.bottom_right_icon_2;
    } 
  }
  
  public static final class Builder extends Message.Builder<NovelRecomCard> {
    public String _abstract;
    
    public String author;
    
    public String bottom_guide;
    
    public ThemeColorInfo bottom_left_icon;
    
    public ThemeColorInfo bottom_right_icon;
    
    public ThemeColorInfo bottom_right_icon_2;
    
    public String bottom_scheme;
    
    public String bottom_title;
    
    public String button_name;
    
    public String button_scheme;
    
    public String card_scheme;
    
    public ThemeColorInfo chapter_bg_color;
    
    public String chapter_name;
    
    public ThemeColorInfo chapter_name_color;
    
    public ThemeColorInfo chapter_new_labels;
    
    public Long chapter_time;
    
    public String icon_url;
    
    public String title;
    
    public List<ThemeColorInfo> title_labels;
    
    public Builder() {}
    
    public Builder(NovelRecomCard param1NovelRecomCard) {
      super(param1NovelRecomCard);
      if (param1NovelRecomCard == null)
        return; 
      this.icon_url = param1NovelRecomCard.icon_url;
      this.title = param1NovelRecomCard.title;
      this.title_labels = Message.copyOf(param1NovelRecomCard.title_labels);
      this.author = param1NovelRecomCard.author;
      this._abstract = param1NovelRecomCard._abstract;
      this.chapter_name = param1NovelRecomCard.chapter_name;
      this.chapter_time = param1NovelRecomCard.chapter_time;
      this.chapter_new_labels = param1NovelRecomCard.chapter_new_labels;
      this.button_name = param1NovelRecomCard.button_name;
      this.button_scheme = param1NovelRecomCard.button_scheme;
      this.card_scheme = param1NovelRecomCard.card_scheme;
      this.bottom_title = param1NovelRecomCard.bottom_title;
      this.bottom_left_icon = param1NovelRecomCard.bottom_left_icon;
      this.bottom_scheme = param1NovelRecomCard.bottom_scheme;
      this.bottom_guide = param1NovelRecomCard.bottom_guide;
      this.bottom_right_icon = param1NovelRecomCard.bottom_right_icon;
      this.chapter_bg_color = param1NovelRecomCard.chapter_bg_color;
      this.chapter_name_color = param1NovelRecomCard.chapter_name_color;
      this.bottom_right_icon_2 = param1NovelRecomCard.bottom_right_icon_2;
    }
    
    public NovelRecomCard build(boolean param1Boolean) {
      return new NovelRecomCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
