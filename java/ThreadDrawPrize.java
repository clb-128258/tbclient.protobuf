package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadDrawPrize extends Message {
  public static final String DEFAULT_ASSET = "";
  
  public static final Long DEFAULT_COUNT = Long.valueOf(0L);
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PIC = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String asset;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long count;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pic;
  
  public ThreadDrawPrize(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.pic;
      if (str1 == null) {
        this.pic = "";
      } else {
        this.pic = str1;
      } 
      Long long_ = paramBuilder.count;
      if (long_ == null) {
        this.count = DEFAULT_COUNT;
      } else {
        this.count = long_;
      } 
      str = paramBuilder.asset;
      if (str == null) {
        this.asset = "";
      } else {
        this.asset = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.pic = ((Builder)str).pic;
      this.count = ((Builder)str).count;
      this.asset = ((Builder)str).asset;
    } 
  }
  
  public static final class Builder extends Message.Builder<ThreadDrawPrize> {
    public String asset;
    
    public Long count;
    
    public String name;
    
    public String pic;
    
    public Builder() {}
    
    public Builder(ThreadDrawPrize param1ThreadDrawPrize) {
      super(param1ThreadDrawPrize);
      if (param1ThreadDrawPrize == null)
        return; 
      this.name = param1ThreadDrawPrize.name;
      this.pic = param1ThreadDrawPrize.pic;
      this.count = param1ThreadDrawPrize.count;
      this.asset = param1ThreadDrawPrize.asset;
    }
    
    public ThreadDrawPrize build(boolean param1Boolean) {
      return new ThreadDrawPrize(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
