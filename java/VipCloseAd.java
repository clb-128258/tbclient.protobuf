package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class VipCloseAd extends Message {
  public static final List<Integer> DEFAULT_FORUM_CLOSE;
  
  public static final Integer DEFAULT_IS_OPEN;
  
  public static final Integer DEFAULT_LIVE_CLOSE;
  
  public static final Integer DEFAULT_SHIELD_STATUS;
  
  public static final Integer DEFAULT_VIP_CLOSE;
  
  public static final String DEFAULT_VIP_CLOSE_TIP = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT32)
  public final List<Integer> forum_close;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_open;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer live_close;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer shield_status;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer vip_close;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String vip_close_tip;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_OPEN = integer;
    DEFAULT_VIP_CLOSE = integer;
    DEFAULT_FORUM_CLOSE = Collections.emptyList();
    DEFAULT_LIVE_CLOSE = integer;
    DEFAULT_SHIELD_STATUS = integer;
  }
  
  public VipCloseAd(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.is_open;
      if (integer2 == null) {
        this.is_open = DEFAULT_IS_OPEN;
      } else {
        this.is_open = integer2;
      } 
      integer2 = paramBuilder.vip_close;
      if (integer2 == null) {
        this.vip_close = DEFAULT_VIP_CLOSE;
      } else {
        this.vip_close = integer2;
      } 
      List<Integer> list = paramBuilder.forum_close;
      if (list == null) {
        this.forum_close = DEFAULT_FORUM_CLOSE;
      } else {
        this.forum_close = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.live_close;
      if (integer1 == null) {
        this.live_close = DEFAULT_LIVE_CLOSE;
      } else {
        this.live_close = integer1;
      } 
      integer1 = paramBuilder.shield_status;
      if (integer1 == null) {
        this.shield_status = DEFAULT_SHIELD_STATUS;
      } else {
        this.shield_status = integer1;
      } 
      str = paramBuilder.vip_close_tip;
      if (str == null) {
        this.vip_close_tip = "";
      } else {
        this.vip_close_tip = str;
      } 
    } else {
      this.is_open = ((Builder)str).is_open;
      this.vip_close = ((Builder)str).vip_close;
      this.forum_close = Message.immutableCopyOf(((Builder)str).forum_close);
      this.live_close = ((Builder)str).live_close;
      this.shield_status = ((Builder)str).shield_status;
      this.vip_close_tip = ((Builder)str).vip_close_tip;
    } 
  }
  
  public static final class Builder extends Message.Builder<VipCloseAd> {
    public List<Integer> forum_close;
    
    public Integer is_open;
    
    public Integer live_close;
    
    public Integer shield_status;
    
    public Integer vip_close;
    
    public String vip_close_tip;
    
    public Builder() {}
    
    public Builder(VipCloseAd param1VipCloseAd) {
      super(param1VipCloseAd);
      if (param1VipCloseAd == null)
        return; 
      this.is_open = param1VipCloseAd.is_open;
      this.vip_close = param1VipCloseAd.vip_close;
      this.forum_close = Message.copyOf(param1VipCloseAd.forum_close);
      this.live_close = param1VipCloseAd.live_close;
      this.shield_status = param1VipCloseAd.shield_status;
      this.vip_close_tip = param1VipCloseAd.vip_close_tip;
    }
    
    public VipCloseAd build(boolean param1Boolean) {
      return new VipCloseAd(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
