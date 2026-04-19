package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ChooseThreadList extends Message {
  public static final Long DEFAULT_TID = Long.valueOf(0L);
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public ChooseThreadList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
    } else {
      this.tid = ((Builder)str).tid;
      this.title = ((Builder)str).title;
    } 
  }
  
  public static final class Builder extends Message.Builder<ChooseThreadList> {
    public Long tid;
    
    public String title;
    
    public Builder() {}
    
    public Builder(ChooseThreadList param1ChooseThreadList) {
      super(param1ChooseThreadList);
      if (param1ChooseThreadList == null)
        return; 
      this.tid = param1ChooseThreadList.tid;
      this.title = param1ChooseThreadList.title;
    }
    
    public ChooseThreadList build(boolean param1Boolean) {
      return new ChooseThreadList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
