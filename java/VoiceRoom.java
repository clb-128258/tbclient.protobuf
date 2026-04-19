package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class VoiceRoom extends Message {
  public static final Integer DEFAULT_IS_SUBCRIBED;
  
  public static final Long DEFAULT_JOINED_NUM;
  
  public static final Long DEFAULT_LEFT_RESERVED_TIME;
  
  public static final Long DEFAULT_RESERVED_NUM;
  
  public static final Long DEFAULT_RESERVED_TIME;
  
  public static final Long DEFAULT_ROOM_ID;
  
  public static final String DEFAULT_ROOM_NAME = "";
  
  public static final Integer DEFAULT_STATUS;
  
  public static final List<User> DEFAULT_TALKER = Collections.emptyList();
  
  public static final Long DEFAULT_TALKER_NUM;
  
  @ProtoField(tag = 4)
  public final User author;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer is_subcribed;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long joined_num;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT64)
  public final Long left_reserved_time;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long reserved_num;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT64)
  public final Long reserved_time;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long room_id;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String room_name;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer status;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<User> talker;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long talker_num;
  
  static {
    DEFAULT_JOINED_NUM = long_;
    DEFAULT_TALKER_NUM = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_STATUS = integer;
    DEFAULT_RESERVED_NUM = long_;
    DEFAULT_RESERVED_TIME = long_;
    DEFAULT_LEFT_RESERVED_TIME = long_;
    DEFAULT_IS_SUBCRIBED = integer;
  }
  
  public VoiceRoom(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.room_id;
      if (long_3 == null) {
        this.room_id = DEFAULT_ROOM_ID;
      } else {
        this.room_id = long_3;
      } 
      this.author = paramBuilder.author;
      List<User> list = paramBuilder.talker;
      if (list == null) {
        this.talker = DEFAULT_TALKER;
      } else {
        this.talker = Message.immutableCopyOf(list);
      } 
      Long long_2 = paramBuilder.joined_num;
      if (long_2 == null) {
        this.joined_num = DEFAULT_JOINED_NUM;
      } else {
        this.joined_num = long_2;
      } 
      long_2 = paramBuilder.talker_num;
      if (long_2 == null) {
        this.talker_num = DEFAULT_TALKER_NUM;
      } else {
        this.talker_num = long_2;
      } 
      Integer integer1 = paramBuilder.status;
      if (integer1 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer1;
      } 
      String str = paramBuilder.room_name;
      if (str == null) {
        this.room_name = "";
      } else {
        this.room_name = str;
      } 
      Long long_1 = paramBuilder.reserved_num;
      if (long_1 == null) {
        this.reserved_num = DEFAULT_RESERVED_NUM;
      } else {
        this.reserved_num = long_1;
      } 
      long_1 = paramBuilder.reserved_time;
      if (long_1 == null) {
        this.reserved_time = DEFAULT_RESERVED_TIME;
      } else {
        this.reserved_time = long_1;
      } 
      long_1 = paramBuilder.left_reserved_time;
      if (long_1 == null) {
        this.left_reserved_time = DEFAULT_LEFT_RESERVED_TIME;
      } else {
        this.left_reserved_time = long_1;
      } 
      integer = paramBuilder.is_subcribed;
      if (integer == null) {
        this.is_subcribed = DEFAULT_IS_SUBCRIBED;
      } else {
        this.is_subcribed = integer;
      } 
    } else {
      this.room_id = ((Builder)integer).room_id;
      this.author = ((Builder)integer).author;
      this.talker = Message.immutableCopyOf(((Builder)integer).talker);
      this.joined_num = ((Builder)integer).joined_num;
      this.talker_num = ((Builder)integer).talker_num;
      this.status = ((Builder)integer).status;
      this.room_name = ((Builder)integer).room_name;
      this.reserved_num = ((Builder)integer).reserved_num;
      this.reserved_time = ((Builder)integer).reserved_time;
      this.left_reserved_time = ((Builder)integer).left_reserved_time;
      this.is_subcribed = ((Builder)integer).is_subcribed;
    } 
  }
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_ROOM_ID = long_;
  }
  
  public static final class Builder extends Message.Builder<VoiceRoom> {
    public User author;
    
    public Integer is_subcribed;
    
    public Long joined_num;
    
    public Long left_reserved_time;
    
    public Long reserved_num;
    
    public Long reserved_time;
    
    public Long room_id;
    
    public String room_name;
    
    public Integer status;
    
    public List<User> talker;
    
    public Long talker_num;
    
    public Builder() {}
    
    public Builder(VoiceRoom param1VoiceRoom) {
      super(param1VoiceRoom);
      if (param1VoiceRoom == null)
        return; 
      this.room_id = param1VoiceRoom.room_id;
      this.author = param1VoiceRoom.author;
      this.talker = Message.copyOf(param1VoiceRoom.talker);
      this.joined_num = param1VoiceRoom.joined_num;
      this.talker_num = param1VoiceRoom.talker_num;
      this.status = param1VoiceRoom.status;
      this.room_name = param1VoiceRoom.room_name;
      this.reserved_num = param1VoiceRoom.reserved_num;
      this.reserved_time = param1VoiceRoom.reserved_time;
      this.left_reserved_time = param1VoiceRoom.left_reserved_time;
      this.is_subcribed = param1VoiceRoom.is_subcribed;
    }
    
    public VoiceRoom build(boolean param1Boolean) {
      return new VoiceRoom(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
