package tbclient.GetFeedAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppTransmitData;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_AD_CONTEXT_LIST = "";
  
  public static final String DEFAULT_AD_EXT_PARAMS = "";
  
  public static final String DEFAULT_AD_PLACE = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String ad_context_list;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String ad_ext_params;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String ad_place;
  
  @ProtoField(tag = 2)
  public final AppTransmitData app_transmit_data;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      this.app_transmit_data = paramBuilder.app_transmit_data;
      String str1 = paramBuilder.ad_place;
      if (str1 == null) {
        this.ad_place = "";
      } else {
        this.ad_place = str1;
      } 
      str1 = paramBuilder.ad_ext_params;
      if (str1 == null) {
        this.ad_ext_params = "";
      } else {
        this.ad_ext_params = str1;
      } 
      str = paramBuilder.ad_context_list;
      if (str == null) {
        this.ad_context_list = "";
      } else {
        this.ad_context_list = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.app_transmit_data = ((Builder)str).app_transmit_data;
      this.ad_place = ((Builder)str).ad_place;
      this.ad_ext_params = ((Builder)str).ad_ext_params;
      this.ad_context_list = ((Builder)str).ad_context_list;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public String ad_context_list;
    
    public String ad_ext_params;
    
    public String ad_place;
    
    public AppTransmitData app_transmit_data;
    
    public CommonReq common;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.app_transmit_data = param1DataReq.app_transmit_data;
      this.ad_place = param1DataReq.ad_place;
      this.ad_ext_params = param1DataReq.ad_ext_params;
      this.ad_context_list = param1DataReq.ad_context_list;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
