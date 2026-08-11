package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class KjsSkinSecondaryTab extends Message {
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final Integer DEFAULT_ID;
  
  public static final String DEFAULT_NAME = "";
  
  public static final List<KjsSkinGroup> DEFAULT_SKIN_GROUPS = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer has_more;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<KjsSkinGroup> skin_groups;
  
  static {
    DEFAULT_ID = integer;
  }
  
  public KjsSkinSecondaryTab(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      Integer integer1 = paramBuilder.has_more;
      if (integer1 == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer1;
      } 
      List<KjsSkinGroup> list = paramBuilder.skin_groups;
      if (list == null) {
        this.skin_groups = DEFAULT_SKIN_GROUPS;
      } else {
        this.skin_groups = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
    } else {
      this.name = ((Builder)integer).name;
      this.has_more = ((Builder)integer).has_more;
      this.skin_groups = Message.immutableCopyOf(((Builder)integer).skin_groups);
      this.id = ((Builder)integer).id;
    } 
  }
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_MORE = integer;
  }
  
  public static final class Builder extends Message.Builder<KjsSkinSecondaryTab> {
    public Integer has_more;
    
    public Integer id;
    
    public String name;
    
    public List<KjsSkinGroup> skin_groups;
    
    public Builder() {}
    
    public Builder(KjsSkinSecondaryTab param1KjsSkinSecondaryTab) {
      super(param1KjsSkinSecondaryTab);
      if (param1KjsSkinSecondaryTab == null)
        return; 
      this.name = param1KjsSkinSecondaryTab.name;
      this.has_more = param1KjsSkinSecondaryTab.has_more;
      this.skin_groups = Message.copyOf(param1KjsSkinSecondaryTab.skin_groups);
      this.id = param1KjsSkinSecondaryTab.id;
    }
    
    public KjsSkinSecondaryTab build(boolean param1Boolean) {
      return new KjsSkinSecondaryTab(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
