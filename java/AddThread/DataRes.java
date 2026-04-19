package tbclient.AddThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Advertisement;
import tbclient.Anti;
import tbclient.ContriInfo;
import tbclient.IconStampInfo;
import tbclient.PostAntiInfo;
import tbclient.ReplyExp;
import tbclient.SuccessToast;
import tbclient.TbInteraction;
import tbclient.ThreadEasterEgg;
import tbclient.Toast;
import tbclient.VcodeInfo;
import tbclient.ZhiBoInfoTW;

public final class DataRes extends Message {
  public static final String DEFAULT_COLOR_MSG = "";
  
  public static final String DEFAULT_EXT_MSG = "";
  
  public static final String DEFAULT_FINISH_SCHEME = "";
  
  public static final Integer DEFAULT_FOLLOW_STATUS = Integer.valueOf(0);
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_INVITEES_NUMBER = "";
  
  public static final String DEFAULT_MSG = "";
  
  public static final String DEFAULT_OPGROUP = "";
  
  public static final String DEFAULT_PID = "";
  
  public static final String DEFAULT_PRE_MSG = "";
  
  public static final String DEFAULT_TID = "";
  
  public static final String DEFAULT_VIDEO_ID = "";
  
  @ProtoField(tag = 12)
  public final Advertisement advertisement;
  
  @ProtoField(tag = 17)
  public final VcodeInfo anti;
  
  @ProtoField(tag = 15)
  public final Anti anti_stat;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String color_msg;
  
  @ProtoField(tag = 10)
  public final ContriInfo contri_info;
  
  @ProtoField(tag = 9)
  public final ReplyExp exp;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String ext_msg;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String finish_scheme;
  
  @ProtoField(tag = 22, type = Message.Datatype.INT32)
  public final Integer follow_status;
  
  @ProtoField(tag = 23, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 13)
  public final IconStampInfo icon_stamp_info;
  
  @ProtoField(tag = 14)
  public final PostAntiInfo info;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String invitees_number;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String msg;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String opgroup;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pid;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String pre_msg;
  
  @ProtoField(tag = 11)
  public final ThreadEasterEgg star_info;
  
  @ProtoField(tag = 21)
  public final SuccessToast success_toast;
  
  @ProtoField(tag = 16)
  public final TbInteraction tb_hudong;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tid;
  
  @ProtoField(tag = 20)
  public final Toast toast;
  
