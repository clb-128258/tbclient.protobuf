package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadRecommendTag extends Message {
  public static final String DEFAULT_TEXT = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 3)
  public final ThemeColorInfo background_color;
  
  @ProtoField(tag = 4)
  public final ThemeColorInfo boundary_color;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 2)
  public final ThemeColorInfo text_color;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer type;
  
  public ThreadRecommendTag(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      this.text_color = paramBuilder.text_color;
      this.background_color = paramBuilder.background_color;
      this.boundary_color = paramBuilder.boundary_color;
      integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
    } else {
      this.text = ((Builder)integer).text;
      this.text_color = ((Builder)integer).text_color;
      this.background_color = ((Builder)integer).background_color;
      this.boundary_color = ((Builder)integer).boundary_color;
      this.type = ((Builder)integer).type;
    } 
  }
  
  public static final class Builder extends Message.Builder<ThreadRecommendTag> {
    public ThemeColorInfo background_color;
    
    public ThemeColorInfo boundary_color;
    
    public String text;
    
    public ThemeColorInfo text_color;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(ThreadRecommendTag param1ThreadRecommendTag) {
      super(param1ThreadRecommendTag);
      if (param1ThreadRecommendTag == null)
        return; 
      this.text = param1ThreadRecommendTag.text;
      this.text_color = param1ThreadRecommendTag.text_color;
      this.background_color = param1ThreadRecommendTag.background_color;
      this.boundary_color = param1ThreadRecommendTag.boundary_color;
      this.type = param1ThreadRecommendTag.type;
    }
    
    public ThreadRecommendTag build(boolean param1Boolean) {
      return new ThreadRecommendTag(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
