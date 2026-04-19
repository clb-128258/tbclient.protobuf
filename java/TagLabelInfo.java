package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class TagLabelInfo extends Message {
  public static final List<ThemeColorInfo> DEFAULT_LABELS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThemeColorInfo> labels;
  
  public TagLabelInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThemeColorInfo> list;
    if (paramBoolean == true) {
      list = paramBuilder.labels;
      if (list == null) {
        this.labels = DEFAULT_LABELS;
      } else {
        this.labels = Message.immutableCopyOf(list);
      } 
    } else {
      this.labels = Message.immutableCopyOf(((Builder)list).labels);
    } 
  }
  
  public static final class Builder extends Message.Builder<TagLabelInfo> {
    public List<ThemeColorInfo> labels;
    
    public Builder() {}
    
    public Builder(TagLabelInfo param1TagLabelInfo) {
      super(param1TagLabelInfo);
      if (param1TagLabelInfo == null)
        return; 
      this.labels = Message.copyOf(param1TagLabelInfo.labels);
    }
    
    public TagLabelInfo build(boolean param1Boolean) {
      return new TagLabelInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
