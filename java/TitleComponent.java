package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class TitleComponent extends Message {
  public static final List<FeedContentResource> DEFAULT_DATA = Collections.emptyList();
  
  public static final String DEFAULT_FONT_SIZE = "";
  
  public static final Integer DEFAULT_MAX_LINES = Integer.valueOf(0);
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedContentResource> data;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String font_size;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer max_lines;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  public TitleComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<FeedContentResource> list = paramBuilder.data;
      if (list == null) {
        this.data = DEFAULT_DATA;
      } else {
        this.data = Message.immutableCopyOf(list);
      } 
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
      this.font_size = ((Builder)str).font_size;
      this.max_lines = ((Builder)str).max_lines;
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<TitleComponent> {
    public List<FeedContentResource> data;
    
    public String font_size;
    
    public Integer max_lines;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(TitleComponent param1TitleComponent) {
      super(param1TitleComponent);
      if (param1TitleComponent == null)
        return; 
      this.data = Message.copyOf(param1TitleComponent.data);
      this.font_size = param1TitleComponent.font_size;
      this.max_lines = param1TitleComponent.max_lines;
      this.schema = param1TitleComponent.schema;
    }
    
    public TitleComponent build(boolean param1Boolean) {
      return new TitleComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
