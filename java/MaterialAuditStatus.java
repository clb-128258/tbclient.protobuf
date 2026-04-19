package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MaterialAuditStatus extends Message {
  public static final Integer DEFAULT_AUDIT_STATUS = Integer.valueOf(0);
  
  public static final Long DEFAULT_AUDIT_TIME = Long.valueOf(0L);
  
  public static final String DEFAULT_ID = "";
  
  public static final String DEFAULT_REJECT_REASON = "";
  
  public static final String DEFAULT_SID = "";
  
  public static final String DEFAULT_SOURCE = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer audit_status;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long audit_time;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String reject_reason;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String sid;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String source;
  
  public MaterialAuditStatus(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str2 = paramBuilder.source;
      if (str2 == null) {
        this.source = "";
      } else {
        this.source = str2;
      } 
      str2 = paramBuilder.id;
      if (str2 == null) {
        this.id = "";
      } else {
        this.id = str2;
      } 
      str2 = paramBuilder.sid;
      if (str2 == null) {
        this.sid = "";
      } else {
        this.sid = str2;
      } 
      Integer integer = paramBuilder.audit_status;
      if (integer == null) {
        this.audit_status = DEFAULT_AUDIT_STATUS;
      } else {
        this.audit_status = integer;
      } 
      String str1 = paramBuilder.reject_reason;
      if (str1 == null) {
        this.reject_reason = "";
      } else {
        this.reject_reason = str1;
      } 
      long_ = paramBuilder.audit_time;
      if (long_ == null) {
        this.audit_time = DEFAULT_AUDIT_TIME;
      } else {
        this.audit_time = long_;
      } 
    } else {
      this.source = ((Builder)long_).source;
      this.id = ((Builder)long_).id;
      this.sid = ((Builder)long_).sid;
      this.audit_status = ((Builder)long_).audit_status;
      this.reject_reason = ((Builder)long_).reject_reason;
      this.audit_time = ((Builder)long_).audit_time;
    } 
  }
  
  public static final class Builder extends Message.Builder<MaterialAuditStatus> {
    public Integer audit_status;
    
    public Long audit_time;
    
    public String id;
    
    public String reject_reason;
    
    public String sid;
    
    public String source;
    
    public Builder() {}
    
    public Builder(MaterialAuditStatus param1MaterialAuditStatus) {
      super(param1MaterialAuditStatus);
      if (param1MaterialAuditStatus == null)
        return; 
      this.source = param1MaterialAuditStatus.source;
      this.id = param1MaterialAuditStatus.id;
      this.sid = param1MaterialAuditStatus.sid;
      this.audit_status = param1MaterialAuditStatus.audit_status;
      this.reject_reason = param1MaterialAuditStatus.reject_reason;
      this.audit_time = param1MaterialAuditStatus.audit_time;
    }
    
    public MaterialAuditStatus build(boolean param1Boolean) {
      return new MaterialAuditStatus(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
