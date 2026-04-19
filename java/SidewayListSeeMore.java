package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SidewayListSeeMore extends Message {
  public static final String DEFAULT_AFTER_TEXT = "";
  
  public static final String DEFAULT_BEFORE_TEXT = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String after_text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String before_text;
  
  @ProtoField(tag = 3)
  public final FeedContentIcon icon;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  public SidewayListSeeMore(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.before_text;
      if (str1 == null) {
        this.before_text = "";
      } else {
        this.before_text = str1;
      } 
      str1 = paramBuilder.after_text;
      if (str1 == null) {
        this.after_text = "";
      } else {
        this.after_text = str1;
      } 
      this.icon = paramBuilder.icon;
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.before_text = ((Builder)str).before_text;
      this.after_text = ((Builder)str).after_text;
      this.icon = ((Builder)str).icon;
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<SidewayListSeeMore> {
    public String after_text;
    
    public String before_text;
    
    public FeedContentIcon icon;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(SidewayListSeeMore param1SidewayListSeeMore) {
      super(param1SidewayListSeeMore);
      if (param1SidewayListSeeMore == null)
        return; 
      this.before_text = param1SidewayListSeeMore.before_text;
      this.after_text = param1SidewayListSeeMore.after_text;
      this.icon = param1SidewayListSeeMore.icon;
      this.schema = param1SidewayListSeeMore.schema;
    }
    
    public SidewayListSeeMore build(boolean param1Boolean) {
      return new SidewayListSeeMore(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
