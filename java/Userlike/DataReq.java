package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_AD_EXT_PARAMS = "";
  
  public static final Integer DEFAULT_FOLLOW_TYPE;
  
  public static final Integer DEFAULT_IS_NEWFEED;
  
  public static final Long DEFAULT_LAST_REQ_UNIX = Long.valueOf(0L);
  
  public static final Integer DEFAULT_LOAD_TYPE;
  
  public static final String DEFAULT_PAGE_TAG = "";
  
  public static final Integer DEFAULT_REQUEST_TIMES;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String ad_ext_params;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer follow_type;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_newfeed;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long last_req_unix;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer load_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String page_tag;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer request_times;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_FOLLOW_TYPE = integer;
    DEFAULT_LOAD_TYPE = integer;
    DEFAULT_IS_NEWFEED = integer;
    DEFAULT_REQUEST_TIMES = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str2 = paramBuilder.page_tag;
      if (str2 == null) {
        this.page_tag = "";
      } else {
        this.page_tag = str2;
      } 
      Long long_ = paramBuilder.last_req_unix;
      if (long_ == null) {
        this.last_req_unix = DEFAULT_LAST_REQ_UNIX;
      } else {
        this.last_req_unix = long_;
      } 
      Integer integer2 = paramBuilder.follow_type;
      if (integer2 == null) {
        this.follow_type = DEFAULT_FOLLOW_TYPE;
      } else {
        this.follow_type = integer2;
      } 
      integer2 = paramBuilder.load_type;
      if (integer2 == null) {
        this.load_type = DEFAULT_LOAD_TYPE;
      } else {
        this.load_type = integer2;
      } 
      String str1 = paramBuilder.ad_ext_params;
      if (str1 == null) {
        this.ad_ext_params = "";
      } else {
        this.ad_ext_params = str1;
      } 
      Integer integer1 = paramBuilder.is_newfeed;
      if (integer1 == null) {
        this.is_newfeed = DEFAULT_IS_NEWFEED;
      } else {
        this.is_newfeed = integer1;
      } 
      integer = paramBuilder.request_times;
      if (integer == null) {
        this.request_times = DEFAULT_REQUEST_TIMES;
      } else {
        this.request_times = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.page_tag = ((Builder)integer).page_tag;
      this.last_req_unix = ((Builder)integer).last_req_unix;
      this.follow_type = ((Builder)integer).follow_type;
      this.load_type = ((Builder)integer).load_type;
      this.ad_ext_params = ((Builder)integer).ad_ext_params;
      this.is_newfeed = ((Builder)integer).is_newfeed;
      this.request_times = ((Builder)integer).request_times;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public String ad_ext_params;
    
    public CommonReq common;
    
    public Integer follow_type;
    
    public Integer is_newfeed;
    
    public Long last_req_unix;
    
    public Integer load_type;
    
    public String page_tag;
    
    public Integer request_times;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.page_tag = param1DataReq.page_tag;
      this.last_req_unix = param1DataReq.last_req_unix;
      this.follow_type = param1DataReq.follow_type;
      this.load_type = param1DataReq.load_type;
      this.ad_ext_params = param1DataReq.ad_ext_params;
      this.is_newfeed = param1DataReq.is_newfeed;
      this.request_times = param1DataReq.request_times;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
