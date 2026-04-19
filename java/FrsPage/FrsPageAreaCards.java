package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FrsPageAreaCards extends Message {
  public static final String DEFAULT_AREA_TYPE = "";
  
  public static final List<FrsPageAreaCardsData> DEFAULT_CARD_DATA = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String area_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FrsPageAreaCardsData> card_data;
  
  public FrsPageAreaCards(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FrsPageAreaCardsData> list;
    if (paramBoolean == true) {
      String str = paramBuilder.area_type;
      if (str == null) {
        this.area_type = "";
      } else {
        this.area_type = str;
      } 
      list = paramBuilder.card_data;
      if (list == null) {
        this.card_data = DEFAULT_CARD_DATA;
      } else {
        this.card_data = Message.immutableCopyOf(list);
      } 
    } else {
      this.area_type = ((Builder)list).area_type;
      this.card_data = Message.immutableCopyOf(((Builder)list).card_data);
    } 
  }
  
  public static final class Builder extends Message.Builder<FrsPageAreaCards> {
    public String area_type;
    
    public List<FrsPageAreaCardsData> card_data;
    
    public Builder() {}
    
    public Builder(FrsPageAreaCards param1FrsPageAreaCards) {
      super(param1FrsPageAreaCards);
      if (param1FrsPageAreaCards == null)
        return; 
      this.area_type = param1FrsPageAreaCards.area_type;
      this.card_data = Message.copyOf(param1FrsPageAreaCards.card_data);
    }
    
    public FrsPageAreaCards build(boolean param1Boolean) {
      return new FrsPageAreaCards(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
