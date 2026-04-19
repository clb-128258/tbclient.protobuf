package tbclient.SidebarHome;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ClassToolsInfo extends Message {
  public static final String DEFAULT_CLASS_NAME = "";
  
  public static final List<ToolBaseInfo> DEFAULT_TOOLS_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String class_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ToolBaseInfo> tools_list;
  
  public ClassToolsInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ToolBaseInfo> list;
    if (paramBoolean == true) {
      String str = paramBuilder.class_name;
      if (str == null) {
        this.class_name = "";
      } else {
        this.class_name = str;
      } 
      list = paramBuilder.tools_list;
      if (list == null) {
        this.tools_list = DEFAULT_TOOLS_LIST;
      } else {
        this.tools_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.class_name = ((Builder)list).class_name;
      this.tools_list = Message.immutableCopyOf(((Builder)list).tools_list);
    } 
  }
  
  public static final class Builder extends Message.Builder<ClassToolsInfo> {
    public String class_name;
    
    public List<ToolBaseInfo> tools_list;
    
    public Builder() {}
    
    public Builder(ClassToolsInfo param1ClassToolsInfo) {
      super(param1ClassToolsInfo);
      if (param1ClassToolsInfo == null)
        return; 
      this.class_name = param1ClassToolsInfo.class_name;
      this.tools_list = Message.copyOf(param1ClassToolsInfo.tools_list);
    }
    
    public ClassToolsInfo build(boolean param1Boolean) {
      return new ClassToolsInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
