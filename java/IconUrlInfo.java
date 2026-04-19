package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class IconUrlInfo extends Message {
  public static final String DEFAULT_DARK = "";
  
  public static final String DEFAULT_DAY = "";
  
  public static final String DEFAULT_NIGHT = "";
  
  public static final Integer DEFAULT_NUM = Integer.valueOf(0);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String dark;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String day;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String night;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer num;
  
  public IconUrlInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.day;
      if (str == null) {
        this.day = "";
      } else {
        this.day = str;
      } 
      str = paramBuilder.night;
      if (str == null) {
        this.night = "";
      } else {
        this.night = str;
      } 
      str = paramBuilder.dark;
      if (str == null) {
        this.dark = "";
      } else {
        this.dark = str;
      } 
      integer = paramBuilder.num;
      if (integer == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer;
      } 
    } else {
      this.day = ((Builder)integer).day;
      this.night = ((Builder)integer).night;
      this.dark = ((Builder)integer).dark;
      this.num = ((Builder)integer).num;
    } 
  }
  
  public static final class Builder extends Message.Builder<IconUrlInfo> {
    public String dark;
    
    public String day;
    
    public String night;
    
    public Integer num;
    
    public Builder() {}
    
    public Builder(IconUrlInfo param1IconUrlInfo) {
      super(param1IconUrlInfo);
      if (param1IconUrlInfo == null)
        return; 
      this.day = param1IconUrlInfo.day;
      this.night = param1IconUrlInfo.night;
      this.dark = param1IconUrlInfo.dark;
      this.num = param1IconUrlInfo.num;
    }
    
    public IconUrlInfo build(boolean param1Boolean) {
      return new IconUrlInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
