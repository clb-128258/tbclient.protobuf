package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RobotSkill extends Message {
  public static final String DEFAULT_ROBOT_UK = "";
  
  public static final List<Integer> DEFAULT_SKILL_IDS = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String robot_uk;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.INT32)
  public final List<Integer> skill_ids;
  
  public RobotSkill(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<Integer> list;
    if (paramBoolean == true) {
      String str = paramBuilder.robot_uk;
      if (str == null) {
        this.robot_uk = "";
      } else {
        this.robot_uk = str;
      } 
      list = paramBuilder.skill_ids;
      if (list == null) {
        this.skill_ids = DEFAULT_SKILL_IDS;
      } else {
        this.skill_ids = Message.immutableCopyOf(list);
      } 
    } else {
      this.robot_uk = ((Builder)list).robot_uk;
      this.skill_ids = Message.immutableCopyOf(((Builder)list).skill_ids);
    } 
  }
  
  public static final class Builder extends Message.Builder<RobotSkill> {
    public String robot_uk;
    
    public List<Integer> skill_ids;
    
    public Builder() {}
    
    public Builder(RobotSkill param1RobotSkill) {
      super(param1RobotSkill);
      if (param1RobotSkill == null)
        return; 
      this.robot_uk = param1RobotSkill.robot_uk;
      this.skill_ids = Message.copyOf(param1RobotSkill.skill_ids);
    }
    
    public RobotSkill build(boolean param1Boolean) {
      return new RobotSkill(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
