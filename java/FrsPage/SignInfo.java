package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ChatroomSignInfo;

public final class SignInfo extends Message {
  public static final Integer DEFAULT_HAS_CHATROOM_SIGN = Integer.valueOf(0);
  
  @ProtoField(tag = 4)
  public final ChatroomSignInfo chatroom_sign_info;
  
  @ProtoField(tag = 2)
  public final SignForum forum_info;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer has_chatroom_sign;
  
  @ProtoField(tag = 1)
  public final SignUser user_info;
  
  public SignInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.user_info = paramBuilder.user_info;
      this.forum_info = paramBuilder.forum_info;
      Integer integer = paramBuilder.has_chatroom_sign;
      if (integer == null) {
        this.has_chatroom_sign = DEFAULT_HAS_CHATROOM_SIGN;
      } else {
        this.has_chatroom_sign = integer;
      } 
      this.chatroom_sign_info = paramBuilder.chatroom_sign_info;
    } else {
      this.user_info = paramBuilder.user_info;
      this.forum_info = paramBuilder.forum_info;
      this.has_chatroom_sign = paramBuilder.has_chatroom_sign;
      this.chatroom_sign_info = paramBuilder.chatroom_sign_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<SignInfo> {
    public ChatroomSignInfo chatroom_sign_info;
    
    public SignForum forum_info;
    
    public Integer has_chatroom_sign;
    
    public SignUser user_info;
    
    public Builder() {}
    
    public Builder(SignInfo param1SignInfo) {
      super(param1SignInfo);
      if (param1SignInfo == null)
        return; 
      this.user_info = param1SignInfo.user_info;
      this.forum_info = param1SignInfo.forum_info;
      this.has_chatroom_sign = param1SignInfo.has_chatroom_sign;
      this.chatroom_sign_info = param1SignInfo.chatroom_sign_info;
    }
    
    public SignInfo build(boolean param1Boolean) {
      return new SignInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
