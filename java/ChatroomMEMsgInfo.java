package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ChatroomMEMsgInfo extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_FROM_NAME = "";
  
  public static final Long DEFAULT_FROM_UID;
  
  public static final Long DEFAULT_MSG_ID;
  
  public static final Long DEFAULT_MSG_TIME;
  
  public static final String DEFAULT_SPECIAL_MSG = "";
  
  public static final String DEFAULT_SPECIAL_MSG_TYPE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String from_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long from_uid;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long msg_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long msg_time;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String special_msg;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String special_msg_type;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FROM_UID = long_;
    DEFAULT_MSG_ID = long_;
    DEFAULT_MSG_TIME = long_;
  }
  
  public ChatroomMEMsgInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.from_uid;
      if (long_2 == null) {
        this.from_uid = DEFAULT_FROM_UID;
      } else {
        this.from_uid = long_2;
      } 
      String str2 = paramBuilder.from_name;
      if (str2 == null) {
        this.from_name = "";
      } else {
        this.from_name = str2;
      } 
      str2 = paramBuilder.content;
      if (str2 == null) {
        this.content = "";
      } else {
        this.content = str2;
      } 
      Long long_1 = paramBuilder.msg_id;
      if (long_1 == null) {
        this.msg_id = DEFAULT_MSG_ID;
      } else {
        this.msg_id = long_1;
      } 
      String str1 = paramBuilder.special_msg;
      if (str1 == null) {
        this.special_msg = "";
      } else {
        this.special_msg = str1;
      } 
      str1 = paramBuilder.special_msg_type;
      if (str1 == null) {
        this.special_msg_type = "";
      } else {
        this.special_msg_type = str1;
      } 
      long_ = paramBuilder.msg_time;
      if (long_ == null) {
        this.msg_time = DEFAULT_MSG_TIME;
      } else {
        this.msg_time = long_;
      } 
    } else {
      this.from_uid = ((Builder)long_).from_uid;
      this.from_name = ((Builder)long_).from_name;
      this.content = ((Builder)long_).content;
      this.msg_id = ((Builder)long_).msg_id;
      this.special_msg = ((Builder)long_).special_msg;
      this.special_msg_type = ((Builder)long_).special_msg_type;
      this.msg_time = ((Builder)long_).msg_time;
    } 
  }
  
  public static final class Builder extends Message.Builder<ChatroomMEMsgInfo> {
    public String content;
    
    public String from_name;
    
    public Long from_uid;
    
    public Long msg_id;
    
    public Long msg_time;
    
    public String special_msg;
    
    public String special_msg_type;
    
    public Builder() {}
    
    public Builder(ChatroomMEMsgInfo param1ChatroomMEMsgInfo) {
      super(param1ChatroomMEMsgInfo);
      if (param1ChatroomMEMsgInfo == null)
        return; 
      this.from_uid = param1ChatroomMEMsgInfo.from_uid;
      this.from_name = param1ChatroomMEMsgInfo.from_name;
      this.content = param1ChatroomMEMsgInfo.content;
      this.msg_id = param1ChatroomMEMsgInfo.msg_id;
      this.special_msg = param1ChatroomMEMsgInfo.special_msg;
      this.special_msg_type = param1ChatroomMEMsgInfo.special_msg_type;
      this.msg_time = param1ChatroomMEMsgInfo.msg_time;
    }
    
    public ChatroomMEMsgInfo build(boolean param1Boolean) {
      return new ChatroomMEMsgInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
