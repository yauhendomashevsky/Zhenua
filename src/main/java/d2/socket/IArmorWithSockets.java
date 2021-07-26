package d2.socket;

import java.util.Random;

public interface IArmorWithSockets {

  default int generateSocket(int minSocketsNumber, int maxSocketsNumber) {
    Random random = new Random();
    return random.nextInt(maxSocketsNumber - minSocketsNumber) + minSocketsNumber;
  }

  int getMinSocketsNumber();
  int getMaxSocketsNumber();
  int getSocketsCount();

}
