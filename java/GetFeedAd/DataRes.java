package tbclient.GetFeedAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.App;

public final class DataRes extends Message {
  public static final List<App> DEFAULT_FRS;
  
  public static final List<App> DEFAULT_PB_BANNER;
  
  public static final List<App> DEFAULT_PB_COMMENT;
  
  public static final List<App> DEFAULT_RECOM = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<App> frs;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<App> pb_banner;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<App> pb_comment;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<App> recom;
  
  static {
    DEFAULT_FRS = Collections.emptyList();
    DEFAULT_PB_BANNER = Collections.emptyList();
    DEFAULT_PB_COMMENT = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<App> list;
    if (paramBoolean == true) {
      List<App> list1 = paramBuilder.recom;
      if (list1 == null) {
        this.recom = DEFAULT_RECOM;
      } else {
        this.recom = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.frs;
      if (list1 == null) {
        this.frs = DEFAULT_FRS;
      } else {
        this.frs = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.pb_banner;
      if (list1 == null) {
        this.pb_banner = DEFAULT_PB_BANNER;
      } else {
        this.pb_banner = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.pb_comment;
      if (list == null) {
        this.pb_comment = DEFAULT_PB_COMMENT;
      } else {
        this.pb_comment = Message.immutableCopyOf(list);
      } 
    } else {
      this.recom = Message.immutableCopyOf(((Builder)list).recom);
      this.frs = Message.immutableCopyOf(((Builder)list).frs);
      this.pb_banner = Message.immutableCopyOf(((Builder)list).pb_banner);
      this.pb_comment = Message.immutableCopyOf(((Builder)list).pb_comment);
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<App> frs;
    
    public List<App> pb_banner;
    
    public List<App> pb_comment;
    
    public List<App> recom;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.recom = Message.copyOf(param1DataRes.recom);
      this.frs = Message.copyOf(param1DataRes.frs);
      this.pb_banner = Message.copyOf(param1DataRes.pb_banner);
      this.pb_comment = Message.copyOf(param1DataRes.pb_comment);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
