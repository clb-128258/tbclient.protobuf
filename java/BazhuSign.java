package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class BazhuSign extends Message {
  public static final String DEFAULT_DESC = "";
  
  public static final List<ForumInfo> DEFAULT_FORUM_LIST = Collections.emptyList();
  
  public static final String DEFAULT_LEVEL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ForumInfo> forum_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String level;
  
  public BazhuSign(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ForumInfo> list;
    if (paramBoolean == true) {
      String str = paramBuilder.desc;
      if (str == null) {
        this.desc = "";
      } else {
        this.desc = str;
      } 
      str = paramBuilder.level;
      if (str == null) {
        this.level = "";
      } else {
        this.level = str;
      } 
      list = paramBuilder.forum_list;
      if (list == null) {
        this.forum_list = DEFAULT_FORUM_LIST;
      } else {
        this.forum_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.desc = ((Builder)list).desc;
      this.level = ((Builder)list).level;
      this.forum_list = Message.immutableCopyOf(((Builder)list).forum_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<BazhuSign> {
    public String desc;
    
    public List<ForumInfo> forum_list;
    
    public String level;
    
    public Builder() {}
    
    public Builder(BazhuSign param1BazhuSign) {
      super(param1BazhuSign);
      if (param1BazhuSign == null)
        return; 
      this.desc = param1BazhuSign.desc;
      this.level = param1BazhuSign.level;
      this.forum_list = Message.copyOf(param1BazhuSign.forum_list);
    }
    
    public BazhuSign build(boolean param1Boolean) {
      return new BazhuSign(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
