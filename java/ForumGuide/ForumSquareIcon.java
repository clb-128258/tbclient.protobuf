package tbclient.ForumGuide;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumSquareIcon extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  public ForumSquareIcon(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.icon;
      if (str == null) {
        this.icon = "";
      } else {
        this.icon = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.icon = ((Builder)str).icon;
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumSquareIcon> {
    public String icon;
    
    public String name;
    
    public Builder() {}
    
    public Builder(ForumSquareIcon param1ForumSquareIcon) {
      super(param1ForumSquareIcon);
      if (param1ForumSquareIcon == null)
        return; 
      this.name = param1ForumSquareIcon.name;
      this.icon = param1ForumSquareIcon.icon;
    }
    
    public ForumSquareIcon build(boolean param1Boolean) {
      return new ForumSquareIcon(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
