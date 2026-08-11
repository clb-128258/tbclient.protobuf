package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class KjsSkinItem extends Message {
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_IMAGE = "";
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  public KjsSkinItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      str = paramBuilder.image;
      if (str == null) {
        this.image = "";
      } else {
        this.image = str;
      } 
      integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
    } else {
      this.name = ((Builder)integer).name;
      this.image = ((Builder)integer).image;
      this.id = ((Builder)integer).id;
    } 
  }
  
  public static final class Builder extends Message.Builder<KjsSkinItem> {
    public Integer id;
    
    public String image;
    
    public String name;
    
    public Builder() {}
    
    public Builder(KjsSkinItem param1KjsSkinItem) {
      super(param1KjsSkinItem);
      if (param1KjsSkinItem == null)
        return; 
      this.name = param1KjsSkinItem.name;
      this.image = param1KjsSkinItem.image;
      this.id = param1KjsSkinItem.id;
    }
    
    public KjsSkinItem build(boolean param1Boolean) {
      return new KjsSkinItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
