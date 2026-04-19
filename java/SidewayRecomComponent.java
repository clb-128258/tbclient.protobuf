package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class SidewayRecomComponent extends Message {
  public static final List<FeedKV> DEFAULT_APPENDIX;
  
  public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
  
  public static final String DEFAULT_CORNER_URL = "";
  
  public static final List<FeedContentResource> DEFAULT_DESC_RICH;
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM;
  
  public static final List<String> DEFAULT_LOOP_IMGS;
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<FeedKV> appendix;
  
  @ProtoField(tag = 13)
  public final FeedContentIcon background;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<FeedKV> business_info;
  
  @ProtoField(tag = 11)
  public final FeedButton button;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String corner_url;
  
  @ProtoField(tag = 3)
  public final FeedContentText desc;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 15)
  public final List<FeedContentResource> desc_rich;
  
  @ProtoField(tag = 14)
  public final FeedContentIcon icon_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 12)
  public final List<FeedKV> log_param;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 16, type = Message.Datatype.STRING)
  public final List<String> loop_imgs;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 9)
  public final FeedContentText sub_desc;
  
  @ProtoField(tag = 10)
  public final TitleComponent tag_list;
  
  @ProtoField(tag = 2)
  public final FeedContentText title;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    DEFAULT_BUSINESS_INFO = Collections.emptyList();
    DEFAULT_APPENDIX = Collections.emptyList();
    DEFAULT_LOG_PARAM = Collections.emptyList();
    DEFAULT_DESC_RICH = Collections.emptyList();
    DEFAULT_LOOP_IMGS = Collections.emptyList();
  }
  
  public SidewayRecomComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      this.title = paramBuilder.title;
      this.desc = paramBuilder.desc;
      String str2 = paramBuilder.img_url;
      if (str2 == null) {
        this.img_url = "";
      } else {
        this.img_url = str2;
      } 
      str2 = paramBuilder.corner_url;
      if (str2 == null) {
        this.corner_url = "";
      } else {
        this.corner_url = str2;
      } 
      List<FeedKV> list3 = paramBuilder.business_info;
      if (list3 == null) {
        this.business_info = DEFAULT_BUSINESS_INFO;
      } else {
        this.business_info = Message.immutableCopyOf(list3);
      } 
      String str1 = paramBuilder.schema;
      if (str1 == null) {
        this.schema = "";
      } else {
        this.schema = str1;
      } 
      List<FeedKV> list2 = paramBuilder.appendix;
      if (list2 == null) {
        this.appendix = DEFAULT_APPENDIX;
      } else {
        this.appendix = Message.immutableCopyOf(list2);
      } 
      this.sub_desc = paramBuilder.sub_desc;
      this.tag_list = paramBuilder.tag_list;
      this.button = paramBuilder.button;
      list2 = paramBuilder.log_param;
      if (list2 == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list2);
      } 
      this.background = paramBuilder.background;
      this.icon_url = paramBuilder.icon_url;
      List<FeedContentResource> list1 = paramBuilder.desc_rich;
      if (list1 == null) {
        this.desc_rich = DEFAULT_DESC_RICH;
      } else {
        this.desc_rich = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.loop_imgs;
      if (list == null) {
        this.loop_imgs = DEFAULT_LOOP_IMGS;
      } else {
        this.loop_imgs = Message.immutableCopyOf(list);
      } 
    } else {
      this.type = ((Builder)list).type;
      this.title = ((Builder)list).title;
      this.desc = ((Builder)list).desc;
      this.img_url = ((Builder)list).img_url;
      this.corner_url = ((Builder)list).corner_url;
      this.business_info = Message.immutableCopyOf(((Builder)list).business_info);
      this.schema = ((Builder)list).schema;
      this.appendix = Message.immutableCopyOf(((Builder)list).appendix);
      this.sub_desc = ((Builder)list).sub_desc;
      this.tag_list = ((Builder)list).tag_list;
      this.button = ((Builder)list).button;
      this.log_param = Message.immutableCopyOf(((Builder)list).log_param);
      this.background = ((Builder)list).background;
      this.icon_url = ((Builder)list).icon_url;
      this.desc_rich = Message.immutableCopyOf(((Builder)list).desc_rich);
      this.loop_imgs = Message.immutableCopyOf(((Builder)list).loop_imgs);
    } 
  }
  
  public static final class Builder extends Message.Builder<SidewayRecomComponent> {
    public List<FeedKV> appendix;
    
    public FeedContentIcon background;
    
    public List<FeedKV> business_info;
    
    public FeedButton button;
    
    public String corner_url;
    
    public FeedContentText desc;
    
    public List<FeedContentResource> desc_rich;
    
    public FeedContentIcon icon_url;
    
    public String img_url;
    
    public List<FeedKV> log_param;
    
    public List<String> loop_imgs;
    
    public String schema;
    
    public FeedContentText sub_desc;
    
    public TitleComponent tag_list;
    
    public FeedContentText title;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(SidewayRecomComponent param1SidewayRecomComponent) {
      super(param1SidewayRecomComponent);
      if (param1SidewayRecomComponent == null)
        return; 
      this.type = param1SidewayRecomComponent.type;
      this.title = param1SidewayRecomComponent.title;
      this.desc = param1SidewayRecomComponent.desc;
      this.img_url = param1SidewayRecomComponent.img_url;
      this.corner_url = param1SidewayRecomComponent.corner_url;
      this.business_info = Message.copyOf(param1SidewayRecomComponent.business_info);
      this.schema = param1SidewayRecomComponent.schema;
      this.appendix = Message.copyOf(param1SidewayRecomComponent.appendix);
      this.sub_desc = param1SidewayRecomComponent.sub_desc;
      this.tag_list = param1SidewayRecomComponent.tag_list;
      this.button = param1SidewayRecomComponent.button;
      this.log_param = Message.copyOf(param1SidewayRecomComponent.log_param);
      this.background = param1SidewayRecomComponent.background;
      this.icon_url = param1SidewayRecomComponent.icon_url;
      this.desc_rich = Message.copyOf(param1SidewayRecomComponent.desc_rich);
      this.loop_imgs = Message.copyOf(param1SidewayRecomComponent.loop_imgs);
    }
    
    public SidewayRecomComponent build(boolean param1Boolean) {
      return new SidewayRecomComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
