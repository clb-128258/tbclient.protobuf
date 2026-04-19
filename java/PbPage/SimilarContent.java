package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.SimpleForum;
import tbclient.ThreadInfo;

public final class SimilarContent extends Message {
  public static final List<String> DEFAULT_SIMILAR_LABEL_LIST = Collections.emptyList();
  
  public static final String DEFAULT_SIMILAR_URL = "";
  
  public static final Integer DEFAULT_USER_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 5)
  public final SimpleForum similar_forum;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
  public final List<String> similar_label_list;
  
  @ProtoField(tag = 4)
  public final ThreadInfo similar_thread;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String similar_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer user_type;
  
  public SimilarContent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<String> list = paramBuilder.similar_label_list;
      if (list == null) {
        this.similar_label_list = DEFAULT_SIMILAR_LABEL_LIST;
      } else {
        this.similar_label_list = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.similar_url;
      if (str == null) {
        this.similar_url = "";
      } else {
        this.similar_url = str;
      } 
      Integer integer = paramBuilder.user_type;
      if (integer == null) {
        this.user_type = DEFAULT_USER_TYPE;
      } else {
        this.user_type = integer;
      } 
      this.similar_thread = paramBuilder.similar_thread;
      this.similar_forum = paramBuilder.similar_forum;
    } else {
      this.similar_label_list = Message.immutableCopyOf(paramBuilder.similar_label_list);
      this.similar_url = paramBuilder.similar_url;
      this.user_type = paramBuilder.user_type;
      this.similar_thread = paramBuilder.similar_thread;
      this.similar_forum = paramBuilder.similar_forum;
    } 
  }
  
  public static final class Builder extends Message.Builder<SimilarContent> {
    public SimpleForum similar_forum;
    
    public List<String> similar_label_list;
    
    public ThreadInfo similar_thread;
    
    public String similar_url;
    
    public Integer user_type;
    
    public Builder() {}
    
    public Builder(SimilarContent param1SimilarContent) {
      super(param1SimilarContent);
      if (param1SimilarContent == null)
        return; 
      this.similar_label_list = Message.copyOf(param1SimilarContent.similar_label_list);
      this.similar_url = param1SimilarContent.similar_url;
      this.user_type = param1SimilarContent.user_type;
      this.similar_thread = param1SimilarContent.similar_thread;
      this.similar_forum = param1SimilarContent.similar_forum;
    }
    
    public SimilarContent build(boolean param1Boolean) {
      return new SimilarContent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
