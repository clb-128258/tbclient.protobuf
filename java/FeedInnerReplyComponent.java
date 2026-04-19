package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedInnerReplyComponent extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final List<FeedHeadSymbol> DEFAULT_MAIN_DATA = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 3)
  public final Agree agree;
  
  @ProtoField(tag = 1)
  public final FeedHeadImg avatar;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedHeadSymbol> main_data;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String schema;
  
  static {
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
  }
  
  public FeedInnerReplyComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      this.avatar = paramBuilder.avatar;
      List<FeedHeadSymbol> list1 = paramBuilder.main_data;
      if (list1 == null) {
        this.main_data = DEFAULT_MAIN_DATA;
      } else {
        this.main_data = Message.immutableCopyOf(list1);
      } 
      this.agree = paramBuilder.agree;
      String str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.avatar = ((Builder)list).avatar;
      this.main_data = Message.immutableCopyOf(((Builder)list).main_data);
      this.agree = ((Builder)list).agree;
      this.content = ((Builder)list).content;
      this.schema = ((Builder)list).schema;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedInnerReplyComponent> {
    public Agree agree;
    
    public FeedHeadImg avatar;
    
    public List<FeedKV> business_info;
    
    public String content;
    
    public List<FeedHeadSymbol> main_data;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FeedInnerReplyComponent param1FeedInnerReplyComponent) {
      super(param1FeedInnerReplyComponent);
      if (param1FeedInnerReplyComponent == null)
        return; 
      this.avatar = param1FeedInnerReplyComponent.avatar;
      this.main_data = Message.copyOf(param1FeedInnerReplyComponent.main_data);
      this.agree = param1FeedInnerReplyComponent.agree;
      this.content = param1FeedInnerReplyComponent.content;
      this.schema = param1FeedInnerReplyComponent.schema;
      this.business_info = Message.copyOf(param1FeedInnerReplyComponent.business_info);
    }
    
    public FeedInnerReplyComponent build(boolean param1Boolean) {
      return new FeedInnerReplyComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
