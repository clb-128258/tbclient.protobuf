package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SortButton extends Message {
  public static final Integer DEFAULT_IS_SELECTED;
  
  public static final Integer DEFAULT_SOURCE_ID;
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_selected;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer source_id;
  
  @ProtoField(tag = 3)
  public final FrsTabInfo tab_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SOURCE_ID = integer;
    DEFAULT_IS_SELECTED = integer;
  }
  
  public SortButton(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      Integer integer1 = paramBuilder.source_id;
      if (integer1 == null) {
        this.source_id = DEFAULT_SOURCE_ID;
      } else {
        this.source_id = integer1;
      } 
      this.tab_info = paramBuilder.tab_info;
      integer = paramBuilder.is_selected;
      if (integer == null) {
        this.is_selected = DEFAULT_IS_SELECTED;
      } else {
        this.is_selected = integer;
      } 
    } else {
      this.text = ((Builder)integer).text;
      this.source_id = ((Builder)integer).source_id;
      this.tab_info = ((Builder)integer).tab_info;
      this.is_selected = ((Builder)integer).is_selected;
    } 
  }
  
  public static final class Builder extends Message.Builder<SortButton> {
    public Integer is_selected;
    
    public Integer source_id;
    
    public FrsTabInfo tab_info;
    
    public String text;
    
    public Builder() {}
    
    public Builder(SortButton param1SortButton) {
      super(param1SortButton);
      if (param1SortButton == null)
        return; 
      this.text = param1SortButton.text;
      this.source_id = param1SortButton.source_id;
      this.tab_info = param1SortButton.tab_info;
      this.is_selected = param1SortButton.is_selected;
    }
    
    public SortButton build(boolean param1Boolean) {
      return new SortButton(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
