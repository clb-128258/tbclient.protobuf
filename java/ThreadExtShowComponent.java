package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ThreadExtShowComponent extends Message {
  public static final List<String> DEFAULT_IMG_URLS = Collections.emptyList();
  
  public static final Boolean DEFAULT_IS_PIC_THREAD;
  
  public static final List<LayoutManageInfo> DEFAULT_MANAGE_LIST = Collections.emptyList();
  
  public static final String DEFAULT_TEXT_INFO = "";
  
  @ProtoField(tag = 3)
  public final FeedHeadSymbol extra_data;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
  public final List<String> img_urls;
  
  @ProtoField(tag = 5, type = Message.Datatype.BOOL)
  public final Boolean is_pic_thread;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<LayoutManageInfo> manage_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text_info;
  
  static {
    DEFAULT_IS_PIC_THREAD = Boolean.FALSE;
  }
  
  public ThreadExtShowComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Boolean bool;
    if (paramBoolean == true) {
      List<String> list1 = paramBuilder.img_urls;
      if (list1 == null) {
        this.img_urls = DEFAULT_IMG_URLS;
      } else {
        this.img_urls = Message.immutableCopyOf(list1);
      } 
      String str = paramBuilder.text_info;
      if (str == null) {
        this.text_info = "";
      } else {
        this.text_info = str;
      } 
      this.extra_data = paramBuilder.extra_data;
      List<LayoutManageInfo> list = paramBuilder.manage_list;
      if (list == null) {
        this.manage_list = DEFAULT_MANAGE_LIST;
      } else {
        this.manage_list = Message.immutableCopyOf(list);
      } 
      bool = paramBuilder.is_pic_thread;
      if (bool == null) {
        this.is_pic_thread = DEFAULT_IS_PIC_THREAD;
      } else {
        this.is_pic_thread = bool;
      } 
    } else {
      this.img_urls = Message.immutableCopyOf(((Builder)bool).img_urls);
      this.text_info = ((Builder)bool).text_info;
      this.extra_data = ((Builder)bool).extra_data;
      this.manage_list = Message.immutableCopyOf(((Builder)bool).manage_list);
      this.is_pic_thread = ((Builder)bool).is_pic_thread;
    } 
  }
  
  public static final class Builder extends Message.Builder<ThreadExtShowComponent> {
    public FeedHeadSymbol extra_data;
    
    public List<String> img_urls;
    
    public Boolean is_pic_thread;
    
    public List<LayoutManageInfo> manage_list;
    
    public String text_info;
    
    public Builder() {}
    
    public Builder(ThreadExtShowComponent param1ThreadExtShowComponent) {
      super(param1ThreadExtShowComponent);
      if (param1ThreadExtShowComponent == null)
        return; 
      this.img_urls = Message.copyOf(param1ThreadExtShowComponent.img_urls);
      this.text_info = param1ThreadExtShowComponent.text_info;
      this.extra_data = param1ThreadExtShowComponent.extra_data;
      this.manage_list = Message.copyOf(param1ThreadExtShowComponent.manage_list);
      this.is_pic_thread = param1ThreadExtShowComponent.is_pic_thread;
    }
    
    public ThreadExtShowComponent build(boolean param1Boolean) {
      return new ThreadExtShowComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
