package tbclient.ReplyMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ChooseThreadList;
import tbclient.ChooseTimeList;
import tbclient.Page;

public final class DataRes extends Message {
  public static final List<ChooseThreadList> DEFAULT_CHOOSE_THREAD_LIST;
  
  public static final List<ChooseTimeList> DEFAULT_CHOOSE_TIME_LIST;
  
  public static final List<ReplyList> DEFAULT_REPLY_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ChooseThreadList> choose_thread_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<ChooseTimeList> choose_time_list;
  
  @ProtoField(tag = 1)
  public final Page page;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ReplyList> reply_list;
  
  static {
    DEFAULT_CHOOSE_THREAD_LIST = Collections.emptyList();
    DEFAULT_CHOOSE_TIME_LIST = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ChooseTimeList> list;
    if (paramBoolean == true) {
      this.page = paramBuilder.page;
      List<ReplyList> list2 = paramBuilder.reply_list;
      if (list2 == null) {
        this.reply_list = DEFAULT_REPLY_LIST;
      } else {
        this.reply_list = Message.immutableCopyOf(list2);
      } 
      List<ChooseThreadList> list1 = paramBuilder.choose_thread_list;
      if (list1 == null) {
        this.choose_thread_list = DEFAULT_CHOOSE_THREAD_LIST;
      } else {
        this.choose_thread_list = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.choose_time_list;
      if (list == null) {
        this.choose_time_list = DEFAULT_CHOOSE_TIME_LIST;
      } else {
        this.choose_time_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.page = ((Builder)list).page;
      this.reply_list = Message.immutableCopyOf(((Builder)list).reply_list);
      this.choose_thread_list = Message.immutableCopyOf(((Builder)list).choose_thread_list);
      this.choose_time_list = Message.immutableCopyOf(((Builder)list).choose_time_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<ChooseThreadList> choose_thread_list;
    
    public List<ChooseTimeList> choose_time_list;
    
    public Page page;
    
    public List<ReplyList> reply_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.page = param1DataRes.page;
      this.reply_list = Message.copyOf(param1DataRes.reply_list);
      this.choose_thread_list = Message.copyOf(param1DataRes.choose_thread_list);
      this.choose_time_list = Message.copyOf(param1DataRes.choose_time_list);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
