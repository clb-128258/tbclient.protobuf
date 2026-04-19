package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedScoreItem extends Message {
  public static final Long DEFAULT_SCORE_ITEM_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 3)
  public final ConfigurableHeadTitle extra_data;
  
  @ProtoField(tag = 1)
  public final FeedHeadImg image_data;
  
  @ProtoField(tag = 2)
  public final ConfigurableHeadTitle main_data;
  
  @ProtoField(tag = 4)
  public final FeedContentResource score;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long score_item_id;
  
  @ProtoField(tag = 5)
  public final FeedContentResource user_count;
  
  public FeedScoreItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.image_data = paramBuilder.image_data;
      this.main_data = paramBuilder.main_data;
      this.extra_data = paramBuilder.extra_data;
      this.score = paramBuilder.score;
      this.user_count = paramBuilder.user_count;
      long_ = paramBuilder.score_item_id;
      if (long_ == null) {
        this.score_item_id = DEFAULT_SCORE_ITEM_ID;
      } else {
        this.score_item_id = long_;
      } 
    } else {
      this.image_data = ((Builder)long_).image_data;
      this.main_data = ((Builder)long_).main_data;
      this.extra_data = ((Builder)long_).extra_data;
      this.score = ((Builder)long_).score;
      this.user_count = ((Builder)long_).user_count;
      this.score_item_id = ((Builder)long_).score_item_id;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedScoreItem> {
    public ConfigurableHeadTitle extra_data;
    
    public FeedHeadImg image_data;
    
    public ConfigurableHeadTitle main_data;
    
    public FeedContentResource score;
    
    public Long score_item_id;
    
    public FeedContentResource user_count;
    
    public Builder() {}
    
    public Builder(FeedScoreItem param1FeedScoreItem) {
      super(param1FeedScoreItem);
      if (param1FeedScoreItem == null)
        return; 
      this.image_data = param1FeedScoreItem.image_data;
      this.main_data = param1FeedScoreItem.main_data;
      this.extra_data = param1FeedScoreItem.extra_data;
      this.score = param1FeedScoreItem.score;
      this.user_count = param1FeedScoreItem.user_count;
      this.score_item_id = param1FeedScoreItem.score_item_id;
    }
    
    public FeedScoreItem build(boolean param1Boolean) {
      return new FeedScoreItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
