package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class SettingInfo extends Message {
  public static final List<SettingInfoIcon> DEFAULT_ICON_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_NEED_FONT_SLICER = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<SettingInfoIcon> icon_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer need_font_slicer;
  
  public SettingInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<SettingInfoIcon> list = paramBuilder.icon_list;
      if (list == null) {
        this.icon_list = DEFAULT_ICON_LIST;
      } else {
        this.icon_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.need_font_slicer;
      if (integer == null) {
        this.need_font_slicer = DEFAULT_NEED_FONT_SLICER;
      } else {
        this.need_font_slicer = integer;
      } 
    } else {
      this.icon_list = Message.immutableCopyOf(((Builder)integer).icon_list);
      this.need_font_slicer = ((Builder)integer).need_font_slicer;
    } 
  }
  
  public static final class Builder extends Message.Builder<SettingInfo> {
    public List<SettingInfoIcon> icon_list;
    
    public Integer need_font_slicer;
    
    public Builder() {}
    
    public Builder(SettingInfo param1SettingInfo) {
      super(param1SettingInfo);
      if (param1SettingInfo == null)
        return; 
      this.icon_list = Message.copyOf(param1SettingInfo.icon_list);
      this.need_font_slicer = param1SettingInfo.need_font_slicer;
    }
    
    public SettingInfo build(boolean param1Boolean) {
      return new SettingInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
