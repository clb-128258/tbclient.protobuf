package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TopLiveDataAnchorUserInfo extends Message {
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_USER_ICON = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String user_icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long user_id;
  
  public TopLiveDataAnchorUserInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str1 = paramBuilder.name_show;
      if (str1 == null) {
        this.name_show = "";
      } else {
        this.name_show = str1;
      } 
      str1 = paramBuilder.portrait;
      if (str1 == null) {
        this.portrait = "";
      } else {
        this.portrait = str1;
      } 
      str = paramBuilder.user_icon;
      if (str == null) {
        this.user_icon = "";
      } else {
        this.user_icon = str;
      } 
    } else {
      this.user_id = ((Builder)str).user_id;
      this.name_show = ((Builder)str).name_show;
      this.portrait = ((Builder)str).portrait;
      this.user_icon = ((Builder)str).user_icon;
    } 
  }
  
  public static final class Builder extends Message.Builder<TopLiveDataAnchorUserInfo> {
    public String name_show;
    
    public String portrait;
    
    public String user_icon;
    
    public Long user_id;
    
    public Builder() {}
    
    public Builder(TopLiveDataAnchorUserInfo param1TopLiveDataAnchorUserInfo) {
      super(param1TopLiveDataAnchorUserInfo);
      if (param1TopLiveDataAnchorUserInfo == null)
        return; 
      this.user_id = param1TopLiveDataAnchorUserInfo.user_id;
      this.name_show = param1TopLiveDataAnchorUserInfo.name_show;
      this.portrait = param1TopLiveDataAnchorUserInfo.portrait;
      this.user_icon = param1TopLiveDataAnchorUserInfo.user_icon;
    }
    
    public TopLiveDataAnchorUserInfo build(boolean param1Boolean) {
      return new TopLiveDataAnchorUserInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
