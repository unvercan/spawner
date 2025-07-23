package tr.unvercanunlu.spawner.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GameConfig {

  @NoArgsConstructor(access = AccessLevel.PRIVATE)
  public static class MinimumStat {

    public static final int HEALTH = 1;
    public static final int STAMINA = 1;
    public static final int ATTACK = 0;
    public static final int ARMOR = 0;
    public static final int LEVEL = 1;
    public static final int RECOVER = 0;
    public static final int EXPERIENCE = 0;

  }

  @NoArgsConstructor(access = AccessLevel.PRIVATE)
  public static class DefaultPotion {

    public static final int HEALTH_RECOVER = 25;
    public static final int STAMINA_RECOVER = 15;

  }

  @NoArgsConstructor(access = AccessLevel.PRIVATE)
  public static class DefaultOrc {

    public static final int HEALTH = 50;
    public static final int STAMINA = 25;
    public static final int ATTACK = 20;
    public static final int ARMOR = 5;

  }

  @NoArgsConstructor(access = AccessLevel.PRIVATE)
  public static class DefaultBandit {

    public static final int HEALTH = 80;
    public static final int STAMINA = 50;
    public static final int ATTACK = 15;
    public static final int ARMOR = 10;

  }

  @NoArgsConstructor(access = AccessLevel.PRIVATE)
  public static class DefaultPlayer {

    public static final String NAME_TEMPLATE = "%s%d";
    public static final String NAME_PREFIX = "Player";
    public static final int HEALTH = 80;
    public static final int STAMINA = 50;
    public static final int LEVEL = 1;
    public static final int EXPERIENCE = 0;

  }

  @NoArgsConstructor(access = AccessLevel.PRIVATE)
  public static class DefaultSword {

    public static final String NAME = "Sword";
    public static final int ATTACK = 15;

  }

  @NoArgsConstructor(access = AccessLevel.PRIVATE)
  public static class DefaultArmor {

    public static final String NAME = "Armor";
    public static final int DEFENCE = 10;

  }

}
