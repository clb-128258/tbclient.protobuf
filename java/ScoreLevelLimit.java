package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ScoreLevelLimit extends Message {
  public static final Integer DEFAULT_SCORE_LEVEL_LIMIT = Integer.valueOf(0);
  
  public static final String DEFAULT_SCORE_LEVEL_LIMIT_TOAST = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer score_level_limit;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String score_level_limit_toast;
  
  public ScoreLevelLimit(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.score_level_limit;
      if (integer == null) {
        this.score_level_limit = DEFAULT_SCORE_LEVEL_LIMIT;
      } else {
        this.score_level_limit = integer;
      } 
      str = paramBuilder.score_level_limit_toast;
      if (str == null) {
        this.score_level_limit_toast = "";
      } else {
        this.score_level_limit_toast = str;
      } 
    } else {
      this.score_level_limit = ((Builder)str).score_level_limit;
      this.score_level_limit_toast = ((Builder)str).score_level_limit_toast;
    } 
  }
  
  public static final class Builder extends Message.Builder<ScoreLevelLimit> {
    public Integer score_level_limit;
    
    public String score_level_limit_toast;
    
    public Builder() {}
    
    public Builder(ScoreLevelLimit param1ScoreLevelLimit) {
      super(param1ScoreLevelLimit);
      if (param1ScoreLevelLimit == null)
        return; 
      this.score_level_limit = param1ScoreLevelLimit.score_level_limit;
      this.score_level_limit_toast = param1ScoreLevelLimit.score_level_limit_toast;
    }
    
    public ScoreLevelLimit build(boolean param1Boolean) {
      return new ScoreLevelLimit(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
