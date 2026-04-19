package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class UserInvitesData extends Message {
  public static final List<String> DEFAULT_ACTIVITY_DESC = Collections.emptyList();
  
  public static final String DEFAULT_ACTIVITY_NAME = "";
  
  public static final String DEFAULT_ACTIVITY_RULE = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
  public final List<String> activity_desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String activity_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String activity_rule;
  
  public UserInvitesData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      String str = paramBuilder.activity_name;
      if (str == null) {
        this.activity_name = "";
      } else {
        this.activity_name = str;
      } 
      str = paramBuilder.activity_rule;
      if (str == null) {
        this.activity_rule = "";
      } else {
        this.activity_rule = str;
      } 
      list = paramBuilder.activity_desc;
      if (list == null) {
        this.activity_desc = DEFAULT_ACTIVITY_DESC;
      } else {
        this.activity_desc = Message.immutableCopyOf(list);
      } 
    } else {
      this.activity_name = ((Builder)list).activity_name;
      this.activity_rule = ((Builder)list).activity_rule;
      this.activity_desc = Message.immutableCopyOf(((Builder)list).activity_desc);
    } 
  }
  
  public static final class Builder extends Message.Builder<UserInvitesData> {
    public List<String> activity_desc;
    
    public String activity_name;
    
    public String activity_rule;
    
    public Builder() {}
    
    public Builder(UserInvitesData param1UserInvitesData) {
      super(param1UserInvitesData);
      if (param1UserInvitesData == null)
        return; 
      this.activity_name = param1UserInvitesData.activity_name;
      this.activity_rule = param1UserInvitesData.activity_rule;
      this.activity_desc = Message.copyOf(param1UserInvitesData.activity_desc);
    }
    
    public UserInvitesData build(boolean param1Boolean) {
      return new UserInvitesData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
