package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_CHATROOM_ID;
  
  public static final Integer DEFAULT_CHATROOM_MASK;
  
  public static final String DEFAULT_CHATROOM_NEW_MSG = "";
  
  public static final String DEFAULT_DATA_TYPE = "";
  
  public static final Long DEFAULT_FID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_UNIQ_ID = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long chatroom_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer chatroom_mask;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String chatroom_new_msg;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String data_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long fid;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String uniq_id;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FID = long_;
    DEFAULT_CHATROOM_ID = long_;
    DEFAULT_CHATROOM_MASK = Integer.valueOf(0);
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str2 = paramBuilder.data_type;
      if (str2 == null) {
        this.data_type = "";
      } else {
        this.data_type = str2;
      } 
      str2 = paramBuilder.chatroom_new_msg;
      if (str2 == null) {
        this.chatroom_new_msg = "";
      } else {
        this.chatroom_new_msg = str2;
      } 
      Long long_ = paramBuilder.fid;
      if (long_ == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_;
      } 
      long_ = paramBuilder.chatroom_id;
      if (long_ == null) {
        this.chatroom_id = DEFAULT_CHATROOM_ID;
      } else {
        this.chatroom_id = long_;
      } 
      String str1 = paramBuilder.uniq_id;
      if (str1 == null) {
        this.uniq_id = "";
      } else {
        this.uniq_id = str1;
      } 
      str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      integer = paramBuilder.chatroom_mask;
      if (integer == null) {
        this.chatroom_mask = DEFAULT_CHATROOM_MASK;
      } else {
        this.chatroom_mask = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.data_type = ((Builder)integer).data_type;
      this.chatroom_new_msg = ((Builder)integer).chatroom_new_msg;
      this.fid = ((Builder)integer).fid;
      this.chatroom_id = ((Builder)integer).chatroom_id;
      this.uniq_id = ((Builder)integer).uniq_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.chatroom_mask = ((Builder)integer).chatroom_mask;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public Long chatroom_id;
    
    public Integer chatroom_mask;
    
    public String chatroom_new_msg;
    
    public CommonReq common;
    
    public String data_type;
    
    public Long fid;
    
    public String forum_name;
    
    public String uniq_id;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.data_type = param1DataReq.data_type;
      this.chatroom_new_msg = param1DataReq.chatroom_new_msg;
      this.fid = param1DataReq.fid;
      this.chatroom_id = param1DataReq.chatroom_id;
      this.uniq_id = param1DataReq.uniq_id;
      this.forum_name = param1DataReq.forum_name;
      this.chatroom_mask = param1DataReq.chatroom_mask;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
