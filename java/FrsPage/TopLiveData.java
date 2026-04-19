package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.YyExt;

public final class TopLiveData extends Message {
  public static final String DEFAULT_COVER = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_FLV = "";
  
  public static final String DEFAULT_HLS = "";
  
  public static final Integer DEFAULT_JUMP_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_LIVE_SIZE = "";
  
  public static final List<TopLiveDataPostList> DEFAULT_POST_LIST = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 11)
  public final TopLiveDataAnchorUserInfo anchor_user_info;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String cover;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String flv;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String hls;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer jump_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String live_size;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 10)
  public final List<TopLiveDataPostList> post_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 9)
  public final YyExt yy_ext;
  
  public TopLiveData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.cover;
      if (str2 == null) {
        this.cover = "";
      } else {
        this.cover = str2;
      } 
      str2 = paramBuilder.desc;
      if (str2 == null) {
        this.desc = "";
      } else {
        this.desc = str2;
      } 
      str2 = paramBuilder.live_size;
      if (str2 == null) {
        this.live_size = "";
      } else {
        this.live_size = str2;
      } 
      Integer integer = paramBuilder.jump_type;
      if (integer == null) {
        this.jump_type = DEFAULT_JUMP_TYPE;
      } else {
        this.jump_type = integer;
      } 
      String str1 = paramBuilder.jump_url;
      if (str1 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str1;
      } 
      str1 = paramBuilder.flv;
      if (str1 == null) {
        this.flv = "";
      } else {
        this.flv = str1;
      } 
      str1 = paramBuilder.hls;
      if (str1 == null) {
        this.hls = "";
      } else {
        this.hls = str1;
      } 
      this.yy_ext = paramBuilder.yy_ext;
      List<TopLiveDataPostList> list = paramBuilder.post_list;
      if (list == null) {
        this.post_list = DEFAULT_POST_LIST;
      } else {
        this.post_list = Message.immutableCopyOf(list);
      } 
      this.anchor_user_info = paramBuilder.anchor_user_info;
    } else {
      this.title = paramBuilder.title;
      this.cover = paramBuilder.cover;
      this.desc = paramBuilder.desc;
      this.live_size = paramBuilder.live_size;
      this.jump_type = paramBuilder.jump_type;
      this.jump_url = paramBuilder.jump_url;
      this.flv = paramBuilder.flv;
      this.hls = paramBuilder.hls;
      this.yy_ext = paramBuilder.yy_ext;
      this.post_list = Message.immutableCopyOf(paramBuilder.post_list);
      this.anchor_user_info = paramBuilder.anchor_user_info;
    } 
  }
  
  public static final class Builder extends Message.Builder<TopLiveData> {
    public TopLiveDataAnchorUserInfo anchor_user_info;
    
    public String cover;
    
    public String desc;
    
    public String flv;
    
    public String hls;
    
    public Integer jump_type;
    
    public String jump_url;
    
    public String live_size;
    
    public List<TopLiveDataPostList> post_list;
    
    public String title;
    
    public YyExt yy_ext;
    
    public Builder() {}
    
    public Builder(TopLiveData param1TopLiveData) {
      super(param1TopLiveData);
      if (param1TopLiveData == null)
        return; 
      this.title = param1TopLiveData.title;
      this.cover = param1TopLiveData.cover;
      this.desc = param1TopLiveData.desc;
      this.live_size = param1TopLiveData.live_size;
      this.jump_type = param1TopLiveData.jump_type;
      this.jump_url = param1TopLiveData.jump_url;
      this.flv = param1TopLiveData.flv;
      this.hls = param1TopLiveData.hls;
      this.yy_ext = param1TopLiveData.yy_ext;
      this.post_list = Message.copyOf(param1TopLiveData.post_list);
      this.anchor_user_info = param1TopLiveData.anchor_user_info;
    }
    
    public TopLiveData build(boolean param1Boolean) {
      return new TopLiveData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
