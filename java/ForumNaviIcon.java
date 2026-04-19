package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumNaviIcon extends Message {
  public static final String DEFAULT_DAY = "";
  
  public static final String DEFAULT_NIGHT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String day;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String night;
  
  public ForumNaviIcon(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
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
      this.day = ((Builder)str).day;
      this.night = ((Builder)str).night;
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumNaviIcon> {
    public String day;
    
    public String night;
    
    public Builder() {}
    
    public Builder(ForumNaviIcon param1ForumNaviIcon) {
      super(param1ForumNaviIcon);
      if (param1ForumNaviIcon == null)
        return; 
      this.day = param1ForumNaviIcon.day;
      this.night = param1ForumNaviIcon.night;
    }
    
    public ForumNaviIcon build(boolean param1Boolean) {
      return new ForumNaviIcon(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
