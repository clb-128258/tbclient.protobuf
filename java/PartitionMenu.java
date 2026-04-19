package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class PartitionMenu extends Message {
  public static final Long DEFAULT_SOURCE_ID = Long.valueOf(0L);
  
  public static final List<SortButton> DEFAULT_SUB_MENU = Collections.emptyList();
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long source_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<SortButton> sub_menu;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  public PartitionMenu(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<SortButton> list;
    if (paramBoolean == true) {
      String str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      Long long_ = paramBuilder.source_id;
      if (long_ == null) {
        this.source_id = DEFAULT_SOURCE_ID;
      } else {
        this.source_id = long_;
      } 
      list = paramBuilder.sub_menu;
      if (list == null) {
        this.sub_menu = DEFAULT_SUB_MENU;
      } else {
        this.sub_menu = Message.immutableCopyOf(list);
      } 
    } else {
      this.text = ((Builder)list).text;
      this.source_id = ((Builder)list).source_id;
      this.sub_menu = Message.immutableCopyOf(((Builder)list).sub_menu);
    } 
  }
  
  public static final class Builder extends Message.Builder<PartitionMenu> {
    public Long source_id;
    
    public List<SortButton> sub_menu;
    
    public String text;
    
    public Builder() {}
    
    public Builder(PartitionMenu param1PartitionMenu) {
      super(param1PartitionMenu);
      if (param1PartitionMenu == null)
        return; 
      this.text = param1PartitionMenu.text;
      this.source_id = param1PartitionMenu.source_id;
      this.sub_menu = Message.copyOf(param1PartitionMenu.sub_menu);
    }
    
    public PartitionMenu build(boolean param1Boolean) {
      return new PartitionMenu(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
