package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;
import tbclient.Toast;

public final class DataRes extends Message {
  public static final List<CommonPopupData> DEFAULT_COMMON_POPUP_LIST;
  
  public static final List<AlaLiveInfo> DEFAULT_LIVE_FOLLOW_SECOND_FLOOR = Collections.emptyList();
  
  public static final List<AlaLiveInfo> DEFAULT_LIVE_INDEX_SECOND_FLOOR = Collections.emptyList();
  
  public static final List<AlaLiveInfo> DEFAULT_LIVE_PIC_SECOND_FLOOR = Collections.emptyList();
  
  public static final String DEFAULT_UNIQ_ID = "";
  
  @ProtoField(tag = 12)
  public final MemberBroadcastInfo activity_broadcast;
  
  @ProtoField(tag = 14)
  public final BookPopupData book_popup_data;
  
  @ProtoField(tag = 7)
  public final ChatroomFrsRes chatroom_frs;
  
  @ProtoField(tag = 9)
  public final ChatroomMessageTabData chatroom_message_tab;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 16)
  public final List<CommonPopupData> common_popup_list;
  
  @ProtoField(tag = 11)
  public final FestivalInfo festival_info;
  
  @ProtoField(tag = 3)
  public final IconRes icon;
  
  @ProtoField(tag = 2)
  public final LevelRes level;
  
  @ProtoField(tag = 1)
  public final LiveRes live;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<AlaLiveInfo> live_follow_second_floor;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<AlaLiveInfo> live_index_second_floor;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<AlaLiveInfo> live_pic_second_floor;
  
  @ProtoField(tag = 10)
  public final MemberBroadcastInfo member_broadcast;
  
  @ProtoField(tag = 13)
  public final SidebarMsg sidebar_msg;
  
  @ProtoField(tag = 15)
  public final Toast toast;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String uniq_id;
  
  static {
    DEFAULT_COMMON_POPUP_LIST = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<CommonPopupData> list;
    if (paramBoolean == true) {
      this.live = paramBuilder.live;
      this.level = paramBuilder.level;
      this.icon = paramBuilder.icon;
      List<AlaLiveInfo> list1 = paramBuilder.live_follow_second_floor;
      if (list1 == null) {
        this.live_follow_second_floor = DEFAULT_LIVE_FOLLOW_SECOND_FLOOR;
      } else {
        this.live_follow_second_floor = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.live_index_second_floor;
      if (list1 == null) {
        this.live_index_second_floor = DEFAULT_LIVE_INDEX_SECOND_FLOOR;
      } else {
        this.live_index_second_floor = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.live_pic_second_floor;
      if (list1 == null) {
        this.live_pic_second_floor = DEFAULT_LIVE_PIC_SECOND_FLOOR;
      } else {
        this.live_pic_second_floor = Message.immutableCopyOf(list1);
      } 
      this.chatroom_frs = paramBuilder.chatroom_frs;
      String str = paramBuilder.uniq_id;
      if (str == null) {
        this.uniq_id = "";
      } else {
        this.uniq_id = str;
      } 
      this.chatroom_message_tab = paramBuilder.chatroom_message_tab;
      this.member_broadcast = paramBuilder.member_broadcast;
      this.festival_info = paramBuilder.festival_info;
      this.activity_broadcast = paramBuilder.activity_broadcast;
      this.sidebar_msg = paramBuilder.sidebar_msg;
      this.book_popup_data = paramBuilder.book_popup_data;
      this.toast = paramBuilder.toast;
      list = paramBuilder.common_popup_list;
      if (list == null) {
        this.common_popup_list = DEFAULT_COMMON_POPUP_LIST;
      } else {
        this.common_popup_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.live = ((Builder)list).live;
      this.level = ((Builder)list).level;
      this.icon = ((Builder)list).icon;
      this.live_follow_second_floor = Message.immutableCopyOf(((Builder)list).live_follow_second_floor);
      this.live_index_second_floor = Message.immutableCopyOf(((Builder)list).live_index_second_floor);
      this.live_pic_second_floor = Message.immutableCopyOf(((Builder)list).live_pic_second_floor);
      this.chatroom_frs = ((Builder)list).chatroom_frs;
      this.uniq_id = ((Builder)list).uniq_id;
      this.chatroom_message_tab = ((Builder)list).chatroom_message_tab;
      this.member_broadcast = ((Builder)list).member_broadcast;
      this.festival_info = ((Builder)list).festival_info;
      this.activity_broadcast = ((Builder)list).activity_broadcast;
      this.sidebar_msg = ((Builder)list).sidebar_msg;
      this.book_popup_data = ((Builder)list).book_popup_data;
      this.toast = ((Builder)list).toast;
      this.common_popup_list = Message.immutableCopyOf(((Builder)list).common_popup_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public MemberBroadcastInfo activity_broadcast;
    
    public BookPopupData book_popup_data;
    
    public ChatroomFrsRes chatroom_frs;
    
    public ChatroomMessageTabData chatroom_message_tab;
    
    public List<CommonPopupData> common_popup_list;
    
    public FestivalInfo festival_info;
    
    public IconRes icon;
    
    public LevelRes level;
    
    public LiveRes live;
    
    public List<AlaLiveInfo> live_follow_second_floor;
    
    public List<AlaLiveInfo> live_index_second_floor;
    
    public List<AlaLiveInfo> live_pic_second_floor;
    
    public MemberBroadcastInfo member_broadcast;
    
    public SidebarMsg sidebar_msg;
    
    public Toast toast;
    
    public String uniq_id;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.live = param1DataRes.live;
      this.level = param1DataRes.level;
      this.icon = param1DataRes.icon;
      this.live_follow_second_floor = Message.copyOf(param1DataRes.live_follow_second_floor);
      this.live_index_second_floor = Message.copyOf(param1DataRes.live_index_second_floor);
      this.live_pic_second_floor = Message.copyOf(param1DataRes.live_pic_second_floor);
      this.chatroom_frs = param1DataRes.chatroom_frs;
      this.uniq_id = param1DataRes.uniq_id;
      this.chatroom_message_tab = param1DataRes.chatroom_message_tab;
      this.member_broadcast = param1DataRes.member_broadcast;
      this.festival_info = param1DataRes.festival_info;
      this.activity_broadcast = param1DataRes.activity_broadcast;
      this.sidebar_msg = param1DataRes.sidebar_msg;
      this.book_popup_data = param1DataRes.book_popup_data;
      this.toast = param1DataRes.toast;
      this.common_popup_list = Message.copyOf(param1DataRes.common_popup_list);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
