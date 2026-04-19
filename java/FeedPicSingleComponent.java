package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedPicSingleComponent extends Message {
  public static final Double DEFAULT_CROP_POINT_HEIGHT_RATIO;
  
  public static final Double DEFAULT_CROP_POINT_WIDTH_RATIO;
  
  public static final List<PicDecoration> DEFAULT_DECORATION;
  
  public static final Integer DEFAULT_HEIGHT;
  
  public static final Integer DEFAULT_IS_LONG_PIC;
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final Integer DEFAULT_WIDTH;
  
  @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
  public final Double crop_point_height_ratio;
  
  @ProtoField(tag = 5, type = Message.Datatype.DOUBLE)
  public final Double crop_point_width_ratio;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<PicDecoration> decoration;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer height;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer is_long_pic;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer width;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_WIDTH = integer;
    DEFAULT_HEIGHT = integer;
    DEFAULT_IS_LONG_PIC = integer;
    Double double_ = Double.valueOf(0.0D);
    DEFAULT_CROP_POINT_WIDTH_RATIO = double_;
    DEFAULT_CROP_POINT_HEIGHT_RATIO = double_;
    DEFAULT_DECORATION = Collections.emptyList();
  }
  
  public FeedPicSingleComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<PicDecoration> list;
    if (paramBoolean == true) {
      String str = paramBuilder.pic_url;
      if (str == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str;
      } 
      Integer integer = paramBuilder.width;
      if (integer == null) {
        this.width = DEFAULT_WIDTH;
      } else {
        this.width = integer;
      } 
      integer = paramBuilder.height;
      if (integer == null) {
        this.height = DEFAULT_HEIGHT;
      } else {
        this.height = integer;
      } 
      integer = paramBuilder.is_long_pic;
      if (integer == null) {
        this.is_long_pic = DEFAULT_IS_LONG_PIC;
      } else {
        this.is_long_pic = integer;
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
      list = paramBuilder.decoration;
      if (list == null) {
        this.decoration = DEFAULT_DECORATION;
      } else {
        this.decoration = Message.immutableCopyOf(list);
      } 
    } else {
      this.pic_url = ((Builder)list).pic_url;
      this.width = ((Builder)list).width;
      this.height = ((Builder)list).height;
      this.is_long_pic = ((Builder)list).is_long_pic;
      this.crop_point_width_ratio = ((Builder)list).crop_point_width_ratio;
      this.crop_point_height_ratio = ((Builder)list).crop_point_height_ratio;
      this.decoration = Message.immutableCopyOf(((Builder)list).decoration);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedPicSingleComponent> {
    public Double crop_point_height_ratio;
    
    public Double crop_point_width_ratio;
    
    public List<PicDecoration> decoration;
    
    public Integer height;
    
    public Integer is_long_pic;
    
    public String pic_url;
    
    public Integer width;
    
    public Builder() {}
    
    public Builder(FeedPicSingleComponent param1FeedPicSingleComponent) {
      super(param1FeedPicSingleComponent);
      if (param1FeedPicSingleComponent == null)
        return; 
      this.pic_url = param1FeedPicSingleComponent.pic_url;
      this.width = param1FeedPicSingleComponent.width;
      this.height = param1FeedPicSingleComponent.height;
      this.is_long_pic = param1FeedPicSingleComponent.is_long_pic;
      this.crop_point_width_ratio = param1FeedPicSingleComponent.crop_point_width_ratio;
      this.crop_point_height_ratio = param1FeedPicSingleComponent.crop_point_height_ratio;
      this.decoration = Message.copyOf(param1FeedPicSingleComponent.decoration);
    }
    
    public FeedPicSingleComponent build(boolean param1Boolean) {
      return new FeedPicSingleComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
