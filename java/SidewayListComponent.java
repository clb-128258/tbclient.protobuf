package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class SidewayListComponent extends Message {
  public static final String DEFAULT_BACKGROUND = "";
  
  public static final List<SidewayRecomComponent> DEFAULT_CONTENT;
  
  public static final String DEFAULT_INDICATOR = "";
  
  public static final Integer DEFAULT_IS_SWIPE;
  
  public static final Integer DEFAULT_SCREEN_MAX_NUM;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TITLE_BACKGROUND = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String background;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<SidewayRecomComponent> content;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String indicator;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer is_swipe;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer screen_max_num;
  
  @ProtoField(tag = 6)
  public final SidewayListSeeMore see_more;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title_background;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SCREEN_MAX_NUM = integer;
    DEFAULT_CONTENT = Collections.emptyList();
    DEFAULT_IS_SWIPE = integer;
  }
  
  public SidewayListComponent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.screen_max_num;
      if (integer2 == null) {
        this.screen_max_num = DEFAULT_SCREEN_MAX_NUM;
      } else {
        this.screen_max_num = integer2;
      } 
      List<SidewayRecomComponent> list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.title_background;
      if (str1 == null) {
        this.title_background = "";
      } else {
        this.title_background = str1;
      } 
      str1 = paramBuilder.background;
      if (str1 == null) {
        this.background = "";
      } else {
        this.background = str1;
      } 
      this.see_more = paramBuilder.see_more;
      Integer integer1 = paramBuilder.is_swipe;
      if (integer1 == null) {
        this.is_swipe = DEFAULT_IS_SWIPE;
      } else {
        this.is_swipe = integer1;
      } 
      str = paramBuilder.indicator;
      if (str == null) {
        this.indicator = "";
      } else {
        this.indicator = str;
      } 
    } else {
      this.screen_max_num = ((Builder)str).screen_max_num;
      this.content = Message.immutableCopyOf(((Builder)str).content);
      this.title = ((Builder)str).title;
      this.title_background = ((Builder)str).title_background;
      this.background = ((Builder)str).background;
      this.see_more = ((Builder)str).see_more;
      this.is_swipe = ((Builder)str).is_swipe;
      this.indicator = ((Builder)str).indicator;
    } 
  }
  
  public static final class Builder extends Message.Builder<SidewayListComponent> {
    public String background;
    
    public List<SidewayRecomComponent> content;
    
    public String indicator;
    
    public Integer is_swipe;
    
    public Integer screen_max_num;
    
    public SidewayListSeeMore see_more;
    
    public String title;
    
    public String title_background;
    
    public Builder() {}
    
    public Builder(SidewayListComponent param1SidewayListComponent) {
      super(param1SidewayListComponent);
      if (param1SidewayListComponent == null)
        return; 
      this.screen_max_num = param1SidewayListComponent.screen_max_num;
      this.content = Message.copyOf(param1SidewayListComponent.content);
      this.title = param1SidewayListComponent.title;
      this.title_background = param1SidewayListComponent.title_background;
      this.background = param1SidewayListComponent.background;
      this.see_more = param1SidewayListComponent.see_more;
      this.is_swipe = param1SidewayListComponent.is_swipe;
      this.indicator = param1SidewayListComponent.indicator;
    }
    
    public SidewayListComponent build(boolean param1Boolean) {
      return new SidewayListComponent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
