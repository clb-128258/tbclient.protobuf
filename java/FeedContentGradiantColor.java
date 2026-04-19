package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedContentGradiantColor extends Message {
  public static final List<FeedContentGradiantColorSymbol> DEFAULT_COLORS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedContentGradiantColorSymbol> colors;
  
  public FeedContentGradiantColor(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedContentGradiantColorSymbol> list;
    if (paramBoolean == true) {
      list = paramBuilder.colors;
      if (list == null) {
        this.colors = DEFAULT_COLORS;
      } else {
        this.colors = Message.immutableCopyOf(list);
      } 
    } else {
      this.colors = Message.immutableCopyOf(((Builder)list).colors);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedContentGradiantColor> {
    public List<FeedContentGradiantColorSymbol> colors;
    
    public Builder() {}
    
    public Builder(FeedContentGradiantColor param1FeedContentGradiantColor) {
      super(param1FeedContentGradiantColor);
      if (param1FeedContentGradiantColor == null)
        return; 
      this.colors = Message.copyOf(param1FeedContentGradiantColor.colors);
    }
    
    public FeedContentGradiantColor build(boolean param1Boolean) {
      return new FeedContentGradiantColor(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
