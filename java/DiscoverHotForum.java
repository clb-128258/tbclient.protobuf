package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DiscoverHotForum extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final Integer DEFAULT_FLOOR;
  
  public static final Boolean DEFAULT_IS_HIT_NEW_STYLE;
  
  public static final Integer DEFAULT_SCREEN_MAX_NUM;
  
  public static final String DEFAULT_SHOW_FREQUENCY = "";
  
  public static final List<DiscoverTabCard> DEFAULT_TAB_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer floor;
  
  @ProtoField(tag = 5, type = Message.Datatype.BOOL)
  public final Boolean is_hit_new_style;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer screen_max_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String show_frequency;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<DiscoverTabCard> tab_list;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_FLOOR = integer;
    DEFAULT_SCREEN_MAX_NUM = integer;
    DEFAULT_IS_HIT_NEW_STYLE = Boolean.FALSE;
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
  }
  
  public DiscoverHotForum(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      List<DiscoverTabCard> list1 = paramBuilder.tab_list;
      if (list1 == null) {
        this.tab_list = DEFAULT_TAB_LIST;
      } else {
        this.tab_list = Message.immutableCopyOf(list1);
      } 
      Integer integer = paramBuilder.floor;
      if (integer == null) {
        this.floor = DEFAULT_FLOOR;
      } else {
        this.floor = integer;
      } 
      integer = paramBuilder.screen_max_num;
      if (integer == null) {
        this.screen_max_num = DEFAULT_SCREEN_MAX_NUM;
      } else {
        this.screen_max_num = integer;
      } 
      String str = paramBuilder.show_frequency;
      if (str == null) {
        this.show_frequency = "";
      } else {
        this.show_frequency = str;
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
      this.tab_list = Message.immutableCopyOf(((Builder)list).tab_list);
      this.floor = ((Builder)list).floor;
      this.screen_max_num = ((Builder)list).screen_max_num;
      this.show_frequency = ((Builder)list).show_frequency;
      this.is_hit_new_style = ((Builder)list).is_hit_new_style;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<DiscoverHotForum> {
    public List<FeedKV> business_info;
    
    public Integer floor;
    
    public Boolean is_hit_new_style;
    
    public Integer screen_max_num;
    
    public String show_frequency;
    
    public List<DiscoverTabCard> tab_list;
    
    public Builder() {}
    
    public Builder(DiscoverHotForum param1DiscoverHotForum) {
      super(param1DiscoverHotForum);
      if (param1DiscoverHotForum == null)
        return; 
      this.tab_list = Message.copyOf(param1DiscoverHotForum.tab_list);
      this.floor = param1DiscoverHotForum.floor;
      this.screen_max_num = param1DiscoverHotForum.screen_max_num;
      this.show_frequency = param1DiscoverHotForum.show_frequency;
      this.is_hit_new_style = param1DiscoverHotForum.is_hit_new_style;
      this.business_info = Message.copyOf(param1DiscoverHotForum.business_info);
    }
    
    public DiscoverHotForum build(boolean param1Boolean) {
      return new DiscoverHotForum(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
