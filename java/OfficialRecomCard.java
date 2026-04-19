package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class OfficialRecomCard extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_BACKGROUND = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final Long DEFAULT_FID;
  
  public static final String DEFAULT_FNAME = "";
  
  public static final Integer DEFAULT_INSERT_FLOOR;
  
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final Long DEFAULT_RECOM_FID;
  
  public static final String DEFAULT_SCHEME = "";
  
  @ProtoField(tag = 7)
  public final OfficialActivityInfo activity;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String background;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long fid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String fname;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer insert_floor;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer is_like;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT64)
  public final Long recom_fid;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String scheme;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_INSERT_FLOOR = integer;
    DEFAULT_IS_LIKE = integer;
    DEFAULT_RECOM_FID = long_;
  }
  
  public OfficialRecomCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.fid;
      if (long_1 == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_1;
      } 
      String str = paramBuilder.fname;
      if (str == null) {
        this.fname = "";
      } else {
        this.fname = str;
      } 
      str = paramBuilder.avatar;
      if (str == null) {
        this.avatar = "";
      } else {
        this.avatar = str;
      } 
      str = paramBuilder.desc;
      if (str == null) {
        this.desc = "";
      } else {
        this.desc = str;
      } 
      str = paramBuilder.background;
      if (str == null) {
        this.background = "";
      } else {
        this.background = str;
      } 
      str = paramBuilder.scheme;
      if (str == null) {
        this.scheme = "";
      } else {
        this.scheme = str;
      } 
      this.activity = paramBuilder.activity;
      Integer integer = paramBuilder.insert_floor;
      if (integer == null) {
        this.insert_floor = DEFAULT_INSERT_FLOOR;
      } else {
        this.insert_floor = integer;
      } 
      integer = paramBuilder.is_like;
      if (integer == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer;
      } 
      long_ = paramBuilder.recom_fid;
      if (long_ == null) {
        this.recom_fid = DEFAULT_RECOM_FID;
      } else {
        this.recom_fid = long_;
      } 
    } else {
      this.fid = ((Builder)long_).fid;
      this.fname = ((Builder)long_).fname;
      this.avatar = ((Builder)long_).avatar;
      this.desc = ((Builder)long_).desc;
      this.background = ((Builder)long_).background;
      this.scheme = ((Builder)long_).scheme;
      this.activity = ((Builder)long_).activity;
      this.insert_floor = ((Builder)long_).insert_floor;
      this.is_like = ((Builder)long_).is_like;
      this.recom_fid = ((Builder)long_).recom_fid;
    } 
  }
  
  public static final class Builder extends Message.Builder<OfficialRecomCard> {
    public OfficialActivityInfo activity;
    
    public String avatar;
    
    public String background;
    
    public String desc;
    
    public Long fid;
    
    public String fname;
    
    public Integer insert_floor;
    
    public Integer is_like;
    
    public Long recom_fid;
    
    public String scheme;
    
    public Builder() {}
    
    public Builder(OfficialRecomCard param1OfficialRecomCard) {
      super(param1OfficialRecomCard);
      if (param1OfficialRecomCard == null)
        return; 
      this.fid = param1OfficialRecomCard.fid;
      this.fname = param1OfficialRecomCard.fname;
      this.avatar = param1OfficialRecomCard.avatar;
      this.desc = param1OfficialRecomCard.desc;
      this.background = param1OfficialRecomCard.background;
      this.scheme = param1OfficialRecomCard.scheme;
      this.activity = param1OfficialRecomCard.activity;
      this.insert_floor = param1OfficialRecomCard.insert_floor;
      this.is_like = param1OfficialRecomCard.is_like;
      this.recom_fid = param1OfficialRecomCard.recom_fid;
    }
    
    public OfficialRecomCard build(boolean param1Boolean) {
      return new OfficialRecomCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
