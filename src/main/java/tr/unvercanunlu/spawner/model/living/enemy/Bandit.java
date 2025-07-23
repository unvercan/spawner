package tr.unvercanunlu.spawner.model.living.enemy;

import java.util.UUID;
import lombok.ToString;
import tr.unvercanunlu.spawner.config.GameConfig.DefaultBandit;

@ToString(callSuper = true)
public class Bandit extends Enemy {

  // custom
  public Bandit(UUID id, int health, int stamina, int baseAttack, int baseArmor) {
    super(id, health, stamina, baseAttack, baseArmor);
  }

  // default
  public Bandit() {
    this(UUID.randomUUID(), DefaultBandit.HEALTH, DefaultBandit.STAMINA, DefaultBandit.ATTACK, DefaultBandit.ARMOR);
  }

  @Override
  public Enemy clone() {
    // default
    return new Bandit();
  }

}
