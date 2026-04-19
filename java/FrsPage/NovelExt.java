package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThemeColorInfo;

public final class NovelExt extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final Long DEFAULT_CHAPTER_TIME = Long.valueOf(0L);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 4)
  public final ThemeColorInfo chapter_bg_color;
  
  @ProtoField(tag = 5)
  public final ThemeColorInfo chapter_name_color;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long chapter_time;
  
  @ProtoField(tag = 6)
  public final ThemeColorInfo chapter_time_color;
  
  @ProtoField(tag = 3)
  public final ThemeColorInfo new_labels;
  
  public NovelExt(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.chapter_time;
      if (long_ == null) {
        this.chapter_time = DEFAULT_CHAPTER_TIME;
      } else {
        this.chapter_time = long_;
      } 
      String str = paramBuilder._abstract;
      if (str == null) {
        this._abstract = "";
      } else {
        this._abstract = str;
      } 
      this.new_labels = paramBuilder.new_labels;
      this.chapter_bg_color = paramBuilder.chapter_bg_color;
      this.chapter_name_color = paramBuilder.chapter_name_color;
      this.chapter_time_color = paramBuilder.chapter_time_color;
    } else {
      this.chapter_time = paramBuilder.chapter_time;
      this._abstract = paramBuilder._abstract;
      this.new_labels = paramBuilder.new_labels;
      this.chapter_bg_color = paramBuilder.chapter_bg_color;
      this.chapter_name_color = paramBuilder.chapter_name_color;
      this.chapter_time_color = paramBuilder.chapter_time_color;
    } 
  }
  
  public static final class Builder extends Message.Builder<NovelExt> {
    public String _abstract;
    
    public ThemeColorInfo chapter_bg_color;
    
    public ThemeColorInfo chapter_name_color;
    
    public Long chapter_time;
    
    public ThemeColorInfo chapter_time_color;
    
    public ThemeColorInfo new_labels;
    
    public Builder() {}
    
    public Builder(NovelExt param1NovelExt) {
      super(param1NovelExt);
      if (param1NovelExt == null)
        return; 
      this.chapter_time = param1NovelExt.chapter_time;
      this._abstract = param1NovelExt._abstract;
      this.new_labels = param1NovelExt.new_labels;
      this.chapter_bg_color = param1NovelExt.chapter_bg_color;
      this.chapter_name_color = param1NovelExt.chapter_name_color;
      this.chapter_time_color = param1NovelExt.chapter_time_color;
    }
    
    public NovelExt build(boolean param1Boolean) {
      return new NovelExt(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
