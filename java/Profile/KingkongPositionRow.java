package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class KingkongPositionRow extends Message {
  public static final Integer DEFAULT_ACTION_TYPE;
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_ICON_SRC = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final Long DEFAULT_LAST_UPDATE_TIME = Long.valueOf(0L);
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_UNI_ID;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer action_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon_src;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long last_update_time;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer uni_id;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_UNI_ID = integer;
    DEFAULT_ACTION_TYPE = integer;
  }
  
  public KingkongPositionRow(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.icon_src;
      if (str == null) {
        this.icon_src = "";
      } else {
        this.icon_src = str;
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
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
      Long long_ = paramBuilder.last_update_time;
      if (long_ == null) {
        this.last_update_time = DEFAULT_LAST_UPDATE_TIME;
      } else {
        this.last_update_time = long_;
      } 
      Integer integer1 = paramBuilder.uni_id;
      if (integer1 == null) {
        this.uni_id = DEFAULT_UNI_ID;
      } else {
        this.uni_id = integer1;
      } 
      integer = paramBuilder.action_type;
      if (integer == null) {
        this.action_type = DEFAULT_ACTION_TYPE;
      } else {
        this.action_type = integer;
      } 
    } else {
      this.icon_src = ((Builder)integer).icon_src;
      this.title = ((Builder)integer).title;
      this.desc = ((Builder)integer).desc;
      this.jump_url = ((Builder)integer).jump_url;
      this.last_update_time = ((Builder)integer).last_update_time;
      this.uni_id = ((Builder)integer).uni_id;
      this.action_type = ((Builder)integer).action_type;
    } 
  }
  
  public static final class Builder extends Message.Builder<KingkongPositionRow> {
    public Integer action_type;
    
    public String desc;
    
    public String icon_src;
    
    public String jump_url;
    
    public Long last_update_time;
    
    public String title;
    
    public Integer uni_id;
    
    public Builder() {}
    
    public Builder(KingkongPositionRow param1KingkongPositionRow) {
      super(param1KingkongPositionRow);
      if (param1KingkongPositionRow == null)
        return; 
      this.icon_src = param1KingkongPositionRow.icon_src;
      this.title = param1KingkongPositionRow.title;
      this.desc = param1KingkongPositionRow.desc;
      this.jump_url = param1KingkongPositionRow.jump_url;
      this.last_update_time = param1KingkongPositionRow.last_update_time;
      this.uni_id = param1KingkongPositionRow.uni_id;
      this.action_type = param1KingkongPositionRow.action_type;
    }
    
    public KingkongPositionRow build(boolean param1Boolean) {
      return new KingkongPositionRow(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
