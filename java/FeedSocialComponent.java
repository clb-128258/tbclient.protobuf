package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedSocialComponent extends Message {
  public static final Integer DEFAULT_AGREE_LONG_CLICK;
  
  public static final List<FeedContentIcon> DEFAULT_AGREE_LONG_CLICK_ANIMATION;
  
  public static final Integer DEFAULT_COMMENT_NUM;
  
  public static final String DEFAULT_COMMENT_SCHEME = "";
  
  public static final Long DEFAULT_EID;
  
  public static final String DEFAULT_ETYPE = "";
  
  public static final Long DEFAULT_FID;
  
  public static final Long DEFAULT_FIRST_POST_ID;
  
  public static final Integer DEFAULT_IS_GRAYREPLY;
  
  public static final Integer DEFAULT_IS_GRAYSHARE;
  
  public static final Integer DEFAULT_IS_STORE;
  
  public static final List<LayoutManageInfo> DEFAULT_MANAGE_LIST;
  
  public static final Integer DEFAULT_SHARE_NUM;
  
  public static final Long DEFAULT_TID;
  
  @ProtoField(tag = 1)
  public final Agree agree;
  
  @ProtoField(tag = 17)
  public final FeedContentIcon agree_animation;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer agree_long_click;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 22)
  public final List<FeedContentIcon> agree_long_click_animation;
  
  @ProtoField(tag = 15)
  public final FeedContentIcon agree_resource;
  
  @ProtoField(tag = 16)
  public final FeedContentColor agree_selected_color;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer comment_num;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String comment_scheme;
  
  @ProtoField(tag = 20, type = Message.Datatype.UINT64)
  public final Long eid;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String etype;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT64)
  public final Long fid;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long first_post_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_grayreply;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer is_grayshare;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer is_store;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<LayoutManageInfo> manage_list;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer share_num;
  
  @ProtoField(tag = 21)
  public final FeedShareShowData share_show_data;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long tid;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_COMMENT_NUM = integer;
    DEFAULT_SHARE_NUM = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_TID = long_;
    DEFAULT_FID = long_;
    DEFAULT_MANAGE_LIST = Collections.emptyList();
    DEFAULT_IS_GRAYREPLY = integer;
    DEFAULT_IS_GRAYSHARE = integer;
    DEFAULT_IS_STORE = integer;
    DEFAULT_FIRST_POST_ID = long_;
    DEFAULT_AGREE_LONG_CLICK = integer;
    DEFAULT_EID = long_;
    DEFAULT_AGREE_LONG_CLICK_ANIMATION = Collections.emptyList();
  }
  
  public FeedSocialComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedContentIcon> list;
    if (paramBoolean == true) {
      this.agree = paramBuilder.agree;
      Integer integer3 = paramBuilder.comment_num;
      if (integer3 == null) {
        this.comment_num = DEFAULT_COMMENT_NUM;
      } else {
        this.comment_num = integer3;
      } 
      integer3 = paramBuilder.share_num;
      if (integer3 == null) {
        this.share_num = DEFAULT_SHARE_NUM;
      } else {
        this.share_num = integer3;
      } 
      Long long_3 = paramBuilder.tid;
      if (long_3 == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_3;
      } 
      long_3 = paramBuilder.fid;
      if (long_3 == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_3;
      } 
      List<LayoutManageInfo> list1 = paramBuilder.manage_list;
      if (list1 == null) {
        this.manage_list = DEFAULT_MANAGE_LIST;
      } else {
        this.manage_list = Message.immutableCopyOf(list1);
      } 
      Integer integer2 = paramBuilder.is_grayreply;
      if (integer2 == null) {
        this.is_grayreply = DEFAULT_IS_GRAYREPLY;
      } else {
        this.is_grayreply = integer2;
      } 
      integer2 = paramBuilder.is_grayshare;
      if (integer2 == null) {
        this.is_grayshare = DEFAULT_IS_GRAYSHARE;
      } else {
        this.is_grayshare = integer2;
      } 
      integer2 = paramBuilder.is_store;
      if (integer2 == null) {
        this.is_store = DEFAULT_IS_STORE;
      } else {
        this.is_store = integer2;
      } 
      Long long_2 = paramBuilder.first_post_id;
      if (long_2 == null) {
        this.first_post_id = DEFAULT_FIRST_POST_ID;
      } else {
        this.first_post_id = long_2;
      } 
      String str2 = paramBuilder.comment_scheme;
      if (str2 == null) {
        this.comment_scheme = "";
      } else {
        this.comment_scheme = str2;
      } 
      this.agree_resource = paramBuilder.agree_resource;
      this.agree_selected_color = paramBuilder.agree_selected_color;
      this.agree_animation = paramBuilder.agree_animation;
      Integer integer1 = paramBuilder.agree_long_click;
      if (integer1 == null) {
        this.agree_long_click = DEFAULT_AGREE_LONG_CLICK;
      } else {
        this.agree_long_click = integer1;
      } 
      String str1 = paramBuilder.etype;
      if (str1 == null) {
        this.etype = "";
      } else {
        this.etype = str1;
      } 
      Long long_1 = paramBuilder.eid;
      if (long_1 == null) {
        this.eid = DEFAULT_EID;
      } else {
        this.eid = long_1;
      } 
      this.share_show_data = paramBuilder.share_show_data;
      list = paramBuilder.agree_long_click_animation;
      if (list == null) {
        this.agree_long_click_animation = DEFAULT_AGREE_LONG_CLICK_ANIMATION;
      } else {
        this.agree_long_click_animation = Message.immutableCopyOf(list);
      } 
    } else {
      this.agree = ((Builder)list).agree;
      this.comment_num = ((Builder)list).comment_num;
      this.share_num = ((Builder)list).share_num;
      this.tid = ((Builder)list).tid;
      this.fid = ((Builder)list).fid;
      this.manage_list = Message.immutableCopyOf(((Builder)list).manage_list);
      this.is_grayreply = ((Builder)list).is_grayreply;
      this.is_grayshare = ((Builder)list).is_grayshare;
      this.is_store = ((Builder)list).is_store;
      this.first_post_id = ((Builder)list).first_post_id;
      this.comment_scheme = ((Builder)list).comment_scheme;
      this.agree_resource = ((Builder)list).agree_resource;
      this.agree_selected_color = ((Builder)list).agree_selected_color;
      this.agree_animation = ((Builder)list).agree_animation;
      this.agree_long_click = ((Builder)list).agree_long_click;
      this.etype = ((Builder)list).etype;
      this.eid = ((Builder)list).eid;
      this.share_show_data = ((Builder)list).share_show_data;
      this.agree_long_click_animation = Message.immutableCopyOf(((Builder)list).agree_long_click_animation);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedSocialComponent> {
    public Agree agree;
    
    public FeedContentIcon agree_animation;
    
    public Integer agree_long_click;
    
    public List<FeedContentIcon> agree_long_click_animation;
    
    public FeedContentIcon agree_resource;
    
    public FeedContentColor agree_selected_color;
    
    public Integer comment_num;
    
    public String comment_scheme;
    
    public Long eid;
    
    public String etype;
    
    public Long fid;
    
    public Long first_post_id;
    
    public Integer is_grayreply;
    
    public Integer is_grayshare;
    
    public Integer is_store;
    
    public List<LayoutManageInfo> manage_list;
    
    public Integer share_num;
    
    public FeedShareShowData share_show_data;
    
    public Long tid;
    
    public Builder() {}
    
    public Builder(FeedSocialComponent param1FeedSocialComponent) {
      super(param1FeedSocialComponent);
      if (param1FeedSocialComponent == null)
        return; 
      this.agree = param1FeedSocialComponent.agree;
      this.comment_num = param1FeedSocialComponent.comment_num;
      this.share_num = param1FeedSocialComponent.share_num;
      this.tid = param1FeedSocialComponent.tid;
      this.fid = param1FeedSocialComponent.fid;
      this.manage_list = Message.copyOf(param1FeedSocialComponent.manage_list);
      this.is_grayreply = param1FeedSocialComponent.is_grayreply;
      this.is_grayshare = param1FeedSocialComponent.is_grayshare;
      this.is_store = param1FeedSocialComponent.is_store;
      this.first_post_id = param1FeedSocialComponent.first_post_id;
      this.comment_scheme = param1FeedSocialComponent.comment_scheme;
      this.agree_resource = param1FeedSocialComponent.agree_resource;
      this.agree_selected_color = param1FeedSocialComponent.agree_selected_color;
      this.agree_animation = param1FeedSocialComponent.agree_animation;
      this.agree_long_click = param1FeedSocialComponent.agree_long_click;
      this.etype = param1FeedSocialComponent.etype;
      this.eid = param1FeedSocialComponent.eid;
      this.share_show_data = param1FeedSocialComponent.share_show_data;
      this.agree_long_click_animation = Message.copyOf(param1FeedSocialComponent.agree_long_click_animation);
    }
    
    public FeedSocialComponent build(boolean param1Boolean) {
      return new FeedSocialComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
