package tbclient.UrlParser;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CardLinkInfo;
import tbclient.PollInfo;

public final class DataRes extends Message {
  public static final String DEFAULT_DESCRIPTION = "";
  
  public static final String DEFAULT_IMAGE = "";
  
  public static final Integer DEFAULT_IS_KJS;
  
  public static final Integer DEFAULT_IS_LANDMINE;
  
  public static final Integer DEFAULT_IS_RECOGNIZE;
  
  public static final String DEFAULT_LINK_FROM = "";
  
  public static final String DEFAULT_PRICE_TXT = "";
  
  public static final String DEFAULT_SPEC = "";
  
  public static final Integer DEFAULT_STATUS;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TOTAL_NUM;
  
  public static final Integer DEFAULT_URL_TYPE;
  
  @ProtoField(tag = 9)
  public final CardLinkInfo card_link_info;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String description;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer is_kjs;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer is_landmine;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer is_recognize;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String link_from;
  
  @ProtoField(tag = 13)
  public final PollInfo poll_info;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String price_txt;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String spec;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer total_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer url_type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_URL_TYPE = integer;
    DEFAULT_STATUS = integer;
    DEFAULT_IS_RECOGNIZE = integer;
    DEFAULT_IS_LANDMINE = integer;
    DEFAULT_TOTAL_NUM = integer;
    DEFAULT_IS_KJS = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer3 = paramBuilder.url_type;
      if (integer3 == null) {
        this.url_type = DEFAULT_URL_TYPE;
      } else {
        this.url_type = integer3;
      } 
      integer3 = paramBuilder.status;
      if (integer3 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer3;
      } 
      String str2 = paramBuilder.image;
      if (str2 == null) {
        this.image = "";
      } else {
        this.image = str2;
      } 
      str2 = paramBuilder.link_from;
      if (str2 == null) {
        this.link_from = "";
      } else {
        this.link_from = str2;
      } 
      str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.price_txt;
      if (str2 == null) {
        this.price_txt = "";
      } else {
        this.price_txt = str2;
      } 
      Integer integer2 = paramBuilder.is_recognize;
      if (integer2 == null) {
        this.is_recognize = DEFAULT_IS_RECOGNIZE;
      } else {
        this.is_recognize = integer2;
      } 
      String str1 = paramBuilder.description;
      if (str1 == null) {
        this.description = "";
      } else {
        this.description = str1;
      } 
      this.card_link_info = paramBuilder.card_link_info;
      Integer integer1 = paramBuilder.is_landmine;
      if (integer1 == null) {
        this.is_landmine = DEFAULT_IS_LANDMINE;
      } else {
        this.is_landmine = integer1;
      } 
      integer1 = paramBuilder.total_num;
      if (integer1 == null) {
        this.total_num = DEFAULT_TOTAL_NUM;
      } else {
        this.total_num = integer1;
      } 
      this.poll_info = paramBuilder.poll_info;
      integer1 = paramBuilder.is_kjs;
      if (integer1 == null) {
        this.is_kjs = DEFAULT_IS_KJS;
      } else {
        this.is_kjs = integer1;
      } 
      str = paramBuilder.spec;
      if (str == null) {
        this.spec = "";
      } else {
        this.spec = str;
      } 
    } else {
      this.url_type = ((Builder)str).url_type;
      this.status = ((Builder)str).status;
      this.image = ((Builder)str).image;
      this.link_from = ((Builder)str).link_from;
      this.title = ((Builder)str).title;
      this.price_txt = ((Builder)str).price_txt;
      this.is_recognize = ((Builder)str).is_recognize;
      this.description = ((Builder)str).description;
      this.card_link_info = ((Builder)str).card_link_info;
      this.is_landmine = ((Builder)str).is_landmine;
      this.total_num = ((Builder)str).total_num;
      this.poll_info = ((Builder)str).poll_info;
      this.is_kjs = ((Builder)str).is_kjs;
      this.spec = ((Builder)str).spec;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public CardLinkInfo card_link_info;
    
    public String description;
    
    public String image;
    
    public Integer is_kjs;
    
    public Integer is_landmine;
    
    public Integer is_recognize;
    
    public String link_from;
    
    public PollInfo poll_info;
    
    public String price_txt;
    
    public String spec;
    
    public Integer status;
    
    public String title;
    
    public Integer total_num;
    
    public Integer url_type;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.url_type = param1DataRes.url_type;
      this.status = param1DataRes.status;
      this.image = param1DataRes.image;
      this.link_from = param1DataRes.link_from;
      this.title = param1DataRes.title;
      this.price_txt = param1DataRes.price_txt;
      this.is_recognize = param1DataRes.is_recognize;
      this.description = param1DataRes.description;
      this.card_link_info = param1DataRes.card_link_info;
      this.is_landmine = param1DataRes.is_landmine;
      this.total_num = param1DataRes.total_num;
      this.poll_info = param1DataRes.poll_info;
      this.is_kjs = param1DataRes.is_kjs;
      this.spec = param1DataRes.spec;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
