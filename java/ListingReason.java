package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ListingReason extends Message {
  public static final List<String> DEFAULT_IMG_LIST = Collections.emptyList();
  
  public static final String DEFAULT_SUB_TITLE = "";
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
  public final List<String> img_list;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String sub_title;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  public ListingReason(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      List<String> list = paramBuilder.img_list;
      if (list == null) {
        this.img_list = DEFAULT_IMG_LIST;
      } else {
        this.img_list = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.sub_title;
      if (str == null) {
        this.sub_title = "";
      } else {
        this.sub_title = str;
      } 
    } else {
      this.text = ((Builder)str).text;
      this.img_list = Message.immutableCopyOf(((Builder)str).img_list);
      this.sub_title = ((Builder)str).sub_title;
    } 
  }
  
  public static final class Builder extends Message.Builder<ListingReason> {
    public List<String> img_list;
    
    public String sub_title;
    
    public String text;
    
    public Builder() {}
    
    public Builder(ListingReason param1ListingReason) {
      super(param1ListingReason);
      if (param1ListingReason == null)
        return; 
      this.text = param1ListingReason.text;
      this.img_list = Message.copyOf(param1ListingReason.img_list);
      this.sub_title = param1ListingReason.sub_title;
    }
    
    public ListingReason build(boolean param1Boolean) {
      return new ListingReason(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
