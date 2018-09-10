import java.util.Scanner;
public class GuessGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int max = 100;
        int min = 1;
        int range = max - min + 1;

        // generate random numbers within 1 to 100
            int a = (int) (Math.random() * range) + min;
        System.out.println(a);
            int g = 0;
            while (g != a) {
                g = sc.nextInt();
                count++;
                if (g > a) {
                    System.out.println("Number guessed is more than the original number");
                }
                if (g < a) {
                    System.out.println("Number guessed is less than original number");
                }
            }
            System.out.println("You guessed the number with "
                    + count + " tries!");
        }
    }
