package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BrandAward extends Message {
  public static final String DEFAULT_AWARD_ICON = "";
  
  public static final String DEFAULT_AWARD_NAME = "";
  
  public static final Integer DEFAULT_INDEX = Integer.valueOf(0);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String award_icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String award_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer index;
  
  public BrandAward(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.index;
      if (integer == null) {
        this.index = DEFAULT_INDEX;
      } else {
        this.index = integer;
      } 
      String str1 = paramBuilder.award_name;
      if (str1 == null) {
        this.award_name = "";
      } else {
        this.award_name = str1;
      } 
      str = paramBuilder.award_icon;
      if (str == null) {
        this.award_icon = "";
      } else {
        this.award_icon = str;
      } 
    } else {
      this.index = ((Builder)str).index;
      this.award_name = ((Builder)str).award_name;
      this.award_icon = ((Builder)str).award_icon;
    } 
  }
  
  public static final class Builder extends Message.Builder<BrandAward> {
    public String award_icon;
    
    public String award_name;
    
    public Integer index;
    
    public Builder() {}
    
    public Builder(BrandAward param1BrandAward) {
      super(param1BrandAward);
      if (param1BrandAward == null)
        return; 
      this.index = param1BrandAward.index;
      this.award_name = param1BrandAward.award_name;
      this.award_icon = param1BrandAward.award_icon;
    }
    
    public BrandAward build(boolean param1Boolean) {
      return new BrandAward(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
