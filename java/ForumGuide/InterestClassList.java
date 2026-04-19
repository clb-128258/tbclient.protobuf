package tbclient.ForumGuide;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class InterestClassList extends Message {
  public static final Long DEFAULT_CLASS_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_CLASS_NAME = "";
  
  public static final Integer DEFAULT_HAS_CHOOSE = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long class_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String class_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer has_choose;
  
  public InterestClassList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.class_id;
      if (long_ == null) {
        this.class_id = DEFAULT_CLASS_ID;
      } else {
        this.class_id = long_;
      } 
      String str = paramBuilder.class_name;
      if (str == null) {
        this.class_name = "";
      } else {
        this.class_name = str;
      } 
      integer = paramBuilder.has_choose;
      if (integer == null) {
        this.has_choose = DEFAULT_HAS_CHOOSE;
      } else {
        this.has_choose = integer;
      } 
    } else {
      this.class_id = ((Builder)integer).class_id;
      this.class_name = ((Builder)integer).class_name;
      this.has_choose = ((Builder)integer).has_choose;
    } 
  }
  
  public static final class Builder extends Message.Builder<InterestClassList> {
    public Long class_id;
    
    public String class_name;
    
    public Integer has_choose;
    
    public Builder() {}
    
    public Builder(InterestClassList param1InterestClassList) {
      super(param1InterestClassList);
      if (param1InterestClassList == null)
        return; 
      this.class_id = param1InterestClassList.class_id;
      this.class_name = param1InterestClassList.class_name;
      this.has_choose = param1InterestClassList.has_choose;
    }
    
    public InterestClassList build(boolean param1Boolean) {
      return new InterestClassList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
