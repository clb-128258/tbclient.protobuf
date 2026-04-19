package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LayoutManageInfo extends Message {
  public static final String DEFAULT_EXT = "";
  
  public static final String DEFAULT_TEXT = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String ext;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer type;
  
  public LayoutManageInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      str = paramBuilder.ext;
      if (str == null) {
        this.ext = "";
      } else {
        this.ext = str;
      } 
    } else {
      this.text = ((Builder)str).text;
      this.type = ((Builder)str).type;
      this.ext = ((Builder)str).ext;
    } 
  }
  
  public static final class Builder extends Message.Builder<LayoutManageInfo> {
    public String ext;
    
    public String text;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(LayoutManageInfo param1LayoutManageInfo) {
      super(param1LayoutManageInfo);
      if (param1LayoutManageInfo == null)
        return; 
      this.text = param1LayoutManageInfo.text;
      this.type = param1LayoutManageInfo.type;
      this.ext = param1LayoutManageInfo.ext;
    }
    
    public LayoutManageInfo build(boolean param1Boolean) {
      return new LayoutManageInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
