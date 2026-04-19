package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ThreadScoreItem extends Message {
  public static final String DEFAULT_AVG_SCORE = "";
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final Long DEFAULT_ID;
  
  public static final Integer DEFAULT_MY_SCORE;
  
  public static final String DEFAULT_PIC = "";
  
  public static final List<FeedKV> DEFAULT_SCORE_USER_NUM = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Long DEFAULT_TOTAL_USER_NUM;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String avg_score;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 5)
  public final Post hot_comment;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(tag = 10)
  public final Post my_comment;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer my_score;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pic;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<FeedKV> score_user_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long total_user_num;
  
  static {
    DEFAULT_TOTAL_USER_NUM = long_;
    DEFAULT_MY_SCORE = Integer.valueOf(0);
  }
  
  public ThreadScoreItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.id;
      if (long_2 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_2;
      } 
      String str2 = paramBuilder.pic;
      if (str2 == null) {
        this.pic = "";
      } else {
        this.pic = str2;
      } 
      str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.content;
      if (str2 == null) {
        this.content = "";
      } else {
        this.content = str2;
      } 
      this.hot_comment = paramBuilder.hot_comment;
      List<FeedKV> list = paramBuilder.score_user_num;
      if (list == null) {
        this.score_user_num = DEFAULT_SCORE_USER_NUM;
      } else {
        this.score_user_num = Message.immutableCopyOf(list);
      } 
      Long long_1 = paramBuilder.total_user_num;
      if (long_1 == null) {
        this.total_user_num = DEFAULT_TOTAL_USER_NUM;
      } else {
        this.total_user_num = long_1;
      } 
      String str1 = paramBuilder.avg_score;
      if (str1 == null) {
        this.avg_score = "";
      } else {
        this.avg_score = str1;
      } 
      Integer integer = paramBuilder.my_score;
      if (integer == null) {
        this.my_score = DEFAULT_MY_SCORE;
      } else {
        this.my_score = integer;
      } 
      this.my_comment = paramBuilder.my_comment;
    } else {
      this.id = paramBuilder.id;
      this.pic = paramBuilder.pic;
      this.title = paramBuilder.title;
      this.content = paramBuilder.content;
      this.hot_comment = paramBuilder.hot_comment;
      this.score_user_num = Message.immutableCopyOf(paramBuilder.score_user_num);
      this.total_user_num = paramBuilder.total_user_num;
      this.avg_score = paramBuilder.avg_score;
      this.my_score = paramBuilder.my_score;
      this.my_comment = paramBuilder.my_comment;
    } 
  }
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
  }
  
  public static final class Builder extends Message.Builder<ThreadScoreItem> {
    public String avg_score;
    
    public String content;
    
    public Post hot_comment;
    
    public Long id;
    
    public Post my_comment;
    
    public Integer my_score;
    
    public String pic;
    
    public List<FeedKV> score_user_num;
    
    public String title;
    
    public Long total_user_num;
    
    public Builder() {}
    
    public Builder(ThreadScoreItem param1ThreadScoreItem) {
      super(param1ThreadScoreItem);
      if (param1ThreadScoreItem == null)
        return; 
      this.id = param1ThreadScoreItem.id;
      this.pic = param1ThreadScoreItem.pic;
      this.title = param1ThreadScoreItem.title;
      this.content = param1ThreadScoreItem.content;
      this.hot_comment = param1ThreadScoreItem.hot_comment;
      this.score_user_num = Message.copyOf(param1ThreadScoreItem.score_user_num);
      this.total_user_num = param1ThreadScoreItem.total_user_num;
      this.avg_score = param1ThreadScoreItem.avg_score;
      this.my_score = param1ThreadScoreItem.my_score;
      this.my_comment = param1ThreadScoreItem.my_comment;
    }
    
    public ThreadScoreItem build(boolean param1Boolean) {
      return new ThreadScoreItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
