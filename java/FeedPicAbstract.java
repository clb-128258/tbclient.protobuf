package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedPicAbstract extends Message {
  public static final List<FeedContentResource> DEFAULT_ABSTRACT;
  
  public static final List<PicInfo> DEFAULT_PICS = Collections.emptyList();
  
  public static final String DEFAULT_PIC_SCHEME = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedContentResource> _abstract;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pic_scheme;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<PicInfo> pics;
  
  static {
    DEFAULT_ABSTRACT = Collections.emptyList();
  }
  
  public FeedPicAbstract(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedContentResource> list;
    if (paramBoolean == true) {
      List<PicInfo> list1 = paramBuilder.pics;
      if (list1 == null) {
        this.pics = DEFAULT_PICS;
      } else {
        this.pics = Message.immutableCopyOf(list1);
      } 
      String str = paramBuilder.pic_scheme;
      if (str == null) {
        this.pic_scheme = "";
      } else {
        this.pic_scheme = str;
      } 
      list = paramBuilder._abstract;
      if (list == null) {
        this._abstract = DEFAULT_ABSTRACT;
      } else {
        this._abstract = Message.immutableCopyOf(list);
      } 
    } else {
      this.pics = Message.immutableCopyOf(((Builder)list).pics);
      this.pic_scheme = ((Builder)list).pic_scheme;
      this._abstract = Message.immutableCopyOf(((Builder)list)._abstract);
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedPicAbstract> {
    public List<FeedContentResource> _abstract;
    
    public String pic_scheme;
    
    public List<PicInfo> pics;
    
    public Builder() {}
    
    public Builder(FeedPicAbstract param1FeedPicAbstract) {
      super(param1FeedPicAbstract);
      if (param1FeedPicAbstract == null)
        return; 
      this.pics = Message.copyOf(param1FeedPicAbstract.pics);
      this.pic_scheme = param1FeedPicAbstract.pic_scheme;
      this._abstract = Message.copyOf(param1FeedPicAbstract._abstract);
    }
    
    public FeedPicAbstract build(boolean param1Boolean) {
      return new FeedPicAbstract(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
