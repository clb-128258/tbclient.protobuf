package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RobotSkillInfo extends Message {
  public static final String DEFAULT_NEW_SKILL_GUIDE = "";
  
  public static final String DEFAULT_ROBOT_NAME = "";
  
  public static final String DEFAULT_ROBOT_PORTRAIT = "";
  
  public static final List<CallRobotEntrance> DEFAULT_ROBOT_SKILL_LIST = Collections.emptyList();
  
  public static final String DEFAULT_ROBOT_UK = "";
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String new_skill_guide;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String robot_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String robot_portrait;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<CallRobotEntrance> robot_skill_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String robot_uk;
  
  @ProtoField(tag = 6)
  public final StyleContentInfo style_dark;
  
  @ProtoField(tag = 5)
  public final StyleContentInfo style_day;
  
  public RobotSkillInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<CallRobotEntrance> list = paramBuilder.robot_skill_list;
      if (list == null) {
        this.robot_skill_list = DEFAULT_ROBOT_SKILL_LIST;
      } else {
        this.robot_skill_list = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.robot_uk;
      if (str1 == null) {
        this.robot_uk = "";
      } else {
        this.robot_uk = str1;
      } 
      str1 = paramBuilder.robot_portrait;
      if (str1 == null) {
        this.robot_portrait = "";
      } else {
        this.robot_portrait = str1;
      } 
      str1 = paramBuilder.robot_name;
      if (str1 == null) {
        this.robot_name = "";
      } else {
        this.robot_name = str1;
      } 
      this.style_day = paramBuilder.style_day;
      this.style_dark = paramBuilder.style_dark;
      str = paramBuilder.new_skill_guide;
      if (str == null) {
        this.new_skill_guide = "";
      } else {
        this.new_skill_guide = str;
      } 
    } else {
      this.robot_skill_list = Message.immutableCopyOf(((Builder)str).robot_skill_list);
      this.robot_uk = ((Builder)str).robot_uk;
      this.robot_portrait = ((Builder)str).robot_portrait;
      this.robot_name = ((Builder)str).robot_name;
      this.style_day = ((Builder)str).style_day;
      this.style_dark = ((Builder)str).style_dark;
      this.new_skill_guide = ((Builder)str).new_skill_guide;
    } 
  }
  
  public static final class Builder extends Message.Builder<RobotSkillInfo> {
    public String new_skill_guide;
    
    public String robot_name;
    
    public String robot_portrait;
    
    public List<CallRobotEntrance> robot_skill_list;
    
    public String robot_uk;
    
    public StyleContentInfo style_dark;
    
    public StyleContentInfo style_day;
    
    public Builder() {}
    
    public Builder(RobotSkillInfo param1RobotSkillInfo) {
      super(param1RobotSkillInfo);
      if (param1RobotSkillInfo == null)
        return; 
      this.robot_skill_list = Message.copyOf(param1RobotSkillInfo.robot_skill_list);
      this.robot_uk = param1RobotSkillInfo.robot_uk;
      this.robot_portrait = param1RobotSkillInfo.robot_portrait;
      this.robot_name = param1RobotSkillInfo.robot_name;
      this.style_day = param1RobotSkillInfo.style_day;
      this.style_dark = param1RobotSkillInfo.style_dark;
      this.new_skill_guide = param1RobotSkillInfo.new_skill_guide;
    }
    
    public RobotSkillInfo build(boolean param1Boolean) {
      return new RobotSkillInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
