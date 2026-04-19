package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Media extends Message {
  public static final String DEFAULT_BIG_PIC = "";
  
  public static final String DEFAULT_BSIZE = "";
  
  public static final Integer DEFAULT_DURING_TIME;
  
  public static final String DEFAULT_DYNAMIC_PIC = "";
  
  public static final Integer DEFAULT_E_TYPE;
  
  public static final String DEFAULT_GUIDE_TEXT = "";
  
  public static final Integer DEFAULT_HEIGHT;
  
  public static final Double DEFAULT_HTH_MID_LOC;
  
  public static final String DEFAULT_ID = "";
  
  public static final Integer DEFAULT_IS_BLOCKED_PIC;
  
  public static final Integer DEFAULT_IS_FULL;
  
  public static final Integer DEFAULT_IS_LONG_PIC;
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final Integer DEFAULT_LOTTIE_TYPE;
  
  public static final String DEFAULT_ORIGIN_PIC = "";
  
  public static final Integer DEFAULT_ORIGIN_SIZE;
  
  public static final Long DEFAULT_PIC_ID;
  
  public static final Long DEFAULT_POST_ID;
  
  public static final Integer DEFAULT_SHOW_ORIGINAL_BTN;
  
  public static final String DEFAULT_SMALL_PIC = "";
  
  public static final String DEFAULT_SRC_PIC = "";
  
  public static final String DEFAULT_TEXT = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_VHSRC = "";
  
  public static final String DEFAULT_VPIC = "";
  
  public static final String DEFAULT_VSRC = "";
  
  public static final String DEFAULT_WATER_PIC = "";
  
  public static final Integer DEFAULT_WIDTH;
  
  public static final Double DEFAULT_WTH_MID_LOC;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String big_pic;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String bsize;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer during_time;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String dynamic_pic;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT32)
  public final Integer e_type;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String guide_text;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT32)
  public final Integer height;
  
  @ProtoField(tag = 23, type = Message.Datatype.DOUBLE)
  public final Double hth_mid_loc;
  
  @ProtoField(tag = 30, type = Message.Datatype.STRING)
  public final String id;
  
  @ProtoField(tag = 21, type = Message.Datatype.UINT32)
  public final Integer is_blocked_pic;
  
  @ProtoField(tag = 28, type = Message.Datatype.INT32)
  public final Integer is_full;
  
  @ProtoField(tag = 19, type = Message.Datatype.UINT32)
  public final Integer is_long_pic;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 26, type = Message.Datatype.INT32)
  public final Integer lottie_type;
  
  @ProtoField(tag = 27)
  public final MaskColor mask_color;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String origin_pic;
  
  @ProtoField(tag = 16, type = Message.Datatype.UINT32)
  public final Integer origin_size;
  
  @ProtoField(tag = 29, type = Message.Datatype.UINT64)
  public final Long pic_id;
  
  @ProtoField(tag = 17, type = Message.Datatype.INT64)
  public final Long post_id;
  
  @ProtoField(tag = 20, type = Message.Datatype.UINT32)
  public final Integer show_original_btn;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String small_pic;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String src_pic;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String vhsrc;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String vpic;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String vsrc;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String water_pic;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer width;
  
  @ProtoField(tag = 22, type = Message.Datatype.DOUBLE)
  public final Double wth_mid_loc;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_WIDTH = integer;
    DEFAULT_HEIGHT = integer;
    DEFAULT_DURING_TIME = integer;
    DEFAULT_E_TYPE = integer;
    DEFAULT_ORIGIN_SIZE = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_POST_ID = long_;
    DEFAULT_IS_LONG_PIC = integer;
    DEFAULT_SHOW_ORIGINAL_BTN = integer;
    DEFAULT_IS_BLOCKED_PIC = integer;
    Double double_ = Double.valueOf(0.0D);
    DEFAULT_WTH_MID_LOC = double_;
    DEFAULT_HTH_MID_LOC = double_;
    DEFAULT_LOTTIE_TYPE = integer;
    DEFAULT_IS_FULL = integer;
    DEFAULT_PIC_ID = long_;
  }
  
  public Media(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer6 = paramBuilder.type;
      if (integer6 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer6;
      } 
      String str5 = paramBuilder.small_pic;
      if (str5 == null) {
        this.small_pic = "";
      } else {
        this.small_pic = str5;
      } 
      str5 = paramBuilder.big_pic;
      if (str5 == null) {
        this.big_pic = "";
      } else {
        this.big_pic = str5;
      } 
      str5 = paramBuilder.water_pic;
      if (str5 == null) {
        this.water_pic = "";
      } else {
        this.water_pic = str5;
      } 
      str5 = paramBuilder.vpic;
      if (str5 == null) {
        this.vpic = "";
      } else {
        this.vpic = str5;
      } 
      str5 = paramBuilder.vsrc;
      if (str5 == null) {
        this.vsrc = "";
      } else {
        this.vsrc = str5;
      } 
      str5 = paramBuilder.vhsrc;
      if (str5 == null) {
        this.vhsrc = "";
      } else {
        this.vhsrc = str5;
      } 
      str5 = paramBuilder.src_pic;
      if (str5 == null) {
        this.src_pic = "";
      } else {
        this.src_pic = str5;
      } 
      str5 = paramBuilder.text;
      if (str5 == null) {
        this.text = "";
      } else {
        this.text = str5;
      } 
      Integer integer5 = paramBuilder.width;
      if (integer5 == null) {
        this.width = DEFAULT_WIDTH;
      } else {
        this.width = integer5;
      } 
      integer5 = paramBuilder.height;
      if (integer5 == null) {
        this.height = DEFAULT_HEIGHT;
      } else {
        this.height = integer5;
      } 
      String str4 = paramBuilder.bsize;
      if (str4 == null) {
        this.bsize = "";
      } else {
        this.bsize = str4;
      } 
      Integer integer4 = paramBuilder.during_time;
      if (integer4 == null) {
        this.during_time = DEFAULT_DURING_TIME;
      } else {
        this.during_time = integer4;
      } 
      integer4 = paramBuilder.e_type;
      if (integer4 == null) {
        this.e_type = DEFAULT_E_TYPE;
      } else {
        this.e_type = integer4;
      } 
      String str3 = paramBuilder.origin_pic;
      if (str3 == null) {
        this.origin_pic = "";
      } else {
        this.origin_pic = str3;
      } 
      Integer integer3 = paramBuilder.origin_size;
      if (integer3 == null) {
        this.origin_size = DEFAULT_ORIGIN_SIZE;
      } else {
        this.origin_size = integer3;
      } 
      Long long_2 = paramBuilder.post_id;
      if (long_2 == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_2;
      } 
      String str2 = paramBuilder.dynamic_pic;
      if (str2 == null) {
        this.dynamic_pic = "";
      } else {
        this.dynamic_pic = str2;
      } 
      Integer integer2 = paramBuilder.is_long_pic;
      if (integer2 == null) {
        this.is_long_pic = DEFAULT_IS_LONG_PIC;
      } else {
        this.is_long_pic = integer2;
      } 
      integer2 = paramBuilder.show_original_btn;
      if (integer2 == null) {
        this.show_original_btn = DEFAULT_SHOW_ORIGINAL_BTN;
      } else {
        this.show_original_btn = integer2;
      } 
      integer2 = paramBuilder.is_blocked_pic;
      if (integer2 == null) {
        this.is_blocked_pic = DEFAULT_IS_BLOCKED_PIC;
      } else {
        this.is_blocked_pic = integer2;
      } 
      Double double_ = paramBuilder.wth_mid_loc;
      if (double_ == null) {
        this.wth_mid_loc = DEFAULT_WTH_MID_LOC;
      } else {
        this.wth_mid_loc = double_;
      } 
      double_ = paramBuilder.hth_mid_loc;
      if (double_ == null) {
        this.hth_mid_loc = DEFAULT_HTH_MID_LOC;
      } else {
        this.hth_mid_loc = double_;
      } 
      String str1 = paramBuilder.jump_url;
      if (str1 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str1;
      } 
      str1 = paramBuilder.guide_text;
      if (str1 == null) {
        this.guide_text = "";
      } else {
        this.guide_text = str1;
      } 
      Integer integer1 = paramBuilder.lottie_type;
      if (integer1 == null) {
        this.lottie_type = DEFAULT_LOTTIE_TYPE;
      } else {
        this.lottie_type = integer1;
      } 
      this.mask_color = paramBuilder.mask_color;
      integer1 = paramBuilder.is_full;
      if (integer1 == null) {
        this.is_full = DEFAULT_IS_FULL;
      } else {
        this.is_full = integer1;
      } 
      Long long_1 = paramBuilder.pic_id;
      if (long_1 == null) {
        this.pic_id = DEFAULT_PIC_ID;
      } else {
        this.pic_id = long_1;
      } 
      str = paramBuilder.id;
      if (str == null) {
        this.id = "";
      } else {
        this.id = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.small_pic = ((Builder)str).small_pic;
      this.big_pic = ((Builder)str).big_pic;
      this.water_pic = ((Builder)str).water_pic;
      this.vpic = ((Builder)str).vpic;
      this.vsrc = ((Builder)str).vsrc;
      this.vhsrc = ((Builder)str).vhsrc;
      this.src_pic = ((Builder)str).src_pic;
      this.text = ((Builder)str).text;
      this.width = ((Builder)str).width;
      this.height = ((Builder)str).height;
      this.bsize = ((Builder)str).bsize;
      this.during_time = ((Builder)str).during_time;
      this.e_type = ((Builder)str).e_type;
      this.origin_pic = ((Builder)str).origin_pic;
      this.origin_size = ((Builder)str).origin_size;
      this.post_id = ((Builder)str).post_id;
      this.dynamic_pic = ((Builder)str).dynamic_pic;
      this.is_long_pic = ((Builder)str).is_long_pic;
      this.show_original_btn = ((Builder)str).show_original_btn;
      this.is_blocked_pic = ((Builder)str).is_blocked_pic;
      this.wth_mid_loc = ((Builder)str).wth_mid_loc;
      this.hth_mid_loc = ((Builder)str).hth_mid_loc;
      this.jump_url = ((Builder)str).jump_url;
      this.guide_text = ((Builder)str).guide_text;
      this.lottie_type = ((Builder)str).lottie_type;
      this.mask_color = ((Builder)str).mask_color;
      this.is_full = ((Builder)str).is_full;
      this.pic_id = ((Builder)str).pic_id;
      this.id = ((Builder)str).id;
    } 
  }
  
  public static final class Builder extends Message.Builder<Media> {
    public String big_pic;
    
    public String bsize;
    
    public Integer during_time;
    
    public String dynamic_pic;
    
    public Integer e_type;
    
    public String guide_text;
    
    public Integer height;
    
    public Double hth_mid_loc;
    
    public String id;
    
    public Integer is_blocked_pic;
    
    public Integer is_full;
    
    public Integer is_long_pic;
    
    public String jump_url;
    
    public Integer lottie_type;
    
    public MaskColor mask_color;
    
    public String origin_pic;
    
    public Integer origin_size;
    
    public Long pic_id;
    
    public Long post_id;
    
    public Integer show_original_btn;
    
    public String small_pic;
    
    public String src_pic;
    
    public String text;
    
    public Integer type;
    
    public String vhsrc;
    
    public String vpic;
    
    public String vsrc;
    
    public String water_pic;
    
    public Integer width;
    
    public Double wth_mid_loc;
    
    public Builder() {}
    
    public Builder(Media param1Media) {
      super(param1Media);
      if (param1Media == null)
        return; 
      this.type = param1Media.type;
      this.small_pic = param1Media.small_pic;
      this.big_pic = param1Media.big_pic;
      this.water_pic = param1Media.water_pic;
      this.vpic = param1Media.vpic;
      this.vsrc = param1Media.vsrc;
      this.vhsrc = param1Media.vhsrc;
      this.src_pic = param1Media.src_pic;
      this.text = param1Media.text;
      this.width = param1Media.width;
      this.height = param1Media.height;
      this.bsize = param1Media.bsize;
      this.during_time = param1Media.during_time;
      this.e_type = param1Media.e_type;
      this.origin_pic = param1Media.origin_pic;
      this.origin_size = param1Media.origin_size;
      this.post_id = param1Media.post_id;
      this.dynamic_pic = param1Media.dynamic_pic;
      this.is_long_pic = param1Media.is_long_pic;
      this.show_original_btn = param1Media.show_original_btn;
      this.is_blocked_pic = param1Media.is_blocked_pic;
      this.wth_mid_loc = param1Media.wth_mid_loc;
      this.hth_mid_loc = param1Media.hth_mid_loc;
      this.jump_url = param1Media.jump_url;
      this.guide_text = param1Media.guide_text;
      this.lottie_type = param1Media.lottie_type;
      this.mask_color = param1Media.mask_color;
      this.is_full = param1Media.is_full;
      this.pic_id = param1Media.pic_id;
      this.id = param1Media.id;
    }
    
    public Media build(boolean param1Boolean) {
      return new Media(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
