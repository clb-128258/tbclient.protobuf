package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class GameDetail extends Message {
  public static final String DEFAULT_BOOKED_NUM = "";
  
  public static final String DEFAULT_BUTTON_NAME = "";
  
  public static final Integer DEFAULT_CARD_TYPE;
  
  public static final String DEFAULT_CID = "";
  
  public static final String DEFAULT_COMPANY = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_DOWNLOAD_NUM = "";
  
  public static final String DEFAULT_GAME_ICON = "";
  
  public static final String DEFAULT_GAME_ID = "";
  
  public static final String DEFAULT_GAME_NAME = "";
  
  public static final List<String> DEFAULT_GAME_TAGS = Collections.emptyList();
  
  public static final Integer DEFAULT_IS_SHOW_BUTTON;
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_LABEL = "";
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final String DEFAULT_REC_TXT = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final Integer DEFAULT_USER_IS_BOOKED;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String booked_num;
  
  @ProtoField(tag = 18)
  public final GameBookedToast booked_toast;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String button_name;
  
  @ProtoField(tag = 21, type = Message.Datatype.INT32)
  public final Integer card_type;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String cid;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String company;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String download_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String game_icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String game_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String game_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
  public final List<String> game_tags;
  
  @ProtoField(tag = 15)
  public final Media head_img;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT32)
  public final Integer is_show_button;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String label;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 17)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 12)
  public final PkgInfo pkg_info;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String rec_txt;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 20)
  public final SidebarInfo sidebar_info;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer user_is_booked;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_USER_IS_BOOKED = integer;
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_IS_SHOW_BUTTON = integer;
    DEFAULT_CARD_TYPE = integer;
  }
  
  public GameDetail(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str5 = paramBuilder.game_id;
      if (str5 == null) {
        this.game_id = "";
      } else {
        this.game_id = str5;
      } 
      str5 = paramBuilder.game_name;
      if (str5 == null) {
        this.game_name = "";
      } else {
        this.game_name = str5;
      } 
      str5 = paramBuilder.game_icon;
      if (str5 == null) {
        this.game_icon = "";
      } else {
        this.game_icon = str5;
      } 
      List<String> list1 = paramBuilder.game_tags;
      if (list1 == null) {
        this.game_tags = DEFAULT_GAME_TAGS;
      } else {
        this.game_tags = Message.immutableCopyOf(list1);
      } 
      String str4 = paramBuilder.label;
      if (str4 == null) {
        this.label = "";
      } else {
        this.label = str4;
      } 
      Integer integer3 = paramBuilder.type;
      if (integer3 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer3;
      } 
      String str3 = paramBuilder.booked_num;
      if (str3 == null) {
        this.booked_num = "";
      } else {
        this.booked_num = str3;
      } 
      str3 = paramBuilder.button_name;
      if (str3 == null) {
        this.button_name = "";
      } else {
        this.button_name = str3;
      } 
      str3 = paramBuilder.company;
      if (str3 == null) {
        this.company = "";
      } else {
        this.company = str3;
      } 
      Integer integer2 = paramBuilder.user_is_booked;
      if (integer2 == null) {
        this.user_is_booked = DEFAULT_USER_IS_BOOKED;
      } else {
        this.user_is_booked = integer2;
      } 
      String str2 = paramBuilder.jump_url;
      if (str2 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str2;
      } 
      this.pkg_info = paramBuilder.pkg_info;
      str2 = paramBuilder.cid;
      if (str2 == null) {
        this.cid = "";
      } else {
        this.cid = str2;
      } 
      str2 = paramBuilder.desc;
      if (str2 == null) {
        this.desc = "";
      } else {
        this.desc = str2;
      } 
      this.head_img = paramBuilder.head_img;
      str2 = paramBuilder.download_num;
      if (str2 == null) {
        this.download_num = "";
      } else {
        this.download_num = str2;
      } 
      List<FeedKV> list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
      this.booked_toast = paramBuilder.booked_toast;
      Integer integer1 = paramBuilder.is_show_button;
      if (integer1 == null) {
        this.is_show_button = DEFAULT_IS_SHOW_BUTTON;
      } else {
        this.is_show_button = integer1;
      } 
      this.sidebar_info = paramBuilder.sidebar_info;
      integer1 = paramBuilder.card_type;
      if (integer1 == null) {
        this.card_type = DEFAULT_CARD_TYPE;
      } else {
        this.card_type = integer1;
      } 
      String str1 = paramBuilder.rec_txt;
      if (str1 == null) {
        this.rec_txt = "";
      } else {
        this.rec_txt = str1;
      } 
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.game_id = ((Builder)str).game_id;
      this.game_name = ((Builder)str).game_name;
      this.game_icon = ((Builder)str).game_icon;
      this.game_tags = Message.immutableCopyOf(((Builder)str).game_tags);
      this.label = ((Builder)str).label;
      this.type = ((Builder)str).type;
      this.booked_num = ((Builder)str).booked_num;
      this.button_name = ((Builder)str).button_name;
      this.company = ((Builder)str).company;
      this.user_is_booked = ((Builder)str).user_is_booked;
      this.jump_url = ((Builder)str).jump_url;
      this.pkg_info = ((Builder)str).pkg_info;
      this.cid = ((Builder)str).cid;
      this.desc = ((Builder)str).desc;
      this.head_img = ((Builder)str).head_img;
      this.download_num = ((Builder)str).download_num;
      this.log_param = Message.immutableCopyOf(((Builder)str).log_param);
      this.booked_toast = ((Builder)str).booked_toast;
      this.is_show_button = ((Builder)str).is_show_button;
      this.sidebar_info = ((Builder)str).sidebar_info;
      this.card_type = ((Builder)str).card_type;
      this.rec_txt = ((Builder)str).rec_txt;
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<GameDetail> {
    public String booked_num;
    
    public GameBookedToast booked_toast;
    
    public String button_name;
    
    public Integer card_type;
    
    public String cid;
    
    public String company;
    
    public String desc;
    
    public String download_num;
    
    public String game_icon;
    
    public String game_id;
    
    public String game_name;
    
    public List<String> game_tags;
    
    public Media head_img;
    
    public Integer is_show_button;
    
    public String jump_url;
    
    public String label;
    
    public List<FeedKV> log_param;
    
    public PkgInfo pkg_info;
    
    public String rec_txt;
    
    public String schema;
    
    public SidebarInfo sidebar_info;
    
    public Integer type;
    
    public Integer user_is_booked;
    
    public Builder() {}
    
    public Builder(GameDetail param1GameDetail) {
      super(param1GameDetail);
      if (param1GameDetail == null)
        return; 
      this.game_id = param1GameDetail.game_id;
      this.game_name = param1GameDetail.game_name;
      this.game_icon = param1GameDetail.game_icon;
      this.game_tags = Message.copyOf(param1GameDetail.game_tags);
      this.label = param1GameDetail.label;
      this.type = param1GameDetail.type;
      this.booked_num = param1GameDetail.booked_num;
      this.button_name = param1GameDetail.button_name;
      this.company = param1GameDetail.company;
      this.user_is_booked = param1GameDetail.user_is_booked;
      this.jump_url = param1GameDetail.jump_url;
      this.pkg_info = param1GameDetail.pkg_info;
      this.cid = param1GameDetail.cid;
      this.desc = param1GameDetail.desc;
      this.head_img = param1GameDetail.head_img;
      this.download_num = param1GameDetail.download_num;
      this.log_param = Message.copyOf(param1GameDetail.log_param);
      this.booked_toast = param1GameDetail.booked_toast;
      this.is_show_button = param1GameDetail.is_show_button;
      this.sidebar_info = param1GameDetail.sidebar_info;
      this.card_type = param1GameDetail.card_type;
      this.rec_txt = param1GameDetail.rec_txt;
      this.schema = param1GameDetail.schema;
    }
    
    public GameDetail build(boolean param1Boolean) {
      return new GameDetail(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
