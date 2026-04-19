package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedInteractionLeft extends Message {
  public static final List<FeedHeadSymbol> DEFAULT_MAIN_DATA = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 1)
  public final FeedHeadImg image_data;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedHeadSymbol> main_data;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String schema;
  
  public FeedInteractionLeft(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.image_data = paramBuilder.image_data;
      List<FeedHeadSymbol> list = paramBuilder.main_data;
      if (list == null) {
        this.main_data = DEFAULT_MAIN_DATA;
      } else {
        this.main_data = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.image_data = ((Builder)str).image_data;
      this.main_data = Message.immutableCopyOf(((Builder)str).main_data);
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedInteractionLeft> {
    public FeedHeadImg image_data;
    
    public List<FeedHeadSymbol> main_data;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FeedInteractionLeft param1FeedInteractionLeft) {
      super(param1FeedInteractionLeft);
      if (param1FeedInteractionLeft == null)
        return; 
      this.image_data = param1FeedInteractionLeft.image_data;
      this.main_data = Message.copyOf(param1FeedInteractionLeft.main_data);
      this.schema = param1FeedInteractionLeft.schema;
    }
    
    public FeedInteractionLeft build(boolean param1Boolean) {
      return new FeedInteractionLeft(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
