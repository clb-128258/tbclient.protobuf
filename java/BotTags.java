package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class BotTags extends Message {
  public static final List<BotTagInfo> DEFAULT_TAG_INFO = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<BotTagInfo> tag_info;
  
  public BotTags(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<BotTagInfo> list;
    if (paramBoolean == true) {
      list = paramBuilder.tag_info;
      if (list == null) {
        this.tag_info = DEFAULT_TAG_INFO;
      } else {
        this.tag_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.tag_info = Message.immutableCopyOf(((Builder)list).tag_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<BotTags> {
    public List<BotTagInfo> tag_info;
    
    public Builder() {}
    
    public Builder(BotTags param1BotTags) {
      super(param1BotTags);
      if (param1BotTags == null)
        return; 
      this.tag_info = Message.copyOf(param1BotTags.tag_info);
    }
    
    public BotTags build(boolean param1Boolean) {
      return new BotTags(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
