package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TagsInfo extends Message {
  @ProtoField(tag = 1)
  public final ThemeColorInfo img_info;
  
  public TagsInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.img_info = paramBuilder.img_info;
    } else {
      this.img_info = paramBuilder.img_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<TagsInfo> {
    public ThemeColorInfo img_info;
    
    public Builder() {}
    
    public Builder(TagsInfo param1TagsInfo) {
      super(param1TagsInfo);
      if (param1TagsInfo == null)
        return; 
      this.img_info = param1TagsInfo.img_info;
    }
    
    public TagsInfo build(boolean param1Boolean) {
      return new TagsInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
