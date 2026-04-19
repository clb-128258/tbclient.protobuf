package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AiChatBotInfo extends Message {
  public static final String DEFAULT_BACKGROUND_URL = "";
  
  public static final Long DEFAULT_BOT_UID;
  
  public static final Long DEFAULT_DIALOGUE_USER_NUM;
  
  public static final String DEFAULT_H5_URL = "";
  
  public static final String DEFAULT_INPUT_BOX_TEXT = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final Long DEFAULT_PA;
  
  public static final Long DEFAULT_PLOT_ID;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_PROLOGUE = "";
  
  public static final String DEFAULT_ROLE_TYPE = "";
  
  public static final String DEFAULT_SEND_TEXT = "";
  
  public static final String DEFAULT_UK = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String background_url;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT64)
  public final Long bot_uid;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT64)
  public final Long dialogue_user_num;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String h5_url;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String input_box_text;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long pa;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT64)
  public final Long plot_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String prologue;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String role_type;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String send_text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String uk;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_PA = long_;
    DEFAULT_PLOT_ID = long_;
    DEFAULT_BOT_UID = long_;
    DEFAULT_DIALOGUE_USER_NUM = long_;
  }
  
  public AiChatBotInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str3 = paramBuilder.uk;
      if (str3 == null) {
        this.uk = "";
      } else {
        this.uk = str3;
      } 
      Long long_2 = paramBuilder.pa;
      if (long_2 == null) {
        this.pa = DEFAULT_PA;
      } else {
        this.pa = long_2;
      } 
      String str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      str2 = paramBuilder.background_url;
      if (str2 == null) {
        this.background_url = "";
      } else {
        this.background_url = str2;
      } 
      str2 = paramBuilder.prologue;
      if (str2 == null) {
        this.prologue = "";
      } else {
        this.prologue = str2;
      } 
      str2 = paramBuilder.send_text;
      if (str2 == null) {
        this.send_text = "";
      } else {
        this.send_text = str2;
      } 
      Long long_1 = paramBuilder.plot_id;
      if (long_1 == null) {
        this.plot_id = DEFAULT_PLOT_ID;
      } else {
        this.plot_id = long_1;
      } 
      long_1 = paramBuilder.bot_uid;
      if (long_1 == null) {
        this.bot_uid = DEFAULT_BOT_UID;
      } else {
        this.bot_uid = long_1;
      } 
      long_1 = paramBuilder.dialogue_user_num;
      if (long_1 == null) {
        this.dialogue_user_num = DEFAULT_DIALOGUE_USER_NUM;
      } else {
        this.dialogue_user_num = long_1;
      } 
      String str1 = paramBuilder.role_type;
      if (str1 == null) {
        this.role_type = "";
      } else {
        this.role_type = str1;
      } 
      str1 = paramBuilder.input_box_text;
      if (str1 == null) {
        this.input_box_text = "";
      } else {
        this.input_box_text = str1;
      } 
      str = paramBuilder.h5_url;
      if (str == null) {
        this.h5_url = "";
      } else {
        this.h5_url = str;
      } 
    } else {
      this.uk = ((Builder)str).uk;
      this.pa = ((Builder)str).pa;
      this.name = ((Builder)str).name;
      this.portrait = ((Builder)str).portrait;
      this.background_url = ((Builder)str).background_url;
      this.prologue = ((Builder)str).prologue;
      this.send_text = ((Builder)str).send_text;
      this.plot_id = ((Builder)str).plot_id;
      this.bot_uid = ((Builder)str).bot_uid;
      this.dialogue_user_num = ((Builder)str).dialogue_user_num;
      this.role_type = ((Builder)str).role_type;
      this.input_box_text = ((Builder)str).input_box_text;
      this.h5_url = ((Builder)str).h5_url;
    } 
  }
  
  public static final class Builder extends Message.Builder<AiChatBotInfo> {
    public String background_url;
    
    public Long bot_uid;
    
    public Long dialogue_user_num;
    
    public String h5_url;
    
    public String input_box_text;
    
    public String name;
    
    public Long pa;
    
    public Long plot_id;
    
    public String portrait;
    
    public String prologue;
    
    public String role_type;
    
    public String send_text;
    
    public String uk;
    
    public Builder() {}
    
    public Builder(AiChatBotInfo param1AiChatBotInfo) {
      super(param1AiChatBotInfo);
      if (param1AiChatBotInfo == null)
        return; 
      this.uk = param1AiChatBotInfo.uk;
      this.pa = param1AiChatBotInfo.pa;
      this.name = param1AiChatBotInfo.name;
      this.portrait = param1AiChatBotInfo.portrait;
      this.background_url = param1AiChatBotInfo.background_url;
      this.prologue = param1AiChatBotInfo.prologue;
      this.send_text = param1AiChatBotInfo.send_text;
      this.plot_id = param1AiChatBotInfo.plot_id;
      this.bot_uid = param1AiChatBotInfo.bot_uid;
      this.dialogue_user_num = param1AiChatBotInfo.dialogue_user_num;
      this.role_type = param1AiChatBotInfo.role_type;
      this.input_box_text = param1AiChatBotInfo.input_box_text;
      this.h5_url = param1AiChatBotInfo.h5_url;
    }
    
    public AiChatBotInfo build(boolean param1Boolean) {
      return new AiChatBotInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
