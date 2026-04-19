package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AiCard extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final Long DEFAULT_PA;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Integer DEFAULT_POSITION = Integer.valueOf(0);
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_UK = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long pa;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer position;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String uk;
  
  static {
    DEFAULT_PA = Long.valueOf(0L);
  }
  
  public AiCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.content;
      if (str2 == null) {
        this.content = "";
      } else {
        this.content = str2;
      } 
      Integer integer = paramBuilder.position;
      if (integer == null) {
        this.position = DEFAULT_POSITION;
      } else {
        this.position = integer;
      } 
      Long long_ = paramBuilder.pa;
      if (long_ == null) {
        this.pa = DEFAULT_PA;
      } else {
        this.pa = long_;
      } 
      String str1 = paramBuilder.uk;
      if (str1 == null) {
        this.uk = "";
      } else {
        this.uk = str1;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.content = ((Builder)str).content;
      this.position = ((Builder)str).position;
      this.pa = ((Builder)str).pa;
      this.uk = ((Builder)str).uk;
      this.portrait = ((Builder)str).portrait;
    } 
  }
  
  public static final class Builder extends Message.Builder<AiCard> {
    public String content;
    
    public Long pa;
    
    public String portrait;
    
    public Integer position;
    
    public String title;
    
    public String uk;
    
    public Builder() {}
    
    public Builder(AiCard param1AiCard) {
      super(param1AiCard);
      if (param1AiCard == null)
        return; 
      this.title = param1AiCard.title;
      this.content = param1AiCard.content;
      this.position = param1AiCard.position;
      this.pa = param1AiCard.pa;
      this.uk = param1AiCard.uk;
      this.portrait = param1AiCard.portrait;
    }
    
    public AiCard build(boolean param1Boolean) {
      return new AiCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
