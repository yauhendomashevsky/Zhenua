package learning.collections;

import java.util.Set;

public class SetLearning {

  public static void main(String[] args) {
    Set<String> mySet = BaseCollection.generateFilledSet();

    for (String myString: mySet) {
      if(myString.toUpperCase().startsWith("A")) {
        System.out.println(myString);
      }
    }

    mySet.forEach(element -> {
      if(element.toUpperCase().startsWith("A")) {
        System.out.println(element);
      }
    });
  }

}
