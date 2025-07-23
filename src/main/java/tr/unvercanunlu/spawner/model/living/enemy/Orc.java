package tr.unvercanunlu.spawner.model.living.enemy;

import java.util.UUID;
import lombok.ToString;
import tr.unvercanunlu.spawner.config.GameConfig.DefaultOrc;

@ToString(callSuper = true)
public class Orc extends Enemy {

  // custom
  public Orc(UUID id, int health, int stamina, int baseAttack, int baseArmor) {
    super(id, health, stamina, baseAttack, baseArmor);
  }

  // default
  public Orc() {
    this(UUID.randomUUID(), DefaultOrc.HEALTH, DefaultOrc.STAMINA, DefaultOrc.ATTACK, DefaultOrc.ARMOR);
  }

  @Override
  public Enemy clone() {
    // default
    return new Orc();
  }

}
