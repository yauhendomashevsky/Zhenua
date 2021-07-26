package learning.collections;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public class QueueLearning {

  public static void main(String[] args) {
    Queue<String> myQueue = BaseCollection.generateFilledQueue();

//    for (int i = 0; i < myQueue.size(); i++) {
//      String value = myQueue
//    }

    for (String elementValue: myQueue) {
      if(elementValue.toUpperCase().startsWith("A")) {
        System.out.println(elementValue);
      }
    }

    System.out.println("***********************************************");

    myQueue.stream()
        .filter(elementValue -> elementValue.toUpperCase().startsWith("A"))
        .forEach(System.out::println);
//        .forEach(System.out::println);
  }
}
