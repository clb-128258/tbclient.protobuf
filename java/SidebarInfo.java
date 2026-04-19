package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SidebarInfo extends Message {
  public static final String DEFAULT_REC_TXT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String rec_txt;
  
  public SidebarInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.rec_txt;
      if (str == null) {
        this.rec_txt = "";
      } else {
        this.rec_txt = str;
      } 
    } else {
      this.rec_txt = ((Builder)str).rec_txt;
    } 
  }
  
  public static final class Builder extends Message.Builder<SidebarInfo> {
    public String rec_txt;
    
    public Builder() {}
    
    public Builder(SidebarInfo param1SidebarInfo) {
      super(param1SidebarInfo);
      if (param1SidebarInfo == null)
        return; 
      this.rec_txt = param1SidebarInfo.rec_txt;
    }
    
    public SidebarInfo build(boolean param1Boolean) {
      return new SidebarInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
