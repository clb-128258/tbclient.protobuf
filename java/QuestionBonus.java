package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class QuestionBonus extends Message {
  public static final String DEFAULT_CARD_TYPE = "";
  
  public static final String DEFAULT_GUIDE_URL = "";
  
  public static final String DEFAULT_INPUTBOX_TEXT = "";
  
  public static final String DEFAULT_PAID_OUT_TEXT = "";
  
  public static final Integer DEFAULT_STATUS;
  
  public static final Integer DEFAULT_TMONEY;
  
  public static final Integer DEFAULT_TMONEY_PLUS;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String card_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String guide_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String inputbox_text;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String paid_out_text;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer status;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer tmoney;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer tmoney_plus;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TMONEY = integer;
    DEFAULT_TMONEY_PLUS = integer;
    DEFAULT_STATUS = integer;
  }
  
  public QuestionBonus(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.tmoney;
      if (integer == null) {
        this.tmoney = DEFAULT_TMONEY;
      } else {
        this.tmoney = integer;
      } 
      integer = paramBuilder.tmoney_plus;
      if (integer == null) {
        this.tmoney_plus = DEFAULT_TMONEY_PLUS;
      } else {
        this.tmoney_plus = integer;
      } 
      integer = paramBuilder.status;
      if (integer == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer;
      } 
      String str1 = paramBuilder.guide_url;
      if (str1 == null) {
        this.guide_url = "";
      } else {
        this.guide_url = str1;
      } 
      str1 = paramBuilder.paid_out_text;
      if (str1 == null) {
        this.paid_out_text = "";
      } else {
        this.paid_out_text = str1;
      } 
      str1 = paramBuilder.inputbox_text;
      if (str1 == null) {
        this.inputbox_text = "";
      } else {
        this.inputbox_text = str1;
      } 
      str = paramBuilder.card_type;
      if (str == null) {
        this.card_type = "";
      } else {
        this.card_type = str;
      } 
    } else {
      this.tmoney = ((Builder)str).tmoney;
      this.tmoney_plus = ((Builder)str).tmoney_plus;
      this.status = ((Builder)str).status;
      this.guide_url = ((Builder)str).guide_url;
      this.paid_out_text = ((Builder)str).paid_out_text;
      this.inputbox_text = ((Builder)str).inputbox_text;
      this.card_type = ((Builder)str).card_type;
    } 
  }
  
  public static final class Builder extends Message.Builder<QuestionBonus> {
    public String card_type;
    
    public String guide_url;
    
    public String inputbox_text;
    
    public String paid_out_text;
    
    public Integer status;
    
    public Integer tmoney;
    
    public Integer tmoney_plus;
    
    public Builder() {}
    
    public Builder(QuestionBonus param1QuestionBonus) {
      super(param1QuestionBonus);
      if (param1QuestionBonus == null)
        return; 
      this.tmoney = param1QuestionBonus.tmoney;
      this.tmoney_plus = param1QuestionBonus.tmoney_plus;
      this.status = param1QuestionBonus.status;
      this.guide_url = param1QuestionBonus.guide_url;
      this.paid_out_text = param1QuestionBonus.paid_out_text;
      this.inputbox_text = param1QuestionBonus.inputbox_text;
      this.card_type = param1QuestionBonus.card_type;
    }
    
    public QuestionBonus build(boolean param1Boolean) {
      return new QuestionBonus(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
