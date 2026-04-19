package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ClassList extends Message {
  public static final Integer DEFAULT_CLASS_ID;
  
  public static final Integer DEFAULT_HAS_CHOOSE;
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer class_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer has_choose;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_CLASS_ID = integer;
    DEFAULT_HAS_CHOOSE = integer;
  }
  
  public ClassList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.class_id;
      if (integer1 == null) {
        this.class_id = DEFAULT_CLASS_ID;
      } else {
        this.class_id = integer1;
      } 
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      integer = paramBuilder.has_choose;
      if (integer == null) {
        this.has_choose = DEFAULT_HAS_CHOOSE;
      } else {
        this.has_choose = integer;
      } 
    } else {
      this.class_id = ((Builder)integer).class_id;
      this.name = ((Builder)integer).name;
      this.has_choose = ((Builder)integer).has_choose;
    } 
  }
  
  public static final class Builder extends Message.Builder<ClassList> {
    public Integer class_id;
    
    public Integer has_choose;
    
    public String name;
    
    public Builder() {}
    
    public Builder(ClassList param1ClassList) {
      super(param1ClassList);
      if (param1ClassList == null)
        return; 
      this.class_id = param1ClassList.class_id;
      this.name = param1ClassList.name;
      this.has_choose = param1ClassList.has_choose;
    }
    
    public ClassList build(boolean param1Boolean) {
      return new ClassList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
