package tbclient.ForumRuleDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ForumRuleConf extends Message {
  public static final List<String> DEFAULT_FIRST_LEVEL_INDEX_LIST = Collections.emptyList();
  
  public static final List<String> DEFAULT_SECOND_LEVEL_INDEX_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
  public final List<String> first_level_index_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
  public final List<String> second_level_index_list;
  
  public ForumRuleConf(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      List<String> list1 = paramBuilder.first_level_index_list;
      if (list1 == null) {
        this.first_level_index_list = DEFAULT_FIRST_LEVEL_INDEX_LIST;
      } else {
        this.first_level_index_list = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.second_level_index_list;
      if (list == null) {
        this.second_level_index_list = DEFAULT_SECOND_LEVEL_INDEX_LIST;
      } else {
        this.second_level_index_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.first_level_index_list = Message.immutableCopyOf(((Builder)list).first_level_index_list);
      this.second_level_index_list = Message.immutableCopyOf(((Builder)list).second_level_index_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumRuleConf> {
    public List<String> first_level_index_list;
    
    public List<String> second_level_index_list;
    
    public Builder() {}
    
    public Builder(ForumRuleConf param1ForumRuleConf) {
      super(param1ForumRuleConf);
      if (param1ForumRuleConf == null)
        return; 
      this.first_level_index_list = Message.copyOf(param1ForumRuleConf.first_level_index_list);
      this.second_level_index_list = Message.copyOf(param1ForumRuleConf.second_level_index_list);
    }
    
    public ForumRuleConf build(boolean param1Boolean) {
      return new ForumRuleConf(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
