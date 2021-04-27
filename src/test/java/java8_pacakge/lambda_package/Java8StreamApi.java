package java8_pacakge.lambda_package;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamApi {
//    @Test
    public void noJava8(){
        ArrayList<String> car = new ArrayList<>();
        car.add("toyota");
        car.add("honda");
        car.add("jaguar");
        car.add("huyndai");
        car.add("lexus");
        car.add("ferrari");
        car.add("lambogini");
        car.add("tesla");
        car.add("bmw");
        car.add("mercedes");

        //find the number of cars that start with letter "t" without  using java8

        int count = 0;
        for(int i = 0; i < car.size(); i++){
            String aCars = car.get(i);
            if (aCars.startsWith("t")){
                count ++;
            }
        }
        System.out.println(count);

    }


//    @Test
    public void java8Streams1() {
        ArrayList<String> car = new ArrayList<>();
        car.add("toyota");
        car.add("honda");
        car.add("jaguar");
        car.add("huyndai");
        car.add("lexus");
        car.add("ferrari");
        car.add("lambogini");
        car.add("tesla");
        car.add("bmw");
        car.add("mercedes");

        //Using streams api
//        Long a = car.stream().filter(s -> s.startsWith("j")).count();
//        System.out.println(a);

        //print all cars with more than 5 characters in the arraylist
//        car.stream().filter(s -> s.length()>5).forEach(System.out::println);

        //Print out only one car from the list above
//        car.stream().filter(s -> s.length()>5).limit(1).forEach(System.out::println);

        //Sorting the list
//        car.stream().sorted().forEach(System.out::println);

        //Using Map
        car.stream().filter(s -> s.startsWith("t")).map(String::toUpperCase).forEach(System.out::println);

    }

//    @Test
    public void java8Streams2(){
        //Using stream directly
        long countB = Stream.of("Mistsubishi","Peugeot", "Lexus", "Ford", "LandCruiser","lambogini").filter(s -> s.endsWith("i")).count();
        System.out.println(countB);

        //More maps
        Stream.of("Mistsubishi","Peugeot", "Lexus", "Ford", "LandCruiser","lambogini").filter(s -> s.endsWith("i")).map(String::toUpperCase).forEach(System.out::println);
    }

    @Test
    public void java8Streams3(){
        // Printing unique items directly
// List<String> cars = Arrays.asList("Mistsubishi", "Peugeot", "Mistsubishi", "Peugeot", "Mistsubishi", "Peugeot", "Lexus", "Ford", "LandCruiser", "lambogini");
//        cars.stream().distinct().forEach(System.out::println);

//Converting back to list after manipulation
        List<String> list = Stream.of("Mistsubishi", "Peugeot", "Lexus", "Ford", "landCruiser", "lambogini").filter(s -> s.endsWith("i")).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list.get(1));

    //get the value of a particular index in a list of numbers after sorting the list
        List<Integer> nums =  Arrays.asList(1, 2, 4, 7, 19, 30, 21, 34, 2, 4);
        List<Integer> l = nums.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(l.size());
        System.out.println(l.get(0));
    }


}
