package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedLinkVoiceRoomComponent extends Message {
  public static final Integer DEFAULT_CAN_ENTER;
  
  public static final String DEFAULT_CONTENT1 = "";
  
  public static final String DEFAULT_CONTENT2 = "";
  
  public static final List<FeedContentResource> DEFAULT_DEL_TEXT;
  
  public static final String DEFAULT_RIGHT_CONTENT = "";
  
  public static final List<String> DEFAULT_RIGHT_IMGS;
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_URL_TYPE;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer can_enter;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String content1;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String content2;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 11)
  public final List<FeedContentResource> del_text;
  
  @ProtoField(tag = 2)
  public final FeedContentIcon icon_url;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String right_content;
  
  @ProtoField(tag = 9)
  public final FeedContentIcon right_icon;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7, type = Message.Datatype.STRING)
  public final List<String> right_imgs;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer url_type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_URL_TYPE = integer;
    DEFAULT_RIGHT_IMGS = Collections.emptyList();
    DEFAULT_CAN_ENTER = integer;
    DEFAULT_DEL_TEXT = Collections.emptyList();
  }
  
  public FeedLinkVoiceRoomComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedContentResource> list;
    if (paramBoolean == true) {
      String str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      this.icon_url = paramBuilder.icon_url;
      str3 = paramBuilder.schema;
      if (str3 == null) {
        this.schema = "";
      } else {
        this.schema = str3;
      } 
      Integer integer2 = paramBuilder.url_type;
      if (integer2 == null) {
        this.url_type = DEFAULT_URL_TYPE;
      } else {
        this.url_type = integer2;
      } 
      String str2 = paramBuilder.content1;
      if (str2 == null) {
        this.content1 = "";
      } else {
        this.content1 = str2;
      } 
      str2 = paramBuilder.content2;
      if (str2 == null) {
        this.content2 = "";
      } else {
        this.content2 = str2;
      } 
      List<String> list1 = paramBuilder.right_imgs;
      if (list1 == null) {
        this.right_imgs = DEFAULT_RIGHT_IMGS;
      } else {
        this.right_imgs = Message.immutableCopyOf(list1);
      } 
      String str1 = paramBuilder.right_content;
      if (str1 == null) {
        this.right_content = "";
      } else {
        this.right_content = str1;
      } 
      this.right_icon = paramBuilder.right_icon;
      Integer integer1 = paramBuilder.can_enter;
      if (integer1 == null) {
        this.can_enter = DEFAULT_CAN_ENTER;
      } else {
        this.can_enter = integer1;
      } 
      list = paramBuilder.del_text;
      if (list == null) {
        this.del_text = DEFAULT_DEL_TEXT;
      } else {
        this.del_text = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = ((Builder)list).title;
      this.icon_url = ((Builder)list).icon_url;
      this.schema = ((Builder)list).schema;
      this.url_type = ((Builder)list).url_type;
      this.content1 = ((Builder)list).content1;
      this.content2 = ((Builder)list).content2;
      this.right_imgs = Message.immutableCopyOf(((Builder)list).right_imgs);
      this.right_content = ((Builder)list).right_content;
      this.right_icon = ((Builder)list).right_icon;
      this.can_enter = ((Builder)list).can_enter;
      this.del_text = Message.immutableCopyOf(((Builder)list).del_text);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedLinkVoiceRoomComponent> {
    public Integer can_enter;
    
    public String content1;
    
    public String content2;
    
    public List<FeedContentResource> del_text;
    
    public FeedContentIcon icon_url;
    
    public String right_content;
    
    public FeedContentIcon right_icon;
    
    public List<String> right_imgs;
    
    public String schema;
    
    public String title;
    
    public Integer url_type;
    
    public Builder() {}
    
    public Builder(FeedLinkVoiceRoomComponent param1FeedLinkVoiceRoomComponent) {
      super(param1FeedLinkVoiceRoomComponent);
      if (param1FeedLinkVoiceRoomComponent == null)
        return; 
      this.title = param1FeedLinkVoiceRoomComponent.title;
      this.icon_url = param1FeedLinkVoiceRoomComponent.icon_url;
      this.schema = param1FeedLinkVoiceRoomComponent.schema;
      this.url_type = param1FeedLinkVoiceRoomComponent.url_type;
      this.content1 = param1FeedLinkVoiceRoomComponent.content1;
      this.content2 = param1FeedLinkVoiceRoomComponent.content2;
      this.right_imgs = Message.copyOf(param1FeedLinkVoiceRoomComponent.right_imgs);
      this.right_content = param1FeedLinkVoiceRoomComponent.right_content;
      this.right_icon = param1FeedLinkVoiceRoomComponent.right_icon;
      this.can_enter = param1FeedLinkVoiceRoomComponent.can_enter;
      this.del_text = Message.copyOf(param1FeedLinkVoiceRoomComponent.del_text);
    }
    
    public FeedLinkVoiceRoomComponent build(boolean param1Boolean) {
      return new FeedLinkVoiceRoomComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
