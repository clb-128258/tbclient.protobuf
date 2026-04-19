package tbclient.ForumRuleDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class NewForumRule extends Message {
  public static final List<NewRuleContent> DEFAULT_CONTENT_LIST = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<NewRuleContent> content_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public NewForumRule(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<NewRuleContent> list;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      list = paramBuilder.content_list;
      if (list == null) {
        this.content_list = DEFAULT_CONTENT_LIST;
      } else {
        this.content_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = ((Builder)list).title;
      this.content_list = Message.immutableCopyOf(((Builder)list).content_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<NewForumRule> {
    public List<NewRuleContent> content_list;
    
    public String title;
    
    public Builder() {}
    
    public Builder(NewForumRule param1NewForumRule) {
      super(param1NewForumRule);
      if (param1NewForumRule == null)
        return; 
      this.title = param1NewForumRule.title;
      this.content_list = Message.copyOf(param1NewForumRule.content_list);
    }
    
    public NewForumRule build(boolean param1Boolean) {
      return new NewForumRule(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
