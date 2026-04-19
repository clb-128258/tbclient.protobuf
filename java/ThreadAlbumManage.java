package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadAlbumManage extends Message {
  public static final Integer DEFAULT_CAN_ADD = Integer.valueOf(0);
  
  public static final String DEFAULT_TOAST = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer can_add;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String toast;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public ThreadAlbumManage(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.can_add;
      if (integer == null) {
        this.can_add = DEFAULT_CAN_ADD;
      } else {
        this.can_add = integer;
      } 
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.toast;
      if (str == null) {
        this.toast = "";
      } else {
        this.toast = str;
      } 
    } else {
      this.can_add = ((Builder)str).can_add;
      this.url = ((Builder)str).url;
      this.toast = ((Builder)str).toast;
    } 
  }
  
  public static final class Builder extends Message.Builder<ThreadAlbumManage> {
    public Integer can_add;
    
    public String toast;
    
    public String url;
    
    public Builder() {}
    
    public Builder(ThreadAlbumManage param1ThreadAlbumManage) {
      super(param1ThreadAlbumManage);
      if (param1ThreadAlbumManage == null)
        return; 
      this.can_add = param1ThreadAlbumManage.can_add;
      this.url = param1ThreadAlbumManage.url;
      this.toast = param1ThreadAlbumManage.toast;
    }
    
    public ThreadAlbumManage build(boolean param1Boolean) {
      return new ThreadAlbumManage(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
