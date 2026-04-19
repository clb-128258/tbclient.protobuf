package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedItem extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final String DEFAULT_BUTTON_LINK = "";
  
  public static final String DEFAULT_BUTTON_NAME = "";
  
  public static final Double DEFAULT_ICON_RATIO;
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final Double DEFAULT_SCORE;
  
  public static final List<String> DEFAULT_TAGS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String button_link;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String button_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.DOUBLE)
  public final Double icon_ratio;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 4, type = Message.Datatype.DOUBLE)
  public final Double score;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
  public final List<String> tags;
  
  static {
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
  }
  
  public FeedItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      String str3 = paramBuilder.icon_url;
      if (str3 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str3;
      } 
      Double double_2 = paramBuilder.icon_ratio;
      if (double_2 == null) {
        this.icon_ratio = DEFAULT_ICON_RATIO;
      } else {
        this.icon_ratio = double_2;
      } 
      String str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      Double double_1 = paramBuilder.score;
      if (double_1 == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = double_1;
      } 
      List<String> list1 = paramBuilder.tags;
      if (list1 == null) {
        this.tags = DEFAULT_TAGS;
      } else {
        this.tags = Message.immutableCopyOf(list1);
      } 
      String str1 = paramBuilder.button_name;
      if (str1 == null) {
        this.button_name = "";
      } else {
        this.button_name = str1;
      } 
      str1 = paramBuilder.button_link;
      if (str1 == null) {
        this.button_link = "";
      } else {
        this.button_link = str1;
      } 
      list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.icon_url = ((Builder)list).icon_url;
      this.icon_ratio = ((Builder)list).icon_ratio;
      this.name = ((Builder)list).name;
      this.score = ((Builder)list).score;
      this.tags = Message.immutableCopyOf(((Builder)list).tags);
      this.button_name = ((Builder)list).button_name;
      this.button_link = ((Builder)list).button_link;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
    } 
  }
  
  static {
    Double double_ = Double.valueOf(0.0D);
    DEFAULT_ICON_RATIO = double_;
    DEFAULT_SCORE = double_;
  }
  
  public static final class Builder extends Message.Builder<FeedItem> {
    public List<FeedKV> business_info;
    
    public String button_link;
    
    public String button_name;
    
    public Double icon_ratio;
    
    public String icon_url;
    
    public String name;
    
    public Double score;
    
    public List<String> tags;
    
    public Builder() {}
    
    public Builder(FeedItem param1FeedItem) {
      super(param1FeedItem);
      if (param1FeedItem == null)
        return; 
      this.icon_url = param1FeedItem.icon_url;
      this.icon_ratio = param1FeedItem.icon_ratio;
      this.name = param1FeedItem.name;
      this.score = param1FeedItem.score;
      this.tags = Message.copyOf(param1FeedItem.tags);
      this.button_name = param1FeedItem.button_name;
      this.button_link = param1FeedItem.button_link;
      this.business_info = Message.copyOf(param1FeedItem.business_info);
    }
    
    public FeedItem build(boolean param1Boolean) {
      return new FeedItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
