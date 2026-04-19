package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class HeadcardLayout extends Message {
  public static final String DEFAULT_CARD_TITLE = "";
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final List<String> DEFAULT_PREFETCH_SCHEMA;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  @ProtoField(tag = 3)
  public final ThemeColorInfo card_background;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String card_title;
  
  @ProtoField(tag = 4)
  public final PubHeadCardCover cover;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<FeedKV> log_param;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7, type = Message.Datatype.STRING)
  public final List<String> prefetch_schema;
  
  @ProtoField(tag = 5)
  public final QuizCard quiz_card;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> thread_list;
  
  static {
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_PREFETCH_SCHEMA = Collections.emptyList();
  }
  
  public HeadcardLayout(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      String str = paramBuilder.card_title;
      if (str == null) {
        this.card_title = "";
      } else {
        this.card_title = str;
      } 
      List<ThreadInfo> list2 = paramBuilder.thread_list;
      if (list2 == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list2);
      } 
      this.card_background = paramBuilder.card_background;
      this.cover = paramBuilder.cover;
      this.quiz_card = paramBuilder.quiz_card;
      List<FeedKV> list1 = paramBuilder.log_param;
      if (list1 == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.prefetch_schema;
      if (list == null) {
        this.prefetch_schema = DEFAULT_PREFETCH_SCHEMA;
      } else {
        this.prefetch_schema = Message.immutableCopyOf(list);
      } 
    } else {
      this.card_title = ((Builder)list).card_title;
      this.thread_list = Message.immutableCopyOf(((Builder)list).thread_list);
      this.card_background = ((Builder)list).card_background;
      this.cover = ((Builder)list).cover;
      this.quiz_card = ((Builder)list).quiz_card;
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
      this.prefetch_schema = Message.immutableCopyOf(((Builder)list).prefetch_schema);
    } 
  }
  
  public static final class Builder extends Message.Builder<HeadcardLayout> {
    public ThemeColorInfo card_background;
    
    public String card_title;
    
    public PubHeadCardCover cover;
    
    public List<FeedKV> log_param;
    
    public List<String> prefetch_schema;
    
    public QuizCard quiz_card;
    
    public List<ThreadInfo> thread_list;
    
    public Builder() {}
    
    public Builder(HeadcardLayout param1HeadcardLayout) {
      super(param1HeadcardLayout);
      if (param1HeadcardLayout == null)
        return; 
      this.card_title = param1HeadcardLayout.card_title;
      this.thread_list = Message.copyOf(param1HeadcardLayout.thread_list);
      this.card_background = param1HeadcardLayout.card_background;
      this.cover = param1HeadcardLayout.cover;
      this.quiz_card = param1HeadcardLayout.quiz_card;
      this.log_param = Message.copyOf(param1HeadcardLayout.log_param);
      this.prefetch_schema = Message.copyOf(param1HeadcardLayout.prefetch_schema);
    }
    
    public HeadcardLayout build(boolean param1Boolean) {
      return new HeadcardLayout(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
