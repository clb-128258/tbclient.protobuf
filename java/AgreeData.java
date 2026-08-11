package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class AgreeData extends Message {
  public static final List<FeedContentIcon> DEFAULT_AGREE_LONG_CLICK_ANIMATION;
  
  public static final String DEFAULT_DEFAULT_TEXT = "";
  
  public static final Integer DEFAULT_IS_SELECTED;
  
  public static final Long DEFAULT_NUM = Long.valueOf(0L);
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final Integer DEFAULT_SUPPORT_LONG_CLICK;
  
  @ProtoField(tag = 6)
  public final FeedContentIcon agree_animation;
  
  @ProtoField(tag = 7)
  public final FeedContentIcon agree_assist_animation;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 10)
  public final List<FeedContentIcon> agree_long_click_animation;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String default_text;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_selected;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long num;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(tag = 5)
  public final FeedContentColor selected_text_color;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer support_long_click;
  
  @ProtoField(tag = 4)
  public final FeedContentColor text_color;
  
  static {
    DEFAULT_SUPPORT_LONG_CLICK = integer;
    DEFAULT_AGREE_LONG_CLICK_ANIMATION = Collections.emptyList();
  }
  
  public AgreeData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedContentIcon> list;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.is_selected;
      if (integer2 == null) {
        this.is_selected = DEFAULT_IS_SELECTED;
      } else {
        this.is_selected = integer2;
      } 
      Long long_ = paramBuilder.num;
      if (long_ == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = long_;
      } 
      String str2 = paramBuilder.default_text;
      if (str2 == null) {
        this.default_text = "";
      } else {
        this.default_text = str2;
      } 
      this.text_color = paramBuilder.text_color;
      this.selected_text_color = paramBuilder.selected_text_color;
      this.agree_animation = paramBuilder.agree_animation;
      this.agree_assist_animation = paramBuilder.agree_assist_animation;
      Integer integer1 = paramBuilder.support_long_click;
      if (integer1 == null) {
        this.support_long_click = DEFAULT_SUPPORT_LONG_CLICK;
      } else {
        this.support_long_click = integer1;
      } 
      String str1 = paramBuilder.scheme;
      if (str1 == null) {
        this.scheme = "";
      } else {
        this.scheme = str1;
      } 
      list = paramBuilder.agree_long_click_animation;
      if (list == null) {
        this.agree_long_click_animation = DEFAULT_AGREE_LONG_CLICK_ANIMATION;
      } else {
        this.agree_long_click_animation = Message.immutableCopyOf(list);
      } 
    } else {
      this.is_selected = ((Builder)list).is_selected;
      this.num = ((Builder)list).num;
      this.default_text = ((Builder)list).default_text;
      this.text_color = ((Builder)list).text_color;
      this.selected_text_color = ((Builder)list).selected_text_color;
      this.agree_animation = ((Builder)list).agree_animation;
      this.agree_assist_animation = ((Builder)list).agree_assist_animation;
      this.support_long_click = ((Builder)list).support_long_click;
      this.scheme = ((Builder)list).scheme;
      this.agree_long_click_animation = Message.immutableCopyOf(((Builder)list).agree_long_click_animation);
    } 
  }
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_SELECTED = integer;
  }
  
  public static final class Builder extends Message.Builder<AgreeData> {
    public FeedContentIcon agree_animation;
    
    public FeedContentIcon agree_assist_animation;
    
    public List<FeedContentIcon> agree_long_click_animation;
    
    public String default_text;
    
    public Integer is_selected;
    
    public Long num;
    
    public String scheme;
    
    public FeedContentColor selected_text_color;
    
    public Integer support_long_click;
    
    public FeedContentColor text_color;
    
    public Builder() {}
    
    public Builder(AgreeData param1AgreeData) {
      super(param1AgreeData);
      if (param1AgreeData == null)
        return; 
      this.is_selected = param1AgreeData.is_selected;
      this.num = param1AgreeData.num;
      this.default_text = param1AgreeData.default_text;
      this.text_color = param1AgreeData.text_color;
      this.selected_text_color = param1AgreeData.selected_text_color;
      this.agree_animation = param1AgreeData.agree_animation;
      this.agree_assist_animation = param1AgreeData.agree_assist_animation;
      this.support_long_click = param1AgreeData.support_long_click;
      this.scheme = param1AgreeData.scheme;
      this.agree_long_click_animation = Message.copyOf(param1AgreeData.agree_long_click_animation);
    }
    
    public AgreeData build(boolean param1Boolean) {
      return new AgreeData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
