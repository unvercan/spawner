package tr.unvercanunlu.spawner.model.living.enemy;

import java.util.UUID;
import lombok.Getter;
import lombok.ToString;
import tr.unvercanunlu.spawner.config.GameConfig.MinimumStat;
import tr.unvercanunlu.spawner.model.Prototype;
import tr.unvercanunlu.spawner.model.living.Living;

@ToString(callSuper = true)
public abstract class Enemy extends Living implements Prototype<Enemy> {

  @Getter
  private final int attack;

  @Getter
  private final int armor;

  protected Enemy(UUID id, int health, int stamina, int attack, int armor) {
    super(id, health, stamina);

    this.attack = Math.max(attack, MinimumStat.ATTACK); // minimum 0
    this.armor = Math.max(armor, MinimumStat.ARMOR); // minimum 0
  }

  public abstract Enemy clone();

}
