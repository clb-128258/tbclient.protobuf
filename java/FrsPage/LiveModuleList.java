package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class LiveModuleList extends Message {
  public static final String DEFAULT_BACKGROUND_URL = "";
  
  public static final String DEFAULT_FORUM_ID = "";
  
  public static final List<String> DEFAULT_HEAD_LIST;
  
  public static final String DEFAULT_ID = "";
  
  public static final String DEFAULT_JUMP_TYPE = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_MODULE_DESC = "";
  
  public static final List<String> DEFAULT_MODULE_NAME = Collections.emptyList();
  
  public static final String DEFAULT_MODULE_SORT = "";
  
  public static final String DEFAULT_MODULE_TYPE = "";
  
  public static final String DEFAULT_TAG_TEXT = "";
  
  public static final String DEFAULT_TAG_TEXT_COLOR = "";
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String background_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 9, type = Message.Datatype.STRING)
  public final List<String> head_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String id;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String jump_type;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String module_desc;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
  public final List<String> module_name;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String module_sort;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String module_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String tag_text;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String tag_text_color;
  
  static {
    DEFAULT_HEAD_LIST = Collections.emptyList();
  }
  
  public LiveModuleList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str3 = paramBuilder.id;
      if (str3 == null) {
        this.id = "";
      } else {
        this.id = str3;
      } 
      str3 = paramBuilder.forum_id;
      if (str3 == null) {
        this.forum_id = "";
      } else {
        this.forum_id = str3;
      } 
      str3 = paramBuilder.module_type;
      if (str3 == null) {
        this.module_type = "";
      } else {
        this.module_type = str3;
      } 
      List<String> list2 = paramBuilder.module_name;
      if (list2 == null) {
        this.module_name = DEFAULT_MODULE_NAME;
      } else {
        this.module_name = Message.immutableCopyOf(list2);
      } 
      String str2 = paramBuilder.module_desc;
      if (str2 == null) {
        this.module_desc = "";
      } else {
        this.module_desc = str2;
      } 
      str2 = paramBuilder.tag_text;
      if (str2 == null) {
        this.tag_text = "";
      } else {
        this.tag_text = str2;
      } 
      str2 = paramBuilder.tag_text_color;
      if (str2 == null) {
        this.tag_text_color = "";
      } else {
        this.tag_text_color = str2;
      } 
      str2 = paramBuilder.background_url;
      if (str2 == null) {
        this.background_url = "";
      } else {
        this.background_url = str2;
      } 
      List<String> list1 = paramBuilder.head_list;
      if (list1 == null) {
        this.head_list = DEFAULT_HEAD_LIST;
      } else {
        this.head_list = Message.immutableCopyOf(list1);
      } 
      String str1 = paramBuilder.jump_type;
      if (str1 == null) {
        this.jump_type = "";
      } else {
        this.jump_type = str1;
      } 
      str1 = paramBuilder.jump_url;
      if (str1 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str1;
      } 
      str = paramBuilder.module_sort;
      if (str == null) {
        this.module_sort = "";
      } else {
        this.module_sort = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.forum_id = ((Builder)str).forum_id;
      this.module_type = ((Builder)str).module_type;
      this.module_name = Message.immutableCopyOf(((Builder)str).module_name);
      this.module_desc = ((Builder)str).module_desc;
      this.tag_text = ((Builder)str).tag_text;
      this.tag_text_color = ((Builder)str).tag_text_color;
      this.background_url = ((Builder)str).background_url;
      this.head_list = Message.immutableCopyOf(((Builder)str).head_list);
      this.jump_type = ((Builder)str).jump_type;
      this.jump_url = ((Builder)str).jump_url;
      this.module_sort = ((Builder)str).module_sort;
    } 
  }
  
  public static final class Builder extends Message.Builder<LiveModuleList> {
    public String background_url;
    
    public String forum_id;
    
    public List<String> head_list;
    
    public String id;
    
    public String jump_type;
    
    public String jump_url;
    
    public String module_desc;
    
    public List<String> module_name;
    
    public String module_sort;
    
    public String module_type;
    
    public String tag_text;
    
    public String tag_text_color;
    
    public Builder() {}
    
    public Builder(LiveModuleList param1LiveModuleList) {
      super(param1LiveModuleList);
      if (param1LiveModuleList == null)
        return; 
      this.id = param1LiveModuleList.id;
      this.forum_id = param1LiveModuleList.forum_id;
      this.module_type = param1LiveModuleList.module_type;
      this.module_name = Message.copyOf(param1LiveModuleList.module_name);
      this.module_desc = param1LiveModuleList.module_desc;
      this.tag_text = param1LiveModuleList.tag_text;
      this.tag_text_color = param1LiveModuleList.tag_text_color;
      this.background_url = param1LiveModuleList.background_url;
      this.head_list = Message.copyOf(param1LiveModuleList.head_list);
      this.jump_type = param1LiveModuleList.jump_type;
      this.jump_url = param1LiveModuleList.jump_url;
      this.module_sort = param1LiveModuleList.module_sort;
    }
    
    public LiveModuleList build(boolean param1Boolean) {
      return new LiveModuleList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
