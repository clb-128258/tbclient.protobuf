package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class QuizCard extends Message {
  @ProtoField(tag = 4)
  public final LinkConf bottom;
  
  @ProtoField(tag = 2)
  public final ThemeColorInfo card_background;
  
  @ProtoField(tag = 1)
  public final PubCardFreq freq;
  
  @ProtoField(tag = 5)
  public final QuizInfo quiz;
  
  @ProtoField(tag = 3)
  public final QuizCardTopConf top;
  
  public QuizCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.freq = paramBuilder.freq;
      this.card_background = paramBuilder.card_background;
      this.top = paramBuilder.top;
      this.bottom = paramBuilder.bottom;
      this.quiz = paramBuilder.quiz;
    } else {
      this.freq = paramBuilder.freq;
      this.card_background = paramBuilder.card_background;
      this.top = paramBuilder.top;
      this.bottom = paramBuilder.bottom;
      this.quiz = paramBuilder.quiz;
    } 
  }
  
  public static final class Builder extends Message.Builder<QuizCard> {
    public LinkConf bottom;
    
    public ThemeColorInfo card_background;
    
    public PubCardFreq freq;
    
    public QuizInfo quiz;
    
    public QuizCardTopConf top;
    
    public Builder() {}
    
    public Builder(QuizCard param1QuizCard) {
      super(param1QuizCard);
      if (param1QuizCard == null)
        return; 
      this.freq = param1QuizCard.freq;
      this.card_background = param1QuizCard.card_background;
      this.top = param1QuizCard.top;
      this.bottom = param1QuizCard.bottom;
      this.quiz = param1QuizCard.quiz;
    }
    
    public QuizCard build(boolean param1Boolean) {
      return new QuizCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
