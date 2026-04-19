package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedHeadFigure extends Message {
  public static final String DEFAULT_BG_TYPE = "";
  
  public static final String DEFAULT_BG_VALUE = "";
  
  public static final String DEFAULT_CORNER_URL = "";
  
  public static final String DEFAULT_IMG_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String bg_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String bg_value;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String corner_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_url;
  
  public FeedHeadFigure(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.img_url;
      if (str1 == null) {
        this.img_url = "";
      } else {
        this.img_url = str1;
      } 
      str1 = paramBuilder.bg_type;
      if (str1 == null) {
        this.bg_type = "";
      } else {
        this.bg_type = str1;
      } 
      str1 = paramBuilder.bg_value;
      if (str1 == null) {
        this.bg_value = "";
      } else {
        this.bg_value = str1;
      } 
      str = paramBuilder.corner_url;
      if (str == null) {
        this.corner_url = "";
      } else {
        this.corner_url = str;
      } 
    } else {
      this.img_url = ((Builder)str).img_url;
      this.bg_type = ((Builder)str).bg_type;
      this.bg_value = ((Builder)str).bg_value;
      this.corner_url = ((Builder)str).corner_url;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedHeadFigure> {
    public String bg_type;
    
    public String bg_value;
    
    public String corner_url;
    
    public String img_url;
    
    public Builder() {}
    
    public Builder(FeedHeadFigure param1FeedHeadFigure) {
      super(param1FeedHeadFigure);
      if (param1FeedHeadFigure == null)
        return; 
      this.img_url = param1FeedHeadFigure.img_url;
      this.bg_type = param1FeedHeadFigure.bg_type;
      this.bg_value = param1FeedHeadFigure.bg_value;
      this.corner_url = param1FeedHeadFigure.corner_url;
    }
    
    public FeedHeadFigure build(boolean param1Boolean) {
      return new FeedHeadFigure(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
