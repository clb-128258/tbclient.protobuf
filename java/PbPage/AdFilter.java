package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AdFilter extends Message {
  public static final Integer DEFAULT_BANNER_AD_FILTER;
  
  public static final Integer DEFAULT_COMMENT_AD_FILTER;
  
  public static final Integer DEFAULT_TAB_AD_FILTER;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer banner_ad_filter;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer comment_ad_filter;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer tab_ad_filter;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_BANNER_AD_FILTER = integer;
    DEFAULT_COMMENT_AD_FILTER = integer;
    DEFAULT_TAB_AD_FILTER = integer;
  }
  
  public AdFilter(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.banner_ad_filter;
      if (integer1 == null) {
        this.banner_ad_filter = DEFAULT_BANNER_AD_FILTER;
      } else {
        this.banner_ad_filter = integer1;
      } 
      integer1 = paramBuilder.comment_ad_filter;
      if (integer1 == null) {
        this.comment_ad_filter = DEFAULT_COMMENT_AD_FILTER;
      } else {
        this.comment_ad_filter = integer1;
      } 
      integer = paramBuilder.tab_ad_filter;
      if (integer == null) {
        this.tab_ad_filter = DEFAULT_TAB_AD_FILTER;
      } else {
        this.tab_ad_filter = integer;
      } 
    } else {
      this.banner_ad_filter = ((Builder)integer).banner_ad_filter;
      this.comment_ad_filter = ((Builder)integer).comment_ad_filter;
      this.tab_ad_filter = ((Builder)integer).tab_ad_filter;
    } 
  }
  
  public static final class Builder extends Message.Builder<AdFilter> {
    public Integer banner_ad_filter;
    
    public Integer comment_ad_filter;
    
    public Integer tab_ad_filter;
    
    public Builder() {}
    
    public Builder(AdFilter param1AdFilter) {
      super(param1AdFilter);
      if (param1AdFilter == null)
        return; 
      this.banner_ad_filter = param1AdFilter.banner_ad_filter;
      this.comment_ad_filter = param1AdFilter.comment_ad_filter;
      this.tab_ad_filter = param1AdFilter.tab_ad_filter;
    }
    
    public AdFilter build(boolean param1Boolean) {
      return new AdFilter(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
