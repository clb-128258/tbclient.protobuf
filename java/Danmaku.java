package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Danmaku extends Message {
  public static final List<FeedHeadSymbol> DEFAULT_MAIN_DATA = Collections.emptyList();
  
  @ProtoField(tag = 1)
  public final FeedHeadImg image_data;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedHeadSymbol> main_data;
  
  public Danmaku(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedHeadSymbol> list;
    if (paramBoolean == true) {
      this.image_data = paramBuilder.image_data;
      list = paramBuilder.main_data;
      if (list == null) {
        this.main_data = DEFAULT_MAIN_DATA;
      } else {
        this.main_data = Message.immutableCopyOf(list);
      } 
    } else {
      this.image_data = ((Builder)list).image_data;
      this.main_data = Message.immutableCopyOf(((Builder)list).main_data);
    } 
  }
  
  public static final class Builder extends Message.Builder<Danmaku> {
    public FeedHeadImg image_data;
    
    public List<FeedHeadSymbol> main_data;
    
    public Builder() {}
    
    public Builder(Danmaku param1Danmaku) {
      super(param1Danmaku);
      if (param1Danmaku == null)
        return; 
      this.image_data = param1Danmaku.image_data;
      this.main_data = Message.copyOf(param1Danmaku.main_data);
    }
    
    public Danmaku build(boolean param1Boolean) {
      return new Danmaku(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
