package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedHorizontalPicComponent extends Message {
  public static final List<PicInfo> DEFAULT_PICS = Collections.emptyList();
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 3)
  public final ThreadRecommendInfo act_countdown_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<PicInfo> pics;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String schema;
  
  public FeedHorizontalPicComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<PicInfo> list = paramBuilder.pics;
      if (list == null) {
        this.pics = DEFAULT_PICS;
      } else {
        this.pics = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      this.act_countdown_info = paramBuilder.act_countdown_info;
    } else {
      this.pics = Message.immutableCopyOf(paramBuilder.pics);
      this.schema = paramBuilder.schema;
      this.act_countdown_info = paramBuilder.act_countdown_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedHorizontalPicComponent> {
    public ThreadRecommendInfo act_countdown_info;
    
    public List<PicInfo> pics;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FeedHorizontalPicComponent param1FeedHorizontalPicComponent) {
      super(param1FeedHorizontalPicComponent);
      if (param1FeedHorizontalPicComponent == null)
        return; 
      this.pics = Message.copyOf(param1FeedHorizontalPicComponent.pics);
      this.schema = param1FeedHorizontalPicComponent.schema;
      this.act_countdown_info = param1FeedHorizontalPicComponent.act_countdown_info;
    }
    
    public FeedHorizontalPicComponent build(boolean param1Boolean) {
      return new FeedHorizontalPicComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
