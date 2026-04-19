package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Wares extends Message {
  public static final Integer DEFAULT_MONEY;
  
  public static final String DEFAULT_NEW_PROPS_ID = "";
  
  public static final Integer DEFAULT_PROPS_ID;
  
  public static final Integer DEFAULT_PROPS_MON;
  
  public static final Integer DEFAULT_QUANTITY;
  
  public static final String DEFAULT_WARS_ITEM = "";
  
  public static final String DEFAULT_WARS_NAME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer money;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String new_props_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer props_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer props_mon;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer quantity;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String wars_item;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String wars_name;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PROPS_ID = integer;
    DEFAULT_MONEY = integer;
    DEFAULT_PROPS_MON = integer;
    DEFAULT_QUANTITY = integer;
  }
  
  public Wares(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.props_id;
      if (integer1 == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer1;
      } 
      integer1 = paramBuilder.money;
      if (integer1 == null) {
        this.money = DEFAULT_MONEY;
      } else {
        this.money = integer1;
      } 
      integer1 = paramBuilder.props_mon;
      if (integer1 == null) {
        this.props_mon = DEFAULT_PROPS_MON;
      } else {
        this.props_mon = integer1;
      } 
      String str = paramBuilder.wars_name;
      if (str == null) {
        this.wars_name = "";
      } else {
        this.wars_name = str;
      } 
      str = paramBuilder.wars_item;
      if (str == null) {
        this.wars_item = "";
      } else {
        this.wars_item = str;
      } 
      str = paramBuilder.new_props_id;
      if (str == null) {
        this.new_props_id = "";
      } else {
        this.new_props_id = str;
      } 
      integer = paramBuilder.quantity;
      if (integer == null) {
        this.quantity = DEFAULT_QUANTITY;
      } else {
        this.quantity = integer;
      } 
    } else {
      this.props_id = ((Builder)integer).props_id;
      this.money = ((Builder)integer).money;
      this.props_mon = ((Builder)integer).props_mon;
      this.wars_name = ((Builder)integer).wars_name;
      this.wars_item = ((Builder)integer).wars_item;
      this.new_props_id = ((Builder)integer).new_props_id;
      this.quantity = ((Builder)integer).quantity;
    } 
  }
  
  public static final class Builder extends Message.Builder<Wares> {
    public Integer money;
    
    public String new_props_id;
    
    public Integer props_id;
    
    public Integer props_mon;
    
    public Integer quantity;
    
    public String wars_item;
    
    public String wars_name;
    
    public Builder() {}
    
    public Builder(Wares param1Wares) {
      super(param1Wares);
      if (param1Wares == null)
        return; 
      this.props_id = param1Wares.props_id;
      this.money = param1Wares.money;
      this.props_mon = param1Wares.props_mon;
      this.wars_name = param1Wares.wars_name;
      this.wars_item = param1Wares.wars_item;
      this.new_props_id = param1Wares.new_props_id;
      this.quantity = param1Wares.quantity;
    }
    
    public Wares build(boolean param1Boolean) {
      return new Wares(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
