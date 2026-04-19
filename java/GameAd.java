package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GameAd extends Message {
  public static final String DEFAULT_MOST_NUM = "";
  
  public static final String DEFAULT_STEP_NUM = "";
  
  @ProtoField(tag = 1)
  public final GameDetail game_detail;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String most_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String step_num;
  
  public GameAd(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.game_detail = paramBuilder.game_detail;
      String str1 = paramBuilder.most_num;
      if (str1 == null) {
        this.most_num = "";
      } else {
        this.most_num = str1;
      } 
      str = paramBuilder.step_num;
      if (str == null) {
        this.step_num = "";
      } else {
        this.step_num = str;
      } 
    } else {
      this.game_detail = ((Builder)str).game_detail;
      this.most_num = ((Builder)str).most_num;
      this.step_num = ((Builder)str).step_num;
    } 
  }
  
  public static final class Builder extends Message.Builder<GameAd> {
    public GameDetail game_detail;
    
    public String most_num;
    
    public String step_num;
    
    public Builder() {}
    
    public Builder(GameAd param1GameAd) {
      super(param1GameAd);
      if (param1GameAd == null)
        return; 
      this.game_detail = param1GameAd.game_detail;
      this.most_num = param1GameAd.most_num;
      this.step_num = param1GameAd.step_num;
    }
    
    public GameAd build(boolean param1Boolean) {
      return new GameAd(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
