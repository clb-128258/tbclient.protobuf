package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ChatroomInfoBasic extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final Integer DEFAULT_BTN_TYPE;
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_UNREAD_NUM = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer btn_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String unread_num;
  
  static {
    DEFAULT_BTN_TYPE = Integer.valueOf(0);
  }
  
  public ChatroomInfoBasic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      String str = paramBuilder.forum_name;
      if (str == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str;
      } 
      str = paramBuilder.avatar;
      if (str == null) {
        this.avatar = "";
      } else {
        this.avatar = str;
      } 
      str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      str = paramBuilder.unread_num;
      if (str == null) {
        this.unread_num = "";
      } else {
        this.unread_num = str;
      } 
      integer = paramBuilder.btn_type;
      if (integer == null) {
        this.btn_type = DEFAULT_BTN_TYPE;
      } else {
        this.btn_type = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.avatar = ((Builder)integer).avatar;
      this.name = ((Builder)integer).name;
      this.unread_num = ((Builder)integer).unread_num;
      this.btn_type = ((Builder)integer).btn_type;
    } 
  }
  
  public static final class Builder extends Message.Builder<ChatroomInfoBasic> {
    public String avatar;
    
    public Integer btn_type;
    
    public Long forum_id;
    
    public String forum_name;
    
    public String name;
    
    public String unread_num;
    
    public Builder() {}
    
    public Builder(ChatroomInfoBasic param1ChatroomInfoBasic) {
      super(param1ChatroomInfoBasic);
      if (param1ChatroomInfoBasic == null)
        return; 
      this.forum_id = param1ChatroomInfoBasic.forum_id;
      this.forum_name = param1ChatroomInfoBasic.forum_name;
      this.avatar = param1ChatroomInfoBasic.avatar;
      this.name = param1ChatroomInfoBasic.name;
      this.unread_num = param1ChatroomInfoBasic.unread_num;
      this.btn_type = param1ChatroomInfoBasic.btn_type;
    }
    
    public ChatroomInfoBasic build(boolean param1Boolean) {
      return new ChatroomInfoBasic(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
