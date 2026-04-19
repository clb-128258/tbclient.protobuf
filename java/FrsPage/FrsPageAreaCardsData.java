package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FrsPageAreaCardsData extends Message {
  public static final String DEFAULT_CARD_TYPE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String card_type;
  
  @ProtoField(tag = 2)
  public final FrsPageCardData data;
  
  public FrsPageAreaCardsData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.card_type;
      if (str == null) {
        this.card_type = "";
      } else {
        this.card_type = str;
      } 
      this.data = paramBuilder.data;
    } else {
      this.card_type = paramBuilder.card_type;
      this.data = paramBuilder.data;
    } 
  }
  
  public static final class Builder extends Message.Builder<FrsPageAreaCardsData> {
    public String card_type;
    
    public FrsPageCardData data;
    
    public Builder() {}
    
    public Builder(FrsPageAreaCardsData param1FrsPageAreaCardsData) {
      super(param1FrsPageAreaCardsData);
      if (param1FrsPageAreaCardsData == null)
        return; 
      this.card_type = param1FrsPageAreaCardsData.card_type;
      this.data = param1FrsPageAreaCardsData.data;
    }
    
    public FrsPageAreaCardsData build(boolean param1Boolean) {
      return new FrsPageAreaCardsData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
