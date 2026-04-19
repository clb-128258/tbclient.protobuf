package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SidebarMsg extends Message {
  public static final Long DEFAULT_MEMBER_EXPIRED_TIME;
  
  public static final Boolean DEFAULT_MEMBER_HAS_EXPIRED = Boolean.FALSE;
  
  public static final Integer DEFAULT_TASK_PAGE_SIGN_STATUS;
  
  public static final String DEFAULT_VIPBANNER_BUBBLE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long member_expired_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.BOOL)
  public final Boolean member_has_expired;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer task_page_sign_status;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String vipbanner_bubble;
  
  static {
    DEFAULT_MEMBER_EXPIRED_TIME = Long.valueOf(0L);
    DEFAULT_TASK_PAGE_SIGN_STATUS = Integer.valueOf(0);
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
      String str = paramBuilder.vipbanner_bubble;
      if (str == null) {
        this.vipbanner_bubble = "";
      } else {
        this.vipbanner_bubble = str;
      } 
      Long long_ = paramBuilder.member_expired_time;
      if (long_ == null) {
        this.member_expired_time = DEFAULT_MEMBER_EXPIRED_TIME;
      } else {
        this.member_expired_time = long_;
      } 
      integer = paramBuilder.task_page_sign_status;
      if (integer == null) {
        this.task_page_sign_status = DEFAULT_TASK_PAGE_SIGN_STATUS;
      } else {
        this.task_page_sign_status = integer;
      } 
    } else {
      this.member_has_expired = ((Builder)integer).member_has_expired;
      this.vipbanner_bubble = ((Builder)integer).vipbanner_bubble;
      this.member_expired_time = ((Builder)integer).member_expired_time;
      this.task_page_sign_status = ((Builder)integer).task_page_sign_status;
    } 
  }
  
  public static final class Builder extends Message.Builder<SidebarMsg> {
    public Long member_expired_time;
    
    public Boolean member_has_expired;
    
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
    }
    
    public SidebarMsg build(boolean param1Boolean) {
      return new SidebarMsg(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
