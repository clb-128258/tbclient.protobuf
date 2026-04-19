package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedHeadFigureComponent extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final List<FeedHeadSymbol> DEFAULT_EXTRA_DATA;
  
  public static final List<FeedHeadSymbol> DEFAULT_MAIN_DATA = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 5)
  public final CustomState custom_state;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedHeadSymbol> extra_data;
  
  @ProtoField(tag = 1)
  public final FeedHeadFigure image_data;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedHeadSymbol> main_data;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  static {
    DEFAULT_EXTRA_DATA = Collections.emptyList();
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
  }
  
  public FeedHeadFigureComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
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
      this.custom_state = paramBuilder.custom_state;
      list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.image_data = ((Builder)list).image_data;
      this.main_data = Message.immutableCopyOf(((Builder)list).main_data);
      this.extra_data = Message.immutableCopyOf(((Builder)list).extra_data);
      this.schema = ((Builder)list).schema;
      this.custom_state = ((Builder)list).custom_state;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedHeadFigureComponent> {
    public List<FeedKV> business_info;
    
    public CustomState custom_state;
    
    public List<FeedHeadSymbol> extra_data;
    
    public FeedHeadFigure image_data;
    
    public List<FeedHeadSymbol> main_data;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FeedHeadFigureComponent param1FeedHeadFigureComponent) {
      super(param1FeedHeadFigureComponent);
      if (param1FeedHeadFigureComponent == null)
        return; 
      this.image_data = param1FeedHeadFigureComponent.image_data;
      this.main_data = Message.copyOf(param1FeedHeadFigureComponent.main_data);
      this.extra_data = Message.copyOf(param1FeedHeadFigureComponent.extra_data);
      this.schema = param1FeedHeadFigureComponent.schema;
      this.custom_state = param1FeedHeadFigureComponent.custom_state;
      this.business_info = Message.copyOf(param1FeedHeadFigureComponent.business_info);
    }
    
    public FeedHeadFigureComponent build(boolean param1Boolean) {
      return new FeedHeadFigureComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
