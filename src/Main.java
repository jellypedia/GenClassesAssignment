import Arithmetic.Arithmetic;
import Map.MyMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = 900;
        double num2 = 4.3212;

        Arithmetic<Integer, Double> test = new Arithmetic<>(num1,num2);

        System.out.println(test.add());
        System.out.println(test.subtract());
        System.out.println(test.multiply());
        System.out.println(test.divide());
        System.out.println(test.getMax());
        System.out.println(test.getMin());
        System.out.println();

        MyMap<String,Integer> map = new MyMap<>();

        map.put("test",12);
        map.put("test",45);

        System.out.println(map.get("test"));
        System.out.println(map.remove("test"));
    }
}
