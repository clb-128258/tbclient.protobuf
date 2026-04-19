package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadAblum extends Message {
  public static final Integer DEFAULT_ID;
  
  public static final String DEFAULT_SOURCE = "";
  
  public static final String DEFAULT_SUB_SOURCE = "";
  
  public static final Long DEFAULT_TAB_ID;
  
  public static final String DEFAULT_THREAD_SORT_TEXT = "";
  
  public static final Long DEFAULT_TID;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String source;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String sub_source;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long tab_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String thread_sort_text;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ID = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_TAB_ID = long_;
    DEFAULT_TYPE = integer;
    DEFAULT_TID = long_;
  }
  
  public ThreadAblum(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.id;
      if (integer2 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer2;
      } 
      Long long_1 = paramBuilder.tab_id;
      if (long_1 == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = long_1;
      } 
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.source;
      if (str == null) {
        this.source = "";
      } else {
        this.source = str;
      } 
      str = paramBuilder.thread_sort_text;
      if (str == null) {
        this.thread_sort_text = "";
      } else {
        this.thread_sort_text = str;
      } 
      str = paramBuilder.sub_source;
      if (str == null) {
        this.sub_source = "";
      } else {
        this.sub_source = str;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
      Integer integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
    } else {
      this.id = ((Builder)long_).id;
      this.tab_id = ((Builder)long_).tab_id;
      this.title = ((Builder)long_).title;
      this.source = ((Builder)long_).source;
      this.thread_sort_text = ((Builder)long_).thread_sort_text;
      this.sub_source = ((Builder)long_).sub_source;
      this.url = ((Builder)long_).url;
      this.type = ((Builder)long_).type;
      this.tid = ((Builder)long_).tid;
    } 
  }
  
  public static final class Builder extends Message.Builder<ThreadAblum> {
    public Integer id;
    
    public String source;
    
    public String sub_source;
    
    public Long tab_id;
    
    public String thread_sort_text;
    
    public Long tid;
    
    public String title;
    
    public Integer type;
    
    public String url;
    
    public Builder() {}
    
    public Builder(ThreadAblum param1ThreadAblum) {
      super(param1ThreadAblum);
      if (param1ThreadAblum == null)
        return; 
      this.id = param1ThreadAblum.id;
      this.tab_id = param1ThreadAblum.tab_id;
      this.title = param1ThreadAblum.title;
      this.source = param1ThreadAblum.source;
      this.thread_sort_text = param1ThreadAblum.thread_sort_text;
      this.sub_source = param1ThreadAblum.sub_source;
      this.url = param1ThreadAblum.url;
      this.type = param1ThreadAblum.type;
      this.tid = param1ThreadAblum.tid;
    }
    
    public ThreadAblum build(boolean param1Boolean) {
      return new ThreadAblum(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
