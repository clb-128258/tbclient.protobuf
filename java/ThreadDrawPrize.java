package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadDrawPrize extends Message {
  public static final String DEFAULT_ASSET = "";
  
  public static final Long DEFAULT_COUNT = Long.valueOf(0L);
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PIC = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String asset;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long count;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pic;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer type;
  
  public ThreadDrawPrize(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      str2 = paramBuilder.pic;
      if (str2 == null) {
        this.pic = "";
      } else {
        this.pic = str2;
      } 
      Long long_ = paramBuilder.count;
      if (long_ == null) {
        this.count = DEFAULT_COUNT;
      } else {
        this.count = long_;
      } 
      String str1 = paramBuilder.asset;
      if (str1 == null) {
        this.asset = "";
      } else {
        this.asset = str1;
      } 
      integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
    } else {
      this.name = ((Builder)integer).name;
      this.pic = ((Builder)integer).pic;
      this.count = ((Builder)integer).count;
      this.asset = ((Builder)integer).asset;
      this.type = ((Builder)integer).type;
    } 
  }
  
  public static final class Builder extends Message.Builder<ThreadDrawPrize> {
    public String asset;
    
    public Long count;
    
    public String name;
    
    public String pic;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(ThreadDrawPrize param1ThreadDrawPrize) {
      super(param1ThreadDrawPrize);
      if (param1ThreadDrawPrize == null)
        return; 
      this.name = param1ThreadDrawPrize.name;
      this.pic = param1ThreadDrawPrize.pic;
      this.count = param1ThreadDrawPrize.count;
      this.asset = param1ThreadDrawPrize.asset;
      this.type = param1ThreadDrawPrize.type;
    }
    
    public ThreadDrawPrize build(boolean param1Boolean) {
      return new ThreadDrawPrize(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
