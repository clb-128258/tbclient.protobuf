package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GameDetail;

public final class BreadcrumbNavigation extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TYPE = "";
  
  @ProtoField(tag = 5)
  public final GameDetail game_detail;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String type;
  
  public BreadcrumbNavigation(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.icon;
      if (str == null) {
        this.icon = "";
      } else {
        this.icon = str;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
      str = paramBuilder.type;
      if (str == null) {
        this.type = "";
      } else {
        this.type = str;
      } 
      this.game_detail = paramBuilder.game_detail;
    } else {
      this.title = paramBuilder.title;
      this.icon = paramBuilder.icon;
      this.jump_url = paramBuilder.jump_url;
      this.type = paramBuilder.type;
      this.game_detail = paramBuilder.game_detail;
    } 
  }
  
  public static final class Builder extends Message.Builder<BreadcrumbNavigation> {
    public GameDetail game_detail;
    
    public String icon;
    
    public String jump_url;
    
    public String title;
    
    public String type;
    
    public Builder() {}
    
    public Builder(BreadcrumbNavigation param1BreadcrumbNavigation) {
      super(param1BreadcrumbNavigation);
      if (param1BreadcrumbNavigation == null)
        return; 
      this.title = param1BreadcrumbNavigation.title;
      this.icon = param1BreadcrumbNavigation.icon;
      this.jump_url = param1BreadcrumbNavigation.jump_url;
      this.type = param1BreadcrumbNavigation.type;
      this.game_detail = param1BreadcrumbNavigation.game_detail;
    }
    
    public BreadcrumbNavigation build(boolean param1Boolean) {
      return new BreadcrumbNavigation(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
