package java8_pacakge.lambda_package;

public interface Drawable {
    void draw();
    public class LambdaExpressionExample{
        public static void main(String[] args) {
            int length = 10;
            //Implementing an interface without using lambda expression
            Drawable drawable = new Drawable() {
                @Override
                public void draw() {
                    System.out.println("Length without lambda is :  " + length);
                }
            };
            drawable.draw();

            //Implementing an interface with lambda expression
            Drawable drawable2 = () ->{
                System.out.println("Length using lambda is :  " + length);
            };
            drawable2.draw();
        }
    }
}
