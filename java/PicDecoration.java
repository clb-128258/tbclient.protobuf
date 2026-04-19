package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class PicDecoration extends Message {
  public static final List<FeedKV> DEFAULT_DECORATION_INFO = Collections.emptyList();
  
  public static final String DEFAULT_LOCATION = "";
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedKV> decoration_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String location;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  public PicDecoration(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      String str = paramBuilder.location;
      if (str == null) {
        this.location = "";
      } else {
        this.location = str;
      } 
      str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      list = paramBuilder.decoration_info;
      if (list == null) {
        this.decoration_info = DEFAULT_DECORATION_INFO;
      } else {
        this.decoration_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.location = ((Builder)list).location;
      this.name = ((Builder)list).name;
      this.decoration_info = Message.immutableCopyOf(((Builder)list).decoration_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<PicDecoration> {
    public List<FeedKV> decoration_info;
    
    public String location;
    
    public String name;
    
    public Builder() {}
    
    public Builder(PicDecoration param1PicDecoration) {
      super(param1PicDecoration);
      if (param1PicDecoration == null)
        return; 
      this.location = param1PicDecoration.location;
      this.name = param1PicDecoration.name;
      this.decoration_info = Message.copyOf(param1PicDecoration.decoration_info);
    }
    
    public PicDecoration build(boolean param1Boolean) {
      return new PicDecoration(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
