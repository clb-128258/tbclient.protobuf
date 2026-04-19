package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThemeColorInfo;

public final class HeadCardCover extends Message {
  @ProtoField(tag = 2)
  public final ThemeColorInfo card_background;
  
  @ProtoField(tag = 1)
  public final CardFreq freq;
  
  @ProtoField(tag = 3)
  public final MatchCardInfo match_info;
  
  public HeadCardCover(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.freq = paramBuilder.freq;
      this.card_background = paramBuilder.card_background;
      this.match_info = paramBuilder.match_info;
    } else {
      this.freq = paramBuilder.freq;
      this.card_background = paramBuilder.card_background;
      this.match_info = paramBuilder.match_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<HeadCardCover> {
    public ThemeColorInfo card_background;
    
    public CardFreq freq;
    
    public MatchCardInfo match_info;
    
    public Builder() {}
    
    public Builder(HeadCardCover param1HeadCardCover) {
      super(param1HeadCardCover);
      if (param1HeadCardCover == null)
        return; 
      this.freq = param1HeadCardCover.freq;
      this.card_background = param1HeadCardCover.card_background;
      this.match_info = param1HeadCardCover.match_info;
    }
    
    public HeadCardCover build(boolean param1Boolean) {
      return new HeadCardCover(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
