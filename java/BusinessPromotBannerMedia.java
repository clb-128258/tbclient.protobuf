package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BusinessPromotBannerMedia extends Message {
  public static final String DEFAULT_RESOURCE_URL = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String resource_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer type;
  
  public BusinessPromotBannerMedia(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      str = paramBuilder.resource_url;
      if (str == null) {
        this.resource_url = "";
      } else {
        this.resource_url = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.resource_url = ((Builder)str).resource_url;
    } 
  }
  
  public static final class Builder extends Message.Builder<BusinessPromotBannerMedia> {
    public String resource_url;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(BusinessPromotBannerMedia param1BusinessPromotBannerMedia) {
      super(param1BusinessPromotBannerMedia);
      if (param1BusinessPromotBannerMedia == null)
        return; 
      this.type = param1BusinessPromotBannerMedia.type;
      this.resource_url = param1BusinessPromotBannerMedia.resource_url;
    }
    
    public BusinessPromotBannerMedia build(boolean param1Boolean) {
      return new BusinessPromotBannerMedia(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
