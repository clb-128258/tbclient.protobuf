package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedAnswerBoxComponent extends Message {
  public static final String DEFAULT_BOTTON_TEXT = "";
  
  public static final String DEFAULT_BOX_TEXT = "";
  
  public static final List<LayoutManageInfo> DEFAULT_MANAGE_LIST = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String botton_text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String box_text;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<LayoutManageInfo> manage_list;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String schema;
  
  public FeedAnswerBoxComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<LayoutManageInfo> list;
    if (paramBoolean == true) {
      String str = paramBuilder.box_text;
      if (str == null) {
        this.box_text = "";
      } else {
        this.box_text = str;
      } 
      str = paramBuilder.botton_text;
      if (str == null) {
        this.botton_text = "";
      } else {
        this.botton_text = str;
      } 
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      list = paramBuilder.manage_list;
      if (list == null) {
        this.manage_list = DEFAULT_MANAGE_LIST;
      } else {
        this.manage_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.box_text = ((Builder)list).box_text;
      this.botton_text = ((Builder)list).botton_text;
      this.schema = ((Builder)list).schema;
      this.manage_list = Message.immutableCopyOf(((Builder)list).manage_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedAnswerBoxComponent> {
    public String botton_text;
    
    public String box_text;
    
    public List<LayoutManageInfo> manage_list;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FeedAnswerBoxComponent param1FeedAnswerBoxComponent) {
      super(param1FeedAnswerBoxComponent);
      if (param1FeedAnswerBoxComponent == null)
        return; 
      this.box_text = param1FeedAnswerBoxComponent.box_text;
      this.botton_text = param1FeedAnswerBoxComponent.botton_text;
      this.schema = param1FeedAnswerBoxComponent.schema;
      this.manage_list = Message.copyOf(param1FeedAnswerBoxComponent.manage_list);
    }
    
    public FeedAnswerBoxComponent build(boolean param1Boolean) {
      return new FeedAnswerBoxComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
