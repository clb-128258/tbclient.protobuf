package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedHeadLoopComponent extends Message {
  public static final List<FeedHeadImg> DEFAULT_IMAGE_LIST = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 3)
  public final FeedContentIcon icon_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeedHeadImg> image_list;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 2)
  public final FeedContentText text_info;
  
  public FeedHeadLoopComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<FeedHeadImg> list = paramBuilder.image_list;
      if (list == null) {
        this.image_list = DEFAULT_IMAGE_LIST;
      } else {
        this.image_list = Message.immutableCopyOf(list);
      } 
      this.text_info = paramBuilder.text_info;
      this.icon_info = paramBuilder.icon_info;
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
    } else {
      this.image_list = Message.immutableCopyOf(((Builder)str).image_list);
      this.text_info = ((Builder)str).text_info;
      this.icon_info = ((Builder)str).icon_info;
      this.schema = ((Builder)str).schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedHeadLoopComponent> {
    public FeedContentIcon icon_info;
    
    public List<FeedHeadImg> image_list;
    
    public String schema;
    
    public FeedContentText text_info;
    
    public Builder() {}
    
    public Builder(FeedHeadLoopComponent param1FeedHeadLoopComponent) {
      super(param1FeedHeadLoopComponent);
      if (param1FeedHeadLoopComponent == null)
        return; 
      this.image_list = Message.copyOf(param1FeedHeadLoopComponent.image_list);
      this.text_info = param1FeedHeadLoopComponent.text_info;
      this.icon_info = param1FeedHeadLoopComponent.icon_info;
      this.schema = param1FeedHeadLoopComponent.schema;
    }
    
    public FeedHeadLoopComponent build(boolean param1Boolean) {
      return new FeedHeadLoopComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
