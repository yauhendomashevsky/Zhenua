package learning.collections;

import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapLearning {

  public static void main(String[] args) {

    Map<Integer,String> maps = BaseCollection.genFilledMap();

    maps.forEach((k,v) -> {
      if (v.toUpperCase().startsWith("P")){
        System.out.println(k);
        System.out.println(v);
      }
    });

    System.out.println("\n");

    for (Entry<Integer,String> maps2: maps.entrySet()) {
      if (maps2.getValue().toUpperCase().startsWith("P")){
        System.out.println(maps2.getKey());
      }
    }
  }
}
