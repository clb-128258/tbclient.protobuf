package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ChatPrivate extends Message {
  public static final Long DEFAULT_BOT_ID;
  
  public static final Integer DEFAULT_CAN_SHOW;
  
  public static final Long DEFAULT_HEIGHT;
  
  public static final Integer DEFAULT_NO_MSG;
  
  public static final Long DEFAULT_PLOT_ID;
  
  public static final String DEFAULT_URL = "";
  
  public static final String DEFAULT_URL_RES = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long bot_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer can_show;
  
  @ProtoField(tag = 5)
  public final ChatSug chat_sug;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long height;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer no_msg;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long plot_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url_res;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_HEIGHT = long_;
    DEFAULT_BOT_ID = long_;
    DEFAULT_PLOT_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_NO_MSG = integer;
    DEFAULT_CAN_SHOW = integer;
  }
  
  public ChatPrivate(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
      str = paramBuilder.url_res;
      if (str == null) {
        this.url_res = "";
      } else {
        this.url_res = str;
      } 
      Long long_ = paramBuilder.height;
      if (long_ == null) {
        this.height = DEFAULT_HEIGHT;
      } else {
        this.height = long_;
      } 
      long_ = paramBuilder.bot_id;
      if (long_ == null) {
        this.bot_id = DEFAULT_BOT_ID;
      } else {
        this.bot_id = long_;
      } 
      this.chat_sug = paramBuilder.chat_sug;
      long_ = paramBuilder.plot_id;
      if (long_ == null) {
        this.plot_id = DEFAULT_PLOT_ID;
      } else {
        this.plot_id = long_;
      } 
      Integer integer1 = paramBuilder.no_msg;
      if (integer1 == null) {
        this.no_msg = DEFAULT_NO_MSG;
      } else {
        this.no_msg = integer1;
      } 
      integer = paramBuilder.can_show;
      if (integer == null) {
        this.can_show = DEFAULT_CAN_SHOW;
      } else {
        this.can_show = integer;
      } 
    } else {
      this.url = ((Builder)integer).url;
      this.url_res = ((Builder)integer).url_res;
      this.height = ((Builder)integer).height;
      this.bot_id = ((Builder)integer).bot_id;
      this.chat_sug = ((Builder)integer).chat_sug;
      this.plot_id = ((Builder)integer).plot_id;
      this.no_msg = ((Builder)integer).no_msg;
      this.can_show = ((Builder)integer).can_show;
    } 
  }
  
  public static final class Builder extends Message.Builder<ChatPrivate> {
    public Long bot_id;
    
    public Integer can_show;
    
    public ChatSug chat_sug;
    
    public Long height;
    
    public Integer no_msg;
    
    public Long plot_id;
    
    public String url;
    
    public String url_res;
    
    public Builder() {}
    
    public Builder(ChatPrivate param1ChatPrivate) {
      super(param1ChatPrivate);
      if (param1ChatPrivate == null)
        return; 
      this.url = param1ChatPrivate.url;
      this.url_res = param1ChatPrivate.url_res;
      this.height = param1ChatPrivate.height;
      this.bot_id = param1ChatPrivate.bot_id;
      this.chat_sug = param1ChatPrivate.chat_sug;
      this.plot_id = param1ChatPrivate.plot_id;
      this.no_msg = param1ChatPrivate.no_msg;
      this.can_show = param1ChatPrivate.can_show;
    }
    
    public ChatPrivate build(boolean param1Boolean) {
      return new ChatPrivate(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
