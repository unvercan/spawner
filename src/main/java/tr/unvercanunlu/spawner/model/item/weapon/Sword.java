package tr.unvercanunlu.spawner.model.item.weapon;

import java.util.UUID;
import lombok.Getter;
import lombok.ToString;
import tr.unvercanunlu.spawner.config.GameConfig.DefaultSword;
import tr.unvercanunlu.spawner.config.GameConfig.MinimumStat;
import tr.unvercanunlu.spawner.model.item.Item;

@ToString(callSuper = true)
public class Sword extends Item {

  @Getter
  private final String name;

  @Getter
  private final int attack;

  // custom
  public Sword(UUID id, String name, int attack) {
    super(id);

    this.name = ((name == null) || name.trim().isEmpty())
        ? DefaultSword.NAME
        : name;

    this.attack = Math.max(attack, MinimumStat.ATTACK); // minimum 0
  }

  // default
  public Sword() {
    this(UUID.randomUUID(), DefaultSword.NAME, DefaultSword.ATTACK);
  }

  @Override
  public Item clone() {
    // default
    return new Sword();
  }

}
