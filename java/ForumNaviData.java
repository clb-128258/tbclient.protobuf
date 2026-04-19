package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumNaviData extends Message {
  public static final String DEFAULT_FORUM_NAVI_TEXT = "";
  
  @ProtoField(tag = 2)
  public final ForumNaviIcon forum_navi_icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String forum_navi_text;
  
  public ForumNaviData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.forum_navi_text;
      if (str == null) {
        this.forum_navi_text = "";
      } else {
        this.forum_navi_text = str;
      } 
      this.forum_navi_icon = paramBuilder.forum_navi_icon;
    } else {
      this.forum_navi_text = paramBuilder.forum_navi_text;
      this.forum_navi_icon = paramBuilder.forum_navi_icon;
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumNaviData> {
    public ForumNaviIcon forum_navi_icon;
    
    public String forum_navi_text;
    
    public Builder() {}
    
    public Builder(ForumNaviData param1ForumNaviData) {
      super(param1ForumNaviData);
      if (param1ForumNaviData == null)
        return; 
      this.forum_navi_text = param1ForumNaviData.forum_navi_text;
      this.forum_navi_icon = param1ForumNaviData.forum_navi_icon;
    }
    
    public ForumNaviData build(boolean param1Boolean) {
      return new ForumNaviData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
