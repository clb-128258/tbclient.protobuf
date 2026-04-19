package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LiveAdData extends Message {
  @ProtoField(tag = 2)
  public final BusinessMix business_mix;
  
  @ProtoField(tag = 1)
  public final AlaLiveInfo recom_ala_info;
  
  public LiveAdData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.recom_ala_info = paramBuilder.recom_ala_info;
      this.business_mix = paramBuilder.business_mix;
    } else {
      this.recom_ala_info = paramBuilder.recom_ala_info;
      this.business_mix = paramBuilder.business_mix;
    } 
  }
  
  public static final class Builder extends Message.Builder<LiveAdData> {
    public BusinessMix business_mix;
    
    public AlaLiveInfo recom_ala_info;
    
    public Builder() {}
    
    public Builder(LiveAdData param1LiveAdData) {
      super(param1LiveAdData);
      if (param1LiveAdData == null)
        return; 
      this.recom_ala_info = param1LiveAdData.recom_ala_info;
      this.business_mix = param1LiveAdData.business_mix;
    }
    
    public LiveAdData build(boolean param1Boolean) {
      return new LiveAdData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
