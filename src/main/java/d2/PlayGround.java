package d2;

import d2.socket.Armor;
import d2.socket.Chipped;
import d2.socket.ISocketable;

public class PlayGround {

  public static void main(String[] args) {
    ISocketable amethyst = new Chipped().getAmethystGem();
    amethyst.socketableHelm();

    Armor bodyArmor = new Armor("MyArmor", 0, 5);
    System.out.println(bodyArmor.getSocketsCount());
    bodyArmor.insertSocket(amethyst);
    System.out.println(bodyArmor.getSocketsCount());
    bodyArmor.showSockets();
    System.out.printf("I'm an armor with name %s with %s sockets%n", bodyArmor.getArmorName(), bodyArmor.getSocketsCount());
  }
}
