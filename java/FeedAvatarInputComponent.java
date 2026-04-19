package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedAvatarInputComponent extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final List<LayoutManageInfo> DEFAULT_MANAGE_LIST = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final String DEFAULT_TIP_TEXT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<LayoutManageInfo> manage_list;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 3)
  public final IconUrlInfo send_icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tip_text;
  
  public FeedAvatarInputComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.avatar;
      if (str1 == null) {
        this.avatar = "";
      } else {
        this.avatar = str1;
      } 
      str1 = paramBuilder.tip_text;
      if (str1 == null) {
        this.tip_text = "";
      } else {
        this.tip_text = str1;
      } 
      this.send_icon = paramBuilder.send_icon;
      List<LayoutManageInfo> list = paramBuilder.manage_list;
      if (list == null) {
        this.manage_list = DEFAULT_MANAGE_LIST;
      } else {
        this.manage_list = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.avatar = ((Builder)str).avatar;
      this.tip_text = ((Builder)str).tip_text;
      this.send_icon = ((Builder)str).send_icon;
      this.manage_list = Message.immutableCopyOf(((Builder)str).manage_list);
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedAvatarInputComponent> {
    public String avatar;
    
    public List<LayoutManageInfo> manage_list;
    
    public String schema;
    
    public IconUrlInfo send_icon;
    
    public String tip_text;
    
    public Builder() {}
    
    public Builder(FeedAvatarInputComponent param1FeedAvatarInputComponent) {
      super(param1FeedAvatarInputComponent);
      if (param1FeedAvatarInputComponent == null)
        return; 
      this.avatar = param1FeedAvatarInputComponent.avatar;
      this.tip_text = param1FeedAvatarInputComponent.tip_text;
      this.send_icon = param1FeedAvatarInputComponent.send_icon;
      this.manage_list = Message.copyOf(param1FeedAvatarInputComponent.manage_list);
      this.schema = param1FeedAvatarInputComponent.schema;
    }
    
    public FeedAvatarInputComponent build(boolean param1Boolean) {
      return new FeedAvatarInputComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
