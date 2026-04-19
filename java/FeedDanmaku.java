package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedDanmaku extends Message {
  public static final List<Danmaku> DEFAULT_DANMAKU = Collections.emptyList();
  
  public static final Integer DEFAULT_LINES;
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final List<FeedContentResource> DEFAULT_TITLE = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<Danmaku> danmaku;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer lines;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedContentResource> title;
  
  static {
    DEFAULT_LINES = Integer.valueOf(0);
  }
  
  public FeedDanmaku(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<Danmaku> list1 = paramBuilder.danmaku;
      if (list1 == null) {
        this.danmaku = DEFAULT_DANMAKU;
      } else {
        this.danmaku = Message.immutableCopyOf(list1);
      } 
      List<FeedContentResource> list = paramBuilder.title;
      if (list == null) {
        this.title = DEFAULT_TITLE;
      } else {
        this.title = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.scheme;
      if (str == null) {
        this.scheme = "";
      } else {
        this.scheme = str;
      } 
      integer = paramBuilder.lines;
      if (integer == null) {
        this.lines = DEFAULT_LINES;
      } else {
        this.lines = integer;
      } 
    } else {
      this.danmaku = Message.immutableCopyOf(((Builder)integer).danmaku);
      this.title = Message.immutableCopyOf(((Builder)integer).title);
      this.scheme = ((Builder)integer).scheme;
      this.lines = ((Builder)integer).lines;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedDanmaku> {
    public List<Danmaku> danmaku;
    
    public Integer lines;
    
    public String scheme;
    
    public List<FeedContentResource> title;
    
    public Builder() {}
    
    public Builder(FeedDanmaku param1FeedDanmaku) {
      super(param1FeedDanmaku);
      if (param1FeedDanmaku == null)
        return; 
      this.danmaku = Message.copyOf(param1FeedDanmaku.danmaku);
      this.title = Message.copyOf(param1FeedDanmaku.title);
      this.scheme = param1FeedDanmaku.scheme;
      this.lines = param1FeedDanmaku.lines;
    }
    
    public FeedDanmaku build(boolean param1Boolean) {
      return new FeedDanmaku(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
