package tbclient.AddPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeedKV;

public final class PostScoreInfo extends Message {
  public static final String DEFAULT_AVG_SCORE = "";
  
  public static final Long DEFAULT_ID;
  
  public static final List<FeedKV> DEFAULT_SCORE_USER_NUM;
  
  public static final Long DEFAULT_TOTAL_USER_NUM;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String avg_score;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedKV> score_user_num;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long total_user_num;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOTAL_USER_NUM = long_;
    DEFAULT_SCORE_USER_NUM = Collections.emptyList();
    DEFAULT_ID = long_;
  }
  
  public PostScoreInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.avg_score;
      if (str == null) {
        this.avg_score = "";
      } else {
        this.avg_score = str;
      } 
      Long long_1 = paramBuilder.total_user_num;
      if (long_1 == null) {
        this.total_user_num = DEFAULT_TOTAL_USER_NUM;
      } else {
        this.total_user_num = long_1;
      } 
      List<FeedKV> list = paramBuilder.score_user_num;
      if (list == null) {
        this.score_user_num = DEFAULT_SCORE_USER_NUM;
      } else {
        this.score_user_num = Message.immutableCopyOf(list);
      } 
      long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
    } else {
      this.avg_score = ((Builder)long_).avg_score;
      this.total_user_num = ((Builder)long_).total_user_num;
      this.score_user_num = Message.immutableCopyOf(((Builder)long_).score_user_num);
      this.id = ((Builder)long_).id;
    } 
  }
  
  public static final class Builder extends Message.Builder<PostScoreInfo> {
    public String avg_score;
    
    public Long id;
    
    public List<FeedKV> score_user_num;
    
    public Long total_user_num;
    
    public Builder() {}
    
    public Builder(PostScoreInfo param1PostScoreInfo) {
      super(param1PostScoreInfo);
      if (param1PostScoreInfo == null)
        return; 
      this.avg_score = param1PostScoreInfo.avg_score;
      this.total_user_num = param1PostScoreInfo.total_user_num;
      this.score_user_num = Message.copyOf(param1PostScoreInfo.score_user_num);
      this.id = param1PostScoreInfo.id;
    }
    
    public PostScoreInfo build(boolean param1Boolean) {
      return new PostScoreInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
