package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class BawuRoleInfoPub extends Message {
  public static final String DEFAULT_AVATAR_URL = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_LEVEL_NAME = "";
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Integer DEFAULT_ROLE_ID;
  
  public static final String DEFAULT_ROLE_NAME = "";
  
  public static final List<UserAttrIcon> DEFAULT_SHOW_ICON_LIST;
  
  public static final String DEFAULT_TARGET_SCHEME = "";
  
  public static final Long DEFAULT_USER_ID;
  
  public static final Integer DEFAULT_USER_LEVEL;
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String avatar_url;
  
  @ProtoField(tag = 10)
  public final BaijiahaoInfo baijiahao_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String level_name;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer role_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String role_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 13)
  public final List<UserAttrIcon> show_icon_list;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String target_scheme;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer user_level;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_USER_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_ROLE_ID = integer;
    DEFAULT_USER_LEVEL = integer;
    DEFAULT_SHOW_ICON_LIST = Collections.emptyList();
  }
  
  public BawuRoleInfoPub(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<UserAttrIcon> list;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      Integer integer2 = paramBuilder.role_id;
      if (integer2 == null) {
        this.role_id = DEFAULT_ROLE_ID;
      } else {
        this.role_id = integer2;
      } 
      String str2 = paramBuilder.role_name;
      if (str2 == null) {
        this.role_name = "";
      } else {
        this.role_name = str2;
      } 
      str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      Integer integer1 = paramBuilder.user_level;
      if (integer1 == null) {
        this.user_level = DEFAULT_USER_LEVEL;
      } else {
        this.user_level = integer1;
      } 
      String str1 = paramBuilder.level_name;
      if (str1 == null) {
        this.level_name = "";
      } else {
        this.level_name = str1;
      } 
      str1 = paramBuilder.user_name;
      if (str1 == null) {
        this.user_name = "";
      } else {
        this.user_name = str1;
      } 
      str1 = paramBuilder.name_show;
      if (str1 == null) {
        this.name_show = "";
      } else {
        this.name_show = str1;
      } 
      this.baijiahao_info = paramBuilder.baijiahao_info;
      str1 = paramBuilder.avatar_url;
      if (str1 == null) {
        this.avatar_url = "";
      } else {
        this.avatar_url = str1;
      } 
      str1 = paramBuilder.target_scheme;
      if (str1 == null) {
        this.target_scheme = "";
      } else {
        this.target_scheme = str1;
      } 
      list = paramBuilder.show_icon_list;
      if (list == null) {
        this.show_icon_list = DEFAULT_SHOW_ICON_LIST;
      } else {
        this.show_icon_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.forum_id = ((Builder)list).forum_id;
      this.user_id = ((Builder)list).user_id;
      this.role_id = ((Builder)list).role_id;
      this.role_name = ((Builder)list).role_name;
      this.portrait = ((Builder)list).portrait;
      this.user_level = ((Builder)list).user_level;
      this.level_name = ((Builder)list).level_name;
      this.user_name = ((Builder)list).user_name;
      this.name_show = ((Builder)list).name_show;
      this.baijiahao_info = ((Builder)list).baijiahao_info;
      this.avatar_url = ((Builder)list).avatar_url;
      this.target_scheme = ((Builder)list).target_scheme;
      this.show_icon_list = Message.immutableCopyOf(((Builder)list).show_icon_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<BawuRoleInfoPub> {
    public String avatar_url;
    
    public BaijiahaoInfo baijiahao_info;
    
    public Long forum_id;
    
    public String level_name;
    
    public String name_show;
    
    public String portrait;
    
    public Integer role_id;
    
    public String role_name;
    
    public List<UserAttrIcon> show_icon_list;
    
    public String target_scheme;
    
    public Long user_id;
    
    public Integer user_level;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(BawuRoleInfoPub param1BawuRoleInfoPub) {
      super(param1BawuRoleInfoPub);
      if (param1BawuRoleInfoPub == null)
        return; 
      this.forum_id = param1BawuRoleInfoPub.forum_id;
      this.user_id = param1BawuRoleInfoPub.user_id;
      this.role_id = param1BawuRoleInfoPub.role_id;
      this.role_name = param1BawuRoleInfoPub.role_name;
      this.portrait = param1BawuRoleInfoPub.portrait;
      this.user_level = param1BawuRoleInfoPub.user_level;
      this.level_name = param1BawuRoleInfoPub.level_name;
      this.user_name = param1BawuRoleInfoPub.user_name;
      this.name_show = param1BawuRoleInfoPub.name_show;
      this.baijiahao_info = param1BawuRoleInfoPub.baijiahao_info;
      this.avatar_url = param1BawuRoleInfoPub.avatar_url;
      this.target_scheme = param1BawuRoleInfoPub.target_scheme;
      this.show_icon_list = Message.copyOf(param1BawuRoleInfoPub.show_icon_list);
    }
    
    public BawuRoleInfoPub build(boolean param1Boolean) {
      return new BawuRoleInfoPub(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
