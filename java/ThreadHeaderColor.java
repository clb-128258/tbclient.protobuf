package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadHeaderColor extends Message {
  @ProtoField(tag = 2)
  public final FeedContentColor end;
  
  @ProtoField(tag = 1)
  public final FeedContentColor start;
  
  public ThreadHeaderColor(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.start = paramBuilder.start;
      this.end = paramBuilder.end;
    } else {
      this.start = paramBuilder.start;
      this.end = paramBuilder.end;
    } 
  }
  
  public static final class Builder extends Message.Builder<ThreadHeaderColor> {
    public FeedContentColor end;
    
    public FeedContentColor start;
    
    public Builder() {}
    
    public Builder(ThreadHeaderColor param1ThreadHeaderColor) {
      super(param1ThreadHeaderColor);
      if (param1ThreadHeaderColor == null)
        return; 
      this.start = param1ThreadHeaderColor.start;
      this.end = param1ThreadHeaderColor.end;
    }
    
    public ThreadHeaderColor build(boolean param1Boolean) {
      return new ThreadHeaderColor(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
