package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class QueryInfo extends Message {
  public static final Integer DEFAULT_INSERT_POS;
  
  public static final List<QueryBase> DEFAULT_QUERYS = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer insert_pos;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<QueryBase> querys;
  
  static {
    DEFAULT_INSERT_POS = Integer.valueOf(0);
  }
  
  public QueryInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<QueryBase> list = paramBuilder.querys;
      if (list == null) {
        this.querys = DEFAULT_QUERYS;
      } else {
        this.querys = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.insert_pos;
      if (integer == null) {
        this.insert_pos = DEFAULT_INSERT_POS;
      } else {
        this.insert_pos = integer;
      } 
    } else {
      this.querys = Message.immutableCopyOf(((Builder)integer).querys);
      this.insert_pos = ((Builder)integer).insert_pos;
    } 
  }
  
  public static final class Builder extends Message.Builder<QueryInfo> {
    public Integer insert_pos;
    
    public List<QueryBase> querys;
    
    public Builder() {}
    
    public Builder(QueryInfo param1QueryInfo) {
      super(param1QueryInfo);
      if (param1QueryInfo == null)
        return; 
      this.querys = Message.copyOf(param1QueryInfo.querys);
      this.insert_pos = param1QueryInfo.insert_pos;
    }
    
    public QueryInfo build(boolean param1Boolean) {
      return new QueryInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
