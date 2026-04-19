package tbclient.ForumRuleDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BawuRoleInfoPub;
import tbclient.ForumInfo;
import tbclient.ForumRule;

public final class DataRes extends Message {
  public static final String DEFAULT_AUDIT_OPINION = "";
  
  public static final Integer DEFAULT_AUDIT_STATUS;
  
  public static final String DEFAULT_CUR_TIME = "";
  
  public static final List<NewForumRule> DEFAULT_DEFAULT_RULES;
  
  public static final Long DEFAULT_FORUM_RULE_ID;
  
  public static final Integer DEFAULT_IS_MANAGER;
  
  public static final List<NewForumRule> DEFAULT_NEW_RULES;
  
  public static final String DEFAULT_PREFACE = "";
  
  public static final String DEFAULT_PUBLISH_TIME = "";
  
  public static final List<ForumRule> DEFAULT_RULES = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String audit_opinion;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer audit_status;
  
  @ProtoField(tag = 11)
  public final BawuRoleInfoPub bazhu;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String cur_time;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 13)
  public final List<NewForumRule> default_rules;
  
  @ProtoField(tag = 2)
  public final ForumInfo forum;
  
  @ProtoField(tag = 15)
  public final ForumRuleConf forum_rule_conf;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long forum_rule_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer is_manager;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 14)
  public final List<NewForumRule> new_rules;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String preface;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String publish_time;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<ForumRule> rules;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_AUDIT_STATUS = integer;
    DEFAULT_IS_MANAGER = integer;
    DEFAULT_FORUM_RULE_ID = Long.valueOf(0L);
    DEFAULT_DEFAULT_RULES = Collections.emptyList();
    DEFAULT_NEW_RULES = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.forum = paramBuilder.forum;
      String str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      str3 = paramBuilder.preface;
      if (str3 == null) {
        this.preface = "";
      } else {
        this.preface = str3;
      } 
      List<ForumRule> list1 = paramBuilder.rules;
      if (list1 == null) {
        this.rules = DEFAULT_RULES;
      } else {
        this.rules = Message.immutableCopyOf(list1);
      } 
      Integer integer2 = paramBuilder.audit_status;
      if (integer2 == null) {
        this.audit_status = DEFAULT_AUDIT_STATUS;
      } else {
        this.audit_status = integer2;
      } 
      String str2 = paramBuilder.audit_opinion;
      if (str2 == null) {
        this.audit_opinion = "";
      } else {
        this.audit_opinion = str2;
      } 
      Integer integer1 = paramBuilder.is_manager;
      if (integer1 == null) {
        this.is_manager = DEFAULT_IS_MANAGER;
      } else {
        this.is_manager = integer1;
      } 
      Long long_ = paramBuilder.forum_rule_id;
      if (long_ == null) {
        this.forum_rule_id = DEFAULT_FORUM_RULE_ID;
      } else {
        this.forum_rule_id = long_;
      } 
      String str1 = paramBuilder.publish_time;
      if (str1 == null) {
        this.publish_time = "";
      } else {
        this.publish_time = str1;
      } 
      this.bazhu = paramBuilder.bazhu;
      str1 = paramBuilder.cur_time;
      if (str1 == null) {
        this.cur_time = "";
      } else {
        this.cur_time = str1;
      } 
      List<NewForumRule> list = paramBuilder.default_rules;
      if (list == null) {
        this.default_rules = DEFAULT_DEFAULT_RULES;
      } else {
        this.default_rules = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.new_rules;
      if (list == null) {
        this.new_rules = DEFAULT_NEW_RULES;
      } else {
        this.new_rules = Message.immutableCopyOf(list);
      } 
      this.forum_rule_conf = paramBuilder.forum_rule_conf;
    } else {
      this.forum = paramBuilder.forum;
      this.title = paramBuilder.title;
      this.preface = paramBuilder.preface;
      this.rules = Message.immutableCopyOf(paramBuilder.rules);
      this.audit_status = paramBuilder.audit_status;
      this.audit_opinion = paramBuilder.audit_opinion;
      this.is_manager = paramBuilder.is_manager;
      this.forum_rule_id = paramBuilder.forum_rule_id;
      this.publish_time = paramBuilder.publish_time;
      this.bazhu = paramBuilder.bazhu;
      this.cur_time = paramBuilder.cur_time;
      this.default_rules = Message.immutableCopyOf(paramBuilder.default_rules);
      this.new_rules = Message.immutableCopyOf(paramBuilder.new_rules);
      this.forum_rule_conf = paramBuilder.forum_rule_conf;
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public String audit_opinion;
    
    public Integer audit_status;
    
    public BawuRoleInfoPub bazhu;
    
    public String cur_time;
    
    public List<NewForumRule> default_rules;
    
    public ForumInfo forum;
    
    public ForumRuleConf forum_rule_conf;
    
    public Long forum_rule_id;
    
    public Integer is_manager;
    
    public List<NewForumRule> new_rules;
    
    public String preface;
    
    public String publish_time;
    
    public List<ForumRule> rules;
    
    public String title;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.forum = param1DataRes.forum;
      this.title = param1DataRes.title;
      this.preface = param1DataRes.preface;
      this.rules = Message.copyOf(param1DataRes.rules);
      this.audit_status = param1DataRes.audit_status;
      this.audit_opinion = param1DataRes.audit_opinion;
      this.is_manager = param1DataRes.is_manager;
      this.forum_rule_id = param1DataRes.forum_rule_id;
      this.publish_time = param1DataRes.publish_time;
      this.bazhu = param1DataRes.bazhu;
      this.cur_time = param1DataRes.cur_time;
      this.default_rules = Message.copyOf(param1DataRes.default_rules);
      this.new_rules = Message.copyOf(param1DataRes.new_rules);
      this.forum_rule_conf = param1DataRes.forum_rule_conf;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
