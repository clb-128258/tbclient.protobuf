package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedButton extends Message {
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final Integer DEFAULT_STYLE = Integer.valueOf(0);
  
  @ProtoField(tag = 1)
  public final FeedContentColor background_color;
  
  @ProtoField(tag = 5)
  public final BorderInfo border_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 2)
  public final FeedContentIcon icon;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer style;
  
  @ProtoField(tag = 3)
  public final FeedContentText text;
  
  static {
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
  }
  
  public FeedButton(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      this.background_color = paramBuilder.background_color;
      this.icon = paramBuilder.icon;
      this.text = paramBuilder.text;
      Integer integer = paramBuilder.style;
      if (integer == null) {
        this.style = DEFAULT_STYLE;
      } else {
        this.style = integer;
      } 
      this.border_info = paramBuilder.border_info;
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      list = paramBuilder.business_info;
      if (list == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.background_color = ((Builder)list).background_color;
      this.icon = ((Builder)list).icon;
      this.text = ((Builder)list).text;
      this.style = ((Builder)list).style;
      this.border_info = ((Builder)list).border_info;
      this.schema = ((Builder)list).schema;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedButton> {
    public FeedContentColor background_color;
    
    public BorderInfo border_info;
    
    public List<FeedKV> business_info;
    
    public FeedContentIcon icon;
    
    public String schema;
    
    public Integer style;
    
    public FeedContentText text;
    
    public Builder() {}
    
    public Builder(FeedButton param1FeedButton) {
      super(param1FeedButton);
      if (param1FeedButton == null)
        return; 
      this.background_color = param1FeedButton.background_color;
      this.icon = param1FeedButton.icon;
      this.text = param1FeedButton.text;
      this.style = param1FeedButton.style;
      this.border_info = param1FeedButton.border_info;
      this.schema = param1FeedButton.schema;
      this.business_info = Message.copyOf(param1FeedButton.business_info);
    }
    
    public FeedButton build(boolean param1Boolean) {
      return new FeedButton(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
