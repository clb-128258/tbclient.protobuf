package tbclient.GetWebviewCacheInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static final Integer DEFAULT_FORCE_REPLACE;
  
  public static final String DEFAULT_MD5 = "";
  
  public static final List<Offpack> DEFAULT_OFFPACK_LIST = Collections.emptyList();
  
  public static final String DEFAULT_SRC = "";
  
  public static final String DEFAULT_WEBVIEW_VERSION = "";
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer force_replace;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String md5;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<Offpack> offpack_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String src;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String webview_version;
  
  static {
    DEFAULT_FORCE_REPLACE = Integer.valueOf(0);
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.src;
      if (str == null) {
        this.src = "";
      } else {
        this.src = str;
      } 
      str = paramBuilder.webview_version;
      if (str == null) {
        this.webview_version = "";
      } else {
        this.webview_version = str;
      } 
      str = paramBuilder.md5;
      if (str == null) {
        this.md5 = "";
      } else {
        this.md5 = str;
      } 
      List<Offpack> list = paramBuilder.offpack_list;
      if (list == null) {
        this.offpack_list = DEFAULT_OFFPACK_LIST;
      } else {
        this.offpack_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.force_replace;
      if (integer == null) {
        this.force_replace = DEFAULT_FORCE_REPLACE;
      } else {
        this.force_replace = integer;
      } 
    } else {
      this.src = ((Builder)integer).src;
      this.webview_version = ((Builder)integer).webview_version;
      this.md5 = ((Builder)integer).md5;
      this.offpack_list = Message.immutableCopyOf(((Builder)integer).offpack_list);
      this.force_replace = ((Builder)integer).force_replace;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Integer force_replace;
    
    public String md5;
    
    public List<Offpack> offpack_list;
    
    public String src;
    
    public String webview_version;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.src = param1DataRes.src;
      this.webview_version = param1DataRes.webview_version;
      this.md5 = param1DataRes.md5;
      this.offpack_list = Message.copyOf(param1DataRes.offpack_list);
      this.force_replace = param1DataRes.force_replace;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