  @ProtoField(tag = 8)
  public final ZhiBoInfoTW twzhibo_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String video_id;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.opgroup;
      if (str1 == null) {
        this.opgroup = "";
      } else {
        this.opgroup = str1;
      } 
      str1 = paramBuilder.tid;
      if (str1 == null) {
        this.tid = "";
      } else {
        this.tid = str1;
      } 
      str1 = paramBuilder.pid;
      if (str1 == null) {
        this.pid = "";
      } else {
        this.pid = str1;
      } 
      str1 = paramBuilder.video_id;
      if (str1 == null) {
        this.video_id = "";
      } else {
        this.video_id = str1;
      } 
      str1 = paramBuilder.msg;
      if (str1 == null) {
        this.msg = "";
      } else {
        this.msg = str1;
      } 
      str1 = paramBuilder.pre_msg;
      if (str1 == null) {
        this.pre_msg = "";
      } else {
        this.pre_msg = str1;
      } 
      str1 = paramBuilder.color_msg;
      if (str1 == null) {
        this.color_msg = "";
      } else {
        this.color_msg = str1;
      } 
      this.twzhibo_info = paramBuilder.twzhibo_info;
      this.exp = paramBuilder.exp;
      this.contri_info = paramBuilder.contri_info;
      this.star_info = paramBuilder.star_info;
      this.advertisement = paramBuilder.advertisement;
      this.icon_stamp_info = paramBuilder.icon_stamp_info;
      this.info = paramBuilder.info;
      this.anti_stat = paramBuilder.anti_stat;
      this.tb_hudong = paramBuilder.tb_hudong;
      this.anti = paramBuilder.anti;
      str1 = paramBuilder.ext_msg;
      if (str1 == null) {
        this.ext_msg = "";
      } else {
        this.ext_msg = str1;
      } 
      str1 = paramBuilder.invitees_number;
      if (str1 == null) {
        this.invitees_number = "";
      } else {
        this.invitees_number = str1;
      } 
      this.toast = paramBuilder.toast;
      this.success_toast = paramBuilder.success_toast;
      Integer integer = paramBuilder.follow_status;
      if (integer == null) {
        this.follow_status = DEFAULT_FOLLOW_STATUS;
      } else {
        this.follow_status = integer;
      } 
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      str = paramBuilder.finish_scheme;
      if (str == null) {
        this.finish_scheme = "";
      } else {
        this.finish_scheme = str;
      } 
    } else {
      this.opgroup = ((Builder)str).opgroup;
      this.tid = ((Builder)str).tid;
      this.pid = ((Builder)str).pid;
      this.video_id = ((Builder)str).video_id;
      this.msg = ((Builder)str).msg;
      this.pre_msg = ((Builder)str).pre_msg;
      this.color_msg = ((Builder)str).color_msg;
      this.twzhibo_info = ((Builder)str).twzhibo_info;
      this.exp = ((Builder)str).exp;
      this.contri_info = ((Builder)str).contri_info;
      this.star_info = ((Builder)str).star_info;
      this.advertisement = ((Builder)str).advertisement;
      this.icon_stamp_info = ((Builder)str).icon_stamp_info;
      this.info = ((Builder)str).info;
      this.anti_stat = ((Builder)str).anti_stat;
      this.tb_hudong = ((Builder)str).tb_hudong;
      this.anti = ((Builder)str).anti;
      this.ext_msg = ((Builder)str).ext_msg;
      this.invitees_number = ((Builder)str).invitees_number;
      this.toast = ((Builder)str).toast;
      this.success_toast = ((Builder)str).success_toast;
      this.follow_status = ((Builder)str).follow_status;
      this.forum_id = ((Builder)str).forum_id;
      this.finish_scheme = ((Builder)str).finish_scheme;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Advertisement advertisement;
    
    public VcodeInfo anti;
    
    public Anti anti_stat;
    
    public String color_msg;
    
    public ContriInfo contri_info;
    
    public ReplyExp exp;
    
    public String ext_msg;
    
    public String finish_scheme;
    
    public Integer follow_status;
    
    public Long forum_id;
    
    public IconStampInfo icon_stamp_info;
    
    public PostAntiInfo info;
    
    public String invitees_number;
    
    public String msg;
    
    public String opgroup;
    
    public String pid;
    
    public String pre_msg;
    
    public ThreadEasterEgg star_info;
    
    public SuccessToast success_toast;
    
    public TbInteraction tb_hudong;
    
    public String tid;
    
    public Toast toast;
    
    public ZhiBoInfoTW twzhibo_info;
    
    public String video_id;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.opgroup = param1DataRes.opgroup;
      this.tid = param1DataRes.tid;
      this.pid = param1DataRes.pid;
      this.video_id = param1DataRes.video_id;
      this.msg = param1DataRes.msg;
      this.pre_msg = param1DataRes.pre_msg;
      this.color_msg = param1DataRes.color_msg;
      this.twzhibo_info = param1DataRes.twzhibo_info;
      this.exp = param1DataRes.exp;
      this.contri_info = param1DataRes.contri_info;
      this.star_info = param1DataRes.star_info;
      this.advertisement = param1DataRes.advertisement;
      this.icon_stamp_info = param1DataRes.icon_stamp_info;
      this.info = param1DataRes.info;
      this.anti_stat = param1DataRes.anti_stat;
      this.tb_hudong = param1DataRes.tb_hudong;
      this.anti = param1DataRes.anti;
      this.ext_msg = param1DataRes.ext_msg;
      this.invitees_number = param1DataRes.invitees_number;
      this.toast = param1DataRes.toast;
      this.success_toast = param1DataRes.success_toast;
      this.follow_status = param1DataRes.follow_status;
      this.forum_id = param1DataRes.forum_id;
      this.finish_scheme = param1DataRes.finish_scheme;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
