package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedUserFold extends Message {
  public static final Integer DEFAULT_EXPAND_NUM;
  
  public static final List<Long> DEFAULT_FOLD_TID_LIST = Collections.emptyList();
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer expand_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.INT64)
  public final List<Long> fold_tid_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  static {
    DEFAULT_EXPAND_NUM = Integer.valueOf(0);
  }
  
  public FeedUserFold(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      List<Long> list = paramBuilder.fold_tid_list;
      if (list == null) {
        this.fold_tid_list = DEFAULT_FOLD_TID_LIST;
      } else {
        this.fold_tid_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.expand_num;
      if (integer == null) {
        this.expand_num = DEFAULT_EXPAND_NUM;
      } else {
        this.expand_num = integer;
      } 
    } else {
      this.text = ((Builder)integer).text;
      this.fold_tid_list = Message.immutableCopyOf(((Builder)integer).fold_tid_list);
      this.expand_num = ((Builder)integer).expand_num;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedUserFold> {
    public Integer expand_num;
    
    public List<Long> fold_tid_list;
    
    public String text;
    
    public Builder() {}
    
    public Builder(FeedUserFold param1FeedUserFold) {
      super(param1FeedUserFold);
      if (param1FeedUserFold == null)
        return; 
      this.text = param1FeedUserFold.text;
      this.fold_tid_list = Message.copyOf(param1FeedUserFold.fold_tid_list);
      this.expand_num = param1FeedUserFold.expand_num;
    }
    
    public FeedUserFold build(boolean param1Boolean) {
      return new FeedUserFold(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
