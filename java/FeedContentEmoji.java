package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedContentEmoji extends Message {
  public static final String DEFAULT_C = "";
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String c;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  public FeedContentEmoji(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.c;
      if (str == null) {
        this.c = "";
      } else {
        this.c = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.c = ((Builder)str).c;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedContentEmoji> {
    public String c;
    
    public String name;
    
    public Builder() {}
    
    public Builder(FeedContentEmoji param1FeedContentEmoji) {
      super(param1FeedContentEmoji);
      if (param1FeedContentEmoji == null)
        return; 
      this.name = param1FeedContentEmoji.name;
      this.c = param1FeedContentEmoji.c;
    }
    
    public FeedContentEmoji build(boolean param1Boolean) {
      return new FeedContentEmoji(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
