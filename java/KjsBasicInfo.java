package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class KjsBasicInfo extends Message {
  public static final List<FeedKV> DEFAULT_ITEMS = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedKV> items;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public KjsBasicInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      list = paramBuilder.items;
      if (list == null) {
        this.items = DEFAULT_ITEMS;
      } else {
        this.items = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = ((Builder)list).title;
      this.items = Message.immutableCopyOf(((Builder)list).items);
    } 
  }
  
  public static final class Builder extends Message.Builder<KjsBasicInfo> {
    public List<FeedKV> items;
    
    public String title;
    
    public Builder() {}
    
    public Builder(KjsBasicInfo param1KjsBasicInfo) {
      super(param1KjsBasicInfo);
      if (param1KjsBasicInfo == null)
        return; 
      this.title = param1KjsBasicInfo.title;
      this.items = Message.copyOf(param1KjsBasicInfo.items);
    }
    
    public KjsBasicInfo build(boolean param1Boolean) {
      return new KjsBasicInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
