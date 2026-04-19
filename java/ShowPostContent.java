package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ShowPostContent extends Message {
  public static final Long DEFAULT_POST_ID;
  
  public static final Integer DEFAULT_PTYPE;
  
  public static final List<PbContent> DEFAULT_TEXT;
  
  public static final Integer DEFAULT_TYPE;
  
  public static final Long DEFAULT_USER_ID;
  
  public static final String DEFAULT_USER_SHOW_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer ptype;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<PbContent> text;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long user_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String user_show_name;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_POST_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_TEXT = Collections.emptyList();
    DEFAULT_USER_ID = long_;
    DEFAULT_PTYPE = integer;
  }
  
  public ShowPostContent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.post_id;
      if (long_2 == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_2;
      } 
      Integer integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      List<PbContent> list = paramBuilder.text;
      if (list == null) {
        this.text = DEFAULT_TEXT;
      } else {
        this.text = Message.immutableCopyOf(list);
      } 
      Long long_1 = paramBuilder.user_id;
      if (long_1 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_1;
      } 
      String str = paramBuilder.user_show_name;
      if (str == null) {
        this.user_show_name = "";
      } else {
        this.user_show_name = str;
      } 
      integer = paramBuilder.ptype;
      if (integer == null) {
        this.ptype = DEFAULT_PTYPE;
      } else {
        this.ptype = integer;
      } 
    } else {
      this.post_id = ((Builder)integer).post_id;
      this.type = ((Builder)integer).type;
      this.text = Message.immutableCopyOf(((Builder)integer).text);
      this.user_id = ((Builder)integer).user_id;
      this.user_show_name = ((Builder)integer).user_show_name;
      this.ptype = ((Builder)integer).ptype;
    } 
  }
  
  public static final class Builder extends Message.Builder<ShowPostContent> {
    public Long post_id;
    
    public Integer ptype;
    
    public List<PbContent> text;
    
    public Integer type;
    
    public Long user_id;
    
    public String user_show_name;
    
    public Builder() {}
    
    public Builder(ShowPostContent param1ShowPostContent) {
      super(param1ShowPostContent);
      if (param1ShowPostContent == null)
        return; 
      this.post_id = param1ShowPostContent.post_id;
      this.type = param1ShowPostContent.type;
      this.text = Message.copyOf(param1ShowPostContent.text);
      this.user_id = param1ShowPostContent.user_id;
      this.user_show_name = param1ShowPostContent.user_show_name;
      this.ptype = param1ShowPostContent.ptype;
    }
    
    public ShowPostContent build(boolean param1Boolean) {
      return new ShowPostContent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
