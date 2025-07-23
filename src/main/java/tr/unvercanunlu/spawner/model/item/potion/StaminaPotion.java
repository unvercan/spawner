package tr.unvercanunlu.spawner.model.item.potion;

import java.util.UUID;
import lombok.ToString;
import tr.unvercanunlu.spawner.config.GameConfig.DefaultPotion;

@ToString(callSuper = true)
public class StaminaPotion extends Potion {

  // custom
  public StaminaPotion(UUID id, int recover, boolean used) {
    super(id, recover, PotionType.STAMINA, used);
  }

  // default
  public StaminaPotion() {
    this(UUID.randomUUID(), DefaultPotion.STAMINA_RECOVER, false);
  }

  @Override
  public Potion clone() {
    // default
    return new StaminaPotion();
  }

}
