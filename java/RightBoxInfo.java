package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RightBoxInfo extends Message {
  public static final List<FeedContentResource> DEFAULT_DATA = Collections.emptyList();
  
  public static final String DEFAULT_FONT_SIZE = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedContentResource> data;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String font_size;
  
  public RightBoxInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<FeedContentResource> list = paramBuilder.data;
      if (list == null) {
        this.data = DEFAULT_DATA;
      } else {
        this.data = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.font_size;
      if (str == null) {
        this.font_size = "";
      } else {
        this.font_size = str;
      } 
    } else {
      this.data = Message.immutableCopyOf(((Builder)str).data);
      this.font_size = ((Builder)str).font_size;
    } 
  }
  
  public static final class Builder extends Message.Builder<RightBoxInfo> {
    public List<FeedContentResource> data;
    
    public String font_size;
    
    public Builder() {}
    
    public Builder(RightBoxInfo param1RightBoxInfo) {
      super(param1RightBoxInfo);
      if (param1RightBoxInfo == null)
        return; 
      this.data = Message.copyOf(param1RightBoxInfo.data);
      this.font_size = param1RightBoxInfo.font_size;
    }
    
    public RightBoxInfo build(boolean param1Boolean) {
      return new RightBoxInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
