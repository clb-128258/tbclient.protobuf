package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TopLiveDataPostList extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_NICKNAME = "";
  
  public static final String DEFAULT_SEQ_ID = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String nickname;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String seq_id;
  
  public TopLiveDataPostList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.nickname;
      if (str1 == null) {
        this.nickname = "";
      } else {
        this.nickname = str1;
      } 
      str1 = paramBuilder.content;
      if (str1 == null) {
        this.content = "";
      } else {
        this.content = str1;
      } 
      str = paramBuilder.seq_id;
      if (str == null) {
        this.seq_id = "";
      } else {
        this.seq_id = str;
      } 
    } else {
      this.nickname = ((Builder)str).nickname;
      this.content = ((Builder)str).content;
      this.seq_id = ((Builder)str).seq_id;
    } 
  }
  
  public static final class Builder extends Message.Builder<TopLiveDataPostList> {
    public String content;
    
    public String nickname;
    
    public String seq_id;
    
    public Builder() {}
    
    public Builder(TopLiveDataPostList param1TopLiveDataPostList) {
      super(param1TopLiveDataPostList);
      if (param1TopLiveDataPostList == null)
        return; 
      this.nickname = param1TopLiveDataPostList.nickname;
      this.content = param1TopLiveDataPostList.content;
      this.seq_id = param1TopLiveDataPostList.seq_id;
    }
    
    public TopLiveDataPostList build(boolean param1Boolean) {
      return new TopLiveDataPostList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
