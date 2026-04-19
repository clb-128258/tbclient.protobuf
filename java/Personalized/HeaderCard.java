package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.QuizCard;
import tbclient.ThemeColorInfo;
import tbclient.ThreadInfo;

public final class HeaderCard extends Message {
  public static final String DEFAULT_CARD_TITLE = "";
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  @ProtoField(tag = 3)
  public final ThemeColorInfo card_background;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String card_title;
  
  @ProtoField(tag = 4)
  public final HeadCardCover cover;
  
  @ProtoField(tag = 5)
  public final QuizCard quiz_card;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> thread_list;
  
  public HeaderCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.card_title;
      if (str == null) {
        this.card_title = "";
      } else {
        this.card_title = str;
      } 
      List<ThreadInfo> list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
      this.card_background = paramBuilder.card_background;
      this.cover = paramBuilder.cover;
      this.quiz_card = paramBuilder.quiz_card;
    } else {
      this.card_title = paramBuilder.card_title;
      this.thread_list = Message.immutableCopyOf(paramBuilder.thread_list);
      this.card_background = paramBuilder.card_background;
      this.cover = paramBuilder.cover;
      this.quiz_card = paramBuilder.quiz_card;
    } 
  }
  
  public static final class Builder extends Message.Builder<HeaderCard> {
    public ThemeColorInfo card_background;
    
    public String card_title;
    
    public HeadCardCover cover;
    
    public QuizCard quiz_card;
    
    public List<ThreadInfo> thread_list;
    
    public Builder() {}
    
    public Builder(HeaderCard param1HeaderCard) {
      super(param1HeaderCard);
      if (param1HeaderCard == null)
        return; 
      this.card_title = param1HeaderCard.card_title;
      this.thread_list = Message.copyOf(param1HeaderCard.thread_list);
      this.card_background = param1HeaderCard.card_background;
      this.cover = param1HeaderCard.cover;
      this.quiz_card = param1HeaderCard.quiz_card;
    }
    
    public HeaderCard build(boolean param1Boolean) {
      return new HeaderCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
