package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SidebarMsg extends Message {
  public static final Long DEFAULT_MEMBER_EXPIRED_TIME;
  
  public static final Boolean DEFAULT_MEMBER_HAS_EXPIRED = Boolean.FALSE;
  
  public static final String DEFAULT_MULTI_TASK_SIGN_DEFAULT_TEXT = "";
  
  public static final String DEFAULT_MULTI_TASK_SIGN_INTERVAL_SEC = "";
  
  public static final String DEFAULT_MULTI_TASK_SIGN_PROGRESS_TEXT = "";
  
  public static final Integer DEFAULT_MULTI_TASK_SIGN_REFRESH_TIME;
  
  public static final Integer DEFAULT_MULTI_TASK_SIGN_STATUS;
  
  public static final Integer DEFAULT_MULTI_TASK_SIGN_SWITCH;
  
  public static final Integer DEFAULT_TASK_PAGE_SIGN_STATUS;
  
  public static final String DEFAULT_VIPBANNER_BUBBLE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long member_expired_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.BOOL)
  public final Boolean member_has_expired;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String multi_task_sign_default_text;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String multi_task_sign_interval_sec;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String multi_task_sign_progress_text;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer multi_task_sign_refresh_time;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer multi_task_sign_status;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer multi_task_sign_switch;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer task_page_sign_status;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String vipbanner_bubble;
  
  static {
    DEFAULT_MEMBER_EXPIRED_TIME = Long.valueOf(0L);
    Integer integer = Integer.valueOf(0);
    DEFAULT_TASK_PAGE_SIGN_STATUS = integer;
    DEFAULT_MULTI_TASK_SIGN_STATUS = integer;
    DEFAULT_MULTI_TASK_SIGN_SWITCH = integer;
    DEFAULT_MULTI_TASK_SIGN_REFRESH_TIME = integer;
  }
  
  public SidebarMsg(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Boolean bool = paramBuilder.member_has_expired;
      if (bool == null) {
        this.member_has_expired = DEFAULT_MEMBER_HAS_EXPIRED;
      } else {
        this.member_has_expired = bool;
      } 
      String str2 = paramBuilder.vipbanner_bubble;
      if (str2 == null) {
        this.vipbanner_bubble = "";
      } else {
        this.vipbanner_bubble = str2;
      } 
      Long long_ = paramBuilder.member_expired_time;
      if (long_ == null) {
        this.member_expired_time = DEFAULT_MEMBER_EXPIRED_TIME;
      } else {
        this.member_expired_time = long_;
      } 
      Integer integer2 = paramBuilder.task_page_sign_status;
      if (integer2 == null) {
        this.task_page_sign_status = DEFAULT_TASK_PAGE_SIGN_STATUS;
      } else {
        this.task_page_sign_status = integer2;
      } 
      String str1 = paramBuilder.multi_task_sign_progress_text;
      if (str1 == null) {
        this.multi_task_sign_progress_text = "";
      } else {
        this.multi_task_sign_progress_text = str1;
      } 
      str1 = paramBuilder.multi_task_sign_interval_sec;
      if (str1 == null) {
        this.multi_task_sign_interval_sec = "";
      } else {
        this.multi_task_sign_interval_sec = str1;
      } 
      str1 = paramBuilder.multi_task_sign_default_text;
      if (str1 == null) {
        this.multi_task_sign_default_text = "";
      } else {
        this.multi_task_sign_default_text = str1;
      } 
      Integer integer1 = paramBuilder.multi_task_sign_status;
      if (integer1 == null) {
        this.multi_task_sign_status = DEFAULT_MULTI_TASK_SIGN_STATUS;
      } else {
        this.multi_task_sign_status = integer1;
      } 
      integer1 = paramBuilder.multi_task_sign_switch;
      if (integer1 == null) {
        this.multi_task_sign_switch = DEFAULT_MULTI_TASK_SIGN_SWITCH;
      } else {
        this.multi_task_sign_switch = integer1;
      } 
      integer = paramBuilder.multi_task_sign_refresh_time;
      if (integer == null) {
        this.multi_task_sign_refresh_time = DEFAULT_MULTI_TASK_SIGN_REFRESH_TIME;
      } else {
        this.multi_task_sign_refresh_time = integer;
      } 
    } else {
      this.member_has_expired = ((Builder)integer).member_has_expired;
      this.vipbanner_bubble = ((Builder)integer).vipbanner_bubble;
      this.member_expired_time = ((Builder)integer).member_expired_time;
      this.task_page_sign_status = ((Builder)integer).task_page_sign_status;
      this.multi_task_sign_progress_text = ((Builder)integer).multi_task_sign_progress_text;
      this.multi_task_sign_interval_sec = ((Builder)integer).multi_task_sign_interval_sec;
      this.multi_task_sign_default_text = ((Builder)integer).multi_task_sign_default_text;
      this.multi_task_sign_status = ((Builder)integer).multi_task_sign_status;
      this.multi_task_sign_switch = ((Builder)integer).multi_task_sign_switch;
      this.multi_task_sign_refresh_time = ((Builder)integer).multi_task_sign_refresh_time;
    } 
  }
  
  public static final class Builder extends Message.Builder<SidebarMsg> {
    public Long member_expired_time;
    
    public Boolean member_has_expired;
    
    public String multi_task_sign_default_text;
    
    public String multi_task_sign_interval_sec;
    
    public String multi_task_sign_progress_text;
    
    public Integer multi_task_sign_refresh_time;
    
    public Integer multi_task_sign_status;
    
    public Integer multi_task_sign_switch;
    
    public Integer task_page_sign_status;
    
    public String vipbanner_bubble;
    
    public Builder() {}
    
    public Builder(SidebarMsg param1SidebarMsg) {
      super(param1SidebarMsg);
      if (param1SidebarMsg == null)
        return; 
      this.member_has_expired = param1SidebarMsg.member_has_expired;
      this.vipbanner_bubble = param1SidebarMsg.vipbanner_bubble;
      this.member_expired_time = param1SidebarMsg.member_expired_time;
      this.task_page_sign_status = param1SidebarMsg.task_page_sign_status;
      this.multi_task_sign_progress_text = param1SidebarMsg.multi_task_sign_progress_text;
      this.multi_task_sign_interval_sec = param1SidebarMsg.multi_task_sign_interval_sec;
      this.multi_task_sign_default_text = param1SidebarMsg.multi_task_sign_default_text;
      this.multi_task_sign_status = param1SidebarMsg.multi_task_sign_status;
      this.multi_task_sign_switch = param1SidebarMsg.multi_task_sign_switch;
      this.multi_task_sign_refresh_time = param1SidebarMsg.multi_task_sign_refresh_time;
    }
    
    public SidebarMsg build(boolean param1Boolean) {
      return new SidebarMsg(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
