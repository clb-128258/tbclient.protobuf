package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ClickBackCard extends Message {
  public static final List<ClickBackCardItem> DEFAULT_CARD_LIST = Collections.emptyList();
  
  public static final String DEFAULT_CARD_NAME = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ClickBackCardItem> card_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String card_name;
  
  public ClickBackCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ClickBackCardItem> list;
    if (paramBoolean == true) {
      String str = paramBuilder.card_name;
      if (str == null) {
        this.card_name = "";
      } else {
        this.card_name = str;
      } 
      list = paramBuilder.card_list;
      if (list == null) {
        this.card_list = DEFAULT_CARD_LIST;
      } else {
        this.card_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.card_name = ((Builder)list).card_name;
      this.card_list = Message.immutableCopyOf(((Builder)list).card_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<ClickBackCard> {
    public List<ClickBackCardItem> card_list;
    
    public String card_name;
    
    public Builder() {}
    
    public Builder(ClickBackCard param1ClickBackCard) {
      super(param1ClickBackCard);
      if (param1ClickBackCard == null)
        return; 
      this.card_name = param1ClickBackCard.card_name;
      this.card_list = Message.copyOf(param1ClickBackCard.card_list);
    }
    
    public ClickBackCard build(boolean param1Boolean) {
      return new ClickBackCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
