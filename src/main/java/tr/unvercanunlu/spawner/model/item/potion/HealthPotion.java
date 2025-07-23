package tr.unvercanunlu.spawner.model.item.potion;

import java.util.UUID;
import lombok.ToString;
import tr.unvercanunlu.spawner.config.GameConfig.DefaultPotion;

@ToString(callSuper = true)
public class HealthPotion extends Potion {

  // custom
  public HealthPotion(UUID id, int recover, boolean used) {
    super(id, recover, PotionType.HEALTH, used);
  }

  // default
  public HealthPotion() {
    this(UUID.randomUUID(), DefaultPotion.HEALTH_RECOVER, false);
  }

  @Override
  public Potion clone() {
    // default
    return new HealthPotion();
  }

}
