package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;

public final class MatchCardInfo extends Message {
  public static final String DEFAULT_CARD_TITLE = "";
  
  public static final String DEFAULT_ICON_TEXT = "";
  
  public static final String DEFAULT_MATCH_LINK = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_SCHEDULE_LINK = "";
  
  public static final String DEFAULT_START_DESC = "";
  
  public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
  
  public static final String DEFAULT_TEAM_ICON_A = "";
  
  public static final String DEFAULT_TEAM_ICON_B = "";
  
  public static final String DEFAULT_TEAM_NAME_A = "";
  
  public static final String DEFAULT_TEAM_NAME_B = "";
  
  public static final List<MatchPlayerInfo> DEFAULT_TEAM_PLAYER_LIST;
  
  public static final Long DEFAULT_TEAM_SCORE_A;
  
  public static final Long DEFAULT_TEAM_SCORE_B;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST;
  
  public static final Long DEFAULT_TOPIC_ID;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String card_title;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String icon_text;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String match_link;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String schedule_link;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String start_desc;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer status;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String team_icon_a;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String team_icon_b;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String team_name_a;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String team_name_b;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 14)
  public final List<MatchPlayerInfo> team_player_list;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long team_score_a;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT64)
  public final Long team_score_b;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 12)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long topic_id;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOPIC_ID = long_;
    DEFAULT_TEAM_SCORE_A = long_;
    DEFAULT_TEAM_SCORE_B = long_;
    DEFAULT_THREAD_LIST = Collections.emptyList();
    DEFAULT_TEAM_PLAYER_LIST = Collections.emptyList();
  }
  
  public MatchCardInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str5 = paramBuilder.name;
      if (str5 == null) {
        this.name = "";
      } else {
        this.name = str5;
      } 
      Integer integer = paramBuilder.status;
      if (integer == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer;
      } 
      String str4 = paramBuilder.card_title;
      if (str4 == null) {
        this.card_title = "";
      } else {
        this.card_title = str4;
      } 
      Long long_2 = paramBuilder.topic_id;
      if (long_2 == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_2;
      } 
      String str3 = paramBuilder.team_name_a;
      if (str3 == null) {
        this.team_name_a = "";
      } else {
        this.team_name_a = str3;
      } 
      str3 = paramBuilder.team_name_b;
      if (str3 == null) {
        this.team_name_b = "";
      } else {
        this.team_name_b = str3;
      } 
      str3 = paramBuilder.team_icon_a;
      if (str3 == null) {
        this.team_icon_a = "";
      } else {
        this.team_icon_a = str3;
      } 
      str3 = paramBuilder.team_icon_b;
      if (str3 == null) {
        this.team_icon_b = "";
      } else {
        this.team_icon_b = str3;
      } 
      str3 = paramBuilder.start_desc;
      if (str3 == null) {
        this.start_desc = "";
      } else {
        this.start_desc = str3;
      } 
      Long long_1 = paramBuilder.team_score_a;
      if (long_1 == null) {
        this.team_score_a = DEFAULT_TEAM_SCORE_A;
      } else {
        this.team_score_a = long_1;
      } 
      long_1 = paramBuilder.team_score_b;
      if (long_1 == null) {
        this.team_score_b = DEFAULT_TEAM_SCORE_B;
      } else {
        this.team_score_b = long_1;
      } 
      List<ThreadInfo> list1 = paramBuilder.thread_list;
      if (list1 == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list1);
      } 
      String str2 = paramBuilder.icon_text;
      if (str2 == null) {
        this.icon_text = "";
      } else {
        this.icon_text = str2;
      } 
      List<MatchPlayerInfo> list = paramBuilder.team_player_list;
      if (list == null) {
        this.team_player_list = DEFAULT_TEAM_PLAYER_LIST;
      } else {
        this.team_player_list = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.match_link;
      if (str1 == null) {
        this.match_link = "";
      } else {
        this.match_link = str1;
      } 
      str = paramBuilder.schedule_link;
      if (str == null) {
        this.schedule_link = "";
      } else {
        this.schedule_link = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.status = ((Builder)str).status;
      this.card_title = ((Builder)str).card_title;
      this.topic_id = ((Builder)str).topic_id;
      this.team_name_a = ((Builder)str).team_name_a;
      this.team_name_b = ((Builder)str).team_name_b;
      this.team_icon_a = ((Builder)str).team_icon_a;
      this.team_icon_b = ((Builder)str).team_icon_b;
      this.start_desc = ((Builder)str).start_desc;
      this.team_score_a = ((Builder)str).team_score_a;
      this.team_score_b = ((Builder)str).team_score_b;
      this.thread_list = Message.immutableCopyOf(((Builder)str).thread_list);
      this.icon_text = ((Builder)str).icon_text;
      this.team_player_list = Message.immutableCopyOf(((Builder)str).team_player_list);
      this.match_link = ((Builder)str).match_link;
      this.schedule_link = ((Builder)str).schedule_link;
    } 
  }
  
  public static final class Builder extends Message.Builder<MatchCardInfo> {
    public String card_title;
    
    public String icon_text;
    
    public String match_link;
    
    public String name;
    
    public String schedule_link;
    
    public String start_desc;
    
    public Integer status;
    
    public String team_icon_a;
    
    public String team_icon_b;
    
    public String team_name_a;
    
    public String team_name_b;
    
    public List<MatchPlayerInfo> team_player_list;
    
    public Long team_score_a;
    
    public Long team_score_b;
    
    public List<ThreadInfo> thread_list;
    
    public Long topic_id;
    
    public Builder() {}
    
    public Builder(MatchCardInfo param1MatchCardInfo) {
      super(param1MatchCardInfo);
      if (param1MatchCardInfo == null)
        return; 
      this.name = param1MatchCardInfo.name;
      this.status = param1MatchCardInfo.status;
      this.card_title = param1MatchCardInfo.card_title;
      this.topic_id = param1MatchCardInfo.topic_id;
      this.team_name_a = param1MatchCardInfo.team_name_a;
      this.team_name_b = param1MatchCardInfo.team_name_b;
      this.team_icon_a = param1MatchCardInfo.team_icon_a;
      this.team_icon_b = param1MatchCardInfo.team_icon_b;
      this.start_desc = param1MatchCardInfo.start_desc;
      this.team_score_a = param1MatchCardInfo.team_score_a;
      this.team_score_b = param1MatchCardInfo.team_score_b;
      this.thread_list = Message.copyOf(param1MatchCardInfo.thread_list);
      this.icon_text = param1MatchCardInfo.icon_text;
      this.team_player_list = Message.copyOf(param1MatchCardInfo.team_player_list);
      this.match_link = param1MatchCardInfo.match_link;
      this.schedule_link = param1MatchCardInfo.schedule_link;
    }
    
    public MatchCardInfo build(boolean param1Boolean) {
      return new MatchCardInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
