package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class KjsSkinGroup extends Message {
  public static final String DEFAULT_GROUP_NAME = "";
  
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final Integer DEFAULT_ID;
  
  public static final Integer DEFAULT_OWNED;
  
  public static final List<KjsSkinItem> DEFAULT_SKINS;
  
  public static final Integer DEFAULT_TOTAL;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String group_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer has_more;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer id;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer owned;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<KjsSkinItem> skins;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer total;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_OWNED = integer;
    DEFAULT_TOTAL = integer;
    DEFAULT_SKINS = Collections.emptyList();
    DEFAULT_ID = integer;
    DEFAULT_HAS_MORE = integer;
  }
  
  public KjsSkinGroup(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.group_name;
      if (str == null) {
        this.group_name = "";
      } else {
        this.group_name = str;
      } 
      Integer integer2 = paramBuilder.owned;
      if (integer2 == null) {
        this.owned = DEFAULT_OWNED;
      } else {
        this.owned = integer2;
      } 
      integer2 = paramBuilder.total;
      if (integer2 == null) {
        this.total = DEFAULT_TOTAL;
      } else {
        this.total = integer2;
      } 
      List<KjsSkinItem> list = paramBuilder.skins;
      if (list == null) {
        this.skins = DEFAULT_SKINS;
      } else {
        this.skins = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.id;
      if (integer1 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer1;
      } 
      integer = paramBuilder.has_more;
      if (integer == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer;
      } 
    } else {
      this.group_name = ((Builder)integer).group_name;
      this.owned = ((Builder)integer).owned;
      this.total = ((Builder)integer).total;
      this.skins = Message.immutableCopyOf(((Builder)integer).skins);
      this.id = ((Builder)integer).id;
      this.has_more = ((Builder)integer).has_more;
    } 
  }
  
  public static final class Builder extends Message.Builder<KjsSkinGroup> {
    public String group_name;
    
    public Integer has_more;
    
    public Integer id;
    
    public Integer owned;
    
    public List<KjsSkinItem> skins;
    
    public Integer total;
    
    public Builder() {}
    
    public Builder(KjsSkinGroup param1KjsSkinGroup) {
      super(param1KjsSkinGroup);
      if (param1KjsSkinGroup == null)
        return; 
      this.group_name = param1KjsSkinGroup.group_name;
      this.owned = param1KjsSkinGroup.owned;
      this.total = param1KjsSkinGroup.total;
      this.skins = Message.copyOf(param1KjsSkinGroup.skins);
      this.id = param1KjsSkinGroup.id;
      this.has_more = param1KjsSkinGroup.has_more;
    }
    
    public KjsSkinGroup build(boolean param1Boolean) {
      return new KjsSkinGroup(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
