package sample;

public class Main {
    public static void FizzBuzz() {
        boolean instead;
        for (int i = 1; i < 101; i++) {
            instead = false;
            if (i % 3 == 0) {
                instead = true;
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                instead = true;
                System.out.print("Buzz");
            }
            if (!instead)
                System.out.print(i);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FizzBuzz();
    }
}