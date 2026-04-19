package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeedKV;
import tbclient.MiniGame;

public final class ProfileGameInfo extends Message {
  public static final List<Game> DEFAULT_BANNER;
  
  public static final List<Game> DEFAULT_GAME = Collections.emptyList();
  
  public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
  
  public static final List<MiniGame> DEFAULT_MINI_GAME;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<Game> banner;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<Game> game;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedKV> log_param;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<MiniGame> mini_game;
  
  @ProtoField(tag = 5)
  public final Link module_link;
  
  static {
    DEFAULT_BANNER = Collections.emptyList();
    DEFAULT_MINI_GAME = Collections.emptyList();
  }
  
  public ProfileGameInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<Game> list3 = paramBuilder.game;
      if (list3 == null) {
        this.game = DEFAULT_GAME;
      } else {
        this.game = Message.immutableCopyOf(list3);
      } 
      List<FeedKV> list2 = paramBuilder.log_param;
      if (list2 == null) {
        this.log_param = DEFAULT_LOG_PARAM;
      } else {
        this.log_param = Message.immutableCopyOf(list2);
      } 
      List<Game> list1 = paramBuilder.banner;
      if (list1 == null) {
        this.banner = DEFAULT_BANNER;
      } else {
        this.banner = Message.immutableCopyOf(list1);
      } 
      List<MiniGame> list = paramBuilder.mini_game;
      if (list == null) {
        this.mini_game = DEFAULT_MINI_GAME;
      } else {
        this.mini_game = Message.immutableCopyOf(list);
      } 
      this.module_link = paramBuilder.module_link;
    } else {
      this.game = Message.immutableCopyOf(paramBuilder.game);
      this.log_param = Message.immutableCopyOf(paramBuilder.log_param);
      this.banner = Message.immutableCopyOf(paramBuilder.banner);
      this.mini_game = Message.immutableCopyOf(paramBuilder.mini_game);
      this.module_link = paramBuilder.module_link;
    } 
  }
  
  public static final class Builder extends Message.Builder<ProfileGameInfo> {
    public List<Game> banner;
    
    public List<Game> game;
    
    public List<FeedKV> log_param;
    
    public List<MiniGame> mini_game;
    
    public Link module_link;
    
    public Builder() {}
    
    public Builder(ProfileGameInfo param1ProfileGameInfo) {
      super(param1ProfileGameInfo);
      if (param1ProfileGameInfo == null)
        return; 
      this.game = Message.copyOf(param1ProfileGameInfo.game);
      this.log_param = Message.copyOf(param1ProfileGameInfo.log_param);
      this.banner = Message.copyOf(param1ProfileGameInfo.banner);
      this.mini_game = Message.copyOf(param1ProfileGameInfo.mini_game);
      this.module_link = param1ProfileGameInfo.module_link;
    }
    
    public ProfileGameInfo build(boolean param1Boolean) {
      return new ProfileGameInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
