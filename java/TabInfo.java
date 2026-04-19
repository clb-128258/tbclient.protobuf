package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TabInfo extends Message {
  public static final Integer DEFAULT_COUNT;
  
  public static final String DEFAULT_EXT = "";
  
  public static final Long DEFAULT_TAB_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_TAB_NAME = "";
  
  public static final String DEFAULT_TAB_TYPE = "";
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer count;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String ext;
  
  @ProtoField(tag = 5)
  public final ThemeColorInfo tab_icon;
  
  @ProtoField(tag = 6)
  public final ThemeColorInfo tab_icon_selected;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long tab_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tab_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tab_type;
  
  static {
    DEFAULT_COUNT = Integer.valueOf(0);
  }
  
  public TabInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.tab_type;
      if (str2 == null) {
        this.tab_type = "";
      } else {
        this.tab_type = str2;
      } 
      Long long_ = paramBuilder.tab_id;
      if (long_ == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = long_;
      } 
      String str1 = paramBuilder.tab_name;
      if (str1 == null) {
        this.tab_name = "";
      } else {
        this.tab_name = str1;
      } 
      str1 = paramBuilder.ext;
      if (str1 == null) {
        this.ext = "";
      } else {
        this.ext = str1;
      } 
      this.tab_icon = paramBuilder.tab_icon;
      this.tab_icon_selected = paramBuilder.tab_icon_selected;
      integer = paramBuilder.count;
      if (integer == null) {
        this.count = DEFAULT_COUNT;
      } else {
        this.count = integer;
      } 
    } else {
      this.tab_type = ((Builder)integer).tab_type;
      this.tab_id = ((Builder)integer).tab_id;
      this.tab_name = ((Builder)integer).tab_name;
      this.ext = ((Builder)integer).ext;
      this.tab_icon = ((Builder)integer).tab_icon;
      this.tab_icon_selected = ((Builder)integer).tab_icon_selected;
      this.count = ((Builder)integer).count;
    } 
  }
  
  public static final class Builder extends Message.Builder<TabInfo> {
    public Integer count;
    
    public String ext;
    
    public ThemeColorInfo tab_icon;
    
    public ThemeColorInfo tab_icon_selected;
    
    public Long tab_id;
    
    public String tab_name;
    
    public String tab_type;
    
    public Builder() {}
    
    public Builder(TabInfo param1TabInfo) {
      super(param1TabInfo);
      if (param1TabInfo == null)
        return; 
      this.tab_type = param1TabInfo.tab_type;
      this.tab_id = param1TabInfo.tab_id;
      this.tab_name = param1TabInfo.tab_name;
      this.ext = param1TabInfo.ext;
      this.tab_icon = param1TabInfo.tab_icon;
      this.tab_icon_selected = param1TabInfo.tab_icon_selected;
      this.count = param1TabInfo.count;
    }
    
    public TabInfo build(boolean param1Boolean) {
      return new TabInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
