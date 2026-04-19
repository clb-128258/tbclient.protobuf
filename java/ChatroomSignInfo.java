package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ChatroomSignInfo extends Message {
  public static final Long DEFAULT_CHATROOM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_GUIDE_TEXT = "";
  
  public static final String DEFAULT_JUMP_SCHEME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long chatroom_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String guide_text;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String jump_scheme;
  
  public ChatroomSignInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.chatroom_id;
      if (long_ == null) {
        this.chatroom_id = DEFAULT_CHATROOM_ID;
      } else {
        this.chatroom_id = long_;
      } 
      String str1 = paramBuilder.jump_scheme;
      if (str1 == null) {
        this.jump_scheme = "";
      } else {
        this.jump_scheme = str1;
      } 
      str = paramBuilder.guide_text;
      if (str == null) {
        this.guide_text = "";
      } else {
        this.guide_text = str;
      } 
    } else {
      this.chatroom_id = ((Builder)str).chatroom_id;
      this.jump_scheme = ((Builder)str).jump_scheme;
      this.guide_text = ((Builder)str).guide_text;
    } 
  }
  
  public static final class Builder extends Message.Builder<ChatroomSignInfo> {
    public Long chatroom_id;
    
    public String guide_text;
    
    public String jump_scheme;
    
    public Builder() {}
    
    public Builder(ChatroomSignInfo param1ChatroomSignInfo) {
      super(param1ChatroomSignInfo);
      if (param1ChatroomSignInfo == null)
        return; 
      this.chatroom_id = param1ChatroomSignInfo.chatroom_id;
      this.jump_scheme = param1ChatroomSignInfo.jump_scheme;
      this.guide_text = param1ChatroomSignInfo.guide_text;
    }
    
    public ChatroomSignInfo build(boolean param1Boolean) {
      return new ChatroomSignInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
