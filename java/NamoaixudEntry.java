package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class NamoaixudEntry extends Message {
  public static final String DEFAULT_ACTIVITY_DESC = "";
  
  public static final String DEFAULT_ACTIVITY_LINK_ADDR = "";
  
  public static final String DEFAULT_ACTIVITY_LINK_TYPE = "";
  
  public static final String DEFAULT_ACTIVITY_TIMESTAMP = "";
  
  public static final String DEFAULT_AMOUNT = "";
  
  public static final String DEFAULT_AMOUNT_MSG = "";
  
  public static final String DEFAULT_ENCOURAGE_DESC = "";
  
  public static final String DEFAULT_ENCOURAGE_ICON = "";
  
  public static final String DEFAULT_ENCOURAGE_ICON_DARK = "";
  
  public static final String DEFAULT_GOTO_BUTTON_NAME = "";
  
  public static final String DEFAULT_GOTO_BUTTON_URL = "";
  
  public static final String DEFAULT_LAYOUT_TYPE = "";
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
  
  public static final String DEFAULT_TIP = "";
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String activity_desc;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String activity_link_addr;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String activity_link_type;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String activity_timestamp;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String amount;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String amount_msg;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String encourage_desc;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String encourage_icon;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String encourage_icon_dark;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String goto_button_name;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String goto_button_url;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String layout_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 14)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tip;
  
  public NamoaixudEntry(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      String str = paramBuilder.tip;
      if (str == null) {
        this.tip = "";
      } else {
        this.tip = str;
      } 
      str = paramBuilder.amount;
      if (str == null) {
        this.amount = "";
      } else {
        this.amount = str;
      } 
      str = paramBuilder.amount_msg;
      if (str == null) {
        this.amount_msg = "";
      } else {
        this.amount_msg = str;
      } 
      str = paramBuilder.encourage_icon;
      if (str == null) {
        this.encourage_icon = "";
      } else {
        this.encourage_icon = str;
      } 
      str = paramBuilder.encourage_desc;
      if (str == null) {
        this.encourage_desc = "";
      } else {
        this.encourage_desc = str;
      } 
      str = paramBuilder.goto_button_name;
      if (str == null) {
        this.goto_button_name = "";
      } else {
        this.goto_button_name = str;
      } 
      str = paramBuilder.goto_button_url;
      if (str == null) {
        this.goto_button_url = "";
      } else {
        this.goto_button_url = str;
      } 
      str = paramBuilder.activity_timestamp;
      if (str == null) {
        this.activity_timestamp = "";
      } else {
        this.activity_timestamp = str;
      } 
      str = paramBuilder.activity_desc;
      if (str == null) {
        this.activity_desc = "";
      } else {
        this.activity_desc = str;
      } 
      str = paramBuilder.activity_link_type;
      if (str == null) {
        this.activity_link_type = "";
      } else {
        this.activity_link_type = str;
      } 
      str = paramBuilder.activity_link_addr;
      if (str == null) {
        this.activity_link_addr = "";
      } else {
        this.activity_link_addr = str;
      } 
      str = paramBuilder.layout_type;
      if (str == null) {
        this.layout_type = "";
      } else {
        this.layout_type = str;
      } 
      str = paramBuilder.encourage_icon_dark;
      if (str == null) {
        this.encourage_icon_dark = "";
      } else {
        this.encourage_icon_dark = str;
      } 
      list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
    } else {
      this.tip = ((Builder)list).tip;
      this.amount = ((Builder)list).amount;
      this.amount_msg = ((Builder)list).amount_msg;
      this.encourage_icon = ((Builder)list).encourage_icon;
      this.encourage_desc = ((Builder)list).encourage_desc;
      this.goto_button_name = ((Builder)list).goto_button_name;
      this.goto_button_url = ((Builder)list).goto_button_url;
      this.activity_timestamp = ((Builder)list).activity_timestamp;
      this.activity_desc = ((Builder)list).activity_desc;
      this.activity_link_type = ((Builder)list).activity_link_type;
      this.activity_link_addr = ((Builder)list).activity_link_addr;
      this.layout_type = ((Builder)list).layout_type;
      this.encourage_icon_dark = ((Builder)list).encourage_icon_dark;
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
    } 
  }
  
  public static final class Builder extends Message.Builder<NamoaixudEntry> {
    public String activity_desc;
    
    public String activity_link_addr;
    
    public String activity_link_type;
    
    public String activity_timestamp;
    
    public String amount;
    
    public String amount_msg;
    
    public String encourage_desc;
    
    public String encourage_icon;
    
    public String encourage_icon_dark;
    
    public String goto_button_name;
    
    public String goto_button_url;
    
    public String layout_type;
    
    public List<FeedKV> log_param;
    
    public String tip;
    
    public Builder() {}
    
    public Builder(NamoaixudEntry param1NamoaixudEntry) {
      super(param1NamoaixudEntry);
      if (param1NamoaixudEntry == null)
        return; 
      this.tip = param1NamoaixudEntry.tip;
      this.amount = param1NamoaixudEntry.amount;
      this.amount_msg = param1NamoaixudEntry.amount_msg;
      this.encourage_icon = param1NamoaixudEntry.encourage_icon;
      this.encourage_desc = param1NamoaixudEntry.encourage_desc;
      this.goto_button_name = param1NamoaixudEntry.goto_button_name;
      this.goto_button_url = param1NamoaixudEntry.goto_button_url;
      this.activity_timestamp = param1NamoaixudEntry.activity_timestamp;
      this.activity_desc = param1NamoaixudEntry.activity_desc;
      this.activity_link_type = param1NamoaixudEntry.activity_link_type;
      this.activity_link_addr = param1NamoaixudEntry.activity_link_addr;
      this.layout_type = param1NamoaixudEntry.layout_type;
      this.encourage_icon_dark = param1NamoaixudEntry.encourage_icon_dark;
      this.log_param = Message.copyOf(param1NamoaixudEntry.log_param);
    }
    
    public NamoaixudEntry build(boolean param1Boolean) {
      return new NamoaixudEntry(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
