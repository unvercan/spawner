package tr.unvercanunlu.spawner.model.item.potion;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import tr.unvercanunlu.spawner.config.GameConfig.MinimumStat;
import tr.unvercanunlu.spawner.model.item.Item;

@ToString(callSuper = true)
public abstract class Potion extends Item implements Cloneable {

  @Getter
  private final int recover;

  @Getter
  private final PotionType type;

  @Getter
  @Setter
  private boolean used;

  protected Potion(UUID id, int recover, PotionType type, boolean used) {
    super(id);

    this.recover = Math.max(recover, MinimumStat.RECOVER); // minimum 0
    this.type = (type == null) ? PotionType.EMPTY : type; // default empty
    this.used = used;
  }

  @Override
  public abstract Potion clone();

}
