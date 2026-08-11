package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class UserTask extends Message {
  public static final String DEFAULT_DARK_DEFAULT_BACKGROUND = "";
  
  public static final String DEFAULT_DEFAULT_BACKGROUND = "";
  
  public static final Long DEFAULT_EARNABLE_TMONEY;
  
  public static final List<ZoneBubbleInfo> DEFAULT_TASK_LIST = Collections.emptyList();
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String dark_default_background;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String default_background;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long earnable_tmoney;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ZoneBubbleInfo> task_list;
  
  static {
    DEFAULT_EARNABLE_TMONEY = Long.valueOf(0L);
  }
  
  public UserTask(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<ZoneBubbleInfo> list = paramBuilder.task_list;
      if (list == null) {
        this.task_list = DEFAULT_TASK_LIST;
      } else {
        this.task_list = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.default_background;
      if (str1 == null) {
        this.default_background = "";
      } else {
        this.default_background = str1;
      } 
      Long long_ = paramBuilder.earnable_tmoney;
      if (long_ == null) {
        this.earnable_tmoney = DEFAULT_EARNABLE_TMONEY;
      } else {
        this.earnable_tmoney = long_;
      } 
      str = paramBuilder.dark_default_background;
      if (str == null) {
        this.dark_default_background = "";
      } else {
        this.dark_default_background = str;
      } 
    } else {
      this.task_list = Message.immutableCopyOf(((Builder)str).task_list);
      this.default_background = ((Builder)str).default_background;
      this.earnable_tmoney = ((Builder)str).earnable_tmoney;
      this.dark_default_background = ((Builder)str).dark_default_background;
    } 
  }
  
  public static final class Builder extends Message.Builder<UserTask> {
    public String dark_default_background;
    
    public String default_background;
    
    public Long earnable_tmoney;
    
    public List<ZoneBubbleInfo> task_list;
    
    public Builder() {}
    
    public Builder(UserTask param1UserTask) {
      super(param1UserTask);
      if (param1UserTask == null)
        return; 
      this.task_list = Message.copyOf(param1UserTask.task_list);
      this.default_background = param1UserTask.default_background;
      this.earnable_tmoney = param1UserTask.earnable_tmoney;
      this.dark_default_background = param1UserTask.dark_default_background;
    }
    
    public UserTask build(boolean param1Boolean) {
      return new UserTask(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
