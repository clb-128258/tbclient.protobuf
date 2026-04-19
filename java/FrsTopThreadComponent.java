package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FrsTopThreadComponent extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final List<FeedKV> DEFAULT_LOG_INFO;
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final List<FeedContentResource> DEFAULT_TITLE = Collections.emptyList();
  
  @ProtoField(tag = 3)
  public final FeedAuthorSocial author_social;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<FeedKV> business_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<FeedKV> log_info;
  
  @ProtoField(tag = 2)
  public final FeedPicAbstract pic_abstract;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedContentResource> title;
  
  static {
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
    DEFAULT_LOG_INFO = Collections.emptyList();
  }
  
  public FrsTopThreadComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      List<FeedContentResource> list2 = paramBuilder.title;
      if (list2 == null) {
        this.title = DEFAULT_TITLE;
      } else {
        this.title = Message.immutableCopyOf(list2);
      } 
      this.pic_abstract = paramBuilder.pic_abstract;
      this.author_social = paramBuilder.author_social;
      List<FeedKV> list1 = paramBuilder.business_info;
      if (list1 == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list1);
      } 
      String str = paramBuilder.scheme;
      if (str == null) {
        this.scheme = "";
      } else {
        this.scheme = str;
      } 
      list = paramBuilder.log_info;
      if (list == null) {
        this.log_info = DEFAULT_LOG_INFO;
      } else {
        this.log_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = Message.immutableCopyOf(((Builder)list).title);
      this.pic_abstract = ((Builder)list).pic_abstract;
      this.author_social = ((Builder)list).author_social;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
      this.scheme = ((Builder)list).scheme;
      this.log_info = Message.immutableCopyOf(((Builder)list).log_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<FrsTopThreadComponent> {
    public FeedAuthorSocial author_social;
    
    public List<FeedKV> business_info;
    
    public List<FeedKV> log_info;
    
    public FeedPicAbstract pic_abstract;
    
    public String scheme;
    
    public List<FeedContentResource> title;
    
    public Builder() {}
    
    public Builder(FrsTopThreadComponent param1FrsTopThreadComponent) {
      super(param1FrsTopThreadComponent);
      if (param1FrsTopThreadComponent == null)
        return; 
      this.title = Message.copyOf(param1FrsTopThreadComponent.title);
      this.pic_abstract = param1FrsTopThreadComponent.pic_abstract;
      this.author_social = param1FrsTopThreadComponent.author_social;
      this.business_info = Message.copyOf(param1FrsTopThreadComponent.business_info);
      this.scheme = param1FrsTopThreadComponent.scheme;
      this.log_info = Message.copyOf(param1FrsTopThreadComponent.log_info);
    }
    
    public FrsTopThreadComponent build(boolean param1Boolean) {
      return new FrsTopThreadComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
