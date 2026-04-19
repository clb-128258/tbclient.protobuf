package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PbContent extends Message {
  public static final String DEFAULT_BIG_CDN_SRC = "";
  
  public static final String DEFAULT_BIG_SIZE = "";
  
  public static final String DEFAULT_BIG_SRC = "";
  
  public static final String DEFAULT_BSIZE = "";
  
  public static final Integer DEFAULT_BTN_TYPE;
  
  public static final String DEFAULT_C = "";
  
  public static final String DEFAULT_CDN_SRC = "";
  
  public static final String DEFAULT_CDN_SRC_ACTIVE = "";
  
  public static final Integer DEFAULT_COUNT;
  
  public static final Integer DEFAULT_DURING_TIME;
  
  public static final String DEFAULT_DYNAMIC = "";
  
  public static final Integer DEFAULT_E_TYPE;
  
  public static final Integer DEFAULT_HEIGHT;
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_IMGTYPE = "";
  
  public static final Integer DEFAULT_IS_BOT;
  
  public static final Integer DEFAULT_IS_LONG_PIC;
  
  public static final Integer DEFAULT_IS_NATIVE_APP;
  
  public static final Integer DEFAULT_IS_SUB;
  
  public static final String DEFAULT_ITEM_FORUM_NAME = "";
  
  public static final Long DEFAULT_ITEM_ID;
  
  public static final String DEFAULT_LINK = "";
  
  public static final Integer DEFAULT_LINK_TYPE;
  
  public static final String DEFAULT_MEDIA_SUBTITLE = "";
  
  public static final Integer DEFAULT_ORIGIN_SIZE;
  
  public static final String DEFAULT_ORIGIN_SRC = "";
  
  public static final String DEFAULT_PACKET_NAME = "";
  
  public static final String DEFAULT_PHONETYPE = "";
  
  public static final Long DEFAULT_PIC_ID;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_QUERY_PREFIX = "";
  
  public static final String DEFAULT_QUERY_TEXT = "";
  
  public static final Integer DEFAULT_SEARCH_TYPE;
  
  public static final Integer DEFAULT_SHOW_ORIGINAL_BTN;
  
  public static final String DEFAULT_SRC = "";
  
  public static final String DEFAULT_STATIC = "";
  
  public static final String DEFAULT_TARGET_SCHEME = "";
  
  public static final String DEFAULT_TEXT = "";
  
  public static final String DEFAULT_TOPIC_SPECIAL_ICON = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final Long DEFAULT_UID;
  
  public static final Integer DEFAULT_URL_TYPE;
  
  public static final String DEFAULT_VOICE_MD5 = "";
  
  public static final Integer DEFAULT_WIDTH;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String _static;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String big_cdn_src;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String big_size;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String big_src;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String bsize;
  
  @ProtoField(tag = 26, type = Message.Datatype.UINT32)
  public final Integer btn_type;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String c;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String cdn_src;
  
  @ProtoField(tag = 36, type = Message.Datatype.STRING)
  public final String cdn_src_active;
  
  @ProtoField(tag = 28, type = Message.Datatype.INT32)
  public final Integer count;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer during_time;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String dynamic;
  
  @ProtoField(tag = 24, type = Message.Datatype.UINT32)
  public final Integer e_type;
  
  @ProtoField(tag = 29)
  public final GraffitiInfo graffiti_info;
  
  @ProtoField(tag = 19, type = Message.Datatype.UINT32)
  public final Integer height;
  
  @ProtoField(tag = 30)
  public final TogetherHi high_together;
  
  @ProtoField(tag = 48, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String imgtype;
  
  @ProtoField(tag = 52, type = Message.Datatype.INT32)
  public final Integer is_bot;
  
  @ProtoField(tag = 34, type = Message.Datatype.UINT32)
  public final Integer is_long_pic;
  
  @ProtoField(tag = 22, type = Message.Datatype.UINT32)
  public final Integer is_native_app;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT32)
  public final Integer is_sub;
  
  @ProtoField(tag = 41)
  public final Item item;
  
  @ProtoField(tag = 39, type = Message.Datatype.STRING)
  public final String item_forum_name;
  
  @ProtoField(tag = 38, type = Message.Datatype.UINT64)
  public final Long item_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 43, type = Message.Datatype.INT32)
  public final Integer link_type;
  
  @ProtoField(tag = 31, type = Message.Datatype.STRING)
  public final String media_subtitle;
  
  @ProtoField(tag = 33)
  public final MemeInfo meme_info;
  
  @ProtoField(tag = 23)
  public final NativeApp native_app;
  
  @ProtoField(tag = 27, type = Message.Datatype.UINT32)
  public final Integer origin_size;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String origin_src;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String packet_name;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String phonetype;
  
  @ProtoField(tag = 42, type = Message.Datatype.INT64)
  public final Long pic_id;
  
  @ProtoField(tag = 49, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 47, type = Message.Datatype.STRING)
  public final String query_prefix;
  
  @ProtoField(tag = 46, type = Message.Datatype.STRING)
  public final String query_text;
  
  @ProtoField(tag = 51, type = Message.Datatype.INT32)
  public final Integer search_type;
  
  @ProtoField(tag = 35, type = Message.Datatype.UINT32)
  public final Integer show_original_btn;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String src;
  
  @ProtoField(tag = 44, type = Message.Datatype.STRING)
  public final String target_scheme;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 45)
  public final TextPlugin text_plugin;
  
  @ProtoField(tag = 50)
  public final ThemeColorInfo theme_color;
  
  @ProtoField(tag = 40)
  public final TiebaPlusInfo tiebaplus_info;
  
  @ProtoField(tag = 37, type = Message.Datatype.STRING)
  public final String topic_special_icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT64)
  public final Long uid;
  
  @ProtoField(tag = 32, type = Message.Datatype.INT32)
  public final Integer url_type;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String voice_md5;
  
  @ProtoField(tag = 18, type = Message.Datatype.UINT32)
  public final Integer width;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_DURING_TIME = integer;
    DEFAULT_IS_SUB = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_UID = long_;
    DEFAULT_WIDTH = integer;
    DEFAULT_HEIGHT = integer;
    DEFAULT_IS_NATIVE_APP = integer;
    DEFAULT_E_TYPE = integer;
    DEFAULT_BTN_TYPE = integer;
    DEFAULT_ORIGIN_SIZE = integer;
    DEFAULT_COUNT = integer;
    DEFAULT_URL_TYPE = integer;
    DEFAULT_IS_LONG_PIC = integer;
    DEFAULT_SHOW_ORIGINAL_BTN = integer;
    DEFAULT_ITEM_ID = long_;
    DEFAULT_PIC_ID = long_;
    DEFAULT_LINK_TYPE = integer;
    DEFAULT_SEARCH_TYPE = integer;
    DEFAULT_IS_BOT = integer;
  }
  
  public PbContent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer8 = paramBuilder.type;
      if (integer8 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer8;
      } 
      String str8 = paramBuilder.text;
      if (str8 == null) {
        this.text = "";
      } else {
        this.text = str8;
      } 
      str8 = paramBuilder.link;
      if (str8 == null) {
        this.link = "";
      } else {
        this.link = str8;
      } 
      str8 = paramBuilder.src;
      if (str8 == null) {
        this.src = "";
      } else {
        this.src = str8;
      } 
      str8 = paramBuilder.bsize;
      if (str8 == null) {
        this.bsize = "";
      } else {
        this.bsize = str8;
      } 
      str8 = paramBuilder.big_src;
      if (str8 == null) {
        this.big_src = "";
      } else {
        this.big_src = str8;
      } 
      str8 = paramBuilder.big_size;
      if (str8 == null) {
        this.big_size = "";
      } else {
        this.big_size = str8;
      } 
      str8 = paramBuilder.cdn_src;
      if (str8 == null) {
        this.cdn_src = "";
      } else {
        this.cdn_src = str8;
      } 
      str8 = paramBuilder.big_cdn_src;
      if (str8 == null) {
        this.big_cdn_src = "";
      } else {
        this.big_cdn_src = str8;
      } 
      str8 = paramBuilder.imgtype;
      if (str8 == null) {
        this.imgtype = "";
      } else {
        this.imgtype = str8;
      } 
      str8 = paramBuilder.c;
      if (str8 == null) {
        this.c = "";
      } else {
        this.c = str8;
      } 
      str8 = paramBuilder.voice_md5;
      if (str8 == null) {
        this.voice_md5 = "";
      } else {
        this.voice_md5 = str8;
      } 
      Integer integer7 = paramBuilder.during_time;
      if (integer7 == null) {
        this.during_time = DEFAULT_DURING_TIME;
      } else {
        this.during_time = integer7;
      } 
      integer7 = paramBuilder.is_sub;
      if (integer7 == null) {
        this.is_sub = DEFAULT_IS_SUB;
      } else {
        this.is_sub = integer7;
      } 
      Long long_3 = paramBuilder.uid;
      if (long_3 == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_3;
      } 
      String str7 = paramBuilder.dynamic;
      if (str7 == null) {
        this.dynamic = "";
      } else {
        this.dynamic = str7;
      } 
      str7 = paramBuilder._static;
      if (str7 == null) {
        this._static = "";
      } else {
        this._static = str7;
      } 
      Integer integer6 = paramBuilder.width;
      if (integer6 == null) {
        this.width = DEFAULT_WIDTH;
      } else {
        this.width = integer6;
      } 
      integer6 = paramBuilder.height;
      if (integer6 == null) {
        this.height = DEFAULT_HEIGHT;
      } else {
        this.height = integer6;
      } 
      String str6 = paramBuilder.packet_name;
      if (str6 == null) {
        this.packet_name = "";
      } else {
        this.packet_name = str6;
      } 
      str6 = paramBuilder.phonetype;
      if (str6 == null) {
        this.phonetype = "";
      } else {
        this.phonetype = str6;
      } 
      Integer integer5 = paramBuilder.is_native_app;
      if (integer5 == null) {
        this.is_native_app = DEFAULT_IS_NATIVE_APP;
      } else {
        this.is_native_app = integer5;
      } 
      this.native_app = paramBuilder.native_app;
      integer5 = paramBuilder.e_type;
      if (integer5 == null) {
        this.e_type = DEFAULT_E_TYPE;
      } else {
        this.e_type = integer5;
      } 
      String str5 = paramBuilder.origin_src;
      if (str5 == null) {
        this.origin_src = "";
      } else {
        this.origin_src = str5;
      } 
      Integer integer4 = paramBuilder.btn_type;
      if (integer4 == null) {
        this.btn_type = DEFAULT_BTN_TYPE;
      } else {
        this.btn_type = integer4;
      } 
      integer4 = paramBuilder.origin_size;
      if (integer4 == null) {
        this.origin_size = DEFAULT_ORIGIN_SIZE;
      } else {
        this.origin_size = integer4;
      } 
      integer4 = paramBuilder.count;
      if (integer4 == null) {
        this.count = DEFAULT_COUNT;
      } else {
        this.count = integer4;
      } 
      this.graffiti_info = paramBuilder.graffiti_info;
      this.high_together = paramBuilder.high_together;
      String str4 = paramBuilder.media_subtitle;
      if (str4 == null) {
        this.media_subtitle = "";
      } else {
        this.media_subtitle = str4;
      } 
      Integer integer3 = paramBuilder.url_type;
      if (integer3 == null) {
        this.url_type = DEFAULT_URL_TYPE;
      } else {
        this.url_type = integer3;
      } 
      this.meme_info = paramBuilder.meme_info;
      integer3 = paramBuilder.is_long_pic;
      if (integer3 == null) {
        this.is_long_pic = DEFAULT_IS_LONG_PIC;
      } else {
        this.is_long_pic = integer3;
      } 
      integer3 = paramBuilder.show_original_btn;
      if (integer3 == null) {
        this.show_original_btn = DEFAULT_SHOW_ORIGINAL_BTN;
      } else {
        this.show_original_btn = integer3;
      } 
      String str3 = paramBuilder.cdn_src_active;
      if (str3 == null) {
        this.cdn_src_active = "";
      } else {
        this.cdn_src_active = str3;
      } 
      str3 = paramBuilder.topic_special_icon;
      if (str3 == null) {
        this.topic_special_icon = "";
      } else {
        this.topic_special_icon = str3;
      } 
      Long long_2 = paramBuilder.item_id;
      if (long_2 == null) {
        this.item_id = DEFAULT_ITEM_ID;
      } else {
        this.item_id = long_2;
      } 
      String str2 = paramBuilder.item_forum_name;
      if (str2 == null) {
        this.item_forum_name = "";
      } else {
        this.item_forum_name = str2;
      } 
      this.tiebaplus_info = paramBuilder.tiebaplus_info;
      this.item = paramBuilder.item;
      Long long_1 = paramBuilder.pic_id;
      if (long_1 == null) {
        this.pic_id = DEFAULT_PIC_ID;
      } else {
        this.pic_id = long_1;
      } 
      Integer integer2 = paramBuilder.link_type;
      if (integer2 == null) {
        this.link_type = DEFAULT_LINK_TYPE;
      } else {
        this.link_type = integer2;
      } 
      String str1 = paramBuilder.target_scheme;
      if (str1 == null) {
        this.target_scheme = "";
      } else {
        this.target_scheme = str1;
      } 
      this.text_plugin = paramBuilder.text_plugin;
      str1 = paramBuilder.query_text;
      if (str1 == null) {
        this.query_text = "";
      } else {
        this.query_text = str1;
      } 
      str1 = paramBuilder.query_prefix;
      if (str1 == null) {
        this.query_prefix = "";
      } else {
        this.query_prefix = str1;
      } 
      str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str1 = paramBuilder.portrait;
      if (str1 == null) {
        this.portrait = "";
      } else {
        this.portrait = str1;
      } 
      this.theme_color = paramBuilder.theme_color;
      Integer integer1 = paramBuilder.search_type;
      if (integer1 == null) {
        this.search_type = DEFAULT_SEARCH_TYPE;
      } else {
        this.search_type = integer1;
      } 
      integer = paramBuilder.is_bot;
      if (integer == null) {
        this.is_bot = DEFAULT_IS_BOT;
      } else {
        this.is_bot = integer;
      } 
    } else {
      this.type = ((Builder)integer).type;
      this.text = ((Builder)integer).text;
      this.link = ((Builder)integer).link;
      this.src = ((Builder)integer).src;
      this.bsize = ((Builder)integer).bsize;
      this.big_src = ((Builder)integer).big_src;
      this.big_size = ((Builder)integer).big_size;
      this.cdn_src = ((Builder)integer).cdn_src;
      this.big_cdn_src = ((Builder)integer).big_cdn_src;
      this.imgtype = ((Builder)integer).imgtype;
      this.c = ((Builder)integer).c;
      this.voice_md5 = ((Builder)integer).voice_md5;
      this.during_time = ((Builder)integer).during_time;
      this.is_sub = ((Builder)integer).is_sub;
      this.uid = ((Builder)integer).uid;
      this.dynamic = ((Builder)integer).dynamic;
      this._static = ((Builder)integer)._static;
      this.width = ((Builder)integer).width;
      this.height = ((Builder)integer).height;
      this.packet_name = ((Builder)integer).packet_name;
      this.phonetype = ((Builder)integer).phonetype;
      this.is_native_app = ((Builder)integer).is_native_app;
      this.native_app = ((Builder)integer).native_app;
      this.e_type = ((Builder)integer).e_type;
      this.origin_src = ((Builder)integer).origin_src;
      this.btn_type = ((Builder)integer).btn_type;
      this.origin_size = ((Builder)integer).origin_size;
      this.count = ((Builder)integer).count;
      this.graffiti_info = ((Builder)integer).graffiti_info;
      this.high_together = ((Builder)integer).high_together;
      this.media_subtitle = ((Builder)integer).media_subtitle;
      this.url_type = ((Builder)integer).url_type;
      this.meme_info = ((Builder)integer).meme_info;
      this.is_long_pic = ((Builder)integer).is_long_pic;
      this.show_original_btn = ((Builder)integer).show_original_btn;
      this.cdn_src_active = ((Builder)integer).cdn_src_active;
      this.topic_special_icon = ((Builder)integer).topic_special_icon;
      this.item_id = ((Builder)integer).item_id;
      this.item_forum_name = ((Builder)integer).item_forum_name;
      this.tiebaplus_info = ((Builder)integer).tiebaplus_info;
      this.item = ((Builder)integer).item;
      this.pic_id = ((Builder)integer).pic_id;
      this.link_type = ((Builder)integer).link_type;
      this.target_scheme = ((Builder)integer).target_scheme;
      this.text_plugin = ((Builder)integer).text_plugin;
      this.query_text = ((Builder)integer).query_text;
      this.query_prefix = ((Builder)integer).query_prefix;
      this.icon = ((Builder)integer).icon;
      this.portrait = ((Builder)integer).portrait;
      this.theme_color = ((Builder)integer).theme_color;
      this.search_type = ((Builder)integer).search_type;
      this.is_bot = ((Builder)integer).is_bot;
    } 
  }
  
  public static final class Builder extends Message.Builder<PbContent> {
    public String _static;
    
    public String big_cdn_src;
    
    public String big_size;
    
    public String big_src;
    
    public String bsize;
    
    public Integer btn_type;
    
    public String c;
    
    public String cdn_src;
    
    public String cdn_src_active;
    
    public Integer count;
    
    public Integer during_time;
    
    public String dynamic;
    
    public Integer e_type;
    
    public GraffitiInfo graffiti_info;
    
    public Integer height;
    
    public TogetherHi high_together;
    
    public String icon;
    
    public String imgtype;
    
    public Integer is_bot;
    
    public Integer is_long_pic;
    
    public Integer is_native_app;
    
    public Integer is_sub;
    
    public Item item;
    
    public String item_forum_name;
    
    public Long item_id;
    
    public String link;
    
    public Integer link_type;
    
    public String media_subtitle;
    
    public MemeInfo meme_info;
    
    public NativeApp native_app;
    
    public Integer origin_size;
    
    public String origin_src;
    
    public String packet_name;
    
    public String phonetype;
    
    public Long pic_id;
    
    public String portrait;
    
    public String query_prefix;
    
    public String query_text;
    
    public Integer search_type;
    
    public Integer show_original_btn;
    
    public String src;
    
    public String target_scheme;
    
    public String text;
    
    public TextPlugin text_plugin;
    
    public ThemeColorInfo theme_color;
    
    public TiebaPlusInfo tiebaplus_info;
    
    public String topic_special_icon;
    
    public Integer type;
    
    public Long uid;
    
    public Integer url_type;
    
    public String voice_md5;
    
    public Integer width;
    
    public Builder() {}
    
    public Builder(PbContent param1PbContent) {
      super(param1PbContent);
      if (param1PbContent == null)
        return; 
      this.type = param1PbContent.type;
      this.text = param1PbContent.text;
      this.link = param1PbContent.link;
      this.src = param1PbContent.src;
      this.bsize = param1PbContent.bsize;
      this.big_src = param1PbContent.big_src;
      this.big_size = param1PbContent.big_size;
      this.cdn_src = param1PbContent.cdn_src;
      this.big_cdn_src = param1PbContent.big_cdn_src;
      this.imgtype = param1PbContent.imgtype;
      this.c = param1PbContent.c;
      this.voice_md5 = param1PbContent.voice_md5;
      this.during_time = param1PbContent.during_time;
      this.is_sub = param1PbContent.is_sub;
      this.uid = param1PbContent.uid;
      this.dynamic = param1PbContent.dynamic;
      this._static = param1PbContent._static;
      this.width = param1PbContent.width;
      this.height = param1PbContent.height;
      this.packet_name = param1PbContent.packet_name;
      this.phonetype = param1PbContent.phonetype;
      this.is_native_app = param1PbContent.is_native_app;
      this.native_app = param1PbContent.native_app;
      this.e_type = param1PbContent.e_type;
      this.origin_src = param1PbContent.origin_src;
      this.btn_type = param1PbContent.btn_type;
      this.origin_size = param1PbContent.origin_size;
      this.count = param1PbContent.count;
      this.graffiti_info = param1PbContent.graffiti_info;
      this.high_together = param1PbContent.high_together;
      this.media_subtitle = param1PbContent.media_subtitle;
      this.url_type = param1PbContent.url_type;
      this.meme_info = param1PbContent.meme_info;
      this.is_long_pic = param1PbContent.is_long_pic;
      this.show_original_btn = param1PbContent.show_original_btn;
      this.cdn_src_active = param1PbContent.cdn_src_active;
      this.topic_special_icon = param1PbContent.topic_special_icon;
      this.item_id = param1PbContent.item_id;
      this.item_forum_name = param1PbContent.item_forum_name;
      this.tiebaplus_info = param1PbContent.tiebaplus_info;
      this.item = param1PbContent.item;
      this.pic_id = param1PbContent.pic_id;
      this.link_type = param1PbContent.link_type;
      this.target_scheme = param1PbContent.target_scheme;
      this.text_plugin = param1PbContent.text_plugin;
      this.query_text = param1PbContent.query_text;
      this.query_prefix = param1PbContent.query_prefix;
      this.icon = param1PbContent.icon;
      this.portrait = param1PbContent.portrait;
      this.theme_color = param1PbContent.theme_color;
      this.search_type = param1PbContent.search_type;
      this.is_bot = param1PbContent.is_bot;
    }
    
    public PbContent build(boolean param1Boolean) {
      return new PbContent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
