package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LabelInfo extends Message {
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_LABELCONTENT = "";
  
  public static final Integer DEFAULT_LABELHOT;
  
  public static final String DEFAULT_LABELID = "";
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String labelContent;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer labelHot;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String labelId;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_LABELHOT = integer;
    DEFAULT_TYPE = integer;
  }
  
  public LabelInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.labelHot;
      if (integer1 == null) {
        this.labelHot = DEFAULT_LABELHOT;
      } else {
        this.labelHot = integer1;
      } 
      String str = paramBuilder.labelContent;
      if (str == null) {
        this.labelContent = "";
      } else {
        this.labelContent = str;
      } 
      str = paramBuilder.labelId;
      if (str == null) {
        this.labelId = "";
      } else {
        this.labelId = str;
      } 
      str = paramBuilder.img_url;
      if (str == null) {
        this.img_url = "";
      } else {
        this.img_url = str;
      } 
      integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
    } else {
      this.labelHot = ((Builder)integer).labelHot;
      this.labelContent = ((Builder)integer).labelContent;
      this.labelId = ((Builder)integer).labelId;
      this.img_url = ((Builder)integer).img_url;
      this.type = ((Builder)integer).type;
    } 
  }
  
  public static final class Builder extends Message.Builder<LabelInfo> {
    public String img_url;
    
    public String labelContent;
    
    public Integer labelHot;
    
    public String labelId;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(LabelInfo param1LabelInfo) {
      super(param1LabelInfo);
      if (param1LabelInfo == null)
        return; 
      this.labelHot = param1LabelInfo.labelHot;
      this.labelContent = param1LabelInfo.labelContent;
      this.labelId = param1LabelInfo.labelId;
      this.img_url = param1LabelInfo.img_url;
      this.type = param1LabelInfo.type;
    }
    
    public LabelInfo build(boolean param1Boolean) {
      return new LabelInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
