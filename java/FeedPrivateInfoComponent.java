package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedPrivateInfoComponent extends Message {
  public static final List<JumpText> DEFAULT_SUFFIX_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1)
  public final JumpText main_text;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<JumpText> suffix_list;
  
  public FeedPrivateInfoComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<JumpText> list;
    if (paramBoolean == true) {
      this.main_text = paramBuilder.main_text;
      list = paramBuilder.suffix_list;
      if (list == null) {
        this.suffix_list = DEFAULT_SUFFIX_LIST;
      } else {
        this.suffix_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.main_text = ((Builder)list).main_text;
      this.suffix_list = Message.immutableCopyOf(((Builder)list).suffix_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedPrivateInfoComponent> {
    public JumpText main_text;
    
    public List<JumpText> suffix_list;
    
    public Builder() {}
    
    public Builder(FeedPrivateInfoComponent param1FeedPrivateInfoComponent) {
      super(param1FeedPrivateInfoComponent);
      if (param1FeedPrivateInfoComponent == null)
        return; 
      this.main_text = param1FeedPrivateInfoComponent.main_text;
      this.suffix_list = Message.copyOf(param1FeedPrivateInfoComponent.suffix_list);
    }
    
    public FeedPrivateInfoComponent build(boolean param1Boolean) {
      return new FeedPrivateInfoComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
