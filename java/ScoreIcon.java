package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ScoreIcon extends Message {
  public static final String DEFAULT_DESC = "";
  
  public static final Integer DEFAULT_SCORE = Integer.valueOf(0);
  
  public static final String DEFAULT_SELECTED = "";
  
  public static final String DEFAULT_UNSELECT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer score;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String selected;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String unselect;
  
  public ScoreIcon(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.desc;
      if (str2 == null) {
        this.desc = "";
      } else {
        this.desc = str2;
      } 
      Integer integer = paramBuilder.score;
      if (integer == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = integer;
      } 
      String str1 = paramBuilder.selected;
      if (str1 == null) {
        this.selected = "";
      } else {
        this.selected = str1;
      } 
      str = paramBuilder.unselect;
      if (str == null) {
        this.unselect = "";
      } else {
        this.unselect = str;
      } 
    } else {
      this.desc = ((Builder)str).desc;
      this.score = ((Builder)str).score;
      this.selected = ((Builder)str).selected;
      this.unselect = ((Builder)str).unselect;
    } 
  }
  
  public static final class Builder extends Message.Builder<ScoreIcon> {
    public String desc;
    
    public Integer score;
    
    public String selected;
    
    public String unselect;
    
    public Builder() {}
    
    public Builder(ScoreIcon param1ScoreIcon) {
      super(param1ScoreIcon);
      if (param1ScoreIcon == null)
        return; 
      this.desc = param1ScoreIcon.desc;
      this.score = param1ScoreIcon.score;
      this.selected = param1ScoreIcon.selected;
      this.unselect = param1ScoreIcon.unselect;
    }
    
    public ScoreIcon build(boolean param1Boolean) {
      return new ScoreIcon(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
