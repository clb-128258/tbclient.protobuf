package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedMaskLayer extends Message {
  public static final List<MaskLayerText> DEFAULT_BUTTON_TEXTS = Collections.emptyList();
  
  public static final String DEFAULT_TOPRIGHT_TEXT = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<MaskLayerText> button_texts;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String topright_text;
  
  public FeedMaskLayer(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<MaskLayerText> list;
    if (paramBoolean == true) {
      String str = paramBuilder.topright_text;
      if (str == null) {
        this.topright_text = "";
      } else {
        this.topright_text = str;
      } 
      list = paramBuilder.button_texts;
      if (list == null) {
        this.button_texts = DEFAULT_BUTTON_TEXTS;
      } else {
        this.button_texts = Message.immutableCopyOf(list);
      } 
    } else {
      this.topright_text = ((Builder)list).topright_text;
      this.button_texts = Message.immutableCopyOf(((Builder)list).button_texts);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedMaskLayer> {
    public List<MaskLayerText> button_texts;
    
    public String topright_text;
    
    public Builder() {}
    
    public Builder(FeedMaskLayer param1FeedMaskLayer) {
      super(param1FeedMaskLayer);
      if (param1FeedMaskLayer == null)
        return; 
      this.topright_text = param1FeedMaskLayer.topright_text;
      this.button_texts = Message.copyOf(param1FeedMaskLayer.button_texts);
    }
    
    public FeedMaskLayer build(boolean param1Boolean) {
      return new FeedMaskLayer(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
