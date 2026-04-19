package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ChatSug extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final List<SugList> DEFAULT_SUG_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<SugList> sug_list;
  
  public ChatSug(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<SugList> list;
    if (paramBoolean == true) {
      String str = paramBuilder.icon;
      if (str == null) {
        this.icon = "";
      } else {
        this.icon = str;
      } 
      list = paramBuilder.sug_list;
      if (list == null) {
        this.sug_list = DEFAULT_SUG_LIST;
      } else {
        this.sug_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.icon = ((Builder)list).icon;
      this.sug_list = Message.immutableCopyOf(((Builder)list).sug_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<ChatSug> {
    public String icon;
    
    public List<SugList> sug_list;
    
    public Builder() {}
    
    public Builder(ChatSug param1ChatSug) {
      super(param1ChatSug);
      if (param1ChatSug == null)
        return; 
      this.icon = param1ChatSug.icon;
      this.sug_list = Message.copyOf(param1ChatSug.sug_list);
    }
    
    public ChatSug build(boolean param1Boolean) {
      return new ChatSug(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
