package AmbisOracle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, String> fruitbowl = new HashMap<>();
        fruitbowl.put("Apple", "Red");
        fruitbowl.put("Manggo", "Green");
        fruitbowl.put("Orange", "Orange");
        fruitbowl.put("Watermelon", "Blue");
        fruitbowl.put("Banana", "Yellow");
        String key = in.nextLine();

        if (fruitbowl.containsKey(key)) {
            System.out.println("Buah " + key + " warnanya " + fruitbowl.get(key));
        } else {
            System.out.println("buah tidak ada ");
        }


    }
}
