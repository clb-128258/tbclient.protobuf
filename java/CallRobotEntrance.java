package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CallRobotEntrance extends Message {
  public static final String DEFAULT_ABILITY_TYPE = "";
  
  public static final Integer DEFAULT_SKILL_ID = Integer.valueOf(0);
  
  @ProtoField(tag = 2)
  public final AbilityConf ability_conf;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String ability_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer skill_id;
  
  @ProtoField(tag = 3)
  public final StyleConf style_conf;
  
  public CallRobotEntrance(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.ability_type;
      if (str == null) {
        this.ability_type = "";
      } else {
        this.ability_type = str;
      } 
      this.ability_conf = paramBuilder.ability_conf;
      this.style_conf = paramBuilder.style_conf;
      integer = paramBuilder.skill_id;
      if (integer == null) {
        this.skill_id = DEFAULT_SKILL_ID;
      } else {
        this.skill_id = integer;
      } 
    } else {
      this.ability_type = ((Builder)integer).ability_type;
      this.ability_conf = ((Builder)integer).ability_conf;
      this.style_conf = ((Builder)integer).style_conf;
      this.skill_id = ((Builder)integer).skill_id;
    } 
  }
  
  public static final class Builder extends Message.Builder<CallRobotEntrance> {
    public AbilityConf ability_conf;
    
    public String ability_type;
    
    public Integer skill_id;
    
    public StyleConf style_conf;
    
    public Builder() {}
    
    public Builder(CallRobotEntrance param1CallRobotEntrance) {
      super(param1CallRobotEntrance);
      if (param1CallRobotEntrance == null)
        return; 
      this.ability_type = param1CallRobotEntrance.ability_type;
      this.ability_conf = param1CallRobotEntrance.ability_conf;
      this.style_conf = param1CallRobotEntrance.style_conf;
      this.skill_id = param1CallRobotEntrance.skill_id;
    }
    
    public CallRobotEntrance build(boolean param1Boolean) {
      return new CallRobotEntrance(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
