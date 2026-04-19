package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ChooseTimeList extends Message {
  public static final Long DEFAULT_TIME = Long.valueOf(0L);
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long time;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public ChooseTimeList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.time;
      if (long_ == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = long_;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
    } else {
      this.time = ((Builder)str).time;
      this.title = ((Builder)str).title;
    } 
  }
  
  public static final class Builder extends Message.Builder<ChooseTimeList> {
    public Long time;
    
    public String title;
    
    public Builder() {}
    
    public Builder(ChooseTimeList param1ChooseTimeList) {
      super(param1ChooseTimeList);
      if (param1ChooseTimeList == null)
        return; 
      this.time = param1ChooseTimeList.time;
      this.title = param1ChooseTimeList.title;
    }
    
    public ChooseTimeList build(boolean param1Boolean) {
      return new ChooseTimeList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
