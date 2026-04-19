package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeedKV;

public final class IndexGuideCardInfo extends Message {
  public static final String DEFAULT_BG_URL = "";
  
  public static final String DEFAULT_BG_URL_DARK = "";
  
  public static final String DEFAULT_BUTTON_SCHEME = "";
  
  public static final String DEFAULT_BUTTON_TEXT = "";
  
  public static final List<FeedKV> DEFAULT_FREQ_INFO = Collections.emptyList();
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_SUB_TITLE = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String bg_url;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String bg_url_dark;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String button_scheme;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String button_text;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<FeedKV> freq_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String sub_title;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public IndexGuideCardInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.icon_url;
      if (str2 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str2;
      } 
      str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.sub_title;
      if (str2 == null) {
        this.sub_title = "";
      } else {
        this.sub_title = str2;
      } 
      str2 = paramBuilder.bg_url;
      if (str2 == null) {
        this.bg_url = "";
      } else {
        this.bg_url = str2;
      } 
      str2 = paramBuilder.button_scheme;
      if (str2 == null) {
        this.button_scheme = "";
      } else {
        this.button_scheme = str2;
      } 
      List<FeedKV> list = paramBuilder.freq_info;
      if (list == null) {
        this.freq_info = DEFAULT_FREQ_INFO;
      } else {
        this.freq_info = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.button_text;
      if (str1 == null) {
        this.button_text = "";
      } else {
        this.button_text = str1;
      } 
      str = paramBuilder.bg_url_dark;
      if (str == null) {
        this.bg_url_dark = "";
      } else {
        this.bg_url_dark = str;
      } 
    } else {
      this.icon_url = ((Builder)str).icon_url;
      this.title = ((Builder)str).title;
      this.sub_title = ((Builder)str).sub_title;
      this.bg_url = ((Builder)str).bg_url;
      this.button_scheme = ((Builder)str).button_scheme;
      this.freq_info = Message.immutableCopyOf(((Builder)str).freq_info);
      this.button_text = ((Builder)str).button_text;
      this.bg_url_dark = ((Builder)str).bg_url_dark;
    } 
  }
  
  public static final class Builder extends Message.Builder<IndexGuideCardInfo> {
    public String bg_url;
    
    public String bg_url_dark;
    
    public String button_scheme;
    
    public String button_text;
    
    public List<FeedKV> freq_info;
    
    public String icon_url;
    
    public String sub_title;
    
    public String title;
    
    public Builder() {}
    
    public Builder(IndexGuideCardInfo param1IndexGuideCardInfo) {
      super(param1IndexGuideCardInfo);
      if (param1IndexGuideCardInfo == null)
        return; 
      this.icon_url = param1IndexGuideCardInfo.icon_url;
      this.title = param1IndexGuideCardInfo.title;
      this.sub_title = param1IndexGuideCardInfo.sub_title;
      this.bg_url = param1IndexGuideCardInfo.bg_url;
      this.button_scheme = param1IndexGuideCardInfo.button_scheme;
      this.freq_info = Message.copyOf(param1IndexGuideCardInfo.freq_info);
      this.button_text = param1IndexGuideCardInfo.button_text;
      this.bg_url_dark = param1IndexGuideCardInfo.bg_url_dark;
    }
    
    public IndexGuideCardInfo build(boolean param1Boolean) {
      return new IndexGuideCardInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
