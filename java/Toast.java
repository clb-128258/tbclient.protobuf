package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Toast extends Message {
  public static final String DEFAULT_BACKGROUND = "";
  
  public static final String DEFAULT_BACKGROUND_DARK = "";
  
  public static final List<ToastContent> DEFAULT_CONTENT;
  
  public static final Integer DEFAULT_DELAY_TIME;
  
  public static final Integer DEFAULT_DURATION;
  
  public static final Integer DEFAULT_HUD_WIDTH;
  
  public static final Integer DEFAULT_ICON_HEIGHT;
  
  public static final Integer DEFAULT_ICON_TYPE;
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_ICON_URL_DARK = "";
  
  public static final Integer DEFAULT_ICON_WIDTH;
  
  public static final Integer DEFAULT_IS_LIMIT_PAGE;
  
  public static final Integer DEFAULT_LOCATE;
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final List<ToastContent> DEFAULT_SUB_CONTENT;
  
  public static final List<Integer> DEFAULT_TASK_IDS;
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String background;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String background_dark;
  
  @ProtoField(tag = 17)
  public final JumpText button_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ToastContent> content;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer delay_time;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT32)
  public final Integer duration;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer hud_width;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer icon_height;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer icon_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String icon_url_dark;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer icon_width;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer is_limit_page;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer locate;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 18)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 14)
  public final List<ToastContent> sub_content;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7, type = Message.Datatype.INT32)
  public final List<Integer> task_ids;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ICON_TYPE = integer;
    DEFAULT_CONTENT = Collections.emptyList();
    DEFAULT_TASK_IDS = Collections.emptyList();
    DEFAULT_ICON_WIDTH = integer;
    DEFAULT_ICON_HEIGHT = integer;
    DEFAULT_HUD_WIDTH = integer;
    DEFAULT_IS_LIMIT_PAGE = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_SUB_CONTENT = Collections.emptyList();
    DEFAULT_DELAY_TIME = integer;
    DEFAULT_LOCATE = integer;
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_DURATION = integer;
  }
  
  public Toast(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer5 = paramBuilder.icon_type;
      if (integer5 == null) {
        this.icon_type = DEFAULT_ICON_TYPE;
      } else {
        this.icon_type = integer5;
      } 
      List<ToastContent> list3 = paramBuilder.content;
      if (list3 == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list3);
      } 
      String str2 = paramBuilder.url;
      if (str2 == null) {
        this.url = "";
      } else {
        this.url = str2;
      } 
      str2 = paramBuilder.background;
      if (str2 == null) {
        this.background = "";
      } else {
        this.background = str2;
      } 
      str2 = paramBuilder.icon_url;
      if (str2 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str2;
      } 
      str2 = paramBuilder.icon_url_dark;
      if (str2 == null) {
        this.icon_url_dark = "";
      } else {
        this.icon_url_dark = str2;
      } 
      List<Integer> list2 = paramBuilder.task_ids;
      if (list2 == null) {
        this.task_ids = DEFAULT_TASK_IDS;
      } else {
        this.task_ids = Message.immutableCopyOf(list2);
      } 
      Integer integer4 = paramBuilder.icon_width;
      if (integer4 == null) {
        this.icon_width = DEFAULT_ICON_WIDTH;
      } else {
        this.icon_width = integer4;
      } 
      integer4 = paramBuilder.icon_height;
      if (integer4 == null) {
        this.icon_height = DEFAULT_ICON_HEIGHT;
      } else {
        this.icon_height = integer4;
      } 
      integer4 = paramBuilder.hud_width;
      if (integer4 == null) {
        this.hud_width = DEFAULT_HUD_WIDTH;
      } else {
        this.hud_width = integer4;
      } 
      String str1 = paramBuilder.scheme;
      if (str1 == null) {
        this.scheme = "";
      } else {
        this.scheme = str1;
      } 
      Integer integer3 = paramBuilder.is_limit_page;
      if (integer3 == null) {
        this.is_limit_page = DEFAULT_IS_LIMIT_PAGE;
      } else {
        this.is_limit_page = integer3;
      } 
      integer3 = paramBuilder.type;
      if (integer3 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer3;
      } 
      List<ToastContent> list1 = paramBuilder.sub_content;
      if (list1 == null) {
        this.sub_content = DEFAULT_SUB_CONTENT;
      } else {
        this.sub_content = Message.immutableCopyOf(list1);
      } 
      Integer integer2 = paramBuilder.delay_time;
      if (integer2 == null) {
        this.delay_time = DEFAULT_DELAY_TIME;
      } else {
        this.delay_time = integer2;
      } 
      integer2 = paramBuilder.locate;
      if (integer2 == null) {
        this.locate = DEFAULT_LOCATE;
      } else {
        this.locate = integer2;
      } 
      this.button_info = paramBuilder.button_info;
      List<FeedKV> list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.duration;
      if (integer1 == null) {
        this.duration = DEFAULT_DURATION;
      } else {
        this.duration = integer1;
      } 
      str = paramBuilder.background_dark;
      if (str == null) {
        this.background_dark = "";
      } else {
        this.background_dark = str;
      } 
    } else {
      this.icon_type = ((Builder)str).icon_type;
      this.content = Message.immutableCopyOf(((Builder)str).content);
      this.url = ((Builder)str).url;
      this.background = ((Builder)str).background;
      this.icon_url = ((Builder)str).icon_url;
      this.icon_url_dark = ((Builder)str).icon_url_dark;
      this.task_ids = Message.immutableCopyOf(((Builder)str).task_ids);
      this.icon_width = ((Builder)str).icon_width;
      this.icon_height = ((Builder)str).icon_height;
      this.hud_width = ((Builder)str).hud_width;
      this.scheme = ((Builder)str).scheme;
      this.is_limit_page = ((Builder)str).is_limit_page;
      this.type = ((Builder)str).type;
      this.sub_content = Message.immutableCopyOf(((Builder)str).sub_content);
      this.delay_time = ((Builder)str).delay_time;
      this.locate = ((Builder)str).locate;
      this.button_info = ((Builder)str).button_info;
      this.log_param = Message.immutableCopyOf(((Builder)str).log_param);
      this.duration = ((Builder)str).duration;
      this.background_dark = ((Builder)str).background_dark;
    } 
  }
  
  public static final class Builder extends Message.Builder<Toast> {
    public String background;
    
    public String background_dark;
    
    public JumpText button_info;
    
    public List<ToastContent> content;
    
    public Integer delay_time;
    
    public Integer duration;
    
    public Integer hud_width;
    
    public Integer icon_height;
    
    public Integer icon_type;
    
    public String icon_url;
    
    public String icon_url_dark;
    
    public Integer icon_width;
    
    public Integer is_limit_page;
    
    public Integer locate;
    
    public List<FeedKV> log_param;
    
    public String scheme;
    
    public List<ToastContent> sub_content;
    
    public List<Integer> task_ids;
    
    public Integer type;
    
    public String url;
    
    public Builder() {}
    
    public Builder(Toast param1Toast) {
      super(param1Toast);
      if (param1Toast == null)
        return; 
      this.icon_type = param1Toast.icon_type;
      this.content = Message.copyOf(param1Toast.content);
      this.url = param1Toast.url;
      this.background = param1Toast.background;
      this.icon_url = param1Toast.icon_url;
      this.icon_url_dark = param1Toast.icon_url_dark;
      this.task_ids = Message.copyOf(param1Toast.task_ids);
      this.icon_width = param1Toast.icon_width;
      this.icon_height = param1Toast.icon_height;
      this.hud_width = param1Toast.hud_width;
      this.scheme = param1Toast.scheme;
      this.is_limit_page = param1Toast.is_limit_page;
      this.type = param1Toast.type;
      this.sub_content = Message.copyOf(param1Toast.sub_content);
      this.delay_time = param1Toast.delay_time;
      this.locate = param1Toast.locate;
      this.button_info = param1Toast.button_info;
      this.log_param = Message.copyOf(param1Toast.log_param);
      this.duration = param1Toast.duration;
      this.background_dark = param1Toast.background_dark;
    }
    
    public Toast build(boolean param1Boolean) {
      return new Toast(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
