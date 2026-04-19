package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedInputGuideComponent extends Message {
  public static final List<FeedContentResource> DEFAULT_LEFT_TEXT = Collections.emptyList();
  
  public static final List<LayoutManageInfo> DEFAULT_MANAGE_LIST;
  
  public static final List<FeedContentResource> DEFAULT_MID_TEXT = Collections.emptyList();
  
  public static final List<FeedContentResource> DEFAULT_RIGHT_TEXT = Collections.emptyList();
  
  public static final String DEFAULT_SCHEME = "";
  
  @ProtoField(tag = 7)
  public final FeedContentColor background;
  
  @ProtoField(tag = 1)
  public final FeedContentIcon left_icon;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedContentResource> left_text;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 9)
  public final List<LayoutManageInfo> manage_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<FeedContentResource> mid_text;
  
  @ProtoField(tag = 5)
  public final FeedContentIcon right_icon;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<FeedContentResource> right_text;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(tag = 3)
  public final FeedContentIcon strip;
  
  static {
    DEFAULT_MANAGE_LIST = Collections.emptyList();
  }
  
  public FeedInputGuideComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<LayoutManageInfo> list;
    if (paramBoolean == true) {
      this.left_icon = paramBuilder.left_icon;
      List<FeedContentResource> list1 = paramBuilder.left_text;
      if (list1 == null) {
        this.left_text = DEFAULT_LEFT_TEXT;
      } else {
        this.left_text = Message.immutableCopyOf(list1);
      } 
      this.strip = paramBuilder.strip;
      list1 = paramBuilder.mid_text;
      if (list1 == null) {
        this.mid_text = DEFAULT_MID_TEXT;
      } else {
        this.mid_text = Message.immutableCopyOf(list1);
      } 
      this.right_icon = paramBuilder.right_icon;
      list1 = paramBuilder.right_text;
      if (list1 == null) {
        this.right_text = DEFAULT_RIGHT_TEXT;
      } else {
        this.right_text = Message.immutableCopyOf(list1);
      } 
      this.background = paramBuilder.background;
      String str = paramBuilder.scheme;
      if (str == null) {
        this.scheme = "";
      } else {
        this.scheme = str;
      } 
      list = paramBuilder.manage_list;
      if (list == null) {
        this.manage_list = DEFAULT_MANAGE_LIST;
      } else {
        this.manage_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.left_icon = ((Builder)list).left_icon;
      this.left_text = Message.immutableCopyOf(((Builder)list).left_text);
      this.strip = ((Builder)list).strip;
      this.mid_text = Message.immutableCopyOf(((Builder)list).mid_text);
      this.right_icon = ((Builder)list).right_icon;
      this.right_text = Message.immutableCopyOf(((Builder)list).right_text);
      this.background = ((Builder)list).background;
      this.scheme = ((Builder)list).scheme;
      this.manage_list = Message.immutableCopyOf(((Builder)list).manage_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedInputGuideComponent> {
    public FeedContentColor background;
    
    public FeedContentIcon left_icon;
    
    public List<FeedContentResource> left_text;
    
    public List<LayoutManageInfo> manage_list;
    
    public List<FeedContentResource> mid_text;
    
    public FeedContentIcon right_icon;
    
    public List<FeedContentResource> right_text;
    
    public String scheme;
    
    public FeedContentIcon strip;
    
    public Builder() {}
    
    public Builder(FeedInputGuideComponent param1FeedInputGuideComponent) {
      super(param1FeedInputGuideComponent);
      if (param1FeedInputGuideComponent == null)
        return; 
      this.left_icon = param1FeedInputGuideComponent.left_icon;
      this.left_text = Message.copyOf(param1FeedInputGuideComponent.left_text);
      this.strip = param1FeedInputGuideComponent.strip;
      this.mid_text = Message.copyOf(param1FeedInputGuideComponent.mid_text);
      this.right_icon = param1FeedInputGuideComponent.right_icon;
      this.right_text = Message.copyOf(param1FeedInputGuideComponent.right_text);
      this.background = param1FeedInputGuideComponent.background;
      this.scheme = param1FeedInputGuideComponent.scheme;
      this.manage_list = Message.copyOf(param1FeedInputGuideComponent.manage_list);
    }
    
    public FeedInputGuideComponent build(boolean param1Boolean) {
      return new FeedInputGuideComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
