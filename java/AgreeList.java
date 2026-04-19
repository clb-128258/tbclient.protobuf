package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AgreeList extends Message {
  public static final Long DEFAULT_ID;
  
  public static final Integer DEFAULT_IS_DEL;
  
  public static final Integer DEFAULT_SNAPSHOOT_PIC_ID;
  
  public static final String DEFAULT_TARGET_SCHEME = "";
  
  public static final Integer DEFAULT_TIME;
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_VIRTUAL_IMAGE_URL = "";
  
  @ProtoField(tag = 8)
  public final User agreeer;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_del;
  
  @ProtoField(tag = 9)
  public final Post post_info;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer snapshoot_pic_id;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String target_scheme;
  
  @ProtoField(tag = 1)
  public final ThreadInfo thread_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer time;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String virtual_image_url;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TIME = integer;
    DEFAULT_IS_DEL = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_ID = Long.valueOf(0L);
    DEFAULT_SNAPSHOOT_PIC_ID = integer;
  }
  
  public AgreeList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.thread_info = paramBuilder.thread_info;
      Integer integer2 = paramBuilder.time;
      if (integer2 == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer2;
      } 
      integer2 = paramBuilder.is_del;
      if (integer2 == null) {
        this.is_del = DEFAULT_IS_DEL;
      } else {
        this.is_del = integer2;
      } 
      integer2 = paramBuilder.type;
      if (integer2 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer2;
      } 
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      this.agreeer = paramBuilder.agreeer;
      this.post_info = paramBuilder.post_info;
      String str1 = paramBuilder.virtual_image_url;
      if (str1 == null) {
        this.virtual_image_url = "";
      } else {
        this.virtual_image_url = str1;
      } 
      Integer integer1 = paramBuilder.snapshoot_pic_id;
      if (integer1 == null) {
        this.snapshoot_pic_id = DEFAULT_SNAPSHOOT_PIC_ID;
      } else {
        this.snapshoot_pic_id = integer1;
      } 
      str = paramBuilder.target_scheme;
      if (str == null) {
        this.target_scheme = "";
      } else {
        this.target_scheme = str;
      } 
    } else {
      this.thread_info = ((Builder)str).thread_info;
      this.time = ((Builder)str).time;
      this.is_del = ((Builder)str).is_del;
      this.type = ((Builder)str).type;
      this.id = ((Builder)str).id;
      this.agreeer = ((Builder)str).agreeer;
      this.post_info = ((Builder)str).post_info;
      this.virtual_image_url = ((Builder)str).virtual_image_url;
      this.snapshoot_pic_id = ((Builder)str).snapshoot_pic_id;
      this.target_scheme = ((Builder)str).target_scheme;
    } 
  }
  
  public static final class Builder extends Message.Builder<AgreeList> {
    public User agreeer;
    
    public Long id;
    
    public Integer is_del;
    
    public Post post_info;
    
    public Integer snapshoot_pic_id;
    
    public String target_scheme;
    
    public ThreadInfo thread_info;
    
    public Integer time;
    
    public Integer type;
    
    public String virtual_image_url;
    
    public Builder() {}
    
    public Builder(AgreeList param1AgreeList) {
      super(param1AgreeList);
      if (param1AgreeList == null)
        return; 
      this.thread_info = param1AgreeList.thread_info;
      this.time = param1AgreeList.time;
      this.is_del = param1AgreeList.is_del;
      this.type = param1AgreeList.type;
      this.id = param1AgreeList.id;
      this.agreeer = param1AgreeList.agreeer;
      this.post_info = param1AgreeList.post_info;
      this.virtual_image_url = param1AgreeList.virtual_image_url;
      this.snapshoot_pic_id = param1AgreeList.snapshoot_pic_id;
      this.target_scheme = param1AgreeList.target_scheme;
    }
    
    public AgreeList build(boolean param1Boolean) {
      return new AgreeList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
