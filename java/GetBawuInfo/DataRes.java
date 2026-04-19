package tbclient.GetBawuInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BawuTeam;
import tbclient.Feedback;

public final class DataRes extends Message {
  public static final Integer DEFAULT_IS_PRIVATE_FORUM = Integer.valueOf(0);
  
  @ProtoField(tag = 1)
  public final BawuTeam bawu_team_info;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_private_forum;
  
  @ProtoField(tag = 2)
  public final ManagerApplyInfo manager_apply_info;
  
  @ProtoField(tag = 4)
  public final Feedback manager_complain_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.bawu_team_info = paramBuilder.bawu_team_info;
      this.manager_apply_info = paramBuilder.manager_apply_info;
      Integer integer = paramBuilder.is_private_forum;
      if (integer == null) {
        this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
      } else {
        this.is_private_forum = integer;
      } 
      this.manager_complain_info = paramBuilder.manager_complain_info;
    } else {
      this.bawu_team_info = paramBuilder.bawu_team_info;
      this.manager_apply_info = paramBuilder.manager_apply_info;
      this.is_private_forum = paramBuilder.is_private_forum;
      this.manager_complain_info = paramBuilder.manager_complain_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public BawuTeam bawu_team_info;
    
    public Integer is_private_forum;
    
    public ManagerApplyInfo manager_apply_info;
    
    public Feedback manager_complain_info;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.bawu_team_info = param1DataRes.bawu_team_info;
      this.manager_apply_info = param1DataRes.manager_apply_info;
      this.is_private_forum = param1DataRes.is_private_forum;
      this.manager_complain_info = param1DataRes.manager_complain_info;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
