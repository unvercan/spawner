package tr.unvercanunlu.spawner.exception;

import lombok.Getter;
import tr.unvercanunlu.spawner.util.ValueUtil;
import tr.unvercanunlu.spawner.config.ErrorMessage;

public class PrototypeNotRegistered extends RuntimeException {

  @Getter
  private final String name;

  public PrototypeNotRegistered(String name) {
    super(ErrorMessage.PROTOTYPE_NOT_REGISTERED.formatted(ValueUtil.toString(name)));

    this.name = name;
  }

}
