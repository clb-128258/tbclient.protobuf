package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FrsRanPopupInfo extends Message {
  public static final String DEFAULT_BUSINESS_ID = "";
  
  public static final Double DEFAULT_ITEM_SCORE = Double.valueOf(0.0D);
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final List<PopupPostInfo> DEFAULT_POST_LIST = Collections.emptyList();
  
  public static final Long DEFAULT_TID = Long.valueOf(0L);
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String business_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.DOUBLE)
  public final Double item_score;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<PopupPostInfo> post_list;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long tid;
  
  public FrsRanPopupInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.pic_url;
      if (str1 == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str1;
      } 
      Double double_ = paramBuilder.item_score;
      if (double_ == null) {
        this.item_score = DEFAULT_ITEM_SCORE;
      } else {
        this.item_score = double_;
      } 
      List<PopupPostInfo> list = paramBuilder.post_list;
      if (list == null) {
        this.post_list = DEFAULT_POST_LIST;
      } else {
        this.post_list = Message.immutableCopyOf(list);
      } 
      Long long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
      str = paramBuilder.business_id;
      if (str == null) {
        this.business_id = "";
      } else {
        this.business_id = str;
      } 
    } else {
      this.pic_url = ((Builder)str).pic_url;
      this.item_score = ((Builder)str).item_score;
      this.post_list = Message.immutableCopyOf(((Builder)str).post_list);
      this.tid = ((Builder)str).tid;
      this.business_id = ((Builder)str).business_id;
    } 
  }
  
  public static final class Builder extends Message.Builder<FrsRanPopupInfo> {
    public String business_id;
    
    public Double item_score;
    
    public String pic_url;
    
    public List<PopupPostInfo> post_list;
    
    public Long tid;
    
    public Builder() {}
    
    public Builder(FrsRanPopupInfo param1FrsRanPopupInfo) {
      super(param1FrsRanPopupInfo);
      if (param1FrsRanPopupInfo == null)
        return; 
      this.pic_url = param1FrsRanPopupInfo.pic_url;
      this.item_score = param1FrsRanPopupInfo.item_score;
      this.post_list = Message.copyOf(param1FrsRanPopupInfo.post_list);
      this.tid = param1FrsRanPopupInfo.tid;
      this.business_id = param1FrsRanPopupInfo.business_id;
    }
    
    public FrsRanPopupInfo build(boolean param1Boolean) {
      return new FrsRanPopupInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
