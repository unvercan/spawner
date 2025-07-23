package tr.unvercanunlu.spawner.component.impl;

import java.util.HashMap;
import java.util.Map;
import tr.unvercanunlu.spawner.component.ISpawner;
import tr.unvercanunlu.spawner.exception.PrototypeNotRegistered;
import tr.unvercanunlu.spawner.model.Prototype;

public abstract class GenericSpawnerImpl<T extends Prototype<T>> implements ISpawner<T> {

  private final Map<String, T> prototypes = new HashMap<>();

  @Override
  public void addPrototype(String name, T object) {
    prototypes.put(name, object);
  }

  @Override
  public void removePrototype(String name) {
    prototypes.remove(name);
  }

  @Override
  public T spawn(String name) {
    if (!prototypes.containsKey(name)) {
      throw new PrototypeNotRegistered(name);
    }

    T object = prototypes.get(name);

    return object.clone();
  }

}
