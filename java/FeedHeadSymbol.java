package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedHeadSymbol extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final List<FeedKV> DEFAULT_LOG_INFO;
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 6)
  public final FeedContentCustom custom;
  
  @ProtoField(tag = 1)
  public final FeedHeadIcon icon;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<FeedKV> log_info;
  
  @ProtoField(tag = 7)
  public final FeedHeadIcon prefix_icon;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 3)
  public final FeedHeadText text;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer type;
  
  static {
    DEFAULT_LOG_INFO = Collections.emptyList();
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
  }
  
  public FeedHeadSymbol(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      this.icon = paramBuilder.icon;
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      this.text = paramBuilder.text;
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      List<FeedKV> list1 = paramBuilder.log_info;
      if (list1 == null) {
        this.log_info = DEFAULT_LOG_INFO;
      } else {
        this.log_info = Message.immutableCopyOf(list1);
      } 
      this.custom = paramBuilder.custom;
      this.prefix_icon = paramBuilder.prefix_icon;
      list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.icon = ((Builder)list).icon;
      this.type = ((Builder)list).type;
      this.text = ((Builder)list).text;
      this.schema = ((Builder)list).schema;
      this.log_info = Message.immutableCopyOf(((Builder)list).log_info);
      this.custom = ((Builder)list).custom;
      this.prefix_icon = ((Builder)list).prefix_icon;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedHeadSymbol> {
    public List<FeedKV> business_info;
    
    public FeedContentCustom custom;
    
    public FeedHeadIcon icon;
    
    public List<FeedKV> log_info;
    
    public FeedHeadIcon prefix_icon;
    
    public String schema;
    
    public FeedHeadText text;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(FeedHeadSymbol param1FeedHeadSymbol) {
      super(param1FeedHeadSymbol);
      if (param1FeedHeadSymbol == null)
        return; 
      this.icon = param1FeedHeadSymbol.icon;
      this.type = param1FeedHeadSymbol.type;
      this.text = param1FeedHeadSymbol.text;
      this.schema = param1FeedHeadSymbol.schema;
      this.log_info = Message.copyOf(param1FeedHeadSymbol.log_info);
      this.custom = param1FeedHeadSymbol.custom;
      this.prefix_icon = param1FeedHeadSymbol.prefix_icon;
      this.business_info = Message.copyOf(param1FeedHeadSymbol.business_info);
    }
    
    public FeedHeadSymbol build(boolean param1Boolean) {
      return new FeedHeadSymbol(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
