package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThumbnailInfo extends Message {
  public static final Integer DEFAULT_HEIGHT;
  
  public static final String DEFAULT_URL = "";
  
  public static final Integer DEFAULT_WIDTH;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer height;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer width;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_WIDTH = integer;
    DEFAULT_HEIGHT = integer;
  }
  
  public ThumbnailInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
      Integer integer1 = paramBuilder.width;
      if (integer1 == null) {
        this.width = DEFAULT_WIDTH;
      } else {
        this.width = integer1;
      } 
      integer = paramBuilder.height;
      if (integer == null) {
        this.height = DEFAULT_HEIGHT;
      } else {
        this.height = integer;
      } 
    } else {
      this.url = ((Builder)integer).url;
      this.width = ((Builder)integer).width;
      this.height = ((Builder)integer).height;
    } 
  }
  
  public static final class Builder extends Message.Builder<ThumbnailInfo> {
    public Integer height;
    
    public String url;
    
    public Integer width;
    
    public Builder() {}
    
    public Builder(ThumbnailInfo param1ThumbnailInfo) {
      super(param1ThumbnailInfo);
      if (param1ThumbnailInfo == null)
        return; 
      this.url = param1ThumbnailInfo.url;
      this.width = param1ThumbnailInfo.width;
      this.height = param1ThumbnailInfo.height;
    }
    
    public ThumbnailInfo build(boolean param1Boolean) {
      return new ThumbnailInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
