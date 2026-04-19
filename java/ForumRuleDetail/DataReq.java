package tbclient.ForumRuleDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_CUSTOMIZE_RULE_VERSION;
  
  public static final Long DEFAULT_DEFAULT_RULE_VERSION;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Long DEFAULT_IS_EDIT;
  
  @ProtoField(tag = 2)
  public final CommonReq common;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long customize_rule_version;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long default_rule_version;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long is_edit;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_DEFAULT_RULE_VERSION = long_;
    DEFAULT_CUSTOMIZE_RULE_VERSION = long_;
    DEFAULT_IS_EDIT = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.forum_id;
      if (long_1 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_1;
      } 
      this.common = paramBuilder.common;
      long_1 = paramBuilder.default_rule_version;
      if (long_1 == null) {
        this.default_rule_version = DEFAULT_DEFAULT_RULE_VERSION;
      } else {
        this.default_rule_version = long_1;
      } 
      long_1 = paramBuilder.customize_rule_version;
      if (long_1 == null) {
        this.customize_rule_version = DEFAULT_CUSTOMIZE_RULE_VERSION;
      } else {
        this.customize_rule_version = long_1;
      } 
      long_ = paramBuilder.is_edit;
      if (long_ == null) {
        this.is_edit = DEFAULT_IS_EDIT;
      } else {
        this.is_edit = long_;
      } 
    } else {
      this.forum_id = ((Builder)long_).forum_id;
      this.common = ((Builder)long_).common;
      this.default_rule_version = ((Builder)long_).default_rule_version;
      this.customize_rule_version = ((Builder)long_).customize_rule_version;
      this.is_edit = ((Builder)long_).is_edit;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Long customize_rule_version;
    
    public Long default_rule_version;
    
    public Long forum_id;
    
    public Long is_edit;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.forum_id = param1DataReq.forum_id;
      this.common = param1DataReq.common;
      this.default_rule_version = param1DataReq.default_rule_version;
      this.customize_rule_version = param1DataReq.customize_rule_version;
      this.is_edit = param1DataReq.is_edit;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
