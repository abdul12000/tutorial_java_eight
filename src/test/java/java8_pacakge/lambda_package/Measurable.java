package java8_pacakge.lambda_package;

public interface Measurable {
    int measure(int x, int y);

}
class LambdaExpressionMultipleParam{
    public static void main(String[] args) {

        //Multiple parameters in Lambda expression
        Measurable area = (x,y)->(x*y);
        System.out.println(area.measure(5, 10));

        //Multiple parameters with data types in Lambda expression
        Measurable area2 = (int x, int y)->(x*y);
        System.out.println(area2.measure(10, 30));

        //Notice that I can change the operator on the fly
        Measurable add = (int x, int y)->(x+y);
        System.out.println(add.measure(50, 10));

        //Divide operator
        Measurable divide = (int x, int y)->(x/y);
        System.out.println(divide.measure(50, 10));

    }
}
