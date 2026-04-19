package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;
import tbclient.Anti;
import tbclient.BannerImage;
import tbclient.BubbleInfo;
import tbclient.CustomGrid;
import tbclient.DealWindow;
import tbclient.DynamicInfo;
import tbclient.FeedKV;
import tbclient.Feedback;
import tbclient.ForumDynamic;
import tbclient.GoodsWin;
import tbclient.Highlist;
import tbclient.HotUserRankEntry;
import tbclient.ModuleInfo;
import tbclient.NamoaixudEntry;
import tbclient.PostInfoList;
import tbclient.SmartApp;
import tbclient.TbBookrack;
import tbclient.ThreadInfo;
import tbclient.UcCard;
import tbclient.UcCardInfo;
import tbclient.User;
import tbclient.UserManChannelInfo;
import tbclient.UserMap;

public final class DataRes extends Message {
  public static final List<AlaLiveInfo> DEFAULT_ALA_LIVE_RECORD;
  
  public static final List<BannerImage> DEFAULT_BANNER;
  
  public static final String DEFAULT_BOT_UK = "";
  
  public static final List<UcCardInfo> DEFAULT_COMMON_CARD;
  
  public static final List<ForumDynamic> DEFAULT_CONCERNED_FORUM_LIST;
  
  public static final List<CustomGrid> DEFAULT_CUSTOM_GRID;
  
  public static final List<DynamicInfo> DEFAULT_DYNAMIC_LIST;
  
  public static final Integer DEFAULT_IS_BLACK_WHITE;
  
  public static final List<KingkongPositionRow> DEFAULT_KINGKONG_POSITION;
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final List<CustomGrid> DEFAULT_MORE_GRID;
  
  public static final String DEFAULT_MSG_BUTTON_TEXT = "";
  
  public static final List<ThreadInfo> DEFAULT_NEWEST_DYNAMIC_LIST;
  
  public static final List<PostInfoList> DEFAULT_POST_LIST = Collections.emptyList();
  
  public static final List<SmartApp> DEFAULT_RECOM_NAWS_LIST;
  
  public static final String DEFAULT_UK = "";
  
  public static final List<UserMap> DEFAULT_URL_MAP;
  
  public static final Integer DEFAULT_WORK_TAB_ID;
  
  public static final List<ZoneInfo> DEFAULT_ZONE_INFO;
  
