package d2.socket;

import d2.socket.ISocketable;

public interface Skull extends ISocketable {

  int regenAmount();
  int stealAmount();
  int attakersTakeDamageAmount();

}
