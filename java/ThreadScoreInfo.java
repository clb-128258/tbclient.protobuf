package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ThreadScoreInfo extends Message {
  public static final Integer DEFAULT_AUDIT_STATUS;
  
  public static final List<ThreadScoreItem> DEFAULT_ITEMS;
  
  public static final List<Long> DEFAULT_SCORE_ITEM_IDS;
  
  public static final Integer DEFAULT_SHOW_INDEX;
  
  public static final Integer DEFAULT_TOTAL_ITEMS_COUNT;
  
  public static final Long DEFAULT_TOTAL_USER_COUNT;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer audit_status;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadScoreItem> items;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.UINT64)
  public final List<Long> score_item_ids;
  
  @ProtoField(tag = 5)
  public final ScoreLevelLimit score_level_limit;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer show_index;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer total_items_count;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long total_user_count;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TOTAL_ITEMS_COUNT = integer;
    DEFAULT_ITEMS = Collections.emptyList();
    DEFAULT_TOTAL_USER_COUNT = Long.valueOf(0L);
    DEFAULT_SHOW_INDEX = integer;
    DEFAULT_SCORE_ITEM_IDS = Collections.emptyList();
    DEFAULT_AUDIT_STATUS = integer;
  }
  
  public ThreadScoreInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.total_items_count;
      if (integer2 == null) {
        this.total_items_count = DEFAULT_TOTAL_ITEMS_COUNT;
      } else {
        this.total_items_count = integer2;
      } 
      List<ThreadScoreItem> list1 = paramBuilder.items;
      if (list1 == null) {
        this.items = DEFAULT_ITEMS;
      } else {
        this.items = Message.immutableCopyOf(list1);
      } 
      Long long_ = paramBuilder.total_user_count;
      if (long_ == null) {
        this.total_user_count = DEFAULT_TOTAL_USER_COUNT;
      } else {
        this.total_user_count = long_;
      } 
      Integer integer1 = paramBuilder.show_index;
      if (integer1 == null) {
        this.show_index = DEFAULT_SHOW_INDEX;
      } else {
        this.show_index = integer1;
      } 
      this.score_level_limit = paramBuilder.score_level_limit;
      List<Long> list = paramBuilder.score_item_ids;
      if (list == null) {
        this.score_item_ids = DEFAULT_SCORE_ITEM_IDS;
      } else {
        this.score_item_ids = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.audit_status;
      if (integer == null) {
        this.audit_status = DEFAULT_AUDIT_STATUS;
      } else {
        this.audit_status = integer;
      } 
    } else {
      this.total_items_count = ((Builder)integer).total_items_count;
      this.items = Message.immutableCopyOf(((Builder)integer).items);
      this.total_user_count = ((Builder)integer).total_user_count;
      this.show_index = ((Builder)integer).show_index;
      this.score_level_limit = ((Builder)integer).score_level_limit;
      this.score_item_ids = Message.immutableCopyOf(((Builder)integer).score_item_ids);
      this.audit_status = ((Builder)integer).audit_status;
    } 
  }
  
  public static final class Builder extends Message.Builder<ThreadScoreInfo> {
    public Integer audit_status;
    
    public List<ThreadScoreItem> items;
    
    public List<Long> score_item_ids;
    
    public ScoreLevelLimit score_level_limit;
    
    public Integer show_index;
    
    public Integer total_items_count;
    
    public Long total_user_count;
    
    public Builder() {}
    
    public Builder(ThreadScoreInfo param1ThreadScoreInfo) {
      super(param1ThreadScoreInfo);
      if (param1ThreadScoreInfo == null)
        return; 
      this.total_items_count = param1ThreadScoreInfo.total_items_count;
      this.items = Message.copyOf(param1ThreadScoreInfo.items);
      this.total_user_count = param1ThreadScoreInfo.total_user_count;
      this.show_index = param1ThreadScoreInfo.show_index;
      this.score_level_limit = param1ThreadScoreInfo.score_level_limit;
      this.score_item_ids = Message.copyOf(param1ThreadScoreInfo.score_item_ids);
      this.audit_status = param1ThreadScoreInfo.audit_status;
    }
    
    public ThreadScoreInfo build(boolean param1Boolean) {
      return new ThreadScoreInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
