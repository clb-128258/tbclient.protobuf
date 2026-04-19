package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class BottomGameBar extends Message {
  public static final List<FeedContentResource> DEFAULT_DESC = Collections.emptyList();
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final List<FeedContentResource> DEFAULT_SUB_DESC = Collections.emptyList();
  
  public static final List<FeedContentResource> DEFAULT_TITLE = Collections.emptyList();
  
  @ProtoField(tag = 4)
  public final FeedHeadButton button;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedContentResource> desc;
  
  @ProtoField(tag = 6)
  public final FeedContentIcon icon;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedContentResource> sub_desc;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedContentResource> title;
  
  static {
    DEFAULT_LOG_PARAM = Collections.emptyList();
  }
  
  public BottomGameBar(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      List<FeedContentResource> list1 = paramBuilder.desc;
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
      list1 = paramBuilder.title;
      if (list1 == null) {
        this.title = DEFAULT_TITLE;
      } else {
        this.title = Message.immutableCopyOf(list1);
      } 
      this.button = paramBuilder.button;
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      this.icon = paramBuilder.icon;
      list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
    } else {
      this.desc = Message.immutableCopyOf(((Builder)list).desc);
      this.sub_desc = Message.immutableCopyOf(((Builder)list).sub_desc);
      this.title = Message.immutableCopyOf(((Builder)list).title);
      this.button = ((Builder)list).button;
      this.schema = ((Builder)list).schema;
      this.icon = ((Builder)list).icon;
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
    } 
  }
  
  public static final class Builder extends Message.Builder<BottomGameBar> {
    public FeedHeadButton button;
    
    public List<FeedContentResource> desc;
    
    public FeedContentIcon icon;
    
    public List<FeedKV> log_param;
    
    public String schema;
    
    public List<FeedContentResource> sub_desc;
    
    public List<FeedContentResource> title;
    
    public Builder() {}
    
    public Builder(BottomGameBar param1BottomGameBar) {
      super(param1BottomGameBar);
      if (param1BottomGameBar == null)
        return; 
      this.desc = Message.copyOf(param1BottomGameBar.desc);
      this.sub_desc = Message.copyOf(param1BottomGameBar.sub_desc);
      this.title = Message.copyOf(param1BottomGameBar.title);
      this.button = param1BottomGameBar.button;
      this.schema = param1BottomGameBar.schema;
      this.icon = param1BottomGameBar.icon;
      this.log_param = Message.copyOf(param1BottomGameBar.log_param);
    }
    
    public BottomGameBar build(boolean param1Boolean) {
      return new BottomGameBar(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
