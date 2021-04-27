package java8_pacakge.lambda_package;

import java.util.ArrayList;
import java.util.function.Consumer;

public class JavaEightAnonymousClass {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        car.add("toyota");
        car.add("honda");
        car.add("jaguar");
        car.add("huyndai");

//Using anonymous class as the forEach implementation
        car.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);

            }
        });

        //Using Lambda expression for the forEach implementation
        car.forEach(s -> System.out.println(s));
    }
}
