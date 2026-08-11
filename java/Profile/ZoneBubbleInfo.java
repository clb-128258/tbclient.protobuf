package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ZoneBubbleInfo extends Message {
  public static final String DEFAULT_ITEM_NAME = "";
  
  public static final String DEFAULT_ITEM_TEXT = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final Long DEFAULT_TASK_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_TASK_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String item_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String item_text;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long task_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer task_type;
  
  public ZoneBubbleInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.item_name;
      if (str == null) {
        this.item_name = "";
      } else {
        this.item_name = str;
      } 
      str = paramBuilder.item_text;
      if (str == null) {
        this.item_text = "";
      } else {
        this.item_text = str;
      } 
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      Long long_ = paramBuilder.task_id;
      if (long_ == null) {
        this.task_id = DEFAULT_TASK_ID;
      } else {
        this.task_id = long_;
      } 
      integer = paramBuilder.task_type;
      if (integer == null) {
        this.task_type = DEFAULT_TASK_TYPE;
      } else {
        this.task_type = integer;
      } 
    } else {
      this.item_name = ((Builder)integer).item_name;
      this.item_text = ((Builder)integer).item_text;
      this.schema = ((Builder)integer).schema;
      this.task_id = ((Builder)integer).task_id;
      this.task_type = ((Builder)integer).task_type;
    } 
  }
  
  public static final class Builder extends Message.Builder<ZoneBubbleInfo> {
    public String item_name;
    
    public String item_text;
    
    public String schema;
    
    public Long task_id;
    
    public Integer task_type;
    
    public Builder() {}
    
    public Builder(ZoneBubbleInfo param1ZoneBubbleInfo) {
      super(param1ZoneBubbleInfo);
      if (param1ZoneBubbleInfo == null)
        return; 
      this.item_name = param1ZoneBubbleInfo.item_name;
      this.item_text = param1ZoneBubbleInfo.item_text;
      this.schema = param1ZoneBubbleInfo.schema;
      this.task_id = param1ZoneBubbleInfo.task_id;
      this.task_type = param1ZoneBubbleInfo.task_type;
    }
    
    public ZoneBubbleInfo build(boolean param1Boolean) {
      return new ZoneBubbleInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
