package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedAuthorSocial extends Message {
  public static final Integer DEFAULT_COMMENT_NUM;
  
  public static final Long DEFAULT_FID;
  
  public static final List<FeedHeadSymbol> DEFAULT_MAIN_DATA = Collections.emptyList();
  
  public static final List<LayoutManageInfo> DEFAULT_MANAGE_LIST;
  
  public static final Integer DEFAULT_SHARE_NUM;
  
  public static final Long DEFAULT_TID;
  
  @ProtoField(tag = 3)
  public final Agree agree;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer comment_num;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long fid;
  
  @ProtoField(tag = 1)
  public final FeedHeadImg image_data;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedHeadSymbol> main_data;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<LayoutManageInfo> manage_list;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer share_num;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long tid;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_COMMENT_NUM = integer;
    DEFAULT_SHARE_NUM = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_TID = long_;
    DEFAULT_FID = long_;
    DEFAULT_MANAGE_LIST = Collections.emptyList();
  }
  
  public FeedAuthorSocial(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<LayoutManageInfo> list;
    if (paramBoolean == true) {
      this.image_data = paramBuilder.image_data;
      List<FeedHeadSymbol> list1 = paramBuilder.main_data;
      if (list1 == null) {
        this.main_data = DEFAULT_MAIN_DATA;
      } else {
        this.main_data = Message.immutableCopyOf(list1);
      } 
      this.agree = paramBuilder.agree;
      Integer integer = paramBuilder.comment_num;
      if (integer == null) {
        this.comment_num = DEFAULT_COMMENT_NUM;
      } else {
        this.comment_num = integer;
      } 
      integer = paramBuilder.share_num;
      if (integer == null) {
        this.share_num = DEFAULT_SHARE_NUM;
      } else {
        this.share_num = integer;
      } 
      Long long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
      long_ = paramBuilder.fid;
      if (long_ == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_;
      } 
      list = paramBuilder.manage_list;
      if (list == null) {
        this.manage_list = DEFAULT_MANAGE_LIST;
      } else {
        this.manage_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.image_data = ((Builder)list).image_data;
      this.main_data = Message.immutableCopyOf(((Builder)list).main_data);
      this.agree = ((Builder)list).agree;
      this.comment_num = ((Builder)list).comment_num;
      this.share_num = ((Builder)list).share_num;
      this.tid = ((Builder)list).tid;
      this.fid = ((Builder)list).fid;
      this.manage_list = Message.immutableCopyOf(((Builder)list).manage_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedAuthorSocial> {
    public Agree agree;
    
    public Integer comment_num;
    
    public Long fid;
    
    public FeedHeadImg image_data;
    
    public List<FeedHeadSymbol> main_data;
    
    public List<LayoutManageInfo> manage_list;
    
    public Integer share_num;
    
    public Long tid;
    
    public Builder() {}
    
    public Builder(FeedAuthorSocial param1FeedAuthorSocial) {
      super(param1FeedAuthorSocial);
      if (param1FeedAuthorSocial == null)
        return; 
      this.image_data = param1FeedAuthorSocial.image_data;
      this.main_data = Message.copyOf(param1FeedAuthorSocial.main_data);
      this.agree = param1FeedAuthorSocial.agree;
      this.comment_num = param1FeedAuthorSocial.comment_num;
      this.share_num = param1FeedAuthorSocial.share_num;
      this.tid = param1FeedAuthorSocial.tid;
      this.fid = param1FeedAuthorSocial.fid;
      this.manage_list = Message.copyOf(param1FeedAuthorSocial.manage_list);
    }
    
    public FeedAuthorSocial build(boolean param1Boolean) {
      return new FeedAuthorSocial(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
