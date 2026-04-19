package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BdtSearchInfo extends Message {
  public static final String DEFAULT_BDT_RESULT_CONTENT = "";
  
  public static final Integer DEFAULT_BDT_RESULT_STATUS;
  
  public static final String DEFAULT_BDT_SCHEMA = "";
  
  public static final String DEFAULT_BDT_THINK_CONTENT = "";
  
  public static final Integer DEFAULT_BDT_THREAD_NUM;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String bdt_result_content;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer bdt_result_status;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String bdt_schema;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String bdt_think_content;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer bdt_thread_num;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_BDT_THREAD_NUM = integer;
    DEFAULT_BDT_RESULT_STATUS = integer;
  }
  
  public BdtSearchInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.bdt_thread_num;
      if (integer2 == null) {
        this.bdt_thread_num = DEFAULT_BDT_THREAD_NUM;
      } else {
        this.bdt_thread_num = integer2;
      } 
      String str1 = paramBuilder.bdt_think_content;
      if (str1 == null) {
        this.bdt_think_content = "";
      } else {
        this.bdt_think_content = str1;
      } 
      str1 = paramBuilder.bdt_result_content;
      if (str1 == null) {
        this.bdt_result_content = "";
      } else {
        this.bdt_result_content = str1;
      } 
      Integer integer1 = paramBuilder.bdt_result_status;
      if (integer1 == null) {
        this.bdt_result_status = DEFAULT_BDT_RESULT_STATUS;
      } else {
        this.bdt_result_status = integer1;
      } 
      str = paramBuilder.bdt_schema;
      if (str == null) {
        this.bdt_schema = "";
      } else {
        this.bdt_schema = str;
      } 
    } else {
      this.bdt_thread_num = ((Builder)str).bdt_thread_num;
      this.bdt_think_content = ((Builder)str).bdt_think_content;
      this.bdt_result_content = ((Builder)str).bdt_result_content;
      this.bdt_result_status = ((Builder)str).bdt_result_status;
      this.bdt_schema = ((Builder)str).bdt_schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<BdtSearchInfo> {
    public String bdt_result_content;
    
    public Integer bdt_result_status;
    
    public String bdt_schema;
    
    public String bdt_think_content;
    
    public Integer bdt_thread_num;
    
    public Builder() {}
    
    public Builder(BdtSearchInfo param1BdtSearchInfo) {
      super(param1BdtSearchInfo);
      if (param1BdtSearchInfo == null)
        return; 
      this.bdt_thread_num = param1BdtSearchInfo.bdt_thread_num;
      this.bdt_think_content = param1BdtSearchInfo.bdt_think_content;
      this.bdt_result_content = param1BdtSearchInfo.bdt_result_content;
      this.bdt_result_status = param1BdtSearchInfo.bdt_result_status;
      this.bdt_schema = param1BdtSearchInfo.bdt_schema;
    }
    
    public BdtSearchInfo build(boolean param1Boolean) {
      return new BdtSearchInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
