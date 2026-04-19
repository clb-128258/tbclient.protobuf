package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Post;

public final class MatchPlayerInfo extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_MATCH_ID;
  
  public static final Integer DEFAULT_MATCH_INDEX;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Long DEFAULT_PLAYER_ID;
  
  public static final Double DEFAULT_SCORE = Double.valueOf(0.0D);
  
  public static final Long DEFAULT_SCORE_CNT;
  
  public static final String DEFAULT_SCORE_LINK = "";
  
  public static final Integer DEFAULT_SCORE_SELF;
  
  public static final String DEFAULT_SUB_AVATAR = "";
  
  public static final String DEFAULT_SUB_TEXT = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 5)
  public final Post hot_post;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long match_id;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer match_index;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT64)
  public final Long player_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.DOUBLE)
  public final Double score;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long score_cnt;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String score_link;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer score_self;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String sub_avatar;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String sub_text;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_SCORE_CNT = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_SCORE_SELF = integer;
    DEFAULT_MATCH_ID = long_;
    DEFAULT_MATCH_INDEX = integer;
    DEFAULT_PLAYER_ID = long_;
  }
  
  public MatchPlayerInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str3 = paramBuilder.name;
      if (str3 == null) {
        this.name = "";
      } else {
        this.name = str3;
      } 
      str3 = paramBuilder.avatar;
      if (str3 == null) {
        this.avatar = "";
      } else {
        this.avatar = str3;
      } 
      Double double_ = paramBuilder.score;
      if (double_ == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = double_;
      } 
      Long long_2 = paramBuilder.score_cnt;
      if (long_2 == null) {
        this.score_cnt = DEFAULT_SCORE_CNT;
      } else {
        this.score_cnt = long_2;
      } 
      this.hot_post = paramBuilder.hot_post;
      String str2 = paramBuilder.sub_avatar;
      if (str2 == null) {
        this.sub_avatar = "";
      } else {
        this.sub_avatar = str2;
      } 
      str2 = paramBuilder.sub_text;
      if (str2 == null) {
        this.sub_text = "";
      } else {
        this.sub_text = str2;
      } 
      Integer integer2 = paramBuilder.score_self;
      if (integer2 == null) {
        this.score_self = DEFAULT_SCORE_SELF;
      } else {
        this.score_self = integer2;
      } 
      String str1 = paramBuilder.score_link;
      if (str1 == null) {
        this.score_link = "";
      } else {
        this.score_link = str1;
      } 
      Long long_1 = paramBuilder.match_id;
      if (long_1 == null) {
        this.match_id = DEFAULT_MATCH_ID;
      } else {
        this.match_id = long_1;
      } 
      Integer integer1 = paramBuilder.match_index;
      if (integer1 == null) {
        this.match_index = DEFAULT_MATCH_INDEX;
      } else {
        this.match_index = integer1;
      } 
      long_ = paramBuilder.player_id;
      if (long_ == null) {
        this.player_id = DEFAULT_PLAYER_ID;
      } else {
        this.player_id = long_;
      } 
    } else {
      this.name = ((Builder)long_).name;
      this.avatar = ((Builder)long_).avatar;
      this.score = ((Builder)long_).score;
      this.score_cnt = ((Builder)long_).score_cnt;
      this.hot_post = ((Builder)long_).hot_post;
      this.sub_avatar = ((Builder)long_).sub_avatar;
      this.sub_text = ((Builder)long_).sub_text;
      this.score_self = ((Builder)long_).score_self;
      this.score_link = ((Builder)long_).score_link;
      this.match_id = ((Builder)long_).match_id;
      this.match_index = ((Builder)long_).match_index;
      this.player_id = ((Builder)long_).player_id;
    } 
  }
  
  public static final class Builder extends Message.Builder<MatchPlayerInfo> {
    public String avatar;
    
    public Post hot_post;
    
    public Long match_id;
    
    public Integer match_index;
    
    public String name;
    
    public Long player_id;
    
    public Double score;
    
    public Long score_cnt;
    
    public String score_link;
    
    public Integer score_self;
    
    public String sub_avatar;
    
    public String sub_text;
    
    public Builder() {}
    
    public Builder(MatchPlayerInfo param1MatchPlayerInfo) {
      super(param1MatchPlayerInfo);
      if (param1MatchPlayerInfo == null)
        return; 
      this.name = param1MatchPlayerInfo.name;
      this.avatar = param1MatchPlayerInfo.avatar;
      this.score = param1MatchPlayerInfo.score;
      this.score_cnt = param1MatchPlayerInfo.score_cnt;
      this.hot_post = param1MatchPlayerInfo.hot_post;
      this.sub_avatar = param1MatchPlayerInfo.sub_avatar;
      this.sub_text = param1MatchPlayerInfo.sub_text;
      this.score_self = param1MatchPlayerInfo.score_self;
      this.score_link = param1MatchPlayerInfo.score_link;
      this.match_id = param1MatchPlayerInfo.match_id;
      this.match_index = param1MatchPlayerInfo.match_index;
      this.player_id = param1MatchPlayerInfo.player_id;
    }
    
    public MatchPlayerInfo build(boolean param1Boolean) {
      return new MatchPlayerInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
