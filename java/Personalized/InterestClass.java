package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class InterestClass extends Message {
  public static final List<ClassList> DEFAULT_CLASS_LIST = Collections.emptyList();
  
  public static final Long DEFAULT_FLOOR = Long.valueOf(0L);
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_ICON_SCHEMA = "";
  
  public static final String DEFAULT_ICON_TEXT = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ClassList> class_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long floor;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String icon_schema;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String icon_text;
  
  public InterestClass(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<ClassList> list = paramBuilder.class_list;
      if (list == null) {
        this.class_list = DEFAULT_CLASS_LIST;
      } else {
        this.class_list = Message.immutableCopyOf(list);
      } 
      Long long_ = paramBuilder.floor;
      if (long_ == null) {
        this.floor = DEFAULT_FLOOR;
      } else {
        this.floor = long_;
      } 
      String str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str1 = paramBuilder.icon_text;
      if (str1 == null) {
        this.icon_text = "";
      } else {
        this.icon_text = str1;
      } 
      str = paramBuilder.icon_schema;
      if (str == null) {
        this.icon_schema = "";
      } else {
        this.icon_schema = str;
      } 
    } else {
      this.class_list = Message.immutableCopyOf(((Builder)str).class_list);
      this.floor = ((Builder)str).floor;
      this.icon = ((Builder)str).icon;
      this.icon_text = ((Builder)str).icon_text;
      this.icon_schema = ((Builder)str).icon_schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<InterestClass> {
    public List<ClassList> class_list;
    
    public Long floor;
    
    public String icon;
    
    public String icon_schema;
    
    public String icon_text;
    
    public Builder() {}
    
    public Builder(InterestClass param1InterestClass) {
      super(param1InterestClass);
      if (param1InterestClass == null)
        return; 
      this.class_list = Message.copyOf(param1InterestClass.class_list);
      this.floor = param1InterestClass.floor;
      this.icon = param1InterestClass.icon;
      this.icon_text = param1InterestClass.icon_text;
      this.icon_schema = param1InterestClass.icon_schema;
    }
    
    public InterestClass build(boolean param1Boolean) {
      return new InterestClass(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
