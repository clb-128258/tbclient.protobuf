package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ShoubaiUserExt extends Message {
  public static final Integer DEFAULT_BJH_STATUS;
  
  public static final String DEFAULT_SHUOBAI_NICKNAME = "";
  
  public static final Long DEFAULT_TB_COMBINE_STATUS;
  
  public static final Long DEFAULT_TB_COMBINE_TIME;
  
  public static final String DEFAULT_THIRD_ID = "";
  
  public static final String DEFAULT_TYPE = "";
  
  public static final Integer DEFAULT_V_TYPE;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer bjh_status;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String shuobai_nickname;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long tb_combine_status;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long tb_combine_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String third_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String type;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer v_type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_BJH_STATUS = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_TB_COMBINE_STATUS = long_;
    DEFAULT_TB_COMBINE_TIME = long_;
    DEFAULT_V_TYPE = integer;
  }
  
  public ShoubaiUserExt(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.bjh_status;
      if (integer1 == null) {
        this.bjh_status = DEFAULT_BJH_STATUS;
      } else {
        this.bjh_status = integer1;
      } 
      String str2 = paramBuilder.shuobai_nickname;
      if (str2 == null) {
        this.shuobai_nickname = "";
      } else {
        this.shuobai_nickname = str2;
      } 
      Long long_2 = paramBuilder.tb_combine_status;
      if (long_2 == null) {
        this.tb_combine_status = DEFAULT_TB_COMBINE_STATUS;
      } else {
        this.tb_combine_status = long_2;
      } 
      String str1 = paramBuilder.third_id;
      if (str1 == null) {
        this.third_id = "";
      } else {
        this.third_id = str1;
      } 
      str1 = paramBuilder.type;
      if (str1 == null) {
        this.type = "";
      } else {
        this.type = str1;
      } 
      Long long_1 = paramBuilder.tb_combine_time;
      if (long_1 == null) {
        this.tb_combine_time = DEFAULT_TB_COMBINE_TIME;
      } else {
        this.tb_combine_time = long_1;
      } 
      integer = paramBuilder.v_type;
      if (integer == null) {
        this.v_type = DEFAULT_V_TYPE;
      } else {
        this.v_type = integer;
      } 
    } else {
      this.bjh_status = ((Builder)integer).bjh_status;
      this.shuobai_nickname = ((Builder)integer).shuobai_nickname;
      this.tb_combine_status = ((Builder)integer).tb_combine_status;
      this.third_id = ((Builder)integer).third_id;
      this.type = ((Builder)integer).type;
      this.tb_combine_time = ((Builder)integer).tb_combine_time;
      this.v_type = ((Builder)integer).v_type;
    } 
  }
  
  public static final class Builder extends Message.Builder<ShoubaiUserExt> {
    public Integer bjh_status;
    
    public String shuobai_nickname;
    
    public Long tb_combine_status;
    
    public Long tb_combine_time;
    
    public String third_id;
    
    public String type;
    
    public Integer v_type;
    
    public Builder() {}
    
    public Builder(ShoubaiUserExt param1ShoubaiUserExt) {
      super(param1ShoubaiUserExt);
      if (param1ShoubaiUserExt == null)
        return; 
      this.bjh_status = param1ShoubaiUserExt.bjh_status;
      this.shuobai_nickname = param1ShoubaiUserExt.shuobai_nickname;
      this.tb_combine_status = param1ShoubaiUserExt.tb_combine_status;
      this.third_id = param1ShoubaiUserExt.third_id;
      this.type = param1ShoubaiUserExt.type;
      this.tb_combine_time = param1ShoubaiUserExt.tb_combine_time;
      this.v_type = param1ShoubaiUserExt.v_type;
    }
    
    public ShoubaiUserExt build(boolean param1Boolean) {
      return new ShoubaiUserExt(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
