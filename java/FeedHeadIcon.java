package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedHeadIcon extends Message {
  public static final Integer DEFAULT_CAN_DEGRADE;
  
  public static final Integer DEFAULT_DEGRADE_HEIGHT;
  
  public static final Integer DEFAULT_DEGRADE_PRIORITY;
  
  public static final String DEFAULT_DEGRADE_URL = "";
  
  public static final Integer DEFAULT_DEGRADE_WIDTH;
  
  public static final Integer DEFAULT_HEIGHT;
  
  public static final Integer DEFAULT_PRIORITY;
  
  public static final String DEFAULT_URL = "";
  
  public static final Integer DEFAULT_WIDTH;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer can_degrade;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer degrade_height;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer degrade_priority;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String degrade_url;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer degrade_width;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer height;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer priority;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer width;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_WIDTH = integer;
    DEFAULT_HEIGHT = integer;
    DEFAULT_PRIORITY = integer;
    DEFAULT_CAN_DEGRADE = integer;
    DEFAULT_DEGRADE_WIDTH = integer;
    DEFAULT_DEGRADE_HEIGHT = integer;
    DEFAULT_DEGRADE_PRIORITY = integer;
  }
  
  public FeedHeadIcon(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.url;
      if (str2 == null) {
        this.url = "";
      } else {
        this.url = str2;
      } 
      Integer integer2 = paramBuilder.width;
      if (integer2 == null) {
        this.width = DEFAULT_WIDTH;
      } else {
        this.width = integer2;
      } 
      integer2 = paramBuilder.height;
      if (integer2 == null) {
        this.height = DEFAULT_HEIGHT;
      } else {
        this.height = integer2;
      } 
      integer2 = paramBuilder.priority;
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
      String str1 = paramBuilder.degrade_url;
      if (str1 == null) {
        this.degrade_url = "";
      } else {
        this.degrade_url = str1;
      } 
      Integer integer1 = paramBuilder.degrade_width;
      if (integer1 == null) {
        this.degrade_width = DEFAULT_DEGRADE_WIDTH;
      } else {
        this.degrade_width = integer1;
      } 
      integer1 = paramBuilder.degrade_height;
      if (integer1 == null) {
        this.degrade_height = DEFAULT_DEGRADE_HEIGHT;
      } else {
        this.degrade_height = integer1;
      } 
      integer = paramBuilder.degrade_priority;
      if (integer == null) {
        this.degrade_priority = DEFAULT_DEGRADE_PRIORITY;
      } else {
        this.degrade_priority = integer;
      } 
    } else {
      this.url = ((Builder)integer).url;
      this.width = ((Builder)integer).width;
      this.height = ((Builder)integer).height;
      this.priority = ((Builder)integer).priority;
      this.can_degrade = ((Builder)integer).can_degrade;
      this.degrade_url = ((Builder)integer).degrade_url;
      this.degrade_width = ((Builder)integer).degrade_width;
      this.degrade_height = ((Builder)integer).degrade_height;
      this.degrade_priority = ((Builder)integer).degrade_priority;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedHeadIcon> {
    public Integer can_degrade;
    
    public Integer degrade_height;
    
    public Integer degrade_priority;
    
    public String degrade_url;
    
    public Integer degrade_width;
    
    public Integer height;
    
    public Integer priority;
    
    public String url;
    
    public Integer width;
    
    public Builder() {}
    
    public Builder(FeedHeadIcon param1FeedHeadIcon) {
      super(param1FeedHeadIcon);
      if (param1FeedHeadIcon == null)
        return; 
      this.url = param1FeedHeadIcon.url;
      this.width = param1FeedHeadIcon.width;
      this.height = param1FeedHeadIcon.height;
      this.priority = param1FeedHeadIcon.priority;
      this.can_degrade = param1FeedHeadIcon.can_degrade;
      this.degrade_url = param1FeedHeadIcon.degrade_url;
      this.degrade_width = param1FeedHeadIcon.degrade_width;
      this.degrade_height = param1FeedHeadIcon.degrade_height;
      this.degrade_priority = param1FeedHeadIcon.degrade_priority;
    }
    
    public FeedHeadIcon build(boolean param1Boolean) {
      return new FeedHeadIcon(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
