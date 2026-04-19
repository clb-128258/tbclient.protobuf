package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedDownloadComponent extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final List<FeedContentResource> DEFAULT_DESC;
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final List<FeedContentResource> DEFAULT_SUB_DESC;
  
  public static final List<FeedContentResource> DEFAULT_TITLE = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 5)
  public final FeedHeadButton button;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedContentResource> desc;
  
  @ProtoField(tag = 1)
  public final FeedContentIcon icon;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<FeedContentResource> sub_desc;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedContentResource> title;
  
  static {
    DEFAULT_DESC = Collections.emptyList();
    DEFAULT_SUB_DESC = Collections.emptyList();
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
  }
  
  public FeedDownloadComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      this.icon = paramBuilder.icon;
      List<FeedContentResource> list1 = paramBuilder.title;
      if (list1 == null) {
        this.title = DEFAULT_TITLE;
      } else {
        this.title = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.desc;
      if (list1 == null) {
        this.desc = DEFAULT_DESC;
      } else {
        this.desc = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.sub_desc;
      if (list1 == null) {
        this.sub_desc = DEFAULT_SUB_DESC;
      } else {
        this.sub_desc = Message.immutableCopyOf(list1);
      } 
      this.button = paramBuilder.button;
      String str = paramBuilder.schema;
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
      this.icon = ((Builder)list).icon;
      this.title = Message.immutableCopyOf(((Builder)list).title);
      this.desc = Message.immutableCopyOf(((Builder)list).desc);
      this.sub_desc = Message.immutableCopyOf(((Builder)list).sub_desc);
      this.button = ((Builder)list).button;
      this.schema = ((Builder)list).schema;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedDownloadComponent> {
    public List<FeedKV> business_info;
    
    public FeedHeadButton button;
    
    public List<FeedContentResource> desc;
    
    public FeedContentIcon icon;
    
    public String schema;
    
    public List<FeedContentResource> sub_desc;
    
    public List<FeedContentResource> title;
    
    public Builder() {}
    
    public Builder(FeedDownloadComponent param1FeedDownloadComponent) {
      super(param1FeedDownloadComponent);
      if (param1FeedDownloadComponent == null)
        return; 
      this.icon = param1FeedDownloadComponent.icon;
      this.title = Message.copyOf(param1FeedDownloadComponent.title);
      this.desc = Message.copyOf(param1FeedDownloadComponent.desc);
      this.sub_desc = Message.copyOf(param1FeedDownloadComponent.sub_desc);
      this.button = param1FeedDownloadComponent.button;
      this.schema = param1FeedDownloadComponent.schema;
      this.business_info = Message.copyOf(param1FeedDownloadComponent.business_info);
    }
    
    public FeedDownloadComponent build(boolean param1Boolean) {
      return new FeedDownloadComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
