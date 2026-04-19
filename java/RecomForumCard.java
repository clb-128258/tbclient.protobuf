package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RecomForumCard extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final Integer DEFAULT_CARD_OFFSET;
  
  public static final List<RecommendForumInfo> DEFAULT_FORUM_LIST = Collections.emptyList();
  
  public static final Boolean DEFAULT_IS_HIT_NEW_STYLE;
  
  public static final Integer DEFAULT_SCREEN_MAX_NUM;
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 3)
  public final ThemeColorInfo avatar;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 9)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer card_offset;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<RecommendForumInfo> forum_list;
  
  @ProtoField(tag = 5)
  public final PubCardFreq freq;
  
  @ProtoField(tag = 8, type = Message.Datatype.BOOL)
  public final Boolean is_hit_new_style;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer screen_max_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    DEFAULT_SCREEN_MAX_NUM = integer;
    DEFAULT_IS_HIT_NEW_STYLE = Boolean.FALSE;
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
  }
  
  public RecomForumCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      this.avatar = paramBuilder.avatar;
      Integer integer2 = paramBuilder.card_offset;
      if (integer2 == null) {
        this.card_offset = DEFAULT_CARD_OFFSET;
      } else {
        this.card_offset = integer2;
      } 
      this.freq = paramBuilder.freq;
      List<RecommendForumInfo> list1 = paramBuilder.forum_list;
      if (list1 == null) {
        this.forum_list = DEFAULT_FORUM_LIST;
      } else {
        this.forum_list = Message.immutableCopyOf(list1);
      } 
      Integer integer1 = paramBuilder.screen_max_num;
      if (integer1 == null) {
        this.screen_max_num = DEFAULT_SCREEN_MAX_NUM;
      } else {
        this.screen_max_num = integer1;
      } 
      Boolean bool = paramBuilder.is_hit_new_style;
      if (bool == null) {
        this.is_hit_new_style = DEFAULT_IS_HIT_NEW_STYLE;
      } else {
        this.is_hit_new_style = bool;
      } 
      list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = ((Builder)list).title;
      this.avatar = ((Builder)list).avatar;
      this.card_offset = ((Builder)list).card_offset;
      this.freq = ((Builder)list).freq;
      this.forum_list = Message.immutableCopyOf(((Builder)list).forum_list);
      this.screen_max_num = ((Builder)list).screen_max_num;
      this.is_hit_new_style = ((Builder)list).is_hit_new_style;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
    } 
  }
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_CARD_OFFSET = integer;
  }
  
  public static final class Builder extends Message.Builder<RecomForumCard> {
    public ThemeColorInfo avatar;
    
    public List<FeedKV> business_info;
    
    public Integer card_offset;
    
    public List<RecommendForumInfo> forum_list;
    
    public PubCardFreq freq;
    
    public Boolean is_hit_new_style;
    
    public Integer screen_max_num;
    
    public String title;
    
    public Builder() {}
    
    public Builder(RecomForumCard param1RecomForumCard) {
      super(param1RecomForumCard);
      if (param1RecomForumCard == null)
        return; 
      this.title = param1RecomForumCard.title;
      this.avatar = param1RecomForumCard.avatar;
      this.card_offset = param1RecomForumCard.card_offset;
      this.freq = param1RecomForumCard.freq;
      this.forum_list = Message.copyOf(param1RecomForumCard.forum_list);
      this.screen_max_num = param1RecomForumCard.screen_max_num;
      this.is_hit_new_style = param1RecomForumCard.is_hit_new_style;
      this.business_info = Message.copyOf(param1RecomForumCard.business_info);
    }
    
    public RecomForumCard build(boolean param1Boolean) {
      return new RecomForumCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
