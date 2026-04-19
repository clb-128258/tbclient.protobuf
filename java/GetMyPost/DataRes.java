package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static final String DEFAULT_PARTIAL_VISIBLE_TOAST = "";
  
  @ProtoField(tag = 4)
  public final PageData page_data;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String partial_visible_toast;
  
  @ProtoField(tag = 2)
  public final ThreadInfo thread_info;
  
  @ProtoField(tag = 1)
  public final User_Info user_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.user_info = paramBuilder.user_info;
      this.thread_info = paramBuilder.thread_info;
      String str = paramBuilder.partial_visible_toast;
      if (str == null) {
        this.partial_visible_toast = "";
      } else {
        this.partial_visible_toast = str;
      } 
      this.page_data = paramBuilder.page_data;
    } else {
      this.user_info = paramBuilder.user_info;
      this.thread_info = paramBuilder.thread_info;
      this.partial_visible_toast = paramBuilder.partial_visible_toast;
      this.page_data = paramBuilder.page_data;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public PageData page_data;
    
    public String partial_visible_toast;
    
    public ThreadInfo thread_info;
    
    public User_Info user_info;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.user_info = param1DataRes.user_info;
      this.thread_info = param1DataRes.thread_info;
      this.partial_visible_toast = param1DataRes.partial_visible_toast;
      this.page_data = param1DataRes.page_data;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
