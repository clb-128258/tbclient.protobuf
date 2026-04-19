package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class AdAuditInfo extends Message {
  public static final List<MaterialAuditStatus> DEFAULT_MATERIALS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<MaterialAuditStatus> materials;
  
  public AdAuditInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<MaterialAuditStatus> list;
    if (paramBoolean == true) {
      list = paramBuilder.materials;
      if (list == null) {
        this.materials = DEFAULT_MATERIALS;
      } else {
        this.materials = Message.immutableCopyOf(list);
      } 
    } else {
      this.materials = Message.immutableCopyOf(((Builder)list).materials);
    } 
  }
  
  public static final class Builder extends Message.Builder<AdAuditInfo> {
    public List<MaterialAuditStatus> materials;
    
    public Builder() {}
    
    public Builder(AdAuditInfo param1AdAuditInfo) {
      super(param1AdAuditInfo);
      if (param1AdAuditInfo == null)
        return; 
      this.materials = Message.copyOf(param1AdAuditInfo.materials);
    }
    
    public AdAuditInfo build(boolean param1Boolean) {
      return new AdAuditInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
