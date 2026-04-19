package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GameBookedToast extends Message {
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public GameBookedToast(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.desc;
      if (str1 == null) {
        this.desc = "";
      } else {
        this.desc = str1;
      } 
      str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str = paramBuilder.scheme;
      if (str == null) {
        this.scheme = "";
      } else {
        this.scheme = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.desc = ((Builder)str).desc;
      this.icon = ((Builder)str).icon;
      this.scheme = ((Builder)str).scheme;
    } 
  }
  
  public static final class Builder extends Message.Builder<GameBookedToast> {
    public String desc;
    
    public String icon;
    
    public String scheme;
    
    public String title;
    
    public Builder() {}
    
    public Builder(GameBookedToast param1GameBookedToast) {
      super(param1GameBookedToast);
      if (param1GameBookedToast == null)
        return; 
      this.title = param1GameBookedToast.title;
      this.desc = param1GameBookedToast.desc;
      this.icon = param1GameBookedToast.icon;
      this.scheme = param1GameBookedToast.scheme;
    }
    
    public GameBookedToast build(boolean param1Boolean) {
      return new GameBookedToast(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
