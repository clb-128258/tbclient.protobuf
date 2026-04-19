package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class OfficialRewardInfo extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  public OfficialRewardInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
    } else {
      this.icon = ((Builder)str).icon;
      this.name = ((Builder)str).name;
    } 
  }
  
  public static final class Builder extends Message.Builder<OfficialRewardInfo> {
    public String icon;
    
    public String name;
    
    public Builder() {}
    
    public Builder(OfficialRewardInfo param1OfficialRewardInfo) {
      super(param1OfficialRewardInfo);
      if (param1OfficialRewardInfo == null)
        return; 
      this.icon = param1OfficialRewardInfo.icon;
      this.name = param1OfficialRewardInfo.name;
    }
    
    public OfficialRewardInfo build(boolean param1Boolean) {
      return new OfficialRewardInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
