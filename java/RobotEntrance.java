package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RobotEntrance extends Message {
  public static final String DEFAULT_BOTTOM_BAR_CLICK_GUIDE = "";
  
  public static final List<RobotSkill> DEFAULT_BOTTOM_BAR_ROBOT_SKILL;
  
  public static final List<RobotSkill> DEFAULT_FIRST_FLOOR_BAR_ROBOT_SKILL;
  
  public static final List<RobotSkillInfo> DEFAULT_ROBOT_SKILL_INFO = Collections.emptyList();
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String bottom_bar_click_guide;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<RobotSkill> bottom_bar_robot_skill;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<RobotSkill> first_floor_bar_robot_skill;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<RobotSkillInfo> robot_skill_info;
  
  @ProtoField(tag = 4)
  public final Toast toast;
  
  static {
    DEFAULT_BOTTOM_BAR_ROBOT_SKILL = Collections.emptyList();
    DEFAULT_FIRST_FLOOR_BAR_ROBOT_SKILL = Collections.emptyList();
  }
  
  public RobotEntrance(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<RobotSkillInfo> list1 = paramBuilder.robot_skill_info;
      if (list1 == null) {
        this.robot_skill_info = DEFAULT_ROBOT_SKILL_INFO;
      } else {
        this.robot_skill_info = Message.immutableCopyOf(list1);
      } 
      List<RobotSkill> list = paramBuilder.bottom_bar_robot_skill;
      if (list == null) {
        this.bottom_bar_robot_skill = DEFAULT_BOTTOM_BAR_ROBOT_SKILL;
      } else {
        this.bottom_bar_robot_skill = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.first_floor_bar_robot_skill;
      if (list == null) {
        this.first_floor_bar_robot_skill = DEFAULT_FIRST_FLOOR_BAR_ROBOT_SKILL;
      } else {
        this.first_floor_bar_robot_skill = Message.immutableCopyOf(list);
      } 
      this.toast = paramBuilder.toast;
      str = paramBuilder.bottom_bar_click_guide;
      if (str == null) {
        this.bottom_bar_click_guide = "";
      } else {
        this.bottom_bar_click_guide = str;
      } 
    } else {
      this.robot_skill_info = Message.immutableCopyOf(((Builder)str).robot_skill_info);
      this.bottom_bar_robot_skill = Message.immutableCopyOf(((Builder)str).bottom_bar_robot_skill);
      this.first_floor_bar_robot_skill = Message.immutableCopyOf(((Builder)str).first_floor_bar_robot_skill);
      this.toast = ((Builder)str).toast;
      this.bottom_bar_click_guide = ((Builder)str).bottom_bar_click_guide;
    } 
  }
  
  public static final class Builder extends Message.Builder<RobotEntrance> {
    public String bottom_bar_click_guide;
    
    public List<RobotSkill> bottom_bar_robot_skill;
    
    public List<RobotSkill> first_floor_bar_robot_skill;
    
    public List<RobotSkillInfo> robot_skill_info;
    
    public Toast toast;
    
    public Builder() {}
    
    public Builder(RobotEntrance param1RobotEntrance) {
      super(param1RobotEntrance);
      if (param1RobotEntrance == null)
        return; 
      this.robot_skill_info = Message.copyOf(param1RobotEntrance.robot_skill_info);
      this.bottom_bar_robot_skill = Message.copyOf(param1RobotEntrance.bottom_bar_robot_skill);
      this.first_floor_bar_robot_skill = Message.copyOf(param1RobotEntrance.first_floor_bar_robot_skill);
      this.toast = param1RobotEntrance.toast;
      this.bottom_bar_click_guide = param1RobotEntrance.bottom_bar_click_guide;
    }
    
    public RobotEntrance build(boolean param1Boolean) {
      return new RobotEntrance(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
