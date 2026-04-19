package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeedKV;

public final class CommonPopupData extends Message {
  public static final String DEFAULT_BTN_SCHEMA = "";
  
  public static final String DEFAULT_BTN_TEXT = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
  
  public static final String DEFAULT_POPUP_TYPE = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String btn_schema;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String btn_text;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<FeedKV> log_param;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String popup_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public CommonPopupData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedKV> list;
    if (paramBoolean == true) {
      String str = paramBuilder.popup_type;
      if (str == null) {
        this.popup_type = "";
      } else {
        this.popup_type = str;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.desc;
      if (str == null) {
        this.desc = "";
      } else {
        this.desc = str;
      } 
      str = paramBuilder.icon_url;
      if (str == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str;
      } 
      str = paramBuilder.btn_text;
      if (str == null) {
        this.btn_text = "";
      } else {
        this.btn_text = str;
      } 
      str = paramBuilder.btn_schema;
      if (str == null) {
        this.btn_schema = "";
      } else {
        this.btn_schema = str;
      } 
      list = paramBuilder.log_param;
      if (list == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list);
      } 
    } else {
      this.popup_type = ((Builder)list).popup_type;
      this.title = ((Builder)list).title;
      this.desc = ((Builder)list).desc;
      this.icon_url = ((Builder)list).icon_url;
      this.btn_text = ((Builder)list).btn_text;
      this.btn_schema = ((Builder)list).btn_schema;
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
    } 
  }
  
  public static final class Builder extends Message.Builder<CommonPopupData> {
    public String btn_schema;
    
    public String btn_text;
    
    public String desc;
    
    public String icon_url;
    
    public List<FeedKV> log_param;
    
    public String popup_type;
    
    public String title;
    
    public Builder() {}
    
    public Builder(CommonPopupData param1CommonPopupData) {
      super(param1CommonPopupData);
      if (param1CommonPopupData == null)
        return; 
      this.popup_type = param1CommonPopupData.popup_type;
      this.title = param1CommonPopupData.title;
      this.desc = param1CommonPopupData.desc;
      this.icon_url = param1CommonPopupData.icon_url;
      this.btn_text = param1CommonPopupData.btn_text;
      this.btn_schema = param1CommonPopupData.btn_schema;
      this.log_param = Message.copyOf(param1CommonPopupData.log_param);
    }
    
    public CommonPopupData build(boolean param1Boolean) {
      return new CommonPopupData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
