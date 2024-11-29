package Java_Coding_Programming.Oop_Programming;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiLambda {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        //lambda expression
        List<String> names = Arrays.asList("sumit", "sekhar");
        names.forEach(username -> System.out.println(username));
        List<Integer> number = Arrays.asList(2, 3, 4, 445, 676, 4);
        List<Integer> evennumbers;
        evennumbers = number.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evennumbers);
        number.stream().filter(n -> n % 2 == 0).forEach(n-> System.out.println("Even numbers are :"+n));
        List<String> uppername;
       uppername= names.stream().map(uname->uname.toUpperCase()).collect(Collectors.toList());
        System.out.println(uppername);



    }
}
