package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SuggestQuery extends Message {
  @ProtoField(tag = 2)
  public final QueryInfo rela_querys;
  
  @ProtoField(tag = 1)
  public final QueryInfo sub_querys;
  
  public SuggestQuery(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.sub_querys = paramBuilder.sub_querys;
      this.rela_querys = paramBuilder.rela_querys;
    } else {
      this.sub_querys = paramBuilder.sub_querys;
      this.rela_querys = paramBuilder.rela_querys;
    } 
  }
  
  public static final class Builder extends Message.Builder<SuggestQuery> {
    public QueryInfo rela_querys;
    
    public QueryInfo sub_querys;
    
    public Builder() {}
    
    public Builder(SuggestQuery param1SuggestQuery) {
      super(param1SuggestQuery);
      if (param1SuggestQuery == null)
        return; 
      this.sub_querys = param1SuggestQuery.sub_querys;
      this.rela_querys = param1SuggestQuery.rela_querys;
    }
    
    public SuggestQuery build(boolean param1Boolean) {
      return new SuggestQuery(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
