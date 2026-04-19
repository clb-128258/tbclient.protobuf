package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DislikeInfo extends Message {
  public static final Integer DEFAULT_DISLIKE_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_DISLIKE_REASON = "";
  
  public static final String DEFAULT_EXTRA = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer dislike_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String dislike_reason;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String extra;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 5)
  public final Toast toast;
  
  public DislikeInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str2 = paramBuilder.dislike_reason;
      if (str2 == null) {
        this.dislike_reason = "";
      } else {
        this.dislike_reason = str2;
      } 
      Integer integer = paramBuilder.dislike_id;
      if (integer == null) {
        this.dislike_id = DEFAULT_DISLIKE_ID;
      } else {
        this.dislike_id = integer;
      } 
      String str1 = paramBuilder.extra;
      if (str1 == null) {
        this.extra = "";
      } else {
        this.extra = str1;
      } 
      str1 = paramBuilder.schema;
      if (str1 == null) {
        this.schema = "";
      } else {
        this.schema = str1;
      } 
      this.toast = paramBuilder.toast;
    } else {
      this.dislike_reason = paramBuilder.dislike_reason;
      this.dislike_id = paramBuilder.dislike_id;
      this.extra = paramBuilder.extra;
      this.schema = paramBuilder.schema;
      this.toast = paramBuilder.toast;
    } 
  }
  
  public static final class Builder extends Message.Builder<DislikeInfo> {
    public Integer dislike_id;
    
    public String dislike_reason;
    
    public String extra;
    
    public String schema;
    
    public Toast toast;
    
    public Builder() {}
    
    public Builder(DislikeInfo param1DislikeInfo) {
      super(param1DislikeInfo);
      if (param1DislikeInfo == null)
        return; 
      this.dislike_reason = param1DislikeInfo.dislike_reason;
      this.dislike_id = param1DislikeInfo.dislike_id;
      this.extra = param1DislikeInfo.extra;
      this.schema = param1DislikeInfo.schema;
      this.toast = param1DislikeInfo.toast;
    }
    
    public DislikeInfo build(boolean param1Boolean) {
      return new DislikeInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
