package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Agree extends Message {
  public static final Long DEFAULT_AGREE_NUM;
  
  public static final Integer DEFAULT_AGREE_TYPE;
  
  public static final Long DEFAULT_DIFF_AGREE_NUM;
  
  public static final Long DEFAULT_DISAGREE_NUM;
  
  public static final Integer DEFAULT_HAS_AGREE;
  
  public static final Integer DEFAULT_LZ_AGREE;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long agree_num;
  
  @ProtoField(tag = 7)
  public final ThemeColorInfo agree_resource;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer agree_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long diff_agree_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long disagree_num;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer has_agree;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer lz_agree;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_AGREE_NUM = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_AGREE = integer;
    DEFAULT_AGREE_TYPE = integer;
    DEFAULT_DISAGREE_NUM = long_;
    DEFAULT_DIFF_AGREE_NUM = long_;
    DEFAULT_LZ_AGREE = integer;
  }
  
  public Agree(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.agree_num;
      if (long_2 == null) {
        this.agree_num = DEFAULT_AGREE_NUM;
      } else {
        this.agree_num = long_2;
      } 
      Integer integer2 = paramBuilder.has_agree;
      if (integer2 == null) {
        this.has_agree = DEFAULT_HAS_AGREE;
      } else {
        this.has_agree = integer2;
      } 
      integer2 = paramBuilder.agree_type;
      if (integer2 == null) {
        this.agree_type = DEFAULT_AGREE_TYPE;
      } else {
        this.agree_type = integer2;
      } 
      Long long_1 = paramBuilder.disagree_num;
      if (long_1 == null) {
        this.disagree_num = DEFAULT_DISAGREE_NUM;
      } else {
        this.disagree_num = long_1;
      } 
      long_1 = paramBuilder.diff_agree_num;
      if (long_1 == null) {
        this.diff_agree_num = DEFAULT_DIFF_AGREE_NUM;
      } else {
        this.diff_agree_num = long_1;
      } 
      Integer integer1 = paramBuilder.lz_agree;
      if (integer1 == null) {
        this.lz_agree = DEFAULT_LZ_AGREE;
      } else {
        this.lz_agree = integer1;
      } 
      this.agree_resource = paramBuilder.agree_resource;
    } else {
      this.agree_num = paramBuilder.agree_num;
      this.has_agree = paramBuilder.has_agree;
      this.agree_type = paramBuilder.agree_type;
      this.disagree_num = paramBuilder.disagree_num;
      this.diff_agree_num = paramBuilder.diff_agree_num;
      this.lz_agree = paramBuilder.lz_agree;
      this.agree_resource = paramBuilder.agree_resource;
    } 
  }
  
  public static final class Builder extends Message.Builder<Agree> {
    public Long agree_num;
    
    public ThemeColorInfo agree_resource;
    
    public Integer agree_type;
    
    public Long diff_agree_num;
    
    public Long disagree_num;
    
    public Integer has_agree;
    
    public Integer lz_agree;
    
    public Builder() {}
    
    public Builder(Agree param1Agree) {
      super(param1Agree);
      if (param1Agree == null)
        return; 
      this.agree_num = param1Agree.agree_num;
      this.has_agree = param1Agree.has_agree;
      this.agree_type = param1Agree.agree_type;
      this.disagree_num = param1Agree.disagree_num;
      this.diff_agree_num = param1Agree.diff_agree_num;
      this.lz_agree = param1Agree.lz_agree;
      this.agree_resource = param1Agree.agree_resource;
    }
    
    public Agree build(boolean param1Boolean) {
      return new Agree(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
