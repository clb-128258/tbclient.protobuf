package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class QueryBase extends Message {
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_QUERY = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String query;
  
  public QueryBase(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.query;
      if (str1 == null) {
        this.query = "";
      } else {
        this.query = str1;
      } 
      str1 = paramBuilder.jump_url;
      if (str1 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str1;
      } 
      str = paramBuilder.icon_url;
      if (str == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str;
      } 
    } else {
      this.query = ((Builder)str).query;
      this.jump_url = ((Builder)str).jump_url;
      this.icon_url = ((Builder)str).icon_url;
    } 
  }
  
  public static final class Builder extends Message.Builder<QueryBase> {
    public String icon_url;
    
    public String jump_url;
    
    public String query;
    
    public Builder() {}
    
    public Builder(QueryBase param1QueryBase) {
      super(param1QueryBase);
      if (param1QueryBase == null)
        return; 
      this.query = param1QueryBase.query;
      this.jump_url = param1QueryBase.jump_url;
      this.icon_url = param1QueryBase.icon_url;
    }
    
    public QueryBase build(boolean param1Boolean) {
      return new QueryBase(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
