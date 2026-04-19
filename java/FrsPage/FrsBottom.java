package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FrsBottomActivityBase;
import tbclient.FrsBottomChatroomBase;
import tbclient.FrsBottomSmartBgColor;

public final class FrsBottom extends Message {
  public static final Integer DEFAULT_HAS_MORE_MODULE = Integer.valueOf(0);
  
  @ProtoField(tag = 1)
  public final FrsBottomActivityBase frs_activity;
  
  @ProtoField(tag = 2)
  public final FrsBottomChatroomBase frs_chatroom;
  
  @ProtoField(tag = 3)
  public final FrsBottomSmartBgColor frs_smart_bg_color;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer has_more_module;
  
  public FrsBottom(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.frs_activity = paramBuilder.frs_activity;
      this.frs_chatroom = paramBuilder.frs_chatroom;
      this.frs_smart_bg_color = paramBuilder.frs_smart_bg_color;
      integer = paramBuilder.has_more_module;
      if (integer == null) {
        this.has_more_module = DEFAULT_HAS_MORE_MODULE;
      } else {
        this.has_more_module = integer;
      } 
    } else {
      this.frs_activity = ((Builder)integer).frs_activity;
      this.frs_chatroom = ((Builder)integer).frs_chatroom;
      this.frs_smart_bg_color = ((Builder)integer).frs_smart_bg_color;
      this.has_more_module = ((Builder)integer).has_more_module;
    } 
  }
  
  public static final class Builder extends Message.Builder<FrsBottom> {
    public FrsBottomActivityBase frs_activity;
    
    public FrsBottomChatroomBase frs_chatroom;
    
    public FrsBottomSmartBgColor frs_smart_bg_color;
    
    public Integer has_more_module;
    
    public Builder() {}
    
    public Builder(FrsBottom param1FrsBottom) {
      super(param1FrsBottom);
      if (param1FrsBottom == null)
        return; 
      this.frs_activity = param1FrsBottom.frs_activity;
      this.frs_chatroom = param1FrsBottom.frs_chatroom;
      this.frs_smart_bg_color = param1FrsBottom.frs_smart_bg_color;
      this.has_more_module = param1FrsBottom.has_more_module;
    }
    
    public FrsBottom build(boolean param1Boolean) {
      return new FrsBottom(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
