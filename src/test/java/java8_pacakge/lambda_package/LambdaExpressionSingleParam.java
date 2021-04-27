package java8_pacakge.lambda_package;

public class LambdaExpressionSingleParam {
    public static void main(String[] args) {
        //Lambda expression with single param
        Greatable2 greatable2 = (name)->{
            return "Hello,  " + name;
        };
        System.out.println(greatable2.great("Abdul"));

    }
}