  @ProtoField(tag = 16)
  public final AlaLiveInfo ala_live_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 19)
  public final List<AlaLiveInfo> ala_live_record;
  
  @ProtoField(tag = 2)
  public final Anti anti_stat;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 22)
  public final List<BannerImage> banner;
  
  @ProtoField(tag = 36)
  public final MemberBlockInfo block_info;
  
  @ProtoField(tag = 49, type = Message.Datatype.STRING)
  public final String bot_uk;
  
  @ProtoField(tag = 38)
  public final BubbleInfo bubble_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 40)
  public final List<UcCardInfo> common_card;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 13)
  public final List<ForumDynamic> concerned_forum_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 41)
  public final List<CustomGrid> custom_grid;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 12)
  public final List<DynamicInfo> dynamic_list;
  
  @ProtoField(tag = 10)
  public final Feedback feedback;
  
  @ProtoField(tag = 35)
  public final FinanceTab finance_tab;
  
  @ProtoField(tag = 50)
  public final ForumBotInfo forum_bot_info;
  
  @ProtoField(tag = 26)
  public final GoodsWin goods_win;
  
  @ProtoField(tag = 7)
  public final Highlist highs;
  
  @ProtoField(tag = 29, type = Message.Datatype.INT32)
  public final Integer is_black_white;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 43)
  public final List<KingkongPositionRow> kingkong_position;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 47)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 15)
  public final ModuleInfo module_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 42)
  public final List<CustomGrid> more_grid;
  
  @ProtoField(tag = 45, type = Message.Datatype.STRING)
  public final String msg_button_text;
  
  @ProtoField(tag = 24)
  public final Namoaixud namoaixud;
  
  @ProtoField(tag = 37)
  public final NamoaixudEntry namoaixud_entry;
  
  @ProtoField(tag = 27)
  public final HotUserRankEntry new_god_rankinfo;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 25)
  public final List<ThreadInfo> newest_dynamic_list;
  
  @ProtoField(tag = 17)
  public final NicknameInfo nickname_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<PostInfoList> post_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 23)
  public final List<SmartApp> recom_naws_list;
  
  @ProtoField(tag = 3)
  public final TAInfo tainfo;
  
  @ProtoField(tag = 9)
  public final TbBookrack tbbookrack;
  
  @ProtoField(tag = 6)
  public final UcCard uc_card;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String uk;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 20)
  public final List<UserMap> url_map;
  
  @ProtoField(tag = 1)
  public final User user;
  
  @ProtoField(tag = 48)
  public final AgentInfo user_agent_info;
  
  @ProtoField(tag = 14)
  public final UserAgreeInfo user_agree_info;
  
  @ProtoField(tag = 5)
  public final UserGodInfo user_god_info;
  
  @ProtoField(tag = 51)
  public final UserInvitesData user_invites_data;
  
  @ProtoField(tag = 11)
  public final UserManChannelInfo video_channel_info;
  
  @ProtoField(tag = 39)
  public final VipBanner vip_banner;
  
  @ProtoField(tag = 8)
  public final DealWindow window;
  
  @ProtoField(tag = 34, type = Message.Datatype.UINT32)
  public final Integer work_tab_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 46)
  public final List<ZoneInfo> zone_info;
  
  static {
    DEFAULT_DYNAMIC_LIST = Collections.emptyList();
    DEFAULT_CONCERNED_FORUM_LIST = Collections.emptyList();
    DEFAULT_ALA_LIVE_RECORD = Collections.emptyList();
    DEFAULT_URL_MAP = Collections.emptyList();
    DEFAULT_BANNER = Collections.emptyList();
    DEFAULT_RECOM_NAWS_LIST = Collections.emptyList();
    DEFAULT_NEWEST_DYNAMIC_LIST = Collections.emptyList();
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_BLACK_WHITE = integer;
    DEFAULT_WORK_TAB_ID = integer;
    DEFAULT_COMMON_CARD = Collections.emptyList();
    DEFAULT_CUSTOM_GRID = Collections.emptyList();
    DEFAULT_MORE_GRID = Collections.emptyList();
    DEFAULT_KINGKONG_POSITION = Collections.emptyList();
    DEFAULT_ZONE_INFO = Collections.emptyList();
    DEFAULT_LOG_PARAM = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.user = paramBuilder.user;
      this.anti_stat = paramBuilder.anti_stat;
      this.tainfo = paramBuilder.tainfo;
      List<PostInfoList> list12 = paramBuilder.post_list;
      if (list12 == null) {
        this.post_list = DEFAULT_POST_LIST;
      } else {
        this.post_list = Message.immutableCopyOf(list12);
      } 
      this.user_god_info = paramBuilder.user_god_info;
      this.uc_card = paramBuilder.uc_card;
      this.highs = paramBuilder.highs;
      this.window = paramBuilder.window;
      this.tbbookrack = paramBuilder.tbbookrack;
      this.feedback = paramBuilder.feedback;
      this.video_channel_info = paramBuilder.video_channel_info;
      List<DynamicInfo> list11 = paramBuilder.dynamic_list;
      if (list11 == null) {
        this.dynamic_list = DEFAULT_DYNAMIC_LIST;
      } else {
        this.dynamic_list = Message.immutableCopyOf(list11);
      } 
      List<ForumDynamic> list10 = paramBuilder.concerned_forum_list;
      if (list10 == null) {
        this.concerned_forum_list = DEFAULT_CONCERNED_FORUM_LIST;
      } else {
        this.concerned_forum_list = Message.immutableCopyOf(list10);
      } 
      this.user_agree_info = paramBuilder.user_agree_info;
      this.module_info = paramBuilder.module_info;
      this.ala_live_info = paramBuilder.ala_live_info;
      this.nickname_info = paramBuilder.nickname_info;
      List<AlaLiveInfo> list9 = paramBuilder.ala_live_record;
      if (list9 == null) {
        this.ala_live_record = DEFAULT_ALA_LIVE_RECORD;
      } else {
        this.ala_live_record = Message.immutableCopyOf(list9);
      } 
      List<UserMap> list8 = paramBuilder.url_map;
      if (list8 == null) {
        this.url_map = DEFAULT_URL_MAP;
      } else {
        this.url_map = Message.immutableCopyOf(list8);
      } 
      List<BannerImage> list7 = paramBuilder.banner;
      if (list7 == null) {
        this.banner = DEFAULT_BANNER;
      } else {
        this.banner = Message.immutableCopyOf(list7);
      } 
      List<SmartApp> list6 = paramBuilder.recom_naws_list;
      if (list6 == null) {
        this.recom_naws_list = DEFAULT_RECOM_NAWS_LIST;
      } else {
        this.recom_naws_list = Message.immutableCopyOf(list6);
      } 
      this.namoaixud = paramBuilder.namoaixud;
      List<ThreadInfo> list5 = paramBuilder.newest_dynamic_list;
      if (list5 == null) {
        this.newest_dynamic_list = DEFAULT_NEWEST_DYNAMIC_LIST;
      } else {
        this.newest_dynamic_list = Message.immutableCopyOf(list5);
      } 
      this.goods_win = paramBuilder.goods_win;
      this.new_god_rankinfo = paramBuilder.new_god_rankinfo;
      String str3 = paramBuilder.uk;
      if (str3 == null) {
        this.uk = "";
      } else {
        this.uk = str3;
      } 
      Integer integer = paramBuilder.is_black_white;
      if (integer == null) {
        this.is_black_white = DEFAULT_IS_BLACK_WHITE;
      } else {
        this.is_black_white = integer;
      } 
      integer = paramBuilder.work_tab_id;
      if (integer == null) {
        this.work_tab_id = DEFAULT_WORK_TAB_ID;
      } else {
        this.work_tab_id = integer;
      } 
      this.finance_tab = paramBuilder.finance_tab;
      this.block_info = paramBuilder.block_info;
      this.namoaixud_entry = paramBuilder.namoaixud_entry;
      this.bubble_info = paramBuilder.bubble_info;
      this.vip_banner = paramBuilder.vip_banner;
      List<UcCardInfo> list4 = paramBuilder.common_card;
      if (list4 == null) {
        this.common_card = DEFAULT_COMMON_CARD;
      } else {
        this.common_card = Message.immutableCopyOf(list4);
      } 
      List<CustomGrid> list3 = paramBuilder.custom_grid;
      if (list3 == null) {
        this.custom_grid = DEFAULT_CUSTOM_GRID;
      } else {
        this.custom_grid = Message.immutableCopyOf(list3);
      } 
      list3 = paramBuilder.more_grid;
      if (list3 == null) {
        this.more_grid = DEFAULT_MORE_GRID;
      } else {
        this.more_grid = Message.immutableCopyOf(list3);
      } 
      List<KingkongPositionRow> list2 = paramBuilder.kingkong_position;
      if (list2 == null) {
        this.kingkong_position = DEFAULT_KINGKONG_POSITION;
      } else {
        this.kingkong_position = Message.immutableCopyOf(list2);
      } 
      String str2 = paramBuilder.msg_button_text;
      if (str2 == null) {
        this.msg_button_text = "";
      } else {
        this.msg_button_text = str2;
      } 
      List<ZoneInfo> list1 = paramBuilder.zone_info;
      if (list1 == null) {
        this.zone_info = DEFAULT_ZONE_INFO;
      } else {
        this.zone_info = Message.immutableCopyOf(list1);
      } 
      List<FeedKV> list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
      this.user_agent_info = paramBuilder.user_agent_info;
      String str1 = paramBuilder.bot_uk;
      if (str1 == null) {
        this.bot_uk = "";
      } else {
        this.bot_uk = str1;
      } 
      this.forum_bot_info = paramBuilder.forum_bot_info;
      this.user_invites_data = paramBuilder.user_invites_data;
    } else {
      this.user = paramBuilder.user;
      this.anti_stat = paramBuilder.anti_stat;
      this.tainfo = paramBuilder.tainfo;
      this.post_list = Message.immutableCopyOf(paramBuilder.post_list);
      this.user_god_info = paramBuilder.user_god_info;
      this.uc_card = paramBuilder.uc_card;
      this.highs = paramBuilder.highs;
      this.window = paramBuilder.window;
      this.tbbookrack = paramBuilder.tbbookrack;
      this.feedback = paramBuilder.feedback;
      this.video_channel_info = paramBuilder.video_channel_info;
      this.dynamic_list = Message.immutableCopyOf(paramBuilder.dynamic_list);
      this.concerned_forum_list = Message.immutableCopyOf(paramBuilder.concerned_forum_list);
      this.user_agree_info = paramBuilder.user_agree_info;
      this.module_info = paramBuilder.module_info;
      this.ala_live_info = paramBuilder.ala_live_info;
      this.nickname_info = paramBuilder.nickname_info;
      this.ala_live_record = Message.immutableCopyOf(paramBuilder.ala_live_record);
      this.url_map = Message.immutableCopyOf(paramBuilder.url_map);
      this.banner = Message.immutableCopyOf(paramBuilder.banner);
      this.recom_naws_list = Message.immutableCopyOf(paramBuilder.recom_naws_list);
      this.namoaixud = paramBuilder.namoaixud;
      this.newest_dynamic_list = Message.immutableCopyOf(paramBuilder.newest_dynamic_list);
      this.goods_win = paramBuilder.goods_win;
      this.new_god_rankinfo = paramBuilder.new_god_rankinfo;
      this.uk = paramBuilder.uk;
      this.is_black_white = paramBuilder.is_black_white;
      this.work_tab_id = paramBuilder.work_tab_id;
      this.finance_tab = paramBuilder.finance_tab;
      this.block_info = paramBuilder.block_info;
      this.namoaixud_entry = paramBuilder.namoaixud_entry;
      this.bubble_info = paramBuilder.bubble_info;
      this.vip_banner = paramBuilder.vip_banner;
      this.common_card = Message.immutableCopyOf(paramBuilder.common_card);
      this.custom_grid = Message.immutableCopyOf(paramBuilder.custom_grid);
      this.more_grid = Message.immutableCopyOf(paramBuilder.more_grid);
      this.kingkong_position = Message.immutableCopyOf(paramBuilder.kingkong_position);
      this.msg_button_text = paramBuilder.msg_button_text;
      this.zone_info = Message.immutableCopyOf(paramBuilder.zone_info);
      this.log_param = Message.immutableCopyOf(paramBuilder.log_param);
      this.user_agent_info = paramBuilder.user_agent_info;
      this.bot_uk = paramBuilder.bot_uk;
      this.forum_bot_info = paramBuilder.forum_bot_info;
      this.user_invites_data = paramBuilder.user_invites_data;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public AlaLiveInfo ala_live_info;
    
    public List<AlaLiveInfo> ala_live_record;
    
    public Anti anti_stat;
    
    public List<BannerImage> banner;
    
    public MemberBlockInfo block_info;
    
    public String bot_uk;
    
    public BubbleInfo bubble_info;
    
    public List<UcCardInfo> common_card;
    
    public List<ForumDynamic> concerned_forum_list;
    
    public List<CustomGrid> custom_grid;
    
    public List<DynamicInfo> dynamic_list;
    
    public Feedback feedback;
    
    public FinanceTab finance_tab;
    
    public ForumBotInfo forum_bot_info;
    
    public GoodsWin goods_win;
    
    public Highlist highs;
    
    public Integer is_black_white;
    
    public List<KingkongPositionRow> kingkong_position;
    
    public List<FeedKV> log_param;
    
    public ModuleInfo module_info;
    
    public List<CustomGrid> more_grid;
    
    public String msg_button_text;
    
    public Namoaixud namoaixud;
    
    public NamoaixudEntry namoaixud_entry;
    
    public HotUserRankEntry new_god_rankinfo;
    
    public List<ThreadInfo> newest_dynamic_list;
    
    public NicknameInfo nickname_info;
    
    public List<PostInfoList> post_list;
    
    public List<SmartApp> recom_naws_list;
    
    public TAInfo tainfo;
    
    public TbBookrack tbbookrack;
    
    public UcCard uc_card;
    
    public String uk;
    
    public List<UserMap> url_map;
    
    public User user;
    
    public AgentInfo user_agent_info;
    
    public UserAgreeInfo user_agree_info;
    
    public UserGodInfo user_god_info;
    
    public UserInvitesData user_invites_data;
    
    public UserManChannelInfo video_channel_info;
    
    public VipBanner vip_banner;
    
    public DealWindow window;
    
    public Integer work_tab_id;
    
    public List<ZoneInfo> zone_info;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.user = param1DataRes.user;
      this.anti_stat = param1DataRes.anti_stat;
      this.tainfo = param1DataRes.tainfo;
      this.post_list = Message.copyOf(param1DataRes.post_list);
      this.user_god_info = param1DataRes.user_god_info;
      this.uc_card = param1DataRes.uc_card;
      this.highs = param1DataRes.highs;
      this.window = param1DataRes.window;
      this.tbbookrack = param1DataRes.tbbookrack;
      this.feedback = param1DataRes.feedback;
      this.video_channel_info = param1DataRes.video_channel_info;
      this.dynamic_list = Message.copyOf(param1DataRes.dynamic_list);
      this.concerned_forum_list = Message.copyOf(param1DataRes.concerned_forum_list);
      this.user_agree_info = param1DataRes.user_agree_info;
      this.module_info = param1DataRes.module_info;
      this.ala_live_info = param1DataRes.ala_live_info;
      this.nickname_info = param1DataRes.nickname_info;
      this.ala_live_record = Message.copyOf(param1DataRes.ala_live_record);
      this.url_map = Message.copyOf(param1DataRes.url_map);
      this.banner = Message.copyOf(param1DataRes.banner);
      this.recom_naws_list = Message.copyOf(param1DataRes.recom_naws_list);
      this.namoaixud = param1DataRes.namoaixud;
      this.newest_dynamic_list = Message.copyOf(param1DataRes.newest_dynamic_list);
      this.goods_win = param1DataRes.goods_win;
      this.new_god_rankinfo = param1DataRes.new_god_rankinfo;
      this.uk = param1DataRes.uk;
      this.is_black_white = param1DataRes.is_black_white;
      this.work_tab_id = param1DataRes.work_tab_id;
      this.finance_tab = param1DataRes.finance_tab;
      this.block_info = param1DataRes.block_info;
      this.namoaixud_entry = param1DataRes.namoaixud_entry;
      this.bubble_info = param1DataRes.bubble_info;
      this.vip_banner = param1DataRes.vip_banner;
      this.common_card = Message.copyOf(param1DataRes.common_card);
      this.custom_grid = Message.copyOf(param1DataRes.custom_grid);
      this.more_grid = Message.copyOf(param1DataRes.more_grid);
      this.kingkong_position = Message.copyOf(param1DataRes.kingkong_position);
      this.msg_button_text = param1DataRes.msg_button_text;
      this.zone_info = Message.copyOf(param1DataRes.zone_info);
      this.log_param = Message.copyOf(param1DataRes.log_param);
      this.user_agent_info = param1DataRes.user_agent_info;
      this.bot_uk = param1DataRes.bot_uk;
      this.forum_bot_info = param1DataRes.forum_bot_info;
      this.user_invites_data = param1DataRes.user_invites_data;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
