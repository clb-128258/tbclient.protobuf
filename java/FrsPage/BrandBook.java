package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BrandBook extends Message {
  public static final Long DEFAULT_BOOK_NUM;
  
  public static final Long DEFAULT_END_TIME;
  
  public static final String DEFAULT_EXT = "";
  
  public static final Boolean DEFAULT_IS_BOOK = Boolean.FALSE;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long book_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long end_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String ext;
  
  @ProtoField(tag = 1, type = Message.Datatype.BOOL)
  public final Boolean is_book;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_BOOK_NUM = long_;
    DEFAULT_END_TIME = long_;
  }
  
  public BrandBook(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Boolean bool = paramBuilder.is_book;
      if (bool == null) {
        this.is_book = DEFAULT_IS_BOOK;
      } else {
        this.is_book = bool;
      } 
      Long long_ = paramBuilder.book_num;
      if (long_ == null) {
        this.book_num = DEFAULT_BOOK_NUM;
      } else {
        this.book_num = long_;
      } 
      long_ = paramBuilder.end_time;
      if (long_ == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = long_;
      } 
      str = paramBuilder.ext;
      if (str == null) {
        this.ext = "";
      } else {
        this.ext = str;
      } 
    } else {
      this.is_book = ((Builder)str).is_book;
      this.book_num = ((Builder)str).book_num;
      this.end_time = ((Builder)str).end_time;
      this.ext = ((Builder)str).ext;
    } 
  }
  
  public static final class Builder extends Message.Builder<BrandBook> {
    public Long book_num;
    
    public Long end_time;
    
    public String ext;
    
    public Boolean is_book;
    
    public Builder() {}
    
    public Builder(BrandBook param1BrandBook) {
      super(param1BrandBook);
      if (param1BrandBook == null)
        return; 
      this.is_book = param1BrandBook.is_book;
      this.book_num = param1BrandBook.book_num;
      this.end_time = param1BrandBook.end_time;
      this.ext = param1BrandBook.ext;
    }
    
    public BrandBook build(boolean param1Boolean) {
      return new BrandBook(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
