package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedContentText extends Message {
  public static final Integer DEFAULT_FONT_WEIGHT = Integer.valueOf(0);
  
  public static final String DEFAULT_MARGIN_LEFT = "";
  
  public static final String DEFAULT_MARGIN_RIGHT = "";
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 3)
  public final FeedContentColor bg_color;
  
  @ProtoField(tag = 2)
  public final FeedContentColor color;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer font_weight;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String margin_left;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String margin_right;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  public FeedContentText(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      this.color = paramBuilder.color;
      this.bg_color = paramBuilder.bg_color;
      str = paramBuilder.margin_left;
      if (str == null) {
        this.margin_left = "";
      } else {
        this.margin_left = str;
      } 
      str = paramBuilder.margin_right;
      if (str == null) {
        this.margin_right = "";
      } else {
        this.margin_right = str;
      } 
      integer = paramBuilder.font_weight;
      if (integer == null) {
        this.font_weight = DEFAULT_FONT_WEIGHT;
      } else {
        this.font_weight = integer;
      } 
    } else {
      this.text = ((Builder)integer).text;
      this.color = ((Builder)integer).color;
      this.bg_color = ((Builder)integer).bg_color;
      this.margin_left = ((Builder)integer).margin_left;
      this.margin_right = ((Builder)integer).margin_right;
      this.font_weight = ((Builder)integer).font_weight;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedContentText> {
    public FeedContentColor bg_color;
    
    public FeedContentColor color;
    
    public Integer font_weight;
    
    public String margin_left;
    
    public String margin_right;
    
    public String text;
    
    public Builder() {}
    
    public Builder(FeedContentText param1FeedContentText) {
      super(param1FeedContentText);
      if (param1FeedContentText == null)
        return; 
      this.text = param1FeedContentText.text;
      this.color = param1FeedContentText.color;
      this.bg_color = param1FeedContentText.bg_color;
      this.margin_left = param1FeedContentText.margin_left;
      this.margin_right = param1FeedContentText.margin_right;
      this.font_weight = param1FeedContentText.font_weight;
    }
    
    public FeedContentText build(boolean param1Boolean) {
      return new FeedContentText(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
