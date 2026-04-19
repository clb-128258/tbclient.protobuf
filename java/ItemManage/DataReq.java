package tbclient.ItemManage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_GAME_ID = "";
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_RN;
  
  public static final Integer DEFAULT_TAB_ID;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String game_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer pn;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer rn;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer tab_id;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TAB_ID = integer;
    DEFAULT_PN = integer;
    DEFAULT_RN = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer = paramBuilder.tab_id;
      if (integer == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = integer;
      } 
      integer = paramBuilder.pn;
      if (integer == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer;
      } 
      integer = paramBuilder.rn;
      if (integer == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer;
      } 
      str = paramBuilder.game_id;
      if (str == null) {
        this.game_id = "";
      } else {
        this.game_id = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.tab_id = ((Builder)str).tab_id;
      this.pn = ((Builder)str).pn;
      this.rn = ((Builder)str).rn;
      this.game_id = ((Builder)str).game_id;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public String game_id;
    
    public Integer pn;
    
    public Integer rn;
    
    public Integer tab_id;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.tab_id = param1DataReq.tab_id;
      this.pn = param1DataReq.pn;
      this.rn = param1DataReq.rn;
      this.game_id = param1DataReq.game_id;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
