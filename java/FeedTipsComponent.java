package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedTipsComponent extends Message {
  public static final List<FeedContentResource> DEFAULT_DATA = Collections.emptyList();
  
  public static final String DEFAULT_FONT_SIZE = "";
  
  public static final Integer DEFAULT_MAX_LINES = Integer.valueOf(0);
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedContentResource> data;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String font_size;
  
  @ProtoField(tag = 2)
  public final FeedContentIcon icon_data;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer max_lines;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String schema;
  
  public FeedTipsComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<FeedContentResource> list = paramBuilder.data;
      if (list == null) {
        this.data = DEFAULT_DATA;
      } else {
        this.data = Message.immutableCopyOf(list);
      } 
      this.icon_data = paramBuilder.icon_data;
      String str1 = paramBuilder.font_size;
      if (str1 == null) {
        this.font_size = "";
      } else {
        this.font_size = str1;
      } 
      Integer integer = paramBuilder.max_lines;
      if (integer == null) {
        this.max_lines = DEFAULT_MAX_LINES;
      } else {
        this.max_lines = integer;
      } 
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.data = Message.immutableCopyOf(((Builder)str).data);
      this.icon_data = ((Builder)str).icon_data;
      this.font_size = ((Builder)str).font_size;
      this.max_lines = ((Builder)str).max_lines;
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedTipsComponent> {
    public List<FeedContentResource> data;
    
    public String font_size;
    
    public FeedContentIcon icon_data;
    
    public Integer max_lines;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FeedTipsComponent param1FeedTipsComponent) {
      super(param1FeedTipsComponent);
      if (param1FeedTipsComponent == null)
        return; 
      this.data = Message.copyOf(param1FeedTipsComponent.data);
      this.icon_data = param1FeedTipsComponent.icon_data;
      this.font_size = param1FeedTipsComponent.font_size;
      this.max_lines = param1FeedTipsComponent.max_lines;
      this.schema = param1FeedTipsComponent.schema;
    }
    
    public FeedTipsComponent build(boolean param1Boolean) {
      return new FeedTipsComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
