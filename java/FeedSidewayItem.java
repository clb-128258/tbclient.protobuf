package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedSidewayItem extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final List<FeedContentResource> DEFAULT_EXTRA_DATA;
  
  public static final List<FeedContentResource> DEFAULT_MAIN_DATA = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<FeedKV> business_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedContentResource> extra_data;
  
  @ProtoField(tag = 1)
  public final PicInfo image;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedContentResource> main_data;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  static {
    DEFAULT_EXTRA_DATA = Collections.emptyList();
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
  }
  
  public FeedSidewayItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      this.image = paramBuilder.image;
      List<FeedContentResource> list1 = paramBuilder.main_data;
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
      list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.image = ((Builder)list).image;
      this.main_data = Message.immutableCopyOf(((Builder)list).main_data);
      this.extra_data = Message.immutableCopyOf(((Builder)list).extra_data);
      this.schema = ((Builder)list).schema;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedSidewayItem> {
    public List<FeedKV> business_info;
    
    public List<FeedContentResource> extra_data;
    
    public PicInfo image;
    
    public List<FeedContentResource> main_data;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FeedSidewayItem param1FeedSidewayItem) {
      super(param1FeedSidewayItem);
      if (param1FeedSidewayItem == null)
        return; 
      this.image = param1FeedSidewayItem.image;
      this.main_data = Message.copyOf(param1FeedSidewayItem.main_data);
      this.extra_data = Message.copyOf(param1FeedSidewayItem.extra_data);
      this.schema = param1FeedSidewayItem.schema;
      this.business_info = Message.copyOf(param1FeedSidewayItem.business_info);
    }
    
    public FeedSidewayItem build(boolean param1Boolean) {
      return new FeedSidewayItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
