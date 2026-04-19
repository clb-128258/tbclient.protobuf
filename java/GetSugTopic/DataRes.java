package tbclient.GetSugTopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  @ProtoField(tag = 2)
  public final TopicListModule bang_topic;
  
  @ProtoField(tag = 7)
  public final TopicListModule hot_topic;
  
  @ProtoField(tag = 6)
  public final TopicListModule inspiration_topic;
  
  @ProtoField(tag = 3)
  public final TopicListModule sug_topic;
  
  @ProtoField(tag = 1)
  public final TopicListModule user_his_topic;
  
  @ProtoField(tag = 5)
  public final TopicListModule video_topic;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.user_his_topic = paramBuilder.user_his_topic;
      this.bang_topic = paramBuilder.bang_topic;
      this.sug_topic = paramBuilder.sug_topic;
      this.video_topic = paramBuilder.video_topic;
      this.inspiration_topic = paramBuilder.inspiration_topic;
      this.hot_topic = paramBuilder.hot_topic;
    } else {
      this.user_his_topic = paramBuilder.user_his_topic;
      this.bang_topic = paramBuilder.bang_topic;
      this.sug_topic = paramBuilder.sug_topic;
      this.video_topic = paramBuilder.video_topic;
      this.inspiration_topic = paramBuilder.inspiration_topic;
      this.hot_topic = paramBuilder.hot_topic;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public TopicListModule bang_topic;
    
    public TopicListModule hot_topic;
    
    public TopicListModule inspiration_topic;
    
    public TopicListModule sug_topic;
    
    public TopicListModule user_his_topic;
    
    public TopicListModule video_topic;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.user_his_topic = param1DataRes.user_his_topic;
      this.bang_topic = param1DataRes.bang_topic;
      this.sug_topic = param1DataRes.sug_topic;
      this.video_topic = param1DataRes.video_topic;
      this.inspiration_topic = param1DataRes.inspiration_topic;
      this.hot_topic = param1DataRes.hot_topic;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
