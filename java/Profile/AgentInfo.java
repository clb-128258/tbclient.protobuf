package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AgentInfo extends Message {
  public static final Integer DEFAULT_AGENT_NUM = Integer.valueOf(0);
  
  public static final String DEFAULT_AGENT_PAGE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer agent_num;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String agent_page;
  
  public AgentInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.agent_num;
      if (integer == null) {
        this.agent_num = DEFAULT_AGENT_NUM;
      } else {
        this.agent_num = integer;
      } 
      str = paramBuilder.agent_page;
      if (str == null) {
        this.agent_page = "";
      } else {
        this.agent_page = str;
      } 
    } else {
      this.agent_num = ((Builder)str).agent_num;
      this.agent_page = ((Builder)str).agent_page;
    } 
  }
  
  public static final class Builder extends Message.Builder<AgentInfo> {
    public Integer agent_num;
    
    public String agent_page;
    
    public Builder() {}
    
    public Builder(AgentInfo param1AgentInfo) {
      super(param1AgentInfo);
      if (param1AgentInfo == null)
        return; 
      this.agent_num = param1AgentInfo.agent_num;
      this.agent_page = param1AgentInfo.agent_page;
    }
    
    public AgentInfo build(boolean param1Boolean) {
      return new AgentInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
