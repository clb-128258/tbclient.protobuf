package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class HelpStatusTag extends Message {
  public static final String DEFAULT_COMMENT_ICON = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final Long DEFAULT_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String comment_icon;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer type;
  
  public HelpStatusTag(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str = paramBuilder.comment_icon;
      if (str == null) {
        this.comment_icon = "";
      } else {
        this.comment_icon = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.type = ((Builder)str).type;
      this.name = ((Builder)str).name;
      this.icon = ((Builder)str).icon;
      this.comment_icon = ((Builder)str).comment_icon;
    } 
  }
  
  public static final class Builder extends Message.Builder<HelpStatusTag> {
    public String comment_icon;
    
    public String icon;
    
    public Long id;
    
    public String name;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(HelpStatusTag param1HelpStatusTag) {
      super(param1HelpStatusTag);
      if (param1HelpStatusTag == null)
        return; 
      this.id = param1HelpStatusTag.id;
      this.type = param1HelpStatusTag.type;
      this.name = param1HelpStatusTag.name;
      this.icon = param1HelpStatusTag.icon;
      this.comment_icon = param1HelpStatusTag.comment_icon;
    }
    
    public HelpStatusTag build(boolean param1Boolean) {
      return new HelpStatusTag(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
