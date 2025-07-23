package tr.unvercanunlu.spawner.model.living;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import tr.unvercanunlu.spawner.util.ValueUtil;
import tr.unvercanunlu.spawner.config.GameConfig.DefaultPlayer;
import tr.unvercanunlu.spawner.config.GameConfig.MinimumStat;
import tr.unvercanunlu.spawner.model.Prototype;

@ToString(callSuper = true)
public class Player extends Living implements Prototype<Player> {

  @Getter
  private final String name;

  @Getter
  @Setter
  private int level;

  @Getter
  @Setter
  private int experience;

  // custom
  public Player(UUID id, int health, int stamina, String name, int level, int experience) {
    super(id, health, stamina);

    this.name = ((name == null) || name.trim().isEmpty())
        ? ValueUtil.defaultPlayerName()
        : name;

    this.level = Math.max(level, MinimumStat.LEVEL); // minimum 1
    this.experience = Math.max(experience, MinimumStat.EXPERIENCE); // minimum 0
  }

  // default
  public Player() {
    this(UUID.randomUUID(), DefaultPlayer.HEALTH, DefaultPlayer.STAMINA, ValueUtil.defaultPlayerName(), DefaultPlayer.LEVEL,
        DefaultPlayer.EXPERIENCE);
  }

  @Override
  public Player clone() {
    // default
    return new Player();
  }

}
