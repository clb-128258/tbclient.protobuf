package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedHeadText extends Message {
  public static final Integer DEFAULT_CAN_DEGRADE;
  
  public static final Integer DEFAULT_DEGRADE_LEN;
  
  public static final Integer DEFAULT_DEGRADE_PRIORITY;
  
  public static final String DEFAULT_FONT_SIZE = "";
  
  public static final Integer DEFAULT_FONT_WEIGHT;
  
  public static final Integer DEFAULT_PRIORITY;
  
  public static final String DEFAULT_SUFFIX = "";
  
  public static final String DEFAULT_TEXT = "";
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 9)
  public final BaseTextColor bg_color;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer can_degrade;
  
  @ProtoField(tag = 8)
  public final BaseTextColor color;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer degrade_len;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer degrade_priority;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String font_size;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer font_weight;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer priority;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String suffix;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PRIORITY = integer;
    DEFAULT_CAN_DEGRADE = integer;
    DEFAULT_DEGRADE_LEN = integer;
    DEFAULT_DEGRADE_PRIORITY = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_FONT_WEIGHT = integer;
  }
  
  public FeedHeadText(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str3 = paramBuilder.text;
      if (str3 == null) {
        this.text = "";
      } else {
        this.text = str3;
      } 
      Integer integer2 = paramBuilder.priority;
      if (integer2 == null) {
        this.priority = DEFAULT_PRIORITY;
      } else {
        this.priority = integer2;
      } 
      integer2 = paramBuilder.can_degrade;
      if (integer2 == null) {
        this.can_degrade = DEFAULT_CAN_DEGRADE;
      } else {
        this.can_degrade = integer2;
      } 
      integer2 = paramBuilder.degrade_len;
      if (integer2 == null) {
        this.degrade_len = DEFAULT_DEGRADE_LEN;
      } else {
        this.degrade_len = integer2;
      } 
      integer2 = paramBuilder.degrade_priority;
      if (integer2 == null) {
        this.degrade_priority = DEFAULT_DEGRADE_PRIORITY;
      } else {
        this.degrade_priority = integer2;
      } 
      String str2 = paramBuilder.suffix;
      if (str2 == null) {
        this.suffix = "";
      } else {
        this.suffix = str2;
      } 
      Integer integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      this.color = paramBuilder.color;
      this.bg_color = paramBuilder.bg_color;
      String str1 = paramBuilder.font_size;
      if (str1 == null) {
        this.font_size = "";
      } else {
        this.font_size = str1;
      } 
      integer = paramBuilder.font_weight;
      if (integer == null) {
        this.font_weight = DEFAULT_FONT_WEIGHT;
      } else {
        this.font_weight = integer;
      } 
    } else {
      this.text = ((Builder)integer).text;
      this.priority = ((Builder)integer).priority;
      this.can_degrade = ((Builder)integer).can_degrade;
      this.degrade_len = ((Builder)integer).degrade_len;
      this.degrade_priority = ((Builder)integer).degrade_priority;
      this.suffix = ((Builder)integer).suffix;
      this.type = ((Builder)integer).type;
      this.color = ((Builder)integer).color;
      this.bg_color = ((Builder)integer).bg_color;
      this.font_size = ((Builder)integer).font_size;
      this.font_weight = ((Builder)integer).font_weight;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedHeadText> {
    public BaseTextColor bg_color;
    
    public Integer can_degrade;
    
    public BaseTextColor color;
    
    public Integer degrade_len;
    
    public Integer degrade_priority;
    
    public String font_size;
    
    public Integer font_weight;
    
    public Integer priority;
    
    public String suffix;
    
    public String text;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(FeedHeadText param1FeedHeadText) {
      super(param1FeedHeadText);
      if (param1FeedHeadText == null)
        return; 
      this.text = param1FeedHeadText.text;
      this.priority = param1FeedHeadText.priority;
      this.can_degrade = param1FeedHeadText.can_degrade;
      this.degrade_len = param1FeedHeadText.degrade_len;
      this.degrade_priority = param1FeedHeadText.degrade_priority;
      this.suffix = param1FeedHeadText.suffix;
      this.type = param1FeedHeadText.type;
      this.color = param1FeedHeadText.color;
      this.bg_color = param1FeedHeadText.bg_color;
      this.font_size = param1FeedHeadText.font_size;
      this.font_weight = param1FeedHeadText.font_weight;
    }
    
    public FeedHeadText build(boolean param1Boolean) {
      return new FeedHeadText(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
