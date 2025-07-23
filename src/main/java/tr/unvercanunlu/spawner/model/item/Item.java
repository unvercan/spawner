package tr.unvercanunlu.spawner.model.item;

import java.util.UUID;
import lombok.ToString;
import tr.unvercanunlu.spawner.model.GameObject;
import tr.unvercanunlu.spawner.model.Prototype;

@ToString(callSuper = true)
public abstract class Item extends GameObject implements Prototype<Item> {

  protected Item(UUID id) {
    super(id);
  }

  @Override
  public abstract Item clone();

}
