package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedContentGradiantColorSymbol extends Message {
  public static final String DEFAULT_GRADIANT = "";
  
  @ProtoField(tag = 1)
  public final FeedContentColor color;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String gradiant;
  
  public FeedContentGradiantColorSymbol(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.color = paramBuilder.color;
      str = paramBuilder.gradiant;
      if (str == null) {
        this.gradiant = "";
      } else {
        this.gradiant = str;
      } 
    } else {
      this.color = ((Builder)str).color;
      this.gradiant = ((Builder)str).gradiant;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedContentGradiantColorSymbol> {
    public FeedContentColor color;
    
    public String gradiant;
    
    public Builder() {}
    
    public Builder(FeedContentGradiantColorSymbol param1FeedContentGradiantColorSymbol) {
      super(param1FeedContentGradiantColorSymbol);
      if (param1FeedContentGradiantColorSymbol == null)
        return; 
      this.color = param1FeedContentGradiantColorSymbol.color;
      this.gradiant = param1FeedContentGradiantColorSymbol.gradiant;
    }
    
    public FeedContentGradiantColorSymbol build(boolean param1Boolean) {
      return new FeedContentGradiantColorSymbol(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
