package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class AuxiliaryAllTools extends Message {
  public static final String DEFAULT_CLASS = "";
  
  public static final List<AuxiliaryToolsInfo> DEFAULT_TOOLS = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String _class;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<AuxiliaryToolsInfo> tools;
  
  public AuxiliaryAllTools(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<AuxiliaryToolsInfo> list = paramBuilder.tools;
      if (list == null) {
        this.tools = DEFAULT_TOOLS;
      } else {
        this.tools = Message.immutableCopyOf(list);
      } 
      str = paramBuilder._class;
      if (str == null) {
        this._class = "";
      } else {
        this._class = str;
      } 
    } else {
      this.tools = Message.immutableCopyOf(((Builder)str).tools);
      this._class = ((Builder)str)._class;
    } 
  }
  
  public static final class Builder extends Message.Builder<AuxiliaryAllTools> {
    public String _class;
    
    public List<AuxiliaryToolsInfo> tools;
    
    public Builder() {}
    
    public Builder(AuxiliaryAllTools param1AuxiliaryAllTools) {
      super(param1AuxiliaryAllTools);
      if (param1AuxiliaryAllTools == null)
        return; 
      this.tools = Message.copyOf(param1AuxiliaryAllTools.tools);
      this._class = param1AuxiliaryAllTools._class;
    }
    
    public AuxiliaryAllTools build(boolean param1Boolean) {
      return new AuxiliaryAllTools(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
