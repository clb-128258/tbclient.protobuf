package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedHeadImg extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final String DEFAULT_CORNER_URL = "";
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final List<String> DEFAULT_MASKS;
  
  public static final String DEFAULT_PENDANT_URL = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final Integer DEFAULT_SHAPE_TYPE = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String corner_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.STRING)
  public final List<String> masks;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pendant_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer shape_type;
  
  static {
    DEFAULT_MASKS = Collections.emptyList();
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
  }
  
  public FeedHeadImg(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      String str2 = paramBuilder.img_url;
      if (str2 == null) {
        this.img_url = "";
      } else {
        this.img_url = str2;
      } 
      Integer integer = paramBuilder.shape_type;
      if (integer == null) {
        this.shape_type = DEFAULT_SHAPE_TYPE;
      } else {
        this.shape_type = integer;
      } 
      String str1 = paramBuilder.pendant_url;
      if (str1 == null) {
        this.pendant_url = "";
      } else {
        this.pendant_url = str1;
      } 
      str1 = paramBuilder.corner_url;
      if (str1 == null) {
        this.corner_url = "";
      } else {
        this.corner_url = str1;
      } 
      str1 = paramBuilder.schema;
      if (str1 == null) {
        this.schema = "";
      } else {
        this.schema = str1;
      } 
      List<String> list1 = paramBuilder.masks;
      if (list1 == null) {
        this.masks = DEFAULT_MASKS;
      } else {
        this.masks = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.img_url = ((Builder)list).img_url;
      this.shape_type = ((Builder)list).shape_type;
      this.pendant_url = ((Builder)list).pendant_url;
      this.corner_url = ((Builder)list).corner_url;
      this.schema = ((Builder)list).schema;
      this.masks = Message.immutableCopyOf(((Builder)list).masks);
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedHeadImg> {
    public List<FeedKV> business_info;
    
    public String corner_url;
    
    public String img_url;
    
    public List<String> masks;
    
    public String pendant_url;
    
    public String schema;
    
    public Integer shape_type;
    
    public Builder() {}
    
    public Builder(FeedHeadImg param1FeedHeadImg) {
      super(param1FeedHeadImg);
      if (param1FeedHeadImg == null)
        return; 
      this.img_url = param1FeedHeadImg.img_url;
      this.shape_type = param1FeedHeadImg.shape_type;
      this.pendant_url = param1FeedHeadImg.pendant_url;
      this.corner_url = param1FeedHeadImg.corner_url;
      this.schema = param1FeedHeadImg.schema;
      this.masks = Message.copyOf(param1FeedHeadImg.masks);
      this.business_info = Message.copyOf(param1FeedHeadImg.business_info);
    }
    
    public FeedHeadImg build(boolean param1Boolean) {
      return new FeedHeadImg(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
