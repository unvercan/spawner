package tr.unvercanunlu.spawner.model;

import java.util.UUID;
import lombok.Getter;
import lombok.ToString;

@ToString
public abstract class GameObject {

  @Getter
  private final UUID id;

  protected GameObject(UUID id) {
    this.id = id;
  }

}
