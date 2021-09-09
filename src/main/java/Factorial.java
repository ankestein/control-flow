import java.sql.SQLOutput;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("The factorial is " + calculateFactorial(4));
    }

    public static long calculateFactorial(int number) {

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
