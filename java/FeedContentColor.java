package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedContentColor extends Message {
  public static final String DEFAULT_DAY = "";
  
  public static final String DEFAULT_NIGHT = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String day;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String night;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  public FeedContentColor(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      String str1 = paramBuilder.day;
      if (str1 == null) {
        this.day = "";
      } else {
        this.day = str1;
      } 
      str = paramBuilder.night;
      if (str == null) {
        this.night = "";
      } else {
        this.night = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.day = ((Builder)str).day;
      this.night = ((Builder)str).night;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedContentColor> {
    public String day;
    
    public String night;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(FeedContentColor param1FeedContentColor) {
      super(param1FeedContentColor);
      if (param1FeedContentColor == null)
        return; 
      this.type = param1FeedContentColor.type;
      this.day = param1FeedContentColor.day;
      this.night = param1FeedContentColor.night;
    }
    
    public FeedContentColor build(boolean param1Boolean) {
      return new FeedContentColor(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
