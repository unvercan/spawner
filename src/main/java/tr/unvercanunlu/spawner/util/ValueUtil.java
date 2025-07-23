package tr.unvercanunlu.spawner.util;

import java.util.Objects;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import tr.unvercanunlu.spawner.config.GameConfig.DefaultPlayer;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class ValueUtil {

  private static int playerCounter = 0;

  public static String toString(Object object) {
    return Objects.toString(object, "");
  }

  public static String defaultPlayerName() {
    return String.format(DefaultPlayer.NAME_TEMPLATE, DefaultPlayer.NAME_PREFIX, ++playerCounter);
  }

}
