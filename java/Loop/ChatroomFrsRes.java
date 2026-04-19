package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ChatroomFrsRes extends Message {
  public static final List<Long> DEFAULT_HOT_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_HOT_LIST_ORIGIN_NUM;
  
  public static final List<ChatroomList> DEFAULT_ROOM_LIST = Collections.emptyList();
  
  @ProtoField(tag = 3)
  public final ChatroomGuide guide_config;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.INT64)
  public final List<Long> hot_list;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer hot_list_origin_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ChatroomList> room_list;
  
  static {
    DEFAULT_HOT_LIST_ORIGIN_NUM = Integer.valueOf(0);
  }
  
  public ChatroomFrsRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<Long> list1 = paramBuilder.hot_list;
      if (list1 == null) {
        this.hot_list = DEFAULT_HOT_LIST;
      } else {
        this.hot_list = Message.immutableCopyOf(list1);
      } 
      List<ChatroomList> list = paramBuilder.room_list;
      if (list == null) {
        this.room_list = DEFAULT_ROOM_LIST;
      } else {
        this.room_list = Message.immutableCopyOf(list);
      } 
      this.guide_config = paramBuilder.guide_config;
      integer = paramBuilder.hot_list_origin_num;
      if (integer == null) {
        this.hot_list_origin_num = DEFAULT_HOT_LIST_ORIGIN_NUM;
      } else {
        this.hot_list_origin_num = integer;
      } 
    } else {
      this.hot_list = Message.immutableCopyOf(((Builder)integer).hot_list);
      this.room_list = Message.immutableCopyOf(((Builder)integer).room_list);
      this.guide_config = ((Builder)integer).guide_config;
      this.hot_list_origin_num = ((Builder)integer).hot_list_origin_num;
    } 
  }
  
  public static final class Builder extends Message.Builder<ChatroomFrsRes> {
    public ChatroomGuide guide_config;
    
    public List<Long> hot_list;
    
    public Integer hot_list_origin_num;
    
    public List<ChatroomList> room_list;
    
    public Builder() {}
    
    public Builder(ChatroomFrsRes param1ChatroomFrsRes) {
      super(param1ChatroomFrsRes);
      if (param1ChatroomFrsRes == null)
        return; 
      this.hot_list = Message.copyOf(param1ChatroomFrsRes.hot_list);
      this.room_list = Message.copyOf(param1ChatroomFrsRes.room_list);
      this.guide_config = param1ChatroomFrsRes.guide_config;
      this.hot_list_origin_num = param1ChatroomFrsRes.hot_list_origin_num;
    }
    
    public ChatroomFrsRes build(boolean param1Boolean) {
      return new ChatroomFrsRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
