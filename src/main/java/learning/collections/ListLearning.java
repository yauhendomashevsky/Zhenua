package learning.collections;

import java.util.LinkedList;
import java.util.List;

public class ListLearning {

  public static void main(String[] args) {
      List<String> myList = BaseCollection.generateFilledList();

    for (int i = 0; i < myList.size(); i++) {
      if (myList.get(i).toUpperCase().startsWith("W")) {
        System.out.println(myList.get(i));
      }
    }
    System.out.println("\n");

    for (String m: myList) {
      if (m.toUpperCase().startsWith("W")){
        System.out.println(m);
      }
    }
  }
}
