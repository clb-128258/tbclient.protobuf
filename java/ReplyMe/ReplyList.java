package tbclient.ReplyMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Baijiahao;
import tbclient.NewFloorInfo;
import tbclient.OriginThreadInfo;
import tbclient.User;
import tbclient.Zan;

public final class ReplyList extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_DISPLAY_TEXT = "";
  
  public static final String DEFAULT_FIRST_SCHEME = "";
  
  public static final String DEFAULT_FNAME = "";
  
  public static final Integer DEFAULT_HAS_AGREE;
  
  public static final Integer DEFAULT_HIDE_FNAME;
  
  public static final Integer DEFAULT_IS_BJH;
  
  public static final Integer DEFAULT_IS_FILTER;
  
  public static final Integer DEFAULT_IS_FLOOR;
  
  public static final Integer DEFAULT_IS_SHARE_THREAD;
  
  public static final Integer DEFAULT_IS_STORY;
  
  public static final String DEFAULT_ITEM_TYPE = "";
  
  public static final List<NewFloorInfo> DEFAULT_NEW_FLOOR_INFO;
  
  public static final String DEFAULT_POST_FROM = "";
  
  public static final Long DEFAULT_POST_ID;
  
  public static final String DEFAULT_QUOTE_CONTENT = "";
  
  public static final Long DEFAULT_QUOTE_PID;
  
  public static final String DEFAULT_SECOND_SCHEME = "";
  
  public static final Integer DEFAULT_SERVER_TIME;
  
  public static final String DEFAULT_TARGET_SCHEME = "";
  
  public static final String DEFAULT_THIRD_SCHEME = "";
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final String DEFAULT_THREAD_IMG_URL = "";
  
  public static final Integer DEFAULT_THREAD_TYPE;
  
  public static final Integer DEFAULT_TIME;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final Integer DEFAULT_UNREAD;
  
  public static final Long DEFAULT_V_FORUM_ID;
  
  @ProtoField(tag = 27)
  public final Baijiahao baijiahao;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 31, type = Message.Datatype.STRING)
  public final String display_text;
  
  @ProtoField(tag = 33, type = Message.Datatype.STRING)
  public final String first_scheme;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String fname;
  
  @ProtoField(tag = 29, type = Message.Datatype.INT32)
  public final Integer has_agree;
  
  @ProtoField(tag = 19, type = Message.Datatype.UINT32)
  public final Integer hide_fname;
  
  @ProtoField(tag = 26, type = Message.Datatype.INT32)
  public final Integer is_bjh;
  
  @ProtoField(tag = 32, type = Message.Datatype.INT32)
  public final Integer is_filter;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer is_floor;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer is_share_thread;
  
  @ProtoField(tag = 20, type = Message.Datatype.INT32)
  public final Integer is_story;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String item_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 28)
  public final List<NewFloorInfo> new_floor_info;
  
  @ProtoField(tag = 21)
  public final OriginThreadInfo origin_thread_info;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String post_from;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String quote_content;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT64)
  public final Long quote_pid;
  
  @ProtoField(tag = 15)
  public final User quote_user;
  
  @ProtoField(tag = 9)
  public final User replyer;
  
  @ProtoField(tag = 34, type = Message.Datatype.STRING)
  public final String second_scheme;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer server_time;
  
  @ProtoField(tag = 30, type = Message.Datatype.STRING)
  public final String target_scheme;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String third_scheme;
  
  @ProtoField(tag = 25)
  public final User thread_author_user;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String thread_img_url;
  
  @ProtoField(tag = 17, type = Message.Datatype.UINT32)
  public final Integer thread_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer time;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT32)
  public final Integer unread;
  
  @ProtoField(tag = 18, type = Message.Datatype.UINT64)
  public final Long v_forum_id;
  
  @ProtoField(tag = 13)
  public final Zan zan;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_THREAD_ID = long_;
    DEFAULT_POST_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TIME = integer;
    DEFAULT_IS_FLOOR = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_UNREAD = integer;
    DEFAULT_QUOTE_PID = long_;
    DEFAULT_SERVER_TIME = integer;
    DEFAULT_THREAD_TYPE = integer;
    DEFAULT_V_FORUM_ID = long_;
    DEFAULT_HIDE_FNAME = integer;
    DEFAULT_IS_STORY = integer;
    DEFAULT_IS_SHARE_THREAD = integer;
    DEFAULT_IS_BJH = integer;
    DEFAULT_NEW_FLOOR_INFO = Collections.emptyList();
    DEFAULT_HAS_AGREE = integer;
    DEFAULT_IS_FILTER = integer;
  }
  
  public ReplyList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.thread_id;
      if (long_3 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_3;
      } 
      long_3 = paramBuilder.post_id;
      if (long_3 == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_3;
      } 
      Integer integer9 = paramBuilder.time;
      if (integer9 == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer9;
      } 
      String str7 = paramBuilder.title;
      if (str7 == null) {
        this.title = "";
      } else {
        this.title = str7;
      } 
      str7 = paramBuilder.fname;
      if (str7 == null) {
        this.fname = "";
      } else {
        this.fname = str7;
      } 
      str7 = paramBuilder.content;
      if (str7 == null) {
        this.content = "";
      } else {
        this.content = str7;
      } 
      Integer integer8 = paramBuilder.is_floor;
      if (integer8 == null) {
        this.is_floor = DEFAULT_IS_FLOOR;
      } else {
        this.is_floor = integer8;
      } 
      String str6 = paramBuilder.quote_content;
      if (str6 == null) {
        this.quote_content = "";
      } else {
        this.quote_content = str6;
      } 
      this.replyer = paramBuilder.replyer;
      Integer integer7 = paramBuilder.type;
      if (integer7 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer7;
      } 
      integer7 = paramBuilder.unread;
      if (integer7 == null) {
        this.unread = DEFAULT_UNREAD;
      } else {
        this.unread = integer7;
      } 
      String str5 = paramBuilder.item_type;
      if (str5 == null) {
        this.item_type = "";
      } else {
        this.item_type = str5;
      } 
      this.zan = paramBuilder.zan;
      Long long_2 = paramBuilder.quote_pid;
      if (long_2 == null) {
        this.quote_pid = DEFAULT_QUOTE_PID;
      } else {
        this.quote_pid = long_2;
      } 
      this.quote_user = paramBuilder.quote_user;
      Integer integer6 = paramBuilder.server_time;
      if (integer6 == null) {
        this.server_time = DEFAULT_SERVER_TIME;
      } else {
        this.server_time = integer6;
      } 
      integer6 = paramBuilder.thread_type;
      if (integer6 == null) {
        this.thread_type = DEFAULT_THREAD_TYPE;
      } else {
        this.thread_type = integer6;
      } 
      Long long_1 = paramBuilder.v_forum_id;
      if (long_1 == null) {
        this.v_forum_id = DEFAULT_V_FORUM_ID;
      } else {
        this.v_forum_id = long_1;
      } 
      Integer integer5 = paramBuilder.hide_fname;
      if (integer5 == null) {
        this.hide_fname = DEFAULT_HIDE_FNAME;
      } else {
        this.hide_fname = integer5;
      } 
      integer5 = paramBuilder.is_story;
      if (integer5 == null) {
        this.is_story = DEFAULT_IS_STORY;
      } else {
        this.is_story = integer5;
      } 
      this.origin_thread_info = paramBuilder.origin_thread_info;
      String str4 = paramBuilder.post_from;
      if (str4 == null) {
        this.post_from = "";
      } else {
        this.post_from = str4;
      } 
      Integer integer4 = paramBuilder.is_share_thread;
      if (integer4 == null) {
        this.is_share_thread = DEFAULT_IS_SHARE_THREAD;
      } else {
        this.is_share_thread = integer4;
      } 
      String str3 = paramBuilder.thread_img_url;
      if (str3 == null) {
        this.thread_img_url = "";
      } else {
        this.thread_img_url = str3;
      } 
      this.thread_author_user = paramBuilder.thread_author_user;
      Integer integer3 = paramBuilder.is_bjh;
      if (integer3 == null) {
        this.is_bjh = DEFAULT_IS_BJH;
      } else {
        this.is_bjh = integer3;
      } 
      this.baijiahao = paramBuilder.baijiahao;
      List<NewFloorInfo> list = paramBuilder.new_floor_info;
      if (list == null) {
        this.new_floor_info = DEFAULT_NEW_FLOOR_INFO;
      } else {
        this.new_floor_info = Message.immutableCopyOf(list);
      } 
      Integer integer2 = paramBuilder.has_agree;
      if (integer2 == null) {
        this.has_agree = DEFAULT_HAS_AGREE;
      } else {
        this.has_agree = integer2;
      } 
      String str2 = paramBuilder.target_scheme;
      if (str2 == null) {
        this.target_scheme = "";
      } else {
        this.target_scheme = str2;
      } 
      str2 = paramBuilder.display_text;
      if (str2 == null) {
        this.display_text = "";
      } else {
        this.display_text = str2;
      } 
      Integer integer1 = paramBuilder.is_filter;
      if (integer1 == null) {
        this.is_filter = DEFAULT_IS_FILTER;
      } else {
        this.is_filter = integer1;
      } 
      String str1 = paramBuilder.first_scheme;
      if (str1 == null) {
        this.first_scheme = "";
      } else {
        this.first_scheme = str1;
      } 
      str1 = paramBuilder.second_scheme;
      if (str1 == null) {
        this.second_scheme = "";
      } else {
        this.second_scheme = str1;
      } 
      str = paramBuilder.third_scheme;
      if (str == null) {
        this.third_scheme = "";
      } else {
        this.third_scheme = str;
      } 
    } else {
      this.thread_id = ((Builder)str).thread_id;
      this.post_id = ((Builder)str).post_id;
      this.time = ((Builder)str).time;
      this.title = ((Builder)str).title;
      this.fname = ((Builder)str).fname;
      this.content = ((Builder)str).content;
      this.is_floor = ((Builder)str).is_floor;
      this.quote_content = ((Builder)str).quote_content;
      this.replyer = ((Builder)str).replyer;
      this.type = ((Builder)str).type;
      this.unread = ((Builder)str).unread;
      this.item_type = ((Builder)str).item_type;
      this.zan = ((Builder)str).zan;
      this.quote_pid = ((Builder)str).quote_pid;
      this.quote_user = ((Builder)str).quote_user;
      this.server_time = ((Builder)str).server_time;
      this.thread_type = ((Builder)str).thread_type;
      this.v_forum_id = ((Builder)str).v_forum_id;
      this.hide_fname = ((Builder)str).hide_fname;
      this.is_story = ((Builder)str).is_story;
      this.origin_thread_info = ((Builder)str).origin_thread_info;
      this.post_from = ((Builder)str).post_from;
      this.is_share_thread = ((Builder)str).is_share_thread;
      this.thread_img_url = ((Builder)str).thread_img_url;
      this.thread_author_user = ((Builder)str).thread_author_user;
      this.is_bjh = ((Builder)str).is_bjh;
      this.baijiahao = ((Builder)str).baijiahao;
      this.new_floor_info = Message.immutableCopyOf(((Builder)str).new_floor_info);
      this.has_agree = ((Builder)str).has_agree;
      this.target_scheme = ((Builder)str).target_scheme;
      this.display_text = ((Builder)str).display_text;
      this.is_filter = ((Builder)str).is_filter;
      this.first_scheme = ((Builder)str).first_scheme;
      this.second_scheme = ((Builder)str).second_scheme;
      this.third_scheme = ((Builder)str).third_scheme;
    } 
  }
  
  public static final class Builder extends Message.Builder<ReplyList> {
    public Baijiahao baijiahao;
    
    public String content;
    
    public String display_text;
    
    public String first_scheme;
    
    public String fname;
    
    public Integer has_agree;
    
    public Integer hide_fname;
    
    public Integer is_bjh;
    
    public Integer is_filter;
    
    public Integer is_floor;
    
    public Integer is_share_thread;
    
    public Integer is_story;
    
    public String item_type;
    
    public List<NewFloorInfo> new_floor_info;
    
    public OriginThreadInfo origin_thread_info;
    
    public String post_from;
    
    public Long post_id;
    
    public String quote_content;
    
    public Long quote_pid;
    
    public User quote_user;
    
    public User replyer;
    
    public String second_scheme;
    
    public Integer server_time;
    
    public String target_scheme;
    
    public String third_scheme;
    
    public User thread_author_user;
    
    public Long thread_id;
    
    public String thread_img_url;
    
    public Integer thread_type;
    
    public Integer time;
    
    public String title;
    
    public Integer type;
    
    public Integer unread;
    
    public Long v_forum_id;
    
    public Zan zan;
    
    public Builder() {}
    
    public Builder(ReplyList param1ReplyList) {
      super(param1ReplyList);
      if (param1ReplyList == null)
        return; 
      this.thread_id = param1ReplyList.thread_id;
      this.post_id = param1ReplyList.post_id;
      this.time = param1ReplyList.time;
      this.title = param1ReplyList.title;
      this.fname = param1ReplyList.fname;
      this.content = param1ReplyList.content;
      this.is_floor = param1ReplyList.is_floor;
      this.quote_content = param1ReplyList.quote_content;
      this.replyer = param1ReplyList.replyer;
      this.type = param1ReplyList.type;
      this.unread = param1ReplyList.unread;
      this.item_type = param1ReplyList.item_type;
      this.zan = param1ReplyList.zan;
      this.quote_pid = param1ReplyList.quote_pid;
      this.quote_user = param1ReplyList.quote_user;
      this.server_time = param1ReplyList.server_time;
      this.thread_type = param1ReplyList.thread_type;
      this.v_forum_id = param1ReplyList.v_forum_id;
      this.hide_fname = param1ReplyList.hide_fname;
      this.is_story = param1ReplyList.is_story;
      this.origin_thread_info = param1ReplyList.origin_thread_info;
      this.post_from = param1ReplyList.post_from;
      this.is_share_thread = param1ReplyList.is_share_thread;
      this.thread_img_url = param1ReplyList.thread_img_url;
      this.thread_author_user = param1ReplyList.thread_author_user;
      this.is_bjh = param1ReplyList.is_bjh;
      this.baijiahao = param1ReplyList.baijiahao;
      this.new_floor_info = Message.copyOf(param1ReplyList.new_floor_info);
      this.has_agree = param1ReplyList.has_agree;
      this.target_scheme = param1ReplyList.target_scheme;
      this.display_text = param1ReplyList.display_text;
      this.is_filter = param1ReplyList.is_filter;
      this.first_scheme = param1ReplyList.first_scheme;
      this.second_scheme = param1ReplyList.second_scheme;
      this.third_scheme = param1ReplyList.third_scheme;
    }
    
    public ReplyList build(boolean param1Boolean) {
      return new ReplyList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
