package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_IS_NEWFRS = Integer.valueOf(0);
  
  @ProtoField(tag = 2)
  public final CommonReq common;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_newfrs;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      this.common = paramBuilder.common;
      integer = paramBuilder.is_newfrs;
      if (integer == null) {
        this.is_newfrs = DEFAULT_IS_NEWFRS;
      } else {
        this.is_newfrs = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.common = ((Builder)integer).common;
      this.is_newfrs = ((Builder)integer).is_newfrs;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Long forum_id;
    
    public Integer is_newfrs;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.forum_id = param1DataReq.forum_id;
      this.common = param1DataReq.common;
      this.is_newfrs = param1DataReq.is_newfrs;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
