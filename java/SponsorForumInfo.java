package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SponsorForumInfo extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  public SponsorForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      String str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      str = paramBuilder.avatar;
      if (str == null) {
        this.avatar = "";
      } else {
        this.avatar = str;
      } 
    } else {
      this.forum_id = ((Builder)str).forum_id;
      this.forum_name = ((Builder)str).forum_name;
      this.avatar = ((Builder)str).avatar;
    } 
  }
  
  public static final class Builder extends Message.Builder<SponsorForumInfo> {
    public String avatar;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Builder() {}
    
    public Builder(SponsorForumInfo param1SponsorForumInfo) {
      super(param1SponsorForumInfo);
      if (param1SponsorForumInfo == null)
        return; 
      this.forum_id = param1SponsorForumInfo.forum_id;
      this.forum_name = param1SponsorForumInfo.forum_name;
      this.avatar = param1SponsorForumInfo.avatar;
    }
    
    public SponsorForumInfo build(boolean param1Boolean) {
      return new SponsorForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
