package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class UserAttrIcon extends Message {
  public static final String DEFAULT_COMMENT = "";
  
  public static final Integer DEFAULT_DEGRADE_HEIGHT;
  
  public static final String DEFAULT_DEGRADE_IMG_SRC = "";
  
  public static final Integer DEFAULT_DEGRADE_WIDTH;
  
  public static final List<UserIconExtAttr> DEFAULT_EXT_ATTR;
  
  public static final Integer DEFAULT_HEIGHT;
  
  public static final String DEFAULT_IMG_SRC = "";
  
  public static final String DEFAULT_LINK_URL = "";
  
  public static final Integer DEFAULT_PREFIX_HEIGHT;
  
  public static final String DEFAULT_PREFIX_IMG_SRC = "";
  
  public static final Integer DEFAULT_PREFIX_WIDTH;
  
  public static final Integer DEFAULT_SHOW_TYPE;
  
  public static final String DEFAULT_SUB_TYPE = "";
  
  public static final String DEFAULT_TEXT = "";
  
  public static final String DEFAULT_TYPE = "";
  
  public static final Integer DEFAULT_WIDTH;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String comment;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer degrade_height;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String degrade_img_src;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer degrade_width;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<UserIconExtAttr> ext_attr;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer height;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String img_src;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String link_url;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer prefix_height;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String prefix_img_src;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer prefix_width;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer show_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String sub_type;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String type;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer width;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_HEIGHT = integer;
    DEFAULT_WIDTH = integer;
    DEFAULT_EXT_ATTR = Collections.emptyList();
    DEFAULT_SHOW_TYPE = integer;
    DEFAULT_DEGRADE_HEIGHT = integer;
    DEFAULT_DEGRADE_WIDTH = integer;
    DEFAULT_PREFIX_HEIGHT = integer;
    DEFAULT_PREFIX_WIDTH = integer;
  }
  
  public UserAttrIcon(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str3 = paramBuilder.type;
      if (str3 == null) {
        this.type = "";
      } else {
        this.type = str3;
      } 
      str3 = paramBuilder.sub_type;
      if (str3 == null) {
        this.sub_type = "";
      } else {
        this.sub_type = str3;
      } 
      str3 = paramBuilder.comment;
      if (str3 == null) {
        this.comment = "";
      } else {
        this.comment = str3;
      } 
      str3 = paramBuilder.img_src;
      if (str3 == null) {
        this.img_src = "";
      } else {
        this.img_src = str3;
      } 
      str3 = paramBuilder.link_url;
      if (str3 == null) {
        this.link_url = "";
      } else {
        this.link_url = str3;
      } 
      Integer integer4 = paramBuilder.height;
      if (integer4 == null) {
        this.height = DEFAULT_HEIGHT;
      } else {
        this.height = integer4;
      } 
      integer4 = paramBuilder.width;
      if (integer4 == null) {
        this.width = DEFAULT_WIDTH;
      } else {
        this.width = integer4;
      } 
      List<UserIconExtAttr> list = paramBuilder.ext_attr;
      if (list == null) {
        this.ext_attr = DEFAULT_EXT_ATTR;
      } else {
        this.ext_attr = Message.immutableCopyOf(list);
      } 
      Integer integer3 = paramBuilder.show_type;
      if (integer3 == null) {
        this.show_type = DEFAULT_SHOW_TYPE;
      } else {
        this.show_type = integer3;
      } 
      String str2 = paramBuilder.degrade_img_src;
      if (str2 == null) {
        this.degrade_img_src = "";
      } else {
        this.degrade_img_src = str2;
      } 
      Integer integer2 = paramBuilder.degrade_height;
      if (integer2 == null) {
        this.degrade_height = DEFAULT_DEGRADE_HEIGHT;
      } else {
        this.degrade_height = integer2;
      } 
      integer2 = paramBuilder.degrade_width;
      if (integer2 == null) {
        this.degrade_width = DEFAULT_DEGRADE_WIDTH;
      } else {
        this.degrade_width = integer2;
      } 
      String str1 = paramBuilder.prefix_img_src;
      if (str1 == null) {
        this.prefix_img_src = "";
      } else {
        this.prefix_img_src = str1;
      } 
      Integer integer1 = paramBuilder.prefix_height;
      if (integer1 == null) {
        this.prefix_height = DEFAULT_PREFIX_HEIGHT;
      } else {
        this.prefix_height = integer1;
      } 
      integer1 = paramBuilder.prefix_width;
      if (integer1 == null) {
        this.prefix_width = DEFAULT_PREFIX_WIDTH;
      } else {
        this.prefix_width = integer1;
      } 
      str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.sub_type = ((Builder)str).sub_type;
      this.comment = ((Builder)str).comment;
      this.img_src = ((Builder)str).img_src;
      this.link_url = ((Builder)str).link_url;
      this.height = ((Builder)str).height;
      this.width = ((Builder)str).width;
      this.ext_attr = Message.immutableCopyOf(((Builder)str).ext_attr);
      this.show_type = ((Builder)str).show_type;
      this.degrade_img_src = ((Builder)str).degrade_img_src;
      this.degrade_height = ((Builder)str).degrade_height;
      this.degrade_width = ((Builder)str).degrade_width;
      this.prefix_img_src = ((Builder)str).prefix_img_src;
      this.prefix_height = ((Builder)str).prefix_height;
      this.prefix_width = ((Builder)str).prefix_width;
      this.text = ((Builder)str).text;
    } 
  }
  
  public static final class Builder extends Message.Builder<UserAttrIcon> {
    public String comment;
    
    public Integer degrade_height;
    
    public String degrade_img_src;
    
    public Integer degrade_width;
    
    public List<UserIconExtAttr> ext_attr;
    
    public Integer height;
    
    public String img_src;
    
    public String link_url;
    
    public Integer prefix_height;
    
    public String prefix_img_src;
    
    public Integer prefix_width;
    
    public Integer show_type;
    
    public String sub_type;
    
    public String text;
    
    public String type;
    
    public Integer width;
    
    public Builder() {}
    
    public Builder(UserAttrIcon param1UserAttrIcon) {
      super(param1UserAttrIcon);
      if (param1UserAttrIcon == null)
        return; 
      this.type = param1UserAttrIcon.type;
      this.sub_type = param1UserAttrIcon.sub_type;
      this.comment = param1UserAttrIcon.comment;
      this.img_src = param1UserAttrIcon.img_src;
      this.link_url = param1UserAttrIcon.link_url;
      this.height = param1UserAttrIcon.height;
      this.width = param1UserAttrIcon.width;
      this.ext_attr = Message.copyOf(param1UserAttrIcon.ext_attr);
      this.show_type = param1UserAttrIcon.show_type;
      this.degrade_img_src = param1UserAttrIcon.degrade_img_src;
      this.degrade_height = param1UserAttrIcon.degrade_height;
      this.degrade_width = param1UserAttrIcon.degrade_width;
      this.prefix_img_src = param1UserAttrIcon.prefix_img_src;
      this.prefix_height = param1UserAttrIcon.prefix_height;
      this.prefix_width = param1UserAttrIcon.prefix_width;
      this.text = param1UserAttrIcon.text;
    }
    
    public UserAttrIcon build(boolean param1Boolean) {
      return new UserAttrIcon(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
