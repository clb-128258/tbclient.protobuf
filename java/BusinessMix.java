package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BusinessMix extends Message {
  public static final Integer DEFAULT_CAN_SHOW_SECOND_FLOOR;
  
  public static final Double DEFAULT_CTR;
  
  public static final Double DEFAULT_ECPM;
  
  public static final Integer DEFAULT_JUMP_TYPE;
  
  public static final Integer DEFAULT_MIX_TYPE;
  
  public static final String DEFAULT_PACKAGE_NAME = "";
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final Integer DEFAULT_TOUCH_LEVEL;
  
  public static final String DEFAULT_TOUCH_TYPE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer can_show_second_floor;
  
  @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
  public final Double ctr;
  
  @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
  public final Double ecpm;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer jump_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer mix_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String package_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer touch_level;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String touch_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_MIX_TYPE = integer;
    DEFAULT_JUMP_TYPE = integer;
    Double double_ = Double.valueOf(0.0D);
    DEFAULT_ECPM = double_;
    DEFAULT_TOUCH_LEVEL = integer;
    DEFAULT_CAN_SHOW_SECOND_FLOOR = integer;
    DEFAULT_CTR = double_;
  }
  
  public BusinessMix(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Double double_;
    if (paramBoolean == true) {
      Integer integer4 = paramBuilder.mix_type;
      if (integer4 == null) {
        this.mix_type = DEFAULT_MIX_TYPE;
      } else {
        this.mix_type = integer4;
      } 
      String str3 = paramBuilder.url;
      if (str3 == null) {
        this.url = "";
      } else {
        this.url = str3;
      } 
      str3 = paramBuilder.scheme;
      if (str3 == null) {
        this.scheme = "";
      } else {
        this.scheme = str3;
      } 
      Integer integer3 = paramBuilder.jump_type;
      if (integer3 == null) {
        this.jump_type = DEFAULT_JUMP_TYPE;
      } else {
        this.jump_type = integer3;
      } 
      String str2 = paramBuilder.package_name;
      if (str2 == null) {
        this.package_name = "";
      } else {
        this.package_name = str2;
      } 
      Double double_1 = paramBuilder.ecpm;
      if (double_1 == null) {
        this.ecpm = DEFAULT_ECPM;
      } else {
        this.ecpm = double_1;
      } 
      Integer integer2 = paramBuilder.touch_level;
      if (integer2 == null) {
        this.touch_level = DEFAULT_TOUCH_LEVEL;
      } else {
        this.touch_level = integer2;
      } 
      String str1 = paramBuilder.touch_type;
      if (str1 == null) {
        this.touch_type = "";
      } else {
        this.touch_type = str1;
      } 
      Integer integer1 = paramBuilder.can_show_second_floor;
      if (integer1 == null) {
        this.can_show_second_floor = DEFAULT_CAN_SHOW_SECOND_FLOOR;
      } else {
        this.can_show_second_floor = integer1;
      } 
      double_ = paramBuilder.ctr;
      if (double_ == null) {
        this.ctr = DEFAULT_CTR;
      } else {
        this.ctr = double_;
      } 
    } else {
      this.mix_type = ((Builder)double_).mix_type;
      this.url = ((Builder)double_).url;
      this.scheme = ((Builder)double_).scheme;
      this.jump_type = ((Builder)double_).jump_type;
      this.package_name = ((Builder)double_).package_name;
      this.ecpm = ((Builder)double_).ecpm;
      this.touch_level = ((Builder)double_).touch_level;
      this.touch_type = ((Builder)double_).touch_type;
      this.can_show_second_floor = ((Builder)double_).can_show_second_floor;
      this.ctr = ((Builder)double_).ctr;
    } 
  }
  
  public static final class Builder extends Message.Builder<BusinessMix> {
    public Integer can_show_second_floor;
    
    public Double ctr;
    
    public Double ecpm;
    
    public Integer jump_type;
    
    public Integer mix_type;
    
    public String package_name;
    
    public String scheme;
    
    public Integer touch_level;
    
    public String touch_type;
    
    public String url;
    
    public Builder() {}
    
    public Builder(BusinessMix param1BusinessMix) {
      super(param1BusinessMix);
      if (param1BusinessMix == null)
        return; 
      this.mix_type = param1BusinessMix.mix_type;
      this.url = param1BusinessMix.url;
      this.scheme = param1BusinessMix.scheme;
      this.jump_type = param1BusinessMix.jump_type;
      this.package_name = param1BusinessMix.package_name;
      this.ecpm = param1BusinessMix.ecpm;
      this.touch_level = param1BusinessMix.touch_level;
      this.touch_type = param1BusinessMix.touch_type;
      this.can_show_second_floor = param1BusinessMix.can_show_second_floor;
      this.ctr = param1BusinessMix.ctr;
    }
    
    public BusinessMix build(boolean param1Boolean) {
      return new BusinessMix(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
