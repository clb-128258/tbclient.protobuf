package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FrsBottomChatroomBase extends Message {
  public static final Integer DEFAULT_DISPLAY_CHATROOM_COUNT;
  
  public static final Long DEFAULT_MID_GROUP_ID;
  
  public static final Long DEFAULT_ONLINE_NUMS;
  
  public static final List<ChatroomList> DEFAULT_ROOM_LIST = Collections.emptyList();
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer display_chatroom_count;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long mid_group_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long online_nums;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ChatroomList> room_list;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_MID_GROUP_ID = long_;
    DEFAULT_DISPLAY_CHATROOM_COUNT = Integer.valueOf(0);
    DEFAULT_ONLINE_NUMS = long_;
  }
  
  public FrsBottomChatroomBase(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      List<ChatroomList> list = paramBuilder.room_list;
      if (list == null) {
        this.room_list = DEFAULT_ROOM_LIST;
      } else {
        this.room_list = Message.immutableCopyOf(list);
      } 
      Long long_1 = paramBuilder.mid_group_id;
      if (long_1 == null) {
        this.mid_group_id = DEFAULT_MID_GROUP_ID;
      } else {
        this.mid_group_id = long_1;
      } 
      Integer integer = paramBuilder.display_chatroom_count;
      if (integer == null) {
        this.display_chatroom_count = DEFAULT_DISPLAY_CHATROOM_COUNT;
      } else {
        this.display_chatroom_count = integer;
      } 
      long_ = paramBuilder.online_nums;
      if (long_ == null) {
        this.online_nums = DEFAULT_ONLINE_NUMS;
      } else {
        this.online_nums = long_;
      } 
    } else {
      this.room_list = Message.immutableCopyOf(((Builder)long_).room_list);
      this.mid_group_id = ((Builder)long_).mid_group_id;
      this.display_chatroom_count = ((Builder)long_).display_chatroom_count;
      this.online_nums = ((Builder)long_).online_nums;
    } 
  }
  
  public static final class Builder extends Message.Builder<FrsBottomChatroomBase> {
    public Integer display_chatroom_count;
    
    public Long mid_group_id;
    
    public Long online_nums;
    
    public List<ChatroomList> room_list;
    
    public Builder() {}
    
    public Builder(FrsBottomChatroomBase param1FrsBottomChatroomBase) {
      super(param1FrsBottomChatroomBase);
      if (param1FrsBottomChatroomBase == null)
        return; 
      this.room_list = Message.copyOf(param1FrsBottomChatroomBase.room_list);
      this.mid_group_id = param1FrsBottomChatroomBase.mid_group_id;
      this.display_chatroom_count = param1FrsBottomChatroomBase.display_chatroom_count;
      this.online_nums = param1FrsBottomChatroomBase.online_nums;
    }
    
    public FrsBottomChatroomBase build(boolean param1Boolean) {
      return new FrsBottomChatroomBase(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
