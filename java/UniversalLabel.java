package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UniversalLabel extends Message {
  public static final String DEFAULT_BACKGROUND_COLOR = "";
  
  public static final String DEFAULT_BACKGROUND_COLOR_BLACK = "";
  
  public static final String DEFAULT_LABEL_ID = "";
  
  public static final String DEFAULT_LABEL_TEXT = "";
  
  public static final Integer DEFAULT_ROUND_RADIUS = Integer.valueOf(0);
  
  public static final String DEFAULT_TEXT_COLOR = "";
  
  public static final String DEFAULT_TEXT_COLOR_BLACK = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String background_color;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String background_color_black;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String label_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String label_text;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer round_radius;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String text_color;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String text_color_black;
  
  public UniversalLabel(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.label_id;
      if (str == null) {
        this.label_id = "";
      } else {
        this.label_id = str;
      } 
      str = paramBuilder.label_text;
      if (str == null) {
        this.label_text = "";
      } else {
        this.label_text = str;
      } 
      str = paramBuilder.text_color;
      if (str == null) {
        this.text_color = "";
      } else {
        this.text_color = str;
      } 
      str = paramBuilder.text_color_black;
      if (str == null) {
        this.text_color_black = "";
      } else {
        this.text_color_black = str;
      } 
      str = paramBuilder.background_color;
      if (str == null) {
        this.background_color = "";
      } else {
        this.background_color = str;
      } 
      str = paramBuilder.background_color_black;
      if (str == null) {
        this.background_color_black = "";
      } else {
        this.background_color_black = str;
      } 
      integer = paramBuilder.round_radius;
      if (integer == null) {
        this.round_radius = DEFAULT_ROUND_RADIUS;
      } else {
        this.round_radius = integer;
      } 
    } else {
      this.label_id = ((Builder)integer).label_id;
      this.label_text = ((Builder)integer).label_text;
      this.text_color = ((Builder)integer).text_color;
      this.text_color_black = ((Builder)integer).text_color_black;
      this.background_color = ((Builder)integer).background_color;
      this.background_color_black = ((Builder)integer).background_color_black;
      this.round_radius = ((Builder)integer).round_radius;
    } 
  }
  
  public static final class Builder extends Message.Builder<UniversalLabel> {
    public String background_color;
    
    public String background_color_black;
    
    public String label_id;
    
    public String label_text;
    
    public Integer round_radius;
    
    public String text_color;
    
    public String text_color_black;
    
    public Builder() {}
    
    public Builder(UniversalLabel param1UniversalLabel) {
      super(param1UniversalLabel);
      if (param1UniversalLabel == null)
        return; 
      this.label_id = param1UniversalLabel.label_id;
      this.label_text = param1UniversalLabel.label_text;
      this.text_color = param1UniversalLabel.text_color;
      this.text_color_black = param1UniversalLabel.text_color_black;
      this.background_color = param1UniversalLabel.background_color;
      this.background_color_black = param1UniversalLabel.background_color_black;
      this.round_radius = param1UniversalLabel.round_radius;
    }
    
    public UniversalLabel build(boolean param1Boolean) {
      return new UniversalLabel(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
