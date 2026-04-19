package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class PbLinkInfo extends Message {
  public static final Integer DEFAULT_CAN_ENTER;
  
  public static final String DEFAULT_CONTENT1 = "";
  
  public static final String DEFAULT_CONTENT2 = "";
  
  public static final String DEFAULT_EXT_TXT = "";
  
  public static final Long DEFAULT_ID;
  
  public static final String DEFAULT_LINK_FROM = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final String DEFAULT_RIGHT_CONTENT = "";
  
  public static final String DEFAULT_RIGHT_ICON = "";
  
  public static final List<String> DEFAULT_RIGHT_IMGS;
  
  public static final Integer DEFAULT_SORT;
  
  public static final Integer DEFAULT_STATUS;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TO_URL = "";
  
  public static final Integer DEFAULT_URL_TYPE;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer can_enter;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String content1;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String content2;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String ext_txt;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String link_from;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String right_content;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String right_icon;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 10, type = Message.Datatype.STRING)
  public final List<String> right_imgs;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer sort;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String to_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer url_type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SORT = integer;
    DEFAULT_URL_TYPE = integer;
    DEFAULT_RIGHT_IMGS = Collections.emptyList();
    DEFAULT_CAN_ENTER = integer;
    DEFAULT_STATUS = integer;
    DEFAULT_ID = Long.valueOf(0L);
  }
  
  public PbLinkInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      str3 = paramBuilder.to_url;
      if (str3 == null) {
        this.to_url = "";
      } else {
        this.to_url = str3;
      } 
      str3 = paramBuilder.pic_url;
      if (str3 == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str3;
      } 
      str3 = paramBuilder.link_from;
      if (str3 == null) {
        this.link_from = "";
      } else {
        this.link_from = str3;
      } 
      str3 = paramBuilder.ext_txt;
      if (str3 == null) {
        this.ext_txt = "";
      } else {
        this.ext_txt = str3;
      } 
      Integer integer2 = paramBuilder.sort;
      if (integer2 == null) {
        this.sort = DEFAULT_SORT;
      } else {
        this.sort = integer2;
      } 
      integer2 = paramBuilder.url_type;
      if (integer2 == null) {
        this.url_type = DEFAULT_URL_TYPE;
      } else {
        this.url_type = integer2;
      } 
      String str2 = paramBuilder.content1;
      if (str2 == null) {
        this.content1 = "";
      } else {
        this.content1 = str2;
      } 
      str2 = paramBuilder.content2;
      if (str2 == null) {
        this.content2 = "";
      } else {
        this.content2 = str2;
      } 
      List<String> list = paramBuilder.right_imgs;
      if (list == null) {
        this.right_imgs = DEFAULT_RIGHT_IMGS;
      } else {
        this.right_imgs = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.right_content;
      if (str1 == null) {
        this.right_content = "";
      } else {
        this.right_content = str1;
      } 
      str1 = paramBuilder.right_icon;
      if (str1 == null) {
        this.right_icon = "";
      } else {
        this.right_icon = str1;
      } 
      Integer integer1 = paramBuilder.can_enter;
      if (integer1 == null) {
        this.can_enter = DEFAULT_CAN_ENTER;
      } else {
        this.can_enter = integer1;
      } 
      integer1 = paramBuilder.status;
      if (integer1 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer1;
      } 
      long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
    } else {
      this.title = ((Builder)long_).title;
      this.to_url = ((Builder)long_).to_url;
      this.pic_url = ((Builder)long_).pic_url;
      this.link_from = ((Builder)long_).link_from;
      this.ext_txt = ((Builder)long_).ext_txt;
      this.sort = ((Builder)long_).sort;
      this.url_type = ((Builder)long_).url_type;
      this.content1 = ((Builder)long_).content1;
      this.content2 = ((Builder)long_).content2;
      this.right_imgs = Message.immutableCopyOf(((Builder)long_).right_imgs);
      this.right_content = ((Builder)long_).right_content;
      this.right_icon = ((Builder)long_).right_icon;
      this.can_enter = ((Builder)long_).can_enter;
      this.status = ((Builder)long_).status;
      this.id = ((Builder)long_).id;
    } 
  }
  
  public static final class Builder extends Message.Builder<PbLinkInfo> {
    public Integer can_enter;
    
    public String content1;
    
    public String content2;
    
    public String ext_txt;
    
    public Long id;
    
    public String link_from;
    
    public String pic_url;
    
    public String right_content;
    
    public String right_icon;
    
    public List<String> right_imgs;
    
    public Integer sort;
    
    public Integer status;
    
    public String title;
    
    public String to_url;
    
    public Integer url_type;
    
    public Builder() {}
    
    public Builder(PbLinkInfo param1PbLinkInfo) {
      super(param1PbLinkInfo);
      if (param1PbLinkInfo == null)
        return; 
      this.title = param1PbLinkInfo.title;
      this.to_url = param1PbLinkInfo.to_url;
      this.pic_url = param1PbLinkInfo.pic_url;
      this.link_from = param1PbLinkInfo.link_from;
      this.ext_txt = param1PbLinkInfo.ext_txt;
      this.sort = param1PbLinkInfo.sort;
      this.url_type = param1PbLinkInfo.url_type;
      this.content1 = param1PbLinkInfo.content1;
      this.content2 = param1PbLinkInfo.content2;
      this.right_imgs = Message.copyOf(param1PbLinkInfo.right_imgs);
      this.right_content = param1PbLinkInfo.right_content;
      this.right_icon = param1PbLinkInfo.right_icon;
      this.can_enter = param1PbLinkInfo.can_enter;
      this.status = param1PbLinkInfo.status;
      this.id = param1PbLinkInfo.id;
    }
    
    public PbLinkInfo build(boolean param1Boolean) {
      return new PbLinkInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
