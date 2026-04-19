package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TaskHorizontal extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final String DEFAULT_SECOND_CONTENT = "";
  
  public static final String DEFAULT_SECOND_SCHEME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String second_content;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String second_scheme;
  
  public TaskHorizontal(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.content;
      if (str1 == null) {
        this.content = "";
      } else {
        this.content = str1;
      } 
      str1 = paramBuilder.scheme;
      if (str1 == null) {
        this.scheme = "";
      } else {
        this.scheme = str1;
      } 
      str1 = paramBuilder.second_scheme;
      if (str1 == null) {
        this.second_scheme = "";
      } else {
        this.second_scheme = str1;
      } 
      str = paramBuilder.second_content;
      if (str == null) {
        this.second_content = "";
      } else {
        this.second_content = str;
      } 
    } else {
      this.content = ((Builder)str).content;
      this.scheme = ((Builder)str).scheme;
      this.second_scheme = ((Builder)str).second_scheme;
      this.second_content = ((Builder)str).second_content;
    } 
  }
  
  public static final class Builder extends Message.Builder<TaskHorizontal> {
    public String content;
    
    public String scheme;
    
    public String second_content;
    
    public String second_scheme;
    
    public Builder() {}
    
    public Builder(TaskHorizontal param1TaskHorizontal) {
      super(param1TaskHorizontal);
      if (param1TaskHorizontal == null)
        return; 
      this.content = param1TaskHorizontal.content;
      this.scheme = param1TaskHorizontal.scheme;
      this.second_scheme = param1TaskHorizontal.second_scheme;
      this.second_content = param1TaskHorizontal.second_content;
    }
    
    public TaskHorizontal build(boolean param1Boolean) {
      return new TaskHorizontal(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
