package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FrsTopThreadsList extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final List<ComponentFactory> DEFAULT_COMPONENTS = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedKV> business_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ComponentFactory> components;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String schema;
  
  static {
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
  }
  
  public FrsTopThreadsList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<ComponentFactory> list1 = paramBuilder.components;
      if (list1 == null) {
        this.components = DEFAULT_COMPONENTS;
      } else {
        this.components = Message.immutableCopyOf(list1);
      } 
      List<FeedKV> list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.components = Message.immutableCopyOf(((Builder)str).components);
      this.business_info = Message.immutableCopyOf(((Builder)str).business_info);
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<FrsTopThreadsList> {
    public List<FeedKV> business_info;
    
    public List<ComponentFactory> components;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FrsTopThreadsList param1FrsTopThreadsList) {
      super(param1FrsTopThreadsList);
      if (param1FrsTopThreadsList == null)
        return; 
      this.components = Message.copyOf(param1FrsTopThreadsList.components);
      this.business_info = Message.copyOf(param1FrsTopThreadsList.business_info);
      this.schema = param1FrsTopThreadsList.schema;
    }
    
    public FrsTopThreadsList build(boolean param1Boolean) {
      return new FrsTopThreadsList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
