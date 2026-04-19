package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FrsRainInfo extends Message {
  public static final String DEFAULT_BUSINESS_ID = "";
  
  public static final String DEFAULT_POPUP_INFO_STR = "";
  
  public static final String DEFAULT_POPUP_URL = "";
  
  public static final String DEFAULT_REPORT_INFO = "";
  
  public static final String DEFAULT_RESOURCE = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String business_id;
  
  @ProtoField(tag = 3)
  public final FrsRanPopupInfo popup_info;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String popup_info_str;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String popup_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String report_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String resource;
  
  public FrsRainInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.resource;
      if (str1 == null) {
        this.resource = "";
      } else {
        this.resource = str1;
      } 
      str1 = paramBuilder.popup_url;
      if (str1 == null) {
        this.popup_url = "";
      } else {
        this.popup_url = str1;
      } 
      this.popup_info = paramBuilder.popup_info;
      str1 = paramBuilder.business_id;
      if (str1 == null) {
        this.business_id = "";
      } else {
        this.business_id = str1;
      } 
      str1 = paramBuilder.report_info;
      if (str1 == null) {
        this.report_info = "";
      } else {
        this.report_info = str1;
      } 
      str = paramBuilder.popup_info_str;
      if (str == null) {
        this.popup_info_str = "";
      } else {
        this.popup_info_str = str;
      } 
    } else {
      this.resource = ((Builder)str).resource;
      this.popup_url = ((Builder)str).popup_url;
      this.popup_info = ((Builder)str).popup_info;
      this.business_id = ((Builder)str).business_id;
      this.report_info = ((Builder)str).report_info;
      this.popup_info_str = ((Builder)str).popup_info_str;
    } 
  }
  
  public static final class Builder extends Message.Builder<FrsRainInfo> {
    public String business_id;
    
    public FrsRanPopupInfo popup_info;
    
    public String popup_info_str;
    
    public String popup_url;
    
    public String report_info;
    
    public String resource;
    
    public Builder() {}
    
    public Builder(FrsRainInfo param1FrsRainInfo) {
      super(param1FrsRainInfo);
      if (param1FrsRainInfo == null)
        return; 
      this.resource = param1FrsRainInfo.resource;
      this.popup_url = param1FrsRainInfo.popup_url;
      this.popup_info = param1FrsRainInfo.popup_info;
      this.business_id = param1FrsRainInfo.business_id;
      this.report_info = param1FrsRainInfo.report_info;
      this.popup_info_str = param1FrsRainInfo.popup_info_str;
    }
    
    public FrsRainInfo build(boolean param1Boolean) {
      return new FrsRainInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
