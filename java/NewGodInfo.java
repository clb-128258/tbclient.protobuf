package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class NewGodInfo extends Message {
  public static final String DEFAULT_CORNER_URL = "";
  
  public static final Integer DEFAULT_FIELD_ID;
  
  public static final String DEFAULT_FIELD_NAME = "";
  
  public static final List<ForumInfo> DEFAULT_FORUM_LIST;
  
  public static final Integer DEFAULT_NEW_GOD_TYPE;
  
  public static final Integer DEFAULT_STATUS;
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_TYPE_NAME = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String corner_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer field_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String field_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<ForumInfo> forum_list;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer new_god_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String type_name;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_STATUS = integer;
    DEFAULT_FIELD_ID = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_FORUM_LIST = Collections.emptyList();
    DEFAULT_NEW_GOD_TYPE = integer;
  }
  
  public NewGodInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.status;
      if (integer2 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer2;
      } 
      integer2 = paramBuilder.field_id;
      if (integer2 == null) {
        this.field_id = DEFAULT_FIELD_ID;
      } else {
        this.field_id = integer2;
      } 
      String str2 = paramBuilder.field_name;
      if (str2 == null) {
        this.field_name = "";
      } else {
        this.field_name = str2;
      } 
      Integer integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      String str1 = paramBuilder.type_name;
      if (str1 == null) {
        this.type_name = "";
      } else {
        this.type_name = str1;
      } 
      str1 = paramBuilder.corner_url;
      if (str1 == null) {
        this.corner_url = "";
      } else {
        this.corner_url = str1;
      } 
      List<ForumInfo> list = paramBuilder.forum_list;
      if (list == null) {
        this.forum_list = DEFAULT_FORUM_LIST;
      } else {
        this.forum_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.new_god_type;
      if (integer == null) {
        this.new_god_type = DEFAULT_NEW_GOD_TYPE;
      } else {
        this.new_god_type = integer;
      } 
    } else {
      this.status = ((Builder)integer).status;
      this.field_id = ((Builder)integer).field_id;
      this.field_name = ((Builder)integer).field_name;
      this.type = ((Builder)integer).type;
      this.type_name = ((Builder)integer).type_name;
      this.corner_url = ((Builder)integer).corner_url;
      this.forum_list = Message.immutableCopyOf(((Builder)integer).forum_list);
      this.new_god_type = ((Builder)integer).new_god_type;
    } 
  }
  
  public static final class Builder extends Message.Builder<NewGodInfo> {
    public String corner_url;
    
    public Integer field_id;
    
    public String field_name;
    
    public List<ForumInfo> forum_list;
    
    public Integer new_god_type;
    
    public Integer status;
    
    public Integer type;
    
    public String type_name;
    
    public Builder() {}
    
    public Builder(NewGodInfo param1NewGodInfo) {
      super(param1NewGodInfo);
      if (param1NewGodInfo == null)
        return; 
      this.status = param1NewGodInfo.status;
      this.field_id = param1NewGodInfo.field_id;
      this.field_name = param1NewGodInfo.field_name;
      this.type = param1NewGodInfo.type;
      this.type_name = param1NewGodInfo.type_name;
      this.corner_url = param1NewGodInfo.corner_url;
      this.forum_list = Message.copyOf(param1NewGodInfo.forum_list);
      this.new_god_type = param1NewGodInfo.new_god_type;
    }
    
    public NewGodInfo build(boolean param1Boolean) {
      return new NewGodInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
