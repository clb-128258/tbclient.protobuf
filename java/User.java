package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class User extends Message {
  public static final Integer DEFAULT_AGREE_NUM;
  
  public static final String DEFAULT_APPEAL_THREAD_POPOVER = "";
  
  public static final String DEFAULT_AVATAR_URL = "";
  
  public static final String DEFAULT_BAWU_TYPE = "";
  
  public static final String DEFAULT_BDUSS = "";
  
  public static final String DEFAULT_BG_PIC = "";
  
  public static final Integer DEFAULT_BIMG_END_TIME;
  
  public static final String DEFAULT_BIMG_URL = "";
  
  public static final Integer DEFAULT_BOOKMARK_COUNT;
  
  public static final Integer DEFAULT_BOOKMARK_NEW_COUNT;
  
  public static final Integer DEFAULT_CAN_MODIFY_AVATAR;
  
  public static final Integer DEFAULT_CONCERN_NUM;
  
  public static final Integer DEFAULT_DEREGISTERED;
  
  public static final Integer DEFAULT_DISPLAY_AUTH_TYPE;
  
  public static final String DEFAULT_DISPLAY_INTRO = "";
  
  public static final String DEFAULT_DYNAMIC_URL = "";
  
  public static final Integer DEFAULT_EACH_OTHER_FRIEND;
  
  public static final String DEFAULT_EDITING_NICKNAME = "";
  
  public static final Integer DEFAULT_ENABLE_NEW_HOMEPAGE;
  
  public static final String DEFAULT_FANS_NICKNAME = "";
  
  public static final Integer DEFAULT_FANS_NUM;
  
  public static final Integer DEFAULT_FAVORITE_NUM;
  
  public static final String DEFAULT_FOLLOW_FROM = "";
  
  public static final List<ForumToolPerm> DEFAULT_FORUM_TOOL_AUTH;
  
  public static final Long DEFAULT_FRIEND_NUM;
  
  public static final Integer DEFAULT_GENDER;
  
  public static final List<GiftInfo> DEFAULT_GIFT_LIST;
  
  public static final Integer DEFAULT_GIFT_NUM;
  
  public static final List<MyGroupInfo> DEFAULT_GROUPLIST;
  
  public static final Integer DEFAULT_HAS_BOTTLE_ENTER;
  
  public static final Integer DEFAULT_HAS_CONCERNED;
  
  public static final Integer DEFAULT_HEAVY_USER;
  
  public static final List<Icon> DEFAULT_ICONINFO;
  
  public static final Long DEFAULT_ID;
  
  public static final Integer DEFAULT_INFLUENCE;
  
  public static final String DEFAULT_INTRO = "";
  
  public static final String DEFAULT_IOS_BIMG_FORMAT = "";
  
  public static final String DEFAULT_IOS_B_URL = "";
  
  public static final String DEFAULT_IP = "";
  
  public static final String DEFAULT_IP_ADDRESS = "";
  
  public static final Integer DEFAULT_IS_BAWU;
  
  public static final Integer DEFAULT_IS_CLAW;
  
  public static final Integer DEFAULT_IS_COREUSER;
  
  public static final Integer DEFAULT_IS_DEFAULT_AVATAR;
  
  public static final Integer DEFAULT_IS_FANS;
  
  public static final Integer DEFAULT_IS_FORUM_BOT;
  
  public static final Integer DEFAULT_IS_FRIEND;
  
  public static final Integer DEFAULT_IS_GUANFANG;
  
  public static final Integer DEFAULT_IS_HUINIBUKE;
  
  public static final Integer DEFAULT_IS_INTERESTMAN;
  
  public static final Integer DEFAULT_IS_INVITED;
  
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final Integer DEFAULT_IS_LOGIN;
  
  public static final Integer DEFAULT_IS_MANAGER;
  
  public static final Integer DEFAULT_IS_MASK;
  
  public static final Integer DEFAULT_IS_MEM;
  
  public static final Integer DEFAULT_IS_MGC_ACCOUNT;
  
  public static final Integer DEFAULT_IS_NEED_AUTO_AT;
  
  public static final Integer DEFAULT_IS_NICKNAME_EDITING;
  
  public static final Integer DEFAULT_IS_SELECT_TAIL;
  
  public static final Integer DEFAULT_IS_SHOW_REDPACKET;
  
  public static final Integer DEFAULT_IS_VERIFY;
  
  public static final Integer DEFAULT_IS_VIDEOBIGGIE;
  
  public static final Integer DEFAULT_LEFT_CALL_NUM;
  
  public static final Integer DEFAULT_LEVEL_ID;
  
  public static final String DEFAULT_LEVEL_INFLUENCE = "";
  
  public static final String DEFAULT_LEVEL_NAME = "";
  
  public static final List<LikeForumInfo> DEFAULT_LIKEFORUM;
  
  public static final String DEFAULT_LIKE_FORUM_SCHEME = "";
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final List<BazhuSign> DEFAULT_MANAGER_FORUM;
  
  public static final Integer DEFAULT_MEIZHI_LEVEL;
  
  public static final String DEFAULT_MODIFY_AVATAR_DESC = "";
  
  public static final List<SimpleUser> DEFAULT_MUTE_USER;
  
  public static final Integer DEFAULT_MY_LIKE_NUM;
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final List<String> DEFAULT_NEW_ICON_URL;
  
  public static final List<TshowInfo> DEFAULT_NEW_TSHOW_ICON;
  
  public static final Integer DEFAULT_NICKNAME_UPDATE_TIME;
  
  public static final Integer DEFAULT_NO_POST_HIGH;
  
  public static final Integer DEFAULT_NO_UN;
  
  public static final Long DEFAULT_PA;
  
  public static final String DEFAULT_PASSWD = "";
  
  public static final Integer DEFAULT_PA_TYPE;
  
  public static final List<String> DEFAULT_PENDANTS;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_PORTRAITH = "";
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final Integer DEFAULT_PRIV_THREAD;
  
  public static final List<TwAnchorProfitItem> DEFAULT_PROFIT_LIST;
  
  public static final String DEFAULT_RANK = "";
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final String DEFAULT_SEAL_PREFIX = "";
  
  public static final Integer DEFAULT_SEX;
  
  public static final Integer DEFAULT_SHOW_FORMER_NAME;
  
  public static final List<UserAttrIcon> DEFAULT_SHOW_ICON_LIST;
  
  public static final Integer DEFAULT_SHOW_PB_PRIVATE_FLAG;
  
  public static final List<TagsInfo> DEFAULT_TAGS;
  
  public static final String DEFAULT_TARGET_SCHEME = "";
  
  public static final String DEFAULT_TB_AGE = "";
  
  public static final Integer DEFAULT_THREAD_NUM;
  
  public static final String DEFAULT_TIEBA_UID = "";
  
  public static final Integer DEFAULT_TOTAL_AGREE_NUM;
  
  public static final Integer DEFAULT_TOTAL_VISITOR_NUM;
  
  public static final Integer DEFAULT_TRUNCATE_LINE;
  
  public static final List<TshowInfo> DEFAULT_TSHOW_ICON;
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_UK = "";
  
  public static final Integer DEFAULT_USERHIDE;
  
  public static final List<ThemeColorInfo> DEFAULT_USER_MARK_LIST;
  
  public static final List<UserPics> DEFAULT_USER_PICS;
  
  public static final Integer DEFAULT_USER_TYPE;
  
  public static final Integer DEFAULT_VISITOR_NUM;
  
  public static final Integer DEFAULT_WORK_NUM;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String BDUSS;
  
  @ProtoField(tag = 71)
  public final ActivitySponsor activity_sponsor;
  
  @ProtoField(tag = 88, type = Message.Datatype.INT32)
  public final Integer agree_num;
  
  @ProtoField(tag = 78)
  public final AlaUserInfo ala_info;
  
  @ProtoField(tag = 85)
  public final AlaLiveInfo ala_live_info;
  
  @ProtoField(tag = 112, type = Message.Datatype.STRING)
  public final String appeal_thread_popover;
  
  @ProtoField(tag = 152, type = Message.Datatype.STRING)
  public final String avatar_url;
  
  @ProtoField(tag = 95)
  public final BaijiahaoInfo baijiahao_info;
  
  @ProtoField(tag = 10)
  public final Balv balv;
  
  @ProtoField(tag = 103)
  public final BawuThrones bawu_thrones;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String bawu_type;
  
  @ProtoField(tag = 105)
  public final BazhuSign bazhu_grade;
  
  @ProtoField(tag = 58, type = Message.Datatype.STRING)
  public final String bg_pic;
  
  @ProtoField(tag = 40, type = Message.Datatype.INT32)
  public final Integer bimg_end_time;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String bimg_url;
  
  @ProtoField(tag = 96)
  public final BirthdayInfo birthday_info;
  
  @ProtoField(tag = 53, type = Message.Datatype.INT32)
  public final Integer bookmark_count;
  
  @ProtoField(tag = 54, type = Message.Datatype.INT32)
  public final Integer bookmark_new_count;
  
  @ProtoField(tag = 159)
  public final BubbleV2 bubble_v2;
  
  @ProtoField(tag = 111)
  public final BusinessAccountInfo business_account_info;
  
  @ProtoField(tag = 104)
  public final CallFansInfo call_fans_info;
  
  @ProtoField(tag = 97, type = Message.Datatype.INT32)
  public final Integer can_modify_avatar;
  
  @ProtoField(tag = 31, type = Message.Datatype.INT32)
  public final Integer concern_num;
  
  @ProtoField(tag = 68)
  public final ConsumeInfo consume_info;
  
  @ProtoField(tag = 108)
  public final CreationData creation_data;
  
  @ProtoField(tag = 165)
  public final CurrentNameInfo current_name_info;
  
  @ProtoField(tag = 169, type = Message.Datatype.INT32)
  public final Integer deregistered;
  
  @ProtoField(tag = 123, type = Message.Datatype.INT32)
  public final Integer display_auth_type;
  
  @ProtoField(tag = 138, type = Message.Datatype.STRING)
  public final String display_intro;
  
  @ProtoField(tag = 140, type = Message.Datatype.STRING)
  public final String dynamic_url;
  
  @ProtoField(tag = 83, type = Message.Datatype.INT32)
  public final Integer each_other_friend;
  
  @ProtoField(tag = 74)
  public final Ecom ecom;
  
  @ProtoField(tag = 126)
  public final EditConfig edit_config;
  
  @ProtoField(tag = 129, type = Message.Datatype.STRING)
  public final String editing_nickname;
  
  @ProtoField(tag = 149, type = Message.Datatype.INT32)
  public final Integer enable_new_homepage;
  
  @ProtoField(tag = 84)
  public final EsportInfo esport_data;
  
  @ProtoField(tag = 57, type = Message.Datatype.STRING)
  public final String fans_nickname;
  
  @ProtoField(tag = 30, type = Message.Datatype.INT32)
  public final Integer fans_num;
  
  @ProtoField(tag = 109, type = Message.Datatype.INT32)
  public final Integer favorite_num;
  
  @ProtoField(tag = 121, type = Message.Datatype.STRING)
  public final String follow_from;
  
  @ProtoField(tag = 164)
  public final FormerNameInfo former_name_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 113)
  public final List<ForumToolPerm> forum_tool_auth;
  
  @ProtoField(tag = 56, type = Message.Datatype.INT64)
  public final Long friend_num;
  
  @ProtoField(tag = 42, type = Message.Datatype.INT32)
  public final Integer gender;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 50)
  public final List<GiftInfo> gift_list;
  
  @ProtoField(tag = 49, type = Message.Datatype.INT32)
  public final Integer gift_num;
  
  @ProtoField(tag = 62)
  public final GodInfo god_data;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 48)
  public final List<MyGroupInfo> groupList;
  
  @ProtoField(tag = 80, type = Message.Datatype.INT32)
  public final Integer has_bottle_enter;
  
  @ProtoField(tag = 35, type = Message.Datatype.INT32)
  public final Integer has_concerned;
  
  @ProtoField(tag = 63, type = Message.Datatype.INT32)
  public final Integer heavy_user;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 17)
  public final List<Icon> iconinfo;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 99, type = Message.Datatype.INT32)
  public final Integer influence;
  
  @ProtoField(tag = 34, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 147, type = Message.Datatype.STRING)
  public final String ios_b_url;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String ios_bimg_format;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String ip;
  
  @ProtoField(tag = 127, type = Message.Datatype.STRING)
  public final String ip_address;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT32)
  public final Integer is_bawu;
  
  @ProtoField(tag = 170, type = Message.Datatype.INT32)
  public final Integer is_claw;
  
  @ProtoField(tag = 20, type = Message.Datatype.INT32)
  public final Integer is_coreuser;
  
  @ProtoField(tag = 106, type = Message.Datatype.INT32)
  public final Integer is_default_avatar;
  
  @ProtoField(tag = 91, type = Message.Datatype.INT32)
  public final Integer is_fans;
  
  @ProtoField(tag = 167, type = Message.Datatype.INT32)
  public final Integer is_forum_bot;
  
  @ProtoField(tag = 46, type = Message.Datatype.INT32)
  public final Integer is_friend;
  
  @ProtoField(tag = 52, type = Message.Datatype.INT32)
  public final Integer is_guanfang;
  
  @ProtoField(tag = 21, type = Message.Datatype.INT32)
  public final Integer is_huinibuke;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer is_interestman;
  
  @ProtoField(tag = 90, type = Message.Datatype.INT32)
  public final Integer is_invited;
  
  @ProtoField(tag = 24, type = Message.Datatype.INT32)
  public final Integer is_like;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_login;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer is_manager;
  
  @ProtoField(tag = 43, type = Message.Datatype.INT32)
  public final Integer is_mask;
  
  @ProtoField(tag = 39, type = Message.Datatype.INT32)
  public final Integer is_mem;
  
  @ProtoField(tag = 160, type = Message.Datatype.INT32)
  public final Integer is_mgc_account;
  
  @ProtoField(tag = 162, type = Message.Datatype.INT32)
  public final Integer is_need_auto_at;
  
  @ProtoField(tag = 128, type = Message.Datatype.INT32)
  public final Integer is_nickname_editing;
  
  @ProtoField(tag = 51, type = Message.Datatype.INT32)
  public final Integer is_select_tail;
  
  @ProtoField(tag = 94, type = Message.Datatype.INT32)
  public final Integer is_show_redpacket;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer is_verify;
  
  @ProtoField(tag = 93, type = Message.Datatype.INT32)
  public final Integer is_videobiggie;
  
  @ProtoField(tag = 89, type = Message.Datatype.INT32)
  public final Integer left_call_num;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer level_id;
  
  @ProtoField(tag = 100, type = Message.Datatype.STRING)
  public final String level_influence;
  
  @ProtoField(tag = 125, type = Message.Datatype.STRING)
  public final String level_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 47)
  public final List<LikeForumInfo> likeForum;
  
  @ProtoField(tag = 157, type = Message.Datatype.STRING)
  public final String like_forum_scheme;
  
  @ProtoField(tag = 110)
  public final LiveRoomInfo live_room_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 156)
  public final List<FeedKV> log_param;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 122)
  public final List<BazhuSign> manager_forum;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer meizhi_level;
  
  @ProtoField(tag = 98, type = Message.Datatype.STRING)
  public final String modify_avatar_desc;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 55)
  public final List<SimpleUser> mute_user;
  
  @ProtoField(tag = 33, type = Message.Datatype.INT32)
  public final Integer my_like_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 101)
  public final NewGodInfo new_god_data;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 139, type = Message.Datatype.STRING)
  public final List<String> new_icon_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 65)
  public final List<TshowInfo> new_tshow_icon;
  
  @ProtoField(tag = 8)
  public final NewUser new_user_info;
  
  @ProtoField(tag = 86, type = Message.Datatype.INT32)
  public final Integer nickname_update_time;
  
  @ProtoField(tag = 73, type = Message.Datatype.UINT32)
  public final Integer no_post_high;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer no_un;
  
  @ProtoField(tag = 60)
  public final NovelFansInfo novel_fans_info;
  
  @ProtoField(tag = 148, type = Message.Datatype.INT64)
  public final Long pa;
  
  @ProtoField(tag = 158, type = Message.Datatype.UINT32)
  public final Integer pa_type;
  
  @ProtoField(tag = 59)
  public final NewParrScores parr_scores;
  
  @ProtoField(tag = 36, type = Message.Datatype.STRING)
  public final String passwd;
  
  @ProtoField(tag = 41)
  public final PayMemberInfo pay_member_info;
  
  @ProtoField(tag = 77)
  public final Pendant pendant;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 146, type = Message.Datatype.STRING)
  public final List<String> pendants;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String portraith;
  
  @ProtoField(tag = 37, type = Message.Datatype.INT32)
  public final Integer post_num;
  
  @ProtoField(tag = 45)
  public final PrivSets priv_sets;
  
  @ProtoField(tag = 92, type = Message.Datatype.INT32)
  public final Integer priv_thread;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 67)
  public final List<TwAnchorProfitItem> profit_list;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String rank;
  
  @ProtoField(tag = 168, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(tag = 79, type = Message.Datatype.STRING)
  public final String seal_prefix;
  
  @ProtoField(tag = 32, type = Message.Datatype.INT32)
  public final Integer sex;
  
  @ProtoField(tag = 145)
  public final ShakeAdSwitch shake_ad_switch;
  
  @ProtoField(tag = 166)
  public final ShoubaiUserExt shoubai_user_ext;
  
  @ProtoField(tag = 163, type = Message.Datatype.INT32)
  public final Integer show_former_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 154)
  public final List<UserAttrIcon> show_icon_list;
  
  @ProtoField(tag = 117, type = Message.Datatype.INT32)
  public final Integer show_pb_private_flag;
  
  @ProtoField(tag = 82)
  public final SpringVirtualUser spring_virtual_user;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 151)
  public final List<TagsInfo> tags;
  
  @ProtoField(tag = 150, type = Message.Datatype.STRING)
  public final String target_scheme;
  
  @ProtoField(tag = 38, type = Message.Datatype.STRING)
  public final String tb_age;
  
  @ProtoField(tag = 72)
  public final TbVipInfo tb_vip;
  
  @ProtoField(tag = 142)
  public final ThemeBackgroundInUser theme_background;
  
  @ProtoField(tag = 69)
  public final ThemeCardInUser theme_card;
  
  @ProtoField(tag = 143)
  public final ThemeMyTab theme_my_tab;
  
  @ProtoField(tag = 141)
  public final ThemeTailInUser theme_tail;
  
  @ProtoField(tag = 87, type = Message.Datatype.INT32)
  public final Integer thread_num;
  
  @ProtoField(tag = 120, type = Message.Datatype.STRING)
  public final String tieba_uid;
  
  @ProtoField(tag = 118, type = Message.Datatype.UINT32)
  public final Integer total_agree_num;
  
  @ProtoField(tag = 76, type = Message.Datatype.INT32)
  public final Integer total_visitor_num;
  
  @ProtoField(tag = 161, type = Message.Datatype.INT32)
  public final Integer truncate_line;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 18)
  public final List<TshowInfo> tshow_icon;
  
  @ProtoField(tag = 66)
  public final TwZhiBoUser tw_anchor_info;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 107, type = Message.Datatype.STRING)
  public final String uk;
  
  @ProtoField(tag = 137)
  public final UserGrowth user_growth;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 153)
  public final List<ThemeColorInfo> user_mark_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 44)
  public final List<UserPics> user_pics;
  
  @ProtoField(tag = 155)
  public final UserShowInfo user_show_info;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT32)
  public final Integer user_type;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer userhide;
  
  @ProtoField(tag = 81)
  public final UserVideoChannelInfo video_channel_info;
  
  @ProtoField(tag = 61)
  public final UserVipInfo vipInfo;
  
  @ProtoField(tag = 70)
  public final VipCloseAd vip_close_ad;
  
  @ProtoField(tag = 64)
  public final VipShowInfo vip_show_info;
  
  @ProtoField(tag = 136)
  public final VirtualImageInfo virtual_image_info;
  
  @ProtoField(tag = 75, type = Message.Datatype.INT32)
  public final Integer visitor_num;
  
  @ProtoField(tag = 124)
  public final WorkCreatorInfo work_creator_info;
  
  @ProtoField(tag = 116, type = Message.Datatype.UINT32)
  public final Integer work_num;
  
  @ProtoField(tag = 119)
  public final CreationData workcreation_data;
  
  @ProtoField(tag = 144)
  public final WorldCupInfo world_cup_info;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LOGIN = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    DEFAULT_NO_UN = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_USERHIDE = integer;
    DEFAULT_IS_MANAGER = integer;
    DEFAULT_MEIZHI_LEVEL = integer;
    DEFAULT_IS_VERIFY = integer;
    DEFAULT_IS_INTERESTMAN = integer;
    DEFAULT_ICONINFO = Collections.emptyList();
    DEFAULT_TSHOW_ICON = Collections.emptyList();
    DEFAULT_USER_TYPE = integer;
    DEFAULT_IS_COREUSER = integer;
    DEFAULT_IS_HUINIBUKE = integer;
    DEFAULT_LEVEL_ID = integer;
    DEFAULT_IS_LIKE = integer;
    DEFAULT_IS_BAWU = integer;
    DEFAULT_FANS_NUM = integer;
    DEFAULT_CONCERN_NUM = integer;
    DEFAULT_SEX = integer;
    DEFAULT_MY_LIKE_NUM = integer;
    DEFAULT_HAS_CONCERNED = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_IS_MEM = integer;
    DEFAULT_BIMG_END_TIME = integer;
    DEFAULT_GENDER = integer;
    DEFAULT_IS_MASK = integer;
    DEFAULT_USER_PICS = Collections.emptyList();
    DEFAULT_IS_FRIEND = integer;
    DEFAULT_LIKEFORUM = Collections.emptyList();
    DEFAULT_GROUPLIST = Collections.emptyList();
    DEFAULT_GIFT_NUM = integer;
    DEFAULT_GIFT_LIST = Collections.emptyList();
    DEFAULT_IS_SELECT_TAIL = integer;
    DEFAULT_IS_GUANFANG = integer;
    DEFAULT_BOOKMARK_COUNT = integer;
    DEFAULT_BOOKMARK_NEW_COUNT = integer;
    DEFAULT_MUTE_USER = Collections.emptyList();
    DEFAULT_FRIEND_NUM = long_;
    DEFAULT_HEAVY_USER = integer;
    DEFAULT_NEW_TSHOW_ICON = Collections.emptyList();
    DEFAULT_PROFIT_LIST = Collections.emptyList();
    DEFAULT_NO_POST_HIGH = integer;
    DEFAULT_VISITOR_NUM = integer;
    DEFAULT_TOTAL_VISITOR_NUM = integer;
    DEFAULT_HAS_BOTTLE_ENTER = integer;
    DEFAULT_EACH_OTHER_FRIEND = integer;
    DEFAULT_NICKNAME_UPDATE_TIME = integer;
    DEFAULT_THREAD_NUM = integer;
    DEFAULT_AGREE_NUM = integer;
    DEFAULT_LEFT_CALL_NUM = integer;
    DEFAULT_IS_INVITED = integer;
    DEFAULT_IS_FANS = integer;
    DEFAULT_PRIV_THREAD = integer;
    DEFAULT_IS_VIDEOBIGGIE = integer;
    DEFAULT_IS_SHOW_REDPACKET = integer;
    DEFAULT_CAN_MODIFY_AVATAR = integer;
    DEFAULT_INFLUENCE = integer;
    DEFAULT_IS_DEFAULT_AVATAR = integer;
    DEFAULT_FAVORITE_NUM = integer;
    DEFAULT_FORUM_TOOL_AUTH = Collections.emptyList();
    DEFAULT_WORK_NUM = integer;
    DEFAULT_SHOW_PB_PRIVATE_FLAG = integer;
    DEFAULT_TOTAL_AGREE_NUM = integer;
    DEFAULT_MANAGER_FORUM = Collections.emptyList();
    DEFAULT_DISPLAY_AUTH_TYPE = integer;
    DEFAULT_IS_NICKNAME_EDITING = integer;
    DEFAULT_NEW_ICON_URL = Collections.emptyList();
    DEFAULT_PENDANTS = Collections.emptyList();
    DEFAULT_PA = long_;
    DEFAULT_ENABLE_NEW_HOMEPAGE = integer;
    DEFAULT_TAGS = Collections.emptyList();
    DEFAULT_USER_MARK_LIST = Collections.emptyList();
    DEFAULT_SHOW_ICON_LIST = Collections.emptyList();
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_PA_TYPE = integer;
    DEFAULT_IS_MGC_ACCOUNT = integer;
    DEFAULT_TRUNCATE_LINE = integer;
    DEFAULT_IS_NEED_AUTO_AT = integer;
    DEFAULT_SHOW_FORMER_NAME = integer;
    DEFAULT_IS_FORUM_BOT = integer;
    DEFAULT_DEREGISTERED = integer;
    DEFAULT_IS_CLAW = integer;
  }
  
  public User(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer24 = paramBuilder.is_login;
      if (integer24 == null) {
        this.is_login = DEFAULT_IS_LOGIN;
      } else {
        this.is_login = integer24;
      } 
      Long long_3 = paramBuilder.id;
      if (long_3 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_3;
      } 
      String str22 = paramBuilder.name;
      if (str22 == null) {
        this.name = "";
      } else {
        this.name = str22;
      } 
      str22 = paramBuilder.name_show;
      if (str22 == null) {
        this.name_show = "";
      } else {
        this.name_show = str22;
      } 
      str22 = paramBuilder.portrait;
      if (str22 == null) {
        this.portrait = "";
      } else {
        this.portrait = str22;
      } 
      Integer integer23 = paramBuilder.no_un;
      if (integer23 == null) {
        this.no_un = DEFAULT_NO_UN;
      } else {
        this.no_un = integer23;
      } 
      integer23 = paramBuilder.type;
      if (integer23 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer23;
      } 
      this.new_user_info = paramBuilder.new_user_info;
      integer23 = paramBuilder.userhide;
      if (integer23 == null) {
        this.userhide = DEFAULT_USERHIDE;
      } else {
        this.userhide = integer23;
      } 
      this.balv = paramBuilder.balv;
      integer23 = paramBuilder.is_manager;
      if (integer23 == null) {
        this.is_manager = DEFAULT_IS_MANAGER;
      } else {
        this.is_manager = integer23;
      } 
      String str21 = paramBuilder.rank;
      if (str21 == null) {
        this.rank = "";
      } else {
        this.rank = str21;
      } 
      str21 = paramBuilder.bimg_url;
      if (str21 == null) {
        this.bimg_url = "";
      } else {
        this.bimg_url = str21;
      } 
      Integer integer22 = paramBuilder.meizhi_level;
      if (integer22 == null) {
        this.meizhi_level = DEFAULT_MEIZHI_LEVEL;
      } else {
        this.meizhi_level = integer22;
      } 
      integer22 = paramBuilder.is_verify;
      if (integer22 == null) {
        this.is_verify = DEFAULT_IS_VERIFY;
      } else {
        this.is_verify = integer22;
      } 
      integer22 = paramBuilder.is_interestman;
      if (integer22 == null) {
        this.is_interestman = DEFAULT_IS_INTERESTMAN;
      } else {
        this.is_interestman = integer22;
      } 
      List<Icon> list16 = paramBuilder.iconinfo;
      if (list16 == null) {
        this.iconinfo = DEFAULT_ICONINFO;
      } else {
        this.iconinfo = Message.immutableCopyOf(list16);
      } 
      List<TshowInfo> list15 = paramBuilder.tshow_icon;
      if (list15 == null) {
        this.tshow_icon = DEFAULT_TSHOW_ICON;
      } else {
        this.tshow_icon = Message.immutableCopyOf(list15);
      } 
      Integer integer21 = paramBuilder.user_type;
      if (integer21 == null) {
        this.user_type = DEFAULT_USER_TYPE;
      } else {
        this.user_type = integer21;
      } 
      integer21 = paramBuilder.is_coreuser;
      if (integer21 == null) {
        this.is_coreuser = DEFAULT_IS_COREUSER;
      } else {
        this.is_coreuser = integer21;
      } 
      integer21 = paramBuilder.is_huinibuke;
      if (integer21 == null) {
        this.is_huinibuke = DEFAULT_IS_HUINIBUKE;
      } else {
        this.is_huinibuke = integer21;
      } 
      String str20 = paramBuilder.ios_bimg_format;
      if (str20 == null) {
        this.ios_bimg_format = "";
      } else {
        this.ios_bimg_format = str20;
      } 
      Integer integer20 = paramBuilder.level_id;
      if (integer20 == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = integer20;
      } 
      integer20 = paramBuilder.is_like;
      if (integer20 == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer20;
      } 
      integer20 = paramBuilder.is_bawu;
      if (integer20 == null) {
        this.is_bawu = DEFAULT_IS_BAWU;
      } else {
        this.is_bawu = integer20;
      } 
      String str19 = paramBuilder.bawu_type;
      if (str19 == null) {
        this.bawu_type = "";
      } else {
        this.bawu_type = str19;
      } 
      str19 = paramBuilder.portraith;
      if (str19 == null) {
        this.portraith = "";
      } else {
        this.portraith = str19;
      } 
      str19 = paramBuilder.ip;
      if (str19 == null) {
        this.ip = "";
      } else {
        this.ip = str19;
      } 
      str19 = paramBuilder.BDUSS;
      if (str19 == null) {
        this.BDUSS = "";
      } else {
        this.BDUSS = str19;
      } 
      Integer integer19 = paramBuilder.fans_num;
      if (integer19 == null) {
        this.fans_num = DEFAULT_FANS_NUM;
      } else {
        this.fans_num = integer19;
      } 
      integer19 = paramBuilder.concern_num;
      if (integer19 == null) {
        this.concern_num = DEFAULT_CONCERN_NUM;
      } else {
        this.concern_num = integer19;
      } 
      integer19 = paramBuilder.sex;
      if (integer19 == null) {
        this.sex = DEFAULT_SEX;
      } else {
        this.sex = integer19;
      } 
      integer19 = paramBuilder.my_like_num;
      if (integer19 == null) {
        this.my_like_num = DEFAULT_MY_LIKE_NUM;
      } else {
        this.my_like_num = integer19;
      } 
      String str18 = paramBuilder.intro;
      if (str18 == null) {
        this.intro = "";
      } else {
        this.intro = str18;
      } 
      Integer integer18 = paramBuilder.has_concerned;
      if (integer18 == null) {
        this.has_concerned = DEFAULT_HAS_CONCERNED;
      } else {
        this.has_concerned = integer18;
      } 
      String str17 = paramBuilder.passwd;
      if (str17 == null) {
        this.passwd = "";
      } else {
        this.passwd = str17;
      } 
      Integer integer17 = paramBuilder.post_num;
      if (integer17 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer17;
      } 
      String str16 = paramBuilder.tb_age;
      if (str16 == null) {
        this.tb_age = "";
      } else {
        this.tb_age = str16;
      } 
      Integer integer16 = paramBuilder.is_mem;
      if (integer16 == null) {
        this.is_mem = DEFAULT_IS_MEM;
      } else {
        this.is_mem = integer16;
      } 
      integer16 = paramBuilder.bimg_end_time;
      if (integer16 == null) {
        this.bimg_end_time = DEFAULT_BIMG_END_TIME;
      } else {
        this.bimg_end_time = integer16;
      } 
      this.pay_member_info = paramBuilder.pay_member_info;
      integer16 = paramBuilder.gender;
      if (integer16 == null) {
        this.gender = DEFAULT_GENDER;
      } else {
        this.gender = integer16;
      } 
      integer16 = paramBuilder.is_mask;
      if (integer16 == null) {
        this.is_mask = DEFAULT_IS_MASK;
      } else {
        this.is_mask = integer16;
      } 
      List<UserPics> list14 = paramBuilder.user_pics;
      if (list14 == null) {
        this.user_pics = DEFAULT_USER_PICS;
      } else {
        this.user_pics = Message.immutableCopyOf(list14);
      } 
      this.priv_sets = paramBuilder.priv_sets;
      Integer integer15 = paramBuilder.is_friend;
      if (integer15 == null) {
        this.is_friend = DEFAULT_IS_FRIEND;
      } else {
        this.is_friend = integer15;
      } 
      List<LikeForumInfo> list13 = paramBuilder.likeForum;
      if (list13 == null) {
        this.likeForum = DEFAULT_LIKEFORUM;
      } else {
        this.likeForum = Message.immutableCopyOf(list13);
      } 
      List<MyGroupInfo> list12 = paramBuilder.groupList;
      if (list12 == null) {
        this.groupList = DEFAULT_GROUPLIST;
      } else {
        this.groupList = Message.immutableCopyOf(list12);
      } 
      Integer integer14 = paramBuilder.gift_num;
      if (integer14 == null) {
        this.gift_num = DEFAULT_GIFT_NUM;
      } else {
        this.gift_num = integer14;
      } 
      List<GiftInfo> list11 = paramBuilder.gift_list;
      if (list11 == null) {
        this.gift_list = DEFAULT_GIFT_LIST;
      } else {
        this.gift_list = Message.immutableCopyOf(list11);
      } 
      Integer integer13 = paramBuilder.is_select_tail;
      if (integer13 == null) {
        this.is_select_tail = DEFAULT_IS_SELECT_TAIL;
      } else {
        this.is_select_tail = integer13;
      } 
      integer13 = paramBuilder.is_guanfang;
      if (integer13 == null) {
        this.is_guanfang = DEFAULT_IS_GUANFANG;
      } else {
        this.is_guanfang = integer13;
      } 
      integer13 = paramBuilder.bookmark_count;
      if (integer13 == null) {
        this.bookmark_count = DEFAULT_BOOKMARK_COUNT;
      } else {
        this.bookmark_count = integer13;
      } 
      integer13 = paramBuilder.bookmark_new_count;
      if (integer13 == null) {
        this.bookmark_new_count = DEFAULT_BOOKMARK_NEW_COUNT;
      } else {
        this.bookmark_new_count = integer13;
      } 
      List<SimpleUser> list10 = paramBuilder.mute_user;
      if (list10 == null) {
        this.mute_user = DEFAULT_MUTE_USER;
      } else {
        this.mute_user = Message.immutableCopyOf(list10);
      } 
      Long long_2 = paramBuilder.friend_num;
      if (long_2 == null) {
        this.friend_num = DEFAULT_FRIEND_NUM;
      } else {
        this.friend_num = long_2;
      } 
      String str15 = paramBuilder.fans_nickname;
      if (str15 == null) {
        this.fans_nickname = "";
      } else {
        this.fans_nickname = str15;
      } 
      str15 = paramBuilder.bg_pic;
      if (str15 == null) {
        this.bg_pic = "";
      } else {
        this.bg_pic = str15;
      } 
      this.parr_scores = paramBuilder.parr_scores;
      this.novel_fans_info = paramBuilder.novel_fans_info;
      this.vipInfo = paramBuilder.vipInfo;
      this.god_data = paramBuilder.god_data;
      Integer integer12 = paramBuilder.heavy_user;
      if (integer12 == null) {
        this.heavy_user = DEFAULT_HEAVY_USER;
      } else {
        this.heavy_user = integer12;
      } 
      this.vip_show_info = paramBuilder.vip_show_info;
      List<TshowInfo> list9 = paramBuilder.new_tshow_icon;
      if (list9 == null) {
        this.new_tshow_icon = DEFAULT_NEW_TSHOW_ICON;
      } else {
        this.new_tshow_icon = Message.immutableCopyOf(list9);
      } 
      this.tw_anchor_info = paramBuilder.tw_anchor_info;
      List<TwAnchorProfitItem> list8 = paramBuilder.profit_list;
      if (list8 == null) {
        this.profit_list = DEFAULT_PROFIT_LIST;
      } else {
        this.profit_list = Message.immutableCopyOf(list8);
      } 
      this.consume_info = paramBuilder.consume_info;
      this.theme_card = paramBuilder.theme_card;
      this.vip_close_ad = paramBuilder.vip_close_ad;
      this.activity_sponsor = paramBuilder.activity_sponsor;
      this.tb_vip = paramBuilder.tb_vip;
      Integer integer11 = paramBuilder.no_post_high;
      if (integer11 == null) {
        this.no_post_high = DEFAULT_NO_POST_HIGH;
      } else {
        this.no_post_high = integer11;
      } 
      this.ecom = paramBuilder.ecom;
      integer11 = paramBuilder.visitor_num;
      if (integer11 == null) {
        this.visitor_num = DEFAULT_VISITOR_NUM;
      } else {
        this.visitor_num = integer11;
      } 
      integer11 = paramBuilder.total_visitor_num;
      if (integer11 == null) {
        this.total_visitor_num = DEFAULT_TOTAL_VISITOR_NUM;
      } else {
        this.total_visitor_num = integer11;
      } 
      this.pendant = paramBuilder.pendant;
      this.ala_info = paramBuilder.ala_info;
      String str14 = paramBuilder.seal_prefix;
      if (str14 == null) {
        this.seal_prefix = "";
      } else {
        this.seal_prefix = str14;
      } 
      Integer integer10 = paramBuilder.has_bottle_enter;
      if (integer10 == null) {
        this.has_bottle_enter = DEFAULT_HAS_BOTTLE_ENTER;
      } else {
        this.has_bottle_enter = integer10;
      } 
      this.video_channel_info = paramBuilder.video_channel_info;
      this.spring_virtual_user = paramBuilder.spring_virtual_user;
      integer10 = paramBuilder.each_other_friend;
      if (integer10 == null) {
        this.each_other_friend = DEFAULT_EACH_OTHER_FRIEND;
      } else {
        this.each_other_friend = integer10;
      } 
      this.esport_data = paramBuilder.esport_data;
      this.ala_live_info = paramBuilder.ala_live_info;
      integer10 = paramBuilder.nickname_update_time;
      if (integer10 == null) {
        this.nickname_update_time = DEFAULT_NICKNAME_UPDATE_TIME;
      } else {
        this.nickname_update_time = integer10;
      } 
      integer10 = paramBuilder.thread_num;
      if (integer10 == null) {
        this.thread_num = DEFAULT_THREAD_NUM;
      } else {
        this.thread_num = integer10;
      } 
      integer10 = paramBuilder.agree_num;
      if (integer10 == null) {
        this.agree_num = DEFAULT_AGREE_NUM;
      } else {
        this.agree_num = integer10;
      } 
      integer10 = paramBuilder.left_call_num;
      if (integer10 == null) {
        this.left_call_num = DEFAULT_LEFT_CALL_NUM;
      } else {
        this.left_call_num = integer10;
      } 
      integer10 = paramBuilder.is_invited;
      if (integer10 == null) {
        this.is_invited = DEFAULT_IS_INVITED;
      } else {
        this.is_invited = integer10;
      } 
      integer10 = paramBuilder.is_fans;
      if (integer10 == null) {
        this.is_fans = DEFAULT_IS_FANS;
      } else {
        this.is_fans = integer10;
      } 
      integer10 = paramBuilder.priv_thread;
      if (integer10 == null) {
        this.priv_thread = DEFAULT_PRIV_THREAD;
      } else {
        this.priv_thread = integer10;
      } 
      integer10 = paramBuilder.is_videobiggie;
      if (integer10 == null) {
        this.is_videobiggie = DEFAULT_IS_VIDEOBIGGIE;
      } else {
        this.is_videobiggie = integer10;
      } 
      integer10 = paramBuilder.is_show_redpacket;
      if (integer10 == null) {
        this.is_show_redpacket = DEFAULT_IS_SHOW_REDPACKET;
      } else {
        this.is_show_redpacket = integer10;
      } 
      this.baijiahao_info = paramBuilder.baijiahao_info;
      this.birthday_info = paramBuilder.birthday_info;
      integer10 = paramBuilder.can_modify_avatar;
      if (integer10 == null) {
        this.can_modify_avatar = DEFAULT_CAN_MODIFY_AVATAR;
      } else {
        this.can_modify_avatar = integer10;
      } 
      String str13 = paramBuilder.modify_avatar_desc;
      if (str13 == null) {
        this.modify_avatar_desc = "";
      } else {
        this.modify_avatar_desc = str13;
      } 
      Integer integer9 = paramBuilder.influence;
      if (integer9 == null) {
        this.influence = DEFAULT_INFLUENCE;
      } else {
        this.influence = integer9;
      } 
      String str12 = paramBuilder.level_influence;
      if (str12 == null) {
        this.level_influence = "";
      } else {
        this.level_influence = str12;
      } 
      this.new_god_data = paramBuilder.new_god_data;
      this.bawu_thrones = paramBuilder.bawu_thrones;
      this.call_fans_info = paramBuilder.call_fans_info;
      this.bazhu_grade = paramBuilder.bazhu_grade;
      Integer integer8 = paramBuilder.is_default_avatar;
      if (integer8 == null) {
        this.is_default_avatar = DEFAULT_IS_DEFAULT_AVATAR;
      } else {
        this.is_default_avatar = integer8;
      } 
      String str11 = paramBuilder.uk;
      if (str11 == null) {
        this.uk = "";
      } else {
        this.uk = str11;
      } 
      this.creation_data = paramBuilder.creation_data;
      Integer integer7 = paramBuilder.favorite_num;
      if (integer7 == null) {
        this.favorite_num = DEFAULT_FAVORITE_NUM;
      } else {
        this.favorite_num = integer7;
      } 
      this.live_room_info = paramBuilder.live_room_info;
      this.business_account_info = paramBuilder.business_account_info;
      String str10 = paramBuilder.appeal_thread_popover;
      if (str10 == null) {
        this.appeal_thread_popover = "";
      } else {
        this.appeal_thread_popover = str10;
      } 
      List<ForumToolPerm> list7 = paramBuilder.forum_tool_auth;
      if (list7 == null) {
        this.forum_tool_auth = DEFAULT_FORUM_TOOL_AUTH;
      } else {
        this.forum_tool_auth = Message.immutableCopyOf(list7);
      } 
      Integer integer6 = paramBuilder.work_num;
      if (integer6 == null) {
        this.work_num = DEFAULT_WORK_NUM;
      } else {
        this.work_num = integer6;
      } 
      integer6 = paramBuilder.show_pb_private_flag;
      if (integer6 == null) {
        this.show_pb_private_flag = DEFAULT_SHOW_PB_PRIVATE_FLAG;
      } else {
        this.show_pb_private_flag = integer6;
      } 
      integer6 = paramBuilder.total_agree_num;
      if (integer6 == null) {
        this.total_agree_num = DEFAULT_TOTAL_AGREE_NUM;
      } else {
        this.total_agree_num = integer6;
      } 
      this.workcreation_data = paramBuilder.workcreation_data;
      String str9 = paramBuilder.tieba_uid;
      if (str9 == null) {
        this.tieba_uid = "";
      } else {
        this.tieba_uid = str9;
      } 
      str9 = paramBuilder.follow_from;
      if (str9 == null) {
        this.follow_from = "";
      } else {
        this.follow_from = str9;
      } 
      List<BazhuSign> list6 = paramBuilder.manager_forum;
      if (list6 == null) {
        this.manager_forum = DEFAULT_MANAGER_FORUM;
      } else {
        this.manager_forum = Message.immutableCopyOf(list6);
      } 
      Integer integer5 = paramBuilder.display_auth_type;
      if (integer5 == null) {
        this.display_auth_type = DEFAULT_DISPLAY_AUTH_TYPE;
      } else {
        this.display_auth_type = integer5;
      } 
      this.work_creator_info = paramBuilder.work_creator_info;
      String str8 = paramBuilder.level_name;
      if (str8 == null) {
        this.level_name = "";
      } else {
        this.level_name = str8;
      } 
      this.edit_config = paramBuilder.edit_config;
      str8 = paramBuilder.ip_address;
      if (str8 == null) {
        this.ip_address = "";
      } else {
        this.ip_address = str8;
      } 
      Integer integer4 = paramBuilder.is_nickname_editing;
      if (integer4 == null) {
        this.is_nickname_editing = DEFAULT_IS_NICKNAME_EDITING;
      } else {
        this.is_nickname_editing = integer4;
      } 
      String str7 = paramBuilder.editing_nickname;
      if (str7 == null) {
        this.editing_nickname = "";
      } else {
        this.editing_nickname = str7;
      } 
      this.virtual_image_info = paramBuilder.virtual_image_info;
      this.user_growth = paramBuilder.user_growth;
      str7 = paramBuilder.display_intro;
      if (str7 == null) {
        this.display_intro = "";
      } else {
        this.display_intro = str7;
      } 
      List<String> list5 = paramBuilder.new_icon_url;
      if (list5 == null) {
        this.new_icon_url = DEFAULT_NEW_ICON_URL;
      } else {
        this.new_icon_url = Message.immutableCopyOf(list5);
      } 
      String str6 = paramBuilder.dynamic_url;
      if (str6 == null) {
        this.dynamic_url = "";
      } else {
        this.dynamic_url = str6;
      } 
      this.theme_tail = paramBuilder.theme_tail;
      this.theme_background = paramBuilder.theme_background;
      this.theme_my_tab = paramBuilder.theme_my_tab;
      this.world_cup_info = paramBuilder.world_cup_info;
      this.shake_ad_switch = paramBuilder.shake_ad_switch;
      List<String> list4 = paramBuilder.pendants;
      if (list4 == null) {
        this.pendants = DEFAULT_PENDANTS;
      } else {
        this.pendants = Message.immutableCopyOf(list4);
      } 
      String str5 = paramBuilder.ios_b_url;
      if (str5 == null) {
        this.ios_b_url = "";
      } else {
        this.ios_b_url = str5;
      } 
      Long long_1 = paramBuilder.pa;
      if (long_1 == null) {
        this.pa = DEFAULT_PA;
      } else {
        this.pa = long_1;
      } 
      Integer integer3 = paramBuilder.enable_new_homepage;
      if (integer3 == null) {
        this.enable_new_homepage = DEFAULT_ENABLE_NEW_HOMEPAGE;
      } else {
        this.enable_new_homepage = integer3;
      } 
      String str4 = paramBuilder.target_scheme;
      if (str4 == null) {
        this.target_scheme = "";
      } else {
        this.target_scheme = str4;
      } 
      List<TagsInfo> list3 = paramBuilder.tags;
      if (list3 == null) {
        this.tags = DEFAULT_TAGS;
      } else {
        this.tags = Message.immutableCopyOf(list3);
      } 
      String str3 = paramBuilder.avatar_url;
      if (str3 == null) {
        this.avatar_url = "";
      } else {
        this.avatar_url = str3;
      } 
      List<ThemeColorInfo> list2 = paramBuilder.user_mark_list;
      if (list2 == null) {
        this.user_mark_list = DEFAULT_USER_MARK_LIST;
      } else {
        this.user_mark_list = Message.immutableCopyOf(list2);
      } 
      List<UserAttrIcon> list1 = paramBuilder.show_icon_list;
      if (list1 == null) {
        this.show_icon_list = DEFAULT_SHOW_ICON_LIST;
      } else {
        this.show_icon_list = Message.immutableCopyOf(list1);
      } 
      this.user_show_info = paramBuilder.user_show_info;
      List<FeedKV> list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
      String str2 = paramBuilder.like_forum_scheme;
      if (str2 == null) {
        this.like_forum_scheme = "";
      } else {
        this.like_forum_scheme = str2;
      } 
      Integer integer2 = paramBuilder.pa_type;
      if (integer2 == null) {
        this.pa_type = DEFAULT_PA_TYPE;
      } else {
        this.pa_type = integer2;
      } 
      this.bubble_v2 = paramBuilder.bubble_v2;
      integer2 = paramBuilder.is_mgc_account;
      if (integer2 == null) {
        this.is_mgc_account = DEFAULT_IS_MGC_ACCOUNT;
      } else {
        this.is_mgc_account = integer2;
      } 
      integer2 = paramBuilder.truncate_line;
      if (integer2 == null) {
        this.truncate_line = DEFAULT_TRUNCATE_LINE;
      } else {
        this.truncate_line = integer2;
      } 
      integer2 = paramBuilder.is_need_auto_at;
      if (integer2 == null) {
        this.is_need_auto_at = DEFAULT_IS_NEED_AUTO_AT;
      } else {
        this.is_need_auto_at = integer2;
      } 
      integer2 = paramBuilder.show_former_name;
      if (integer2 == null) {
        this.show_former_name = DEFAULT_SHOW_FORMER_NAME;
      } else {
        this.show_former_name = integer2;
      } 
      this.former_name_info = paramBuilder.former_name_info;
      this.current_name_info = paramBuilder.current_name_info;
      this.shoubai_user_ext = paramBuilder.shoubai_user_ext;
      integer2 = paramBuilder.is_forum_bot;
      if (integer2 == null) {
        this.is_forum_bot = DEFAULT_IS_FORUM_BOT;
      } else {
        this.is_forum_bot = integer2;
      } 
      String str1 = paramBuilder.scheme;
      if (str1 == null) {
        this.scheme = "";
      } else {
        this.scheme = str1;
      } 
      Integer integer1 = paramBuilder.deregistered;
      if (integer1 == null) {
        this.deregistered = DEFAULT_DEREGISTERED;
      } else {
        this.deregistered = integer1;
      } 
      integer = paramBuilder.is_claw;
      if (integer == null) {
        this.is_claw = DEFAULT_IS_CLAW;
      } else {
        this.is_claw = integer;
      } 
    } else {
      this.is_login = ((Builder)integer).is_login;
      this.id = ((Builder)integer).id;
      this.name = ((Builder)integer).name;
      this.name_show = ((Builder)integer).name_show;
      this.portrait = ((Builder)integer).portrait;
      this.no_un = ((Builder)integer).no_un;
      this.type = ((Builder)integer).type;
      this.new_user_info = ((Builder)integer).new_user_info;
      this.userhide = ((Builder)integer).userhide;
      this.balv = ((Builder)integer).balv;
      this.is_manager = ((Builder)integer).is_manager;
      this.rank = ((Builder)integer).rank;
      this.bimg_url = ((Builder)integer).bimg_url;
      this.meizhi_level = ((Builder)integer).meizhi_level;
      this.is_verify = ((Builder)integer).is_verify;
      this.is_interestman = ((Builder)integer).is_interestman;
      this.iconinfo = Message.immutableCopyOf(((Builder)integer).iconinfo);
      this.tshow_icon = Message.immutableCopyOf(((Builder)integer).tshow_icon);
      this.user_type = ((Builder)integer).user_type;
      this.is_coreuser = ((Builder)integer).is_coreuser;
      this.is_huinibuke = ((Builder)integer).is_huinibuke;
      this.ios_bimg_format = ((Builder)integer).ios_bimg_format;
      this.level_id = ((Builder)integer).level_id;
      this.is_like = ((Builder)integer).is_like;
      this.is_bawu = ((Builder)integer).is_bawu;
      this.bawu_type = ((Builder)integer).bawu_type;
      this.portraith = ((Builder)integer).portraith;
      this.ip = ((Builder)integer).ip;
      this.BDUSS = ((Builder)integer).BDUSS;
      this.fans_num = ((Builder)integer).fans_num;
      this.concern_num = ((Builder)integer).concern_num;
      this.sex = ((Builder)integer).sex;
      this.my_like_num = ((Builder)integer).my_like_num;
      this.intro = ((Builder)integer).intro;
      this.has_concerned = ((Builder)integer).has_concerned;
      this.passwd = ((Builder)integer).passwd;
      this.post_num = ((Builder)integer).post_num;
      this.tb_age = ((Builder)integer).tb_age;
      this.is_mem = ((Builder)integer).is_mem;
      this.bimg_end_time = ((Builder)integer).bimg_end_time;
      this.pay_member_info = ((Builder)integer).pay_member_info;
      this.gender = ((Builder)integer).gender;
      this.is_mask = ((Builder)integer).is_mask;
      this.user_pics = Message.immutableCopyOf(((Builder)integer).user_pics);
      this.priv_sets = ((Builder)integer).priv_sets;
      this.is_friend = ((Builder)integer).is_friend;
      this.likeForum = Message.immutableCopyOf(((Builder)integer).likeForum);
      this.groupList = Message.immutableCopyOf(((Builder)integer).groupList);
      this.gift_num = ((Builder)integer).gift_num;
      this.gift_list = Message.immutableCopyOf(((Builder)integer).gift_list);
      this.is_select_tail = ((Builder)integer).is_select_tail;
      this.is_guanfang = ((Builder)integer).is_guanfang;
      this.bookmark_count = ((Builder)integer).bookmark_count;
      this.bookmark_new_count = ((Builder)integer).bookmark_new_count;
      this.mute_user = Message.immutableCopyOf(((Builder)integer).mute_user);
      this.friend_num = ((Builder)integer).friend_num;
      this.fans_nickname = ((Builder)integer).fans_nickname;
      this.bg_pic = ((Builder)integer).bg_pic;
      this.parr_scores = ((Builder)integer).parr_scores;
      this.novel_fans_info = ((Builder)integer).novel_fans_info;
      this.vipInfo = ((Builder)integer).vipInfo;
      this.god_data = ((Builder)integer).god_data;
      this.heavy_user = ((Builder)integer).heavy_user;
      this.vip_show_info = ((Builder)integer).vip_show_info;
      this.new_tshow_icon = Message.immutableCopyOf(((Builder)integer).new_tshow_icon);
      this.tw_anchor_info = ((Builder)integer).tw_anchor_info;
      this.profit_list = Message.immutableCopyOf(((Builder)integer).profit_list);
      this.consume_info = ((Builder)integer).consume_info;
      this.theme_card = ((Builder)integer).theme_card;
      this.vip_close_ad = ((Builder)integer).vip_close_ad;
      this.activity_sponsor = ((Builder)integer).activity_sponsor;
      this.tb_vip = ((Builder)integer).tb_vip;
      this.no_post_high = ((Builder)integer).no_post_high;
      this.ecom = ((Builder)integer).ecom;
      this.visitor_num = ((Builder)integer).visitor_num;
      this.total_visitor_num = ((Builder)integer).total_visitor_num;
      this.pendant = ((Builder)integer).pendant;
      this.ala_info = ((Builder)integer).ala_info;
      this.seal_prefix = ((Builder)integer).seal_prefix;
      this.has_bottle_enter = ((Builder)integer).has_bottle_enter;
      this.video_channel_info = ((Builder)integer).video_channel_info;
      this.spring_virtual_user = ((Builder)integer).spring_virtual_user;
      this.each_other_friend = ((Builder)integer).each_other_friend;
      this.esport_data = ((Builder)integer).esport_data;
      this.ala_live_info = ((Builder)integer).ala_live_info;
      this.nickname_update_time = ((Builder)integer).nickname_update_time;
      this.thread_num = ((Builder)integer).thread_num;
      this.agree_num = ((Builder)integer).agree_num;
      this.left_call_num = ((Builder)integer).left_call_num;
      this.is_invited = ((Builder)integer).is_invited;
      this.is_fans = ((Builder)integer).is_fans;
      this.priv_thread = ((Builder)integer).priv_thread;
      this.is_videobiggie = ((Builder)integer).is_videobiggie;
      this.is_show_redpacket = ((Builder)integer).is_show_redpacket;
      this.baijiahao_info = ((Builder)integer).baijiahao_info;
      this.birthday_info = ((Builder)integer).birthday_info;
      this.can_modify_avatar = ((Builder)integer).can_modify_avatar;
      this.modify_avatar_desc = ((Builder)integer).modify_avatar_desc;
      this.influence = ((Builder)integer).influence;
      this.level_influence = ((Builder)integer).level_influence;
      this.new_god_data = ((Builder)integer).new_god_data;
      this.bawu_thrones = ((Builder)integer).bawu_thrones;
      this.call_fans_info = ((Builder)integer).call_fans_info;
      this.bazhu_grade = ((Builder)integer).bazhu_grade;
      this.is_default_avatar = ((Builder)integer).is_default_avatar;
      this.uk = ((Builder)integer).uk;
      this.creation_data = ((Builder)integer).creation_data;
      this.favorite_num = ((Builder)integer).favorite_num;
      this.live_room_info = ((Builder)integer).live_room_info;
      this.business_account_info = ((Builder)integer).business_account_info;
      this.appeal_thread_popover = ((Builder)integer).appeal_thread_popover;
      this.forum_tool_auth = Message.immutableCopyOf(((Builder)integer).forum_tool_auth);
      this.work_num = ((Builder)integer).work_num;
      this.show_pb_private_flag = ((Builder)integer).show_pb_private_flag;
      this.total_agree_num = ((Builder)integer).total_agree_num;
      this.workcreation_data = ((Builder)integer).workcreation_data;
      this.tieba_uid = ((Builder)integer).tieba_uid;
      this.follow_from = ((Builder)integer).follow_from;
      this.manager_forum = Message.immutableCopyOf(((Builder)integer).manager_forum);
      this.display_auth_type = ((Builder)integer).display_auth_type;
      this.work_creator_info = ((Builder)integer).work_creator_info;
      this.level_name = ((Builder)integer).level_name;
      this.edit_config = ((Builder)integer).edit_config;
      this.ip_address = ((Builder)integer).ip_address;
      this.is_nickname_editing = ((Builder)integer).is_nickname_editing;
      this.editing_nickname = ((Builder)integer).editing_nickname;
      this.virtual_image_info = ((Builder)integer).virtual_image_info;
      this.user_growth = ((Builder)integer).user_growth;
      this.display_intro = ((Builder)integer).display_intro;
      this.new_icon_url = Message.immutableCopyOf(((Builder)integer).new_icon_url);
      this.dynamic_url = ((Builder)integer).dynamic_url;
      this.theme_tail = ((Builder)integer).theme_tail;
      this.theme_background = ((Builder)integer).theme_background;
      this.theme_my_tab = ((Builder)integer).theme_my_tab;
      this.world_cup_info = ((Builder)integer).world_cup_info;
      this.shake_ad_switch = ((Builder)integer).shake_ad_switch;
      this.pendants = Message.immutableCopyOf(((Builder)integer).pendants);
      this.ios_b_url = ((Builder)integer).ios_b_url;
      this.pa = ((Builder)integer).pa;
      this.enable_new_homepage = ((Builder)integer).enable_new_homepage;
      this.target_scheme = ((Builder)integer).target_scheme;
      this.tags = Message.immutableCopyOf(((Builder)integer).tags);
      this.avatar_url = ((Builder)integer).avatar_url;
      this.user_mark_list = Message.immutableCopyOf(((Builder)integer).user_mark_list);
      this.show_icon_list = Message.immutableCopyOf(((Builder)integer).show_icon_list);
      this.user_show_info = ((Builder)integer).user_show_info;
      this.log_param = Message.immutableCopyOf(((Builder)integer).log_param);
      this.like_forum_scheme = ((Builder)integer).like_forum_scheme;
      this.pa_type = ((Builder)integer).pa_type;
      this.bubble_v2 = ((Builder)integer).bubble_v2;
      this.is_mgc_account = ((Builder)integer).is_mgc_account;
      this.truncate_line = ((Builder)integer).truncate_line;
      this.is_need_auto_at = ((Builder)integer).is_need_auto_at;
      this.show_former_name = ((Builder)integer).show_former_name;
      this.former_name_info = ((Builder)integer).former_name_info;
      this.current_name_info = ((Builder)integer).current_name_info;
      this.shoubai_user_ext = ((Builder)integer).shoubai_user_ext;
      this.is_forum_bot = ((Builder)integer).is_forum_bot;
      this.scheme = ((Builder)integer).scheme;
      this.deregistered = ((Builder)integer).deregistered;
      this.is_claw = ((Builder)integer).is_claw;
    } 
  }
  
  public static final class Builder extends Message.Builder<User> {
    public String BDUSS;
    
    public ActivitySponsor activity_sponsor;
    
    public Integer agree_num;
    
    public AlaUserInfo ala_info;
    
    public AlaLiveInfo ala_live_info;
    
    public String appeal_thread_popover;
    
    public String avatar_url;
    
    public BaijiahaoInfo baijiahao_info;
    
    public Balv balv;
    
    public BawuThrones bawu_thrones;
    
    public String bawu_type;
    
    public BazhuSign bazhu_grade;
    
    public String bg_pic;
    
    public Integer bimg_end_time;
    
    public String bimg_url;
    
    public BirthdayInfo birthday_info;
    
    public Integer bookmark_count;
    
    public Integer bookmark_new_count;
    
    public BubbleV2 bubble_v2;
    
    public BusinessAccountInfo business_account_info;
    
    public CallFansInfo call_fans_info;
    
    public Integer can_modify_avatar;
    
    public Integer concern_num;
    
    public ConsumeInfo consume_info;
    
    public CreationData creation_data;
    
    public CurrentNameInfo current_name_info;
    
    public Integer deregistered;
    
    public Integer display_auth_type;
    
    public String display_intro;
    
    public String dynamic_url;
    
    public Integer each_other_friend;
    
    public Ecom ecom;
    
    public EditConfig edit_config;
    
    public String editing_nickname;
    
    public Integer enable_new_homepage;
    
    public EsportInfo esport_data;
    
    public String fans_nickname;
    
    public Integer fans_num;
    
    public Integer favorite_num;
    
    public String follow_from;
    
    public FormerNameInfo former_name_info;
    
    public List<ForumToolPerm> forum_tool_auth;
    
    public Long friend_num;
    
    public Integer gender;
    
    public List<GiftInfo> gift_list;
    
    public Integer gift_num;
    
    public GodInfo god_data;
    
    public List<MyGroupInfo> groupList;
    
    public Integer has_bottle_enter;
    
    public Integer has_concerned;
    
    public Integer heavy_user;
    
    public List<Icon> iconinfo;
    
    public Long id;
    
    public Integer influence;
    
    public String intro;
    
    public String ios_b_url;
    
    public String ios_bimg_format;
    
    public String ip;
    
    public String ip_address;
    
    public Integer is_bawu;
    
    public Integer is_claw;
    
    public Integer is_coreuser;
    
    public Integer is_default_avatar;
    
    public Integer is_fans;
    
    public Integer is_forum_bot;
    
    public Integer is_friend;
    
    public Integer is_guanfang;
    
    public Integer is_huinibuke;
    
    public Integer is_interestman;
    
    public Integer is_invited;
    
    public Integer is_like;
    
    public Integer is_login;
    
    public Integer is_manager;
    
    public Integer is_mask;
    
    public Integer is_mem;
    
    public Integer is_mgc_account;
    
    public Integer is_need_auto_at;
    
    public Integer is_nickname_editing;
    
    public Integer is_select_tail;
    
    public Integer is_show_redpacket;
    
    public Integer is_verify;
    
    public Integer is_videobiggie;
    
    public Integer left_call_num;
    
    public Integer level_id;
    
    public String level_influence;
    
    public String level_name;
    
    public List<LikeForumInfo> likeForum;
    
    public String like_forum_scheme;
    
    public LiveRoomInfo live_room_info;
    
    public List<FeedKV> log_param;
    
    public List<BazhuSign> manager_forum;
    
    public Integer meizhi_level;
    
    public String modify_avatar_desc;
    
    public List<SimpleUser> mute_user;
    
    public Integer my_like_num;
    
    public String name;
    
    public String name_show;
    
    public NewGodInfo new_god_data;
    
    public List<String> new_icon_url;
    
    public List<TshowInfo> new_tshow_icon;
    
    public NewUser new_user_info;
    
    public Integer nickname_update_time;
    
    public Integer no_post_high;
    
    public Integer no_un;
    
    public NovelFansInfo novel_fans_info;
    
    public Long pa;
    
    public Integer pa_type;
    
    public NewParrScores parr_scores;
    
    public String passwd;
    
    public PayMemberInfo pay_member_info;
    
    public Pendant pendant;
    
    public List<String> pendants;
    
    public String portrait;
    
    public String portraith;
    
    public Integer post_num;
    
    public PrivSets priv_sets;
    
    public Integer priv_thread;
    
    public List<TwAnchorProfitItem> profit_list;
    
    public String rank;
    
    public String scheme;
    
    public String seal_prefix;
    
    public Integer sex;
    
    public ShakeAdSwitch shake_ad_switch;
    
    public ShoubaiUserExt shoubai_user_ext;
    
    public Integer show_former_name;
    
    public List<UserAttrIcon> show_icon_list;
    
    public Integer show_pb_private_flag;
    
    public SpringVirtualUser spring_virtual_user;
    
    public List<TagsInfo> tags;
    
    public String target_scheme;
    
    public String tb_age;
    
    public TbVipInfo tb_vip;
    
    public ThemeBackgroundInUser theme_background;
    
    public ThemeCardInUser theme_card;
    
    public ThemeMyTab theme_my_tab;
    
    public ThemeTailInUser theme_tail;
    
    public Integer thread_num;
    
    public String tieba_uid;
    
    public Integer total_agree_num;
    
    public Integer total_visitor_num;
    
    public Integer truncate_line;
    
    public List<TshowInfo> tshow_icon;
    
    public TwZhiBoUser tw_anchor_info;
    
    public Integer type;
    
    public String uk;
    
    public UserGrowth user_growth;
    
    public List<ThemeColorInfo> user_mark_list;
    
    public List<UserPics> user_pics;
    
    public UserShowInfo user_show_info;
    
    public Integer user_type;
    
    public Integer userhide;
    
    public UserVideoChannelInfo video_channel_info;
    
    public UserVipInfo vipInfo;
    
    public VipCloseAd vip_close_ad;
    
    public VipShowInfo vip_show_info;
    
    public VirtualImageInfo virtual_image_info;
    
    public Integer visitor_num;
    
    public WorkCreatorInfo work_creator_info;
    
    public Integer work_num;
    
    public CreationData workcreation_data;
    
    public WorldCupInfo world_cup_info;
    
    public Builder() {}
    
    public Builder(User param1User) {
      super(param1User);
      if (param1User == null)
        return; 
      this.is_login = param1User.is_login;
      this.id = param1User.id;
      this.name = param1User.name;
      this.name_show = param1User.name_show;
      this.portrait = param1User.portrait;
      this.no_un = param1User.no_un;
      this.type = param1User.type;
      this.new_user_info = param1User.new_user_info;
      this.userhide = param1User.userhide;
      this.balv = param1User.balv;
      this.is_manager = param1User.is_manager;
      this.rank = param1User.rank;
      this.bimg_url = param1User.bimg_url;
      this.meizhi_level = param1User.meizhi_level;
      this.is_verify = param1User.is_verify;
      this.is_interestman = param1User.is_interestman;
      this.iconinfo = Message.copyOf(param1User.iconinfo);
      this.tshow_icon = Message.copyOf(param1User.tshow_icon);
      this.user_type = param1User.user_type;
      this.is_coreuser = param1User.is_coreuser;
      this.is_huinibuke = param1User.is_huinibuke;
      this.ios_bimg_format = param1User.ios_bimg_format;
      this.level_id = param1User.level_id;
      this.is_like = param1User.is_like;
      this.is_bawu = param1User.is_bawu;
      this.bawu_type = param1User.bawu_type;
      this.portraith = param1User.portraith;
      this.ip = param1User.ip;
      this.BDUSS = param1User.BDUSS;
      this.fans_num = param1User.fans_num;
      this.concern_num = param1User.concern_num;
      this.sex = param1User.sex;
      this.my_like_num = param1User.my_like_num;
      this.intro = param1User.intro;
      this.has_concerned = param1User.has_concerned;
      this.passwd = param1User.passwd;
      this.post_num = param1User.post_num;
      this.tb_age = param1User.tb_age;
      this.is_mem = param1User.is_mem;
      this.bimg_end_time = param1User.bimg_end_time;
      this.pay_member_info = param1User.pay_member_info;
      this.gender = param1User.gender;
      this.is_mask = param1User.is_mask;
      this.user_pics = Message.copyOf(param1User.user_pics);
      this.priv_sets = param1User.priv_sets;
      this.is_friend = param1User.is_friend;
      this.likeForum = Message.copyOf(param1User.likeForum);
      this.groupList = Message.copyOf(param1User.groupList);
      this.gift_num = param1User.gift_num;
      this.gift_list = Message.copyOf(param1User.gift_list);
      this.is_select_tail = param1User.is_select_tail;
      this.is_guanfang = param1User.is_guanfang;
      this.bookmark_count = param1User.bookmark_count;
      this.bookmark_new_count = param1User.bookmark_new_count;
      this.mute_user = Message.copyOf(param1User.mute_user);
      this.friend_num = param1User.friend_num;
      this.fans_nickname = param1User.fans_nickname;
      this.bg_pic = param1User.bg_pic;
      this.parr_scores = param1User.parr_scores;
      this.novel_fans_info = param1User.novel_fans_info;
      this.vipInfo = param1User.vipInfo;
      this.god_data = param1User.god_data;
      this.heavy_user = param1User.heavy_user;
      this.vip_show_info = param1User.vip_show_info;
      this.new_tshow_icon = Message.copyOf(param1User.new_tshow_icon);
      this.tw_anchor_info = param1User.tw_anchor_info;
      this.profit_list = Message.copyOf(param1User.profit_list);
      this.consume_info = param1User.consume_info;
      this.theme_card = param1User.theme_card;
      this.vip_close_ad = param1User.vip_close_ad;
      this.activity_sponsor = param1User.activity_sponsor;
      this.tb_vip = param1User.tb_vip;
      this.no_post_high = param1User.no_post_high;
      this.ecom = param1User.ecom;
      this.visitor_num = param1User.visitor_num;
      this.total_visitor_num = param1User.total_visitor_num;
      this.pendant = param1User.pendant;
      this.ala_info = param1User.ala_info;
      this.seal_prefix = param1User.seal_prefix;
      this.has_bottle_enter = param1User.has_bottle_enter;
      this.video_channel_info = param1User.video_channel_info;
      this.spring_virtual_user = param1User.spring_virtual_user;
      this.each_other_friend = param1User.each_other_friend;
      this.esport_data = param1User.esport_data;
      this.ala_live_info = param1User.ala_live_info;
      this.nickname_update_time = param1User.nickname_update_time;
      this.thread_num = param1User.thread_num;
      this.agree_num = param1User.agree_num;
      this.left_call_num = param1User.left_call_num;
      this.is_invited = param1User.is_invited;
      this.is_fans = param1User.is_fans;
      this.priv_thread = param1User.priv_thread;
      this.is_videobiggie = param1User.is_videobiggie;
      this.is_show_redpacket = param1User.is_show_redpacket;
      this.baijiahao_info = param1User.baijiahao_info;
      this.birthday_info = param1User.birthday_info;
      this.can_modify_avatar = param1User.can_modify_avatar;
      this.modify_avatar_desc = param1User.modify_avatar_desc;
      this.influence = param1User.influence;
      this.level_influence = param1User.level_influence;
      this.new_god_data = param1User.new_god_data;
      this.bawu_thrones = param1User.bawu_thrones;
      this.call_fans_info = param1User.call_fans_info;
      this.bazhu_grade = param1User.bazhu_grade;
      this.is_default_avatar = param1User.is_default_avatar;
      this.uk = param1User.uk;
      this.creation_data = param1User.creation_data;
      this.favorite_num = param1User.favorite_num;
      this.live_room_info = param1User.live_room_info;
      this.business_account_info = param1User.business_account_info;
      this.appeal_thread_popover = param1User.appeal_thread_popover;
      this.forum_tool_auth = Message.copyOf(param1User.forum_tool_auth);
      this.work_num = param1User.work_num;
      this.show_pb_private_flag = param1User.show_pb_private_flag;
      this.total_agree_num = param1User.total_agree_num;
      this.workcreation_data = param1User.workcreation_data;
      this.tieba_uid = param1User.tieba_uid;
      this.follow_from = param1User.follow_from;
      this.manager_forum = Message.copyOf(param1User.manager_forum);
      this.display_auth_type = param1User.display_auth_type;
      this.work_creator_info = param1User.work_creator_info;
      this.level_name = param1User.level_name;
      this.edit_config = param1User.edit_config;
      this.ip_address = param1User.ip_address;
      this.is_nickname_editing = param1User.is_nickname_editing;
      this.editing_nickname = param1User.editing_nickname;
      this.virtual_image_info = param1User.virtual_image_info;
      this.user_growth = param1User.user_growth;
      this.display_intro = param1User.display_intro;
      this.new_icon_url = Message.copyOf(param1User.new_icon_url);
      this.dynamic_url = param1User.dynamic_url;
      this.theme_tail = param1User.theme_tail;
      this.theme_background = param1User.theme_background;
      this.theme_my_tab = param1User.theme_my_tab;
      this.world_cup_info = param1User.world_cup_info;
      this.shake_ad_switch = param1User.shake_ad_switch;
      this.pendants = Message.copyOf(param1User.pendants);
      this.ios_b_url = param1User.ios_b_url;
      this.pa = param1User.pa;
      this.enable_new_homepage = param1User.enable_new_homepage;
      this.target_scheme = param1User.target_scheme;
      this.tags = Message.copyOf(param1User.tags);
      this.avatar_url = param1User.avatar_url;
      this.user_mark_list = Message.copyOf(param1User.user_mark_list);
      this.show_icon_list = Message.copyOf(param1User.show_icon_list);
      this.user_show_info = param1User.user_show_info;
      this.log_param = Message.copyOf(param1User.log_param);
      this.like_forum_scheme = param1User.like_forum_scheme;
      this.pa_type = param1User.pa_type;
      this.bubble_v2 = param1User.bubble_v2;
      this.is_mgc_account = param1User.is_mgc_account;
      this.truncate_line = param1User.truncate_line;
      this.is_need_auto_at = param1User.is_need_auto_at;
      this.show_former_name = param1User.show_former_name;
      this.former_name_info = param1User.former_name_info;
      this.current_name_info = param1User.current_name_info;
      this.shoubai_user_ext = param1User.shoubai_user_ext;
      this.is_forum_bot = param1User.is_forum_bot;
      this.scheme = param1User.scheme;
      this.deregistered = param1User.deregistered;
      this.is_claw = param1User.is_claw;
    }
    
    public User build(boolean param1Boolean) {
      return new User(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
