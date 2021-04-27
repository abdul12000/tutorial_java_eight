package java8_pacakge.lambda_package;

public interface Greatable {
    String hello();

    class LambdaExpressionNoParam{
        public static void main(String[] args) {
            //Lambda expression with no parameter but with return statement
            Greatable s = () -> { return  "Hello World";};
            System.out.println(s.hello());
        }
    }
}
