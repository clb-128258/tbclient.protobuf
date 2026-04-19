package tbclient.ActiveConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ActiveCenter;
import tbclient.CommonTaskInfo;
import tbclient.FloatStrategy;
import tbclient.MissionInfo;

public final class DataRes extends Message {
  public static final String DEFAULT_ACTIVE_URL = "";
  
  public static final List<FloatStrategy> DEFAULT_FLOAT_LIST;
  
  public static final Integer DEFAULT_IS_NEW_USER = Integer.valueOf(0);
  
  public static final List<MissionInfo> DEFAULT_MISSION_LIST = Collections.emptyList();
  
  public static final String DEFAULT_NEWUSER_POP_CLICKURL = "";
  
  public static final String DEFAULT_NEWUSER_POP_MONEY = "";
  
  public static final String DEFAULT_NEWUSER_POP_TOP = "";
  
  public static final List<CommonTaskInfo> DEFAULT_TASK_LIST;
  
  @ProtoField(tag = 9)
  public final ActiveCenter active_center;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String active_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<FloatStrategy> float_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_new_user;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<MissionInfo> mission_list;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String newuser_pop_clickurl;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String newuser_pop_money;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String newuser_pop_top;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 11)
  public final List<CommonTaskInfo> task_list;
  
  static {
    DEFAULT_FLOAT_LIST = Collections.emptyList();
    DEFAULT_TASK_LIST = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<CommonTaskInfo> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_new_user;
      if (integer == null) {
        this.is_new_user = DEFAULT_IS_NEW_USER;
      } else {
        this.is_new_user = integer;
      } 
      String str2 = paramBuilder.active_url;
      if (str2 == null) {
        this.active_url = "";
      } else {
        this.active_url = str2;
      } 
      List<MissionInfo> list2 = paramBuilder.mission_list;
      if (list2 == null) {
        this.mission_list = DEFAULT_MISSION_LIST;
      } else {
        this.mission_list = Message.immutableCopyOf(list2);
      } 
      List<FloatStrategy> list1 = paramBuilder.float_list;
      if (list1 == null) {
        this.float_list = DEFAULT_FLOAT_LIST;
      } else {
        this.float_list = Message.immutableCopyOf(list1);
      } 
      String str1 = paramBuilder.newuser_pop_clickurl;
      if (str1 == null) {
        this.newuser_pop_clickurl = "";
      } else {
        this.newuser_pop_clickurl = str1;
      } 
      str1 = paramBuilder.newuser_pop_money;
      if (str1 == null) {
        this.newuser_pop_money = "";
      } else {
        this.newuser_pop_money = str1;
      } 
      str1 = paramBuilder.newuser_pop_top;
      if (str1 == null) {
        this.newuser_pop_top = "";
      } else {
        this.newuser_pop_top = str1;
      } 
      this.active_center = paramBuilder.active_center;
      list = paramBuilder.task_list;
      if (list == null) {
        this.task_list = DEFAULT_TASK_LIST;
      } else {
        this.task_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.is_new_user = ((Builder)list).is_new_user;
      this.active_url = ((Builder)list).active_url;
      this.mission_list = Message.immutableCopyOf(((Builder)list).mission_list);
      this.float_list = Message.immutableCopyOf(((Builder)list).float_list);
      this.newuser_pop_clickurl = ((Builder)list).newuser_pop_clickurl;
      this.newuser_pop_money = ((Builder)list).newuser_pop_money;
      this.newuser_pop_top = ((Builder)list).newuser_pop_top;
      this.active_center = ((Builder)list).active_center;
      this.task_list = Message.immutableCopyOf(((Builder)list).task_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public ActiveCenter active_center;
    
    public String active_url;
    
    public List<FloatStrategy> float_list;
    
    public Integer is_new_user;
    
    public List<MissionInfo> mission_list;
    
    public String newuser_pop_clickurl;
    
    public String newuser_pop_money;
    
    public String newuser_pop_top;
    
    public List<CommonTaskInfo> task_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.is_new_user = param1DataRes.is_new_user;
      this.active_url = param1DataRes.active_url;
      this.mission_list = Message.copyOf(param1DataRes.mission_list);
      this.float_list = Message.copyOf(param1DataRes.float_list);
      this.newuser_pop_clickurl = param1DataRes.newuser_pop_clickurl;
      this.newuser_pop_money = param1DataRes.newuser_pop_money;
      this.newuser_pop_top = param1DataRes.newuser_pop_top;
      this.active_center = param1DataRes.active_center;
      this.task_list = Message.copyOf(param1DataRes.task_list);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
