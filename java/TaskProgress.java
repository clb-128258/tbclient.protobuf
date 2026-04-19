package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TaskProgress extends Message {
  public static final Integer DEFAULT_CURRENT;
  
  public static final Integer DEFAULT_TOTAL;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer current;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer total;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TOTAL = integer;
    DEFAULT_CURRENT = integer;
  }
  
  public TaskProgress(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.total;
      if (integer1 == null) {
        this.total = DEFAULT_TOTAL;
      } else {
        this.total = integer1;
      } 
      integer = paramBuilder.current;
      if (integer == null) {
        this.current = DEFAULT_CURRENT;
      } else {
        this.current = integer;
      } 
    } else {
      this.total = ((Builder)integer).total;
      this.current = ((Builder)integer).current;
    } 
  }
  
  public static final class Builder extends Message.Builder<TaskProgress> {
    public Integer current;
    
    public Integer total;
    
    public Builder() {}
    
    public Builder(TaskProgress param1TaskProgress) {
      super(param1TaskProgress);
      if (param1TaskProgress == null)
        return; 
      this.total = param1TaskProgress.total;
      this.current = param1TaskProgress.current;
    }
    
    public TaskProgress build(boolean param1Boolean) {
      return new TaskProgress(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
