package tbclient.UserPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeedKV;
import tbclient.PostInfoList;
import tbclient.User;

public final class DataRes extends Message {
  public static final Long DEFAULT_CTIME;
  
  public static final Integer DEFAULT_HIDE_POST;
  
  public static final Long DEFAULT_LOGID;
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final Integer DEFAULT_MASK_TYPE;
  
  public static final List<PostInfoList> DEFAULT_POST_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_REDDOT_DELETED_THREAD;
  
  public static final Long DEFAULT_TIME;
  
  public static final Integer DEFAULT_VIEW_CARD_NUM;
  
  @ProtoField(tag = 10)
  public final User author;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long ctime;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer hide_post;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 11)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT64)
  public final Long logid;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer mask_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<PostInfoList> post_list;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer reddot_deleted_thread;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long time;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer view_card_num;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_HIDE_POST = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_TIME = long_;
    DEFAULT_CTIME = long_;
    DEFAULT_LOGID = long_;
    DEFAULT_MASK_TYPE = integer;
    DEFAULT_VIEW_CARD_NUM = integer;
    DEFAULT_REDDOT_DELETED_THREAD = integer;
    DEFAULT_LOG_PARAM = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      List<PostInfoList> list1 = paramBuilder.post_list;
      if (list1 == null) {
        this.post_list = DEFAULT_POST_LIST;
      } else {
        this.post_list = Message.immutableCopyOf(list1);
      } 
      Integer integer2 = paramBuilder.hide_post;
      if (integer2 == null) {
        this.hide_post = DEFAULT_HIDE_POST;
      } else {
        this.hide_post = integer2;
      } 
      Long long_ = paramBuilder.time;
      if (long_ == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = long_;
      } 
      long_ = paramBuilder.ctime;
      if (long_ == null) {
        this.ctime = DEFAULT_CTIME;
      } else {
        this.ctime = long_;
      } 
      long_ = paramBuilder.logid;
      if (long_ == null) {
        this.logid = DEFAULT_LOGID;
      } else {
        this.logid = long_;
      } 
      Integer integer1 = paramBuilder.mask_type;
      if (integer1 == null) {
        this.mask_type = DEFAULT_MASK_TYPE;
      } else {
        this.mask_type = integer1;
      } 
      integer1 = paramBuilder.view_card_num;
      if (integer1 == null) {
        this.view_card_num = DEFAULT_VIEW_CARD_NUM;
      } else {
        this.view_card_num = integer1;
      } 
      integer1 = paramBuilder.reddot_deleted_thread;
      if (integer1 == null) {
        this.reddot_deleted_thread = DEFAULT_REDDOT_DELETED_THREAD;
      } else {
        this.reddot_deleted_thread = integer1;
      } 
      this.author = paramBuilder.author;
      list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
    } else {
      this.post_list = Message.immutableCopyOf(((Builder)list).post_list);
      this.hide_post = ((Builder)list).hide_post;
      this.time = ((Builder)list).time;
      this.ctime = ((Builder)list).ctime;
      this.logid = ((Builder)list).logid;
      this.mask_type = ((Builder)list).mask_type;
      this.view_card_num = ((Builder)list).view_card_num;
      this.reddot_deleted_thread = ((Builder)list).reddot_deleted_thread;
      this.author = ((Builder)list).author;
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public User author;
    
    public Long ctime;
    
    public Integer hide_post;
    
    public List<FeedKV> log_param;
    
    public Long logid;
    
    public Integer mask_type;
    
    public List<PostInfoList> post_list;
    
    public Integer reddot_deleted_thread;
    
    public Long time;
    
    public Integer view_card_num;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.post_list = Message.copyOf(param1DataRes.post_list);
      this.hide_post = param1DataRes.hide_post;
      this.time = param1DataRes.time;
      this.ctime = param1DataRes.ctime;
      this.logid = param1DataRes.logid;
      this.mask_type = param1DataRes.mask_type;
      this.view_card_num = param1DataRes.view_card_num;
      this.reddot_deleted_thread = param1DataRes.reddot_deleted_thread;
      this.author = param1DataRes.author;
      this.log_param = Message.copyOf(param1DataRes.log_param);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
