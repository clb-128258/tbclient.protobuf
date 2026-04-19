package tbclient.ForumRuleDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PbContent;

public final class NewRuleContent extends Message {
  public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<PbContent> content;
  
  public NewRuleContent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<PbContent> list;
    if (paramBoolean == true) {
      list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
    } else {
      this.content = Message.immutableCopyOf(((Builder)list).content);
    } 
  }
  
  public static final class Builder extends Message.Builder<NewRuleContent> {
    public List<PbContent> content;
    
    public Builder() {}
    
    public Builder(NewRuleContent param1NewRuleContent) {
      super(param1NewRuleContent);
      if (param1NewRuleContent == null)
        return; 
      this.content = Message.copyOf(param1NewRuleContent.content);
    }
    
    public NewRuleContent build(boolean param1Boolean) {
      return new NewRuleContent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
