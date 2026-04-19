package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedHeadButton extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer type;
  
  static {
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
  }
  
  public FeedHeadButton(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.type = ((Builder)list).type;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedHeadButton> {
    public List<FeedKV> business_info;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(FeedHeadButton param1FeedHeadButton) {
      super(param1FeedHeadButton);
      if (param1FeedHeadButton == null)
        return; 
      this.type = param1FeedHeadButton.type;
      this.business_info = Message.copyOf(param1FeedHeadButton.business_info);
    }
    
    public FeedHeadButton build(boolean param1Boolean) {
      return new FeedHeadButton(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
