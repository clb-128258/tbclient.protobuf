package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsBottomActivity;

public final class FrsPageCardData extends Message {
  public static final List<LiveFuseForumData> DEFAULT_LIVE_FUSE_FORUM;
  
  public static final List<LiveModuleList> DEFAULT_LIVE_MODULE_LIST = Collections.emptyList();
  
  @ProtoField(tag = 4)
  public final AiChatroomGuide ai_chatroom_guide;
  
  @ProtoField(tag = 5)
  public final FrsBottomActivity frs_activity;
  
  @ProtoField(tag = 6)
  public final FrsBannerHeader frs_banner_header;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<LiveFuseForumData> live_fuse_forum;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<LiveModuleList> live_module_list;
  
  @ProtoField(tag = 2)
  public final TopLiveData top_live_data;
  
  static {
    DEFAULT_LIVE_FUSE_FORUM = Collections.emptyList();
  }
  
  public FrsPageCardData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<LiveModuleList> list1 = paramBuilder.live_module_list;
      if (list1 == null) {
        this.live_module_list = DEFAULT_LIVE_MODULE_LIST;
      } else {
        this.live_module_list = Message.immutableCopyOf(list1);
      } 
      this.top_live_data = paramBuilder.top_live_data;
      List<LiveFuseForumData> list = paramBuilder.live_fuse_forum;
      if (list == null) {
        this.live_fuse_forum = DEFAULT_LIVE_FUSE_FORUM;
      } else {
        this.live_fuse_forum = Message.immutableCopyOf(list);
      } 
      this.ai_chatroom_guide = paramBuilder.ai_chatroom_guide;
      this.frs_activity = paramBuilder.frs_activity;
      this.frs_banner_header = paramBuilder.frs_banner_header;
    } else {
      this.live_module_list = Message.immutableCopyOf(paramBuilder.live_module_list);
      this.top_live_data = paramBuilder.top_live_data;
      this.live_fuse_forum = Message.immutableCopyOf(paramBuilder.live_fuse_forum);
      this.ai_chatroom_guide = paramBuilder.ai_chatroom_guide;
      this.frs_activity = paramBuilder.frs_activity;
      this.frs_banner_header = paramBuilder.frs_banner_header;
    } 
  }
  
  public static final class Builder extends Message.Builder<FrsPageCardData> {
    public AiChatroomGuide ai_chatroom_guide;
    
    public FrsBottomActivity frs_activity;
    
    public FrsBannerHeader frs_banner_header;
    
    public List<LiveFuseForumData> live_fuse_forum;
    
    public List<LiveModuleList> live_module_list;
    
    public TopLiveData top_live_data;
    
    public Builder() {}
    
    public Builder(FrsPageCardData param1FrsPageCardData) {
      super(param1FrsPageCardData);
      if (param1FrsPageCardData == null)
        return; 
      this.live_module_list = Message.copyOf(param1FrsPageCardData.live_module_list);
      this.top_live_data = param1FrsPageCardData.top_live_data;
      this.live_fuse_forum = Message.copyOf(param1FrsPageCardData.live_fuse_forum);
      this.ai_chatroom_guide = param1FrsPageCardData.ai_chatroom_guide;
      this.frs_activity = param1FrsPageCardData.frs_activity;
      this.frs_banner_header = param1FrsPageCardData.frs_banner_header;
    }
    
    public FrsPageCardData build(boolean param1Boolean) {
      return new FrsPageCardData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
