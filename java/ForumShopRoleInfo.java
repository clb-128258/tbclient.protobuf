package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumShopRoleInfo extends Message {
  public static final String DEFAULT_CARD_TITLE = "";
  
  public static final String DEFAULT_DEFAULT_TEXT = "";
  
  public static final Integer DEFAULT_FORUM_LEVEL;
  
  public static final String DEFAULT_LEVEL_NAME = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_ROLE_TAG = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String card_title;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String default_text;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer forum_level;
  
  @ProtoField(tag = 7)
  public final ThemeColorInfo icon_info;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String level_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String role_tag;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long user_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    DEFAULT_FORUM_LEVEL = Integer.valueOf(0);
  }
  
  public ForumShopRoleInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.user_name;
      if (str2 == null) {
        this.user_name = "";
      } else {
        this.user_name = str2;
      } 
      str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      str2 = paramBuilder.role_tag;
      if (str2 == null) {
        this.role_tag = "";
      } else {
        this.role_tag = str2;
      } 
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      Integer integer = paramBuilder.forum_level;
      if (integer == null) {
        this.forum_level = DEFAULT_FORUM_LEVEL;
      } else {
        this.forum_level = integer;
      } 
      String str1 = paramBuilder.level_name;
      if (str1 == null) {
        this.level_name = "";
      } else {
        this.level_name = str1;
      } 
      this.icon_info = paramBuilder.icon_info;
      str1 = paramBuilder.card_title;
      if (str1 == null) {
        this.card_title = "";
      } else {
        this.card_title = str1;
      } 
      str = paramBuilder.default_text;
      if (str == null) {
        this.default_text = "";
      } else {
        this.default_text = str;
      } 
    } else {
      this.user_name = ((Builder)str).user_name;
      this.portrait = ((Builder)str).portrait;
      this.role_tag = ((Builder)str).role_tag;
      this.user_id = ((Builder)str).user_id;
      this.forum_level = ((Builder)str).forum_level;
      this.level_name = ((Builder)str).level_name;
      this.icon_info = ((Builder)str).icon_info;
      this.card_title = ((Builder)str).card_title;
      this.default_text = ((Builder)str).default_text;
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumShopRoleInfo> {
    public String card_title;
    
    public String default_text;
    
    public Integer forum_level;
    
    public ThemeColorInfo icon_info;
    
    public String level_name;
    
    public String portrait;
    
    public String role_tag;
    
    public Long user_id;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(ForumShopRoleInfo param1ForumShopRoleInfo) {
      super(param1ForumShopRoleInfo);
      if (param1ForumShopRoleInfo == null)
        return; 
      this.user_name = param1ForumShopRoleInfo.user_name;
      this.portrait = param1ForumShopRoleInfo.portrait;
      this.role_tag = param1ForumShopRoleInfo.role_tag;
      this.user_id = param1ForumShopRoleInfo.user_id;
      this.forum_level = param1ForumShopRoleInfo.forum_level;
      this.level_name = param1ForumShopRoleInfo.level_name;
      this.icon_info = param1ForumShopRoleInfo.icon_info;
      this.card_title = param1ForumShopRoleInfo.card_title;
      this.default_text = param1ForumShopRoleInfo.default_text;
    }
    
    public ForumShopRoleInfo build(boolean param1Boolean) {
      return new ForumShopRoleInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
