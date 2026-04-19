package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class GroupFeedCard extends Message {
  public static final String DEFAULT_CARD_TITLE = "";
  
  public static final List<FeedGroupInfo> DEFAULT_GROUP_LIST;
  
  public static final Integer DEFAULT_INDEX = Integer.valueOf(0);
  
  public static final String DEFAULT_TOPBAR_ICON = "";
  
  public static final String DEFAULT_TOPBAR_ICON_DARK = "";
  
  public static final String DEFAULT_TOPBAR_TITLE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String card_title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedGroupInfo> group_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer index;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String topbar_icon;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String topbar_icon_dark;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String topbar_title;
  
  static {
    DEFAULT_GROUP_LIST = Collections.emptyList();
  }
  
  public GroupFeedCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.card_title;
      if (str2 == null) {
        this.card_title = "";
      } else {
        this.card_title = str2;
      } 
      Integer integer = paramBuilder.index;
      if (integer == null) {
        this.index = DEFAULT_INDEX;
      } else {
        this.index = integer;
      } 
      List<FeedGroupInfo> list = paramBuilder.group_list;
      if (list == null) {
        this.group_list = DEFAULT_GROUP_LIST;
      } else {
        this.group_list = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.topbar_icon;
      if (str1 == null) {
        this.topbar_icon = "";
      } else {
        this.topbar_icon = str1;
      } 
      str1 = paramBuilder.topbar_title;
      if (str1 == null) {
        this.topbar_title = "";
      } else {
        this.topbar_title = str1;
      } 
      str = paramBuilder.topbar_icon_dark;
      if (str == null) {
        this.topbar_icon_dark = "";
      } else {
        this.topbar_icon_dark = str;
      } 
    } else {
      this.card_title = ((Builder)str).card_title;
      this.index = ((Builder)str).index;
      this.group_list = Message.immutableCopyOf(((Builder)str).group_list);
      this.topbar_icon = ((Builder)str).topbar_icon;
      this.topbar_title = ((Builder)str).topbar_title;
      this.topbar_icon_dark = ((Builder)str).topbar_icon_dark;
    } 
  }
  
  public static final class Builder extends Message.Builder<GroupFeedCard> {
    public String card_title;
    
    public List<FeedGroupInfo> group_list;
    
    public Integer index;
    
    public String topbar_icon;
    
    public String topbar_icon_dark;
    
    public String topbar_title;
    
    public Builder() {}
    
    public Builder(GroupFeedCard param1GroupFeedCard) {
      super(param1GroupFeedCard);
      if (param1GroupFeedCard == null)
        return; 
      this.card_title = param1GroupFeedCard.card_title;
      this.index = param1GroupFeedCard.index;
      this.group_list = Message.copyOf(param1GroupFeedCard.group_list);
      this.topbar_icon = param1GroupFeedCard.topbar_icon;
      this.topbar_title = param1GroupFeedCard.topbar_title;
      this.topbar_icon_dark = param1GroupFeedCard.topbar_icon_dark;
    }
    
    public GroupFeedCard build(boolean param1Boolean) {
      return new GroupFeedCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
