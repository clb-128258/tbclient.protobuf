package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedBannerComponent extends Message {
  public static final Long DEFAULT_ACTIVITY_ID;
  
  public static final Integer DEFAULT_BANNER_HIGH;
  
  public static final String DEFAULT_BANNER_URL = "";
  
  public static final Integer DEFAULT_BANNER_WIDTH;
  
  public static final List<String> DEFAULT_CLICK_STATISTICS_URLS;
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_PACKAGE_NAME = "";
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final List<String> DEFAULT_SHOW_STATISTICS_URLS;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long activity_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer banner_high;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String banner_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer banner_width;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7, type = Message.Datatype.STRING)
  public final List<String> click_statistics_urls;
  
  @ProtoField(tag = 10)
  public final AppDownloadInfo download_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String package_name;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.STRING)
  public final List<String> show_statistics_urls;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_BANNER_WIDTH = integer;
    DEFAULT_BANNER_HIGH = integer;
    DEFAULT_ACTIVITY_ID = Long.valueOf(0L);
    DEFAULT_SHOW_STATISTICS_URLS = Collections.emptyList();
    DEFAULT_CLICK_STATISTICS_URLS = Collections.emptyList();
  }
  
  public FeedBannerComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str3 = paramBuilder.banner_url;
      if (str3 == null) {
        this.banner_url = "";
      } else {
        this.banner_url = str3;
      } 
      Integer integer = paramBuilder.banner_width;
      if (integer == null) {
        this.banner_width = DEFAULT_BANNER_WIDTH;
      } else {
        this.banner_width = integer;
      } 
      integer = paramBuilder.banner_high;
      if (integer == null) {
        this.banner_high = DEFAULT_BANNER_HIGH;
      } else {
        this.banner_high = integer;
      } 
      String str2 = paramBuilder.jump_url;
      if (str2 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str2;
      } 
      Long long_ = paramBuilder.activity_id;
      if (long_ == null) {
        this.activity_id = DEFAULT_ACTIVITY_ID;
      } else {
        this.activity_id = long_;
      } 
      List<String> list = paramBuilder.show_statistics_urls;
      if (list == null) {
        this.show_statistics_urls = DEFAULT_SHOW_STATISTICS_URLS;
      } else {
        this.show_statistics_urls = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.click_statistics_urls;
      if (list == null) {
        this.click_statistics_urls = DEFAULT_CLICK_STATISTICS_URLS;
      } else {
        this.click_statistics_urls = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.scheme;
      if (str1 == null) {
        this.scheme = "";
      } else {
        this.scheme = str1;
      } 
      str1 = paramBuilder.package_name;
      if (str1 == null) {
        this.package_name = "";
      } else {
        this.package_name = str1;
      } 
      this.download_info = paramBuilder.download_info;
    } else {
      this.banner_url = paramBuilder.banner_url;
      this.banner_width = paramBuilder.banner_width;
      this.banner_high = paramBuilder.banner_high;
      this.jump_url = paramBuilder.jump_url;
      this.activity_id = paramBuilder.activity_id;
      this.show_statistics_urls = Message.immutableCopyOf(paramBuilder.show_statistics_urls);
      this.click_statistics_urls = Message.immutableCopyOf(paramBuilder.click_statistics_urls);
      this.scheme = paramBuilder.scheme;
      this.package_name = paramBuilder.package_name;
      this.download_info = paramBuilder.download_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedBannerComponent> {
    public Long activity_id;
    
    public Integer banner_high;
    
    public String banner_url;
    
    public Integer banner_width;
    
    public List<String> click_statistics_urls;
    
    public AppDownloadInfo download_info;
    
    public String jump_url;
    
    public String package_name;
    
    public String scheme;
    
    public List<String> show_statistics_urls;
    
    public Builder() {}
    
    public Builder(FeedBannerComponent param1FeedBannerComponent) {
      super(param1FeedBannerComponent);
      if (param1FeedBannerComponent == null)
        return; 
      this.banner_url = param1FeedBannerComponent.banner_url;
      this.banner_width = param1FeedBannerComponent.banner_width;
      this.banner_high = param1FeedBannerComponent.banner_high;
      this.jump_url = param1FeedBannerComponent.jump_url;
      this.activity_id = param1FeedBannerComponent.activity_id;
      this.show_statistics_urls = Message.copyOf(param1FeedBannerComponent.show_statistics_urls);
      this.click_statistics_urls = Message.copyOf(param1FeedBannerComponent.click_statistics_urls);
      this.scheme = param1FeedBannerComponent.scheme;
      this.package_name = param1FeedBannerComponent.package_name;
      this.download_info = param1FeedBannerComponent.download_info;
    }
    
    public FeedBannerComponent build(boolean param1Boolean) {
      return new FeedBannerComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
