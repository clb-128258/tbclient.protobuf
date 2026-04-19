package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedContentIcon extends Message {
  public static final String DEFAULT_DAY_URL = "";
  
  public static final Integer DEFAULT_HEIGHT;
  
  public static final String DEFAULT_MARGIN_LEFT = "";
  
  public static final String DEFAULT_MARGIN_RIGHT = "";
  
  public static final String DEFAULT_NIGHT_URL = "";
  
  public static final Integer DEFAULT_WIDTH;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String day_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer height;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String margin_left;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String margin_right;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String night_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer width;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_WIDTH = integer;
    DEFAULT_HEIGHT = integer;
  }
  
  public FeedContentIcon(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.day_url;
      if (str2 == null) {
        this.day_url = "";
      } else {
        this.day_url = str2;
      } 
      str2 = paramBuilder.night_url;
      if (str2 == null) {
        this.night_url = "";
      } else {
        this.night_url = str2;
      } 
      Integer integer = paramBuilder.width;
      if (integer == null) {
        this.width = DEFAULT_WIDTH;
      } else {
        this.width = integer;
      } 
      integer = paramBuilder.height;
      if (integer == null) {
        this.height = DEFAULT_HEIGHT;
      } else {
        this.height = integer;
      } 
      String str1 = paramBuilder.margin_right;
      if (str1 == null) {
        this.margin_right = "";
      } else {
        this.margin_right = str1;
      } 
      str = paramBuilder.margin_left;
      if (str == null) {
        this.margin_left = "";
      } else {
        this.margin_left = str;
      } 
    } else {
      this.day_url = ((Builder)str).day_url;
      this.night_url = ((Builder)str).night_url;
      this.width = ((Builder)str).width;
      this.height = ((Builder)str).height;
      this.margin_right = ((Builder)str).margin_right;
      this.margin_left = ((Builder)str).margin_left;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedContentIcon> {
    public String day_url;
    
    public Integer height;
    
    public String margin_left;
    
    public String margin_right;
    
    public String night_url;
    
    public Integer width;
    
    public Builder() {}
    
    public Builder(FeedContentIcon param1FeedContentIcon) {
      super(param1FeedContentIcon);
      if (param1FeedContentIcon == null)
        return; 
      this.day_url = param1FeedContentIcon.day_url;
      this.night_url = param1FeedContentIcon.night_url;
      this.width = param1FeedContentIcon.width;
      this.height = param1FeedContentIcon.height;
      this.margin_right = param1FeedContentIcon.margin_right;
      this.margin_left = param1FeedContentIcon.margin_left;
    }
    
    public FeedContentIcon build(boolean param1Boolean) {
      return new FeedContentIcon(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
