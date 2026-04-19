package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class LoopAvatarWithBtnComponent extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final List<String> DEFAULT_IMG_URLS = Collections.emptyList();
  
  @ProtoField(tag = 3)
  public final FeedButton button;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
  public final List<String> img_urls;
  
  public LoopAvatarWithBtnComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<String> list = paramBuilder.img_urls;
      if (list == null) {
        this.img_urls = DEFAULT_IMG_URLS;
      } else {
        this.img_urls = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
      this.button = paramBuilder.button;
    } else {
      this.img_urls = Message.immutableCopyOf(paramBuilder.img_urls);
      this.content = paramBuilder.content;
      this.button = paramBuilder.button;
    } 
  }
  
  public static final class Builder extends Message.Builder<LoopAvatarWithBtnComponent> {
    public FeedButton button;
    
    public String content;
    
    public List<String> img_urls;
    
    public Builder() {}
    
    public Builder(LoopAvatarWithBtnComponent param1LoopAvatarWithBtnComponent) {
      super(param1LoopAvatarWithBtnComponent);
      if (param1LoopAvatarWithBtnComponent == null)
        return; 
      this.img_urls = Message.copyOf(param1LoopAvatarWithBtnComponent.img_urls);
      this.content = param1LoopAvatarWithBtnComponent.content;
      this.button = param1LoopAvatarWithBtnComponent.button;
    }
    
    public LoopAvatarWithBtnComponent build(boolean param1Boolean) {
      return new LoopAvatarWithBtnComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
