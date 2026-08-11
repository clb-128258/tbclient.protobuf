package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class CommentPublisherConfig extends Message {
  public static final List<PbPublisherBtnsConfig> DEFAULT_BOTTOM_BTNS = Collections.emptyList();
  
  public static final List<PbPublisherBtnsConfig> DEFAULT_COMMENT_BTNS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<PbPublisherBtnsConfig> bottom_btns;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<PbPublisherBtnsConfig> comment_btns;
  
  public CommentPublisherConfig(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<PbPublisherBtnsConfig> list;
    if (paramBoolean == true) {
      List<PbPublisherBtnsConfig> list1 = paramBuilder.bottom_btns;
      if (list1 == null) {
        this.bottom_btns = DEFAULT_BOTTOM_BTNS;
      } else {
        this.bottom_btns = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.comment_btns;
      if (list == null) {
        this.comment_btns = DEFAULT_COMMENT_BTNS;
      } else {
        this.comment_btns = Message.immutableCopyOf(list);
      } 
    } else {
      this.bottom_btns = Message.immutableCopyOf(((Builder)list).bottom_btns);
      this.comment_btns = Message.immutableCopyOf(((Builder)list).comment_btns);
    } 
  }
  
  public static final class Builder extends Message.Builder<CommentPublisherConfig> {
    public List<PbPublisherBtnsConfig> bottom_btns;
    
    public List<PbPublisherBtnsConfig> comment_btns;
    
    public Builder() {}
    
    public Builder(CommentPublisherConfig param1CommentPublisherConfig) {
      super(param1CommentPublisherConfig);
      if (param1CommentPublisherConfig == null)
        return; 
      this.bottom_btns = Message.copyOf(param1CommentPublisherConfig.bottom_btns);
      this.comment_btns = Message.copyOf(param1CommentPublisherConfig.comment_btns);
    }
    
    public CommentPublisherConfig build(boolean param1Boolean) {
      return new CommentPublisherConfig(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
