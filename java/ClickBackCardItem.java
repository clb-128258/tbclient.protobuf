package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ClickBackCardItem extends Message {
  public static final Long DEFAULT_BUSINESS_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_BUSINESS_TYPE = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long business_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String business_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  public ClickBackCardItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      str1 = paramBuilder.jump_url;
      if (str1 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str1;
      } 
      Long long_ = paramBuilder.business_id;
      if (long_ == null) {
        this.business_id = DEFAULT_BUSINESS_ID;
      } else {
        this.business_id = long_;
      } 
      str = paramBuilder.business_type;
      if (str == null) {
        this.business_type = "";
      } else {
        this.business_type = str;
      } 
    } else {
      this.text = ((Builder)str).text;
      this.jump_url = ((Builder)str).jump_url;
      this.business_id = ((Builder)str).business_id;
      this.business_type = ((Builder)str).business_type;
    } 
  }
  
  public static final class Builder extends Message.Builder<ClickBackCardItem> {
    public Long business_id;
    
    public String business_type;
    
    public String jump_url;
    
    public String text;
    
    public Builder() {}
    
    public Builder(ClickBackCardItem param1ClickBackCardItem) {
      super(param1ClickBackCardItem);
      if (param1ClickBackCardItem == null)
        return; 
      this.text = param1ClickBackCardItem.text;
      this.jump_url = param1ClickBackCardItem.jump_url;
      this.business_id = param1ClickBackCardItem.business_id;
      this.business_type = param1ClickBackCardItem.business_type;
    }
    
    public ClickBackCardItem build(boolean param1Boolean) {
      return new ClickBackCardItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
