package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.NamoaixudEntry;

public final class ZoneInfo extends Message {
  public static final String DEFAULT_TYPE = "";
  
  @ProtoField(tag = 5)
  public final AuxiliaryFunc auxiliary_func;
  
  @ProtoField(tag = 4)
  public final ProfileBanner banner;
  
  @ProtoField(tag = 3)
  public final CommerceInfo commerce;
  
  @ProtoField(tag = 2)
  public final CommonFuncInfo common_func;
  
  @ProtoField(tag = 6)
  public final ProfileGameInfo game;
  
  @ProtoField(tag = 7)
  public final NamoaixudEntry namoaixud_entry;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String type;
  
  public ZoneInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.type;
      if (str == null) {
        this.type = "";
      } else {
        this.type = str;
      } 
      this.common_func = paramBuilder.common_func;
      this.commerce = paramBuilder.commerce;
      this.banner = paramBuilder.banner;
      this.auxiliary_func = paramBuilder.auxiliary_func;
      this.game = paramBuilder.game;
      this.namoaixud_entry = paramBuilder.namoaixud_entry;
    } else {
      this.type = paramBuilder.type;
      this.common_func = paramBuilder.common_func;
      this.commerce = paramBuilder.commerce;
      this.banner = paramBuilder.banner;
      this.auxiliary_func = paramBuilder.auxiliary_func;
      this.game = paramBuilder.game;
      this.namoaixud_entry = paramBuilder.namoaixud_entry;
    } 
  }
  
  public static final class Builder extends Message.Builder<ZoneInfo> {
    public AuxiliaryFunc auxiliary_func;
    
    public ProfileBanner banner;
    
    public CommerceInfo commerce;
    
    public CommonFuncInfo common_func;
    
    public ProfileGameInfo game;
    
    public NamoaixudEntry namoaixud_entry;
    
    public String type;
    
    public Builder() {}
    
    public Builder(ZoneInfo param1ZoneInfo) {
      super(param1ZoneInfo);
      if (param1ZoneInfo == null)
        return; 
      this.type = param1ZoneInfo.type;
      this.common_func = param1ZoneInfo.common_func;
      this.commerce = param1ZoneInfo.commerce;
      this.banner = param1ZoneInfo.banner;
      this.auxiliary_func = param1ZoneInfo.auxiliary_func;
      this.game = param1ZoneInfo.game;
      this.namoaixud_entry = param1ZoneInfo.namoaixud_entry;
    }
    
    public ZoneInfo build(boolean param1Boolean) {
      return new ZoneInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
