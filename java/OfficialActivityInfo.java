package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class OfficialActivityInfo extends Message {
  public static final String DEFAULT_DESC = "";
  
  public static final Long DEFAULT_END_TIME;
  
  public static final Long DEFAULT_ID;
  
  public static final List<OfficialRewardInfo> DEFAULT_REWARDS;
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final Long DEFAULT_START_TIME;
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long end_time;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<OfficialRewardInfo> rewards;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long start_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer type;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    DEFAULT_REWARDS = Collections.emptyList();
    DEFAULT_START_TIME = long_;
    DEFAULT_END_TIME = long_;
  }
  
  public OfficialActivityInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      Long long_2 = paramBuilder.id;
      if (long_2 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_2;
      } 
      String str = paramBuilder.desc;
      if (str == null) {
        this.desc = "";
      } else {
        this.desc = str;
      } 
      str = paramBuilder.scheme;
      if (str == null) {
        this.scheme = "";
      } else {
        this.scheme = str;
      } 
      List<OfficialRewardInfo> list = paramBuilder.rewards;
      if (list == null) {
        this.rewards = DEFAULT_REWARDS;
      } else {
        this.rewards = Message.immutableCopyOf(list);
      } 
      Long long_1 = paramBuilder.start_time;
      if (long_1 == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = long_1;
      } 
      long_ = paramBuilder.end_time;
      if (long_ == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = long_;
      } 
    } else {
      this.type = ((Builder)long_).type;
      this.id = ((Builder)long_).id;
      this.desc = ((Builder)long_).desc;
      this.scheme = ((Builder)long_).scheme;
      this.rewards = Message.immutableCopyOf(((Builder)long_).rewards);
      this.start_time = ((Builder)long_).start_time;
      this.end_time = ((Builder)long_).end_time;
    } 
  }
  
  public static final class Builder extends Message.Builder<OfficialActivityInfo> {
    public String desc;
    
    public Long end_time;
    
    public Long id;
    
    public List<OfficialRewardInfo> rewards;
    
    public String scheme;
    
    public Long start_time;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(OfficialActivityInfo param1OfficialActivityInfo) {
      super(param1OfficialActivityInfo);
      if (param1OfficialActivityInfo == null)
        return; 
      this.type = param1OfficialActivityInfo.type;
      this.id = param1OfficialActivityInfo.id;
      this.desc = param1OfficialActivityInfo.desc;
      this.scheme = param1OfficialActivityInfo.scheme;
      this.rewards = Message.copyOf(param1OfficialActivityInfo.rewards);
      this.start_time = param1OfficialActivityInfo.start_time;
      this.end_time = param1OfficialActivityInfo.end_time;
    }
    
    public OfficialActivityInfo build(boolean param1Boolean) {
      return new OfficialActivityInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
