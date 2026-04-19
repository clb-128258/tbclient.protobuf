package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedHeadComponent extends Message {
  public static final List<FeedHeadSymbol> DEFAULT_ALT_EXTRA_DATA;
  
  public static final List<FeedHeadSymbol> DEFAULT_EXTRA_DATA;
  
  public static final List<FeedHeadSymbol> DEFAULT_MAIN_DATA = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<FeedHeadSymbol> alt_extra_data;
  
  @ProtoField(tag = 5)
  public final FeedHeadButton button;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedHeadSymbol> extra_data;
  
  @ProtoField(tag = 1)
  public final FeedHeadImg image_data;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedHeadSymbol> main_data;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  static {
    DEFAULT_EXTRA_DATA = Collections.emptyList();
    DEFAULT_ALT_EXTRA_DATA = Collections.emptyList();
  }
  
  public FeedHeadComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedHeadSymbol> list;
    if (paramBoolean == true) {
      this.image_data = paramBuilder.image_data;
      List<FeedHeadSymbol> list1 = paramBuilder.main_data;
      if (list1 == null) {
        this.main_data = DEFAULT_MAIN_DATA;
      } else {
        this.main_data = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.extra_data;
      if (list1 == null) {
        this.extra_data = DEFAULT_EXTRA_DATA;
      } else {
        this.extra_data = Message.immutableCopyOf(list1);
      } 
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      this.button = paramBuilder.button;
      list = paramBuilder.alt_extra_data;
      if (list == null) {
        this.alt_extra_data = DEFAULT_ALT_EXTRA_DATA;
      } else {
        this.alt_extra_data = Message.immutableCopyOf(list);
      } 
    } else {
      this.image_data = ((Builder)list).image_data;
      this.main_data = Message.immutableCopyOf(((Builder)list).main_data);
      this.extra_data = Message.immutableCopyOf(((Builder)list).extra_data);
      this.schema = ((Builder)list).schema;
      this.button = ((Builder)list).button;
      this.alt_extra_data = Message.immutableCopyOf(((Builder)list).alt_extra_data);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedHeadComponent> {
    public List<FeedHeadSymbol> alt_extra_data;
    
    public FeedHeadButton button;
    
    public List<FeedHeadSymbol> extra_data;
    
    public FeedHeadImg image_data;
    
    public List<FeedHeadSymbol> main_data;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FeedHeadComponent param1FeedHeadComponent) {
      super(param1FeedHeadComponent);
      if (param1FeedHeadComponent == null)
        return; 
      this.image_data = param1FeedHeadComponent.image_data;
      this.main_data = Message.copyOf(param1FeedHeadComponent.main_data);
      this.extra_data = Message.copyOf(param1FeedHeadComponent.extra_data);
      this.schema = param1FeedHeadComponent.schema;
      this.button = param1FeedHeadComponent.button;
      this.alt_extra_data = Message.copyOf(param1FeedHeadComponent.alt_extra_data);
    }
    
    public FeedHeadComponent build(boolean param1Boolean) {
      return new FeedHeadComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
