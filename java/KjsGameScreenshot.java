package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class KjsGameScreenshot extends Message {
  public static final Integer DEFAULT_HAS_MORE = Integer.valueOf(0);
  
  public static final List<String> DEFAULT_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer has_more;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
  public final List<String> list;
  
  public KjsGameScreenshot(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.has_more;
      if (integer == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer;
      } 
      list = paramBuilder.list;
      if (list == null) {
        this.list = DEFAULT_LIST;
      } else {
        this.list = Message.immutableCopyOf(list);
      } 
    } else {
      this.has_more = ((Builder)list).has_more;
      this.list = Message.immutableCopyOf(((Builder)list).list);
    } 
  }
  
  public static final class Builder extends Message.Builder<KjsGameScreenshot> {
    public Integer has_more;
    
    public List<String> list;
    
    public Builder() {}
    
    public Builder(KjsGameScreenshot param1KjsGameScreenshot) {
      super(param1KjsGameScreenshot);
      if (param1KjsGameScreenshot == null)
        return; 
      this.has_more = param1KjsGameScreenshot.has_more;
      this.list = Message.copyOf(param1KjsGameScreenshot.list);
    }
    
    public KjsGameScreenshot build(boolean param1Boolean) {
      return new KjsGameScreenshot(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
