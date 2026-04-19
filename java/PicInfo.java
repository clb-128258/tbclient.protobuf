package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class PicInfo extends Message {
  public static final String DEFAULT_BIG_PIC_URL = "";
  
  public static final Double DEFAULT_CROP_POINT_HEIGHT_RATIO;
  
  public static final Double DEFAULT_CROP_POINT_WIDTH_RATIO;
  
  public static final List<PicDecoration> DEFAULT_DECORATION;
  
  public static final Integer DEFAULT_HEIGHT;
  
  public static final Long DEFAULT_HEIGHT_RATIO;
  
  public static final String DEFAULT_ID = "";
  
  public static final Integer DEFAULT_IS_FULL;
  
  public static final Integer DEFAULT_IS_LONG_PIC;
  
  public static final String DEFAULT_ORIGIN_PIC_URL = "";
  
  public static final Long DEFAULT_PIC_ID;
  
  public static final String DEFAULT_PIC_TYPE = "";
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final String DEFAULT_SMALL_PIC_URL = "";
  
  public static final Integer DEFAULT_WIDTH;
  
  public static final Long DEFAULT_WIDTH_RATIO;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String big_pic_url;
  
  @ProtoField(tag = 8, type = Message.Datatype.DOUBLE)
  public final Double crop_point_height_ratio;
  
  @ProtoField(tag = 7, type = Message.Datatype.DOUBLE)
  public final Double crop_point_width_ratio;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 9)
  public final List<PicDecoration> decoration;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer height;
  
  @ProtoField(tag = 16, type = Message.Datatype.UINT64)
  public final Long height_ratio;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String id;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer is_full;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer is_long_pic;
  
  @ProtoField(tag = 12)
  public final MaskColor mask_color;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String origin_pic_url;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT64)
  public final Long pic_id;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String pic_type;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String small_pic_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer width;
  
  @ProtoField(tag = 17, type = Message.Datatype.UINT64)
  public final Long width_ratio;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_WIDTH = integer;
    DEFAULT_HEIGHT = integer;
    DEFAULT_IS_LONG_PIC = integer;
    Double double_ = Double.valueOf(0.0D);
    DEFAULT_CROP_POINT_WIDTH_RATIO = double_;
    DEFAULT_CROP_POINT_HEIGHT_RATIO = double_;
    DEFAULT_DECORATION = Collections.emptyList();
    DEFAULT_IS_FULL = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_PIC_ID = long_;
    DEFAULT_HEIGHT_RATIO = long_;
    DEFAULT_WIDTH_RATIO = long_;
  }
  
  public PicInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str3 = paramBuilder.small_pic_url;
      if (str3 == null) {
        this.small_pic_url = "";
      } else {
        this.small_pic_url = str3;
      } 
      str3 = paramBuilder.big_pic_url;
      if (str3 == null) {
        this.big_pic_url = "";
      } else {
        this.big_pic_url = str3;
      } 
      str3 = paramBuilder.origin_pic_url;
      if (str3 == null) {
        this.origin_pic_url = "";
      } else {
        this.origin_pic_url = str3;
      } 
      Integer integer2 = paramBuilder.width;
      if (integer2 == null) {
        this.width = DEFAULT_WIDTH;
      } else {
        this.width = integer2;
      } 
      integer2 = paramBuilder.height;
      if (integer2 == null) {
        this.height = DEFAULT_HEIGHT;
      } else {
        this.height = integer2;
      } 
      integer2 = paramBuilder.is_long_pic;
      if (integer2 == null) {
        this.is_long_pic = DEFAULT_IS_LONG_PIC;
      } else {
        this.is_long_pic = integer2;
      } 
      Double double_ = paramBuilder.crop_point_width_ratio;
      if (double_ == null) {
        this.crop_point_width_ratio = DEFAULT_CROP_POINT_WIDTH_RATIO;
      } else {
        this.crop_point_width_ratio = double_;
      } 
      double_ = paramBuilder.crop_point_height_ratio;
      if (double_ == null) {
        this.crop_point_height_ratio = DEFAULT_CROP_POINT_HEIGHT_RATIO;
      } else {
        this.crop_point_height_ratio = double_;
      } 
      List<PicDecoration> list = paramBuilder.decoration;
      if (list == null) {
        this.decoration = DEFAULT_DECORATION;
      } else {
        this.decoration = Message.immutableCopyOf(list);
      } 
      String str2 = paramBuilder.scheme;
      if (str2 == null) {
        this.scheme = "";
      } else {
        this.scheme = str2;
      } 
      str2 = paramBuilder.pic_type;
      if (str2 == null) {
        this.pic_type = "";
      } else {
        this.pic_type = str2;
      } 
      this.mask_color = paramBuilder.mask_color;
      Integer integer1 = paramBuilder.is_full;
      if (integer1 == null) {
        this.is_full = DEFAULT_IS_FULL;
      } else {
        this.is_full = integer1;
      } 
      Long long_2 = paramBuilder.pic_id;
      if (long_2 == null) {
        this.pic_id = DEFAULT_PIC_ID;
      } else {
        this.pic_id = long_2;
      } 
      String str1 = paramBuilder.id;
      if (str1 == null) {
        this.id = "";
      } else {
        this.id = str1;
      } 
      Long long_1 = paramBuilder.height_ratio;
      if (long_1 == null) {
        this.height_ratio = DEFAULT_HEIGHT_RATIO;
      } else {
        this.height_ratio = long_1;
      } 
      long_ = paramBuilder.width_ratio;
      if (long_ == null) {
        this.width_ratio = DEFAULT_WIDTH_RATIO;
      } else {
        this.width_ratio = long_;
      } 
    } else {
      this.small_pic_url = ((Builder)long_).small_pic_url;
      this.big_pic_url = ((Builder)long_).big_pic_url;
      this.origin_pic_url = ((Builder)long_).origin_pic_url;
      this.width = ((Builder)long_).width;
      this.height = ((Builder)long_).height;
      this.is_long_pic = ((Builder)long_).is_long_pic;
      this.crop_point_width_ratio = ((Builder)long_).crop_point_width_ratio;
      this.crop_point_height_ratio = ((Builder)long_).crop_point_height_ratio;
      this.decoration = Message.immutableCopyOf(((Builder)long_).decoration);
      this.scheme = ((Builder)long_).scheme;
      this.pic_type = ((Builder)long_).pic_type;
      this.mask_color = ((Builder)long_).mask_color;
      this.is_full = ((Builder)long_).is_full;
      this.pic_id = ((Builder)long_).pic_id;
      this.id = ((Builder)long_).id;
      this.height_ratio = ((Builder)long_).height_ratio;
      this.width_ratio = ((Builder)long_).width_ratio;
    } 
  }
  
  public static final class Builder extends Message.Builder<PicInfo> {
    public String big_pic_url;
    
    public Double crop_point_height_ratio;
    
    public Double crop_point_width_ratio;
    
    public List<PicDecoration> decoration;
    
    public Integer height;
    
    public Long height_ratio;
    
    public String id;
    
    public Integer is_full;
    
    public Integer is_long_pic;
    
    public MaskColor mask_color;
    
    public String origin_pic_url;
    
    public Long pic_id;
    
    public String pic_type;
    
    public String scheme;
    
    public String small_pic_url;
    
    public Integer width;
    
    public Long width_ratio;
    
    public Builder() {}
    
    public Builder(PicInfo param1PicInfo) {
      super(param1PicInfo);
      if (param1PicInfo == null)
        return; 
      this.small_pic_url = param1PicInfo.small_pic_url;
      this.big_pic_url = param1PicInfo.big_pic_url;
      this.origin_pic_url = param1PicInfo.origin_pic_url;
      this.width = param1PicInfo.width;
      this.height = param1PicInfo.height;
      this.is_long_pic = param1PicInfo.is_long_pic;
      this.crop_point_width_ratio = param1PicInfo.crop_point_width_ratio;
      this.crop_point_height_ratio = param1PicInfo.crop_point_height_ratio;
      this.decoration = Message.copyOf(param1PicInfo.decoration);
      this.scheme = param1PicInfo.scheme;
      this.pic_type = param1PicInfo.pic_type;
      this.mask_color = param1PicInfo.mask_color;
      this.is_full = param1PicInfo.is_full;
      this.pic_id = param1PicInfo.pic_id;
      this.id = param1PicInfo.id;
      this.height_ratio = param1PicInfo.height_ratio;
      this.width_ratio = param1PicInfo.width_ratio;
    }
    
    public PicInfo build(boolean param1Boolean) {
      return new PicInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
