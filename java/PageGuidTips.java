package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PageGuidTips extends Message {
  public static final String DEFAULT_PREFIX_TEXT = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final String DEFAULT_SUFFIX_ICON = "";
  
  public static final String DEFAULT_SUFFIX_TEXT = "";
  
  @ProtoField(tag = 1)
  public final ForumNaviData forum_navi_data;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String prefix_text;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String suffix_icon;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String suffix_text;
  
  public PageGuidTips(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.forum_navi_data = paramBuilder.forum_navi_data;
      String str1 = paramBuilder.prefix_text;
      if (str1 == null) {
        this.prefix_text = "";
      } else {
        this.prefix_text = str1;
      } 
      str1 = paramBuilder.suffix_text;
      if (str1 == null) {
        this.suffix_text = "";
      } else {
        this.suffix_text = str1;
      } 
      str1 = paramBuilder.suffix_icon;
      if (str1 == null) {
        this.suffix_icon = "";
      } else {
        this.suffix_icon = str1;
      } 
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.forum_navi_data = ((Builder)str).forum_navi_data;
      this.prefix_text = ((Builder)str).prefix_text;
      this.suffix_text = ((Builder)str).suffix_text;
      this.suffix_icon = ((Builder)str).suffix_icon;
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<PageGuidTips> {
    public ForumNaviData forum_navi_data;
    
    public String prefix_text;
    
    public String schema;
    
    public String suffix_icon;
    
    public String suffix_text;
    
    public Builder() {}
    
    public Builder(PageGuidTips param1PageGuidTips) {
      super(param1PageGuidTips);
      if (param1PageGuidTips == null)
        return; 
      this.forum_navi_data = param1PageGuidTips.forum_navi_data;
      this.prefix_text = param1PageGuidTips.prefix_text;
      this.suffix_text = param1PageGuidTips.suffix_text;
      this.suffix_icon = param1PageGuidTips.suffix_icon;
      this.schema = param1PageGuidTips.schema;
    }
    
    public PageGuidTips build(boolean param1Boolean) {
      return new PageGuidTips(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
