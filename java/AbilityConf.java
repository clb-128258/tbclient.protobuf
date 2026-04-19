package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AbilityConf extends Message {
  public static final String DEFAULT_BOT_UK = "";
  
  public static final Integer DEFAULT_SKILL_ID = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String bot_uk;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer skill_id;
  
  public AbilityConf(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.bot_uk;
      if (str == null) {
        this.bot_uk = "";
      } else {
        this.bot_uk = str;
      } 
      integer = paramBuilder.skill_id;
      if (integer == null) {
        this.skill_id = DEFAULT_SKILL_ID;
      } else {
        this.skill_id = integer;
      } 
    } else {
      this.bot_uk = ((Builder)integer).bot_uk;
      this.skill_id = ((Builder)integer).skill_id;
    } 
  }
  
  public static final class Builder extends Message.Builder<AbilityConf> {
    public String bot_uk;
    
    public Integer skill_id;
    
    public Builder() {}
    
    public Builder(AbilityConf param1AbilityConf) {
      super(param1AbilityConf);
      if (param1AbilityConf == null)
        return; 
      this.bot_uk = param1AbilityConf.bot_uk;
      this.skill_id = param1AbilityConf.skill_id;
    }
    
    public AbilityConf build(boolean param1Boolean) {
      return new AbilityConf(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
