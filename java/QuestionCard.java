package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class QuestionCard extends Message {
  public static final List<ComponentFactory> DEFAULT_COMPONENTS = Collections.emptyList();
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ComponentFactory> components;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedKV> log_param;
  
  public QuestionCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      List<ComponentFactory> list1 = paramBuilder.components;
      if (list1 == null) {
        this.components = DEFAULT_COMPONENTS;
      } else {
        this.components = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
    } else {
      this.components = Message.immutableCopyOf(((Builder)list).components);
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
    } 
  }
  
  public static final class Builder extends Message.Builder<QuestionCard> {
    public List<ComponentFactory> components;
    
    public List<FeedKV> log_param;
    
    public Builder() {}
    
    public Builder(QuestionCard param1QuestionCard) {
      super(param1QuestionCard);
      if (param1QuestionCard == null)
        return; 
      this.components = Message.copyOf(param1QuestionCard.components);
      this.log_param = Message.copyOf(param1QuestionCard.log_param);
    }
    
    public QuestionCard build(boolean param1Boolean) {
      return new QuestionCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
