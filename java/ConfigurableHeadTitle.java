package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ConfigurableHeadTitle extends Message {
  public static final List<FeedContentResource> DEFAULT_DATA = Collections.emptyList();
  
  public static final String DEFAULT_FONT_SIZE = "";
  
  @ProtoField(tag = 3)
  public final FeedContentGradiantColor background;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedContentResource> data;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String font_size;
  
  public ConfigurableHeadTitle(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<FeedContentResource> list = paramBuilder.data;
      if (list == null) {
        this.data = DEFAULT_DATA;
      } else {
        this.data = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.font_size;
      if (str == null) {
        this.font_size = "";
      } else {
        this.font_size = str;
      } 
      this.background = paramBuilder.background;
    } else {
      this.data = Message.immutableCopyOf(paramBuilder.data);
      this.font_size = paramBuilder.font_size;
      this.background = paramBuilder.background;
    } 
  }
  
  public static final class Builder extends Message.Builder<ConfigurableHeadTitle> {
    public FeedContentGradiantColor background;
    
    public List<FeedContentResource> data;
    
    public String font_size;
    
    public Builder() {}
    
    public Builder(ConfigurableHeadTitle param1ConfigurableHeadTitle) {
      super(param1ConfigurableHeadTitle);
      if (param1ConfigurableHeadTitle == null)
        return; 
      this.data = Message.copyOf(param1ConfigurableHeadTitle.data);
      this.font_size = param1ConfigurableHeadTitle.font_size;
      this.background = param1ConfigurableHeadTitle.background;
    }
    
    public ConfigurableHeadTitle build(boolean param1Boolean) {
      return new ConfigurableHeadTitle(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
