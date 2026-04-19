package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FrsBottomActivityBase extends Message {
  public static final List<FrsBottomActivity> DEFAULT_ACTIVITY_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FrsBottomActivity> activity_list;
  
  public FrsBottomActivityBase(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FrsBottomActivity> list;
    if (paramBoolean == true) {
      list = paramBuilder.activity_list;
      if (list == null) {
        this.activity_list = DEFAULT_ACTIVITY_LIST;
      } else {
        this.activity_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.activity_list = Message.immutableCopyOf(((Builder)list).activity_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<FrsBottomActivityBase> {
    public List<FrsBottomActivity> activity_list;
    
    public Builder() {}
    
    public Builder(FrsBottomActivityBase param1FrsBottomActivityBase) {
      super(param1FrsBottomActivityBase);
      if (param1FrsBottomActivityBase == null)
        return; 
      this.activity_list = Message.copyOf(param1FrsBottomActivityBase.activity_list);
    }
    
    public FrsBottomActivityBase build(boolean param1Boolean) {
      return new FrsBottomActivityBase(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
