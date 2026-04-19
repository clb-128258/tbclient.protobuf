package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ScoreFeedbackComponent extends Message {
  public static final List<ScoreIcon> DEFAULT_SCORE_ICON_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ScoreIcon> score_icon_list;
  
  public ScoreFeedbackComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ScoreIcon> list;
    if (paramBoolean == true) {
      list = paramBuilder.score_icon_list;
      if (list == null) {
        this.score_icon_list = DEFAULT_SCORE_ICON_LIST;
      } else {
        this.score_icon_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.score_icon_list = Message.immutableCopyOf(((Builder)list).score_icon_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<ScoreFeedbackComponent> {
    public List<ScoreIcon> score_icon_list;
    
    public Builder() {}
    
    public Builder(ScoreFeedbackComponent param1ScoreFeedbackComponent) {
      super(param1ScoreFeedbackComponent);
      if (param1ScoreFeedbackComponent == null)
        return; 
      this.score_icon_list = Message.copyOf(param1ScoreFeedbackComponent.score_icon_list);
    }
    
    public ScoreFeedbackComponent build(boolean param1Boolean) {
      return new ScoreFeedbackComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
