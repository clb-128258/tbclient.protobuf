package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedInteractionRightData extends Message {
  public static final List<FeedContentResource> DEFAULT_TEXT;
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 2)
  public final Agree agree;
  
  @ProtoField(tag = 4)
  public final Comment comment;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedContentResource> text;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer type;
  
  static {
    DEFAULT_TEXT = Collections.emptyList();
  }
  
  public FeedInteractionRightData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      this.agree = paramBuilder.agree;
      List<FeedContentResource> list = paramBuilder.text;
      if (list == null) {
        this.text = DEFAULT_TEXT;
      } else {
        this.text = Message.immutableCopyOf(list);
      } 
      this.comment = paramBuilder.comment;
    } else {
      this.type = paramBuilder.type;
      this.agree = paramBuilder.agree;
      this.text = Message.immutableCopyOf(paramBuilder.text);
      this.comment = paramBuilder.comment;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedInteractionRightData> {
    public Agree agree;
    
    public Comment comment;
    
    public List<FeedContentResource> text;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(FeedInteractionRightData param1FeedInteractionRightData) {
      super(param1FeedInteractionRightData);
      if (param1FeedInteractionRightData == null)
        return; 
      this.type = param1FeedInteractionRightData.type;
      this.agree = param1FeedInteractionRightData.agree;
      this.text = Message.copyOf(param1FeedInteractionRightData.text);
      this.comment = param1FeedInteractionRightData.comment;
    }
    
    public FeedInteractionRightData build(boolean param1Boolean) {
      return new FeedInteractionRightData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
