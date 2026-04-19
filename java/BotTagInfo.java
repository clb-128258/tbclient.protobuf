package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BotTagInfo extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_HEIGHT = "";
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final Integer DEFAULT_SUB_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_WIDTH = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String height;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer sub_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String width;
  
  public BotTagInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.sub_type;
      if (integer == null) {
        this.sub_type = DEFAULT_SUB_TYPE;
      } else {
        this.sub_type = integer;
      } 
      String str1 = paramBuilder.content;
      if (str1 == null) {
        this.content = "";
      } else {
        this.content = str1;
      } 
      str1 = paramBuilder.img_url;
      if (str1 == null) {
        this.img_url = "";
      } else {
        this.img_url = str1;
      } 
      str1 = paramBuilder.width;
      if (str1 == null) {
        this.width = "";
      } else {
        this.width = str1;
      } 
      str = paramBuilder.height;
      if (str == null) {
        this.height = "";
      } else {
        this.height = str;
      } 
    } else {
      this.sub_type = ((Builder)str).sub_type;
      this.content = ((Builder)str).content;
      this.img_url = ((Builder)str).img_url;
      this.width = ((Builder)str).width;
      this.height = ((Builder)str).height;
    } 
  }
  
  public static final class Builder extends Message.Builder<BotTagInfo> {
    public String content;
    
    public String height;
    
    public String img_url;
    
    public Integer sub_type;
    
    public String width;
    
    public Builder() {}
    
    public Builder(BotTagInfo param1BotTagInfo) {
      super(param1BotTagInfo);
      if (param1BotTagInfo == null)
        return; 
      this.sub_type = param1BotTagInfo.sub_type;
      this.content = param1BotTagInfo.content;
      this.img_url = param1BotTagInfo.img_url;
      this.width = param1BotTagInfo.width;
      this.height = param1BotTagInfo.height;
    }
    
    public BotTagInfo build(boolean param1Boolean) {
      return new BotTagInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
