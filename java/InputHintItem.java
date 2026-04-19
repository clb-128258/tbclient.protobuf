package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class InputHintItem extends Message {
  public static final List<InputHintContent> DEFAULT_CONTENT = Collections.emptyList();
  
  public static final String DEFAULT_TYPE = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<InputHintContent> content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String type;
  
  public InputHintItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<InputHintContent> list;
    if (paramBoolean == true) {
      String str = paramBuilder.type;
      if (str == null) {
        this.type = "";
      } else {
        this.type = str;
      } 
      list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
    } else {
      this.type = ((Builder)list).type;
      this.content = Message.immutableCopyOf(((Builder)list).content);
    } 
  }
  
  public static final class Builder extends Message.Builder<InputHintItem> {
    public List<InputHintContent> content;
    
    public String type;
    
    public Builder() {}
    
    public Builder(InputHintItem param1InputHintItem) {
      super(param1InputHintItem);
      if (param1InputHintItem == null)
        return; 
      this.type = param1InputHintItem.type;
      this.content = Message.copyOf(param1InputHintItem.content);
    }
    
    public InputHintItem build(boolean param1Boolean) {
      return new InputHintItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
