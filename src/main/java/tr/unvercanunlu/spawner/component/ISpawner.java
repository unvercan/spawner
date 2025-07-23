package tr.unvercanunlu.spawner.component;

public interface ISpawner<T> {

  void addPrototype(String name, T object);

  void removePrototype(String name);

  T spawn(String name);

}
