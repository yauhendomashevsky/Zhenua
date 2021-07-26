package learning.collections;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.apache.commons.lang3.RandomStringUtils;

public class BaseCollection {

  public static Queue<String> generateFilledQueue() {
    Queue<String> queue = new ArrayDeque<>();
    for (int i = 0; i < 20; i++) {
      queue.add(RandomStringUtils.randomAlphabetic(10));
    }
    return queue;
  }

  public static Set<String> generateFilledSet() {
    Set<String> set = new HashSet<>();
    for (int i = 0; i < 20; i++) {
      set.add(RandomStringUtils.randomAlphabetic(10));
    }
    return set;
  }

  public static List<String> generateFilledList() {
    List<String> list = new LinkedList<>();
    for (int i = 0; i < 30; i++) {
      list.add(RandomStringUtils.randomAlphabetic(10));
    }
    return list;
  }
  public static Map<Integer,String> genFilledMap() {
    Map<Integer,String> map = new HashMap<Integer,String>();
    for (int i = 0; i < 30; i++) {
      map.put(i, RandomStringUtils.randomAlphabetic(10));
    }
    return map;
  }
}
