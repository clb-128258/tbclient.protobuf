package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FrsBottomActivity extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final String DEFAULT_COLOR = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_IMAGE = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 6)
  public final FrsBottomActivityTime activity_time;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String color;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 8)
  public final SponsorForumInfo sponsor_forum;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer type;
  
  public FrsBottomActivity(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder._abstract;
      if (str1 == null) {
        this._abstract = "";
      } else {
        this._abstract = str1;
      } 
      str1 = paramBuilder.image;
      if (str1 == null) {
        this.image = "";
      } else {
        this.image = str1;
      } 
      str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str1 = paramBuilder.jump_url;
      if (str1 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str1;
      } 
      this.activity_time = paramBuilder.activity_time;
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      this.sponsor_forum = paramBuilder.sponsor_forum;
      str = paramBuilder.color;
      if (str == null) {
        this.color = "";
      } else {
        this.color = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this._abstract = ((Builder)str)._abstract;
      this.image = ((Builder)str).image;
      this.icon = ((Builder)str).icon;
      this.jump_url = ((Builder)str).jump_url;
      this.activity_time = ((Builder)str).activity_time;
      this.type = ((Builder)str).type;
      this.sponsor_forum = ((Builder)str).sponsor_forum;
      this.color = ((Builder)str).color;
    } 
  }
  
  public static final class Builder extends Message.Builder<FrsBottomActivity> {
    public String _abstract;
    
    public FrsBottomActivityTime activity_time;
    
    public String color;
    
    public String icon;
    
    public String image;
    
    public String jump_url;
    
    public SponsorForumInfo sponsor_forum;
    
    public String title;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(FrsBottomActivity param1FrsBottomActivity) {
      super(param1FrsBottomActivity);
      if (param1FrsBottomActivity == null)
        return; 
      this.title = param1FrsBottomActivity.title;
      this._abstract = param1FrsBottomActivity._abstract;
      this.image = param1FrsBottomActivity.image;
      this.icon = param1FrsBottomActivity.icon;
      this.jump_url = param1FrsBottomActivity.jump_url;
      this.activity_time = param1FrsBottomActivity.activity_time;
      this.type = param1FrsBottomActivity.type;
      this.sponsor_forum = param1FrsBottomActivity.sponsor_forum;
      this.color = param1FrsBottomActivity.color;
    }
    
    public FrsBottomActivity build(boolean param1Boolean) {
      return new FrsBottomActivity(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
