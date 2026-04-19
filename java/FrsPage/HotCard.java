package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PubCardFreq;
import tbclient.ThemeColorInfo;
import tbclient.ThreadInfo;

public final class HotCard extends Message {
  public static final Integer DEFAULT_CARD_OFFSET;
  
  public static final String DEFAULT_CARD_TITLE = "";
  
  public static final String DEFAULT_JUMP_LINK = "";
  
  public static final String DEFAULT_JUMP_TEXT = "";
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  @ProtoField(tag = 2)
  public final ThemeColorInfo card_background;
  
  @ProtoField(tag = 8)
  public final ThemeColorInfo card_icon;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer card_offset;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String card_title;
  
  @ProtoField(tag = 9)
  public final PubCardFreq freq;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String jump_link;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String jump_text;
  
  @ProtoField(tag = 3)
  public final ThemeColorInfo post_color;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<ThreadInfo> thread_list;
  
  static {
    DEFAULT_CARD_OFFSET = Integer.valueOf(0);
  }
  
  public HotCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str2 = paramBuilder.card_title;
      if (str2 == null) {
        this.card_title = "";
      } else {
        this.card_title = str2;
      } 
      this.card_background = paramBuilder.card_background;
      this.post_color = paramBuilder.post_color;
      str2 = paramBuilder.jump_text;
      if (str2 == null) {
        this.jump_text = "";
      } else {
        this.jump_text = str2;
      } 
      List<ThreadInfo> list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
      Integer integer = paramBuilder.card_offset;
      if (integer == null) {
        this.card_offset = DEFAULT_CARD_OFFSET;
      } else {
        this.card_offset = integer;
      } 
      String str1 = paramBuilder.jump_link;
      if (str1 == null) {
        this.jump_link = "";
      } else {
        this.jump_link = str1;
      } 
      this.card_icon = paramBuilder.card_icon;
      this.freq = paramBuilder.freq;
    } else {
      this.card_title = paramBuilder.card_title;
      this.card_background = paramBuilder.card_background;
      this.post_color = paramBuilder.post_color;
      this.jump_text = paramBuilder.jump_text;
      this.thread_list = Message.immutableCopyOf(paramBuilder.thread_list);
      this.card_offset = paramBuilder.card_offset;
      this.jump_link = paramBuilder.jump_link;
      this.card_icon = paramBuilder.card_icon;
      this.freq = paramBuilder.freq;
    } 
  }
  
  public static final class Builder extends Message.Builder<HotCard> {
    public ThemeColorInfo card_background;
    
    public ThemeColorInfo card_icon;
    
    public Integer card_offset;
    
    public String card_title;
    
    public PubCardFreq freq;
    
    public String jump_link;
    
    public String jump_text;
    
    public ThemeColorInfo post_color;
    
    public List<ThreadInfo> thread_list;
    
    public Builder() {}
    
    public Builder(HotCard param1HotCard) {
      super(param1HotCard);
      if (param1HotCard == null)
        return; 
      this.card_title = param1HotCard.card_title;
      this.card_background = param1HotCard.card_background;
      this.post_color = param1HotCard.post_color;
      this.jump_text = param1HotCard.jump_text;
      this.thread_list = Message.copyOf(param1HotCard.thread_list);
      this.card_offset = param1HotCard.card_offset;
      this.jump_link = param1HotCard.jump_link;
      this.card_icon = param1HotCard.card_icon;
      this.freq = param1HotCard.freq;
    }
    
    public HotCard build(boolean param1Boolean) {
      return new HotCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
