package tr.unvercanunlu.spawner.model.living;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import tr.unvercanunlu.spawner.config.GameConfig.MinimumStat;
import tr.unvercanunlu.spawner.model.GameObject;

@ToString(callSuper = true)
public abstract class Living extends GameObject {

  @Setter
  @Getter
  private int health;

  @Setter
  @Getter
  private int stamina;

  protected Living(UUID id, int health, int stamina) {
    super(id);

    this.health = Math.max(health, MinimumStat.HEALTH); // minimum 1
    this.stamina = Math.max(stamina, MinimumStat.STAMINA); // minimum 1
  }

}
