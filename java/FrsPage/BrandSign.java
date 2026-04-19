package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class BrandSign extends Message {
  public static final Integer DEFAULT_COUNT;
  
  public static final String DEFAULT_EXT = "";
  
  public static final Boolean DEFAULT_SIGNED = Boolean.FALSE;
  
  public static final List<BrandAward> DEFAULT_SIGN_DETAIL;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer count;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String ext;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<BrandAward> sign_detail;
  
  @ProtoField(tag = 1, type = Message.Datatype.BOOL)
  public final Boolean signed;
  
  static {
    DEFAULT_COUNT = Integer.valueOf(0);
    DEFAULT_SIGN_DETAIL = Collections.emptyList();
  }
  
  public BrandSign(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<BrandAward> list;
    if (paramBoolean == true) {
      Boolean bool = paramBuilder.signed;
      if (bool == null) {
        this.signed = DEFAULT_SIGNED;
      } else {
        this.signed = bool;
      } 
      Integer integer = paramBuilder.count;
      if (integer == null) {
        this.count = DEFAULT_COUNT;
      } else {
        this.count = integer;
      } 
      String str = paramBuilder.ext;
      if (str == null) {
        this.ext = "";
      } else {
        this.ext = str;
      } 
      list = paramBuilder.sign_detail;
      if (list == null) {
        this.sign_detail = DEFAULT_SIGN_DETAIL;
      } else {
        this.sign_detail = Message.immutableCopyOf(list);
      } 
    } else {
      this.signed = ((Builder)list).signed;
      this.count = ((Builder)list).count;
      this.ext = ((Builder)list).ext;
      this.sign_detail = Message.immutableCopyOf(((Builder)list).sign_detail);
    } 
  }
  
  public static final class Builder extends Message.Builder<BrandSign> {
    public Integer count;
    
    public String ext;
    
    public List<BrandAward> sign_detail;
    
    public Boolean signed;
    
    public Builder() {}
    
    public Builder(BrandSign param1BrandSign) {
      super(param1BrandSign);
      if (param1BrandSign == null)
        return; 
      this.signed = param1BrandSign.signed;
      this.count = param1BrandSign.count;
      this.ext = param1BrandSign.ext;
      this.sign_detail = Message.copyOf(param1BrandSign.sign_detail);
    }
    
    public BrandSign build(boolean param1Boolean) {
      return new BrandSign(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
