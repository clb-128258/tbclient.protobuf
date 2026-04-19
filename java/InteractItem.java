package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class InteractItem extends Message {
  public static final String DEFAULT_DEFAULT_TEXT = "";
  
  public static final Integer DEFAULT_IS_SELECTED;
  
  public static final Long DEFAULT_NUM = Long.valueOf(0L);
  
  public static final String DEFAULT_SCHEME = "";
  
  @ProtoField(tag = 1)
  public final FeedContentIcon default_icon_resource;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String default_text;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer is_selected;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long num;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(tag = 5)
  public final FeedContentIcon selected_icon_resource;
  
  @ProtoField(tag = 11)
  public final FeedContentColor selected_text_color;
  
  @ProtoField(tag = 10)
  public final FeedContentColor text_color;
  
  static {
    DEFAULT_IS_SELECTED = Integer.valueOf(0);
  }
  
  public InteractItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.default_icon_resource = paramBuilder.default_icon_resource;
      Long long_ = paramBuilder.num;
      if (long_ == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = long_;
      } 
      String str1 = paramBuilder.scheme;
      if (str1 == null) {
        this.scheme = "";
      } else {
        this.scheme = str1;
      } 
      this.selected_icon_resource = paramBuilder.selected_icon_resource;
      Integer integer = paramBuilder.is_selected;
      if (integer == null) {
        this.is_selected = DEFAULT_IS_SELECTED;
      } else {
        this.is_selected = integer;
      } 
      this.text_color = paramBuilder.text_color;
      this.selected_text_color = paramBuilder.selected_text_color;
      str = paramBuilder.default_text;
      if (str == null) {
        this.default_text = "";
      } else {
        this.default_text = str;
      } 
    } else {
      this.default_icon_resource = ((Builder)str).default_icon_resource;
      this.num = ((Builder)str).num;
      this.scheme = ((Builder)str).scheme;
      this.selected_icon_resource = ((Builder)str).selected_icon_resource;
      this.is_selected = ((Builder)str).is_selected;
      this.text_color = ((Builder)str).text_color;
      this.selected_text_color = ((Builder)str).selected_text_color;
      this.default_text = ((Builder)str).default_text;
    } 
  }
  
  public static final class Builder extends Message.Builder<InteractItem> {
    public FeedContentIcon default_icon_resource;
    
    public String default_text;
    
    public Integer is_selected;
    
    public Long num;
    
    public String scheme;
    
    public FeedContentIcon selected_icon_resource;
    
    public FeedContentColor selected_text_color;
    
    public FeedContentColor text_color;
    
    public Builder() {}
    
    public Builder(InteractItem param1InteractItem) {
      super(param1InteractItem);
      if (param1InteractItem == null)
        return; 
      this.default_icon_resource = param1InteractItem.default_icon_resource;
      this.num = param1InteractItem.num;
      this.scheme = param1InteractItem.scheme;
      this.selected_icon_resource = param1InteractItem.selected_icon_resource;
      this.is_selected = param1InteractItem.is_selected;
      this.text_color = param1InteractItem.text_color;
      this.selected_text_color = param1InteractItem.selected_text_color;
      this.default_text = param1InteractItem.default_text;
    }
    
    public InteractItem build(boolean param1Boolean) {
      return new InteractItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
