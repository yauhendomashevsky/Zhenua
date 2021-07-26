package d2.socket;

import java.util.HashMap;
import java.util.Map;

public class Armor implements IArmorWithSockets {

  private String armorName;
  private int numberOfOpenSockets;
  private int maxSocketsNumber;
  private int minSocketsNumber;
  private Map<Integer, ISocketable> sockets;

  public Armor(String armorName, int minSocketsNumber, int maxSocketsNumber) {
    this.armorName = armorName;
    this.minSocketsNumber = minSocketsNumber;
    this.maxSocketsNumber = maxSocketsNumber;
    this.sockets = new HashMap<>();
    this.numberOfOpenSockets = generateSocket(minSocketsNumber, maxSocketsNumber);
  }

  @Override
  public int getMinSocketsNumber() {
    return this.minSocketsNumber;
  }

  @Override
  public int getMaxSocketsNumber() {
    return this.maxSocketsNumber;
  }

  @Override
  public int getSocketsCount() {
    return this.numberOfOpenSockets;
  }

  public int insertSocket(ISocketable gem){
    sockets.put(this.numberOfOpenSockets,gem);
    if (numberOfOpenSockets == 0){
      System.out.println("Non open sockeds");
    }
      return numberOfOpenSockets--;
  }

  public void showSockets() {
    sockets.forEach((k,v) -> System.out.println("In socket "+k+" we have "+ v.gemType()));
  }

  public String getArmorName() {
    return armorName;
  }
}
