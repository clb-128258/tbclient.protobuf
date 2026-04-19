package tbclient.PbList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GameDetail;

public final class PbGamePop extends Message {
  public static final Integer DEFAULT_ALTER_SECONDS;
  
  public static final Integer DEFAULT_ALTER_TIMES;
  
  public static final String DEFAULT_ALTER_URL = "";
  
  public static final List<CommentSimple> DEFAULT_COMMENT;
  
  public static final String DEFAULT_SCHEME_TYPE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer alter_seconds;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer alter_times;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String alter_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<CommentSimple> comment;
  
  @ProtoField(tag = 1)
  public final GameDetail game_detail;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String scheme_type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ALTER_TIMES = integer;
    DEFAULT_ALTER_SECONDS = integer;
    DEFAULT_COMMENT = Collections.emptyList();
  }
  
  public PbGamePop(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.game_detail = paramBuilder.game_detail;
      Integer integer = paramBuilder.alter_times;
      if (integer == null) {
        this.alter_times = DEFAULT_ALTER_TIMES;
      } else {
        this.alter_times = integer;
      } 
      integer = paramBuilder.alter_seconds;
      if (integer == null) {
        this.alter_seconds = DEFAULT_ALTER_SECONDS;
      } else {
        this.alter_seconds = integer;
      } 
      String str1 = paramBuilder.alter_url;
      if (str1 == null) {
        this.alter_url = "";
      } else {
        this.alter_url = str1;
      } 
      List<CommentSimple> list = paramBuilder.comment;
      if (list == null) {
        this.comment = DEFAULT_COMMENT;
      } else {
        this.comment = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.scheme_type;
      if (str == null) {
        this.scheme_type = "";
      } else {
        this.scheme_type = str;
      } 
    } else {
      this.game_detail = ((Builder)str).game_detail;
      this.alter_times = ((Builder)str).alter_times;
      this.alter_seconds = ((Builder)str).alter_seconds;
      this.alter_url = ((Builder)str).alter_url;
      this.comment = Message.immutableCopyOf(((Builder)str).comment);
      this.scheme_type = ((Builder)str).scheme_type;
    } 
  }
  
  public static final class Builder extends Message.Builder<PbGamePop> {
    public Integer alter_seconds;
    
    public Integer alter_times;
    
    public String alter_url;
    
    public List<CommentSimple> comment;
    
    public GameDetail game_detail;
    
    public String scheme_type;
    
    public Builder() {}
    
    public Builder(PbGamePop param1PbGamePop) {
      super(param1PbGamePop);
      if (param1PbGamePop == null)
        return; 
      this.game_detail = param1PbGamePop.game_detail;
      this.alter_times = param1PbGamePop.alter_times;
      this.alter_seconds = param1PbGamePop.alter_seconds;
      this.alter_url = param1PbGamePop.alter_url;
      this.comment = Message.copyOf(param1PbGamePop.comment);
      this.scheme_type = param1PbGamePop.scheme_type;
    }
    
    public PbGamePop build(boolean param1Boolean) {
      return new PbGamePop(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
