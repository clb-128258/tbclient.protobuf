package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SpriteMemeInfo extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final Long DEFAULT_MEME_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_MEME_PACKAGE_SCHEME = "";
  
  public static final Integer DEFAULT_MEME_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_QUERY = "";
  
  public static final String DEFAULT_USE_SAME_GUIDE = "";
  
  public static final String DEFAULT_USE_SAME_TEXT = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long meme_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String meme_package_scheme;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer meme_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String query;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String use_same_guide;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String use_same_text;
  
  public SpriteMemeInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.meme_id;
      if (long_ == null) {
        this.meme_id = DEFAULT_MEME_ID;
      } else {
        this.meme_id = long_;
      } 
      String str = paramBuilder.query;
      if (str == null) {
        this.query = "";
      } else {
        this.query = str;
      } 
      str = paramBuilder.icon;
      if (str == null) {
        this.icon = "";
      } else {
        this.icon = str;
      } 
      str = paramBuilder.use_same_guide;
      if (str == null) {
        this.use_same_guide = "";
      } else {
        this.use_same_guide = str;
      } 
      str = paramBuilder.use_same_text;
      if (str == null) {
        this.use_same_text = "";
      } else {
        this.use_same_text = str;
      } 
      str = paramBuilder.meme_package_scheme;
      if (str == null) {
        this.meme_package_scheme = "";
      } else {
        this.meme_package_scheme = str;
      } 
      integer = paramBuilder.meme_type;
      if (integer == null) {
        this.meme_type = DEFAULT_MEME_TYPE;
      } else {
        this.meme_type = integer;
      } 
    } else {
      this.meme_id = ((Builder)integer).meme_id;
      this.query = ((Builder)integer).query;
      this.icon = ((Builder)integer).icon;
      this.use_same_guide = ((Builder)integer).use_same_guide;
      this.use_same_text = ((Builder)integer).use_same_text;
      this.meme_package_scheme = ((Builder)integer).meme_package_scheme;
      this.meme_type = ((Builder)integer).meme_type;
    } 
  }
  
  public static final class Builder extends Message.Builder<SpriteMemeInfo> {
    public String icon;
    
    public Long meme_id;
    
    public String meme_package_scheme;
    
    public Integer meme_type;
    
    public String query;
    
    public String use_same_guide;
    
    public String use_same_text;
    
    public Builder() {}
    
    public Builder(SpriteMemeInfo param1SpriteMemeInfo) {
      super(param1SpriteMemeInfo);
      if (param1SpriteMemeInfo == null)
        return; 
      this.meme_id = param1SpriteMemeInfo.meme_id;
      this.query = param1SpriteMemeInfo.query;
      this.icon = param1SpriteMemeInfo.icon;
      this.use_same_guide = param1SpriteMemeInfo.use_same_guide;
      this.use_same_text = param1SpriteMemeInfo.use_same_text;
      this.meme_package_scheme = param1SpriteMemeInfo.meme_package_scheme;
      this.meme_type = param1SpriteMemeInfo.meme_type;
    }
    
    public SpriteMemeInfo build(boolean param1Boolean) {
      return new SpriteMemeInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
