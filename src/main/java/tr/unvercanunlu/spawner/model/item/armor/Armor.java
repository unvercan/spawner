package tr.unvercanunlu.spawner.model.item.armor;

import java.util.UUID;
import lombok.Getter;
import lombok.ToString;
import tr.unvercanunlu.spawner.config.GameConfig.DefaultArmor;
import tr.unvercanunlu.spawner.config.GameConfig.MinimumStat;
import tr.unvercanunlu.spawner.model.item.Item;

@ToString(callSuper = true)
public class Armor extends Item {

  @Getter
  private final String name;

  @Getter
  private final int defence;

  // custom
  public Armor(UUID id, String name, int defence) {
    super(id);

    this.name = ((name == null) || name.trim().isEmpty())
        ? DefaultArmor.NAME
        : name;

    this.defence = Math.max(defence, MinimumStat.ATTACK); // minimum 0
  }

  // default
  public Armor() {
    this(UUID.randomUUID(), DefaultArmor.NAME, DefaultArmor.DEFENCE);
  }

  @Override
  public Item clone() {
    // default
    return new Armor();
  }

}
