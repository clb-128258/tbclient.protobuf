package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedLoopReplyComponent extends Message {
  public static final Integer DEFAULT_LOOP_DURATION;
  
  public static final List<FeedInnerReplyComponent> DEFAULT_REPLY_LIST = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer loop_duration;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedInnerReplyComponent> reply_list;
  
  static {
    DEFAULT_LOOP_DURATION = Integer.valueOf(0);
  }
  
  public FeedLoopReplyComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<FeedInnerReplyComponent> list = paramBuilder.reply_list;
      if (list == null) {
        this.reply_list = DEFAULT_REPLY_LIST;
      } else {
        this.reply_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.loop_duration;
      if (integer == null) {
        this.loop_duration = DEFAULT_LOOP_DURATION;
      } else {
        this.loop_duration = integer;
      } 
    } else {
      this.reply_list = Message.immutableCopyOf(((Builder)integer).reply_list);
      this.loop_duration = ((Builder)integer).loop_duration;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedLoopReplyComponent> {
    public Integer loop_duration;
    
    public List<FeedInnerReplyComponent> reply_list;
    
    public Builder() {}
    
    public Builder(FeedLoopReplyComponent param1FeedLoopReplyComponent) {
      super(param1FeedLoopReplyComponent);
      if (param1FeedLoopReplyComponent == null)
        return; 
      this.reply_list = Message.copyOf(param1FeedLoopReplyComponent.reply_list);
      this.loop_duration = param1FeedLoopReplyComponent.loop_duration;
    }
    
    public FeedLoopReplyComponent build(boolean param1Boolean) {
      return new FeedLoopReplyComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
