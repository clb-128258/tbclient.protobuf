package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedDynamicTag extends Message {
  public static final Boolean DEFAULT_IS_POSITIVE;
  
  public static final String DEFAULT_NEGATIVE_SCHEMA = "";
  
  public static final List<FeedContentResource> DEFAULT_NEGATIVE_TEXT = Collections.emptyList();
  
  public static final String DEFAULT_POSITIVE_SCHEMA = "";
  
  public static final List<FeedContentResource> DEFAULT_POSITIVE_TEXT = Collections.emptyList();
  
  public static final String DEFAULT_TYPE = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.BOOL)
  public final Boolean is_positive;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String negative_schema;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedContentResource> negative_text;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String positive_schema;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedContentResource> positive_text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String type;
  
  static {
    DEFAULT_IS_POSITIVE = Boolean.FALSE;
  }
  
  public FeedDynamicTag(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.type;
      if (str2 == null) {
        this.type = "";
      } else {
        this.type = str2;
      } 
      List<FeedContentResource> list = paramBuilder.negative_text;
      if (list == null) {
        this.negative_text = DEFAULT_NEGATIVE_TEXT;
      } else {
        this.negative_text = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.positive_text;
      if (list == null) {
        this.positive_text = DEFAULT_POSITIVE_TEXT;
      } else {
        this.positive_text = Message.immutableCopyOf(list);
      } 
      Boolean bool = paramBuilder.is_positive;
      if (bool == null) {
        this.is_positive = DEFAULT_IS_POSITIVE;
      } else {
        this.is_positive = bool;
      } 
      String str1 = paramBuilder.negative_schema;
      if (str1 == null) {
        this.negative_schema = "";
      } else {
        this.negative_schema = str1;
      } 
      str = paramBuilder.positive_schema;
      if (str == null) {
        this.positive_schema = "";
      } else {
        this.positive_schema = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.negative_text = Message.immutableCopyOf(((Builder)str).negative_text);
      this.positive_text = Message.immutableCopyOf(((Builder)str).positive_text);
      this.is_positive = ((Builder)str).is_positive;
      this.negative_schema = ((Builder)str).negative_schema;
      this.positive_schema = ((Builder)str).positive_schema;
    } 
  }
  
  public static final class Builder extends Message.Builder<FeedDynamicTag> {
    public Boolean is_positive;
    
    public String negative_schema;
    
    public List<FeedContentResource> negative_text;
    
    public String positive_schema;
    
    public List<FeedContentResource> positive_text;
    
    public String type;
    
    public Builder() {}
    
    public Builder(FeedDynamicTag param1FeedDynamicTag) {
      super(param1FeedDynamicTag);
      if (param1FeedDynamicTag == null)
        return; 
      this.type = param1FeedDynamicTag.type;
      this.negative_text = Message.copyOf(param1FeedDynamicTag.negative_text);
      this.positive_text = Message.copyOf(param1FeedDynamicTag.positive_text);
      this.is_positive = param1FeedDynamicTag.is_positive;
      this.negative_schema = param1FeedDynamicTag.negative_schema;
      this.positive_schema = param1FeedDynamicTag.positive_schema;
    }
    
    public FeedDynamicTag build(boolean param1Boolean) {
      return new FeedDynamicTag(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
