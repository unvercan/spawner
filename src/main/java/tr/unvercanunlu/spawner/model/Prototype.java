package tr.unvercanunlu.spawner.model;

public interface Prototype<T> extends Cloneable {

  T clone();

}
